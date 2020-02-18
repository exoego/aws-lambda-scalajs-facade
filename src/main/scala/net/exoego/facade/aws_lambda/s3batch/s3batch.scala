package net.exoego.facade.aws_lambda.s3batch

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait S3BatchEvent extends js.Object {
  var invocationSchemaVersion: String = js.native
  var invocationId: String = js.native
  var job: S3BatchEventJob = js.native
  var tasks: js.Array[S3BatchEventTask] = js.native
}

object S3BatchEvent {
  def apply(
      invocationSchemaVersion: String,
      invocationId: String,
      job: S3BatchEventJob,
      tasks: js.Array[S3BatchEventTask]
  ): S3BatchEvent = {
    val _obj$ = js.Dynamic.literal(
      "invocationSchemaVersion" -> invocationSchemaVersion.asInstanceOf[js.Any],
      "invocationId" -> invocationId.asInstanceOf[js.Any],
      "job" -> job.asInstanceOf[js.Any],
      "tasks" -> tasks.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[S3BatchEvent]
  }
}

@js.native
trait S3BatchEventJob extends js.Object {
  var id: String = js.native
}

object S3BatchEventJob {
  def apply(
      id: String
  ): S3BatchEventJob = {
    val _obj$ = js.Dynamic.literal(
      "id" -> id.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[S3BatchEventJob]
  }
}

@js.native
trait S3BatchEventTask extends js.Object {
  var taskId: String = js.native
  var s3Key: String = js.native
  var s3VersionId: String | Null = js.native
  var s3BucketArn: String = js.native
}

object S3BatchEventTask {
  def apply(
      taskId: String,
      s3Key: String,
      s3BucketArn: String,
      s3VersionId: String | Null = null
  ): S3BatchEventTask = {
    val _obj$ = js.Dynamic.literal(
      "taskId" -> taskId.asInstanceOf[js.Any],
      "s3Key" -> s3Key.asInstanceOf[js.Any],
      "s3VersionId" -> s3VersionId.asInstanceOf[js.Any],
      "s3BucketArn" -> s3BucketArn.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[S3BatchEventTask]
  }
}

@js.native
trait S3BatchResult extends js.Object {
  var invocationSchemaVersion: String = js.native
  var treatMissingKeysAs: S3BatchResultResultCode = js.native
  var invocationId: String = js.native
  var results: js.Array[S3BatchResultResult] = js.native
}

object S3BatchResult {
  def apply(
      invocationSchemaVersion: String,
      treatMissingKeysAs: S3BatchResultResultCode,
      invocationId: String,
      results: js.Array[S3BatchResultResult]
  ): S3BatchResult = {
    val _obj$ = js.Dynamic.literal(
      "invocationSchemaVersion" -> invocationSchemaVersion.asInstanceOf[js.Any],
      "treatMissingKeysAs" -> treatMissingKeysAs.asInstanceOf[js.Any],
      "invocationId" -> invocationId.asInstanceOf[js.Any],
      "results" -> results.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[S3BatchResult]
  }
}

@js.native
trait S3BatchResultResult extends js.Object {
  var taskId: String = js.native
  var resultCode: S3BatchResultResultCode = js.native
  var resultString: String = js.native
}

object S3BatchResultResult {
  def apply(
      taskId: String,
      resultCode: S3BatchResultResultCode,
      resultString: String
  ): S3BatchResultResult = {
    val _obj$ = js.Dynamic.literal(
      "taskId" -> taskId.asInstanceOf[js.Any],
      "resultCode" -> resultCode.asInstanceOf[js.Any],
      "resultString" -> resultString.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[S3BatchResultResult]
  }
}
