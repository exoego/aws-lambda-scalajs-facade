package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory
import scala.scalajs.js

@Factory
trait S3EventRecordGlacierRestoreEventData extends js.Object {
  var lifecycleRestorationExpiryTime: String
  var lifecycleRestoreStorageClass: String
}

@Factory
trait S3EventRecordGlacierEventData extends js.Object {
  var restoreEventData: S3EventRecordGlacierRestoreEventData
}

@Factory
trait S3EventRecord extends js.Object {
  var eventVersion: String
  var eventSource: String
  var awsRegion: String
  var eventTime: String
  var eventName: String
  var userIdentity: S3EventRecord.UserIdentity
  var requestParameters: S3EventRecord.RequestParameters
  var responseElements: S3EventRecord.ResponseElements
  var s3: S3EventRecord.S3
  var glacierEventData: js.UndefOr[S3EventRecordGlacierEventData] = js.undefined
}

object S3EventRecord {
  @Factory(false)
  trait UserIdentity extends js.Object {
    var principalId: String
  }

  @Factory(false)
  trait RequestParameters extends js.Object {
    var sourceIPAddress: String
  }

  @Factory(false)
  trait ResponseElements extends js.Object {
    var `x-amz-request-id`: String
    var `x-amz-id-2`: String
  }

  @Factory(false)
  trait S3 extends js.Object {
    var s3SchemaVersion: String
    var configurationId: String
    var bucket: S3.Bucket
    var `object`: S3.Object
  }

  object S3 {
    @Factory(false)
    trait Bucket extends js.Object {
      var name: String
      var ownerIdentity: Bucket.OwnerIdentity
      var arn: String
    }

    object Bucket {
      @Factory(false)
      trait OwnerIdentity extends js.Object {
        var principalId: String
      }
    }

    @Factory(false)
    trait Object extends js.Object {
      var key: String
      var size: Double
      var eTag: String
      var versionId: js.UndefOr[String] = js.undefined
      var sequencer: String
    }
  }
}

@Factory
trait S3Event extends js.Object {
  var Records: js.Array[S3EventRecord]
}
