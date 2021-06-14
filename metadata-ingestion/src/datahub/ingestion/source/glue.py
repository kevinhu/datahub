import json
import time
from dataclasses import dataclass
from dataclasses import field as dataclass_field
from functools import reduce
from typing import Any, Dict, Iterable, List, Optional, Union
from urllib.parse import urlparse

import boto3

from datahub.configuration import ConfigModel
from datahub.configuration.common import AllowDenyPattern
from datahub.emitter import mce_builder
from datahub.ingestion.api.common import PipelineContext
from datahub.ingestion.api.source import Source, SourceReport
from datahub.ingestion.source.metadata_common import MetadataWorkUnit
from datahub.metadata.com.linkedin.pegasus2avro.common import AuditStamp, Status
from datahub.metadata.com.linkedin.pegasus2avro.metadata.snapshot import DatasetSnapshot
from datahub.metadata.com.linkedin.pegasus2avro.mxe import MetadataChangeEvent
from datahub.metadata.com.linkedin.pegasus2avro.schema import (
    ArrayTypeClass,
    BooleanTypeClass,
    BytesTypeClass,
    DateTypeClass,
    MySqlDDL,
    NullTypeClass,
    NumberTypeClass,
    SchemaField,
    SchemaFieldDataType,
    SchemaMetadata,
    StringTypeClass,
    TimeTypeClass,
    UnionTypeClass,
)
from datahub.metadata.schema_classes import (
    AuditStampClass,
    DataFlowInfoClass,
    DataFlowSnapshotClass,
    DataJobInfoClass,
    DataJobInputOutputClass,
    DataJobSnapshotClass,
    DatasetPropertiesClass,
    MapTypeClass,
    MetadataChangeEventClass,
    OwnerClass,
    OwnershipClass,
    OwnershipTypeClass,
)


def assume_role(
    role_arn: str, aws_region: str, credentials: Optional[dict] = None
) -> dict:
    credentials = credentials or {}
    sts_client = boto3.client(
        "sts",
        region_name=aws_region,
        aws_access_key_id=credentials.get("AccessKeyId"),
        aws_secret_access_key=credentials.get("SecretAccessKey"),
        aws_session_token=credentials.get("SessionToken"),
    )

    assumed_role_object = sts_client.assume_role(
        RoleArn=role_arn, RoleSessionName="DatahubIngestionSourceGlue"
    )
    return assumed_role_object["Credentials"]


class GlueSourceConfig(ConfigModel):
    env: str = "PROD"

    database_pattern: AllowDenyPattern = AllowDenyPattern.allow_all()
    table_pattern: AllowDenyPattern = AllowDenyPattern.allow_all()

    extract_transforms: Optional[bool] = True

    aws_access_key_id: Optional[str] = None
    aws_secret_access_key: Optional[str] = None
    aws_session_token: Optional[str] = None
    aws_role: Optional[Union[str, List[str]]] = None
    aws_region: str

    @property
    def glue_client(self):
        if (
            self.aws_access_key_id
            and self.aws_secret_access_key
            and self.aws_session_token
        ):
            return boto3.client(
                "glue",
                aws_access_key_id=self.aws_access_key_id,
                aws_secret_access_key=self.aws_secret_access_key,
                aws_session_token=self.aws_session_token,
                region_name=self.aws_region,
            )
        elif self.aws_access_key_id and self.aws_secret_access_key:
            return boto3.client(
                "glue",
                aws_access_key_id=self.aws_access_key_id,
                aws_secret_access_key=self.aws_secret_access_key,
                region_name=self.aws_region,
            )
        elif self.aws_role:
            if isinstance(self.aws_role, str):
                credentials = assume_role(self.aws_role, self.aws_region)
            else:
                credentials = reduce(
                    lambda new_credentials, role_arn: assume_role(
                        role_arn, self.aws_region, new_credentials
                    ),
                    self.aws_role,
                    {},
                )
            return boto3.client(
                "glue",
                aws_access_key_id=credentials["AccessKeyId"],
                aws_secret_access_key=credentials["SecretAccessKey"],
                aws_session_token=credentials["SessionToken"],
                region_name=self.aws_region,
            )
        else:
            return boto3.client("glue", region_name=self.aws_region)


