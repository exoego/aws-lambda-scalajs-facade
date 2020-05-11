package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait ScheduledEvent extends EventBridgeEvent[String, js.Any]

object ScheduledEvent {
  def apply(
      account: String,
      region: String,
      detail: js.Any,
      source: String,
      time: String,
      id: String,
      resources: js.Array[String]
  ): ScheduledEvent = {
    val _obj$ = js.Dynamic.literal(
      "account" -> account.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "detail" -> detail.asInstanceOf[js.Any],
      "detail-type" -> "Scheduled Event",
      "source" -> source.asInstanceOf[js.Any],
      "time" -> time.asInstanceOf[js.Any],
      "id" -> id.asInstanceOf[js.Any],
      "resources" -> resources.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[ScheduledEvent]
  }
}
