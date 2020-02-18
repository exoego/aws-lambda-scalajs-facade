package net.exoego.facade

import scala.scalajs.js
import scala.scalajs.js.|

package object aws_lambda {
  type ALBHandler = Handler[ALBEvent, ALBResult]
  type AsyncALBHandler = AsyncHandler[ALBEvent, ALBResult]
  type APIGatewayEvent = APIGatewayProxyEvent
  type APIGatewayProxyHandler =
    Handler[APIGatewayProxyEvent, APIGatewayProxyResult]
  type AsyncAPIGatewayProxyHandler =
    AsyncHandler[APIGatewayProxyEvent, APIGatewayProxyResult]
  type ArtifactLocation = S3ArtifactStore
  type AttributeValue = facade.amazonaws.services.dynamodb.AttributeValue
  type AuthResponse = CustomAuthorizerResult
  type Callback[TResult] =
    js.Function2[js.UndefOr[js.Error | String], TResult, Unit]
  type CloudFormationCustomResourceEvent =
    CloudFormationCustomResourceCreateEvent | CloudFormationCustomResourceUpdateEvent | CloudFormationCustomResourceDeleteEvent
  type CloudFormationCustomResourceHandler =
    Handler[CloudFormationCustomResourceEvent, Unit]
  type AsyncCloudFormationCustomResourceHandler =
    AsyncHandler[CloudFormationCustomResourceEvent, Unit]
  type CloudFormationCustomResourceResponse =
    CloudFormationCustomResourceSuccessResponse | CloudFormationCustomResourceFailedResponse
  type CloudFrontHeaders = js.Dictionary[js.Array[CloudFrontHeadersItem]]
  type CloudFrontRequestHandler =
    Handler[CloudFrontRequestEvent, CloudFrontRequestResult]
  type AsyncCloudFrontRequestHandler =
    AsyncHandler[CloudFrontRequestEvent, CloudFrontRequestResult]
  type CloudFrontRequestResult =
    js.UndefOr[CloudFrontResultResponse | CloudFrontRequest]
  type CloudFrontResponseHandler =
    Handler[CloudFrontResponseEvent, CloudFrontResponseResult]
  type AsyncCloudFrontResponseHandler =
    AsyncHandler[CloudFrontResponseEvent, CloudFrontResponseResult]
  type CloudFrontResponseResult = js.UndefOr[CloudFrontResultResponse]
  type CloudWatchLogsHandler = Handler[CloudWatchLogsEvent, Unit]
  type AsyncCloudWatchLogsHandler = AsyncHandler[CloudWatchLogsEvent, Unit]
  type CodePipelineActionCategory = String
  type CodePipelineActionState = String
  type CodePipelineCloudWatchActionHandler =
    Handler[CodePipelineCloudWatchActionEvent, Unit]
  type AsyncCodePipelineCloudWatchActionHandler =
    AsyncHandler[CodePipelineCloudWatchActionEvent, Unit]
  type CodePipelineCloudWatchEvent =
    CodePipelineCloudWatchPipelineEvent | CodePipelineCloudWatchStageEvent | CodePipelineCloudWatchActionEvent
  type CodePipelineCloudWatchHandler =
    Handler[CodePipelineCloudWatchEvent, Unit]
  type AsyncCodePipelineCloudWatchHandler =
    AsyncHandler[CodePipelineCloudWatchEvent, Unit]
  type CodePipelineCloudWatchPipelineHandler =
    Handler[CodePipelineCloudWatchPipelineEvent, Unit]
  type AsyncCodePipelineCloudWatchPipelineHandler =
    AsyncHandler[CodePipelineCloudWatchPipelineEvent, Unit]
  type CodePipelineCloudWatchStageHandler =
    Handler[CodePipelineCloudWatchStageEvent, Unit]
  type AsyncCodePipelineCloudWatchStageHandler =
    AsyncHandler[CodePipelineCloudWatchStageEvent, Unit]
  type CodePipelineHandler = Handler[CodePipelineEvent, Unit]
  type AsyncCodePipelineHandler = AsyncHandler[CodePipelineEvent, Unit]
  type CodePipelineStageState = String
  type CodePipelineState = String
  type CognitoUserPoolEvent = CognitoUserPoolTriggerEvent
  type CognitoUserPoolTriggerHandler =
    Handler[CognitoUserPoolTriggerEvent, js.Any]
  type AsyncCognitoUserPoolTriggerHandler =
    AsyncHandler[CognitoUserPoolTriggerEvent, js.Any]
  type ConditionBlock = js.Dictionary[Condition | js.Array[Condition]]
  type Condition = js.Dictionary[String | js.Array[String]]
  type CustomAuthorizerHandler =
    Handler[CustomAuthorizerEvent, CustomAuthorizerResult]
  type AsyncCustomAuthorizerHandler =
    AsyncHandler[CustomAuthorizerEvent, CustomAuthorizerResult]
  type DynamoDBStreamHandler = Handler[DynamoDBStreamEvent, Unit]
  type AsyncDynamoDBStreamHandler = AsyncHandler[DynamoDBStreamEvent, Unit]
  type FirehoseRecordTransformationStatus = String
  type FirehoseTransformationHandler =
    Handler[FirehoseTransformationEvent, FirehoseTransformationResult]
  type AsyncFirehoseTransformationHandler =
    AsyncHandler[FirehoseTransformationEvent, FirehoseTransformationResult]
  type Headers = js.Dictionary[String]
  type HeadersBDS = js.Dictionary[Boolean | Double | String]
  type KinesisStreamHandler = Handler[KinesisStreamEvent, Unit]
  type AsyncKinesisStreamHandler = AsyncHandler[KinesisStreamEvent, Unit]
  type LexDialogAction =
    LexDialogActionClose | LexDialogActionElicitIntent | LexDialogActionElicitSlot | LexDialogActionConfirmIntent | LexDialogActionDelegate
  type LexHandler = Handler[LexEvent, LexResult]
  type AsyncLexHandler = AsyncHandler[LexEvent, LexResult]
  type MultiValueHeaders = js.Dictionary[js.Array[String]]
  type MultiValueHeadersBDS = js.Dictionary[js.Array[Boolean | Double | String]]
  type PrincipalValue =
    js.Dictionary[String | js.Array[String]] | String | js.Array[String]
  type ProxyHandler = APIGatewayProxyHandler
  type ProxyResult = APIGatewayProxyResult
  type S3BatchHandler = Handler[S3BatchEvent, S3BatchResult]
  type AsyncS3BatchHandler = AsyncHandler[S3BatchEvent, S3BatchResult]
  type S3BatchResultResultCode = String
  type S3CreateEvent = S3Event
  type S3Handler = Handler[S3Event, Unit]
  type AsyncS3Handler = AsyncHandler[S3Event, Unit]
  type ScheduledHandler = Handler[ScheduledEvent, Unit]
  type AsyncScheduledHandler = AsyncHandler[ScheduledEvent, Unit]
  type SNSHandler = Handler[SNSEvent, Unit]
  type AsyncSNSHandler = AsyncHandler[SNSEvent, Unit]
  type SNSMessageAttributes = js.Dictionary[SNSMessageAttribute]
  type SQSHandler = Handler[SQSEvent, Unit]
  type AsyncSQSHandler = AsyncHandler[SQSEvent, Unit]
  type SQSMessageAttributeDataType = String
  type SQSMessageAttributes = js.Dictionary[SQSMessageAttribute]
  type Statement =
    BaseStatement with StatementAction with StatementResource | StatementPrincipal
  type StatementAction = js.Any
  type StatementPrincipal = MaybeStatementResource
  type StatementResource = MaybeStatementPrincipal
}