@dataclass
class GlueSourceReport(SourceReport):
    tables_scanned = 0
    filtered: List[str] = dataclass_field(default_factory=list)

    def report_table_scanned(self) -> None:
        self.tables_scanned += 1

    def report_table_dropped(self, table: str) -> None:
        self.filtered.append(table)


class GlueSource(Source):
    source_config: GlueSourceConfig
    report = GlueSourceReport()

    def __init__(self, config: GlueSourceConfig, ctx: PipelineContext):
        super().__init__(ctx)
        self.source_config = config
        self.report = GlueSourceReport()
        self.glue_client = config.glue_client
        self.extract_transforms = config.extract_transforms
        self.env = config.env

    @classmethod
    def create(cls, config_dict, ctx):
        config = GlueSourceConfig.parse_obj(config_dict)
        return cls(config, ctx)

    def get_all_jobs(self):
        """
        List all jobs in Glue.
        """

        jobs = []

        paginator = self.glue_client.get_paginator("get_jobs")
        for page in paginator.paginate():
            jobs += page["Jobs"]

        return jobs

    def get_dataflow_graph(self, script_path: str) -> Dict[str, Any]:
        """
        Get the DAG of transforms and data sources/sinks for a job.

        Parameters
        ----------
            script_path:
                S3 path to the job's Python script.
        """

        # extract the script's bucket and key
        url = urlparse(script_path, allow_fragments=False)
        bucket = url.netloc
        key = url.path[1:]

        # download the script contents
        s3 = boto3.resource("s3")
        obj = s3.Object(bucket, key)
        script = obj.get()["Body"].read().decode("utf-8")

        # extract the job DAG from the script
        return self.glue_client.get_dataflow_graph(PythonScript=script)

    def process_dataflow_graph(self, dataflow_graph, flow_urn):
        """
        Prepare a job's DAG for ingestion.

        Parameters
        ----------
            dataflow_graph:
                Job DAG returned from get_dataflow_graph()
            flow_urn:
                URN of the flow (i.e. the AWS Glue job itself).
        """

        def process_node(node):
            """
            Process a single node in the DAG.
            """

            node_type = node["NodeType"]

            # for nodes representing datasets, we construct a dataset URN accordingly
            if node_type in ["DataSource", "DataSink"]:

                node_args = {x["Name"]: json.loads(x["Value"]) for x in node["Args"]}

                # if data object is Glue table
                if "database" in node_args and "table_name" in node_args:

                    full_table_name = (
                        f"{node_args['database']}.{node_args['table_name']}"
                    )
                    node_urn = f"urn:li:dataset:(urn:li:dataPlatform:glue,{full_table_name},{self.env})"

                # if data object is S3 bucket
                elif node_args.get("connection_type") == "s3":

                    # remove S3 prefix
                    # TODO: include file format in properties
                    s3_name = node_args["connection_options"]["path"][5:]

                    node_urn = (
                        f"urn:li:dataset:(urn:li:dataPlatform:s3,{s3_name},{self.env})"
                    )

                else:

                    raise ValueError(f"Unrecognized Glue data object type: {node_args}")

            # otherwise, a node represents a transformation
            else:
                node_urn = mce_builder.make_data_job_urn_with_flow(
                    flow_urn, job_id=node["Id"]
                )

            return {
                **node,
                "urn": node_urn,
                # to be filled in after traversing edges
                "inputDatajobs": [],
                "inputDatasets": [],
                "outputDatasets": [],
            }

        nodes = {node["Id"]: process_node(node) for node in dataflow_graph["DagNodes"]}

        # traverse edges to fill in node properties
        for edge in dataflow_graph["DagEdges"]:

            source_node = nodes[edge["Source"]]
            target_node = nodes[edge["Target"]]

            source_node_type = source_node["NodeType"]
            target_node_type = target_node["NodeType"]

            # note that source nodes can't be data sinks
            if source_node_type == "DataSource":
                nodes[edge["Target"]]["inputDatasets"].append(source_node["urn"])
            # keep track of input data jobs (as defined in schemas)
            else:
                nodes[edge["Target"]]["inputDatajobs"].append(source_node["urn"])
            # track output datasets (these can't be input datasets)
            if target_node_type == "DataSink":
                nodes[edge["Target"]]["outputDatasets"].append(target_node["urn"])

        return nodes

    def get_dataflow_wu(self, flow_urn: str, job: Dict[str, Any]) -> MetadataWorkUnit:
        """
        Generate a DataFlow workunit for a Glue job.

        Parameters
        ----------
            flow_urn:
                URN for the flow
            job:
                Job object from get_all_jobs()
        """
        mce = MetadataChangeEventClass(
            proposedSnapshot=DataFlowSnapshotClass(
                urn=flow_urn,
                aspects=[
                    DataFlowInfoClass(
                        name=job["Name"],
                        description=job["Description"],
                        # specify a few Glue-specific properties
                        customProperties={
                            "role": job["Role"],
                            "created": str(job["CreatedOn"]),
                            "modified": str(job["LastModifiedOn"]),
                            "command": job["Command"]["ScriptLocation"],
                        },
                    ),
                ],
            )
        )

        return MetadataWorkUnit(id=job["Name"], mce=mce)

    def get_datajob_wu(
        self, node: Dict[str, Any], job: Dict[str, Any]
    ) -> MetadataWorkUnit:
        """
        Generate a DataJob workunit for a component (node) in a Glue job.

        Parameters
        ----------
            node:
                Node from process_dataflow_graph()
            job:
                Job object from get_all_jobs()
        """
        mce = MetadataChangeEventClass(
            proposedSnapshot=DataJobSnapshotClass(
                urn=node["urn"],
                aspects=[
                    DataJobInfoClass(
                        name=f"{job['Name']}:{node['Id']}",
                        type="GLUE",
                        description=None,
                        customProperties={x["Name"]: x["Value"] for x in node["Args"]},
                    ),
                    DataJobInputOutputClass(
                        inputDatasets=node["inputDatasets"],
                        outputDatasets=node["outputDatasets"],
                        inputDatajobs=node["inputDatajobs"],
                    ),
                ],
            )
        )

        return MetadataWorkUnit(id=node["Id"], mce=mce)

    def get_all_tables(self) -> List[dict]:
        def get_tables_from_database(database_name: str) -> List[dict]:
            new_tables = []
            paginator = self.glue_client.get_paginator("get_tables")
            for page in paginator.paginate(DatabaseName=database_name):
                new_tables += page["TableList"]

            return new_tables

        def get_database_names() -> List[str]:
            database_names = []
            paginator = self.glue_client.get_paginator("get_databases")
            for page in paginator.paginate():
                for db in page["DatabaseList"]:
                    if self.source_config.database_pattern.allowed(db["Name"]):
                        database_names.append(db["Name"])

            return database_names

        if self.source_config.database_pattern.is_fully_specified_allow_list():
            database_names = self.source_config.database_pattern.get_allowed_list()
        else:
            database_names = get_database_names()

        all_tables: List[dict] = []
        for database in database_names:
            all_tables += get_tables_from_database(database)
        return all_tables

    def get_workunits(self) -> Iterable[MetadataWorkUnit]:

        tables = self.get_all_tables()

        for table in tables:
            database_name = table["DatabaseName"]
            table_name = table["Name"]
            full_table_name = f"{database_name}.{table_name}"
            self.report.report_table_scanned()
            if not self.source_config.database_pattern.allowed(
                database_name
            ) or not self.source_config.table_pattern.allowed(full_table_name):
                self.report.report_table_dropped(full_table_name)
                continue

            mce = self._extract_record(table, full_table_name)
            workunit = MetadataWorkUnit(id=f"glue-{full_table_name}", mce=mce)
            self.report.report_workunit(workunit)
            yield workunit

        if self.extract_transforms:

            for job in self.get_all_jobs():

                flow_urn = mce_builder.make_data_flow_urn("glue", job["Name"], self.env)

                flow_wu = self.get_dataflow_wu(flow_urn, job)
                self.report.report_workunit(flow_wu)
                yield flow_wu

                dag = self.get_dataflow_graph(job["Command"]["ScriptLocation"])
                nodes = self.process_dataflow_graph(dag, flow_urn)

                for node in nodes.values():

                    if node["NodeType"] not in ["DataSource", "DataSink"]:
                        job_wu = self.get_datajob_wu(node, job)
                        self.report.report_workunit(job_wu)
                        yield job_wu

    def _extract_record(self, table: Dict, table_name: str) -> MetadataChangeEvent:
        def get_owner(time: int) -> OwnershipClass:
            owner = table.get("Owner")
            if owner:
                owners = [
                    OwnerClass(
                        owner=f"urn:li:corpuser:{owner}",
                        type=OwnershipTypeClass.DATAOWNER,
                    )
                ]
            else:
                owners = []
            return OwnershipClass(
                owners=owners,
                lastModified=AuditStampClass(
                    time=time,
                    actor="urn:li:corpuser:datahub",
                ),
            )

        def get_dataset_properties() -> DatasetPropertiesClass:
            return DatasetPropertiesClass(
                description=table.get("Description"),
                customProperties={
                    **table.get("Parameters", {}),
                    **{
                        k: str(v)
                        for k, v in table["StorageDescriptor"].items()
                        if k not in ["Columns", "Parameters"]
                    },
                },
                uri=table.get("Location"),
                tags=[],
            )

        def get_schema_metadata(glue_source: GlueSource) -> SchemaMetadata:
            schema = table["StorageDescriptor"]["Columns"]
            fields: List[SchemaField] = []
            for field in schema:
                schema_field = SchemaField(
                    fieldPath=field["Name"],
                    nativeDataType=field["Type"],
                    type=get_column_type(
                        glue_source, field["Type"], table_name, field["Name"]
                    ),
                    description=field.get("Comment"),
                    recursive=False,
                    nullable=True,
                )
                fields.append(schema_field)
            return SchemaMetadata(
                schemaName=table_name,
                version=0,
                fields=fields,
                platform="urn:li:dataPlatform:glue",
                created=AuditStamp(time=sys_time, actor="urn:li:corpuser:etl"),
                lastModified=AuditStamp(time=sys_time, actor="urn:li:corpuser:etl"),
                hash="",
                platformSchema=MySqlDDL(tableSchema=""),
            )

        sys_time = int(time.time() * 1000)
        dataset_snapshot = DatasetSnapshot(
            urn=f"urn:li:dataset:(urn:li:dataPlatform:glue,{table_name},{self.env})",
            aspects=[],
        )

        dataset_snapshot.aspects.append(Status(removed=False))
        dataset_snapshot.aspects.append(get_owner(sys_time))
        dataset_snapshot.aspects.append(get_dataset_properties())
        dataset_snapshot.aspects.append(get_schema_metadata(self))

        metadata_record = MetadataChangeEvent(proposedSnapshot=dataset_snapshot)
        return metadata_record

    def get_report(self):
        return self.report

    def close(self):
        pass


