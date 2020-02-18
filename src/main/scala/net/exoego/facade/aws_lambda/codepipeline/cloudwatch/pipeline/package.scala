package net.exoego.facade.aws_lambda.codepipeline.cloudwatch

import net.exoego.facade.aws_lambda.{AsyncHandler, Handler}

package object pipeline {
  type CodePipelineState = String
  type CodePipelineCloudWatchPipelineHandler =
    Handler[CodePipelineCloudWatchPipelineEvent, Unit]
  type AsyncCodePipelineCloudWatchPipelineHandler =
    AsyncHandler[CodePipelineCloudWatchPipelineEvent, Unit]
}
