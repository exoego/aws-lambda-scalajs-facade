package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait S3EventRecordGlacierRestoreEventData extends js.Object {
  var lifecycleRestorationExpiryTime: String = js.native
  var lifecycleRestoreStorageClass: String = js.native
}

@js.native
trait S3EventRecordGlacierEventData extends js.Object {
  var restoreEventData: S3EventRecordGlacierRestoreEventData = js.native
}

@js.native
trait S3EventRecord extends js.Object {
  var eventVersion: String = js.native
  var eventSource: String = js.native
  var awsRegion: String = js.native
  var eventTime: String = js.native
  var eventName: String = js.native
  var userIdentity: S3EventRecord.UserIdentity = js.native
  var requestParameters: S3EventRecord.RequestParameters = js.native
  var responseElements: S3EventRecord.ResponseElements = js.native
  var s3: S3EventRecord.S3 = js.native
  var glacierEventData: js.UndefOr[S3EventRecordGlacierEventData] = js.native
}

object S3EventRecord {
  @js.native
  trait UserIdentity extends js.Object {
    var principalId: String = js.native
  }

  @js.native
  trait RequestParameters extends js.Object {
    var sourceIPAddress: String = js.native
  }

  @js.native
  trait ResponseElements extends js.Object {
    var `x-amz-request-id`: String = js.native
    var `x-amz-id-2`: String = js.native
  }

  @js.native
  trait S3 extends js.Object {
    var s3SchemaVersion: String = js.native
    var configurationId: String = js.native
    var bucket: S3.Bucket = js.native
    var `object`: S3.Object = js.native
  }

  object S3 {
    @js.native
    trait Bucket extends js.Object {
      var name: String = js.native
      var ownerIdentity: Bucket.OwnerIdentity = js.native
      var arn: String = js.native
    }

    object Bucket {
      @js.native
      trait OwnerIdentity extends js.Object {
        var principalId: String = js.native
      }
    }

    @js.native
    trait Object extends js.Object {
      var key: String = js.native
      var size: Double = js.native
      var eTag: String = js.native
      var versionId: js.UndefOr[String] = js.native
      var sequencer: String = js.native
    }
  }
}

@js.native
trait S3Event extends js.Object {
  var Records: js.Array[S3EventRecord] = js.native
}
