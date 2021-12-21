package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait FirehoseTransformationEvent extends js.Object {
  var invocationId: String = js.native
  var deliveryStreamArn: String = js.native
  var region: String = js.native
  var records: js.Array[FirehoseTransformationEventRecord] = js.native
}

@js.native
trait FirehoseTransformationEventRecord extends js.Object {
  var recordId: String = js.native
  var approximateArrivalTimestamp: Double = js.native
  var data: String = js.native
  var kinesisRecordMetadata: js.UndefOr[FirehoseRecordMetadata] = js.native
}

@js.native
trait FirehoseRecordMetadata extends js.Object {
  var shardId: String = js.native
  var partitionKey: String = js.native
  var approximateArrivalTimestamp: Double = js.native
  var sequenceNumber: String = js.native
  var subsequenceNumber: String = js.native
}

@js.native
trait FirehoseTransformationResultRecord extends js.Object {
  var recordId: String = js.native
  var result: FirehoseRecordTransformationStatus = js.native
  var data: String = js.native
}

@js.native
trait FirehoseTransformationResult extends js.Object {
  var records: js.Array[FirehoseTransformationResultRecord] = js.native
}
