package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.|

trait SESMailHeader extends js.Object {
  var name: String
  var value: String
}
object SESMailHeader {
  def apply(
      name: String,
      value: String
  ): SESMailHeader = {
    val _obj$ = js.Dynamic.literal(
      "name" -> name.asInstanceOf[js.Any],
      "value" -> value.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[SESMailHeader]
  }
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
object SESMailCommonHeaders {
  def apply(
      returnPath: String,
      date: String,
      messageId: String,
      from: js.UndefOr[js.Array[String]] = js.undefined,
      to: js.UndefOr[js.Array[String]] = js.undefined,
      cc: js.UndefOr[js.Array[String]] = js.undefined,
      bcc: js.UndefOr[js.Array[String]] = js.undefined,
      sender: js.UndefOr[js.Array[String]] = js.undefined,
      replyTo: js.UndefOr[js.Array[String]] = js.undefined,
      subject: js.UndefOr[String] = js.undefined
  ): SESMailCommonHeaders = {
    val _obj$ = js.Dynamic.literal(
      "returnPath" -> returnPath.asInstanceOf[js.Any],
      "date" -> date.asInstanceOf[js.Any],
      "messageId" -> messageId.asInstanceOf[js.Any]
    )
    from.foreach(_v => _obj$.updateDynamic("from")(_v.asInstanceOf[js.Any]))
    to.foreach(_v => _obj$.updateDynamic("to")(_v.asInstanceOf[js.Any]))
    cc.foreach(_v => _obj$.updateDynamic("cc")(_v.asInstanceOf[js.Any]))
    bcc.foreach(_v => _obj$.updateDynamic("bcc")(_v.asInstanceOf[js.Any]))
    sender.foreach(_v => _obj$.updateDynamic("sender")(_v.asInstanceOf[js.Any]))
    replyTo.foreach(_v => _obj$.updateDynamic("replyTo")(_v.asInstanceOf[js.Any]))
    subject.foreach(_v => _obj$.updateDynamic("subject")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[SESMailCommonHeaders]
  }
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
object SESMail {
  def apply(
      timestamp: String,
      source: String,
      messageId: String,
      destination: js.Array[String],
      headersTruncated: Boolean,
      headers: js.Array[SESMailHeader],
      commonHeaders: SESMailCommonHeaders
  ): SESMail = {
    val _obj$ = js.Dynamic.literal(
      "timestamp" -> timestamp.asInstanceOf[js.Any],
      "source" -> source.asInstanceOf[js.Any],
      "messageId" -> messageId.asInstanceOf[js.Any],
      "destination" -> destination.asInstanceOf[js.Any],
      "headersTruncated" -> headersTruncated.asInstanceOf[js.Any],
      "headers" -> headers.asInstanceOf[js.Any],
      "commonHeaders" -> commonHeaders.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[SESMail]
  }
}

trait SESReceiptStatus extends js.Object {
  var status: literal.SESReceiptStatus
}
object SESReceiptStatus {
  def apply(
      status: literal.SESReceiptStatus
  ): SESReceiptStatus = {
    val _obj$ = js.Dynamic.literal(
      "status" -> status.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[SESReceiptStatus]
  }
}

trait SESReceiptS3Action extends js.Object {
  var `type`: String
  var topicArn: js.UndefOr[String]
  var bucketName: String
  var objectKey: String
}
object SESReceiptS3Action {
  def apply(
      `type`: String,
      bucketName: String,
      objectKey: String,
      topicArn: js.UndefOr[String] = js.undefined
  ): SESReceiptS3Action = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any],
      "bucketName" -> bucketName.asInstanceOf[js.Any],
      "objectKey" -> objectKey.asInstanceOf[js.Any]
    )
    topicArn.foreach(_v => _obj$.updateDynamic("topicArn")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[SESReceiptS3Action]
  }
}

trait SESReceiptSnsAction extends js.Object {
  var `type`: String
  var topicArn: String
}
object SESReceiptSnsAction {
  def apply(
      `type`: String,
      topicArn: String
  ): SESReceiptSnsAction = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any],
      "topicArn" -> topicArn.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[SESReceiptSnsAction]
  }
}

trait SESReceiptBounceAction extends js.Object {
  var `type`: String
  var topicArn: js.UndefOr[String]
  var smtpReplyCode: String
  var statusCode: String
  var message: String
  var sender: String
}
object SESReceiptBounceAction {
  def apply(
      `type`: String,
      smtpReplyCode: String,
      statusCode: String,
      message: String,
      sender: String,
      topicArn: js.UndefOr[String] = js.undefined
  ): SESReceiptBounceAction = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any],
      "smtpReplyCode" -> smtpReplyCode.asInstanceOf[js.Any],
      "statusCode" -> statusCode.asInstanceOf[js.Any],
      "message" -> message.asInstanceOf[js.Any],
      "sender" -> sender.asInstanceOf[js.Any]
    )
    topicArn.foreach(_v => _obj$.updateDynamic("topicArn")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[SESReceiptBounceAction]
  }
}

