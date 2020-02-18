package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait CloudWatchLogsEvent extends js.Object {
  var awslogs: CloudWatchLogsEventData = js.native
}

object CloudWatchLogsEvent {
  def apply(
      awslogs: CloudWatchLogsEventData
  ): CloudWatchLogsEvent = {
    val _obj$ = js.Dynamic.literal(
      "awslogs" -> awslogs.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudWatchLogsEvent]
  }
}

@js.native
trait CloudWatchLogsEventData extends js.Object {
  var data: String = js.native
}

object CloudWatchLogsEventData {
  def apply(
      data: String
  ): CloudWatchLogsEventData = {
    val _obj$ = js.Dynamic.literal(
      "data" -> data.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudWatchLogsEventData]
  }
}

@js.native
trait CloudWatchLogsDecodedData extends js.Object {
  var owner: String = js.native
  var logGroup: String = js.native
  var logStream: String = js.native
  var subscriptionFilters: js.Array[String] = js.native
  var messageType: String = js.native
  var logEvents: js.Array[CloudWatchLogsLogEvent] = js.native
}

object CloudWatchLogsDecodedData {
  def apply(
      owner: String,
      logGroup: String,
      logStream: String,
      subscriptionFilters: js.Array[String],
      messageType: String,
      logEvents: js.Array[CloudWatchLogsLogEvent]
  ): CloudWatchLogsDecodedData = {
    val _obj$ = js.Dynamic.literal(
      "owner" -> owner.asInstanceOf[js.Any],
      "logGroup" -> logGroup.asInstanceOf[js.Any],
      "logStream" -> logStream.asInstanceOf[js.Any],
      "subscriptionFilters" -> subscriptionFilters.asInstanceOf[js.Any],
      "messageType" -> messageType.asInstanceOf[js.Any],
      "logEvents" -> logEvents.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudWatchLogsDecodedData]
  }
}

@js.native
trait CloudWatchLogsLogEvent extends js.Object {
  var id: String = js.native
  var timestamp: Double = js.native
  var message: String = js.native
  var extractedFields: js.UndefOr[CloudWatchLogsLogEvent.ExtractedFields] =
    js.native
}

object CloudWatchLogsLogEvent {
  def apply(
      id: String,
      timestamp: Double,
      message: String,
      extractedFields: js.UndefOr[CloudWatchLogsLogEvent.ExtractedFields] =
        js.undefined
  ): CloudWatchLogsLogEvent = {
    val _obj$ = js.Dynamic.literal(
      "id" -> id.asInstanceOf[js.Any],
      "timestamp" -> timestamp.asInstanceOf[js.Any],
      "message" -> message.asInstanceOf[js.Any]
    )
    extractedFields.foreach(_v =>
      _obj$.updateDynamic("extractedFields")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[CloudWatchLogsLogEvent]
  }
  type ExtractedFields = js.Dictionary[String]
}
