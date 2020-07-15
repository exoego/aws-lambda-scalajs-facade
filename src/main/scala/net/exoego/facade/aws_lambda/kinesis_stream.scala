package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js

@Factory
trait KinesisStreamRecordPayload extends js.Object {
  var approximateArrivalTimestamp: Double
  var data: String
  var kinesisSchemaVersion: String
  var partitionKey: String
  var sequenceNumber: String
}

@Factory
trait KinesisStreamRecord extends js.Object {
  var awsRegion: String
  var eventID: String
  var eventName: String
  var eventSource: String
  var eventSourceARN: String
  var eventVersion: String
  var invokeIdentityArn: String
  var kinesis: KinesisStreamRecordPayload
}

@Factory
trait KinesisStreamEvent extends js.Object {
  var Records: js.Array[KinesisStreamRecord]
}
