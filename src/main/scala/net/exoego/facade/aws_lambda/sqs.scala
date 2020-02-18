package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait SQSRecord extends js.Object {
  var messageId: String = js.native
  var receiptHandle: String = js.native
  var body: String = js.native
  var attributes: SQSRecordAttributes = js.native
  var messageAttributes: SQSMessageAttributes = js.native
  var md5OfBody: String = js.native
  var eventSource: String = js.native
  var eventSourceARN: String = js.native
  var awsRegion: String = js.native
}

object SQSRecord {
  def apply(
      messageId: String,
      receiptHandle: String,
      body: String,
      attributes: SQSRecordAttributes,
      messageAttributes: SQSMessageAttributes,
      md5OfBody: String,
      eventSource: String,
      eventSourceARN: String,
      awsRegion: String
  ): SQSRecord = {
    val _obj$ = js.Dynamic.literal(
      "messageId" -> messageId.asInstanceOf[js.Any],
      "receiptHandle" -> receiptHandle.asInstanceOf[js.Any],
      "body" -> body.asInstanceOf[js.Any],
      "attributes" -> attributes.asInstanceOf[js.Any],
      "messageAttributes" -> messageAttributes.asInstanceOf[js.Any],
      "md5OfBody" -> md5OfBody.asInstanceOf[js.Any],
      "eventSource" -> eventSource.asInstanceOf[js.Any],
      "eventSourceARN" -> eventSourceARN.asInstanceOf[js.Any],
      "awsRegion" -> awsRegion.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[SQSRecord]
  }
}

@js.native
trait SQSEvent extends js.Object {
  var Records: js.Array[SQSRecord] = js.native
}

object SQSEvent {
  def apply(
      Records: js.Array[SQSRecord]
  ): SQSEvent = {
    val _obj$ = js.Dynamic.literal(
      "Records" -> Records.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[SQSEvent]
  }
}

@js.native
trait SQSRecordAttributes extends js.Object {
  var ApproximateReceiveCount: String = js.native
  var SentTimestamp: String = js.native
  var SenderId: String = js.native
  var ApproximateFirstReceiveTimestamp: String = js.native
}

object SQSRecordAttributes {
  def apply(
      ApproximateReceiveCount: String,
      SentTimestamp: String,
      SenderId: String,
      ApproximateFirstReceiveTimestamp: String
  ): SQSRecordAttributes = {
    val _obj$ = js.Dynamic.literal(
      "ApproximateReceiveCount" -> ApproximateReceiveCount.asInstanceOf[js.Any],
      "SentTimestamp" -> SentTimestamp.asInstanceOf[js.Any],
      "SenderId" -> SenderId.asInstanceOf[js.Any],
      "ApproximateFirstReceiveTimestamp" -> ApproximateFirstReceiveTimestamp
        .asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[SQSRecordAttributes]
  }
}

@js.native
trait SQSMessageAttribute extends js.Object {
  var stringValue: js.UndefOr[String] = js.native
  var binaryValue: js.UndefOr[String] = js.native
  var stringListValues: js.Array[Nothing] = js.native
  var binaryListValues: js.Array[Nothing] = js.native
  var dataType: SQSMessageAttributeDataType = js.native
}

object SQSMessageAttribute {
  def apply(
      stringListValues: js.Array[Nothing],
      binaryListValues: js.Array[Nothing],
      dataType: SQSMessageAttributeDataType,
      stringValue: js.UndefOr[String] = js.undefined,
      binaryValue: js.UndefOr[String] = js.undefined
  ): SQSMessageAttribute = {
    val _obj$ = js.Dynamic.literal(
      "stringListValues" -> stringListValues.asInstanceOf[js.Any],
      "binaryListValues" -> binaryListValues.asInstanceOf[js.Any],
      "dataType" -> dataType.asInstanceOf[js.Any]
    )
    stringValue.foreach(_v =>
      _obj$.updateDynamic("stringValue")(_v.asInstanceOf[js.Any])
    )
    binaryValue.foreach(_v =>
      _obj$.updateDynamic("binaryValue")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[SQSMessageAttribute]
  }
}
