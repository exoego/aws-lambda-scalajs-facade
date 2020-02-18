package net.exoego.facade.aws_lambda

package object firehose {
  type FirehoseRecordTransformationStatus = String
  type FirehoseTransformationHandler =
    Handler[FirehoseTransformationEvent, FirehoseTransformationResult]
  type AsyncFirehoseTransformationHandler =
    AsyncHandler[FirehoseTransformationEvent, FirehoseTransformationResult]

}
