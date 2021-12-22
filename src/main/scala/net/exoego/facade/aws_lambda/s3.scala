package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait S3EventRecordGlacierRestoreEventData extends js.Object {
  var lifecycleRestorationExpiryTime: String = js.native
  var lifecycleRestoreStorageClass: String = js.native
}

object S3EventRecordGlacierRestoreEventData {
  def apply(
      lifecycleRestorationExpiryTime: String,
      lifecycleRestoreStorageClass: String
  ): S3EventRecordGlacierRestoreEventData = {
    val _obj$ = js.Dynamic.literal(
      "lifecycleRestorationExpiryTime" -> lifecycleRestorationExpiryTime.asInstanceOf[js.Any],
      "lifecycleRestoreStorageClass" -> lifecycleRestoreStorageClass.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[S3EventRecordGlacierRestoreEventData]
  }
}

@js.native
trait S3EventRecordGlacierEventData extends js.Object {
  var restoreEventData: S3EventRecordGlacierRestoreEventData = js.native
}

object S3EventRecordGlacierEventData {
  def apply(
      restoreEventData: S3EventRecordGlacierRestoreEventData
  ): S3EventRecordGlacierEventData = {
    val _obj$ = js.Dynamic.literal(
      "restoreEventData" -> restoreEventData.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[S3EventRecordGlacierEventData]
  }
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
  def apply(
      eventVersion: String,
      eventSource: String,
      awsRegion: String,
      eventTime: String,
      eventName: String,
      userIdentity: S3EventRecord.UserIdentity,
      requestParameters: S3EventRecord.RequestParameters,
      responseElements: S3EventRecord.ResponseElements,
      s3: S3EventRecord.S3,
      glacierEventData: js.UndefOr[S3EventRecordGlacierEventData] = js.undefined
  ): S3EventRecord = {
    val _obj$ = js.Dynamic.literal(
      "eventVersion" -> eventVersion.asInstanceOf[js.Any],
      "eventSource" -> eventSource.asInstanceOf[js.Any],
      "awsRegion" -> awsRegion.asInstanceOf[js.Any],
      "eventTime" -> eventTime.asInstanceOf[js.Any],
      "eventName" -> eventName.asInstanceOf[js.Any],
      "userIdentity" -> userIdentity.asInstanceOf[js.Any],
      "requestParameters" -> requestParameters.asInstanceOf[js.Any],
      "responseElements" -> responseElements.asInstanceOf[js.Any],
      "s3" -> s3.asInstanceOf[js.Any]
    )
    glacierEventData.foreach(_v => _obj$.updateDynamic("glacierEventData")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[S3EventRecord]
  }

  @js.native
  trait UserIdentity extends js.Object {
    var principalId: String = js.native
  }

  object UserIdentity {
    def apply(
        principalId: String
    ): UserIdentity = {
      val _obj$ = js.Dynamic.literal(
        "principalId" -> principalId.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[UserIdentity]
    }
  }

  @js.native
  trait RequestParameters extends js.Object {
    var sourceIPAddress: String = js.native
  }

  object RequestParameters {
    def apply(
        sourceIPAddress: String
    ): RequestParameters = {
      val _obj$ = js.Dynamic.literal(
        "sourceIPAddress" -> sourceIPAddress.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[RequestParameters]
    }
  }

  @js.native
  trait ResponseElements extends js.Object {
    var `x-amz-request-id`: String = js.native
    var `x-amz-id-2`: String = js.native
  }

  object ResponseElements {
    def apply(
        `x-amz-request-id`: String,
        `x-amz-id-2`: String
    ): ResponseElements = {
      val _obj$ = js.Dynamic.literal(
        "x-amz-request-id" -> `x-amz-request-id`.asInstanceOf[js.Any],
        "x-amz-id-2" -> `x-amz-id-2`.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[ResponseElements]
    }
  }

  @js.native
  trait S3 extends js.Object {
    var s3SchemaVersion: String = js.native
    var configurationId: String = js.native
    var bucket: S3.Bucket = js.native
    var `object`: S3.Object = js.native
  }

  object S3 {
    def apply(
        s3SchemaVersion: String,
        configurationId: String,
        bucket: S3.Bucket,
        `object`: S3.Object
    ): S3 = {
      val _obj$ = js.Dynamic.literal(
        "s3SchemaVersion" -> s3SchemaVersion.asInstanceOf[js.Any],
        "configurationId" -> configurationId.asInstanceOf[js.Any],
        "bucket" -> bucket.asInstanceOf[js.Any],
        "object" -> `object`.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[S3]
    }

    @js.native
    trait Bucket extends js.Object {
      var name: String = js.native
      var ownerIdentity: Bucket.OwnerIdentity = js.native
      var arn: String = js.native
    }

    object Bucket {
      def apply(
          name: String,
          ownerIdentity: Bucket.OwnerIdentity,
          arn: String
      ): Bucket = {
        val _obj$ = js.Dynamic.literal(
          "name" -> name.asInstanceOf[js.Any],
          "ownerIdentity" -> ownerIdentity.asInstanceOf[js.Any],
          "arn" -> arn.asInstanceOf[js.Any]
        )
        _obj$.asInstanceOf[Bucket]
      }

      @js.native
      trait OwnerIdentity extends js.Object {
        var principalId: String = js.native
      }

      object OwnerIdentity {
        def apply(
            principalId: String
        ): OwnerIdentity = {
          val _obj$ = js.Dynamic.literal(
            "principalId" -> principalId.asInstanceOf[js.Any]
          )
          _obj$.asInstanceOf[OwnerIdentity]
        }
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

    object Object {
      def apply(
          key: String,
          size: Double,
          eTag: String,
          sequencer: String,
          versionId: js.UndefOr[String] = js.undefined
      ): Object = {
        val _obj$ = js.Dynamic.literal(
          "key" -> key.asInstanceOf[js.Any],
          "size" -> size.asInstanceOf[js.Any],
          "eTag" -> eTag.asInstanceOf[js.Any],
          "sequencer" -> sequencer.asInstanceOf[js.Any]
        )
        versionId.foreach(_v => _obj$.updateDynamic("versionId")(_v.asInstanceOf[js.Any]))
        _obj$.asInstanceOf[Object]
      }
    }
  }
}

@js.native
trait S3Event extends js.Object {
  var Records: js.Array[S3EventRecord] = js.native
}

object S3Event {
  def apply(
      Records: js.Array[S3EventRecord]
  ): S3Event = {
    val _obj$ = js.Dynamic.literal(
      "Records" -> Records.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[S3Event]
  }
}
