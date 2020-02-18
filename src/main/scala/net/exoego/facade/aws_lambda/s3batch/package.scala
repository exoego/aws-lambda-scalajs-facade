package net.exoego.facade.aws_lambda

package object s3batch {
  type S3BatchHandler = Handler[S3BatchEvent, S3BatchResult]
  type AsyncS3BatchHandler = AsyncHandler[S3BatchEvent, S3BatchResult]
  type S3BatchResultResultCode = String
}
