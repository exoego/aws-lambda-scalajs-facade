package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Callback-style handler
  *
  * @tparam TEvent
  * @tparam TResult
  */
trait Handler[TEvent, TResult] extends js.Object {
  @JSName("apply")
  def apply(event: TEvent, context: Context, callback: Callback[TResult]): Unit
}

/**
  * Asynchronous-style handler that returns js.Promise.
  * This can be used Node.js 8 runtime or more
  *
  * @tparam TEvent
  * @tparam TResult
  */
trait AsyncHandler[TEvent, TResult] extends js.Object {
  @JSName("apply")
  def apply(event: TEvent, context: Context): js.Promise[TResult]
}
