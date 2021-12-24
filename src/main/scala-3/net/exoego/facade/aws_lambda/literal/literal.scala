package net.exoego.facade.aws_lambda

package object literal {
  type SESReceiptStatus = "PASS" | "FAIL" | "GRAY" | "PROCESSING_FAILED" | "DISABLED"
  type SESDmarcPolicy = "none" | "quarantine" | "reject"

  type S3BatchResultResultCode = "Succeeded" | "TemporaryFailure" | "PermanentFailure"

  type MSKRecordTimestampType = "CREATE_TIME" | "LOG_APPEND_TIME"
  type MSKEventEventType = "aws:kafka"

  type LexEventCurrentIntentConfirmationStatus = "None" | "Confirmed" | "Denied"
  type LexEventInvocationSource = "DialogCodeHook" | "FulfillmentCodeHook"
  type LexEventOutputDialogMode = "Text" | "Voice"
  type LexDialogActionType = "Close" | "ElicitIntent" | "ElicitSlot" | "ConfirmIntent"
  type LexDialogActionMessageContentType = "PlainText" | "SSML" | "CustomPayload"
  type LexDialogActionCloseFulfillmentState = "Fulfilled" | "Failed"

  type FirehoseRecordTransformationStatus = "Ok" | "Dropped" | "ProcessingFailed"

  type ConnectContactFlowChannel = "VOICE" | "CHAT"
  type ConnectContactFlowInitiationMethod = "INBOUND" | "OUTBOUND" | "TRANSFER" | "CALLBACK" | "API"
  type ConnectContactFlowEndpointType = "TELEPHONE_NUMBER"

  type CognitoUserPoolChallengeName =
    "PASSWORD_VERIFIER" | "SMS_MFA" | "DEVICE_SRP_AUTH" | "DEVICE_PASSWORD_VERIFIER" | "ADMIN_NO_SRP_AUTH" | "SRP_A"
  type CognitoUserPoolUserStatus =
    "UNCONFIRMED" | "CONFIRMED" | "ARCHIVED" | "COMPROMISED" | "UNKNOWN" | "RESET_REQUIRED" | "FORCE_CHANGE_PASSWORD"

  type CloudFrontCustomOriginProtocol = "http" | "https"
  type CloudFrontS3OriginAuthMethod = "origin-access-identity" | "none"
  type CloudFrontRequestBodyAction = "read-only" | "replace"
  type CloudFrontRequestEncoding = "base64" | "text"
  type CloudFrontEventType = "origin-request" | "origin-response" | "viewer-request" | "viewer-response"

  type CodeBuildStateType = "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "STOPPED"
  type CodeBuildPhaseType =
    "COMPLETED" | "FINALIZING" | "UPLOAD_ARTIFACTS" | "POST_BUILD" | "BUILD" | "PRE_BUILD" | "INSTALL" | "QUEUED" | "DOWNLOAD_SOURCE" | "PROVISIONING" | "SUBMITTED"
  type CodeBuildPhaseStatusType = "TIMED_OUT" | "STOPPED" | "FAILED" | "SUCCEEDED" | "FAULT" | "CLIENT_ERROR"
  type CodeBuildCacheType = "NO_CACHE" | "LOCAL" | "S3"
  type CodeBuildSourceLocationType =
    "CODECOMMIT" | "CODEPIPELINE" | "GITHUB" | "GITHUB_ENTERPRISE" | "BITBUCKET" | "S3" | "NO_SOURCE"
  type CodeBuildEnvironmentType = "LINUX_CONTAINER" | "LINUX_GPU_CONTAINER" | "WINDOWS_CONTAINER" | "ARM_CONTAINER"
  type CodeBuildEnvironmentPullCredentialsType = "CODEBUILD" | "SERVICE_ROLE"
  type CodeBuildEnvironmentComputeType =
    "BUILD_GENERAL1_SMALL" | "BUILD_GENERAL1_MEDIUM" | "BUILD_GENERAL1_LARGE" | "BUILD_GENERAL1_2XLARGE"
  type CodeBuildEnvironmentVariableType = "PARAMETER_STORE" | "PLAINTEXT" | "SECRETS_MANAGER"

  type CodePipelineActionCategory = "Approval" | "Build" | "Deploy" | "Invoke" | "Source" | "Test"
  type CodePipelineActionState = "STARTED" | "SUCCEEDED" | "FAILED" | "CANCELED"
  type CodePipelineCloudWatchActionDetailType = "CodePipeline Action Execution State Change"
  type CodePipelineCloudWatchActionSource = "aws.codepipeline"
  type CodePipelineCloudWatchActionDetailTypeOwner = "AWS" | "Custom" | "ThirdParty"

  type CodePipelineState = "STARTED" | "SUCCEEDED" | "RESUMED" | "FAILED" | "CANCELED" | "SUPERSEDED"
  type CodePipelineCloudWatchPipelineDetailType = "CodePipeline Pipeline Execution State Change"
  type CodePipelineCloudWatchPipelineSource = "aws.codepipeline"

  type CodePipelineStageState = "STARTED" | "SUCCEEDED" | "RESUMED" | "FAILED" | "CANCELED"
  type CodePipelineCloudWatchStageDetailType = "CodePipeline Stage Execution State Change"
  type CodePipelineCloudWatchStageSource = "aws.codepipeline"

  type AccountTakeOverActionType = "BLOCK" | "NO_ACTION" | "MFA" | "MFA_IF_CONFIGURED" | "MFA_REQUIRED"
}
