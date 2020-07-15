package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js

@Factory
trait CodePipelineCloudWatchStageEvent extends js.Object {
  var version: String
  var id: String
  var `detail-type`: String
  var source: String
  var account: String
  var time: String
  var region: String
  var resources: js.Array[String]
  var detail: CodePipelineCloudWatchStageEvent.Detail
}

object CodePipelineCloudWatchStageEvent {
  @Factory(false)
  trait Detail extends js.Object {
    var pipeline: String
    var version: Double
    var `execution-id`: String
    var stage: String
    var state: CodePipelineStageState
  }
}
