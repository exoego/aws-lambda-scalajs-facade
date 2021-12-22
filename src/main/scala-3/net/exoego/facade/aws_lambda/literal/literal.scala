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
}
