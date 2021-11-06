
package com.linkedin.metadata.aspect;

import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.DataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.HasTyperefInfo;
import com.linkedin.data.template.TyperefInfo;
import com.linkedin.data.template.UnionTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/aspect/Aspect.pdl.")
public class Aspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema(new StringBuilder().append("union[{namespace com.linkedin.metadata.key/**Key for a Chart*/@Aspect.name=\"chartKey\"record ChartKey{/**The name of the dashboard tool such as looker, redash etc.*/@Searchable={\"fieldName\":\"tool\",\"boostScore\":4.0,\"fieldType\":\"TEXT_PARTIAL\"}dashboardTool:string/**Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'*/chartId:string}}{namespace com.linkedin.chart/**Information about a chart*/@Aspect.name=\"chartInfo\"record ChartInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`.queryByDefault,customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/externalUrl:optional@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}{/**Title of the chart*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}title:string/**Detailed description about the chart*/@Searchable={}description:string/**Captures information about who created/last modified/deleted this chart and when*/lastModified:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}/**URL for the chart. This could be used as an external link on DataHub to allow users access/view the chart*/chartUrl:optional com.linkedin.common.Url/**Data sources for the chart*/@Relationship.`/*/string`={\"name\":\"Consumes\",\"entityTypes\":[\"dataset\"]}inputs:optional array[/**Input source type for a chart such as dataset or metric*/typeref ChartDataSourceType=union[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}]]/**Type of the chart*/@Searchable={\"filterNameOverride\":\"Chart Type\",\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}type:optional/**The various types of charts*/enum ChartType{/**Chart showing a Bar chart*/BAR/**Chart showing a Pie chart*/PIE/**Chart showing a Scatter plot*/SCATTER/**Chart showing a table*/TABLE/**Chart showing Markdown formatted text*/TEXT,LINE,AREA,HISTOGRAM,BOX_PLOT}/**Access level for the chart*/@Searchable={\"filterNameOverride\":\"Access Level\",\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}access:optional{namespace com.linkedin.common/**The various access levels*/enum AccessLevel{/**Publicly available access level*/PUBLIC/**Private availability to certain set of users*/PRIVATE}}/**The time when this chart last refreshed*/lastRefreshed:optional com.linkedin.common.Time}}{namespace com.linkedin.chart/**Information for chart query which is used for getting data of the chart*/@Aspect.name=\"chartQuery\"record ChartQuery{/**Raw query to build a chart from input datasets*/rawQuery:string/**Chart query type*/@Searchable={\"fieldName\":\"queryType\",\"filterNameOverride\":\"Query Type\",\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}type:enum ChartQueryType{/**LookML queries*/LOOKML/**SQL type queries*/SQL}}}{namespace com.linkedin.metadata.key/**Key for a CorpGroup*/@Aspect.name=\"corpGroupKey\"record CorpGroupKey{/**The URL-encoded name of the AD/LDAP group. Serves as a globally unique identifier within DataHub.*/@Searchable.fieldType=\"TEXT_PARTIAL\"name:string}}{namespace com.linkedin.identity/**group of corpUser, it may contains nested group*/@Aspect={\"name\":\"corpGroupInfo\",\"EntityUrns\":[\"com.linkedin.common.CorpGroupUrn\"]}record CorpGroupInfo{/**The name to use when displaying the group.*/@Searchable.fieldType=\"TEXT_PARTIAL\"displayName:optional string/**email of this group*/email:optional{namespace com.linkedin.common,typeref EmailAddress=string}/**owners of this group*/@Relationship.`/*`={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\"]}admins:array[{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}]/**List of ldap urn in this group.*/@Relationship.`/*`={\"name\":\"IsPartOf\",\"entityTypes\":[\"corpUser\"]}members:array[com.linkedin.common.CorpuserUrn]/**List of groups in this group.*/@Relationship.`/*`={\"name\":\"IsPartOf\",\"entityTypes\":[\"corpGroup\"]}groups:array[{namespace com.linkedin.common/**Corporate group's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpGroupUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpGroup\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"CorpGroup\",\"doc\":\"Corporate group's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"groupName\",\"doc\":\"The name of the AD/LDAP group.\",\"type\":\"string\",\"maxLength\":64}],\"maxLength\":81}typeref CorpGroupUrn=string}]/**A description of the group.*/@Searchable.fieldType=\"TEXT_PARTIAL\"description:optional string}}{namespace com.linkedin.metadata.key/**Key for a CorpUser*/@Aspect.name=\"corpUserKey\"record CorpUserKey{/**The name of the AD/LDAP user.*/@Searchable={\"enableAutocomplete\":true,\"fieldName\":\"ldap\",\"boostScore\":2.0,\"fieldType\":\"TEXT_PARTIAL\"}username:string}}{namespace com.linkedin.identity/**Linkedin corp user information that can be edited from UI*/@Aspect={\"name\":\"corpUserEditableInfo\",\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"]}record CorpUserEditableInfo{/**About me section of the user*/aboutMe:optional string/**Teams that the user belongs to e.g. Metadata*/@Searchable.`/*`.fieldType=\"TEXT\"teams:array[string]=[]/**Skills that the user possesses e.g. Machine Learning*/@Searchable.`/*`.fieldType=\"TEXT\"skills:array[string]=[]/**A URL which points to a picture which user wants to set as a profile photo*/pictureLink:com.linkedin.common.Url=\"https://raw.githubusercontent.com/linkedin/datahub/master/datahub-web-react/src/images/default_avatar.png\"}}{namespace com.linkedin.identity/**Linkedin corp user information*/@Aspect={\"name\":\"corpUserInfo\",\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"]}record CorpUserInfo{/**Deprecated! Use CorpUserStatus instead. Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools*/@Searchable={\"weightsPerFieldValue\":{\"true\":2.0},\"fieldType\":\"BOOLEAN\"}active:boolean/**displayName of this user ,  e.g.  Hang Zhang(DataHQ)*/displayName:optional string/**email address of this user*/@Searchable={\"queryByDefault\":true,\"fieldType\":\"KEYWORD\"}email:optional com.linkedin.common.EmailAddress/**title of this user*/@Searchable={\"queryByDefault\":true,\"fieldType\":\"KEYWORD\"}title:optional string/**direct manager of this user*/@Relationship={\"name\":\"ReportsTo\",\"entityTypes\":[\"corpUser\"]}@Searchable={\"fieldName\":\"managerLdap\",\"queryByDefault\":true,\"fieldType\":\"URN\"}managerUrn:optional com.linkedin.common.CorpuserUrn/**department id this user belong to*/departmentId:optional long/**department name this user belong to*/departmentName:optional string/**first name of this user*/firstName:optional string/**last name of this user*/lastName:optional string/**Common name of this user, format is firstName + lastName (split by a whitespace)*/@Searchable={\"boostScore\":10.0,\"queryByDefault\":true,\"fieldType\":\"TEXT_PARTIAL\"}fullName:optional string/**two uppercase letters country code. e.g.  US*/countryCode:optional string}}{namespace com.linkedin.identity/**The status of the user, e.g. provisioned, active, suspended, etc.*/@Aspect.name=\"corpUserStatus\"record CorpUserStatus{/**Status of the user, e.g. PROVISIONED / ACTIVE / SUSPENDED*/@Searchable.fieldType=\"KEYWORD\"status:string/**Audit stamp containing who last modified the status and when.*/lastModified:com.linkedin.common.AuditStamp}}{namespace com.linkedin.identity/**Carries information about the CorpGroups a user is in.*/@Aspect.name=\"groupMembership\"record GroupMembership{@Relationship.`/*`={\"name\":\"IsMemberOfGroup\",\"entityTypes\":[\"corpGroup\"]}groups:array[com.linkedin.common.Urn]}}{namespace com.linkedin.metadata.key/**Key for a Dashboard*/@Aspect.name=\"dashboardKey\"record DashboardKey{/**The name of the dashboard tool such as looker, redash etc.*/@Searchable={\"fieldName\":\"tool\",\"boostScore\":4.0,\"fieldType\":\"TEXT_PARTIAL\"}dashboardTool:string/**Unique id for the dashboard. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, dashboard URL could be used here for Looker such as 'looker.linkedin.com/dashboards/1234'*/dashboardId:string}}{namespace com.linkedin.dashboard/**Information about a dashboard*/@Aspect.name=\"dashboardInfo\"record DashboardInfo includes com.linkedin.common.CustomProperties,com.linkedin.common.ExternalReference{/**Title of the dashboard*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":10.0,\"fieldType\":\"TEXT_PARTIAL\"}title:string/**Detailed description about the dashboard*/@Searchable={\"hasValuesFieldName\":\"hasDescription\",\"fieldType\":\"TEXT\"}description:string/**Charts in a dashboard*/@Relationship.`/*`={\"name\":\"Contains\",\"entityTypes\":[\"chart\"]}charts:array[{namespace com.linkedin.common/**Standardized chart identifier*/@java.class=\"com.linkedin.common.urn.ChartUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"chart\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Chart\",\"doc\":\"Standardized chart identifier\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"dashboardTool\",\"doc\":\"The name of the dashboard tool such as looker, redash etc.\",\"type\":\"string\",\"maxLength\":20},{\"name\":\"chartId\",\"doc\":\"Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":236}typeref ChartUrn=string}]=[]/**Captures information about who created/last modified/deleted this dashboard and when*/lastModified:com.linkedin.common.ChangeAuditStamps/**URL for the dashboard. This could be used as an external link on DataHub to allow users access/view the dashboard*/dashboardUrl:optional com.linkedin.common.Url/**Access level for the dashboard*/@Searchable={\"filterNameOverride\":\"Access Level\",\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}access:optional com.linkedin.common.AccessLevel/**The time when this dashboard last refreshed*/lastRefreshed:optional com.linkedin.common.Time}}{namespace com.linkedin.metadata.key/**Key for a Data Flow*/@Aspect.name=\"dataFlowKey\"record DataFlowKey{/**Workflow manager like azkaban, airflow which orchestrates the flow*/@Searchable.fieldType=\"TEXT_PARTIAL\"orchestrator:string/**Unique Identifier of the data flow*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}flowId:string/**Cluster where the flow is executed*/@Searchable.fieldType=\"TEXT_PARTIAL\"cluster:string}}{namespace com.linkedin.datajob/**Information about a Data processing flow*/@Aspect.name=\"dataFlowInfo\"record DataFlowInfo includes com.linkedin.common.CustomProperties,com.linkedin.common.ExternalReference{/**Flow name*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":10.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string/**Flow description*/@Searchable={\"hasValuesFieldName\":\"hasDescription\",\"fieldType\":\"TEXT\"}description:optional string/**Optional project/namespace associated with the flow*/@Searchable={\"queryByDefault\":false,\"fieldType\":\"TEXT_PARTIAL\"}project:optional string}}{namespace com.linkedin.metadata.key/**Key for a Data Job*/@Aspect.name=\"dataJobKey\"record DataJobKey{/**Standardized data processing flow urn representing the flow for the job*/@Relationship={\"name\":\"IsPartOf\",\"entityTypes\":[\"dataFlow\"]}@Searchable={\"fieldName\":\"dataFlow\",\"queryByDefault\":false,\"fieldType\":\"URN_PARTIAL\"}flow:com.linkedin.common.Urn/**Unique Identifier of the data job*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}jobId:string}}{namespace com.linkedin.datajob/**Information about a Data processing job*/@Aspect.name=\"dataJobInfo\"record DataJobInfo includes com.linkedin.common.CustomProperties,com.linkedin.common.ExternalReference{/**Job name*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":10.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string/**Job description*/@Searchable={\"hasValuesFieldName\":\"hasDescription\",\"fieldType\":\"TEXT\"}description:optional string/**Datajob type\n**NOTE**: AzkabanJobType is deprecated. Please use strings instead.*/type:union[{namespace com.linkedin.datajob.azkaban/**The various types of support azkaban jobs*/enum AzkabanJobType{/**The command job type is one of the basic built-in types. It runs multiple UNIX commands using java processbuilder.\nUpon execution, Azkaban spawns off a process to run the command.*/COMMAND/**Runs a java program with ability to access Hadoop cluster.\nhttps://azkaban.readthedocs.io/en/latest/jobTypes.html#java-job-type*/HADOOP_JAVA/**In large part, this is the same Command type. The difference is its ability to talk to a Hadoop cluster\nsecurely, via Hadoop tokens.*/HADOOP_SHELL/**Hive type is for running Hive jobs.*/HIVE/**Pig type is for running Pig jobs.*/PIG/**SQL is for running Presto, mysql queries etc*/SQL/**Glue type is for running AWS Glue job transforms.*/GLUE}}string]/**DataFlow urn that this job is part of*/flowUrn:optional{namespace com.linkedin.common/**Standardized data processing flow identifier.*/@java.class=\"com.linkedin.common.urn.DataFlowUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataFlow\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataFlow\",\"doc\":\"Standardized data processing flow identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"orchestrator\",\"doc\":\"Workflow manager like azkaban, airflow which orchestrates the flow\",\"type\":\"string\",\"maxLength\":50},{\"name\":\"flowId\",\"doc\":\"Unique Identifier of the data flow\",\"type\":\"string\",\"maxLength\":200},{\"name\":\"cluster\",\"doc\":\"Cluster where the flow is executed\",\"type\":\"string\",\"maxLength\":100}],\"maxLength\":373}typeref DataFlowUrn=string}/**Status of the job*/status:optional/**Job statuses*/enum JobStatus{/**Jobs being initialized.*/STARTING/**Jobs currently running.*/IN_PROGRESS/**Jobs being stopped.*/STOPPING/**Jobs that have stopped.*/STOPPED/**Jobs with successful completion.*/COMPLETED/**Jobs that have failed.*/FAILED/**Jobs with unknown status (either unmappable or unavailable)*/UNKNOWN}}}{namespace com.linkedin.datajob/**Information about the inputs and outputs of a Data processing job*/@Aspect.name=\"dataJobInputOutput\"record DataJobInputOutput{/**Input datasets consumed by the data job during processing*/@Relationship.`/*`={\"name\":\"Consumes\",\"entityTypes\":[\"dataset\"]}@Searchable.`/*`={\"fieldName\":\"inputs\",\"numValuesFieldName\":\"numInputDatasets\",\"queryByDefault\":false,\"fieldType\":\"URN\"}inputDatasets:array[com.linkedin.common.DatasetUrn]/**Output datasets produced by the data job during processing*/@Relationship.`/*`={\"name\":\"Produces\",\"entityTypes\":[\"dataset\"]}@Searchable.`/*`={\"fieldName\":\"outputs\",\"numValuesFieldName\":\"numOutputDatasets\",\"queryByDefault\":false,\"fieldType\":\"URN\"}outputDatasets:array[com.linkedin.common.DatasetUrn]/**Input datajobs that this data job depends on*/@Relationship.`/*`={\"name\":\"DownstreamOf\",\"entityTypes\":[\"dataJob\"]}inputDatajobs:optional array[{namespace com.linkedin.common/**Standardized data processing job identifier.*/@java.class=\"com.linkedin.common.urn.DataJobUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataJob\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataJob\",\"doc\":\"Standardized data processing job identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"flow\",\"doc\":\"Standardized data processing flow urn representing the flow for the job\",\"type\":\"com.linkedin.common.urn.DataFlowUrn\"},{\"name\":\"jobID\",\"doc\":\"Unique identifier of the data job\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":594}typeref DataJobUrn=string}]}}{namespace com.linkedin.dataset/**Dataset deprecation status*/@Aspect.name=\"datasetDeprecation\"record DatasetDeprecation{/**Whether the dataset is deprecated by owner.*/@Searchable={\"weightsPerFieldValue\":{\"true\":0.5},\"fieldType\":\"BOOLEAN\"}deprecated:boolean/**The time user plan to decommission this dataset.*/decommissionTime:optional long/**Additional information about the dataset deprecation plan, such as the wiki, doc, RB.*/note:string/**The corpuser URN which will be credited for modifying this deprecation content.*/actor:optional com.linkedin.common.Urn}}{namespace com.linkedin.dataset/**Properties associated with a Dataset*/@Aspect.name=\"datasetProperties\"record DatasetProperties includes com.linkedin.common.CustomProperties,com.linkedin.common.ExternalReference{/**Documentation of the dataset*/@Searchable={\"hasValuesFieldName\":\"hasDescription\",\"fieldType\":\"TEXT\"}description:optional string/**The abstracted URI such as hdfs:///data/tracking/PageViewEvent, file:///dir/file_name. Uri should not include any environment specific properties. Some datasets might not have a standardized uri, which makes this field optional (i.e. kafka topic).*/uri:optional{namespace com.linkedin.common@java.class=\"java.net.URI\"typeref Uri=string}/**[Legacy] Unstructured tags for the dataset. Structured tags can be applied via the `GlobalTags` aspect.*/tags:array[string]=[]}}{namespace com.linkedin.dataset/**Upstream lineage of a dataset*/@Aspect.name=\"upstreamLineage\"record UpstreamLineage{/**List of upstream dataset lineage information*/upstreams:array[/**Upstream lineage information about a dataset including the source reporting the lineage*/record Upstream{/**Audit stamp containing who reported the lineage and when.\nWARNING: this field is deprecated and may be removed in a future release.*/@deprecated=\"we no longer associate a timestamp per upstream edge\"auditStamp:com.linkedin.common.AuditStamp={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**The upstream dataset the lineage points to*/@Relationship={\"name\":\"DownstreamOf\",\"entityTypes\":[\"dataset\"]}@Searchable={\"fieldName\":\"upstreams\",\"queryByDefault\":false,\"fieldType\":\"URN\"}dataset:com.linkedin.common.DatasetUrn/**The type of the lineage*/type:/**The various types of supported dataset lineage*/enum DatasetLineageType{/**Direct copy without modification*/COPY/**Transformed data with modification (format or content change)*/TRANSFORMED/**Represents a view defined on the sources e.g. Hive view defined on underlying hive tables or a Hive table pointing to a HDFS dataset or DALI view defined on multiple sources*/VIEW}}]}}{namespace com.linkedin.schema/**SchemaMetadata to describe metadata related to store schema*/@Aspect.name=\"schemaMetadata\"record SchemaMetadata includes/**Key to retrieve schema metadata.*/record SchemaMetadataKey{/**Schema name e.g. PageViewEvent, identity.Profile, ams.account_management_tracking*/@validate.strlen={\"min\":1,\"max\":500}schemaName:string/**Standardized platform urn where schema is defined. The data platform Urn (urn:li:platform:{platform_name})*/platform:{namespace com.linkedin.common/**Standardized data platforms available*/@java.class=\"com.linkedin.common.urn.DataPlatformUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:wherehows\",\"entityType\":\"dataPlatform\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataPlatform\",\"doc\":\"Standardized data platforms available\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platformName\",\"doc\":\"data platform name i.e. hdfs, oracle, espresso\",\"type\":\"string\",\"maxLength\":25}],\"maxLength\":45}typeref DataPlatformUrn=string}/**Every change to SchemaMetadata in the resource results in a new version. Version is server assigned. This version is differ from platform native schema version.*/version:long}com.linkedin.common.ChangeAuditStamps{/**Dataset this schema metadata is associated with.*/dataset:optional com.linkedin.common.DatasetUrn/**The cluster this schema metadata resides from*/cluster:optional string/**the SHA1 hash of the schema content*/hash:string/**The native schema in the dataset's platform.*/platformSchema:union[/**Schema text of an espresso table schema.*/record EspressoSchema{/**The native espresso document schema.*/documentSchema:string/**The espresso table schema definition.*/tableSchema:string}/**Schema holder for oracle data definition language that describes an oracle table.*/record OracleDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}/**Schema holder for MySql data definition language that describes an MySql table.*/record MySqlDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}/**Schema holder for presto data definition language that describes a presto view.*/record PrestoDDL{/**The raw schema in the dataset's platform. This includes the DDL and the columns extracted from DDL.*/rawSchema:string}/**Schema holder for kafka schema.*/record KafkaSchema{/**The native kafka document schema. This is a human readable avro document schema.*/documentSchema:string/**The native kafka key schema as retrieved from Schema Registry*/keySchema:optional string}/**Schema text of binary JSON schema.*/record BinaryJsonSchema{/**The native schema text for binary JSON file format.*/schema:string}/**Schema text of an ORC schema.*/record OrcSchema{/**The native schema for ORC file format.*/schema:string}/**The dataset has no specific schema associated with it*/record Schemaless{}/**Schema text of a key-value store schema.*/record KeyValueSchema{/**The raw schema for the key in the key-value store.*/keySchema:string/**The raw schema for the value in the key-value store.*/valueSchema:string}/**Schema holder for undefined schema types.*/record OtherSchema{/**The native schema in the dataset's platform.*/rawSchema:string}]/**Client provided a list of fields from document schema.*/fields:array[/**SchemaField to describe metadata related to dataset schema. Schema normalization rules: http://go/tms-schema*/record SchemaField{/**Flattened name of the field. Field is computed from jsonPath field. For data translation rules refer to wiki page above.*/@Searchable={\"fieldName\":\"fieldPaths\",\"fieldType\":\"TEXT_PARTIAL\"}fieldPath:{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}/**Flattened name of a field in JSON Path notation.*/jsonPath:optional string/**Indicates if this field is optional or nullable*/nullable:boolean=false/**Description*/@Searchable={\"fieldName\":\"fieldDescriptions\",\"boostScore\":0.1,\"fieldType\":\"TEXT\"}description:optional string/**Platform independent field type of the field.*/type:/**Schema field data types*/record SchemaFieldDataType{/**Data platform specific types*/type:union[/**Boolean field type.*/record BooleanType{}/**Fixed field type.*/record FixedType{}/**String field type.*/record StringType{}/**Bytes field type.*/record BytesType{}/**Number data type: long, integer, short, etc..*/record NumberType{}/**Date field type.*/record DateType{}/**Time field type. This should also be used for datetimes.*/record TimeType{}/**Enum field type.*/record EnumType{}/**Null field type.*/record NullType{}/**Map field type.*/record MapType{/**Key type in a map*/keyType:optional string/**Type of the value in a map*/valueType:optional string}/**Array field type.*/record ArrayType{/**List of types this array holds.*/nestedType:optional array[string]}/**Union field type.*/record UnionType{/**List of types in union type.*/nestedTypes:optional array[string]}/**Record field type.*/record RecordType{}]}/**The native type of the field in the dataset's platform as declared by platform schema.*/nativeDataType:string/**There are use cases when a field in type B references type A. A field in A references field of type B. In such cases, we will mark the first field as recursive.*/recursive:boolean=false/**Tags associated with the field*/@Searchable.`/tags/*/tag`={\"fieldName\":\"fieldTags\",\"boostScore\":0.5,\"fieldType\":\"URN_PARTIAL\"}globalTags:optional{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}}/**Glossary terms associated with the field*/@Searchable.`/terms/*/urn`={\"fieldName\":\"fieldGlossaryTerms\",\"boostScore\":0.5,\"fieldType\":\"URN_PARTIAL\"}glossaryTerms:optional{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Searchable={\"fieldName\":\"glossaryTerms\",\"filterNameOverride\":\"Glossary Term\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryTerm\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryTerm\",\"doc\":\"business term\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business term with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryTermUrn=string}]/**Audit stamp containing who reported the related business term*/auditStamp:AuditStamp}}/**For schema fields that are part of complex keys, set this field to true\nWe do this to easily distinguish between value and key fields*/isPartOfKey:boolean=false}]/**Client provided list of fields that define primary keys to access record. Field order defines hierarchical espresso keys. Empty lists indicates absence of primary key access patter. Value is a SchemaField@fieldPath.*/primaryKeys:optional array[com.linkedin.dataset.SchemaFieldPath]/**Map captures all the references schema makes to external datasets. Map key is ForeignKeySpecName typeref.*/@deprecated=\"Use foreignKeys instead.\"foreignKeysSpecs:optional map[string/**Description of a foreign key in a schema.*/record ForeignKeySpec{/**Foreign key definition in metadata schema.*/foreignKey:union[/**For non-urn based foregin keys.*/record DatasetFieldForeignKey{/**dataset that stores the resource.*/parentDataset:com.linkedin.common.DatasetUrn/**List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.*/currentFieldPaths:array[com.linkedin.dataset.SchemaFieldPath]/**SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.*/parentField:com.linkedin.dataset.SchemaFieldPath}/**If SchemaMetadata fields make any external references and references are of type com.linkedin.common.Urn or any children, this models can be used to mark it.*/record UrnForeignKey{/**Field in hosting(current) SchemaMetadata.*/currentFieldPath:com.linkedin.dataset.SchemaFieldPath}]}]/**List of foreign key constraints for the schema*/foreignKeys:optional array[/**Description of a foreign key constraint in a schema.*/record ForeignKeyConstraint{/**Name of the constraint, likely provided from the source*/name:string/**Fields the constraint maps to on the foreign dataset*/@Relationship.`/*`={\"name\":\"ForeignKeyTo\",\"entityTypes\":[\"schemaField\"]}foreignFields:array[com.linkedin.common.Urn]/**Fields the constraint maps to on the source dataset*/sourceFields:array[com.linkedin.common.Urn]/**Reference to the foreign dataset for ease of lookup*/@Relationship={\"name\":\"ForeignKeyToDataset\",\"ent").append("ityTypes\":[\"dataset\"]}foreignDataset:com.linkedin.common.Urn}]}}{namespace com.linkedin.schema/**EditableSchemaMetadata stores editable changes made to schema metadata. This separates changes made from\ningestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines.*/@Aspect.name=\"editableSchemaMetadata\"record EditableSchemaMetadata includes com.linkedin.common.ChangeAuditStamps{/**Client provided a list of fields from document schema.*/editableSchemaFieldInfo:array[/**SchemaField to describe metadata related to dataset schema.*/record EditableSchemaFieldInfo{/**FieldPath uniquely identifying the SchemaField this metadata is associated with*/fieldPath:string/**Description*/@Searchable={\"fieldName\":\"editedFieldDescriptions\",\"boostScore\":0.1,\"fieldType\":\"TEXT\"}description:optional string/**Tags associated with the field*/@Searchable.`/tags/*/tag`={\"fieldName\":\"editedFieldTags\",\"boostScore\":0.5,\"fieldType\":\"URN_PARTIAL\"}globalTags:optional com.linkedin.common.GlobalTags/**Glossary terms associated with the field*/@Searchable.`/terms/*/urn`={\"fieldName\":\"editedFieldGlossaryTerms\",\"boostScore\":0.5,\"fieldType\":\"URN_PARTIAL\"}glossaryTerms:optional com.linkedin.common.GlossaryTerms}]}}{namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:Url/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:AuditStamp}]}}{namespace com.linkedin.glossary/**Properties associated with a GlossaryNode*/@Aspect.name=\"glossaryNodeInfo\"record GlossaryNodeInfo{/**Definition of business node*/@Searchable={}definition:string/**Parent node of the glossary term*/parentNode:optional{namespace com.linkedin.common/**Business Node*/@java.class=\"com.linkedin.common.urn.GlossaryNodeUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryNode\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryNode\",\"doc\":\"Standardized business node identifier\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business node with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryNodeUrn=string}}}{namespace com.linkedin.metadata.key/**Key for a GlossaryNode*/@Aspect.name=\"glossaryNodeKey\"record GlossaryNodeKey{@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}name:string}}{namespace com.linkedin.glossary/**Properties associated with a GlossaryTerm*/@Aspect.name=\"glossaryTermInfo\"record GlossaryTermInfo{/**Definition of business term*/@Searchable={}definition:string/**Parent node of the glossary term*/parentNode:optional com.linkedin.common.GlossaryNodeUrn/**Source of the Business Term (INTERNAL or EXTERNAL) with default value as INTERNAL*/@Searchable.fieldType=\"KEYWORD\"termSource:string/**External Reference to the business-term*/@Searchable.fieldType=\"KEYWORD\"sourceRef:optional string/**The abstracted URL such as https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/CashInstrument.*/sourceUrl:optional com.linkedin.common.Url/**A key-value map to capture any other non-standardized properties for the glossary term*/customProperties:map[string,string]={}/**Schema definition of the glossary term*/rawSchema:optional string}}{namespace com.linkedin.metadata.key/**Key for a GlossaryTerm*/@Aspect.name=\"glossaryTermKey\"record GlossaryTermKey{@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}name:string}}{namespace com.linkedin.metadata.key/**Key for an MLFeature*/@Aspect.name=\"mlFeatureKey\"record MLFeatureKey{/**Namespace for the feature*/@Searchable.fieldType=\"TEXT_PARTIAL\"featureNamespace:string/**Name of the feature*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":8.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string}}{namespace com.linkedin.ml.metadata/**Properties associated with a MLFeature*/@Aspect.name=\"mlFeatureProperties\"record MLFeatureProperties{/**Documentation of the MLFeature*/description:optional string/**Data Type of the MLFeature*/dataType:optional{namespace com.linkedin.common/**MLFeature Data Type*/enum MLFeatureDataType{/**Useless data is unique, discrete data with no potential relationship with the outcome variable.\nA useless feature has high cardinality. An example would be bank account numbers that were generated randomly.*/USELESS/**Nominal data is made of discrete values with no numerical relationship between the different categories \u2014 mean and median are meaningless.\nAnimal species is one example. For example, pig is not higher than bird and lower than fish.*/NOMINAL/**Ordinal data are discrete integers that can be ranked or sorted.\nFor example, the distance between first and second may not be the same as the distance between second and third.*/ORDINAL/**Binary data is discrete data that can be in only one of two categories \u2014 either yes or no, 1 or 0, off or on, etc*/BINARY/**Count data is discrete whole number data \u2014 no negative numbers here.\nCount data often has many small values, such as zero and one.*/COUNT/**Time data is a cyclical, repeating continuous form of data.\nThe relevant time features can be any period\u2014 daily, weekly, monthly, annual, etc.*/TIME/**Interval data has equal spaces between the numbers and does not represent a temporal pattern.\nExamples include percentages, temperatures, and income.*/INTERVAL/**Image Data*/IMAGE/**Video Data*/VIDEO/**Audio Data*/AUDIO/**Text Data*/TEXT/**Mapping Data Type ex: dict, map*/MAP/**Sequence Data Type ex: list, tuple, range*/SEQUENCE/**Set Data Type ex: set, frozenset*/SET/**Continuous data are made of uncountable values, often the result of a measurement such as height, weight, age etc.*/CONTINUOUS/**Bytes data are binary-encoded values that can represent complex objects.*/BYTE/**Unknown data are data that we don't know the type for.*/UNKNOWN}}/**Version of the MLFeature*/version:optional{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string}}/**Source of the MLFeature*/@Relationship.`/*`={\"name\":\"DerivedFrom\",\"entityTypes\":[\"dataset\"]}sources:optional array[com.linkedin.common.Urn]}}{namespace com.linkedin.metadata.key/**Key for an ML model*/@Aspect.name=\"mlModelKey\"record MLModelKey{/**Standardized platform urn for the model*/platform:com.linkedin.common.Urn/**Name of the MLModel*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":10.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string/**Fabric type where model belongs to or where it was generated*/@Searchable={\"filterNameOverride\":\"Environment\",\"queryByDefault\":false,\"addToFilters\":true,\"fieldType\":\"TEXT_PARTIAL\"}origin:{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}}}{namespace com.linkedin.ml.metadata/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/@Aspect.name=\"mlModelCaveatsAndRecommendations\"record CaveatsAndRecommendations{/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset?*/caveats:optional/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/record CaveatDetails{/**Did the results suggest any further testing?*/needsFurtherTesting:optional boolean/**Caveat Description\nFor ex: Given gender classes are binary (male/not male), which we include as male/female. Further work needed to evaluate across a spectrum of genders.*/caveatDescription:optional string/**Relevant groups that were not represented in the evaluation dataset?*/groupsNotRepresented:optional array[string]}/**Recommendations on where this MLModel should be used.*/recommendations:optional string/**Ideal characteristics of an evaluation dataset for this MLModel*/idealDatasetCharacteristics:optional array[string]}}{namespace com.linkedin.ml.metadata/**This section is intended to demonstrate the ethical considerations that went into MLModel development, surfacing ethical challenges and solutions to stakeholders.*/@Aspect.name=\"mlModelEthicalConsiderations\"record EthicalConsiderations{/**Does the MLModel use any sensitive data (e.g., protected classes)?*/data:optional array[string]/** Is the MLModel intended to inform decisions about matters central to human life or flourishing \u2013 e.g., health or safety? Or could it be used in such a way?*/humanLife:optional array[string]/**What risk mitigation strategies were used during MLModel development?*/mitigations:optional array[string]/**What risks may be present in MLModel usage? Try to identify the potential recipients, likelihood, and magnitude of harms. If these cannot be determined, note that they were considered but remain unknown.*/risksAndHarms:optional array[string]/**Are there any known MLModel use cases that are especially fraught? This may connect directly to the intended use section*/useCases:optional array[string]}}{namespace com.linkedin.ml.metadata/**All referenced datasets would ideally point to any set of documents that provide visibility into the source and composition of the dataset.*/@Aspect.name=\"mlModelEvaluationData\"record EvaluationData{/**Details on the dataset(s) used for the quantitative analyses in the MLModel*/evaluationData:array[/**BaseData record*/record BaseData{/**What dataset were used in the MLModel?*/dataset:com.linkedin.common.DatasetUrn/**Why was this dataset chosen?*/motivation:optional string/**How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?*/preProcessing:optional array[string]}]}}{namespace com.linkedin.ml.metadata/**Intended Use for the ML Model*/@Aspect.name=\"intendedUse\"record IntendedUse{/**Primary Use cases for the MLModel.*/primaryUses:optional array[string]/**Primary Intended Users - For example, was the MLModel developed for entertainment purposes, for hobbyists, or enterprise solutions?*/primaryUsers:optional array[enum IntendedUserType{ENTERPRISE,HOBBY,ENTERTAINMENT}]/**Highlight technology that the MLModel might easily be confused with, or related contexts that users could try to apply the MLModel to.*/outOfScopeUses:optional array[string]}}{namespace com.linkedin.ml.metadata/**Metrics to be featured for the MLModel.*/@Aspect.name=\"mlModelMetrics\"record Metrics{/**Measures of MLModel performance*/performanceMeasures:optional array[string]/**Decision Thresholds used (if any)?*/decisionThreshold:optional array[string]}}{namespace com.linkedin.ml.metadata/**Prompts which affect the performance of the MLModel*/@Aspect.name=\"mlModelFactorPrompts\"record MLModelFactorPrompts{/**What are foreseeable salient factors for which MLModel performance may vary, and how were these determined?*/relevantFactors:optional array[/**Factors affecting the performance of the MLModel.*/record MLModelFactors{/**Groups refers to distinct categories with similar characteristics that are present in the evaluation data instances.\nFor human-centric machine learning MLModels, groups are people who share one or multiple characteristics.*/groups:optional array[string]/**The performance of a MLModel can vary depending on what instruments were used to capture the input to the MLModel.\nFor example, a face detection model may perform differently depending on the camera\u2019s hardware and software,\nincluding lens, image stabilization, high dynamic range techniques, and background blurring for portrait mode.*/instrumentation:optional array[string]/**A further factor affecting MLModel performance is the environment in which it is deployed.*/environment:optional array[string]}]/**Which factors are being reported, and why were these chosen?*/evaluationFactors:optional array[MLModelFactors]}}{namespace com.linkedin.ml.metadata/**Properties associated with a ML Model*/@Aspect.name=\"mlModelProperties\"record MLModelProperties includes com.linkedin.common.CustomProperties,com.linkedin.common.ExternalReference{/**Documentation of the MLModel*/@Searchable={\"hasValuesFieldName\":\"hasDescription\",\"fieldType\":\"TEXT\"}description:optional string/**Date when the MLModel was developed*/date:optional com.linkedin.common.Time/**Version of the MLModel*/version:optional com.linkedin.common.VersionTag/**Type of Algorithm or MLModel such as whether it is a Naive Bayes classifier, Convolutional Neural Network, etc*/@Searchable.fieldType=\"TEXT_PARTIAL\"type:optional string/**Hyper Parameters of the MLModel\n\nNOTE: these are deprecated in favor of hyperParams*/hyperParameters:optional map[string/**A union of all supported metadata aspects for HyperParameter Value*/typeref HyperParameterValueType=union[string,int,float,double,boolean]]/**Hyperparameters of the MLModel*/hyperParams:optional array[/**Properties associated with an ML Hyper Param*/@Aspect.name=\"mlHyperParam\"record MLHyperParam{/**Name of the MLHyperParam*/name:string/**Documentation of the MLHyperParam*/description:optional string/**The value of the MLHyperParam*/value:optional string/**Date when the MLHyperParam was developed*/createdAt:optional com.linkedin.common.Time}]/**Metrics of the MLModel used in training*/trainingMetrics:optional array[/**Properties associated with an ML Metric*/@Aspect.name=\"mlMetric\"record MLMetric{/**Name of the mlMetric*/name:string/**Documentation of the mlMetric*/description:optional string/**The value of the mlMetric*/value:optional string/**Date when the mlMetric was developed*/createdAt:optional com.linkedin.common.Time}]/**Metrics of the MLModel used in production*/onlineMetrics:optional array[MLMetric]/**List of features used for MLModel training*/mlFeatures:optional array[{namespace com.linkedin.common/**Standardized MLFeature identifier.*/@java.class=\"com.linkedin.common.urn.MLFeatureUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"mlFeature\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"MLFeature\",\"doc\":\"Standardized MLFeature identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"mlFeatureNamespace\",\"doc\":\"Namespace for the MLFeature\",\"type\":\"string\"},{\"name\":\"mlFeatureName\",\"doc\":\"Name of the MLFeature\",\"type\":\"string\",\"maxLength\":210}],\"maxLength\":284}typeref MLFeatureUrn=string}]/**Tags for the MLModel*/tags:array[string]=[]/**Deployments for the MLModel*/@Relationship.`/*`={\"name\":\"DeployedTo\",\"entityTypes\":[\"mlModelDeployment\"]}deployments:optional array[com.linkedin.common.Urn]/**List of jobs (if any) used to train the model*/@Relationship.`/*`={\"name\":\"TrainedBy\",\"entityTypes\":[\"dataJob\"]}trainingJobs:optional array[com.linkedin.common.Urn]/**List of jobs (if any) that use the model*/@Relationship.`/*`={\"name\":\"UsedBy\",\"entityTypes\":[\"dataJob\"]}downstreamJobs:optional array[com.linkedin.common.Urn]/**Groups the model belongs to*/@Relationship.`/*`={\"name\":\"MemberOf\",\"entityTypes\":[\"mlModelGroup\"]}groups:optional array[com.linkedin.common.Urn]}}{namespace com.linkedin.ml.metadata/**Quantitative analyses should be disaggregated, that is, broken down by the chosen factors. Quantitative analyses should provide the results of evaluating the MLModel according to the chosen metrics, providing confidence interval values when possible.*/@Aspect.name=\"mlModelQuantitativeAnalyses\"record QuantitativeAnalyses{/**Link to a dashboard with results showing how the MLModel performed with respect to each factor*/unitaryResults:optional/**A union of all supported metadata aspects for ResultsType*/typeref ResultsType=union[string]/**Link to a dashboard with results showing how the MLModel performed with respect to the intersection of evaluated factors?*/intersectionalResults:optional ResultsType}}{namespace com.linkedin.ml.metadata/**Ideally, the MLModel card would contain as much information about the training data as the evaluation data. However, there might be cases where it is not feasible to provide this level of detailed information about the training data. For example, the data may be proprietary, or require a non-disclosure agreement. In these cases, we advocate for basic details about the distributions over groups in the data, as well as any other details that could inform stakeholders on the kinds of biases the model may have encoded.*/@Aspect.name=\"mlModelTrainingData\"record TrainingData{/**Details on the dataset(s) used for training the MLModel*/trainingData:array[BaseData]}}{namespace com.linkedin.ml.metadata/**Source Code*/@Aspect.name=\"sourceCode\"record SourceCode{/**Source Code along with types*/sourceCode:array[/**Source Code Url Entity*/record SourceCodeUrl{/**Source Code Url Types*/type:enum SourceCodeUrlType{ML_MODEL_SOURCE_CODE,TRAINING_PIPELINE_SOURCE_CODE,EVALUATION_PIPELINE_SOURCE_CODE}/**Source Code Url*/sourceCodeUrl:com.linkedin.common.Url}]}}{namespace com.linkedin.metadata.key/**Key for a Tag*/@Aspect.name=\"tagKey\"record TagKey{/**The unique tag name*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":10.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string}}{namespace com.linkedin.tag/**Properties associated with a Tag*/@Aspect.name=\"tagProperties\"record TagProperties{/**Name of the tag*/name:string/**Documentation of the tag*/description:optional string}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\",\"corpGroup\"]}@Searchable={\"fieldName\":\"owners\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"fieldType\":\"URN\"}owner:Urn/**The type of the ownership*/type:/**Owner category or owner role*/enum OwnershipType{/**A person or group that is in charge of developing the code*/DEVELOPER/**A person or group that is owning the data*/DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.*/DELEGATE/**A person, group, or service that produces/generates the data*/PRODUCER/**A person, group, or service that consumes the data*/CONSUMER/**A person or a group that has direct business interest*/STAKEHOLDER}/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}}]/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:AuditStamp={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}}}{namespace com.linkedin.common/**The status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**whether the entity is removed or not*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}com.linkedin.common.GlobalTags{namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be backslash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"filterNameOverride\":\"Platform\",\"addToFilters\":true,\"fieldType\":\"URN\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/instance:optional string}}]").toString(), SchemaFormatType.PDL));
    private final static DataSchema MEMBER_ChartKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.ChartKey");
    private final static DataSchema MEMBER_ChartInfo = SCHEMA.getTypeByMemberKey("com.linkedin.chart.ChartInfo");
    private final static DataSchema MEMBER_ChartQuery = SCHEMA.getTypeByMemberKey("com.linkedin.chart.ChartQuery");
    private final static DataSchema MEMBER_CorpGroupKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.CorpGroupKey");
    private final static DataSchema MEMBER_CorpGroupInfo = SCHEMA.getTypeByMemberKey("com.linkedin.identity.CorpGroupInfo");
    private final static DataSchema MEMBER_CorpUserKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.CorpUserKey");
    private final static DataSchema MEMBER_CorpUserEditableInfo = SCHEMA.getTypeByMemberKey("com.linkedin.identity.CorpUserEditableInfo");
    private final static DataSchema MEMBER_CorpUserInfo = SCHEMA.getTypeByMemberKey("com.linkedin.identity.CorpUserInfo");
    private final static DataSchema MEMBER_CorpUserStatus = SCHEMA.getTypeByMemberKey("com.linkedin.identity.CorpUserStatus");
    private final static DataSchema MEMBER_GroupMembership = SCHEMA.getTypeByMemberKey("com.linkedin.identity.GroupMembership");
    private final static DataSchema MEMBER_DashboardKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.DashboardKey");
    private final static DataSchema MEMBER_DashboardInfo = SCHEMA.getTypeByMemberKey("com.linkedin.dashboard.DashboardInfo");
    private final static DataSchema MEMBER_DataFlowKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.DataFlowKey");
    private final static DataSchema MEMBER_DataFlowInfo = SCHEMA.getTypeByMemberKey("com.linkedin.datajob.DataFlowInfo");
    private final static DataSchema MEMBER_DataJobKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.DataJobKey");
    private final static DataSchema MEMBER_DataJobInfo = SCHEMA.getTypeByMemberKey("com.linkedin.datajob.DataJobInfo");
    private final static DataSchema MEMBER_DataJobInputOutput = SCHEMA.getTypeByMemberKey("com.linkedin.datajob.DataJobInputOutput");
    private final static DataSchema MEMBER_DatasetDeprecation = SCHEMA.getTypeByMemberKey("com.linkedin.dataset.DatasetDeprecation");
    private final static DataSchema MEMBER_DatasetProperties = SCHEMA.getTypeByMemberKey("com.linkedin.dataset.DatasetProperties");
    private final static DataSchema MEMBER_UpstreamLineage = SCHEMA.getTypeByMemberKey("com.linkedin.dataset.UpstreamLineage");
    private final static DataSchema MEMBER_SchemaMetadata = SCHEMA.getTypeByMemberKey("com.linkedin.schema.SchemaMetadata");
    private final static DataSchema MEMBER_EditableSchemaMetadata = SCHEMA.getTypeByMemberKey("com.linkedin.schema.EditableSchemaMetadata");
    private final static DataSchema MEMBER_InstitutionalMemory = SCHEMA.getTypeByMemberKey("com.linkedin.common.InstitutionalMemory");
    private final static DataSchema MEMBER_GlossaryNodeInfo = SCHEMA.getTypeByMemberKey("com.linkedin.glossary.GlossaryNodeInfo");
    private final static DataSchema MEMBER_GlossaryNodeKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.GlossaryNodeKey");
    private final static DataSchema MEMBER_GlossaryTermInfo = SCHEMA.getTypeByMemberKey("com.linkedin.glossary.GlossaryTermInfo");
    private final static DataSchema MEMBER_GlossaryTermKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.GlossaryTermKey");
    private final static DataSchema MEMBER_MLFeatureKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.MLFeatureKey");
    private final static DataSchema MEMBER_MLFeatureProperties = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.MLFeatureProperties");
    private final static DataSchema MEMBER_MLModelKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.MLModelKey");
    private final static DataSchema MEMBER_CaveatsAndRecommendations = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.CaveatsAndRecommendations");
    private final static DataSchema MEMBER_EthicalConsiderations = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.EthicalConsiderations");
    private final static DataSchema MEMBER_EvaluationData = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.EvaluationData");
    private final static DataSchema MEMBER_IntendedUse = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.IntendedUse");
    private final static DataSchema MEMBER_Metrics = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.Metrics");
    private final static DataSchema MEMBER_MLModelFactorPrompts = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.MLModelFactorPrompts");
    private final static DataSchema MEMBER_MLModelProperties = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.MLModelProperties");
    private final static DataSchema MEMBER_QuantitativeAnalyses = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.QuantitativeAnalyses");
    private final static DataSchema MEMBER_TrainingData = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.TrainingData");
    private final static DataSchema MEMBER_SourceCode = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.SourceCode");
    private final static DataSchema MEMBER_TagKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.TagKey");
    private final static DataSchema MEMBER_TagProperties = SCHEMA.getTypeByMemberKey("com.linkedin.tag.TagProperties");
    private final static DataSchema MEMBER_Ownership = SCHEMA.getTypeByMemberKey("com.linkedin.common.Ownership");
    private final static DataSchema MEMBER_Status = SCHEMA.getTypeByMemberKey("com.linkedin.common.Status");
    private final static DataSchema MEMBER_GlobalTags = SCHEMA.getTypeByMemberKey("com.linkedin.common.GlobalTags");
    private final static DataSchema MEMBER_BrowsePaths = SCHEMA.getTypeByMemberKey("com.linkedin.common.BrowsePaths");
    private final static DataSchema MEMBER_DataPlatformInstance = SCHEMA.getTypeByMemberKey("com.linkedin.common.DataPlatformInstance");
    private final static TyperefInfo TYPEREFINFO = new Aspect.UnionTyperefInfo();

    public Aspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public Aspect(Object data) {
        super(data, SCHEMA);
    }

    public static Aspect create(com.linkedin.metadata.key.ChartKey value) {
        Aspect newUnion = new Aspect();
        newUnion.setChartKey(value);
        return newUnion;
    }

    public boolean isChartKey() {
        return memberIs("com.linkedin.metadata.key.ChartKey");
    }

    public com.linkedin.metadata.key.ChartKey getChartKey() {
        return obtainWrapped(MEMBER_ChartKey, com.linkedin.metadata.key.ChartKey.class, "com.linkedin.metadata.key.ChartKey");
    }

    public void setChartKey(com.linkedin.metadata.key.ChartKey value) {
        selectWrapped(MEMBER_ChartKey, com.linkedin.metadata.key.ChartKey.class, "com.linkedin.metadata.key.ChartKey", value);
    }

    public static Aspect create(com.linkedin.chart.ChartInfo value) {
        Aspect newUnion = new Aspect();
        newUnion.setChartInfo(value);
        return newUnion;
    }

    public boolean isChartInfo() {
        return memberIs("com.linkedin.chart.ChartInfo");
    }

    public com.linkedin.chart.ChartInfo getChartInfo() {
        return obtainWrapped(MEMBER_ChartInfo, com.linkedin.chart.ChartInfo.class, "com.linkedin.chart.ChartInfo");
    }

    public void setChartInfo(com.linkedin.chart.ChartInfo value) {
        selectWrapped(MEMBER_ChartInfo, com.linkedin.chart.ChartInfo.class, "com.linkedin.chart.ChartInfo", value);
    }

    public static Aspect create(com.linkedin.chart.ChartQuery value) {
        Aspect newUnion = new Aspect();
        newUnion.setChartQuery(value);
        return newUnion;
    }

    public boolean isChartQuery() {
        return memberIs("com.linkedin.chart.ChartQuery");
    }

    public com.linkedin.chart.ChartQuery getChartQuery() {
        return obtainWrapped(MEMBER_ChartQuery, com.linkedin.chart.ChartQuery.class, "com.linkedin.chart.ChartQuery");
    }

    public void setChartQuery(com.linkedin.chart.ChartQuery value) {
        selectWrapped(MEMBER_ChartQuery, com.linkedin.chart.ChartQuery.class, "com.linkedin.chart.ChartQuery", value);
    }

    public static Aspect create(com.linkedin.metadata.key.CorpGroupKey value) {
        Aspect newUnion = new Aspect();
        newUnion.setCorpGroupKey(value);
        return newUnion;
    }

    public boolean isCorpGroupKey() {
        return memberIs("com.linkedin.metadata.key.CorpGroupKey");
    }

    public com.linkedin.metadata.key.CorpGroupKey getCorpGroupKey() {
        return obtainWrapped(MEMBER_CorpGroupKey, com.linkedin.metadata.key.CorpGroupKey.class, "com.linkedin.metadata.key.CorpGroupKey");
    }

    public void setCorpGroupKey(com.linkedin.metadata.key.CorpGroupKey value) {
        selectWrapped(MEMBER_CorpGroupKey, com.linkedin.metadata.key.CorpGroupKey.class, "com.linkedin.metadata.key.CorpGroupKey", value);
    }

    public static Aspect create(com.linkedin.identity.CorpGroupInfo value) {
        Aspect newUnion = new Aspect();
        newUnion.setCorpGroupInfo(value);
        return newUnion;
    }

    public boolean isCorpGroupInfo() {
        return memberIs("com.linkedin.identity.CorpGroupInfo");
    }

    public com.linkedin.identity.CorpGroupInfo getCorpGroupInfo() {
        return obtainWrapped(MEMBER_CorpGroupInfo, com.linkedin.identity.CorpGroupInfo.class, "com.linkedin.identity.CorpGroupInfo");
    }

    public void setCorpGroupInfo(com.linkedin.identity.CorpGroupInfo value) {
        selectWrapped(MEMBER_CorpGroupInfo, com.linkedin.identity.CorpGroupInfo.class, "com.linkedin.identity.CorpGroupInfo", value);
    }

    public static Aspect create(com.linkedin.metadata.key.CorpUserKey value) {
        Aspect newUnion = new Aspect();
        newUnion.setCorpUserKey(value);
        return newUnion;
    }

    public boolean isCorpUserKey() {
        return memberIs("com.linkedin.metadata.key.CorpUserKey");
    }

    public com.linkedin.metadata.key.CorpUserKey getCorpUserKey() {
        return obtainWrapped(MEMBER_CorpUserKey, com.linkedin.metadata.key.CorpUserKey.class, "com.linkedin.metadata.key.CorpUserKey");
    }

    public void setCorpUserKey(com.linkedin.metadata.key.CorpUserKey value) {
        selectWrapped(MEMBER_CorpUserKey, com.linkedin.metadata.key.CorpUserKey.class, "com.linkedin.metadata.key.CorpUserKey", value);
    }

    public static Aspect create(com.linkedin.identity.CorpUserEditableInfo value) {
        Aspect newUnion = new Aspect();
        newUnion.setCorpUserEditableInfo(value);
        return newUnion;
    }

    public boolean isCorpUserEditableInfo() {
        return memberIs("com.linkedin.identity.CorpUserEditableInfo");
    }

    public com.linkedin.identity.CorpUserEditableInfo getCorpUserEditableInfo() {
        return obtainWrapped(MEMBER_CorpUserEditableInfo, com.linkedin.identity.CorpUserEditableInfo.class, "com.linkedin.identity.CorpUserEditableInfo");
    }

    public void setCorpUserEditableInfo(com.linkedin.identity.CorpUserEditableInfo value) {
        selectWrapped(MEMBER_CorpUserEditableInfo, com.linkedin.identity.CorpUserEditableInfo.class, "com.linkedin.identity.CorpUserEditableInfo", value);
    }

    public static Aspect create(com.linkedin.identity.CorpUserInfo value) {
        Aspect newUnion = new Aspect();
        newUnion.setCorpUserInfo(value);
        return newUnion;
    }

    public boolean isCorpUserInfo() {
        return memberIs("com.linkedin.identity.CorpUserInfo");
    }

    public com.linkedin.identity.CorpUserInfo getCorpUserInfo() {
        return obtainWrapped(MEMBER_CorpUserInfo, com.linkedin.identity.CorpUserInfo.class, "com.linkedin.identity.CorpUserInfo");
    }

    public void setCorpUserInfo(com.linkedin.identity.CorpUserInfo value) {
        selectWrapped(MEMBER_CorpUserInfo, com.linkedin.identity.CorpUserInfo.class, "com.linkedin.identity.CorpUserInfo", value);
    }

    public static Aspect create(com.linkedin.identity.CorpUserStatus value) {
        Aspect newUnion = new Aspect();
        newUnion.setCorpUserStatus(value);
        return newUnion;
    }

    public boolean isCorpUserStatus() {
        return memberIs("com.linkedin.identity.CorpUserStatus");
    }

    public com.linkedin.identity.CorpUserStatus getCorpUserStatus() {
        return obtainWrapped(MEMBER_CorpUserStatus, com.linkedin.identity.CorpUserStatus.class, "com.linkedin.identity.CorpUserStatus");
    }

    public void setCorpUserStatus(com.linkedin.identity.CorpUserStatus value) {
        selectWrapped(MEMBER_CorpUserStatus, com.linkedin.identity.CorpUserStatus.class, "com.linkedin.identity.CorpUserStatus", value);
    }

    public static Aspect create(com.linkedin.identity.GroupMembership value) {
        Aspect newUnion = new Aspect();
        newUnion.setGroupMembership(value);
        return newUnion;
    }

    public boolean isGroupMembership() {
        return memberIs("com.linkedin.identity.GroupMembership");
    }

    public com.linkedin.identity.GroupMembership getGroupMembership() {
        return obtainWrapped(MEMBER_GroupMembership, com.linkedin.identity.GroupMembership.class, "com.linkedin.identity.GroupMembership");
    }

    public void setGroupMembership(com.linkedin.identity.GroupMembership value) {
        selectWrapped(MEMBER_GroupMembership, com.linkedin.identity.GroupMembership.class, "com.linkedin.identity.GroupMembership", value);
    }

    public static Aspect create(com.linkedin.metadata.key.DashboardKey value) {
        Aspect newUnion = new Aspect();
        newUnion.setDashboardKey(value);
        return newUnion;
    }

    public boolean isDashboardKey() {
        return memberIs("com.linkedin.metadata.key.DashboardKey");
    }

    public com.linkedin.metadata.key.DashboardKey getDashboardKey() {
        return obtainWrapped(MEMBER_DashboardKey, com.linkedin.metadata.key.DashboardKey.class, "com.linkedin.metadata.key.DashboardKey");
    }

    public void setDashboardKey(com.linkedin.metadata.key.DashboardKey value) {
        selectWrapped(MEMBER_DashboardKey, com.linkedin.metadata.key.DashboardKey.class, "com.linkedin.metadata.key.DashboardKey", value);
    }

    public static Aspect create(com.linkedin.dashboard.DashboardInfo value) {
        Aspect newUnion = new Aspect();
        newUnion.setDashboardInfo(value);
        return newUnion;
    }

    public boolean isDashboardInfo() {
        return memberIs("com.linkedin.dashboard.DashboardInfo");
    }

    public com.linkedin.dashboard.DashboardInfo getDashboardInfo() {
        return obtainWrapped(MEMBER_DashboardInfo, com.linkedin.dashboard.DashboardInfo.class, "com.linkedin.dashboard.DashboardInfo");
    }

    public void setDashboardInfo(com.linkedin.dashboard.DashboardInfo value) {
        selectWrapped(MEMBER_DashboardInfo, com.linkedin.dashboard.DashboardInfo.class, "com.linkedin.dashboard.DashboardInfo", value);
    }

    public static Aspect create(com.linkedin.metadata.key.DataFlowKey value) {
        Aspect newUnion = new Aspect();
        newUnion.setDataFlowKey(value);
        return newUnion;
    }

    public boolean isDataFlowKey() {
        return memberIs("com.linkedin.metadata.key.DataFlowKey");
    }

    public com.linkedin.metadata.key.DataFlowKey getDataFlowKey() {
        return obtainWrapped(MEMBER_DataFlowKey, com.linkedin.metadata.key.DataFlowKey.class, "com.linkedin.metadata.key.DataFlowKey");
    }

    public void setDataFlowKey(com.linkedin.metadata.key.DataFlowKey value) {
        selectWrapped(MEMBER_DataFlowKey, com.linkedin.metadata.key.DataFlowKey.class, "com.linkedin.metadata.key.DataFlowKey", value);
    }

    public static Aspect create(com.linkedin.datajob.DataFlowInfo value) {
        Aspect newUnion = new Aspect();
        newUnion.setDataFlowInfo(value);
        return newUnion;
    }

    public boolean isDataFlowInfo() {
        return memberIs("com.linkedin.datajob.DataFlowInfo");
    }

    public com.linkedin.datajob.DataFlowInfo getDataFlowInfo() {
        return obtainWrapped(MEMBER_DataFlowInfo, com.linkedin.datajob.DataFlowInfo.class, "com.linkedin.datajob.DataFlowInfo");
    }

    public void setDataFlowInfo(com.linkedin.datajob.DataFlowInfo value) {
        selectWrapped(MEMBER_DataFlowInfo, com.linkedin.datajob.DataFlowInfo.class, "com.linkedin.datajob.DataFlowInfo", value);
    }

    public static Aspect create(com.linkedin.metadata.key.DataJobKey value) {
        Aspect newUnion = new Aspect();
        newUnion.setDataJobKey(value);
        return newUnion;
    }

    public boolean isDataJobKey() {
        return memberIs("com.linkedin.metadata.key.DataJobKey");
    }

    public com.linkedin.metadata.key.DataJobKey getDataJobKey() {
        return obtainWrapped(MEMBER_DataJobKey, com.linkedin.metadata.key.DataJobKey.class, "com.linkedin.metadata.key.DataJobKey");
    }

    public void setDataJobKey(com.linkedin.metadata.key.DataJobKey value) {
        selectWrapped(MEMBER_DataJobKey, com.linkedin.metadata.key.DataJobKey.class, "com.linkedin.metadata.key.DataJobKey", value);
    }

    public static Aspect create(com.linkedin.datajob.DataJobInfo value) {
        Aspect newUnion = new Aspect();
        newUnion.setDataJobInfo(value);
        return newUnion;
    }

    public boolean isDataJobInfo() {
        return memberIs("com.linkedin.datajob.DataJobInfo");
    }

    public com.linkedin.datajob.DataJobInfo getDataJobInfo() {
        return obtainWrapped(MEMBER_DataJobInfo, com.linkedin.datajob.DataJobInfo.class, "com.linkedin.datajob.DataJobInfo");
    }

    public void setDataJobInfo(com.linkedin.datajob.DataJobInfo value) {
        selectWrapped(MEMBER_DataJobInfo, com.linkedin.datajob.DataJobInfo.class, "com.linkedin.datajob.DataJobInfo", value);
    }

    public static Aspect create(com.linkedin.datajob.DataJobInputOutput value) {
        Aspect newUnion = new Aspect();
        newUnion.setDataJobInputOutput(value);
        return newUnion;
    }

    public boolean isDataJobInputOutput() {
        return memberIs("com.linkedin.datajob.DataJobInputOutput");
    }

    public com.linkedin.datajob.DataJobInputOutput getDataJobInputOutput() {
        return obtainWrapped(MEMBER_DataJobInputOutput, com.linkedin.datajob.DataJobInputOutput.class, "com.linkedin.datajob.DataJobInputOutput");
    }

    public void setDataJobInputOutput(com.linkedin.datajob.DataJobInputOutput value) {
        selectWrapped(MEMBER_DataJobInputOutput, com.linkedin.datajob.DataJobInputOutput.class, "com.linkedin.datajob.DataJobInputOutput", value);
    }

    public static Aspect create(com.linkedin.dataset.DatasetDeprecation value) {
        Aspect newUnion = new Aspect();
        newUnion.setDatasetDeprecation(value);
        return newUnion;
    }

    public boolean isDatasetDeprecation() {
        return memberIs("com.linkedin.dataset.DatasetDeprecation");
    }

    public com.linkedin.dataset.DatasetDeprecation getDatasetDeprecation() {
        return obtainWrapped(MEMBER_DatasetDeprecation, com.linkedin.dataset.DatasetDeprecation.class, "com.linkedin.dataset.DatasetDeprecation");
    }

    public void setDatasetDeprecation(com.linkedin.dataset.DatasetDeprecation value) {
        selectWrapped(MEMBER_DatasetDeprecation, com.linkedin.dataset.DatasetDeprecation.class, "com.linkedin.dataset.DatasetDeprecation", value);
    }

    public static Aspect create(com.linkedin.dataset.DatasetProperties value) {
        Aspect newUnion = new Aspect();
        newUnion.setDatasetProperties(value);
        return newUnion;
    }

    public boolean isDatasetProperties() {
        return memberIs("com.linkedin.dataset.DatasetProperties");
    }

    public com.linkedin.dataset.DatasetProperties getDatasetProperties() {
        return obtainWrapped(MEMBER_DatasetProperties, com.linkedin.dataset.DatasetProperties.class, "com.linkedin.dataset.DatasetProperties");
    }

    public void setDatasetProperties(com.linkedin.dataset.DatasetProperties value) {
        selectWrapped(MEMBER_DatasetProperties, com.linkedin.dataset.DatasetProperties.class, "com.linkedin.dataset.DatasetProperties", value);
    }

    public static Aspect create(com.linkedin.dataset.UpstreamLineage value) {
        Aspect newUnion = new Aspect();
        newUnion.setUpstreamLineage(value);
        return newUnion;
    }

    public boolean isUpstreamLineage() {
        return memberIs("com.linkedin.dataset.UpstreamLineage");
    }

    public com.linkedin.dataset.UpstreamLineage getUpstreamLineage() {
        return obtainWrapped(MEMBER_UpstreamLineage, com.linkedin.dataset.UpstreamLineage.class, "com.linkedin.dataset.UpstreamLineage");
    }

    public void setUpstreamLineage(com.linkedin.dataset.UpstreamLineage value) {
        selectWrapped(MEMBER_UpstreamLineage, com.linkedin.dataset.UpstreamLineage.class, "com.linkedin.dataset.UpstreamLineage", value);
    }

    public static Aspect create(com.linkedin.schema.SchemaMetadata value) {
        Aspect newUnion = new Aspect();
        newUnion.setSchemaMetadata(value);
        return newUnion;
    }

    public boolean isSchemaMetadata() {
        return memberIs("com.linkedin.schema.SchemaMetadata");
    }

    public com.linkedin.schema.SchemaMetadata getSchemaMetadata() {
        return obtainWrapped(MEMBER_SchemaMetadata, com.linkedin.schema.SchemaMetadata.class, "com.linkedin.schema.SchemaMetadata");
    }

    public void setSchemaMetadata(com.linkedin.schema.SchemaMetadata value) {
        selectWrapped(MEMBER_SchemaMetadata, com.linkedin.schema.SchemaMetadata.class, "com.linkedin.schema.SchemaMetadata", value);
    }

    public static Aspect create(com.linkedin.schema.EditableSchemaMetadata value) {
        Aspect newUnion = new Aspect();
        newUnion.setEditableSchemaMetadata(value);
        return newUnion;
    }

    public boolean isEditableSchemaMetadata() {
        return memberIs("com.linkedin.schema.EditableSchemaMetadata");
    }

    public com.linkedin.schema.EditableSchemaMetadata getEditableSchemaMetadata() {
        return obtainWrapped(MEMBER_EditableSchemaMetadata, com.linkedin.schema.EditableSchemaMetadata.class, "com.linkedin.schema.EditableSchemaMetadata");
    }

    public void setEditableSchemaMetadata(com.linkedin.schema.EditableSchemaMetadata value) {
        selectWrapped(MEMBER_EditableSchemaMetadata, com.linkedin.schema.EditableSchemaMetadata.class, "com.linkedin.schema.EditableSchemaMetadata", value);
    }

    public static Aspect create(com.linkedin.common.InstitutionalMemory value) {
        Aspect newUnion = new Aspect();
        newUnion.setInstitutionalMemory(value);
        return newUnion;
    }

    public boolean isInstitutionalMemory() {
        return memberIs("com.linkedin.common.InstitutionalMemory");
    }

    public com.linkedin.common.InstitutionalMemory getInstitutionalMemory() {
        return obtainWrapped(MEMBER_InstitutionalMemory, com.linkedin.common.InstitutionalMemory.class, "com.linkedin.common.InstitutionalMemory");
    }

    public void setInstitutionalMemory(com.linkedin.common.InstitutionalMemory value) {
        selectWrapped(MEMBER_InstitutionalMemory, com.linkedin.common.InstitutionalMemory.class, "com.linkedin.common.InstitutionalMemory", value);
    }

    public static Aspect create(com.linkedin.glossary.GlossaryNodeInfo value) {
        Aspect newUnion = new Aspect();
        newUnion.setGlossaryNodeInfo(value);
        return newUnion;
    }

    public boolean isGlossaryNodeInfo() {
        return memberIs("com.linkedin.glossary.GlossaryNodeInfo");
    }

    public com.linkedin.glossary.GlossaryNodeInfo getGlossaryNodeInfo() {
        return obtainWrapped(MEMBER_GlossaryNodeInfo, com.linkedin.glossary.GlossaryNodeInfo.class, "com.linkedin.glossary.GlossaryNodeInfo");
    }

    public void setGlossaryNodeInfo(com.linkedin.glossary.GlossaryNodeInfo value) {
        selectWrapped(MEMBER_GlossaryNodeInfo, com.linkedin.glossary.GlossaryNodeInfo.class, "com.linkedin.glossary.GlossaryNodeInfo", value);
    }

    public static Aspect create(com.linkedin.metadata.key.GlossaryNodeKey value) {
        Aspect newUnion = new Aspect();
        newUnion.setGlossaryNodeKey(value);
        return newUnion;
    }

    public boolean isGlossaryNodeKey() {
        return memberIs("com.linkedin.metadata.key.GlossaryNodeKey");
    }

    public com.linkedin.metadata.key.GlossaryNodeKey getGlossaryNodeKey() {
        return obtainWrapped(MEMBER_GlossaryNodeKey, com.linkedin.metadata.key.GlossaryNodeKey.class, "com.linkedin.metadata.key.GlossaryNodeKey");
    }

    public void setGlossaryNodeKey(com.linkedin.metadata.key.GlossaryNodeKey value) {
        selectWrapped(MEMBER_GlossaryNodeKey, com.linkedin.metadata.key.GlossaryNodeKey.class, "com.linkedin.metadata.key.GlossaryNodeKey", value);
    }

    public static Aspect create(com.linkedin.glossary.GlossaryTermInfo value) {
        Aspect newUnion = new Aspect();
        newUnion.setGlossaryTermInfo(value);
        return newUnion;
    }

    public boolean isGlossaryTermInfo() {
        return memberIs("com.linkedin.glossary.GlossaryTermInfo");
    }

    public com.linkedin.glossary.GlossaryTermInfo getGlossaryTermInfo() {
        return obtainWrapped(MEMBER_GlossaryTermInfo, com.linkedin.glossary.GlossaryTermInfo.class, "com.linkedin.glossary.GlossaryTermInfo");
    }

    public void setGlossaryTermInfo(com.linkedin.glossary.GlossaryTermInfo value) {
        selectWrapped(MEMBER_GlossaryTermInfo, com.linkedin.glossary.GlossaryTermInfo.class, "com.linkedin.glossary.GlossaryTermInfo", value);
    }

    public static Aspect create(com.linkedin.metadata.key.GlossaryTermKey value) {
        Aspect newUnion = new Aspect();
        newUnion.setGlossaryTermKey(value);
        return newUnion;
    }

    public boolean isGlossaryTermKey() {
        return memberIs("com.linkedin.metadata.key.GlossaryTermKey");
    }

    public com.linkedin.metadata.key.GlossaryTermKey getGlossaryTermKey() {
        return obtainWrapped(MEMBER_GlossaryTermKey, com.linkedin.metadata.key.GlossaryTermKey.class, "com.linkedin.metadata.key.GlossaryTermKey");
    }

    public void setGlossaryTermKey(com.linkedin.metadata.key.GlossaryTermKey value) {
        selectWrapped(MEMBER_GlossaryTermKey, com.linkedin.metadata.key.GlossaryTermKey.class, "com.linkedin.metadata.key.GlossaryTermKey", value);
    }

    public static Aspect create(com.linkedin.metadata.key.MLFeatureKey value) {
        Aspect newUnion = new Aspect();
        newUnion.setMLFeatureKey(value);
        return newUnion;
    }

    public boolean isMLFeatureKey() {
        return memberIs("com.linkedin.metadata.key.MLFeatureKey");
    }

    public com.linkedin.metadata.key.MLFeatureKey getMLFeatureKey() {
        return obtainWrapped(MEMBER_MLFeatureKey, com.linkedin.metadata.key.MLFeatureKey.class, "com.linkedin.metadata.key.MLFeatureKey");
    }

    public void setMLFeatureKey(com.linkedin.metadata.key.MLFeatureKey value) {
        selectWrapped(MEMBER_MLFeatureKey, com.linkedin.metadata.key.MLFeatureKey.class, "com.linkedin.metadata.key.MLFeatureKey", value);
    }

    public static Aspect create(com.linkedin.ml.metadata.MLFeatureProperties value) {
        Aspect newUnion = new Aspect();
        newUnion.setMLFeatureProperties(value);
        return newUnion;
    }

    public boolean isMLFeatureProperties() {
        return memberIs("com.linkedin.ml.metadata.MLFeatureProperties");
    }

    public com.linkedin.ml.metadata.MLFeatureProperties getMLFeatureProperties() {
        return obtainWrapped(MEMBER_MLFeatureProperties, com.linkedin.ml.metadata.MLFeatureProperties.class, "com.linkedin.ml.metadata.MLFeatureProperties");
    }

    public void setMLFeatureProperties(com.linkedin.ml.metadata.MLFeatureProperties value) {
        selectWrapped(MEMBER_MLFeatureProperties, com.linkedin.ml.metadata.MLFeatureProperties.class, "com.linkedin.ml.metadata.MLFeatureProperties", value);
    }

    public static Aspect create(com.linkedin.metadata.key.MLModelKey value) {
        Aspect newUnion = new Aspect();
        newUnion.setMLModelKey(value);
        return newUnion;
    }

    public boolean isMLModelKey() {
        return memberIs("com.linkedin.metadata.key.MLModelKey");
    }

    public com.linkedin.metadata.key.MLModelKey getMLModelKey() {
        return obtainWrapped(MEMBER_MLModelKey, com.linkedin.metadata.key.MLModelKey.class, "com.linkedin.metadata.key.MLModelKey");
    }

    public void setMLModelKey(com.linkedin.metadata.key.MLModelKey value) {
        selectWrapped(MEMBER_MLModelKey, com.linkedin.metadata.key.MLModelKey.class, "com.linkedin.metadata.key.MLModelKey", value);
    }

    public static Aspect create(com.linkedin.ml.metadata.CaveatsAndRecommendations value) {
        Aspect newUnion = new Aspect();
        newUnion.setCaveatsAndRecommendations(value);
        return newUnion;
    }

    public boolean isCaveatsAndRecommendations() {
        return memberIs("com.linkedin.ml.metadata.CaveatsAndRecommendations");
    }

    public com.linkedin.ml.metadata.CaveatsAndRecommendations getCaveatsAndRecommendations() {
        return obtainWrapped(MEMBER_CaveatsAndRecommendations, com.linkedin.ml.metadata.CaveatsAndRecommendations.class, "com.linkedin.ml.metadata.CaveatsAndRecommendations");
    }

    public void setCaveatsAndRecommendations(com.linkedin.ml.metadata.CaveatsAndRecommendations value) {
        selectWrapped(MEMBER_CaveatsAndRecommendations, com.linkedin.ml.metadata.CaveatsAndRecommendations.class, "com.linkedin.ml.metadata.CaveatsAndRecommendations", value);
    }

    public static Aspect create(com.linkedin.ml.metadata.EthicalConsiderations value) {
        Aspect newUnion = new Aspect();
        newUnion.setEthicalConsiderations(value);
        return newUnion;
    }

    public boolean isEthicalConsiderations() {
        return memberIs("com.linkedin.ml.metadata.EthicalConsiderations");
    }

    public com.linkedin.ml.metadata.EthicalConsiderations getEthicalConsiderations() {
        return obtainWrapped(MEMBER_EthicalConsiderations, com.linkedin.ml.metadata.EthicalConsiderations.class, "com.linkedin.ml.metadata.EthicalConsiderations");
    }

    public void setEthicalConsiderations(com.linkedin.ml.metadata.EthicalConsiderations value) {
        selectWrapped(MEMBER_EthicalConsiderations, com.linkedin.ml.metadata.EthicalConsiderations.class, "com.linkedin.ml.metadata.EthicalConsiderations", value);
    }

    public static Aspect create(com.linkedin.ml.metadata.EvaluationData value) {
        Aspect newUnion = new Aspect();
        newUnion.setEvaluationData(value);
        return newUnion;
    }

    public boolean isEvaluationData() {
        return memberIs("com.linkedin.ml.metadata.EvaluationData");
    }

    public com.linkedin.ml.metadata.EvaluationData getEvaluationData() {
        return obtainWrapped(MEMBER_EvaluationData, com.linkedin.ml.metadata.EvaluationData.class, "com.linkedin.ml.metadata.EvaluationData");
    }

    public void setEvaluationData(com.linkedin.ml.metadata.EvaluationData value) {
        selectWrapped(MEMBER_EvaluationData, com.linkedin.ml.metadata.EvaluationData.class, "com.linkedin.ml.metadata.EvaluationData", value);
    }

    public static Aspect create(com.linkedin.ml.metadata.IntendedUse value) {
        Aspect newUnion = new Aspect();
        newUnion.setIntendedUse(value);
        return newUnion;
    }

    public boolean isIntendedUse() {
        return memberIs("com.linkedin.ml.metadata.IntendedUse");
    }

    public com.linkedin.ml.metadata.IntendedUse getIntendedUse() {
        return obtainWrapped(MEMBER_IntendedUse, com.linkedin.ml.metadata.IntendedUse.class, "com.linkedin.ml.metadata.IntendedUse");
    }

    public void setIntendedUse(com.linkedin.ml.metadata.IntendedUse value) {
        selectWrapped(MEMBER_IntendedUse, com.linkedin.ml.metadata.IntendedUse.class, "com.linkedin.ml.metadata.IntendedUse", value);
    }

    public static Aspect create(com.linkedin.ml.metadata.Metrics value) {
        Aspect newUnion = new Aspect();
        newUnion.setMetrics(value);
        return newUnion;
    }

    public boolean isMetrics() {
        return memberIs("com.linkedin.ml.metadata.Metrics");
    }

    public com.linkedin.ml.metadata.Metrics getMetrics() {
        return obtainWrapped(MEMBER_Metrics, com.linkedin.ml.metadata.Metrics.class, "com.linkedin.ml.metadata.Metrics");
    }

    public void setMetrics(com.linkedin.ml.metadata.Metrics value) {
        selectWrapped(MEMBER_Metrics, com.linkedin.ml.metadata.Metrics.class, "com.linkedin.ml.metadata.Metrics", value);
    }

    public static Aspect create(com.linkedin.ml.metadata.MLModelFactorPrompts value) {
        Aspect newUnion = new Aspect();
        newUnion.setMLModelFactorPrompts(value);
        return newUnion;
    }

    public boolean isMLModelFactorPrompts() {
        return memberIs("com.linkedin.ml.metadata.MLModelFactorPrompts");
    }

    public com.linkedin.ml.metadata.MLModelFactorPrompts getMLModelFactorPrompts() {
        return obtainWrapped(MEMBER_MLModelFactorPrompts, com.linkedin.ml.metadata.MLModelFactorPrompts.class, "com.linkedin.ml.metadata.MLModelFactorPrompts");
    }

    public void setMLModelFactorPrompts(com.linkedin.ml.metadata.MLModelFactorPrompts value) {
        selectWrapped(MEMBER_MLModelFactorPrompts, com.linkedin.ml.metadata.MLModelFactorPrompts.class, "com.linkedin.ml.metadata.MLModelFactorPrompts", value);
    }

    public static Aspect create(com.linkedin.ml.metadata.MLModelProperties value) {
        Aspect newUnion = new Aspect();
        newUnion.setMLModelProperties(value);
        return newUnion;
    }

    public boolean isMLModelProperties() {
        return memberIs("com.linkedin.ml.metadata.MLModelProperties");
    }

    public com.linkedin.ml.metadata.MLModelProperties getMLModelProperties() {
        return obtainWrapped(MEMBER_MLModelProperties, com.linkedin.ml.metadata.MLModelProperties.class, "com.linkedin.ml.metadata.MLModelProperties");
    }

    public void setMLModelProperties(com.linkedin.ml.metadata.MLModelProperties value) {
        selectWrapped(MEMBER_MLModelProperties, com.linkedin.ml.metadata.MLModelProperties.class, "com.linkedin.ml.metadata.MLModelProperties", value);
    }

    public static Aspect create(com.linkedin.ml.metadata.QuantitativeAnalyses value) {
        Aspect newUnion = new Aspect();
        newUnion.setQuantitativeAnalyses(value);
        return newUnion;
    }

    public boolean isQuantitativeAnalyses() {
        return memberIs("com.linkedin.ml.metadata.QuantitativeAnalyses");
    }

    public com.linkedin.ml.metadata.QuantitativeAnalyses getQuantitativeAnalyses() {
        return obtainWrapped(MEMBER_QuantitativeAnalyses, com.linkedin.ml.metadata.QuantitativeAnalyses.class, "com.linkedin.ml.metadata.QuantitativeAnalyses");
    }

    public void setQuantitativeAnalyses(com.linkedin.ml.metadata.QuantitativeAnalyses value) {
        selectWrapped(MEMBER_QuantitativeAnalyses, com.linkedin.ml.metadata.QuantitativeAnalyses.class, "com.linkedin.ml.metadata.QuantitativeAnalyses", value);
    }

    public static Aspect create(com.linkedin.ml.metadata.TrainingData value) {
        Aspect newUnion = new Aspect();
        newUnion.setTrainingData(value);
        return newUnion;
    }

    public boolean isTrainingData() {
        return memberIs("com.linkedin.ml.metadata.TrainingData");
    }

    public com.linkedin.ml.metadata.TrainingData getTrainingData() {
        return obtainWrapped(MEMBER_TrainingData, com.linkedin.ml.metadata.TrainingData.class, "com.linkedin.ml.metadata.TrainingData");
    }

    public void setTrainingData(com.linkedin.ml.metadata.TrainingData value) {
        selectWrapped(MEMBER_TrainingData, com.linkedin.ml.metadata.TrainingData.class, "com.linkedin.ml.metadata.TrainingData", value);
    }

    public static Aspect create(com.linkedin.ml.metadata.SourceCode value) {
        Aspect newUnion = new Aspect();
        newUnion.setSourceCode(value);
        return newUnion;
    }

    public boolean isSourceCode() {
        return memberIs("com.linkedin.ml.metadata.SourceCode");
    }

    public com.linkedin.ml.metadata.SourceCode getSourceCode() {
        return obtainWrapped(MEMBER_SourceCode, com.linkedin.ml.metadata.SourceCode.class, "com.linkedin.ml.metadata.SourceCode");
    }

    public void setSourceCode(com.linkedin.ml.metadata.SourceCode value) {
        selectWrapped(MEMBER_SourceCode, com.linkedin.ml.metadata.SourceCode.class, "com.linkedin.ml.metadata.SourceCode", value);
    }

    public static Aspect create(com.linkedin.metadata.key.TagKey value) {
        Aspect newUnion = new Aspect();
        newUnion.setTagKey(value);
        return newUnion;
    }

    public boolean isTagKey() {
        return memberIs("com.linkedin.metadata.key.TagKey");
    }

    public com.linkedin.metadata.key.TagKey getTagKey() {
        return obtainWrapped(MEMBER_TagKey, com.linkedin.metadata.key.TagKey.class, "com.linkedin.metadata.key.TagKey");
    }

    public void setTagKey(com.linkedin.metadata.key.TagKey value) {
        selectWrapped(MEMBER_TagKey, com.linkedin.metadata.key.TagKey.class, "com.linkedin.metadata.key.TagKey", value);
    }

    public static Aspect create(com.linkedin.tag.TagProperties value) {
        Aspect newUnion = new Aspect();
        newUnion.setTagProperties(value);
        return newUnion;
    }

    public boolean isTagProperties() {
        return memberIs("com.linkedin.tag.TagProperties");
    }

    public com.linkedin.tag.TagProperties getTagProperties() {
        return obtainWrapped(MEMBER_TagProperties, com.linkedin.tag.TagProperties.class, "com.linkedin.tag.TagProperties");
    }

    public void setTagProperties(com.linkedin.tag.TagProperties value) {
        selectWrapped(MEMBER_TagProperties, com.linkedin.tag.TagProperties.class, "com.linkedin.tag.TagProperties", value);
    }

    public static Aspect create(com.linkedin.common.Ownership value) {
        Aspect newUnion = new Aspect();
        newUnion.setOwnership(value);
        return newUnion;
    }

    public boolean isOwnership() {
        return memberIs("com.linkedin.common.Ownership");
    }

    public com.linkedin.common.Ownership getOwnership() {
        return obtainWrapped(MEMBER_Ownership, com.linkedin.common.Ownership.class, "com.linkedin.common.Ownership");
    }

    public void setOwnership(com.linkedin.common.Ownership value) {
        selectWrapped(MEMBER_Ownership, com.linkedin.common.Ownership.class, "com.linkedin.common.Ownership", value);
    }

    public static Aspect create(com.linkedin.common.Status value) {
        Aspect newUnion = new Aspect();
        newUnion.setStatus(value);
        return newUnion;
    }

    public boolean isStatus() {
        return memberIs("com.linkedin.common.Status");
    }

    public com.linkedin.common.Status getStatus() {
        return obtainWrapped(MEMBER_Status, com.linkedin.common.Status.class, "com.linkedin.common.Status");
    }

    public void setStatus(com.linkedin.common.Status value) {
        selectWrapped(MEMBER_Status, com.linkedin.common.Status.class, "com.linkedin.common.Status", value);
    }

    public static Aspect create(com.linkedin.common.GlobalTags value) {
        Aspect newUnion = new Aspect();
        newUnion.setGlobalTags(value);
        return newUnion;
    }

    public boolean isGlobalTags() {
        return memberIs("com.linkedin.common.GlobalTags");
    }

    public com.linkedin.common.GlobalTags getGlobalTags() {
        return obtainWrapped(MEMBER_GlobalTags, com.linkedin.common.GlobalTags.class, "com.linkedin.common.GlobalTags");
    }

    public void setGlobalTags(com.linkedin.common.GlobalTags value) {
        selectWrapped(MEMBER_GlobalTags, com.linkedin.common.GlobalTags.class, "com.linkedin.common.GlobalTags", value);
    }

    public static Aspect create(com.linkedin.common.BrowsePaths value) {
        Aspect newUnion = new Aspect();
        newUnion.setBrowsePaths(value);
        return newUnion;
    }

    public boolean isBrowsePaths() {
        return memberIs("com.linkedin.common.BrowsePaths");
    }

    public com.linkedin.common.BrowsePaths getBrowsePaths() {
        return obtainWrapped(MEMBER_BrowsePaths, com.linkedin.common.BrowsePaths.class, "com.linkedin.common.BrowsePaths");
    }

    public void setBrowsePaths(com.linkedin.common.BrowsePaths value) {
        selectWrapped(MEMBER_BrowsePaths, com.linkedin.common.BrowsePaths.class, "com.linkedin.common.BrowsePaths", value);
    }

    public static Aspect create(com.linkedin.common.DataPlatformInstance value) {
        Aspect newUnion = new Aspect();
        newUnion.setDataPlatformInstance(value);
        return newUnion;
    }

    public boolean isDataPlatformInstance() {
        return memberIs("com.linkedin.common.DataPlatformInstance");
    }

    public com.linkedin.common.DataPlatformInstance getDataPlatformInstance() {
        return obtainWrapped(MEMBER_DataPlatformInstance, com.linkedin.common.DataPlatformInstance.class, "com.linkedin.common.DataPlatformInstance");
    }

    public void setDataPlatformInstance(com.linkedin.common.DataPlatformInstance value) {
        selectWrapped(MEMBER_DataPlatformInstance, com.linkedin.common.DataPlatformInstance.class, "com.linkedin.common.DataPlatformInstance", value);
    }

    @Override
    public Aspect clone()
        throws CloneNotSupportedException
    {
        return ((Aspect) super.clone());
    }

    @Override
    public Aspect copy()
        throws CloneNotSupportedException
    {
        return ((Aspect) super.copy());
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        public com.linkedin.metadata.key.ChartKey.Fields ChartKey() {
            return new com.linkedin.metadata.key.ChartKey.Fields(getPathComponents(), "com.linkedin.metadata.key.ChartKey");
        }

        public com.linkedin.chart.ChartInfo.Fields ChartInfo() {
            return new com.linkedin.chart.ChartInfo.Fields(getPathComponents(), "com.linkedin.chart.ChartInfo");
        }

        public com.linkedin.chart.ChartQuery.Fields ChartQuery() {
            return new com.linkedin.chart.ChartQuery.Fields(getPathComponents(), "com.linkedin.chart.ChartQuery");
        }

        public com.linkedin.metadata.key.CorpGroupKey.Fields CorpGroupKey() {
            return new com.linkedin.metadata.key.CorpGroupKey.Fields(getPathComponents(), "com.linkedin.metadata.key.CorpGroupKey");
        }

        public com.linkedin.identity.CorpGroupInfo.Fields CorpGroupInfo() {
            return new com.linkedin.identity.CorpGroupInfo.Fields(getPathComponents(), "com.linkedin.identity.CorpGroupInfo");
        }

        public com.linkedin.metadata.key.CorpUserKey.Fields CorpUserKey() {
            return new com.linkedin.metadata.key.CorpUserKey.Fields(getPathComponents(), "com.linkedin.metadata.key.CorpUserKey");
        }

        public com.linkedin.identity.CorpUserEditableInfo.Fields CorpUserEditableInfo() {
            return new com.linkedin.identity.CorpUserEditableInfo.Fields(getPathComponents(), "com.linkedin.identity.CorpUserEditableInfo");
        }

        public com.linkedin.identity.CorpUserInfo.Fields CorpUserInfo() {
            return new com.linkedin.identity.CorpUserInfo.Fields(getPathComponents(), "com.linkedin.identity.CorpUserInfo");
        }

        public com.linkedin.identity.CorpUserStatus.Fields CorpUserStatus() {
            return new com.linkedin.identity.CorpUserStatus.Fields(getPathComponents(), "com.linkedin.identity.CorpUserStatus");
        }

        public com.linkedin.identity.GroupMembership.Fields GroupMembership() {
            return new com.linkedin.identity.GroupMembership.Fields(getPathComponents(), "com.linkedin.identity.GroupMembership");
        }

        public com.linkedin.metadata.key.DashboardKey.Fields DashboardKey() {
            return new com.linkedin.metadata.key.DashboardKey.Fields(getPathComponents(), "com.linkedin.metadata.key.DashboardKey");
        }

        public com.linkedin.dashboard.DashboardInfo.Fields DashboardInfo() {
            return new com.linkedin.dashboard.DashboardInfo.Fields(getPathComponents(), "com.linkedin.dashboard.DashboardInfo");
        }

        public com.linkedin.metadata.key.DataFlowKey.Fields DataFlowKey() {
            return new com.linkedin.metadata.key.DataFlowKey.Fields(getPathComponents(), "com.linkedin.metadata.key.DataFlowKey");
        }

        public com.linkedin.datajob.DataFlowInfo.Fields DataFlowInfo() {
            return new com.linkedin.datajob.DataFlowInfo.Fields(getPathComponents(), "com.linkedin.datajob.DataFlowInfo");
        }

        public com.linkedin.metadata.key.DataJobKey.Fields DataJobKey() {
            return new com.linkedin.metadata.key.DataJobKey.Fields(getPathComponents(), "com.linkedin.metadata.key.DataJobKey");
        }

        public com.linkedin.datajob.DataJobInfo.Fields DataJobInfo() {
            return new com.linkedin.datajob.DataJobInfo.Fields(getPathComponents(), "com.linkedin.datajob.DataJobInfo");
        }

        public com.linkedin.datajob.DataJobInputOutput.Fields DataJobInputOutput() {
            return new com.linkedin.datajob.DataJobInputOutput.Fields(getPathComponents(), "com.linkedin.datajob.DataJobInputOutput");
        }

        public com.linkedin.dataset.DatasetDeprecation.Fields DatasetDeprecation() {
            return new com.linkedin.dataset.DatasetDeprecation.Fields(getPathComponents(), "com.linkedin.dataset.DatasetDeprecation");
        }

        public com.linkedin.dataset.DatasetProperties.Fields DatasetProperties() {
            return new com.linkedin.dataset.DatasetProperties.Fields(getPathComponents(), "com.linkedin.dataset.DatasetProperties");
        }

        public com.linkedin.dataset.UpstreamLineage.Fields UpstreamLineage() {
            return new com.linkedin.dataset.UpstreamLineage.Fields(getPathComponents(), "com.linkedin.dataset.UpstreamLineage");
        }

        public com.linkedin.schema.SchemaMetadata.Fields SchemaMetadata() {
            return new com.linkedin.schema.SchemaMetadata.Fields(getPathComponents(), "com.linkedin.schema.SchemaMetadata");
        }

        public com.linkedin.schema.EditableSchemaMetadata.Fields EditableSchemaMetadata() {
            return new com.linkedin.schema.EditableSchemaMetadata.Fields(getPathComponents(), "com.linkedin.schema.EditableSchemaMetadata");
        }

        public com.linkedin.common.InstitutionalMemory.Fields InstitutionalMemory() {
            return new com.linkedin.common.InstitutionalMemory.Fields(getPathComponents(), "com.linkedin.common.InstitutionalMemory");
        }

        public com.linkedin.glossary.GlossaryNodeInfo.Fields GlossaryNodeInfo() {
            return new com.linkedin.glossary.GlossaryNodeInfo.Fields(getPathComponents(), "com.linkedin.glossary.GlossaryNodeInfo");
        }

        public com.linkedin.metadata.key.GlossaryNodeKey.Fields GlossaryNodeKey() {
            return new com.linkedin.metadata.key.GlossaryNodeKey.Fields(getPathComponents(), "com.linkedin.metadata.key.GlossaryNodeKey");
        }

        public com.linkedin.glossary.GlossaryTermInfo.Fields GlossaryTermInfo() {
            return new com.linkedin.glossary.GlossaryTermInfo.Fields(getPathComponents(), "com.linkedin.glossary.GlossaryTermInfo");
        }

        public com.linkedin.metadata.key.GlossaryTermKey.Fields GlossaryTermKey() {
            return new com.linkedin.metadata.key.GlossaryTermKey.Fields(getPathComponents(), "com.linkedin.metadata.key.GlossaryTermKey");
        }

        public com.linkedin.metadata.key.MLFeatureKey.Fields MLFeatureKey() {
            return new com.linkedin.metadata.key.MLFeatureKey.Fields(getPathComponents(), "com.linkedin.metadata.key.MLFeatureKey");
        }

        public com.linkedin.ml.metadata.MLFeatureProperties.Fields MLFeatureProperties() {
            return new com.linkedin.ml.metadata.MLFeatureProperties.Fields(getPathComponents(), "com.linkedin.ml.metadata.MLFeatureProperties");
        }

        public com.linkedin.metadata.key.MLModelKey.Fields MLModelKey() {
            return new com.linkedin.metadata.key.MLModelKey.Fields(getPathComponents(), "com.linkedin.metadata.key.MLModelKey");
        }

        public com.linkedin.ml.metadata.CaveatsAndRecommendations.Fields CaveatsAndRecommendations() {
            return new com.linkedin.ml.metadata.CaveatsAndRecommendations.Fields(getPathComponents(), "com.linkedin.ml.metadata.CaveatsAndRecommendations");
        }

        public com.linkedin.ml.metadata.EthicalConsiderations.Fields EthicalConsiderations() {
            return new com.linkedin.ml.metadata.EthicalConsiderations.Fields(getPathComponents(), "com.linkedin.ml.metadata.EthicalConsiderations");
        }

        public com.linkedin.ml.metadata.EvaluationData.Fields EvaluationData() {
            return new com.linkedin.ml.metadata.EvaluationData.Fields(getPathComponents(), "com.linkedin.ml.metadata.EvaluationData");
        }

        public com.linkedin.ml.metadata.IntendedUse.Fields IntendedUse() {
            return new com.linkedin.ml.metadata.IntendedUse.Fields(getPathComponents(), "com.linkedin.ml.metadata.IntendedUse");
        }

        public com.linkedin.ml.metadata.Metrics.Fields Metrics() {
            return new com.linkedin.ml.metadata.Metrics.Fields(getPathComponents(), "com.linkedin.ml.metadata.Metrics");
        }

        public com.linkedin.ml.metadata.MLModelFactorPrompts.Fields MLModelFactorPrompts() {
            return new com.linkedin.ml.metadata.MLModelFactorPrompts.Fields(getPathComponents(), "com.linkedin.ml.metadata.MLModelFactorPrompts");
        }

        public com.linkedin.ml.metadata.MLModelProperties.Fields MLModelProperties() {
            return new com.linkedin.ml.metadata.MLModelProperties.Fields(getPathComponents(), "com.linkedin.ml.metadata.MLModelProperties");
        }

        public com.linkedin.ml.metadata.QuantitativeAnalyses.Fields QuantitativeAnalyses() {
            return new com.linkedin.ml.metadata.QuantitativeAnalyses.Fields(getPathComponents(), "com.linkedin.ml.metadata.QuantitativeAnalyses");
        }

        public com.linkedin.ml.metadata.TrainingData.Fields TrainingData() {
            return new com.linkedin.ml.metadata.TrainingData.Fields(getPathComponents(), "com.linkedin.ml.metadata.TrainingData");
        }

        public com.linkedin.ml.metadata.SourceCode.Fields SourceCode() {
            return new com.linkedin.ml.metadata.SourceCode.Fields(getPathComponents(), "com.linkedin.ml.metadata.SourceCode");
        }

        public com.linkedin.metadata.key.TagKey.Fields TagKey() {
            return new com.linkedin.metadata.key.TagKey.Fields(getPathComponents(), "com.linkedin.metadata.key.TagKey");
        }

        public com.linkedin.tag.TagProperties.Fields TagProperties() {
            return new com.linkedin.tag.TagProperties.Fields(getPathComponents(), "com.linkedin.tag.TagProperties");
        }

        public com.linkedin.common.Ownership.Fields Ownership() {
            return new com.linkedin.common.Ownership.Fields(getPathComponents(), "com.linkedin.common.Ownership");
        }

        public com.linkedin.common.Status.Fields Status() {
            return new com.linkedin.common.Status.Fields(getPathComponents(), "com.linkedin.common.Status");
        }

        public com.linkedin.common.GlobalTags.Fields GlobalTags() {
            return new com.linkedin.common.GlobalTags.Fields(getPathComponents(), "com.linkedin.common.GlobalTags");
        }

        public com.linkedin.common.BrowsePaths.Fields BrowsePaths() {
            return new com.linkedin.common.BrowsePaths.Fields(getPathComponents(), "com.linkedin.common.BrowsePaths");
        }

        public com.linkedin.common.DataPlatformInstance.Fields DataPlatformInstance() {
            return new com.linkedin.common.DataPlatformInstance.Fields(getPathComponents(), "com.linkedin.common.DataPlatformInstance");
        }

    }


    /**
     * A union of all supported metadata aspects for a Chart
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema(new StringBuilder().append("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a Chart*/typeref Aspect=union[{namespace com.linkedin.metadata.key/**Key for a Chart*/@Aspect.name=\"chartKey\"record ChartKey{/**The name of the dashboard tool such as looker, redash etc.*/@Searchable={\"fieldName\":\"tool\",\"boostScore\":4.0,\"fieldType\":\"TEXT_PARTIAL\"}dashboardTool:string/**Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'*/chartId:string}}{namespace com.linkedin.chart/**Information about a chart*/@Aspect.name=\"chartInfo\"record ChartInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`.queryByDefault,customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/externalUrl:optional@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}{/**Title of the chart*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}title:string/**Detailed description about the chart*/@Searchable={}description:string/**Captures information about who created/last modified/deleted this chart and when*/lastModified:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}/**URL for the chart. This could be used as an external link on DataHub to allow users access/view the chart*/chartUrl:optional com.linkedin.common.Url/**Data sources for the chart*/@Relationship.`/*/string`={\"name\":\"Consumes\",\"entityTypes\":[\"dataset\"]}inputs:optional array[/**Input source type for a chart such as dataset or metric*/typeref ChartDataSourceType=union[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}]]/**Type of the chart*/@Searchable={\"filterNameOverride\":\"Chart Type\",\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}type:optional/**The various types of charts*/enum ChartType{/**Chart showing a Bar chart*/BAR/**Chart showing a Pie chart*/PIE/**Chart showing a Scatter plot*/SCATTER/**Chart showing a table*/TABLE/**Chart showing Markdown formatted text*/TEXT,LINE,AREA,HISTOGRAM,BOX_PLOT}/**Access level for the chart*/@Searchable={\"filterNameOverride\":\"Access Level\",\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}access:optional{namespace com.linkedin.common/**The various access levels*/enum AccessLevel{/**Publicly available access level*/PUBLIC/**Private availability to certain set of users*/PRIVATE}}/**The time when this chart last refreshed*/lastRefreshed:optional com.linkedin.common.Time}}{namespace com.linkedin.chart/**Information for chart query which is used for getting data of the chart*/@Aspect.name=\"chartQuery\"record ChartQuery{/**Raw query to build a chart from input datasets*/rawQuery:string/**Chart query type*/@Searchable={\"fieldName\":\"queryType\",\"filterNameOverride\":\"Query Type\",\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}type:enum ChartQueryType{/**LookML queries*/LOOKML/**SQL type queries*/SQL}}}{namespace com.linkedin.metadata.key/**Key for a CorpGroup*/@Aspect.name=\"corpGroupKey\"record CorpGroupKey{/**The URL-encoded name of the AD/LDAP group. Serves as a globally unique identifier within DataHub.*/@Searchable.fieldType=\"TEXT_PARTIAL\"name:string}}{namespace com.linkedin.identity/**group of corpUser, it may contains nested group*/@Aspect={\"name\":\"corpGroupInfo\",\"EntityUrns\":[\"com.linkedin.common.CorpGroupUrn\"]}record CorpGroupInfo{/**The name to use when displaying the group.*/@Searchable.fieldType=\"TEXT_PARTIAL\"displayName:optional string/**email of this group*/email:optional{namespace com.linkedin.common,typeref EmailAddress=string}/**owners of this group*/@Relationship.`/*`={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\"]}admins:array[{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}]/**List of ldap urn in this group.*/@Relationship.`/*`={\"name\":\"IsPartOf\",\"entityTypes\":[\"corpUser\"]}members:array[com.linkedin.common.CorpuserUrn]/**List of groups in this group.*/@Relationship.`/*`={\"name\":\"IsPartOf\",\"entityTypes\":[\"corpGroup\"]}groups:array[{namespace com.linkedin.common/**Corporate group's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpGroupUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpGroup\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"CorpGroup\",\"doc\":\"Corporate group's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"groupName\",\"doc\":\"The name of the AD/LDAP group.\",\"type\":\"string\",\"maxLength\":64}],\"maxLength\":81}typeref CorpGroupUrn=string}]/**A description of the group.*/@Searchable.fieldType=\"TEXT_PARTIAL\"description:optional string}}{namespace com.linkedin.metadata.key/**Key for a CorpUser*/@Aspect.name=\"corpUserKey\"record CorpUserKey{/**The name of the AD/LDAP user.*/@Searchable={\"enableAutocomplete\":true,\"fieldName\":\"ldap\",\"boostScore\":2.0,\"fieldType\":\"TEXT_PARTIAL\"}username:string}}{namespace com.linkedin.identity/**Linkedin corp user information that can be edited from UI*/@Aspect={\"name\":\"corpUserEditableInfo\",\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"]}record CorpUserEditableInfo{/**About me section of the user*/aboutMe:optional string/**Teams that the user belongs to e.g. Metadata*/@Searchable.`/*`.fieldType=\"TEXT\"teams:array[string]=[]/**Skills that the user possesses e.g. Machine Learning*/@Searchable.`/*`.fieldType=\"TEXT\"skills:array[string]=[]/**A URL which points to a picture which user wants to set as a profile photo*/pictureLink:com.linkedin.common.Url=\"https://raw.githubusercontent.com/linkedin/datahub/master/datahub-web-react/src/images/default_avatar.png\"}}{namespace com.linkedin.identity/**Linkedin corp user information*/@Aspect={\"name\":\"corpUserInfo\",\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"]}record CorpUserInfo{/**Deprecated! Use CorpUserStatus instead. Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools*/@Searchable={\"weightsPerFieldValue\":{\"true\":2.0},\"fieldType\":\"BOOLEAN\"}active:boolean/**displayName of this user ,  e.g.  Hang Zhang(DataHQ)*/displayName:optional string/**email address of this user*/@Searchable={\"queryByDefault\":true,\"fieldType\":\"KEYWORD\"}email:optional com.linkedin.common.EmailAddress/**title of this user*/@Searchable={\"queryByDefault\":true,\"fieldType\":\"KEYWORD\"}title:optional string/**direct manager of this user*/@Relationship={\"name\":\"ReportsTo\",\"entityTypes\":[\"corpUser\"]}@Searchable={\"fieldName\":\"managerLdap\",\"queryByDefault\":true,\"fieldType\":\"URN\"}managerUrn:optional com.linkedin.common.CorpuserUrn/**department id this user belong to*/departmentId:optional long/**department name this user belong to*/departmentName:optional string/**first name of this user*/firstName:optional string/**last name of this user*/lastName:optional string/**Common name of this user, format is firstName + lastName (split by a whitespace)*/@Searchable={\"boostScore\":10.0,\"queryByDefault\":true,\"fieldType\":\"TEXT_PARTIAL\"}fullName:optional string/**two uppercase letters country code. e.g.  US*/countryCode:optional string}}{namespace com.linkedin.identity/**The status of the user, e.g. provisioned, active, suspended, etc.*/@Aspect.name=\"corpUserStatus\"record CorpUserStatus{/**Status of the user, e.g. PROVISIONED / ACTIVE / SUSPENDED*/@Searchable.fieldType=\"KEYWORD\"status:string/**Audit stamp containing who last modified the status and when.*/lastModified:com.linkedin.common.AuditStamp}}{namespace com.linkedin.identity/**Carries information about the CorpGroups a user is in.*/@Aspect.name=\"groupMembership\"record GroupMembership{@Relationship.`/*`={\"name\":\"IsMemberOfGroup\",\"entityTypes\":[\"corpGroup\"]}groups:array[com.linkedin.common.Urn]}}{namespace com.linkedin.metadata.key/**Key for a Dashboard*/@Aspect.name=\"dashboardKey\"record DashboardKey{/**The name of the dashboard tool such as looker, redash etc.*/@Searchable={\"fieldName\":\"tool\",\"boostScore\":4.0,\"fieldType\":\"TEXT_PARTIAL\"}dashboardTool:string/**Unique id for the dashboard. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, dashboard URL could be used here for Looker such as 'looker.linkedin.com/dashboards/1234'*/dashboardId:string}}{namespace com.linkedin.dashboard/**Information about a dashboard*/@Aspect.name=\"dashboardInfo\"record DashboardInfo includes com.linkedin.common.CustomProperties,com.linkedin.common.ExternalReference{/**Title of the dashboard*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":10.0,\"fieldType\":\"TEXT_PARTIAL\"}title:string/**Detailed description about the dashboard*/@Searchable={\"hasValuesFieldName\":\"hasDescription\",\"fieldType\":\"TEXT\"}description:string/**Charts in a dashboard*/@Relationship.`/*`={\"name\":\"Contains\",\"entityTypes\":[\"chart\"]}charts:array[{namespace com.linkedin.common/**Standardized chart identifier*/@java.class=\"com.linkedin.common.urn.ChartUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"chart\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Chart\",\"doc\":\"Standardized chart identifier\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"dashboardTool\",\"doc\":\"The name of the dashboard tool such as looker, redash etc.\",\"type\":\"string\",\"maxLength\":20},{\"name\":\"chartId\",\"doc\":\"Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":236}typeref ChartUrn=string}]=[]/**Captures information about who created/last modified/deleted this dashboard and when*/lastModified:com.linkedin.common.ChangeAuditStamps/**URL for the dashboard. This could be used as an external link on DataHub to allow users access/view the dashboard*/dashboardUrl:optional com.linkedin.common.Url/**Access level for the dashboard*/@Searchable={\"filterNameOverride\":\"Access Level\",\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}access:optional com.linkedin.common.AccessLevel/**The time when this dashboard last refreshed*/lastRefreshed:optional com.linkedin.common.Time}}{namespace com.linkedin.metadata.key/**Key for a Data Flow*/@Aspect.name=\"dataFlowKey\"record DataFlowKey{/**Workflow manager like azkaban, airflow which orchestrates the flow*/@Searchable.fieldType=\"TEXT_PARTIAL\"orchestrator:string/**Unique Identifier of the data flow*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}flowId:string/**Cluster where the flow is executed*/@Searchable.fieldType=\"TEXT_PARTIAL\"cluster:string}}{namespace com.linkedin.datajob/**Information about a Data processing flow*/@Aspect.name=\"dataFlowInfo\"record DataFlowInfo includes com.linkedin.common.CustomProperties,com.linkedin.common.ExternalReference{/**Flow name*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":10.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string/**Flow description*/@Searchable={\"hasValuesFieldName\":\"hasDescription\",\"fieldType\":\"TEXT\"}description:optional string/**Optional project/namespace associated with the flow*/@Searchable={\"queryByDefault\":false,\"fieldType\":\"TEXT_PARTIAL\"}project:optional string}}{namespace com.linkedin.metadata.key/**Key for a Data Job*/@Aspect.name=\"dataJobKey\"record DataJobKey{/**Standardized data processing flow urn representing the flow for the job*/@Relationship={\"name\":\"IsPartOf\",\"entityTypes\":[\"dataFlow\"]}@Searchable={\"fieldName\":\"dataFlow\",\"queryByDefault\":false,\"fieldType\":\"URN_PARTIAL\"}flow:com.linkedin.common.Urn/**Unique Identifier of the data job*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}jobId:string}}{namespace com.linkedin.datajob/**Information about a Data processing job*/@Aspect.name=\"dataJobInfo\"record DataJobInfo includes com.linkedin.common.CustomProperties,com.linkedin.common.ExternalReference{/**Job name*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":10.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string/**Job description*/@Searchable={\"hasValuesFieldName\":\"hasDescription\",\"fieldType\":\"TEXT\"}description:optional string/**Datajob type\n**NOTE**: AzkabanJobType is deprecated. Please use strings instead.*/type:union[{namespace com.linkedin.datajob.azkaban/**The various types of support azkaban jobs*/enum AzkabanJobType{/**The command job type is one of the basic built-in types. It runs multiple UNIX commands using java processbuilder.\nUpon execution, Azkaban spawns off a process to run the command.*/COMMAND/**Runs a java program with ability to access Hadoop cluster.\nhttps://azkaban.readthedocs.io/en/latest/jobTypes.html#java-job-type*/HADOOP_JAVA/**In large part, this is the same Command type. The difference is its ability to talk to a Hadoop cluster\nsecurely, via Hadoop tokens.*/HADOOP_SHELL/**Hive type is for running Hive jobs.*/HIVE/**Pig type is for running Pig jobs.*/PIG/**SQL is for running Presto, mysql queries etc*/SQL/**Glue type is for running AWS Glue job transforms.*/GLUE}}string]/**DataFlow urn that this job is part of*/flowUrn:optional{namespace com.linkedin.common/**Standardized data processing flow identifier.*/@java.class=\"com.linkedin.common.urn.DataFlowUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataFlow\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataFlow\",\"doc\":\"Standardized data processing flow identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"orchestrator\",\"doc\":\"Workflow manager like azkaban, airflow which orchestrates the flow\",\"type\":\"string\",\"maxLength\":50},{\"name\":\"flowId\",\"doc\":\"Unique Identifier of the data flow\",\"type\":\"string\",\"maxLength\":200},{\"name\":\"cluster\",\"doc\":\"Cluster where the flow is executed\",\"type\":\"string\",\"maxLength\":100}],\"maxLength\":373}typeref DataFlowUrn=string}/**Status of the job*/status:optional/**Job statuses*/enum JobStatus{/**Jobs being initialized.*/STARTING/**Jobs currently running.*/IN_PROGRESS/**Jobs being stopped.*/STOPPING/**Jobs that have stopped.*/STOPPED/**Jobs with successful completion.*/COMPLETED/**Jobs that have failed.*/FAILED/**Jobs with unknown status (either unmappable or unavailable)*/UNKNOWN}}}{namespace com.linkedin.datajob/**Information about the inputs and outputs of a Data processing job*/@Aspect.name=\"dataJobInputOutput\"record DataJobInputOutput{/**Input datasets consumed by the data job during processing*/@Relationship.`/*`={\"name\":\"Consumes\",\"entityTypes\":[\"dataset\"]}@Searchable.`/*`={\"fieldName\":\"inputs\",\"numValuesFieldName\":\"numInputDatasets\",\"queryByDefault\":false,\"fieldType\":\"URN\"}inputDatasets:array[com.linkedin.common.DatasetUrn]/**Output datasets produced by the data job during processing*/@Relationship.`/*`={\"name\":\"Produces\",\"entityTypes\":[\"dataset\"]}@Searchable.`/*`={\"fieldName\":\"outputs\",\"numValuesFieldName\":\"numOutputDatasets\",\"queryByDefault\":false,\"fieldType\":\"URN\"}outputDatasets:array[com.linkedin.common.DatasetUrn]/**Input datajobs that this data job depends on*/@Relationship.`/*`={\"name\":\"DownstreamOf\",\"entityTypes\":[\"dataJob\"]}inputDatajobs:optional array[{namespace com.linkedin.common/**Standardized data processing job identifier.*/@java.class=\"com.linkedin.common.urn.DataJobUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataJob\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataJob\",\"doc\":\"Standardized data processing job identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"flow\",\"doc\":\"Standardized data processing flow urn representing the flow for the job\",\"type\":\"com.linkedin.common.urn.DataFlowUrn\"},{\"name\":\"jobID\",\"doc\":\"Unique identifier of the data job\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":594}typeref DataJobUrn=string}]}}{namespace com.linkedin.dataset/**Dataset deprecation status*/@Aspect.name=\"datasetDeprecation\"record DatasetDeprecation{/**Whether the dataset is deprecated by owner.*/@Searchable={\"weightsPerFieldValue\":{\"true\":0.5},\"fieldType\":\"BOOLEAN\"}deprecated:boolean/**The time user plan to decommission this dataset.*/decommissionTime:optional long/**Additional information about the dataset deprecation plan, such as the wiki, doc, RB.*/note:string/**The corpuser URN which will be credited for modifying this deprecation content.*/actor:optional com.linkedin.common.Urn}}{namespace com.linkedin.dataset/**Properties associated with a Dataset*/@Aspect.name=\"datasetProperties\"record DatasetProperties includes com.linkedin.common.CustomProperties,com.linkedin.common.ExternalReference{/**Documentation of the dataset*/@Searchable={\"hasValuesFieldName\":\"hasDescription\",\"fieldType\":\"TEXT\"}description:optional string/**The abstracted URI such as hdfs:///data/tracking/PageViewEvent, file:///dir/file_name. Uri should not include any environment specific properties. Some datasets might not have a standardized uri, which makes this field optional (i.e. kafka topic).*/uri:optional{namespace com.linkedin.common@java.class=\"java.net.URI\"typeref Uri=string}/**[Legacy] Unstructured tags for the dataset. Structured tags can be applied via the `GlobalTags` aspect.*/tags:array[string]=[]}}{namespace com.linkedin.dataset/**Upstream lineage of a dataset*/@Aspect.name=\"upstreamLineage\"record UpstreamLineage{/**List of upstream dataset lineage information*/upstreams:array[/**Upstream lineage information about a dataset including the source reporting the lineage*/record Upstream{/**Audit stamp containing who reported the lineage and when.\nWARNING: this field is deprecated and may be removed in a future release.*/@deprecated=\"we no longer associate a timestamp per upstream edge\"auditStamp:com.linkedin.common.AuditStamp={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**The upstream dataset the lineage points to*/@Relationship={\"name\":\"DownstreamOf\",\"entityTypes\":[\"dataset\"]}@Searchable={\"fieldName\":\"upstreams\",\"queryByDefault\":false,\"fieldType\":\"URN\"}dataset:com.linkedin.common.DatasetUrn/**The type of the lineage*/type:/**The various types of supported dataset lineage*/enum DatasetLineageType{/**Direct copy without modification*/COPY/**Transformed data with modification (format or content change)*/TRANSFORMED/**Represents a view defined on the sources e.g. Hive view defined on underlying hive tables or a Hive table pointing to a HDFS dataset or DALI view defined on multiple sources*/VIEW}}]}}{namespace com.linkedin.schema/**SchemaMetadata to describe metadata related to store schema*/@Aspect.name=\"schemaMetadata\"record SchemaMetadata includes/**Key to retrieve schema metadata.*/record SchemaMetadataKey{/**Schema name e.g. PageViewEvent, identity.Profile, ams.account_management_tracking*/@validate.strlen={\"min\":1,\"max\":500}schemaName:string/**Standardized platform urn where schema is defined. The data platform Urn (urn:li:platform:{platform_name})*/platform:{namespace com.linkedin.common/**Standardized data platforms available*/@java.class=\"com.linkedin.common.urn.DataPlatformUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:wherehows\",\"entityType\":\"dataPlatform\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataPlatform\",\"doc\":\"Standardized data platforms available\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platformName\",\"doc\":\"data platform name i.e. hdfs, oracle, espresso\",\"type\":\"string\",\"maxLength\":25}],\"maxLength\":45}typeref DataPlatformUrn=string}/**Every change to SchemaMetadata in the resource results in a new version. Version is server assigned. This version is differ from platform native schema version.*/version:long}com.linkedin.common.ChangeAuditStamps{/**Dataset this schema metadata is associated with.*/dataset:optional com.linkedin.common.DatasetUrn/**The cluster this schema metadata resides from*/cluster:optional string/**the SHA1 hash of the schema content*/hash:string/**The native schema in the dataset's platform.*/platformSchema:union[/**Schema text of an espresso table schema.*/record EspressoSchema{/**The native espresso document schema.*/documentSchema:string/**The espresso table schema definition.*/tableSchema:string}/**Schema holder for oracle data definition language that describes an oracle table.*/record OracleDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}/**Schema holder for MySql data definition language that describes an MySql table.*/record MySqlDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}/**Schema holder for presto data definition language that describes a presto view.*/record PrestoDDL{/**The raw schema in the dataset's platform. This includes the DDL and the columns extracted from DDL.*/rawSchema:string}/**Schema holder for kafka schema.*/record KafkaSchema{/**The native kafka document schema. This is a human readable avro document schema.*/documentSchema:string/**The native kafka key schema as retrieved from Schema Registry*/keySchema:optional string}/**Schema text of binary JSON schema.*/record BinaryJsonSchema{/**The native schema text for binary JSON file format.*/schema:string}/**Schema text of an ORC schema.*/record OrcSchema{/**The native schema for ORC file format.*/schema:string}/**The dataset has no specific schema associated with it*/record Schemaless{}/**Schema text of a key-value store schema.*/record KeyValueSchema{/**The raw schema for the key in the key-value store.*/keySchema:string/**The raw schema for the value in the key-value store.*/valueSchema:string}/**Schema holder for undefined schema types.*/record OtherSchema{/**The native schema in the dataset's platform.*/rawSchema:string}]/**Client provided a list of fields from document schema.*/fields:array[/**SchemaField to describe metadata related to dataset schema. Schema normalization rules: http://go/tms-schema*/record SchemaField{/**Flattened name of the field. Field is computed from jsonPath field. For data translation rules refer to wiki page above.*/@Searchable={\"fieldName\":\"fieldPaths\",\"fieldType\":\"TEXT_PARTIAL\"}fieldPath:{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}/**Flattened name of a field in JSON Path notation.*/jsonPath:optional string/**Indicates if this field is optional or nullable*/nullable:boolean=false/**Description*/@Searchable={\"fieldName\":\"fieldDescriptions\",\"boostScore\":0.1,\"fieldType\":\"TEXT\"}description:optional string/**Platform independent field type of the field.*/type:/**Schema field data types*/record SchemaFieldDataType{/**Data platform specific types*/type:union[/**Boolean field type.*/record BooleanType{}/**Fixed field type.*/record FixedType{}/**String field type.*/record StringType{}/**Bytes field type.*/record BytesType{}/**Number data type: long, integer, short, etc..*/record NumberType{}/**Date field type.*/record DateType{}/**Time field type. This should also be used for datetimes.*/record TimeType{}/**Enum field type.*/record EnumType{}/**Null field type.*/record NullType{}/**Map field type.*/record MapType{/**Key type in a map*/keyType:optional string/**Type of the value in a map*/valueType:optional string}/**Array field type.*/record ArrayType{/**List of types this array holds.*/nestedType:optional array[string]}/**Union field type.*/record UnionType{/**List of types in union type.*/nestedTypes:optional array[string]}/**Record field type.*/record RecordType{}]}/**The native type of the field in the dataset's platform as declared by platform schema.*/nativeDataType:string/**There are use cases when a field in type B references type A. A field in A references field of type B. In such cases, we will mark the first field as recursive.*/recursive:boolean=false/**Tags associated with the field*/@Searchable.`/tags/*/tag`={\"fieldName\":\"fieldTags\",\"boostScore\":0.5,\"fieldType\":\"URN_PARTIAL\"}globalTags:optional{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}}/**Glossary terms associated with the field*/@Searchable.`/terms/*/urn`={\"fieldName\":\"fieldGlossaryTerms\",\"boostScore\":0.5,\"fieldType\":\"URN_PARTIAL\"}glossaryTerms:optional{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Searchable={\"fieldName\":\"glossaryTerms\",\"filterNameOverride\":\"Glossary Term\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryTerm\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryTerm\",\"doc\":\"business term\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business term with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryTermUrn=string}]/**Audit stamp containing who reported the related business term*/auditStamp:AuditStamp}}/**For schema fields that are part of complex keys, set this field to true\nWe do this to easily distinguish between value and key fields*/isPartOfKey:boolean=false}]/**Client provided list of fields that define primary keys to access record. Field order defines hierarchical espresso keys. Empty lists indicates absence of primary key access patter. Value is a SchemaField@fieldPath.*/primaryKeys:optional array[com.linkedin.dataset.SchemaFieldPath]/**Map captures all the references schema makes to external datasets. Map key is ForeignKeySpecName typeref.*/@deprecated=\"Use foreignKeys instead.\"foreignKeysSpecs:optional map[string/**Description of a foreign key in a schema.*/record ForeignKeySpec{/**Foreign key definition in metadata schema.*/foreignKey:union[/**For non-urn based foregin keys.*/record DatasetFieldForeignKey{/**dataset that stores the resource.*/parentDataset:com.linkedin.common.DatasetUrn/**List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.*/currentFieldPaths:array[com.linkedin.dataset.SchemaFieldPath]/**SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.*/parentField:com.linkedin.dataset.SchemaFieldPath}/**If SchemaMetadata fields make any external references and references are of type com.linkedin.common.Urn or any children, this models can be used to mark it.*/record UrnForeignKey{/**Field in hosting(current) SchemaMetadata.*/currentFieldPath:com.linkedin.dataset.SchemaFieldPath}]}]/**List of foreign key constraints for the schema*/foreignKeys:optional array[/**Description of a foreign key constraint in a schema.*/record ForeignKeyConstraint{/**Name of the constraint, likely provided from the source*/name:string/**Fields the constraint maps to on the foreign dataset*/@Relationship.`/*`={\"name\":\"ForeignKeyTo\",\"entityTypes\":[\"schemaField\"]}foreignFields:array[com.linkedin.common.Urn]/**Fields the constraint maps to on the source dataset*/sourceFields:array[com.linkedin.comm").append("on.Urn]/**Reference to the foreign dataset for ease of lookup*/@Relationship={\"name\":\"ForeignKeyToDataset\",\"entityTypes\":[\"dataset\"]}foreignDataset:com.linkedin.common.Urn}]}}{namespace com.linkedin.schema/**EditableSchemaMetadata stores editable changes made to schema metadata. This separates changes made from\ningestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines.*/@Aspect.name=\"editableSchemaMetadata\"record EditableSchemaMetadata includes com.linkedin.common.ChangeAuditStamps{/**Client provided a list of fields from document schema.*/editableSchemaFieldInfo:array[/**SchemaField to describe metadata related to dataset schema.*/record EditableSchemaFieldInfo{/**FieldPath uniquely identifying the SchemaField this metadata is associated with*/fieldPath:string/**Description*/@Searchable={\"fieldName\":\"editedFieldDescriptions\",\"boostScore\":0.1,\"fieldType\":\"TEXT\"}description:optional string/**Tags associated with the field*/@Searchable.`/tags/*/tag`={\"fieldName\":\"editedFieldTags\",\"boostScore\":0.5,\"fieldType\":\"URN_PARTIAL\"}globalTags:optional com.linkedin.common.GlobalTags/**Glossary terms associated with the field*/@Searchable.`/terms/*/urn`={\"fieldName\":\"editedFieldGlossaryTerms\",\"boostScore\":0.5,\"fieldType\":\"URN_PARTIAL\"}glossaryTerms:optional com.linkedin.common.GlossaryTerms}]}}{namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:Url/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:AuditStamp}]}}{namespace com.linkedin.glossary/**Properties associated with a GlossaryNode*/@Aspect.name=\"glossaryNodeInfo\"record GlossaryNodeInfo{/**Definition of business node*/@Searchable={}definition:string/**Parent node of the glossary term*/parentNode:optional{namespace com.linkedin.common/**Business Node*/@java.class=\"com.linkedin.common.urn.GlossaryNodeUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryNode\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryNode\",\"doc\":\"Standardized business node identifier\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business node with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryNodeUrn=string}}}{namespace com.linkedin.metadata.key/**Key for a GlossaryNode*/@Aspect.name=\"glossaryNodeKey\"record GlossaryNodeKey{@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}name:string}}{namespace com.linkedin.glossary/**Properties associated with a GlossaryTerm*/@Aspect.name=\"glossaryTermInfo\"record GlossaryTermInfo{/**Definition of business term*/@Searchable={}definition:string/**Parent node of the glossary term*/parentNode:optional com.linkedin.common.GlossaryNodeUrn/**Source of the Business Term (INTERNAL or EXTERNAL) with default value as INTERNAL*/@Searchable.fieldType=\"KEYWORD\"termSource:string/**External Reference to the business-term*/@Searchable.fieldType=\"KEYWORD\"sourceRef:optional string/**The abstracted URL such as https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/CashInstrument.*/sourceUrl:optional com.linkedin.common.Url/**A key-value map to capture any other non-standardized properties for the glossary term*/customProperties:map[string,string]={}/**Schema definition of the glossary term*/rawSchema:optional string}}{namespace com.linkedin.metadata.key/**Key for a GlossaryTerm*/@Aspect.name=\"glossaryTermKey\"record GlossaryTermKey{@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}name:string}}{namespace com.linkedin.metadata.key/**Key for an MLFeature*/@Aspect.name=\"mlFeatureKey\"record MLFeatureKey{/**Namespace for the feature*/@Searchable.fieldType=\"TEXT_PARTIAL\"featureNamespace:string/**Name of the feature*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":8.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string}}{namespace com.linkedin.ml.metadata/**Properties associated with a MLFeature*/@Aspect.name=\"mlFeatureProperties\"record MLFeatureProperties{/**Documentation of the MLFeature*/description:optional string/**Data Type of the MLFeature*/dataType:optional{namespace com.linkedin.common/**MLFeature Data Type*/enum MLFeatureDataType{/**Useless data is unique, discrete data with no potential relationship with the outcome variable.\nA useless feature has high cardinality. An example would be bank account numbers that were generated randomly.*/USELESS/**Nominal data is made of discrete values with no numerical relationship between the different categories \u2014 mean and median are meaningless.\nAnimal species is one example. For example, pig is not higher than bird and lower than fish.*/NOMINAL/**Ordinal data are discrete integers that can be ranked or sorted.\nFor example, the distance between first and second may not be the same as the distance between second and third.*/ORDINAL/**Binary data is discrete data that can be in only one of two categories \u2014 either yes or no, 1 or 0, off or on, etc*/BINARY/**Count data is discrete whole number data \u2014 no negative numbers here.\nCount data often has many small values, such as zero and one.*/COUNT/**Time data is a cyclical, repeating continuous form of data.\nThe relevant time features can be any period\u2014 daily, weekly, monthly, annual, etc.*/TIME/**Interval data has equal spaces between the numbers and does not represent a temporal pattern.\nExamples include percentages, temperatures, and income.*/INTERVAL/**Image Data*/IMAGE/**Video Data*/VIDEO/**Audio Data*/AUDIO/**Text Data*/TEXT/**Mapping Data Type ex: dict, map*/MAP/**Sequence Data Type ex: list, tuple, range*/SEQUENCE/**Set Data Type ex: set, frozenset*/SET/**Continuous data are made of uncountable values, often the result of a measurement such as height, weight, age etc.*/CONTINUOUS/**Bytes data are binary-encoded values that can represent complex objects.*/BYTE/**Unknown data are data that we don't know the type for.*/UNKNOWN}}/**Version of the MLFeature*/version:optional{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string}}/**Source of the MLFeature*/@Relationship.`/*`={\"name\":\"DerivedFrom\",\"entityTypes\":[\"dataset\"]}sources:optional array[com.linkedin.common.Urn]}}{namespace com.linkedin.metadata.key/**Key for an ML model*/@Aspect.name=\"mlModelKey\"record MLModelKey{/**Standardized platform urn for the model*/platform:com.linkedin.common.Urn/**Name of the MLModel*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":10.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string/**Fabric type where model belongs to or where it was generated*/@Searchable={\"filterNameOverride\":\"Environment\",\"queryByDefault\":false,\"addToFilters\":true,\"fieldType\":\"TEXT_PARTIAL\"}origin:{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}}}{namespace com.linkedin.ml.metadata/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/@Aspect.name=\"mlModelCaveatsAndRecommendations\"record CaveatsAndRecommendations{/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset?*/caveats:optional/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/record CaveatDetails{/**Did the results suggest any further testing?*/needsFurtherTesting:optional boolean/**Caveat Description\nFor ex: Given gender classes are binary (male/not male), which we include as male/female. Further work needed to evaluate across a spectrum of genders.*/caveatDescription:optional string/**Relevant groups that were not represented in the evaluation dataset?*/groupsNotRepresented:optional array[string]}/**Recommendations on where this MLModel should be used.*/recommendations:optional string/**Ideal characteristics of an evaluation dataset for this MLModel*/idealDatasetCharacteristics:optional array[string]}}{namespace com.linkedin.ml.metadata/**This section is intended to demonstrate the ethical considerations that went into MLModel development, surfacing ethical challenges and solutions to stakeholders.*/@Aspect.name=\"mlModelEthicalConsiderations\"record EthicalConsiderations{/**Does the MLModel use any sensitive data (e.g., protected classes)?*/data:optional array[string]/** Is the MLModel intended to inform decisions about matters central to human life or flourishing \u2013 e.g., health or safety? Or could it be used in such a way?*/humanLife:optional array[string]/**What risk mitigation strategies were used during MLModel development?*/mitigations:optional array[string]/**What risks may be present in MLModel usage? Try to identify the potential recipients, likelihood, and magnitude of harms. If these cannot be determined, note that they were considered but remain unknown.*/risksAndHarms:optional array[string]/**Are there any known MLModel use cases that are especially fraught? This may connect directly to the intended use section*/useCases:optional array[string]}}{namespace com.linkedin.ml.metadata/**All referenced datasets would ideally point to any set of documents that provide visibility into the source and composition of the dataset.*/@Aspect.name=\"mlModelEvaluationData\"record EvaluationData{/**Details on the dataset(s) used for the quantitative analyses in the MLModel*/evaluationData:array[/**BaseData record*/record BaseData{/**What dataset were used in the MLModel?*/dataset:com.linkedin.common.DatasetUrn/**Why was this dataset chosen?*/motivation:optional string/**How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?*/preProcessing:optional array[string]}]}}{namespace com.linkedin.ml.metadata/**Intended Use for the ML Model*/@Aspect.name=\"intendedUse\"record IntendedUse{/**Primary Use cases for the MLModel.*/primaryUses:optional array[string]/**Primary Intended Users - For example, was the MLModel developed for entertainment purposes, for hobbyists, or enterprise solutions?*/primaryUsers:optional array[enum IntendedUserType{ENTERPRISE,HOBBY,ENTERTAINMENT}]/**Highlight technology that the MLModel might easily be confused with, or related contexts that users could try to apply the MLModel to.*/outOfScopeUses:optional array[string]}}{namespace com.linkedin.ml.metadata/**Metrics to be featured for the MLModel.*/@Aspect.name=\"mlModelMetrics\"record Metrics{/**Measures of MLModel performance*/performanceMeasures:optional array[string]/**Decision Thresholds used (if any)?*/decisionThreshold:optional array[string]}}{namespace com.linkedin.ml.metadata/**Prompts which affect the performance of the MLModel*/@Aspect.name=\"mlModelFactorPrompts\"record MLModelFactorPrompts{/**What are foreseeable salient factors for which MLModel performance may vary, and how were these determined?*/relevantFactors:optional array[/**Factors affecting the performance of the MLModel.*/record MLModelFactors{/**Groups refers to distinct categories with similar characteristics that are present in the evaluation data instances.\nFor human-centric machine learning MLModels, groups are people who share one or multiple characteristics.*/groups:optional array[string]/**The performance of a MLModel can vary depending on what instruments were used to capture the input to the MLModel.\nFor example, a face detection model may perform differently depending on the camera\u2019s hardware and software,\nincluding lens, image stabilization, high dynamic range techniques, and background blurring for portrait mode.*/instrumentation:optional array[string]/**A further factor affecting MLModel performance is the environment in which it is deployed.*/environment:optional array[string]}]/**Which factors are being reported, and why were these chosen?*/evaluationFactors:optional array[MLModelFactors]}}{namespace com.linkedin.ml.metadata/**Properties associated with a ML Model*/@Aspect.name=\"mlModelProperties\"record MLModelProperties includes com.linkedin.common.CustomProperties,com.linkedin.common.ExternalReference{/**Documentation of the MLModel*/@Searchable={\"hasValuesFieldName\":\"hasDescription\",\"fieldType\":\"TEXT\"}description:optional string/**Date when the MLModel was developed*/date:optional com.linkedin.common.Time/**Version of the MLModel*/version:optional com.linkedin.common.VersionTag/**Type of Algorithm or MLModel such as whether it is a Naive Bayes classifier, Convolutional Neural Network, etc*/@Searchable.fieldType=\"TEXT_PARTIAL\"type:optional string/**Hyper Parameters of the MLModel\n\nNOTE: these are deprecated in favor of hyperParams*/hyperParameters:optional map[string/**A union of all supported metadata aspects for HyperParameter Value*/typeref HyperParameterValueType=union[string,int,float,double,boolean]]/**Hyperparameters of the MLModel*/hyperParams:optional array[/**Properties associated with an ML Hyper Param*/@Aspect.name=\"mlHyperParam\"record MLHyperParam{/**Name of the MLHyperParam*/name:string/**Documentation of the MLHyperParam*/description:optional string/**The value of the MLHyperParam*/value:optional string/**Date when the MLHyperParam was developed*/createdAt:optional com.linkedin.common.Time}]/**Metrics of the MLModel used in training*/trainingMetrics:optional array[/**Properties associated with an ML Metric*/@Aspect.name=\"mlMetric\"record MLMetric{/**Name of the mlMetric*/name:string/**Documentation of the mlMetric*/description:optional string/**The value of the mlMetric*/value:optional string/**Date when the mlMetric was developed*/createdAt:optional com.linkedin.common.Time}]/**Metrics of the MLModel used in production*/onlineMetrics:optional array[MLMetric]/**List of features used for MLModel training*/mlFeatures:optional array[{namespace com.linkedin.common/**Standardized MLFeature identifier.*/@java.class=\"com.linkedin.common.urn.MLFeatureUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"mlFeature\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"MLFeature\",\"doc\":\"Standardized MLFeature identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"mlFeatureNamespace\",\"doc\":\"Namespace for the MLFeature\",\"type\":\"string\"},{\"name\":\"mlFeatureName\",\"doc\":\"Name of the MLFeature\",\"type\":\"string\",\"maxLength\":210}],\"maxLength\":284}typeref MLFeatureUrn=string}]/**Tags for the MLModel*/tags:array[string]=[]/**Deployments for the MLModel*/@Relationship.`/*`={\"name\":\"DeployedTo\",\"entityTypes\":[\"mlModelDeployment\"]}deployments:optional array[com.linkedin.common.Urn]/**List of jobs (if any) used to train the model*/@Relationship.`/*`={\"name\":\"TrainedBy\",\"entityTypes\":[\"dataJob\"]}trainingJobs:optional array[com.linkedin.common.Urn]/**List of jobs (if any) that use the model*/@Relationship.`/*`={\"name\":\"UsedBy\",\"entityTypes\":[\"dataJob\"]}downstreamJobs:optional array[com.linkedin.common.Urn]/**Groups the model belongs to*/@Relationship.`/*`={\"name\":\"MemberOf\",\"entityTypes\":[\"mlModelGroup\"]}groups:optional array[com.linkedin.common.Urn]}}{namespace com.linkedin.ml.metadata/**Quantitative analyses should be disaggregated, that is, broken down by the chosen factors. Quantitative analyses should provide the results of evaluating the MLModel according to the chosen metrics, providing confidence interval values when possible.*/@Aspect.name=\"mlModelQuantitativeAnalyses\"record QuantitativeAnalyses{/**Link to a dashboard with results showing how the MLModel performed with respect to each factor*/unitaryResults:optional/**A union of all supported metadata aspects for ResultsType*/typeref ResultsType=union[string]/**Link to a dashboard with results showing how the MLModel performed with respect to the intersection of evaluated factors?*/intersectionalResults:optional ResultsType}}{namespace com.linkedin.ml.metadata/**Ideally, the MLModel card would contain as much information about the training data as the evaluation data. However, there might be cases where it is not feasible to provide this level of detailed information about the training data. For example, the data may be proprietary, or require a non-disclosure agreement. In these cases, we advocate for basic details about the distributions over groups in the data, as well as any other details that could inform stakeholders on the kinds of biases the model may have encoded.*/@Aspect.name=\"mlModelTrainingData\"record TrainingData{/**Details on the dataset(s) used for training the MLModel*/trainingData:array[BaseData]}}{namespace com.linkedin.ml.metadata/**Source Code*/@Aspect.name=\"sourceCode\"record SourceCode{/**Source Code along with types*/sourceCode:array[/**Source Code Url Entity*/record SourceCodeUrl{/**Source Code Url Types*/type:enum SourceCodeUrlType{ML_MODEL_SOURCE_CODE,TRAINING_PIPELINE_SOURCE_CODE,EVALUATION_PIPELINE_SOURCE_CODE}/**Source Code Url*/sourceCodeUrl:com.linkedin.common.Url}]}}{namespace com.linkedin.metadata.key/**Key for a Tag*/@Aspect.name=\"tagKey\"record TagKey{/**The unique tag name*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":10.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string}}{namespace com.linkedin.tag/**Properties associated with a Tag*/@Aspect.name=\"tagProperties\"record TagProperties{/**Name of the tag*/name:string/**Documentation of the tag*/description:optional string}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\",\"corpGroup\"]}@Searchable={\"fieldName\":\"owners\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"fieldType\":\"URN\"}owner:Urn/**The type of the ownership*/type:/**Owner category or owner role*/enum OwnershipType{/**A person or group that is in charge of developing the code*/DEVELOPER/**A person or group that is owning the data*/DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.*/DELEGATE/**A person, group, or service that produces/generates the data*/PRODUCER/**A person, group, or service that consumes the data*/CONSUMER/**A person or a group that has direct business interest*/STAKEHOLDER}/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}}]/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:AuditStamp={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}}}{namespace com.linkedin.common/**The status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**whether the entity is removed or not*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}com.linkedin.common.GlobalTags{namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be backslash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"filterNameOverride\":\"Platform\",\"addToFilters\":true,\"fieldType\":\"URN\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/instance:optional string}}]").toString(), SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

    }

}
