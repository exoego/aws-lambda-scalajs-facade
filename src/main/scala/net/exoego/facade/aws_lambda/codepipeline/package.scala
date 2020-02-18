package net.exoego.facade.aws_lambda

package object codepipeline {
  type CodePipelineHandler = Handler[CodePipelineEvent, Unit]
  type AsyncCodePipelineHandler = AsyncHandler[CodePipelineEvent, Unit]
  type ArtifactLocation = S3ArtifactStore
}
