package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js

@Factory
@js.native
trait CodePipelineCloudWatchActionEvent extends js.Object {
  var version: String = js.native
  var id: String = js.native
  var `detail-type`: String = js.native
  var source: String = js.native
  var account: String = js.native
  var time: String = js.native
  var region: String = js.native
  var resources: js.Array[String] = js.native
  var detail: CodePipelineCloudWatchActionEvent.Detail = js.native
}

object CodePipelineCloudWatchActionEvent {
  @Factory(false)
  @js.native
  trait Detail extends js.Object {
    var pipeline: String = js.native
    var version: Double = js.native
    var `execution-id`: String = js.native
    var stage: String = js.native
    var action: String = js.native
    var state: CodePipelineActionState = js.native
    var `type`: Detail.Type = js.native
  }

  object Detail {
    @Factory(false)
    @js.native
    trait Type extends js.Object {
      var owner: String = js.native
      var category: CodePipelineActionCategory = js.native
      var provider: String = js.native
      var version: Double = js.native
    }
  }
}
