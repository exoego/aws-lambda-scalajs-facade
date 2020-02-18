package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait FirehoseTransformationEvent extends js.Object {
  var invocationId: String = js.native
  var deliveryStreamArn: String = js.native
  var region: String = js.native
  var records: js.Array[FirehoseTransformationEventRecord] = js.native
}

object FirehoseTransformationEvent {
  def apply(
      invocationId: String,
      deliveryStreamArn: String,
      region: String,
      records: js.Array[FirehoseTransformationEventRecord]
  ): FirehoseTransformationEvent = {
    val _obj$ = js.Dynamic.literal(
      "invocationId" -> invocationId.asInstanceOf[js.Any],
      "deliveryStreamArn" -> deliveryStreamArn.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "records" -> records.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[FirehoseTransformationEvent]
  }
}

@js.native
trait FirehoseTransformationEventRecord extends js.Object {
  var recordId: String = js.native
  var approximateArrivalTimestamp: Double = js.native
  var data: String = js.native
  var kinesisRecordMetadata: js.UndefOr[FirehoseRecordMetadata] = js.native
}

object FirehoseTransformationEventRecord {
  def apply(
      recordId: String,
      approximateArrivalTimestamp: Double,
      data: String,
      kinesisRecordMetadata: js.UndefOr[FirehoseRecordMetadata] = js.undefined
  ): FirehoseTransformationEventRecord = {
    val _obj$ = js.Dynamic.literal(
      "recordId" -> recordId.asInstanceOf[js.Any],
      "approximateArrivalTimestamp" -> approximateArrivalTimestamp
        .asInstanceOf[js.Any],
      "data" -> data.asInstanceOf[js.Any]
    )
    kinesisRecordMetadata.foreach(_v =>
      _obj$.updateDynamic("kinesisRecordMetadata")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[FirehoseTransformationEventRecord]
  }
}

@js.native
trait FirehoseRecordMetadata extends js.Object {
  var shardId: String = js.native
  var partitionKey: String = js.native
  var approximateArrivalTimestamp: String = js.native
  var sequenceNumber: String = js.native
  var subsequenceNumber: String = js.native
}

object FirehoseRecordMetadata {
  def apply(
      shardId: String,
      partitionKey: String,
      approximateArrivalTimestamp: String,
      sequenceNumber: String,
      subsequenceNumber: String
  ): FirehoseRecordMetadata = {
    val _obj$ = js.Dynamic.literal(
      "shardId" -> shardId.asInstanceOf[js.Any],
      "partitionKey" -> partitionKey.asInstanceOf[js.Any],
      "approximateArrivalTimestamp" -> approximateArrivalTimestamp
        .asInstanceOf[js.Any],
      "sequenceNumber" -> sequenceNumber.asInstanceOf[js.Any],
      "subsequenceNumber" -> subsequenceNumber.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[FirehoseRecordMetadata]
  }
}

@js.native
trait FirehoseTransformationResultRecord extends js.Object {
  var recordId: String = js.native
  var result: FirehoseRecordTransformationStatus = js.native
  var data: String = js.native
}

object FirehoseTransformationResultRecord {
  def apply(
      recordId: String,
      result: FirehoseRecordTransformationStatus,
      data: String
  ): FirehoseTransformationResultRecord = {
    val _obj$ = js.Dynamic.literal(
      "recordId" -> recordId.asInstanceOf[js.Any],
      "result" -> result.asInstanceOf[js.Any],
      "data" -> data.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[FirehoseTransformationResultRecord]
  }
}

@js.native
trait FirehoseTransformationResult extends js.Object {
  var records: js.Array[FirehoseTransformationResultRecord] = js.native
}

object FirehoseTransformationResult {
  def apply(
      records: js.Array[FirehoseTransformationResultRecord]
  ): FirehoseTransformationResult = {
    val _obj$ = js.Dynamic.literal(
      "records" -> records.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[FirehoseTransformationResult]
  }
}