def get_column_type(
    glue_source: GlueSource, field_type: str, table_name: str, field_name: str
) -> SchemaFieldDataType:
    field_type_mapping = {
        "array": ArrayTypeClass,
        "bigint": NumberTypeClass,
        "binary": BytesTypeClass,
        "boolean": BooleanTypeClass,
        "char": StringTypeClass,
        "date": DateTypeClass,
        "decimal": NumberTypeClass,
        "double": NumberTypeClass,
        "float": NumberTypeClass,
        "int": NumberTypeClass,
        "integer": NumberTypeClass,
        "interval": TimeTypeClass,
        "long": NumberTypeClass,
        "map": MapTypeClass,
        "null": NullTypeClass,
        "set": ArrayTypeClass,
        "smallint": NumberTypeClass,
        "string": StringTypeClass,
        "struct": MapTypeClass,
        "timestamp": TimeTypeClass,
        "tinyint": NumberTypeClass,
        "union": UnionTypeClass,
        "varchar": StringTypeClass,
    }

    if field_type in field_type_mapping.keys():
        type_class = field_type_mapping[field_type]
    elif field_type.startswith("array"):
        type_class = ArrayTypeClass
    elif field_type.startswith("map") or field_type.startswith("struct"):
        type_class = MapTypeClass
    elif field_type.startswith("set"):
        type_class = ArrayTypeClass
    else:
        glue_source.report.report_warning(
            field_type,
            f"The type '{field_type}' is not recognised for field '{field_name}' in table '{table_name}', setting as StringTypeClass.",
        )
        type_class = StringTypeClass
    data_type = SchemaFieldDataType(type=type_class())
    return data_type
