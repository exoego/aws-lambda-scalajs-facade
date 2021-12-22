package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait CodePipelineCloudWatchActionEvent extends js.Object {
  var version: String = js.native
  var id: String = js.native
  var `detail-type`: literal.CodePipelineCloudWatchActionDetailType = js.native
  var source: literal.CodePipelineCloudWatchActionSource = js.native
  var account: String = js.native
  var time: String = js.native
  var region: String = js.native
  var resources: js.Array[String] = js.native
  var detail: CodePipelineCloudWatchActionEvent.Detail = js.native
}

object CodePipelineCloudWatchActionEvent {
  def apply(
      version: String,
      id: String,
      `detail-type`: literal.CodePipelineCloudWatchActionDetailType,
      account: String,
      time: String,
      region: String,
      resources: js.Array[String],
      detail: CodePipelineCloudWatchActionEvent.Detail
  ): CodePipelineCloudWatchActionEvent = {
    val _obj$ = js.Dynamic.literal(
      "version" -> version.asInstanceOf[js.Any],
      "id" -> id.asInstanceOf[js.Any],
      "detail-type" -> `detail-type`.asInstanceOf[js.Any],
      "source" -> "aws.codepipeline",
      "account" -> account.asInstanceOf[js.Any],
      "time" -> time.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "resources" -> resources.asInstanceOf[js.Any],
      "detail" -> detail.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CodePipelineCloudWatchActionEvent]
  }

  @js.native
  trait Detail extends js.Object {
    var pipeline: String = js.native
    var version: Double = js.native
    var `execution-id`: String = js.native
    var stage: String = js.native
    var action: String = js.native
    var state: literal.CodePipelineActionState = js.native
    var `type`: Detail.Type = js.native
  }

  object Detail {
    def apply(
        pipeline: String,
        version: Double,
        `execution-id`: String,
        stage: String,
        action: String,
        state: literal.CodePipelineActionState,
        `type`: Detail.Type
    ): Detail = {
      val _obj$ = js.Dynamic.literal(
        "pipeline" -> pipeline.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any],
        "execution-id" -> `execution-id`.asInstanceOf[js.Any],
        "stage" -> stage.asInstanceOf[js.Any],
        "action" -> action.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[Detail]
    }

    @js.native
    trait Type extends js.Object {
      var owner: literal.CodePipelineCloudWatchActionDetailTypeOwner = js.native
      var category: literal.CodePipelineActionCategory = js.native
      var provider: String = js.native
      var version: Double = js.native
    }

    object Type {
      def apply(
          owner: literal.CodePipelineCloudWatchActionDetailTypeOwner,
          category: literal.CodePipelineActionCategory,
          provider: String,
          version: Double
      ): Type = {
        val _obj$ = js.Dynamic.literal(
          "owner" -> owner.asInstanceOf[js.Any],
          "category" -> category.asInstanceOf[js.Any],
          "provider" -> provider.asInstanceOf[js.Any],
          "version" -> version.asInstanceOf[js.Any]
        )
        _obj$.asInstanceOf[Type]
      }
    }
  }
}
