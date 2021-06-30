import boto3
import json

GLUE_LAMBDA_IMAGE = "public.ecr.aws/t0j7w6p3/datahub-glue-lambda"
SAGEMAKER_LAMBDA_IMAGE = "public.ecr.aws/t0j7w6p3/datahub-sagemaker-lambda"

PYTHON_VERSION = "3.8"


def create_python_lambda_from_image(
    lambda_client: boto3.client,
    image_uri: str,
    function_name: str,
    function_description: str,
    function_handler: str,
    function_role: str,
):
    """
    Create a generic Python Lambda function given an ECR image.
    """

    try:
        lambda_client.delete_function(FunctionName=function_name)
    except lambda_client.exceptions.ResourceNotFoundException:
        print("Warning: doesn't exist")

    return lambda_client.create_function(
        Code={"ImageUri": image_uri},
        Description=function_description,
        FunctionName=function_name,
        Handler=function_handler,
        Publish=True,
        Role=function_role,
        Runtime=PYTHON_VERSION,
    )


def create_glue_lambda(lambda_client: boto3.client, iam_client: boto3.client):
    """
    Create Lambda function for handling Glue ingestion.
    """

    role_arn = iam_client.get_role(RoleName="DataHubIngestionLambdas")["Role"]["Arn"]

    return create_python_lambda_from_image(
        lambda_client,
        image_uri=GLUE_LAMBDA_IMAGE,
        function_name="glue-ingestion-lambda",
        function_description="Lambda for ingesting Glue metadata to DataHub",
        function_handler="handler.ingest",
        function_role=role_arn,
    )


def create_glue_lambda(lambda_client: boto3.client, iam_client: boto3.client):
    """
    Create Lambda function for handling SageMaker ingestion.
    """

    role_arn = iam_client.get_role(RoleName="DataHubIngestionLambdas")["Role"]["Arn"]

    return create_python_lambda_from_image(
        lambda_client,
        image_uri=GLUE_LAMBDA_IMAGE,
        function_name="glue-ingestion-lambda",
        function_description="Lambda for ingesting SageMaker metadata to DataHub",
        function_handler="handler.ingest",
        function_role=role_arn,
    )
