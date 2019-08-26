package net.exoego.facade

import scala.scalajs.js
import scala.scalajs.js.|

package object aws_lambda {
  type ALBCallback = Callback[ALBResult]
  type ALBHandler = Handler[ALBEvent, ALBResult]
  type APIGatewayEvent = APIGatewayProxyEvent
  type APIGatewayProxyCallback = Callback[APIGatewayProxyResult]
  type APIGatewayProxyHandler =
    Handler[APIGatewayProxyEvent, APIGatewayProxyResult]
  type ArtifactLocation = S3ArtifactStore
  type AttributeValue = facade.amazonaws.services.dynamodb.AttributeValue
  type AuthResponse = CustomAuthorizerResult
  type Callback[TResult] =
    js.Function2[js.UndefOr[Error | String], TResult, Unit]
  type CloudFormationCustomResourceEvent =
    CloudFormationCustomResourceCreateEvent | CloudFormationCustomResourceUpdateEvent | CloudFormationCustomResourceDeleteEvent
  type CloudFormationCustomResourceHandler =
    Handler[CloudFormationCustomResourceEvent, Unit]
  type CloudFormationCustomResourceResponse =
    CloudFormationCustomResourceSuccessResponse | CloudFormationCustomResourceFailedResponse
  type CloudFrontHeaders = js.Dictionary[js.Array[js.Any]]
  type CloudFrontOrigin = js.Any
  type CloudFrontRequestCallback = Callback[CloudFrontRequestResult]
  type CloudFrontRequestHandler =
    Handler[CloudFrontRequestEvent, CloudFrontRequestResult]
  type CloudFrontRequestResult =
    js.UndefOr[CloudFrontResultResponse | CloudFrontRequest]
  type CloudFrontResponseCallback = Callback[CloudFrontResponseResult]
  type CloudFrontResponseHandler =
    Handler[CloudFrontResponseEvent, CloudFrontResponseResult]
  type CloudFrontResponseResult = js.UndefOr[CloudFrontResultResponse]
  type CloudWatchLogsHandler = Handler[CloudWatchLogsEvent, Unit]
  type CodePipelineActionCategory = String
  type CodePipelineActionState = String
  type CodePipelineCloudWatchActionHandler =
    Handler[CodePipelineCloudWatchActionEvent, Unit]
  type CodePipelineCloudWatchEvent =
    CodePipelineCloudWatchPipelineEvent | CodePipelineCloudWatchStageEvent | CodePipelineCloudWatchActionEvent
  type CodePipelineCloudWatchHandler =
    Handler[CodePipelineCloudWatchEvent, Unit]
  type CodePipelineCloudWatchPipelineHandler =
    Handler[CodePipelineCloudWatchPipelineEvent, Unit]
  type CodePipelineCloudWatchStageHandler =
    Handler[CodePipelineCloudWatchStageEvent, Unit]
  type CodePipelineHandler = Handler[CodePipelineEvent, Unit]
  type CodePipelineStageState = String
  type CodePipelineState = String
  type CognitoUserPoolEvent = CognitoUserPoolTriggerEvent
  type CognitoUserPoolTriggerHandler =
    Handler[CognitoUserPoolTriggerEvent, js.Any]
  type ConditionBlock = js.Dictionary[Condition | js.Array[Condition]]
  type Condition = js.Dictionary[String | js.Array[String]]
  type CustomAuthorizerCallback = Callback[CustomAuthorizerResult]
  type CustomAuthorizerHandler =
    Handler[CustomAuthorizerEvent, CustomAuthorizerResult]
  type DynamoDBStreamHandler = Handler[DynamoDBStreamEvent, Unit]
  type FirehoseRecordTransformationStatus = String
  type FirehoseTransformationCallback = Callback[FirehoseTransformationResult]
  type FirehoseTransformationHandler =
    Handler[FirehoseTransformationEvent, FirehoseTransformationResult]
  type Handler[TEvent, TResult] =
    js.Function3[TEvent, Context, Callback[TResult], Unit | js.Promise[TResult]]
  type Headers = js.Dictionary[String]
  type HeadersBDS = js.Dictionary[Boolean | Double | String]
  type KinesisStreamHandler = Handler[KinesisStreamEvent, Unit]
  type LexCallback = Callback[LexResult]
  type LexDialogAction =
    LexDialogActionClose | LexDialogActionElicitIntent | LexDialogActionElicitSlot | LexDialogActionConfirmIntent | LexDialogActionDelegate
  type LexHandler = Handler[LexEvent, LexResult]
  type MultiValueHeaders = js.Dictionary[js.Array[String]]
  type MultiValueHeadersBDS = js.Dictionary[js.Array[Boolean | Double | String]]
  type PrincipalValue =
    js.Dictionary[String | js.Array[String]] | String | js.Array[String]
  type ProxyCallback = APIGatewayProxyCallback
  type ProxyHandler = APIGatewayProxyHandler
  type ProxyResult = APIGatewayProxyResult
  type S3CreateEvent = S3Event
  type S3Handler = Handler[S3Event, Unit]
  type ScheduledHandler = Handler[ScheduledEvent, Unit]
  type SNSHandler = Handler[SNSEvent, Unit]
  type SNSMessageAttributes = js.Dictionary[SNSMessageAttribute]
  type SQSHandler = Handler[SQSEvent, Unit]
  type SQSMessageAttributeDataType = String
  type SQSMessageAttributes = js.Dictionary[SQSMessageAttribute]
  type Statement =
    BaseStatement with StatementAction with StatementResource | StatementPrincipal
  type StatementAction = js.Any
  type StatementPrincipal = MaybeStatementResource
  type StatementResource = MaybeStatementPrincipal
}
