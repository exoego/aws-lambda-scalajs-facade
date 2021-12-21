package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait MSKRecord extends js.Object {
  var topic: String = js.native
  var partition: Double = js.native
  var offset: Double = js.native
  var timestamp: Double = js.native
  var timestampType: literal.MSKRecordTimestampType = js.native
  var key: String = js.native
  var value: String = js.native
}

object MSKRecord {
  def apply(
      topic: String,
      partition: Double,
      offset: Double,
      timestamp: Double,
      timestampType: literal.MSKRecordTimestampType,
      key: String,
      value: String
  ): MSKRecord = {
    val _obj$ = js.Dynamic.literal(
      "topic" -> topic.asInstanceOf[js.Any],
      "partition" -> partition.asInstanceOf[js.Any],
      "offset" -> offset.asInstanceOf[js.Any],
      "timestamp" -> timestamp.asInstanceOf[js.Any],
      "timestampType" -> timestampType.asInstanceOf[js.Any],
      "key" -> key.asInstanceOf[js.Any],
      "value" -> value.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[MSKRecord]
  }
}

@js.native
trait MSKEvent extends js.Object {
  var eventSource: literal.MSKEventEventType = js.native
  var eventSourceArn: String = js.native
  var records: MSKEvent.Records = js.native
}

object MSKEvent {
  type Records = js.Dictionary[js.Array[MSKRecord]]

  def apply(
      eventSourceArn: String,
      records: MSKEvent.Records
  ): MSKEvent = {
    val _obj$ = js.Dynamic.literal(
      "eventSource" -> "aws:kafka",
      "eventSourceArn" -> eventSourceArn.asInstanceOf[js.Any],
      "records" -> records.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[MSKEvent]
  }
}
