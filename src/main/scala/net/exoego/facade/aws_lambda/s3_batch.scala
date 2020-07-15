package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory
import scala.scalajs.js
import scala.scalajs.js.|

@Factory
trait S3BatchEvent extends js.Object {
  var invocationSchemaVersion: String
  var invocationId: String
  var job: S3BatchEventJob
  var tasks: js.Array[S3BatchEventTask]
}

@Factory
trait S3BatchEventJob extends js.Object {
  var id: String
}

@Factory
trait S3BatchEventTask extends js.Object {
  var taskId: String
  var s3Key: String
  var s3VersionId: String | Null
  var s3BucketArn: String
}

@Factory
trait S3BatchResult extends js.Object {
  var invocationSchemaVersion: String
  var treatMissingKeysAs: S3BatchResultResultCode
  var invocationId: String
  var results: js.Array[S3BatchResultResult]
}

@Factory
trait S3BatchResultResult extends js.Object {
  var taskId: String
  var resultCode: S3BatchResultResultCode
  var resultString: String
}
