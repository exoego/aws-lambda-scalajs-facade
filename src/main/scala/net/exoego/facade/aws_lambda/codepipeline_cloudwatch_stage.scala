package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js

@Factory
@js.native
trait CodePipelineCloudWatchStageEvent extends js.Object {
  var version: String = js.native
  var id: String = js.native
  var `detail-type`: String = js.native
  var source: String = js.native
  var account: String = js.native
  var time: String = js.native
  var region: String = js.native
  var resources: js.Array[String] = js.native
  var detail: CodePipelineCloudWatchStageEvent.Detail = js.native
}

object CodePipelineCloudWatchStageEvent {
  @Factory(false)
  @js.native
  trait Detail extends js.Object {
    var pipeline: String = js.native
    var version: Double = js.native
    var `execution-id`: String = js.native
    var stage: String = js.native
    var state: CodePipelineStageState = js.native
  }
}
