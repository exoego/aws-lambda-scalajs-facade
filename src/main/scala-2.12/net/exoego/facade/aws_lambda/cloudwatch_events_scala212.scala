package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait ScheduledEvent[T] extends EventBridgeEvent[String, T]

object ScheduledEvent {
  def apply[T](
      account: String,
      region: String,
      detail: T,
      source: String,
      version: String,
      time: String,
      id: String,
      resources: js.Array[String]
  ): ScheduledEvent[T] = {
    val _obj$ = js.Dynamic.literal(
      "account" -> account.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "detail" -> detail.asInstanceOf[js.Any],
      "detail-type" -> "Scheduled Event",
      "version" -> version.asInstanceOf[js.Any],
      "source" -> source.asInstanceOf[js.Any],
      "time" -> time.asInstanceOf[js.Any],
      "id" -> id.asInstanceOf[js.Any],
      "resources" -> resources.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[ScheduledEvent[T]]
  }
}
