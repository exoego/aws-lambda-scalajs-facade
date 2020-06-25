package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js

@Factory
@js.native
trait FirehoseTransformationEvent extends js.Object {
  var invocationId: String = js.native
  var deliveryStreamArn: String = js.native
  var region: String = js.native
  var records: js.Array[FirehoseTransformationEventRecord] = js.native
}

@Factory
@js.native
trait FirehoseTransformationEventRecord extends js.Object {
  var recordId: String = js.native
  var approximateArrivalTimestamp: Double = js.native
  var data: String = js.native
  var kinesisRecordMetadata: js.UndefOr[FirehoseRecordMetadata] = js.native
}

@Factory
@js.native
trait FirehoseRecordMetadata extends js.Object {
  var shardId: String = js.native
  var partitionKey: String = js.native
  var approximateArrivalTimestamp: Double = js.native
  var sequenceNumber: String = js.native
  var subsequenceNumber: String = js.native
}

@Factory
@js.native
trait FirehoseTransformationResultRecord extends js.Object {
  var recordId: String = js.native
  var result: FirehoseRecordTransformationStatus = js.native
  var data: String = js.native
}

@Factory
@js.native
trait FirehoseTransformationResult extends js.Object {
  var records: js.Array[FirehoseTransformationResultRecord] = js.native
}
