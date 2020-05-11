package net.exoego.facade.aws_lambda
import scala.scalajs.js

trait EventBridgeEvent[TDetailType <: String, TDetail] extends js.Object {
  var id: String
  var version: String
  var account: String
  var time: String
  var region: String
  var resources: js.Array[String]
  var source: String
  var `detail-type`: TDetailType
  var detail: TDetail
}

object EventBridgeEvent {
  def apply[TDetailType <: String, TDetail](
      id: String,
      version: String,
      account: String,
      time: String,
      region: String,
      resources: js.Array[String],
      source: String,
      `detail-type`: TDetailType,
      detail: TDetail
  ): EventBridgeEvent[TDetailType, TDetail] = {
    val _obj$ = js.Dynamic.literal(
      "id" -> id.asInstanceOf[js.Any],
      "version" -> version.asInstanceOf[js.Any],
      "account" -> account.asInstanceOf[js.Any],
      "time" -> time.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "resources" -> resources.asInstanceOf[js.Any],
      "source" -> source.asInstanceOf[js.Any],
      "detail-type" -> `detail-type`.asInstanceOf[js.Any],
      "detail" -> detail.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[EventBridgeEvent[TDetailType, TDetail]]
  }
}
