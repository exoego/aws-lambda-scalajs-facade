package net.exoego.facade.aws_lambda.codepipeline.cloudwatch

import net.exoego.facade.aws_lambda.{Handler, AsyncHandler}

package object action {
  type CodePipelineCloudWatchActionHandler =
    Handler[CodePipelineCloudWatchActionEvent, Unit]
  type AsyncCodePipelineCloudWatchActionHandler =
    AsyncHandler[CodePipelineCloudWatchActionEvent, Unit]
  type CodePipelineActionCategory = String
  type CodePipelineActionState = String
}
