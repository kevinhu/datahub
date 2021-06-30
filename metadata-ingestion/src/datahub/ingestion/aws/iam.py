import boto3
import json


def init_lambda_role(iam_client: boto3.client, role_name: str):

    policy_doc = {
        "Statement": [
            {
                "Effect": "Allow",
                "Action": "sts:AssumeRole",
                "Principal": {"Service": "lambda.amazonaws.com"},
            }
        ],
    }

    try:
        iam_client.create_role(
            RoleName=role_name,
            AssumeRolePolicyDocument=json.dumps(policy_doc),
            Description="Role for Lambda-based DataHub ingestion targets",
        )
    except iam_client.exceptions.EntityAlreadyExistsException:
        print("Warning: already exists.")

    iam_client.attach_role_policy(
        RoleName=role_name,
        PolicyArn="arn:aws:iam::aws:policy/AWSLambda_FullAccess",
    )
    iam_client.attach_role_policy(
        RoleName=role_name,
        PolicyArn="arn:aws:iam::aws:policy/service-role/AWSLambdaBasicExecutionRole",
    )


def init_events_role(iam_client: boto3.client, role_name: str):

    policy_doc = {
        "Statement": [
            {
                "Effect": "Allow",
                "Action": "sts:AssumeRole",
                "Principal": {"Service": "events.amazonaws.com"},
            }
        ],
    }

    try:
        iam_client.create_role(
            RoleName=role_name,
            AssumeRolePolicyDocument=json.dumps(policy_doc),
            Description="Role for DataHub ingestion with EventBridge",
        )
    except iam_client.exceptions.EntityAlreadyExistsException:
        print("Warning: already exists.")

    iam_client.attach_role_policy(
        PolicyArn="arn:aws:iam::aws:policy/AmazonEventBridgeFullAccess",
        RoleName=role_name,
    )
