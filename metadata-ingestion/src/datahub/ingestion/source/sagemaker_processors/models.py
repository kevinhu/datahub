from dataclasses import dataclass
from dataclasses import field as dataclass_field
from typing import Any, Dict, Iterable, List, Tuple

import datahub.emitter.mce_builder as builder
from datahub.ingestion.api.source import Source, SourceReport
from datahub.ingestion.api.workunit import MetadataWorkUnit
from datahub.metadata.com.linkedin.pegasus2avro.common import MLFeatureDataType
from datahub.metadata.com.linkedin.pegasus2avro.metadata.snapshot import MLModelSnapshot
from datahub.metadata.com.linkedin.pegasus2avro.mxe import MetadataChangeEvent
from datahub.metadata.schema_classes import MLModelPropertiesClass


@dataclass
class ModelProcessor:
    sagemaker_client: Any
    env: str
    report: SourceReport

    def get_all_models(self) -> List[Dict[str, Any]]:
        """
        List all models in SageMaker.
        """

        models = []

        # see https://boto3.amazonaws.com/v1/documentation/api/latest/reference/services/sagemaker.html#SageMaker.Client.list_models
        paginator = self.sagemaker_client.get_paginator("list_models")
        for page in paginator.paginate():
            models += page["Models"]

        return models

    def get_model_details(self, model_name: str) -> Dict[str, Any]:
        """
        Get details of a model.
        """

        # see https://boto3.amazonaws.com/v1/documentation/api/latest/reference/services/sagemaker.html#SageMaker.Client.describe_model
        return self.sagemaker_client.describe_model(ModelName=model_name)

    def get_model_wu(self, model_details: Dict[str, Any]) -> MetadataWorkUnit:

        feature_snapshot = MLModelSnapshot(
            urn=builder.make_ml_model_urn(
                "sagemaker",
                model_details["ModelName"],
            ),
            aspects=[MLModelPropertiesClass()],
        )

        # make the MCE and workunit
        mce = MetadataChangeEvent(proposedSnapshot=feature_snapshot)

        return MetadataWorkUnit(
            id=f'{model_details["ModelName"]}',
            mce=mce,
        )

    def get_workunits(self) -> Iterable[MetadataWorkUnit]:

        models = self.get_all_models()

        for model in models:

            model_details = self.get_model_details(model["ModelName"])

            wu = self.get_model_wu(model_details)
            self.report.report_workunit(wu)
            yield wu
