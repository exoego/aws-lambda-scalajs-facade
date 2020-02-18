package net.exoego.facade

import scala.scalajs.js
import scala.scalajs.js.|

package object aws_lambda {
  // common
  type Headers = js.Dictionary[String]
  type HeadersBDS = js.Dictionary[Boolean | Double | String]
  type MultiValueHeaders = js.Dictionary[js.Array[String]]
  type MultiValueHeadersBDS = js.Dictionary[js.Array[Boolean | Double | String]]
  type Callback[TResult] =
    js.Function2[js.UndefOr[js.Error | String], TResult, Unit]

  // alb
  type ALBHandler = Handler[ALBEvent, ALBResult]
  type AsyncALBHandler = AsyncHandler[ALBEvent, ALBResult]

  // cloudwatch-events
  type ScheduledHandler = Handler[ScheduledEvent, Unit]
  type AsyncScheduledHandler = AsyncHandler[ScheduledEvent, Unit]

  // cloudwatch-logs
  type CloudWatchLogsHandler = Handler[CloudWatchLogsEvent, Unit]
  type AsyncCloudWatchLogsHandler = AsyncHandler[CloudWatchLogsEvent, Unit]

  // apigateway-authorizer
  type AuthResponse = CustomAuthorizerResult
  type CustomAuthorizerHandler =
    Handler[CustomAuthorizerEvent, CustomAuthorizerResult]
  type AsyncCustomAuthorizerHandler =
    AsyncHandler[CustomAuthorizerEvent, CustomAuthorizerResult]
  type Condition = js.Dictionary[String | js.Array[String]]
  type ConditionBlock = js.Dictionary[Condition | js.Array[Condition]]
  type Statement =
    BaseStatement with StatementAction with StatementResource | StatementPrincipal
  type StatementAction = js.Any
  type StatementPrincipal = MaybeStatementResource
  type StatementResource = MaybeStatementPrincipal
  type PrincipalValue =
    js.Dictionary[String | js.Array[String]] | String | js.Array[String]

  // authorizer-proxy
  @deprecated("Old name. Use APIGatewayProxyHandler", "0.5.0")
  type ProxyHandler = APIGatewayProxyHandler
  @deprecated("Old name. Use APIGatewayProxyResult", "0.5.0")
  type ProxyResult = APIGatewayProxyResult
  @deprecated("Old name. Use APIGatewayProxyEvent", "0.5.0")
  type APIGatewayEvent = APIGatewayProxyEvent
  type APIGatewayProxyHandler =
    Handler[APIGatewayProxyEvent, APIGatewayProxyResult]
  type AsyncAPIGatewayProxyHandler =
    AsyncHandler[APIGatewayProxyEvent, APIGatewayProxyResult]

  // dynamodb-stream
  type AttributeValue = facade.amazonaws.services.dynamodb.AttributeValue
  type DynamoDBStreamHandler = Handler[DynamoDBStreamEvent, Unit]
  type AsyncDynamoDBStreamHandler = AsyncHandler[DynamoDBStreamEvent, Unit]

  // cloudformation-customresource
  type CloudFormationCustomResourceEvent =
    CloudFormationCustomResourceCreateEvent | CloudFormationCustomResourceUpdateEvent | CloudFormationCustomResourceDeleteEvent
  type CloudFormationCustomResourceHandler =
    Handler[CloudFormationCustomResourceEvent, Unit]
  type AsyncCloudFormationCustomResourceHandler =
    AsyncHandler[CloudFormationCustomResourceEvent, Unit]
  type CloudFormationCustomResourceResponse =
    CloudFormationCustomResourceSuccessResponse | CloudFormationCustomResourceFailedResponse

  // cloudfront-common
  type CloudFrontHeaders = js.Dictionary[js.Array[CloudFrontHeadersItem]]

  // cloudfront-request
  type CloudFrontRequestHandler =
    Handler[CloudFrontRequestEvent, CloudFrontRequestResult]
  type AsyncCloudFrontRequestHandler =
    AsyncHandler[CloudFrontRequestEvent, CloudFrontRequestResult]
  type CloudFrontRequestResult =
    js.UndefOr[CloudFrontResultResponse | CloudFrontRequest]

  // cloudfront-response
  type CloudFrontResponseHandler =
    Handler[CloudFrontResponseEvent, CloudFrontResponseResult]
  type AsyncCloudFrontResponseHandler =
    AsyncHandler[CloudFrontResponseEvent, CloudFrontResponseResult]
  type CloudFrontResponseResult = js.UndefOr[CloudFrontResultResponse]

  // codepipeline
  type CodePipelineHandler = Handler[CodePipelineEvent, Unit]
  type AsyncCodePipelineHandler = AsyncHandler[CodePipelineEvent, Unit]
  type ArtifactLocation = S3ArtifactStore

  // codepipeline-cloudwatch
  type CodePipelineCloudWatchEvent =
    CodePipelineCloudWatchPipelineEvent | CodePipelineCloudWatchStageEvent | CodePipelineCloudWatchActionEvent
  type CodePipelineCloudWatchHandler =
    Handler[CodePipelineCloudWatchEvent, Unit]
  type AsyncCodePipelineCloudWatchHandler =
    AsyncHandler[CodePipelineCloudWatchEvent, Unit]

  // codepipeline-cloudwatch-action
  type CodePipelineCloudWatchActionHandler =
    Handler[CodePipelineCloudWatchActionEvent, Unit]
  type AsyncCodePipelineCloudWatchActionHandler =
    AsyncHandler[CodePipelineCloudWatchActionEvent, Unit]
  type CodePipelineActionCategory = String
  type CodePipelineActionState = String

  // codepipeline-cloudwatch-pipeline
  type CodePipelineState = String
  type CodePipelineCloudWatchPipelineHandler =
    Handler[CodePipelineCloudWatchPipelineEvent, Unit]
  type AsyncCodePipelineCloudWatchPipelineHandler =
    AsyncHandler[CodePipelineCloudWatchPipelineEvent, Unit]

  // codepipeline-cloudwatch-stage
  type CodePipelineStageState = String
  type CodePipelineCloudWatchStageHandler =
    Handler[CodePipelineCloudWatchStageEvent, Unit]
  type AsyncCodePipelineCloudWatchStageHandler =
    AsyncHandler[CodePipelineCloudWatchStageEvent, Unit]

  // cognitouserpool
  type CognitoUserPoolEvent = CognitoUserPoolTriggerEvent
  type CognitoUserPoolTriggerHandler =
    Handler[CognitoUserPoolTriggerEvent, js.Any]
  type AsyncCognitoUserPoolTriggerHandler =
    AsyncHandler[CognitoUserPoolTriggerEvent, js.Any]

  // kinesis-firehose-transformation
  type FirehoseTransformationHandler =
    Handler[FirehoseTransformationEvent, FirehoseTransformationResult]
  type AsyncFirehoseTransformationHandler =
    AsyncHandler[FirehoseTransformationEvent, FirehoseTransformationResult]
  type FirehoseRecordTransformationStatus = String

  // kinesis-stream
  type KinesisStreamHandler = Handler[KinesisStreamEvent, Unit]
  type AsyncKinesisStreamHandler = AsyncHandler[KinesisStreamEvent, Unit]

  // lex
  type LexDialogAction =
    LexDialogActionClose | LexDialogActionElicitIntent | LexDialogActionElicitSlot | LexDialogActionConfirmIntent | LexDialogActionDelegate
  type LexHandler = Handler[LexEvent, LexResult]
  type AsyncLexHandler = AsyncHandler[LexEvent, LexResult]

  // s3
  @deprecated("Old name. Use s3.S3Event.", "0.5.0")
  type S3CreateEvent = S3Event
  type S3Handler = Handler[S3Event, Unit]
  type AsyncS3Handler = AsyncHandler[S3Event, Unit]

  // s3-batch
  type S3BatchHandler = Handler[S3BatchEvent, S3BatchResult]
  type AsyncS3BatchHandler = AsyncHandler[S3BatchEvent, S3BatchResult]
  type S3BatchResultResultCode = String

  // sns
  type SNSHandler = Handler[SNSEvent, Unit]
  type AsyncSNSHandler = AsyncHandler[SNSEvent, Unit]
  type SNSMessageAttributes = js.Dictionary[SNSMessageAttribute]

  // sqs
  type SQSHandler = Handler[SQSEvent, Unit]
  type AsyncSQSHandler = AsyncHandler[SQSEvent, Unit]
  type SQSMessageAttributeDataType = String
  type SQSMessageAttributes = js.Dictionary[SQSMessageAttribute]
}
