package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js

@Factory
trait CloudFrontHeadersItem extends js.Object {
  var key: js.UndefOr[String]
  var value: String
}

trait CloudFrontOrigin extends js.Object {
  var s3: js.UndefOr[CloudFrontS3Origin]
  var custom: js.UndefOr[CloudFrontCustomOrigin]
}

object CloudFrontOrigin {
  @deprecated("Use CloudFrontOrigin.ofS3 instead", "0.10.0")
  def apply(s3: CloudFrontS3Origin): CloudFrontOrigin = ofS3(s3)
  @deprecated("Use CloudFrontOrigin.ofCustom instead", "0.10.0")
  def apply(custom: CloudFrontCustomOrigin): CloudFrontOrigin = ofCustom(custom)

  def ofS3(s3: CloudFrontS3Origin): CloudFrontOrigin = {
    val _obj$ = js.Dynamic.literal(
      "s3" -> s3
    )
    _obj$.asInstanceOf[CloudFrontOrigin]
  }
  def ofCustom(custom: CloudFrontCustomOrigin): CloudFrontOrigin = {
    val _obj$ = js.Dynamic.literal(
      "custom" -> custom
    )
    _obj$.asInstanceOf[CloudFrontOrigin]
  }
}

@Factory
trait CloudFrontCustomOrigin extends js.Object {
  var customHeaders: CloudFrontHeaders
  var domainName: String
  var keepaliveTimeout: Double
  var path: String
  var port: Double
  var protocol: String
  var readTimeout: Double
  var sslProtocols: js.Array[String]
}

@Factory
trait CloudFrontS3Origin extends js.Object {
  var authMethod: String
  var customHeaders: CloudFrontHeaders
  var domainName: String
  var path: String
  var region: String
}

@Factory
trait CloudFrontResponse extends js.Object {
  var status: String
  var statusDescription: String
  var headers: CloudFrontHeaders
}

@Factory(false)
trait CloudFrontRequest extends js.Object {
  var body: js.UndefOr[CloudFrontRequest.Body] = js.undefined
  def clientIp: String
  def method: String
  var uri: String
  var querystring: String
  var headers: CloudFrontHeaders
  var origin: js.UndefOr[CloudFrontOrigin] = js.undefined
}

object CloudFrontRequest {
  @Factory(false)
  trait Body extends js.Object {
    var action: String
    var data: String
    var encoding: String
    def inputTruncated: Boolean
  }
}

@Factory
trait CloudFrontEvent extends js.Object {
  var config: CloudFrontEvent.Config
}

object CloudFrontEvent {
  @Factory(false)
  trait Config extends js.Object {
    var distributionDomainName: String
    var distributionId: String
    var eventType: String
    var requestId: String
  }
}

@Factory
trait CloudFrontResultResponse extends js.Object {
  var status: String
  var statusDescription: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[CloudFrontHeaders] = js.undefined
  var bodyEncoding: js.UndefOr[String] = js.undefined
  var body: js.UndefOr[String] = js.undefined
}
