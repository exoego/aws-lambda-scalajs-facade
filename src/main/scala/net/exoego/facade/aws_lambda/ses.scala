package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js
import scala.scalajs.js.|

@Factory
trait SESMailHeader extends js.Object {
  var name: String
  var value: String
}

@Factory
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

@Factory
trait SESMail extends js.Object {
  var timestamp: String
  var source: String
  var messageId: String
  var destination: js.Array[String]
  var headersTruncated: Boolean
  var headers: js.Array[SESMailHeader]
  var commonHeaders: SESMailCommonHeaders
}

@Factory
trait SESReceiptStatus extends js.Object {
  var status: String
}

@Factory
trait SESReceiptS3Action extends js.Object {
  var `type`: String
  var topicArn: js.UndefOr[String]
  var bucketName: String
  var objectKey: String
}

@Factory
trait SESReceiptSnsAction extends js.Object {
  var `type`: String
  var topicArn: String
}

@Factory
trait SESReceiptBounceAction extends js.Object {
  var `type`: String
  var topicArn: js.UndefOr[String]
  var smtpReplyCode: String
  var statusCode: String
  var message: String
  var sender: String
}

@Factory
trait SESReceiptLambdaAction extends js.Object {
  var `type`: String
  var topicArn: js.UndefOr[String]
  var functionArn: String
  var invocationType: String
}

@Factory
trait SESReceiptStopAction extends js.Object {
  var `type`: String
  var topicArn: js.UndefOr[String]
}

@Factory
trait SESReceiptWorkMailAction extends js.Object {
  var `type`: String
  var topicArn: js.UndefOr[String]
  var organizationArn: String
}

@Factory
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

@Factory
trait SESMessage extends js.Object {
  var mail: SESMail
  var receipt: SESReceipt
}

@Factory
trait SESEventRecord extends js.Object {
  var eventSource: String
  var eventVersion: String
  var ses: SESMessage
}

@Factory
trait SESEvent extends js.Object {
  var Records: js.Array[SESEventRecord]
}
