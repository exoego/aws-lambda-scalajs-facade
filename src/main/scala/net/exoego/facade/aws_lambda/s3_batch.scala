package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory
import scala.scalajs.js
import scala.scalajs.js.|

@Factory
@js.native
trait S3BatchEvent extends js.Object {
  var invocationSchemaVersion: String = js.native
  var invocationId: String = js.native
  var job: S3BatchEventJob = js.native
  var tasks: js.Array[S3BatchEventTask] = js.native
}

@Factory
@js.native
trait S3BatchEventJob extends js.Object {
  var id: String = js.native
}

@Factory
@js.native
trait S3BatchEventTask extends js.Object {
  var taskId: String = js.native
  var s3Key: String = js.native
  var s3VersionId: String | Null = js.native
  var s3BucketArn: String = js.native
}

@Factory
@js.native
trait S3BatchResult extends js.Object {
  var invocationSchemaVersion: String = js.native
  var treatMissingKeysAs: S3BatchResultResultCode = js.native
  var invocationId: String = js.native
  var results: js.Array[S3BatchResultResult] = js.native
}

@Factory
@js.native
trait S3BatchResultResult extends js.Object {
  var taskId: String = js.native
  var resultCode: S3BatchResultResultCode = js.native
  var resultString: String = js.native
}
