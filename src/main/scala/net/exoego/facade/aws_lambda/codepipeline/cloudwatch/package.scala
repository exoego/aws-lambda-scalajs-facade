package net.exoego.facade.aws_lambda.codepipeline

import net.exoego.facade.aws_lambda.{AsyncHandler, Handler}

import scala.scalajs.js.|

package object cloudwatch {
  type CodePipelineCloudWatchEvent =
    pipeline.CodePipelineCloudWatchPipelineEvent | stage.CodePipelineCloudWatchStageEvent | action.CodePipelineCloudWatchActionEvent
  type CodePipelineCloudWatchHandler =
    Handler[CodePipelineCloudWatchEvent, Unit]
  type AsyncCodePipelineCloudWatchHandler =
    AsyncHandler[CodePipelineCloudWatchEvent, Unit]
}
