package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js

@Factory
trait StreamRecord extends js.Object {
  var ApproximateCreationDateTime: js.UndefOr[Double] = js.undefined
  var Keys: js.UndefOr[StreamRecord.Keys] = js.undefined
  var NewImage: js.UndefOr[StreamRecord.NewImage] = js.undefined
  var OldImage: js.UndefOr[StreamRecord.OldImage] = js.undefined
  var SequenceNumber: js.UndefOr[String] = js.undefined
  var SizeBytes: js.UndefOr[Double] = js.undefined
  var StreamViewType: js.UndefOr[String] = js.undefined
}

object StreamRecord {
  type Keys = js.Dictionary[AttributeValue]
  type NewImage = js.Dictionary[AttributeValue]
  type OldImage = js.Dictionary[AttributeValue]
}

@Factory
trait DynamoDBRecord extends js.Object {
  var awsRegion: js.UndefOr[String] = js.undefined
  var dynamodb: js.UndefOr[StreamRecord] = js.undefined
  var eventID: js.UndefOr[String] = js.undefined
  var eventName: js.UndefOr[String] = js.undefined
  var eventSource: js.UndefOr[String] = js.undefined
  var eventSourceARN: js.UndefOr[String] = js.undefined
  var eventVersion: js.UndefOr[String] = js.undefined
  var userIdentity: js.UndefOr[js.Any] = js.undefined
}

@Factory
trait DynamoDBStreamEvent extends js.Object {
  var Records: js.Array[DynamoDBRecord]
}
