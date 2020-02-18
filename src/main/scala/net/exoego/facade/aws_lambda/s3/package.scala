package net.exoego.facade.aws_lambda

package object s3 {
  type S3CreateEvent = S3Event
  type S3Handler = Handler[S3Event, Unit]
  type AsyncS3Handler = AsyncHandler[S3Event, Unit]
}
