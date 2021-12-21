package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait KinesisStreamRecordPayload extends js.Object {
  var approximateArrivalTimestamp: Double = js.native
  var data: String = js.native
  var kinesisSchemaVersion: String = js.native
  var partitionKey: String = js.native
  var sequenceNumber: String = js.native
}

@js.native
trait KinesisStreamRecord extends js.Object {
  var awsRegion: String = js.native
  var eventID: String = js.native
  var eventName: String = js.native
  var eventSource: String = js.native
  var eventSourceARN: String = js.native
  var eventVersion: String = js.native
  var invokeIdentityArn: String = js.native
  var kinesis: KinesisStreamRecordPayload = js.native
}

@js.native
trait KinesisStreamEvent extends js.Object {
  var Records: js.Array[KinesisStreamRecord] = js.native
}
