package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js

@Factory
trait FirehoseTransformationEvent extends js.Object {
  var invocationId: String
  var deliveryStreamArn: String
  var region: String
  var records: js.Array[FirehoseTransformationEventRecord]
}

@Factory
trait FirehoseTransformationEventRecord extends js.Object {
  var recordId: String
  var approximateArrivalTimestamp: Double
  var data: String
  var kinesisRecordMetadata: js.UndefOr[FirehoseRecordMetadata] = js.undefined
}

@Factory
trait FirehoseRecordMetadata extends js.Object {
  var shardId: String
  var partitionKey: String
  var approximateArrivalTimestamp: Double
  var sequenceNumber: String
  var subsequenceNumber: String
}

@Factory
trait FirehoseTransformationResultRecord extends js.Object {
  var recordId: String
  var result: FirehoseRecordTransformationStatus
  var data: String
}

@Factory
trait FirehoseTransformationResult extends js.Object {
  var records: js.Array[FirehoseTransformationResultRecord]
}
