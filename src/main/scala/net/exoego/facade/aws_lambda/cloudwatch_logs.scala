package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait CloudWatchLogsEvent extends js.Object {
  var awslogs: CloudWatchLogsEventData = js.native
}

@js.native
trait CloudWatchLogsEventData extends js.Object {
  var data: String = js.native
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

@js.native
trait CloudWatchLogsLogEvent extends js.Object {
  var id: String = js.native
  var timestamp: Double = js.native
  var message: String = js.native
  var extractedFields: js.UndefOr[CloudWatchLogsLogEvent.ExtractedFields] = js.native
}

object CloudWatchLogsLogEvent {
  type ExtractedFields = js.Dictionary[String]
}
