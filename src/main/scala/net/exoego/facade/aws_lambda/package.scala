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
  type ALBHandler = alb.ALBHandler
  type AsyncALBHandler = alb.AsyncALBHandler
  type ALBEventRequestContext = alb.ALBEventRequestContext
  val ALBEventRequestContext = alb.ALBEventRequestContext
  type ALBEvent = alb.ALBEvent
  val ALBEvent = alb.ALBEvent
  type ALBResult = alb.ALBResult
  val ALBResult = alb.ALBResult

  // cloudwatch-events
  type ScheduledHandler = cloudwatch.events.ScheduledHandler
  type AsyncScheduledHandler = cloudwatch.events.AsyncScheduledHandler
  type ScheduledEvent = cloudwatch.events.ScheduledEvent
  val ScheduledEvent = cloudwatch.events.ScheduledEvent

  // cloudwatch-logs
  type CloudWatchLogsHandler = cloudwatch.logs.CloudWatchLogsHandler
  type AsyncCloudWatchLogsHandler = cloudwatch.logs.AsyncCloudWatchLogsHandler
  type CloudWatchLogsEvent = cloudwatch.logs.CloudWatchLogsEvent
  val CloudWatchLogsEvent = cloudwatch.logs.CloudWatchLogsEvent
  type CloudWatchLogsEventData = cloudwatch.logs.CloudWatchLogsEventData
  val CloudWatchLogsEventData = cloudwatch.logs.CloudWatchLogsEventData
  type CloudWatchLogsDecodedData = cloudwatch.logs.CloudWatchLogsDecodedData
  val CloudWatchLogsDecodedData = cloudwatch.logs.CloudWatchLogsDecodedData
  type CloudWatchLogsLogEvent = cloudwatch.logs.CloudWatchLogsLogEvent
  val CloudWatchLogsLogEvent = cloudwatch.logs.CloudWatchLogsLogEvent

  // apigateway
  type APIGatewayEventRequestContext = apigateway.APIGatewayEventRequestContext
  val APIGatewayEventRequestContext = apigateway.APIGatewayEventRequestContext
  type AuthResponseContext = apigateway.AuthResponseContext
  val AuthResponseContext = apigateway.AuthResponseContext

  // apigateway-authorizer
  type AuthResponse = apigateway.authorizer.AuthResponse
  type CustomAuthorizerHandler = apigateway.authorizer.CustomAuthorizerHandler
  type AsyncCustomAuthorizerHandler =
    apigateway.authorizer.AsyncCustomAuthorizerHandler
  type ConditionBlock = apigateway.authorizer.ConditionBlock
  type Condition = apigateway.authorizer.Condition
  type Statement = apigateway.authorizer.Statement
  type StatementAction = apigateway.authorizer.StatementAction
  type StatementPrincipal = apigateway.authorizer.MaybeStatementResource
  type StatementResource = apigateway.authorizer.MaybeStatementPrincipal
  type PrincipalValue = apigateway.authorizer.PrincipalValue
  type CustomAuthorizerEvent = apigateway.authorizer.CustomAuthorizerEvent
  val CustomAuthorizerEvent = apigateway.authorizer.CustomAuthorizerEvent
  type CustomAuthorizerResult = apigateway.authorizer.CustomAuthorizerResult
  val CustomAuthorizerResult = apigateway.authorizer.CustomAuthorizerResult
  type PolicyDocument = apigateway.authorizer.PolicyDocument
  val PolicyDocument = apigateway.authorizer.PolicyDocument
  type BaseStatement = apigateway.authorizer.BaseStatement
  val BaseStatement = apigateway.authorizer.BaseStatement
  type MaybeStatementPrincipal = apigateway.authorizer.MaybeStatementPrincipal
  val MaybeStatementPrincipal = apigateway.authorizer.MaybeStatementPrincipal
  type MaybeStatementResource = apigateway.authorizer.MaybeStatementResource
  val MaybeStatementResource = apigateway.authorizer.MaybeStatementResource

  // authorizer-proxy
  @deprecated("Old name. Use APIGatewayProxyHandler", "0.5.0")
  type ProxyHandler = apigateway.proxy.APIGatewayProxyHandler
  @deprecated("Old name. Use APIGatewayProxyResult", "0.5.0")
  type ProxyResult = apigateway.proxy.APIGatewayProxyResult
  @deprecated("Old name. Use APIGatewayProxyEvent", "0.5.0")
  type APIGatewayEvent = apigateway.proxy.APIGatewayProxyEvent
  type APIGatewayProxyHandler = apigateway.proxy.APIGatewayProxyHandler
  type AsyncAPIGatewayProxyHandler =
    apigateway.proxy.AsyncAPIGatewayProxyHandler
  type APIGatewayProxyEvent = apigateway.proxy.APIGatewayProxyEvent
  val APIGatewayProxyEvent = apigateway.proxy.APIGatewayProxyEvent
  type APIGatewayProxyResult = apigateway.proxy.APIGatewayProxyResult
  val APIGatewayProxyResult = apigateway.proxy.APIGatewayProxyResult

  // dynamodb-stream
  type AttributeValue = dynamodbstream.AttributeValue
  type DynamoDBStreamHandler = dynamodbstream.DynamoDBStreamHandler
  type AsyncDynamoDBStreamHandler = dynamodbstream.AsyncDynamoDBStreamHandler
  type DynamoDBStreamEvent = dynamodbstream.DynamoDBStreamEvent
  val DynamoDBStreamEvent = dynamodbstream.DynamoDBStreamEvent

  // cloudformation-customresource
  type CloudFormationCustomResourceEvent =
    cloudformation.customresource.CloudFormationCustomResourceEvent
  type CloudFormationCustomResourceHandler =
    cloudformation.customresource.CloudFormationCustomResourceHandler
  type AsyncCloudFormationCustomResourceHandler =
    cloudformation.customresource.AsyncCloudFormationCustomResourceHandler
  type CloudFormationCustomResourceResponse =
    cloudformation.customresource.CloudFormationCustomResourceResponse
  type CloudFormationCustomResourceCreateEvent =
    cloudformation.customresource.CloudFormationCustomResourceCreateEvent
  val CloudFormationCustomResourceCreateEvent =
    cloudformation.customresource.CloudFormationCustomResourceCreateEvent
  type CloudFormationCustomResourceUpdateEvent =
    cloudformation.customresource.CloudFormationCustomResourceUpdateEvent
  val CloudFormationCustomResourceUpdateEvent =
    cloudformation.customresource.CloudFormationCustomResourceUpdateEvent
  type CloudFormationCustomResourceDeleteEvent =
    cloudformation.customresource.CloudFormationCustomResourceDeleteEvent
  val CloudFormationCustomResourceDeleteEvent =
    cloudformation.customresource.CloudFormationCustomResourceDeleteEvent
  type CloudFormationCustomResourceResponseCommon =
    cloudformation.customresource.CloudFormationCustomResourceResponseCommon
  val CloudFormationCustomResourceResponseCommon =
    cloudformation.customresource.CloudFormationCustomResourceResponseCommon
  type CloudFormationCustomResourceSuccessResponse =
    cloudformation.customresource.CloudFormationCustomResourceSuccessResponse
  val CloudFormationCustomResourceSuccessResponse =
    cloudformation.customresource.CloudFormationCustomResourceSuccessResponse
  type CloudFormationCustomResourceFailedResponse =
    cloudformation.customresource.CloudFormationCustomResourceFailedResponse
  val CloudFormationCustomResourceFailedResponse =
    cloudformation.customresource.CloudFormationCustomResourceFailedResponse

  // cloudfront-common
  type CloudFrontHeaders = cloudfront.CloudFrontHeaders

  // cloudfront-request
  type CloudFrontRequestHandler = cloudfront.request.CloudFrontRequestHandler
  type AsyncCloudFrontRequestHandler =
    cloudfront.request.AsyncCloudFrontRequestHandler
  type CloudFrontRequestResult = cloudfront.request.CloudFrontRequestResult
  type CloudFrontRequestEventRecordItem =
    cloudfront.request.CloudFrontRequestEventRecordItem
  val CloudFrontRequestEventRecordItem =
    cloudfront.request.CloudFrontRequestEventRecordItem
  type CloudFrontRequestEvent = cloudfront.request.CloudFrontRequestEvent
  val CloudFrontRequestEvent = cloudfront.request.CloudFrontRequestEvent

  // cloudfront-response
  type CloudFrontResponseHandler = cloudfront.response.CloudFrontResponseHandler
  type AsyncCloudFrontResponseHandler =
    cloudfront.response.AsyncCloudFrontResponseHandler
  type CloudFrontResponseResult = cloudfront.response.CloudFrontResponseResult
  type CloudFrontResponseEventRecordItem =
    cloudfront.response.CloudFrontResponseEventRecordItem
  val CloudFrontResponseEventRecordItem =
    cloudfront.response.CloudFrontResponseEventRecordItem
  type CloudFrontResponseEvent = cloudfront.response.CloudFrontResponseEvent
  val CloudFrontResponseEvent = cloudfront.response.CloudFrontResponseEvent

  // codepipeline
  type ArtifactLocation = codepipeline.S3ArtifactStore
  type CodePipelineHandler = codepipeline.CodePipelineHandler
  type AsyncCodePipelineHandler = codepipeline.AsyncCodePipelineHandler
  type S3ArtifactLocation = codepipeline.S3ArtifactLocation
  val S3ArtifactLocation = codepipeline.S3ArtifactLocation
  type S3ArtifactStore = codepipeline.S3ArtifactStore
  val S3ArtifactStore = codepipeline.S3ArtifactStore
  type Artifact = codepipeline.Artifact
  val Artifact = codepipeline.Artifact
  type Credentials = codepipeline.Credentials
  val Credentials = codepipeline.Credentials
  type EncryptionKey = codepipeline.EncryptionKey
  val EncryptionKey = codepipeline.EncryptionKey
  type CodePipelineEvent = codepipeline.CodePipelineEvent
  val CodePipelineEvent = codepipeline.CodePipelineEvent

  // codepipeline-cloudwatch
  type CodePipelineCloudWatchHandler =
    codepipeline.cloudwatch.CodePipelineCloudWatchHandler
  type AsyncCodePipelineCloudWatchHandler =
    codepipeline.cloudwatch.AsyncCodePipelineCloudWatchHandler
  type CodePipelineCloudWatchEvent =
    codepipeline.cloudwatch.CodePipelineCloudWatchEvent

  // codepipeline-cloudwatch-action
  type CodePipelineCloudWatchActionHandler =
    codepipeline.cloudwatch.action.CodePipelineCloudWatchActionHandler
  type AsyncCodePipelineCloudWatchActionHandler =
    codepipeline.cloudwatch.action.AsyncCodePipelineCloudWatchActionHandler
  type CodePipelineActionCategory =
    codepipeline.cloudwatch.action.CodePipelineActionCategory
  type CodePipelineActionState =
    codepipeline.cloudwatch.action.CodePipelineActionState
  type CodePipelineCloudWatchActionEvent =
    codepipeline.cloudwatch.action.CodePipelineCloudWatchActionEvent
  val CodePipelineCloudWatchActionEvent =
    codepipeline.cloudwatch.action.CodePipelineCloudWatchActionEvent

  // codepipeline-cloudwatch-pipeline
  type CodePipelineState = codepipeline.cloudwatch.pipeline.CodePipelineState
  type CodePipelineCloudWatchPipelineHandler =
    codepipeline.cloudwatch.pipeline.CodePipelineCloudWatchPipelineHandler
  type AsyncCodePipelineCloudWatchPipelineHandler =
    codepipeline.cloudwatch.pipeline.AsyncCodePipelineCloudWatchPipelineHandler
  type CodePipelineCloudWatchPipelineEvent =
    codepipeline.cloudwatch.pipeline.CodePipelineCloudWatchPipelineEvent
  val CodePipelineCloudWatchPipelineEvent =
    codepipeline.cloudwatch.pipeline.CodePipelineCloudWatchPipelineEvent

  // codepipeline-cloudwatch-stage
  type CodePipelineStageState =
    codepipeline.cloudwatch.stage.CodePipelineStageState
  type CodePipelineCloudWatchStageHandler =
    codepipeline.cloudwatch.stage.CodePipelineCloudWatchStageHandler
  type AsyncCodePipelineCloudWatchStageHandler =
    codepipeline.cloudwatch.stage.AsyncCodePipelineCloudWatchStageHandler
  type CodePipelineCloudWatchStageEvent =
    codepipeline.cloudwatch.stage.CodePipelineCloudWatchStageEvent
  val CodePipelineCloudWatchStageEvent =
    codepipeline.cloudwatch.stage.CodePipelineCloudWatchStageEvent

  // cognitouserpool
  type CognitoUserPoolEvent = cognitouserpool.CognitoUserPoolTriggerEvent
  type CognitoUserPoolTriggerHandler =
    cognitouserpool.CognitoUserPoolTriggerHandler
  type AsyncCognitoUserPoolTriggerHandler =
    cognitouserpool.AsyncCognitoUserPoolTriggerHandler
  val CognitoUserPoolTriggerEvent = cognitouserpool.CognitoUserPoolTriggerEvent
  type CognitoUserPoolTriggerEvent = cognitouserpool.CognitoUserPoolTriggerEvent

  // kinesis-firehose-transformation
  type FirehoseRecordTransformationStatus =
    firehose.FirehoseRecordTransformationStatus
  type FirehoseTransformationHandler = firehose.FirehoseTransformationHandler
  type AsyncFirehoseTransformationHandler =
    firehose.AsyncFirehoseTransformationHandler
  type FirehoseTransformationEvent = firehose.FirehoseTransformationEvent
  val FirehoseTransformationEvent = firehose.FirehoseTransformationEvent
  type FirehoseTransformationEventRecord =
    firehose.FirehoseTransformationEventRecord
  val FirehoseTransformationEventRecord =
    firehose.FirehoseTransformationEventRecord
  type FirehoseRecordMetadata = firehose.FirehoseRecordMetadata
  val FirehoseRecordMetadata = firehose.FirehoseRecordMetadata
  type FirehoseTransformationResultRecord =
    firehose.FirehoseTransformationResultRecord
  val FirehoseTransformationResultRecord =
    firehose.FirehoseTransformationResultRecord
  type FirehoseTransformationResult = firehose.FirehoseTransformationResult
  val FirehoseTransformationResult = firehose.FirehoseTransformationResult

  // kinesis-stream
  type KinesisStreamHandler = kinesisstream.KinesisStreamHandler
  type AsyncKinesisStreamHandler = kinesisstream.AsyncKinesisStreamHandler
  type KinesisStreamRecordPayload = kinesisstream.KinesisStreamRecordPayload
  val KinesisStreamRecordPayload = kinesisstream.KinesisStreamRecordPayload
  type KinesisStreamRecord = kinesisstream.KinesisStreamRecord
  val KinesisStreamRecord = kinesisstream.KinesisStreamRecord
  type KinesisStreamEvent = kinesisstream.KinesisStreamEvent
  val KinesisStreamEvent = kinesisstream.KinesisStreamEvent

  // lex
  type LexDialogAction = lex.LexDialogAction
  type LexHandler = lex.LexHandler
  type AsyncLexHandler = lex.AsyncLexHandler
  type LexEvent = lex.LexEvent
  val LexEvent = lex.LexEvent
  type LexSlotResolution = lex.LexSlotResolution
  val LexSlotResolution = lex.LexSlotResolution
  type LexGenericAttachment = lex.LexGenericAttachment
  val LexGenericAttachment = lex.LexGenericAttachment
  type LexDialogActionBase = lex.LexDialogActionBase
  val LexDialogActionBase = lex.LexDialogActionBase
  type LexDialogActionClose = lex.LexDialogActionClose
  val LexDialogActionClose = lex.LexDialogActionClose
  type LexDialogActionElicitIntent = lex.LexDialogActionElicitIntent
  val LexDialogActionElicitIntent = lex.LexDialogActionElicitIntent
  type LexDialogActionElicitSlot = lex.LexDialogActionElicitSlot
  val LexDialogActionElicitSlot = lex.LexDialogActionElicitSlot
  type LexDialogActionConfirmIntent = lex.LexDialogActionConfirmIntent
  val LexDialogActionConfirmIntent = lex.LexDialogActionConfirmIntent
  type LexDialogActionDelegate = lex.LexDialogActionDelegate
  val LexDialogActionDelegate = lex.LexDialogActionDelegate
  type LexResult = lex.LexResult
  val LexResult = lex.LexResult

  // s3
  @deprecated("Old name. Use s3.S3Event.", "0.5.0")
  type S3CreateEvent = s3.S3Event
  type S3Handler = s3.S3Handler
  type AsyncS3Handler = s3.AsyncS3Handler
  type S3Event = s3.S3Event
  val S3Event = s3.S3Event
  type S3EventRecord = s3.S3EventRecord
  val S3EventRecord = s3.S3EventRecord
  type S3EventRecordGlacierRestoreEventData =
    s3.S3EventRecordGlacierRestoreEventData
  val S3EventRecordGlacierRestoreEventData =
    s3.S3EventRecordGlacierRestoreEventData
  type S3EventRecordGlacierEventData = s3.S3EventRecordGlacierEventData
  val S3EventRecordGlacierEventData = s3.S3EventRecordGlacierEventData

  // s3-batch
  type S3BatchHandler = s3batch.S3BatchHandler
  type AsyncS3BatchHandler = s3batch.AsyncS3BatchHandler
  type S3BatchResultResultCode = s3batch.S3BatchResultResultCode
  type S3BatchEvent = s3batch.S3BatchEvent
  val S3BatchEvent = s3batch.S3BatchEvent
  type S3BatchEventJob = s3batch.S3BatchEventJob
  val S3BatchEventJob = s3batch.S3BatchEventJob
  type S3BatchEventTask = s3batch.S3BatchEventTask
  val S3BatchEventTask = s3batch.S3BatchEventTask
  type S3BatchResult = s3batch.S3BatchResult
  val S3BatchResult = s3batch.S3BatchResult
  type S3BatchResultResult = s3batch.S3BatchResultResult
  val S3BatchResultResult = s3batch.S3BatchResultResult

  // sns
  type SNSHandler = sns.SNSHandler
  type AsyncSNSHandler = sns.AsyncSNSHandler
  type SNSMessageAttributes = sns.SNSMessageAttributes
  type SNSMessageAttribute = sns.SNSMessageAttribute
  val SNSMessageAttribute = sns.SNSMessageAttribute
  type SNSMessage = sns.SNSMessage
  val SNSMessage = sns.SNSMessage
  type SNSEventRecord = sns.SNSEventRecord
  val SNSEventRecord = sns.SNSEventRecord
  type SNSEvent = sns.SNSEvent
  val SNSEvent = sns.SNSEvent

  // sqs
  type SQSHandler = sqs.SQSHandler
  type AsyncSQSHandler = sqs.AsyncSQSHandler
  type SQSMessageAttributeDataType = sqs.SQSMessageAttributeDataType
  type SQSMessageAttributes = sqs.SQSMessageAttributes
  type SQSRecord = sqs.SQSRecord
  val SQSRecord = sqs.SQSRecord
  type SQSEvent = sqs.SQSEvent
  val SQSEvent = sqs.SQSEvent
  type SQSRecordAttributes = sqs.SQSRecordAttributes
  val SQSRecordAttributes = sqs.SQSRecordAttributes
  type SQSMessageAttribute = sqs.SQSMessageAttribute
  val SQSMessageAttribute = sqs.SQSMessageAttribute
}
