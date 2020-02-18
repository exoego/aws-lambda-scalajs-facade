package net.exoego.facade.aws_lambda.cloudwatch

import net.exoego.facade.aws_lambda.{AsyncHandler, Handler}

package object logs {
  type CloudWatchLogsHandler = Handler[CloudWatchLogsEvent, Unit]
  type AsyncCloudWatchLogsHandler = AsyncHandler[CloudWatchLogsEvent, Unit]
}
