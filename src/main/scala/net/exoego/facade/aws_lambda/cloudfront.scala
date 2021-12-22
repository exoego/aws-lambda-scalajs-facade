package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait CloudFrontHeadersItem extends js.Object {
  var key: js.UndefOr[String] = js.native
  var value: String = js.native
}

object CloudFrontHeadersItem {
  def apply(
      value: String,
      key: js.UndefOr[String] = js.undefined
  ): CloudFrontHeadersItem = {
    val _obj$ = js.Dynamic.literal(
      "value" -> value.asInstanceOf[js.Any]
    )
    key.foreach(_v => _obj$.updateDynamic("key")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CloudFrontHeadersItem]
  }
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
  var protocol: literal.CloudFrontCustomOriginProtocol = js.native
  var readTimeout: Double = js.native
  var sslProtocols: js.Array[String] = js.native
}

object CloudFrontCustomOrigin {
  def apply(
      customHeaders: CloudFrontHeaders,
      domainName: String,
      keepaliveTimeout: Double,
      path: String,
      port: Double,
      protocol: String,
      readTimeout: Double,
      sslProtocols: js.Array[String]
  ): CloudFrontCustomOrigin = {
    val _obj$ = js.Dynamic.literal(
      "customHeaders" -> customHeaders.asInstanceOf[js.Any],
      "domainName" -> domainName.asInstanceOf[js.Any],
      "keepaliveTimeout" -> keepaliveTimeout.asInstanceOf[js.Any],
      "path" -> path.asInstanceOf[js.Any],
      "port" -> port.asInstanceOf[js.Any],
      "protocol" -> protocol.asInstanceOf[js.Any],
      "readTimeout" -> readTimeout.asInstanceOf[js.Any],
      "sslProtocols" -> sslProtocols.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFrontCustomOrigin]
  }
}

@js.native
trait CloudFrontS3Origin extends js.Object {
  var authMethod: literal.CloudFrontS3OriginAuthMethod = js.native
  var customHeaders: CloudFrontHeaders = js.native
  var domainName: String = js.native
  var path: String = js.native
  var region: String = js.native
}

object CloudFrontS3Origin {
  def apply(
      authMethod: String,
      customHeaders: CloudFrontHeaders,
      domainName: String,
      path: String,
      region: String
  ): CloudFrontS3Origin = {
    val _obj$ = js.Dynamic.literal(
      "authMethod" -> authMethod.asInstanceOf[js.Any],
      "customHeaders" -> customHeaders.asInstanceOf[js.Any],
      "domainName" -> domainName.asInstanceOf[js.Any],
      "path" -> path.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFrontS3Origin]
  }
}

@js.native
trait CloudFrontResponse extends js.Object {
  var status: String = js.native
  var statusDescription: String = js.native
  var headers: CloudFrontHeaders = js.native
}

object CloudFrontResponse {
  def apply(
      status: String,
      statusDescription: String,
      headers: CloudFrontHeaders
  ): CloudFrontResponse = {
    val _obj$ = js.Dynamic.literal(
      "status" -> status.asInstanceOf[js.Any],
      "statusDescription" -> statusDescription.asInstanceOf[js.Any],
      "headers" -> headers.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFrontResponse]
  }
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
    var action: literal.CloudFrontRequestBodyAction = js.native
    var data: String = js.native
    var encoding: literal.CloudFrontRequestEncoding = js.native
    def inputTruncated: Boolean = js.native
  }

  object Body {
    def apply(
        action: literal.CloudFrontRequestBodyAction,
        data: String,
        encoding: literal.CloudFrontRequestEncoding,
        inputTruncated: Boolean
    ): Body = {
      val _obj$ = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any],
        "data" -> data.asInstanceOf[js.Any],
        "encoding" -> encoding.asInstanceOf[js.Any],
        "inputTruncated" -> inputTruncated.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[Body]
    }
  }

  def apply(
      clientIp: String,
      method: String,
      uri: String,
      querystring: String,
      headers: CloudFrontHeaders,
      body: js.UndefOr[js.Any] = js.undefined,
      origin: js.UndefOr[CloudFrontOrigin] = js.undefined
  ): CloudFrontRequest = {
    val _obj$ = js.Dynamic.literal(
      "clientIp" -> clientIp.asInstanceOf[js.Any],
      "method" -> method.asInstanceOf[js.Any],
      "uri" -> uri.asInstanceOf[js.Any],
      "querystring" -> querystring.asInstanceOf[js.Any],
      "headers" -> headers.asInstanceOf[js.Any]
    )
    body.foreach(_v => _obj$.updateDynamic("body")(_v.asInstanceOf[js.Any]))
    origin.foreach(_v => _obj$.updateDynamic("origin")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CloudFrontRequest]
  }
}

@js.native
trait CloudFrontEvent extends js.Object {
  var config: CloudFrontEvent.Config = js.native
}

object CloudFrontEvent {
  def apply(
      config: CloudFrontEvent.Config
  ): CloudFrontEvent = {
    val _obj$ = js.Dynamic.literal(
      "config" -> config.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFrontEvent]
  }

  @js.native
  trait Config extends js.Object {
    def distributionDomainName: String = js.native
    def distributionId: String = js.native
    def eventType: literal.CloudFrontEventType = js.native
    def requestId: String = js.native
  }

  object Config {
    def apply(
        distributionDomainName: String,
        distributionId: String,
        eventType: literal.CloudFrontEventType,
        requestId: String
    ): Config = {
      val _obj$ = js.Dynamic.literal(
        "distributionDomainName" -> distributionDomainName.asInstanceOf[js.Any],
        "distributionId" -> distributionId.asInstanceOf[js.Any],
        "eventType" -> eventType.asInstanceOf[js.Any],
        "requestId" -> requestId.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[Config]
    }
  }
}

@js.native
trait CloudFrontResultResponse extends js.Object {
  var status: String = js.native
  var statusDescription: js.UndefOr[String] = js.native
  var headers: js.UndefOr[CloudFrontHeaders] = js.native
  var bodyEncoding: js.UndefOr[literal.CloudFrontRequestEncoding] = js.native
  var body: js.UndefOr[String] = js.native
}

object CloudFrontResultResponse {
  def apply(
      status: String,
      statusDescription: js.UndefOr[String] = js.undefined,
      headers: js.UndefOr[CloudFrontHeaders] = js.undefined,
      bodyEncoding: js.UndefOr[String] = js.undefined,
      body: js.UndefOr[String] = js.undefined
  ): CloudFrontResultResponse = {
    val _obj$ = js.Dynamic.literal(
      "status" -> status.asInstanceOf[js.Any]
    )
    statusDescription.foreach(_v => _obj$.updateDynamic("statusDescription")(_v.asInstanceOf[js.Any]))
    headers.foreach(_v => _obj$.updateDynamic("headers")(_v.asInstanceOf[js.Any]))
    bodyEncoding.foreach(_v => _obj$.updateDynamic("bodyEncoding")(_v.asInstanceOf[js.Any]))
    body.foreach(_v => _obj$.updateDynamic("body")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CloudFrontResultResponse]
  }
}
