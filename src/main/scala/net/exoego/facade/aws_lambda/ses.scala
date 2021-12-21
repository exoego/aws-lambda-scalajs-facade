package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.|

trait SESMailHeader extends js.Object {
  var name: String
  var value: String
}

trait SESMailCommonHeaders extends js.Object {
  var returnPath: String
  var from: js.UndefOr[js.Array[String]]
  var date: String
  var to: js.UndefOr[js.Array[String]]
  var cc: js.UndefOr[js.Array[String]]
  var bcc: js.UndefOr[js.Array[String]]
  var sender: js.UndefOr[js.Array[String]]
  var replyTo: js.UndefOr[js.Array[String]]
  var messageId: String
  var subject: js.UndefOr[String]
}

trait SESMail extends js.Object {
  var timestamp: String
  var source: String
  var messageId: String
  var destination: js.Array[String]
  var headersTruncated: Boolean
  var headers: js.Array[SESMailHeader]
  var commonHeaders: SESMailCommonHeaders
}

trait SESReceiptStatus extends js.Object {
  var status: String
}

trait SESReceiptS3Action extends js.Object {
  var `type`: String
  var topicArn: js.UndefOr[String]
  var bucketName: String
  var objectKey: String
}

trait SESReceiptSnsAction extends js.Object {
  var `type`: String
  var topicArn: String
}

trait SESReceiptBounceAction extends js.Object {
  var `type`: String
  var topicArn: js.UndefOr[String]
  var smtpReplyCode: String
  var statusCode: String
  var message: String
  var sender: String
}

trait SESReceiptLambdaAction extends js.Object {
  var `type`: String
  var topicArn: js.UndefOr[String]
  var functionArn: String
  var invocationType: String
}

trait SESReceiptStopAction extends js.Object {
  var `type`: String
  var topicArn: js.UndefOr[String]
}

trait SESReceiptWorkMailAction extends js.Object {
  var `type`: String
  var topicArn: js.UndefOr[String]
  var organizationArn: String
}

trait SESReceipt extends js.Object {
  var timestamp: String
  var processingTimeMillis: Double
  var recipients: js.Array[String]
  var spamVerdict: SESReceiptStatus
  var virusVerdict: SESReceiptStatus
  var spfVerdict: SESReceiptStatus
  var dkimVerdict: SESReceiptStatus
  var dmarcVerdict: SESReceiptStatus
  var action: SESReceiptS3Action | SESReceiptSnsAction | SESReceiptBounceAction | SESReceiptLambdaAction | SESReceiptStopAction | SESReceiptWorkMailAction
}

trait SESMessage extends js.Object {
  var mail: SESMail
  var receipt: SESReceipt
}

trait SESEventRecord extends js.Object {
  var eventSource: String
  var eventVersion: String
  var ses: SESMessage
}

trait SESEvent extends js.Object {
  var Records: js.Array[SESEventRecord]
}
