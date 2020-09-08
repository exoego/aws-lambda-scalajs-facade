package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory
import scala.scalajs.js

@Factory
trait SESMailHeader extends js.Object {
  var name: String
  var value: String
}

@Factory
trait SESMailCommonHeaders extends js.Object {
  var returnPath: String
  var from: js.Array[String]
  var date: String
  var to: js.Array[String]
  var messageId: String
  var subject: String
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
trait SESReceiptAction extends js.Object {
  var `type`: String
  var functionArn: String
  var invocationType: String
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
  var action: SESReceiptAction
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
