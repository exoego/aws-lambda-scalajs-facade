package net.exoego.facade.aws_lambda

import scala.scalajs.js

package object sqs {
  type SQSHandler = Handler[SQSEvent, Unit]
  type AsyncSQSHandler = AsyncHandler[SQSEvent, Unit]
  type SQSMessageAttributeDataType = String
  type SQSMessageAttributes = js.Dictionary[SQSMessageAttribute]
}
