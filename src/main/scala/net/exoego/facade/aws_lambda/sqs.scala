package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory
import scala.scalajs.js

@Factory
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

@Factory
@js.native
trait SQSEvent extends js.Object {
  var Records: js.Array[SQSRecord] = js.native
}

@Factory
@js.native
trait SQSRecordAttributes extends js.Object {
  var ApproximateReceiveCount: String = js.native
  var SentTimestamp: String = js.native
  var SenderId: String = js.native
  var ApproximateFirstReceiveTimestamp: String = js.native
  var AWSTraceHeader: js.UndefOr[String] = js.native
}

@Factory
@js.native
trait SQSMessageAttribute extends js.Object {
  var stringValue: js.UndefOr[String] = js.native
  var binaryValue: js.UndefOr[String] = js.native
  var stringListValues: js.Array[Nothing] = js.native
  var binaryListValues: js.Array[Nothing] = js.native
  var dataType: SQSMessageAttributeDataType = js.native
}
