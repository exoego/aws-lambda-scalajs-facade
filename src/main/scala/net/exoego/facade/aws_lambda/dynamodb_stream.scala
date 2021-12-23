package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait StreamRecord extends js.Object {
  var ApproximateCreationDateTime: js.UndefOr[Double] = js.native
  var Keys: js.UndefOr[StreamRecord.Keys] = js.native
  var NewImage: js.UndefOr[StreamRecord.NewImage] = js.native
  var OldImage: js.UndefOr[StreamRecord.OldImage] = js.native
  var SequenceNumber: js.UndefOr[String] = js.native
  var SizeBytes: js.UndefOr[Double] = js.native
  var StreamViewType: js.UndefOr[String] = js.native
}

object StreamRecord {
  type Keys = js.Dictionary[AttributeValue]
  type NewImage = js.Dictionary[AttributeValue]
  type OldImage = js.Dictionary[AttributeValue]

  def apply(
      ApproximateCreationDateTime: js.UndefOr[Double] = js.undefined,
      Keys: js.UndefOr[Keys] = js.undefined,
      NewImage: js.UndefOr[NewImage] = js.undefined,
      OldImage: js.UndefOr[OldImage] = js.undefined,
      SequenceNumber: js.UndefOr[String] = js.undefined,
      SizeBytes: js.UndefOr[Double] = js.undefined,
      StreamViewType: js.UndefOr[String] = js.undefined
  ): StreamRecord = {
    val _obj$ = js.Dynamic.literal(
    )
    ApproximateCreationDateTime.foreach(_v =>
      _obj$.updateDynamic("ApproximateCreationDateTime")(_v.asInstanceOf[js.Any])
    )
    Keys.foreach(_v => _obj$.updateDynamic("Keys")(_v.asInstanceOf[js.Any]))
    NewImage.foreach(_v => _obj$.updateDynamic("NewImage")(_v.asInstanceOf[js.Any]))
    OldImage.foreach(_v => _obj$.updateDynamic("OldImage")(_v.asInstanceOf[js.Any]))
    SequenceNumber.foreach(_v => _obj$.updateDynamic("SequenceNumber")(_v.asInstanceOf[js.Any]))
    SizeBytes.foreach(_v => _obj$.updateDynamic("SizeBytes")(_v.asInstanceOf[js.Any]))
    StreamViewType.foreach(_v => _obj$.updateDynamic("StreamViewType")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[StreamRecord]
  }
}

@js.native
trait DynamoDBRecord extends js.Object {
  var awsRegion: js.UndefOr[String] = js.native
  var dynamodb: js.UndefOr[StreamRecord] = js.native
  var eventID: js.UndefOr[String] = js.native
  var eventName: js.UndefOr[String] = js.native
  var eventSource: js.UndefOr[String] = js.native
  var eventSourceARN: js.UndefOr[String] = js.native
  var eventVersion: js.UndefOr[String] = js.native
  var userIdentity: js.UndefOr[js.Any] = js.native
}

object DynamoDBRecord {
  def apply(
      awsRegion: js.UndefOr[String] = js.undefined,
      dynamodb: js.UndefOr[StreamRecord] = js.undefined,
      eventID: js.UndefOr[String] = js.undefined,
      eventName: js.UndefOr[String] = js.undefined,
      eventSource: js.UndefOr[String] = js.undefined,
      eventSourceARN: js.UndefOr[String] = js.undefined,
      eventVersion: js.UndefOr[String] = js.undefined,
      userIdentity: js.UndefOr[js.Any] = js.undefined
  ): DynamoDBRecord = {
    val _obj$ = js.Dynamic.literal(
    )
    awsRegion.foreach(_v => _obj$.updateDynamic("awsRegion")(_v.asInstanceOf[js.Any]))
    dynamodb.foreach(_v => _obj$.updateDynamic("dynamodb")(_v.asInstanceOf[js.Any]))
    eventID.foreach(_v => _obj$.updateDynamic("eventID")(_v.asInstanceOf[js.Any]))
    eventName.foreach(_v => _obj$.updateDynamic("eventName")(_v.asInstanceOf[js.Any]))
    eventSource.foreach(_v => _obj$.updateDynamic("eventSource")(_v.asInstanceOf[js.Any]))
    eventSourceARN.foreach(_v => _obj$.updateDynamic("eventSourceARN")(_v.asInstanceOf[js.Any]))
    eventVersion.foreach(_v => _obj$.updateDynamic("eventVersion")(_v.asInstanceOf[js.Any]))
    userIdentity.foreach(_v => _obj$.updateDynamic("userIdentity")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[DynamoDBRecord]
  }
}

@js.native
trait DynamoDBStreamEvent extends js.Object {
  var Records: js.Array[DynamoDBRecord] = js.native
}

object DynamoDBStreamEvent {
  def apply(
      Records: js.Array[DynamoDBRecord]
  ): DynamoDBStreamEvent = {
    val _obj$ = js.Dynamic.literal(
      "Records" -> Records.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[DynamoDBStreamEvent]
  }
}
