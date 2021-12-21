package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait CloudFrontHeadersItem extends js.Object {
  var key: js.UndefOr[String] = js.native
  var value: String = js.native
}

@js.native
trait CloudFrontOrigin extends js.Object {
  var s3: js.UndefOr[CloudFrontS3Origin] = js.native
  var custom: js.UndefOr[CloudFrontCustomOrigin] = js.native
}

object CloudFrontOrigin {
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

@js.native
trait CloudFrontCustomOrigin extends js.Object {
  var customHeaders: CloudFrontHeaders = js.native
  var domainName: String = js.native
  var keepaliveTimeout: Double = js.native
  var path: String = js.native
  var port: Double = js.native
  var protocol: String = js.native
  var readTimeout: Double = js.native
  var sslProtocols: js.Array[String] = js.native
}

@js.native
trait CloudFrontS3Origin extends js.Object {
  var authMethod: String = js.native
  var customHeaders: CloudFrontHeaders = js.native
  var domainName: String = js.native
  var path: String = js.native
  var region: String = js.native
}

@js.native
trait CloudFrontResponse extends js.Object {
  var status: String = js.native
  var statusDescription: String = js.native
  var headers: CloudFrontHeaders = js.native
}

@js.native
trait CloudFrontRequest extends js.Object {
  var body: js.UndefOr[CloudFrontRequest.Body] = js.native
  def clientIp: String = js.native
  def method: String = js.native
  var uri: String = js.native
  var querystring: String = js.native
  var headers: CloudFrontHeaders = js.native
  var origin: js.UndefOr[CloudFrontOrigin] = js.native
}

object CloudFrontRequest {
  @js.native
  trait Body extends js.Object {
    var action: String = js.native
    var data: String = js.native
    var encoding: String = js.native
    def inputTruncated: Boolean = js.native
  }
}

@js.native
trait CloudFrontEvent extends js.Object {
  var config: CloudFrontEvent.Config = js.native
}

object CloudFrontEvent {
  @js.native
  trait Config extends js.Object {
    var distributionDomainName: String = js.native
    var distributionId: String = js.native
    var eventType: String = js.native
    var requestId: String = js.native
  }
}

@js.native
trait CloudFrontResultResponse extends js.Object {
  var status: String = js.native
  var statusDescription: js.UndefOr[String] = js.native
  var headers: js.UndefOr[CloudFrontHeaders] = js.native
  var bodyEncoding: js.UndefOr[String] = js.native
  var body: js.UndefOr[String] = js.native
}
