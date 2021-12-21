package net.exoego.facade.aws_lambda

package object literal {
  type SESReceiptStatus = "PASS" | "FAIL" | "GRAY" | "PROCESSING_FAILED" | "DISABLED"
  type SESDmarcPolicy = "none" | "quarantine" | "reject"
}
