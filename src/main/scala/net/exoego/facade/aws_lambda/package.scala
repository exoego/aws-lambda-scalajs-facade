package net.exoego.facade

import scala.scalajs.js
import scala.scalajs.js.|

package object aws_lambda {
  // common
  type Headers = js.Dictionary[String]
  type HeadersBDS = js.Dictionary[Boolean | Double | String]
  type HeadersBDSA = js.Dictionary[Boolean | Double | String | js.Array[String]]
  type MultiValueHeaders = js.Dictionary[js.Array[String]]
  type MultiValueHeadersBDS = js.Dictionary[js.Array[Boolean | Double | String]]
  type Callback[TResult] = js.Function2[js.UndefOr[js.Error | String], TResult, Unit]

  // alb
  type ALBHandler = Handler[ALBEvent, ALBResult]
  type AsyncALBHandler = AsyncHandler[ALBEvent, ALBResult]

  // cloudwatch-events
  type ScheduledHandler[T] = Handler[ScheduledEvent[T], Unit]
  type AsyncScheduledHandler[T] = AsyncHandler[ScheduledEvent[T], Unit]

  // cloudwatch-logs
  type CloudWatchLogsHandler = Handler[CloudWatchLogsEvent, Unit]
  type AsyncCloudWatchLogsHandler = AsyncHandler[CloudWatchLogsEvent, Unit]

  // apigateway-proxy
  type APIGatewayProxyEventHeaders = js.Dictionary[String]
  type APIGatewayProxyEventMultiValueHeaders = js.Dictionary[js.Array[String]]
  type APIGatewayProxyEventPathParameters = js.Dictionary[String]
  type APIGatewayProxyEventQueryStringParameters = js.Dictionary[String]
  type APIGatewayProxyEventMultiValueQueryStringParameters = js.Dictionary[js.Array[String]]
  type APIGatewayProxyEventStageVariables = js.Dictionary[String]

  // apigateway-authorizer
  type APIGatewayEventDefaultAuthorizerContext = js.UndefOr[js.Dictionary[js.Any]] | Null
  type APIGatewayEventRequestContext =
    APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext]
  type APIGatewayProxyEvent = APIGatewayProxyEventBase[APIGatewayEventDefaultAuthorizerContext]
  type APIGatewayProxyWithLambdaAuthorizerEvent[T <: js.Object] =
    APIGatewayProxyEventBase[APIGatewayEventLambdaAuthorizerContext[T]]
  type APIGatewayProxyWithCognitoAuthorizerEvent = APIGatewayProxyEventBase[APIGatewayProxyCognitoAuthorizer]
  type APIGatewayProxyWithLambdaAuthorizerEventRequestContext[T <: js.Object] =
    APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventLambdaAuthorizerContext[T]]

  type APIGatewayProxyWithLambdaAuthorizerHandler[T <: js.Object] =
    Handler[APIGatewayProxyWithLambdaAuthorizerEvent[T], APIGatewayProxyResult]
  type AsyncAPIGatewayProxyWithLambdaAuthorizerHandler[T <: js.Object] =
    AsyncHandler[APIGatewayProxyWithLambdaAuthorizerEvent[T], APIGatewayProxyResult]

  type APIGatewayProxyWithCognitoAuthorizerHandler =
    Handler[APIGatewayProxyWithCognitoAuthorizerEvent, APIGatewayProxyResult]
  type AsyncAPIGatewayProxyWithCognitoAuthorizerHandler =
    AsyncHandler[APIGatewayProxyWithCognitoAuthorizerEvent, APIGatewayProxyResult]

  type AuthResponse = APIGatewayAuthorizerResult
  type Condition = js.Dictionary[String | js.Array[String]]
  type ConditionBlock = js.Dictionary[Condition | js.Array[Condition]]
  type Statement = BaseStatement with StatementAction with StatementResource | StatementPrincipal
  type StatementAction = js.Any
  type StatementPrincipal = MaybeStatementResource
  type StatementResource = MaybeStatementPrincipal
  type PrincipalValue = js.Dictionary[String | js.Array[String]] | String | js.Array[String]
  type CustomAuthorizerResult = APIGatewayAuthorizerResult
  type APIGatewayTokenAuthorizerHandler = Handler[APIGatewayTokenAuthorizerEvent, APIGatewayAuthorizerResult]
  type AsyncAPIGatewayTokenAuthorizerHandler = AsyncHandler[APIGatewayTokenAuthorizerEvent, APIGatewayAuthorizerResult]
  type APIGatewayTokenAuthorizerWithContextHandler[TAuthorizerContext <: APIGatewayAuthorizerResultContext] =
    Handler[APIGatewayTokenAuthorizerEvent, APIGatewayAuthorizerWithContextResult[TAuthorizerContext]]
  type AsyncAPIGatewayTokenAuthorizerWithContextHandler[TAuthorizerContext <: APIGatewayAuthorizerResultContext] =
    AsyncHandler[APIGatewayTokenAuthorizerEvent, APIGatewayAuthorizerWithContextResult[TAuthorizerContext]]
  type APIGatewayRequestAuthorizerHandler = Handler[APIGatewayRequestAuthorizerEvent, APIGatewayAuthorizerResult]
  type AsyncAPIGatewayRequestAuthorizerHandler =
    AsyncHandler[APIGatewayRequestAuthorizerEvent, APIGatewayAuthorizerResult]
  type APIGatewayRequestAuthorizerWithContextHandler[TAuthorizerContext <: APIGatewayAuthorizerResultContext] =
    Handler[APIGatewayRequestAuthorizerEvent, APIGatewayAuthorizerWithContextResult[TAuthorizerContext]]
  type AsyncAPIGatewayRequestAuthorizerWithContextHandler[TAuthorizerContext <: APIGatewayAuthorizerResultContext] =
    AsyncHandler[APIGatewayRequestAuthorizerEvent, APIGatewayAuthorizerWithContextResult[TAuthorizerContext]]

  /** Works with Lambda Proxy Integration for Rest API or HTTP API integration Payload Format version 1.0
    * @see
    *   - https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html
    */
  type APIGatewayProxyHandler = Handler[APIGatewayProxyEvent, APIGatewayProxyResult]

  /** Works with Lambda Proxy Integration for Rest API or HTTP API integration Payload Format version 1.0
    * @see
    *   - https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html
    */
  type AsyncAPIGatewayProxyHandler = AsyncHandler[APIGatewayProxyEvent, APIGatewayProxyResult]

  /** Works with Lambda Proxy Integration for Rest API or HTTP API integration Payload Format version 2.0
    * @see
    *   - https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html
    */
  type APIGatewayProxyHandlerV2[T <: js.Object] = Handler[APIGatewayProxyEventV2, APIGatewayProxyResultV2[T]]

  type APIGatewayProxyResultV2[T <: js.Object] = APIGatewayProxyStructuredResultV2 | String | T

  /** Works with Lambda Proxy Integration for Rest API or HTTP API integration Payload Format version 2.0
    * @see
    *   - https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html
    */
  type AsyncAPIGatewayProxyHandlerV2[T <: js.Object] = AsyncHandler[APIGatewayProxyEventV2, APIGatewayProxyResultV2[T]]

  @deprecated("Use APIGatewayProxyEventBase instead", "0.12.0")
  @inline val APIGatewayProxyEvent = APIGatewayProxyEventBase

  // dynamodb-stream
  type AttributeValue = facade.amazonaws.services.dynamodb.AttributeValue
  type DynamoDBStreamHandler = Handler[DynamoDBStreamEvent, Unit]
  type AsyncDynamoDBStreamHandler = AsyncHandler[DynamoDBStreamEvent, Unit]

  // cloudformation-customresource
  type CloudFormationCustomResourceEvent =
    CloudFormationCustomResourceCreateEvent | CloudFormationCustomResourceUpdateEvent | CloudFormationCustomResourceDeleteEvent
  type CloudFormationCustomResourceHandler = Handler[CloudFormationCustomResourceEvent, Unit]
  type AsyncCloudFormationCustomResourceHandler = AsyncHandler[CloudFormationCustomResourceEvent, Unit]
  type CloudFormationCustomResourceResponse =
    CloudFormationCustomResourceSuccessResponse | CloudFormationCustomResourceFailedResponse

  // cloudfront-common
  type CloudFrontHeaders = js.Dictionary[js.Array[CloudFrontHeadersItem]]

  // cloudfront-request
  type CloudFrontRequestHandler = Handler[CloudFrontRequestEvent, CloudFrontRequestResult]
  type AsyncCloudFrontRequestHandler = AsyncHandler[CloudFrontRequestEvent, CloudFrontRequestResult]
  type CloudFrontRequestResult = js.UndefOr[CloudFrontResultResponse | CloudFrontRequest]

  // cloudfront-response
  type CloudFrontResponseHandler = Handler[CloudFrontResponseEvent, CloudFrontResponseResult]
  type AsyncCloudFrontResponseHandler = AsyncHandler[CloudFrontResponseEvent, CloudFrontResponseResult]
  type CloudFrontResponseResult = js.UndefOr[CloudFrontResultResponse]

  // codepipeline
  type CodePipelineHandler = Handler[CodePipelineEvent, Unit]
  type AsyncCodePipelineHandler = AsyncHandler[CodePipelineEvent, Unit]
  type ArtifactLocation = S3ArtifactStore

  // codepipeline-cloudwatch
  type CodePipelineCloudWatchEvent =
    CodePipelineCloudWatchPipelineEvent | CodePipelineCloudWatchStageEvent | CodePipelineCloudWatchActionEvent
  type CodePipelineCloudWatchHandler = Handler[CodePipelineCloudWatchEvent, Unit]
  type AsyncCodePipelineCloudWatchHandler = AsyncHandler[CodePipelineCloudWatchEvent, Unit]

  // codepipeline-cloudwatch-action
  type CodePipelineCloudWatchActionHandler = Handler[CodePipelineCloudWatchActionEvent, Unit]
  type AsyncCodePipelineCloudWatchActionHandler = AsyncHandler[CodePipelineCloudWatchActionEvent, Unit]
  type CodePipelineActionCategory = String
  type CodePipelineActionState = String

  // codepipeline-cloudwatch-pipeline
  type CodePipelineState = String
  type CodePipelineCloudWatchPipelineHandler = Handler[CodePipelineCloudWatchPipelineEvent, Unit]
  type AsyncCodePipelineCloudWatchPipelineHandler = AsyncHandler[CodePipelineCloudWatchPipelineEvent, Unit]

  // codepipeline-cloudwatch-stage
  type CodePipelineStageState = String
  type CodePipelineCloudWatchStageHandler = Handler[CodePipelineCloudWatchStageEvent, Unit]
  type AsyncCodePipelineCloudWatchStageHandler = AsyncHandler[CodePipelineCloudWatchStageEvent, Unit]

  type CreateAuthChallengeTriggerHandler = Handler[CreateAuthChallengeTriggerEvent, js.Any]
  type CustomMessageTriggerHandler = Handler[CustomMessageTriggerEvent[String], js.Any]
  type DefineAuthChallengeTriggerHandler = Handler[DefineAuthChallengeTriggerEvent, js.Any]
  type PostAuthenticationTriggerHandler = Handler[PostAuthenticationTriggerEvent, js.Any]
  type PostConfirmationTriggerHandler = Handler[PostConfirmationTriggerEvent[String], js.Any]
  type PreAuthenticationTriggerHandler = Handler[PreAuthenticationTriggerEvent, js.Any]
  type PreSignUpTriggerHandler = Handler[PreSignUpTriggerEvent[String], js.Any]
  type PreTokenGenerationTriggerHandler = Handler[PreTokenGenerationTriggerEvent[String], js.Any]
  type UserMigrationTriggerHandler = Handler[UserMigrationTriggerEvent[String], js.Any]
  type VerifyAuthChallengeResponseTriggerHandler = Handler[VerifyAuthChallengeResponseTriggerEvent, js.Any]

  type AsyncCreateAuthChallengeTriggerHandler = AsyncHandler[CreateAuthChallengeTriggerEvent, js.Any]
  type AsyncCustomMessageTriggerHandler = AsyncHandler[CustomMessageTriggerEvent[String], js.Any]
  type AsyncDefineAuthChallengeTriggerHandler = AsyncHandler[DefineAuthChallengeTriggerEvent, js.Any]
  type AsyncPostAuthenticationTriggerHandler = AsyncHandler[PostAuthenticationTriggerEvent, js.Any]
  type AsyncPostConfirmationTriggerHandler = AsyncHandler[PostConfirmationTriggerEvent[String], js.Any]
  type AsyncPreAuthenticationTriggerHandler = AsyncHandler[PreAuthenticationTriggerEvent, js.Any]
  type AsyncPreSignUpTriggerHandler = AsyncHandler[PreSignUpTriggerEvent[String], js.Any]
  type AsyncPreTokenGenerationTriggerHandler = AsyncHandler[PreTokenGenerationTriggerEvent[String], js.Any]
  type AsyncUserMigrationTriggerHandler = AsyncHandler[UserMigrationTriggerEvent[String], js.Any]
  type AsyncVerifyAuthChallengeResponseTriggerHandler = AsyncHandler[VerifyAuthChallengeResponseTriggerEvent, js.Any]

  // kinesis-firehose-transformation
  type FirehoseTransformationHandler = Handler[FirehoseTransformationEvent, FirehoseTransformationResult]
  type AsyncFirehoseTransformationHandler = AsyncHandler[FirehoseTransformationEvent, FirehoseTransformationResult]
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
  type S3Handler = Handler[S3Event, Unit]
  type AsyncS3Handler = AsyncHandler[S3Event, Unit]

  // s3-batch
  type S3BatchHandler = Handler[S3BatchEvent, S3BatchResult]
  type AsyncS3BatchHandler = AsyncHandler[S3BatchEvent, S3BatchResult]
  type S3BatchResultResultCode = String

  // ses
  type SESHandler = Handler[SESEvent, Unit]
  type AsyncSESHandler = AsyncHandler[SESEvent, Unit]

  // sns
  type SNSHandler = Handler[SNSEvent, Unit]
  type AsyncSNSHandler = AsyncHandler[SNSEvent, Unit]
  type SNSMessageAttributes = js.Dictionary[SNSMessageAttribute]

  // sqs
  type SQSHandler = Handler[SQSEvent, Unit]
  type AsyncSQSHandler = AsyncHandler[SQSEvent, Unit]
  type SQSMessageAttributeDataType = String
  type SQSMessageAttributes = js.Dictionary[SQSMessageAttribute]

  // eventbridge
  type EventBridgeHandler[TDetailType <: String, TDetail, TResult] =
    Handler[EventBridgeEvent[TDetailType, TDetail], TResult]
  type AsyncEventBridgeHandler[TDetailType <: String, TDetail, TResult] =
    AsyncHandler[EventBridgeEvent[TDetailType, TDetail], TResult]

  // CodeBuild
  type CodeBuildCloudWatchStateHandler = Handler[CodeBuildCloudWatchStateEvent, Unit]
  type AsyncCodeBuildCloudWatchStateHandler = AsyncHandler[CodeBuildCloudWatchStateEvent, Unit]

  // Amazon Connect Contact Flow
  type ConnectContactFlowHandler = Handler[ConnectContactFlowEvent, ConnectContactFlowResult]
  type AsyncConnectContactFlowHandler = AsyncHandler[ConnectContactFlowEvent, ConnectContactFlowResult]

  // MSK (Amazon Managed Streaming for Apache Kafka)
  type MSKHandler = Handler[MSKEvent, Unit];
  type AsyncMSKHandler = AsyncHandler[MSKEvent, Unit];

  // AppSync Resolver
  // Those can also return single value, but limit to js.Array for better type inference
  type AppSyncResolverHandler[T, V] = Handler[AppSyncResolverEvent[T], js.Array[V]]
  type AsyncAppSyncResolverHandler[T, V] = AsyncHandler[AppSyncResolverEvent[T], js.Array[V]]

  // IoT
  type IoTPreProvisioningHookHandler = Handler[IoTPreProvisioningHookEvent, IoTPreProvisioningHookResult]
  type AsyncIoTPreProvisioningHookHandler = AsyncHandler[IoTPreProvisioningHookEvent, IoTPreProvisioningHookResult]
}
