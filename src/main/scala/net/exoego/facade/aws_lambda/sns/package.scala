package net.exoego.facade.aws_lambda

import scala.scalajs.js

package object sns {
  type SNSHandler = Handler[SNSEvent, Unit]
  type AsyncSNSHandler = AsyncHandler[SNSEvent, Unit]
  type SNSMessageAttributes = js.Dictionary[SNSMessageAttribute]

}
