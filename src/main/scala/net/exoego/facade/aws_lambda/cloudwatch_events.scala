package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait ScheduledEvent extends js.Object {
  var account: String = js.native
  var region: String = js.native
  var detail: js.Dictionary[js.Any] = js.native
  var `detail-type`: String = js.native
  var source: String = js.native
  var time: String = js.native
  var id: String = js.native
  var resources: js.Array[String] = js.native
}

object ScheduledEvent {
  def apply(
      account: String,
      region: String,
      detail: js.Any,
      `detail-type`: String,
      source: String,
      time: String,
      id: String,
      resources: js.Array[String]
  ): ScheduledEvent = {
    val _obj$ = js.Dynamic.literal(
      "account" -> account.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "detail" -> detail.asInstanceOf[js.Any],
      "detail-type" -> `detail-type`.asInstanceOf[js.Any],
      "source" -> source.asInstanceOf[js.Any],
      "time" -> time.asInstanceOf[js.Any],
      "id" -> id.asInstanceOf[js.Any],
      "resources" -> resources.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[ScheduledEvent]
  }
}
