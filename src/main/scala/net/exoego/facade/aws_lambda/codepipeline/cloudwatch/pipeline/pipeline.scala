package net.exoego.facade.aws_lambda.codepipeline.cloudwatch.pipeline

import scala.scalajs.js

@js.native
trait CodePipelineCloudWatchPipelineEvent extends js.Object {
  var version: String = js.native
  var id: String = js.native
  var `detail-type`: String = js.native
  var source: String = js.native
  var account: String = js.native
  var time: String = js.native
  var region: String = js.native
  var resources: js.Array[String] = js.native
  var detail: CodePipelineCloudWatchPipelineEvent.Detail = js.native
}

object CodePipelineCloudWatchPipelineEvent {
  def apply(
      version: String,
      id: String,
      `detail-type`: String,
      source: String,
      account: String,
      time: String,
      region: String,
      resources: js.Array[String],
      detail: CodePipelineCloudWatchPipelineEvent.Detail
  ): CodePipelineCloudWatchPipelineEvent = {
    val _obj$ = js.Dynamic.literal(
      "version" -> version.asInstanceOf[js.Any],
      "id" -> id.asInstanceOf[js.Any],
      "detail-type" -> `detail-type`.asInstanceOf[js.Any],
      "source" -> source.asInstanceOf[js.Any],
      "account" -> account.asInstanceOf[js.Any],
      "time" -> time.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "resources" -> resources.asInstanceOf[js.Any],
      "detail" -> detail.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CodePipelineCloudWatchPipelineEvent]
  }

  @js.native
  trait Detail extends js.Object {
    var pipeline: String = js.native
    var version: Double = js.native
    var state: CodePipelineState = js.native
    var `execution-id`: String = js.native
  }

  object Detail {
    def apply(
        pipeline: String,
        version: Double,
        state: CodePipelineState,
        `execution-id`: String
    ): Detail = {
      val _obj$ = js.Dynamic.literal(
        "pipeline" -> pipeline.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any],
        "execution-id" -> `execution-id`.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[Detail]
    }
  }
}
