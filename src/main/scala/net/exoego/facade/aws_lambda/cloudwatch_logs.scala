package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js

@Factory
trait CloudWatchLogsEvent extends js.Object {
  var awslogs: CloudWatchLogsEventData
}

@Factory
trait CloudWatchLogsEventData extends js.Object {
  var data: String
}

@Factory
trait CloudWatchLogsDecodedData extends js.Object {
  var owner: String
  var logGroup: String
  var logStream: String
  var subscriptionFilters: js.Array[String]
  var messageType: String
  var logEvents: js.Array[CloudWatchLogsLogEvent]
}

@Factory
trait CloudWatchLogsLogEvent extends js.Object {
  var id: String
  var timestamp: Double
  var message: String
  var extractedFields: js.UndefOr[CloudWatchLogsLogEvent.ExtractedFields] =
    js.undefined
}

object CloudWatchLogsLogEvent {
  type ExtractedFields = js.Dictionary[String]
}
