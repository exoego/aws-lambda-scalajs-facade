package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory
import scala.scalajs.js

@Factory
trait SQSRecord extends js.Object {
  var messageId: String
  var receiptHandle: String
  var body: String
  var attributes: SQSRecordAttributes
  var messageAttributes: SQSMessageAttributes
  var md5OfBody: String
  var eventSource: String
  var eventSourceARN: String
  var awsRegion: String
}

@Factory
trait SQSEvent extends js.Object {
  var Records: js.Array[SQSRecord]
}

@Factory
trait SQSRecordAttributes extends js.Object {
  var ApproximateReceiveCount: String
  var SentTimestamp: String
  var SenderId: String
  var ApproximateFirstReceiveTimestamp: String
  var AWSTraceHeader: js.UndefOr[String] = js.undefined
}

@Factory
trait SQSMessageAttribute extends js.Object {
  var stringValue: js.UndefOr[String] = js.undefined
  var binaryValue: js.UndefOr[String] = js.undefined
  var stringListValues: js.Array[Nothing]
  var binaryListValues: js.Array[Nothing]
  var dataType: SQSMessageAttributeDataType
}
