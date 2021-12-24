package net.exoego.facade.aws_lambda

package object literal {
  type SESReceiptStatus = String
  type SESDmarcPolicy = String

  type S3BatchResultResultCode = String

  type MSKRecordTimestampType = String
  type MSKEventEventType = "aws:kafka"

  type LexEventCurrentIntentConfirmationStatus = String
  type LexEventInvocationSource = String
  type LexEventOutputDialogMode = String
  type LexDialogActionType = String
  type LexDialogActionMessageContentType = String
  type LexDialogActionCloseFulfillmentState = String

  type FirehoseRecordTransformationStatus = String

  type ConnectContactFlowChannel = String
  type ConnectContactFlowInitiationMethod = String
  type ConnectContactFlowEndpointType = "TELEPHONE_NUMBER"

  type CognitoUserPoolChallengeName = String
  type CognitoUserPoolUserStatus = String

  type CloudFrontCustomOriginProtocol = String
  type CloudFrontS3OriginAuthMethod = String
  type CloudFrontRequestBodyAction = String
  type CloudFrontRequestEncoding = String
  type CloudFrontEventType = String

  type CodeBuildStateType = String
  type CodeBuildPhaseType = String
  type CodeBuildPhaseStatusType = String
  type CodeBuildCacheType = String
  type CodeBuildSourceLocationType = String
  type CodeBuildEnvironmentType = String
  type CodeBuildEnvironmentPullCredentialsType = String
  type CodeBuildEnvironmentComputeType = String
  type CodeBuildEnvironmentVariableType = String

  type CodePipelineActionCategory = String
  type CodePipelineActionState = String
  type CodePipelineCloudWatchActionDetailType = "CodePipeline Action Execution State Change"
  type CodePipelineCloudWatchActionSource = "aws.codepipeline"
  type CodePipelineCloudWatchActionDetailTypeOwner = String

  type CodePipelineState = String
  type CodePipelineCloudWatchPipelineDetailType = "CodePipeline Pipeline Execution State Change"
  type CodePipelineCloudWatchPipelineSource = "aws.codepipeline"

  type CodePipelineStageState = String
  type CodePipelineCloudWatchStageDetailType = "CodePipeline Stage Execution State Change"
  type CodePipelineCloudWatchStageSource = "aws.codepipeline"

  type AccountTakeOverActionType = String
}
