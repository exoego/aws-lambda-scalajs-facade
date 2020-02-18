package net.exoego.facade.aws_lambda.codepipeline.cloudwatch

import net.exoego.facade.aws_lambda.{AsyncHandler, Handler}

package object stage {
  type CodePipelineStageState = String
  type CodePipelineCloudWatchStageHandler =
    Handler[CodePipelineCloudWatchStageEvent, Unit]
  type AsyncCodePipelineCloudWatchStageHandler =
    AsyncHandler[CodePipelineCloudWatchStageEvent, Unit]
}
