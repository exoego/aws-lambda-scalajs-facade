package net.exoego.facade.aws_lambda.cloudwatch

import net.exoego.facade.aws_lambda.{AsyncHandler, Handler}

package object events {
  type ScheduledHandler = Handler[ScheduledEvent, Unit]
  type AsyncScheduledHandler = AsyncHandler[ScheduledEvent, Unit]
}