trait SESReceiptLambdaAction extends js.Object {
  var `type`: String
  var topicArn: js.UndefOr[String]
  var functionArn: String
  var invocationType: String
}
object SESReceiptLambdaAction {
  def apply(
      `type`: String,
      functionArn: String,
      invocationType: String,
      topicArn: js.UndefOr[String] = js.undefined
  ): SESReceiptLambdaAction = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any],
      "functionArn" -> functionArn.asInstanceOf[js.Any],
      "invocationType" -> invocationType.asInstanceOf[js.Any]
    )
    topicArn.foreach(_v => _obj$.updateDynamic("topicArn")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[SESReceiptLambdaAction]
  }
}

trait SESReceiptStopAction extends js.Object {
  var `type`: String
  var topicArn: js.UndefOr[String]
}
object SESReceiptStopAction {
  def apply(
      `type`: String,
      topicArn: js.UndefOr[String] = js.undefined
  ): SESReceiptStopAction = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any]
    )
    topicArn.foreach(_v => _obj$.updateDynamic("topicArn")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[SESReceiptStopAction]
  }
}

trait SESReceiptWorkMailAction extends js.Object {
  var `type`: String
  var topicArn: js.UndefOr[String]
  var organizationArn: String
}
object SESReceiptWorkMailAction {
  def apply(
      `type`: String,
      organizationArn: String,
      topicArn: js.UndefOr[String] = js.undefined
  ): SESReceiptWorkMailAction = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any],
      "organizationArn" -> organizationArn.asInstanceOf[js.Any]
    )
    topicArn.foreach(_v => _obj$.updateDynamic("topicArn")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[SESReceiptWorkMailAction]
  }
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
  var dmarcPolicy: js.UndefOr[literal.SESDmarcPolicy]
  var action
      : SESReceiptS3Action | SESReceiptSnsAction | SESReceiptBounceAction | SESReceiptLambdaAction | SESReceiptStopAction | SESReceiptWorkMailAction
}
object SESReceipt {
  def apply(
      timestamp: String,
      processingTimeMillis: Double,
      recipients: js.Array[String],
      spamVerdict: SESReceiptStatus,
      virusVerdict: SESReceiptStatus,
      spfVerdict: SESReceiptStatus,
      dkimVerdict: SESReceiptStatus,
      dmarcVerdict: SESReceiptStatus,
      action: SESReceiptS3Action | SESReceiptSnsAction | SESReceiptBounceAction | SESReceiptLambdaAction | SESReceiptStopAction | SESReceiptWorkMailAction,
      dmarcPolicy: js.UndefOr[literal.SESDmarcPolicy] = js.undefined
  ): SESReceipt = {
    val _obj$ = js.Dynamic.literal(
      "timestamp" -> timestamp.asInstanceOf[js.Any],
      "processingTimeMillis" -> processingTimeMillis.asInstanceOf[js.Any],
      "recipients" -> recipients.asInstanceOf[js.Any],
      "spamVerdict" -> spamVerdict.asInstanceOf[js.Any],
      "virusVerdict" -> virusVerdict.asInstanceOf[js.Any],
      "spfVerdict" -> spfVerdict.asInstanceOf[js.Any],
      "dkimVerdict" -> dkimVerdict.asInstanceOf[js.Any],
      "dmarcVerdict" -> dmarcVerdict.asInstanceOf[js.Any],
      "action" -> action.asInstanceOf[js.Any]
    )
    dmarcPolicy.foreach(_v => _obj$.updateDynamic("dmarcPolicy")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[SESReceipt]
  }
}

trait SESMessage extends js.Object {
  var mail: SESMail
  var receipt: SESReceipt
}
object SESMessage {
  def apply(
      mail: SESMail,
      receipt: SESReceipt
  ): SESMessage = {
    val _obj$ = js.Dynamic.literal(
      "mail" -> mail.asInstanceOf[js.Any],
      "receipt" -> receipt.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[SESMessage]
  }
}

trait SESEventRecord extends js.Object {
  var eventSource: String
  var eventVersion: String
  var ses: SESMessage
}
object SESEventRecord {
  def apply(
      eventSource: String,
      eventVersion: String,
      ses: SESMessage
  ): SESEventRecord = {
    val _obj$ = js.Dynamic.literal(
      "eventSource" -> eventSource.asInstanceOf[js.Any],
      "eventVersion" -> eventVersion.asInstanceOf[js.Any],
      "ses" -> ses.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[SESEventRecord]
  }
}

trait SESEvent extends js.Object {
  var Records: js.Array[SESEventRecord]
}
object SESEvent {
  def apply(
      Records: js.Array[SESEventRecord]
  ): SESEvent = {
    val _obj$ = js.Dynamic.literal(
      "Records" -> Records.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[SESEvent]
  }
}
