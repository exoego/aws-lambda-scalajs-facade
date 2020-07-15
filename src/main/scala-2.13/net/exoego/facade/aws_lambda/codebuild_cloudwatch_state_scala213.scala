package net.exoego.facade.aws_lambda

import scala.scalajs.js

trait CodeBuildCloudWatchStateEvent
    extends EventBridgeEvent[
      "CodeBuild Build State Change",
      CodeBuildStateEventDetail
    ]

object CodeBuildCloudWatchStateEvent {
  def apply(
      account: String,
      region: String,
      detail: CodeBuildStateEventDetail,
      source: String,
      time: String,
      id: String,
      version: String,
      resources: js.Array[String]
  ): CodeBuildCloudWatchStateEvent = {
    val _obj$ = js.Dynamic.literal(
      "account" -> account.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "version" -> version.asInstanceOf[js.Any],
      "detail" -> detail.asInstanceOf[js.Any],
      "detail-type" -> "CodeBuild Build State Change",
      "source" -> source.asInstanceOf[js.Any],
      "time" -> time.asInstanceOf[js.Any],
      "id" -> id.asInstanceOf[js.Any],
      "resources" -> resources.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CodeBuildCloudWatchStateEvent]
  }
}
