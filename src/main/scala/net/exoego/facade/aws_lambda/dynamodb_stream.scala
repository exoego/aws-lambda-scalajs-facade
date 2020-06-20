package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js

@Factory
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
}

@Factory
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

@Factory
@js.native
trait DynamoDBStreamEvent extends js.Object {
  var Records: js.Array[DynamoDBRecord] = js.native
}
