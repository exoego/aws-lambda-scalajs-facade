package net.exoego.facade.aws_lambda

package object kinesisstream {
  type KinesisStreamHandler = Handler[KinesisStreamEvent, Unit]
  type AsyncKinesisStreamHandler = AsyncHandler[KinesisStreamEvent, Unit]
}
