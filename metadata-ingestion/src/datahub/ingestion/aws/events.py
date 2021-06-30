import boto3
import json


def init_glue_events_rule(events_client: boto3.client, iam_client: boto3.client):
    """
    Create EventBridge rule for listening to Glue events.
    """
    role_arn = iam_client.get_role(RoleName="DataHubIngestionLambdas")["Role"]["Arn"]

    return events_client.put_rule(
        Name="datahub-glue-rule",
        EventPattern=json.dumps({"source": ["aws.glue"]}),
        State="ENABLED",
        Description="Rule for listening to all Glue events",
        RoleArn=role_arn,
    )


def init_sagemaker_events_rule(events_client: boto3.client, iam_client: boto3.client):
    """
    Create EventBridge rule for listening to SageMaker events.
    """
    role_arn = iam_client.get_role(RoleName="DataHubIngestionLambdas")["Role"]["Arn"]

    return events_client.put_rule(
        Name="datahub-sagemaker-rule",
        EventPattern=json.dumps({"source": ["aws.sagemaker"]}),
        State="ENABLED",
        Description="Rule for listening to all SageMaker events",
        RoleArn=role_arn,
    )
