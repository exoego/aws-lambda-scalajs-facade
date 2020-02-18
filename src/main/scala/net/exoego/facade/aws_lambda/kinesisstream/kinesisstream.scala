package net.exoego.facade.aws_lambda.kinesisstream

import scala.scalajs.js

@js.native
trait KinesisStreamRecordPayload extends js.Object {
  var approximateArrivalTimestamp: Double = js.native
  var data: String = js.native
  var kinesisSchemaVersion: String = js.native
  var partitionKey: String = js.native
  var sequenceNumber: String = js.native
}

object KinesisStreamRecordPayload {
  def apply(
      approximateArrivalTimestamp: Double,
      data: String,
      kinesisSchemaVersion: String,
      partitionKey: String,
      sequenceNumber: String
  ): KinesisStreamRecordPayload = {
    val _obj$ = js.Dynamic.literal(
      "approximateArrivalTimestamp" -> approximateArrivalTimestamp
        .asInstanceOf[js.Any],
      "data" -> data.asInstanceOf[js.Any],
      "kinesisSchemaVersion" -> kinesisSchemaVersion.asInstanceOf[js.Any],
      "partitionKey" -> partitionKey.asInstanceOf[js.Any],
      "sequenceNumber" -> sequenceNumber.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[KinesisStreamRecordPayload]
  }
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

object KinesisStreamRecord {
  def apply(
      awsRegion: String,
      eventID: String,
      eventName: String,
      eventSource: String,
      eventSourceARN: String,
      eventVersion: String,
      invokeIdentityArn: String,
      kinesis: KinesisStreamRecordPayload
  ): KinesisStreamRecord = {
    val _obj$ = js.Dynamic.literal(
      "awsRegion" -> awsRegion.asInstanceOf[js.Any],
      "eventID" -> eventID.asInstanceOf[js.Any],
      "eventName" -> eventName.asInstanceOf[js.Any],
      "eventSource" -> eventSource.asInstanceOf[js.Any],
      "eventSourceARN" -> eventSourceARN.asInstanceOf[js.Any],
      "eventVersion" -> eventVersion.asInstanceOf[js.Any],
      "invokeIdentityArn" -> invokeIdentityArn.asInstanceOf[js.Any],
      "kinesis" -> kinesis.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[KinesisStreamRecord]
  }
}

@js.native
trait KinesisStreamEvent extends js.Object {
  var Records: js.Array[KinesisStreamRecord] = js.native
}

object KinesisStreamEvent {
  def apply(
      Records: js.Array[KinesisStreamRecord]
  ): KinesisStreamEvent = {
    val _obj$ = js.Dynamic.literal(
      "Records" -> Records.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[KinesisStreamEvent]
  }
}
