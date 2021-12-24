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

@js.native
trait CloudFrontFunctionsEvent extends js.Object {
  var version: String = js.native
  var context: CloudFrontFunctionsEvent.Context = js.native
  var viewer: CloudFrontFunctionsEvent.Viewer = js.native
  var request: CloudFrontFunctionsEvent.Request = js.native
  var response: CloudFrontFunctionsEvent.Response = js.native
}

@js.native
trait CloudFrontFunctionsCookieItem extends js.Object {
  var value: String = js.native
  var attributes: js.UndefOr[String] = js.native
  var multiValue: js.UndefOr[Array[CloudFrontFunctionsCookieMultiValueItem]] = js.native
}

object CloudFrontFunctionsCookieItem {
  def apply(
      value: String,
      attributes: js.UndefOr[String] = js.undefined,
      multiValue: js.UndefOr[Array[CloudFrontFunctionsCookieMultiValueItem]] = js.undefined
  ): CloudFrontFunctionsCookieItem = {
    val _obj$ = js.Dynamic.literal(
      "value" -> value.asInstanceOf[js.Any]
    )
    attributes.foreach(_v => _obj$.updateDynamic("attributes")(_v.asInstanceOf[js.Any]))
    multiValue.foreach(_v => _obj$.updateDynamic("multiValue")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CloudFrontFunctionsCookieItem]
  }
}

@js.native
trait CloudFrontFunctionsCookieMultiValueItem extends js.Object {
  var value: String = js.native
  var attributes: js.UndefOr[String] = js.native
}

object CloudFrontFunctionsCookieMultiValueItem {
  def apply(
      value: String,
      attributes: js.UndefOr[String] = js.undefined
  ): CloudFrontFunctionsCookieMultiValueItem = {
    val _obj$ = js.Dynamic.literal(
      "value" -> value.asInstanceOf[js.Any]
    )
    attributes.foreach(_v => _obj$.updateDynamic("attributes")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CloudFrontFunctionsCookieMultiValueItem]
  }
}

@js.native
trait CloudFrontFunctionsMultiValueItem extends js.Object {
  var value: String = js.native
  var multiValue: js.UndefOr[Array[CloudFrontFunctionsValueItem]] = js.native
}

object CloudFrontFunctionsMultiValueItem {
  def apply(
      value: String,
      multiValue: js.UndefOr[Array[CloudFrontFunctionsValueItem]] = js.undefined
  ): CloudFrontFunctionsMultiValueItem = {
    val _obj$ = js.Dynamic.literal(
      "value" -> value.asInstanceOf[js.Any]
    )
    multiValue.foreach(_v => _obj$.updateDynamic("multiValue")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CloudFrontFunctionsMultiValueItem]
  }
}

@js.native
trait CloudFrontFunctionsValueItem extends js.Object {
  var value: String = js.native
}

object CloudFrontFunctionsValueItem {
  def apply(
      value: String
  ): CloudFrontFunctionsValueItem = {
    val _obj$ = js.Dynamic.literal(
      "value" -> value.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFrontFunctionsValueItem]
  }
}

object CloudFrontFunctionsEvent {
  def apply(
      version: String,
      context: CloudFrontFunctionsEvent.Context,
      viewer: CloudFrontFunctionsEvent.Viewer,
      request: CloudFrontFunctionsEvent.Request,
      response: CloudFrontFunctionsEvent.Response
  ): CloudFrontFunctionsEvent = {
    val _obj$ = js.Dynamic.literal(
      "version" -> version.asInstanceOf[js.Any],
      "context" -> context.asInstanceOf[js.Any],
      "viewer" -> viewer.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFrontFunctionsEvent]
  }

  @js.native
  trait Context extends js.Object {
    var distributionDomainName: String = js.native
    var distributionId: String = js.native
    var eventType: literal.CloudFrontFunctionsContextEventType = js.native
    var requestId: String = js.native
  }

  object Context {
    def apply(
        distributionDomainName: String,
        distributionId: String,
        eventType: literal.CloudFrontFunctionsContextEventType,
        requestId: String
    ): Context = {
      val _obj$ = js.Dynamic.literal(
        "distributionDomainName" -> distributionDomainName.asInstanceOf[js.Any],
        "distributionId" -> distributionId.asInstanceOf[js.Any],
        "eventType" -> eventType.asInstanceOf[js.Any],
        "requestId" -> requestId.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[Context]
    }
  }

  @js.native
  trait Viewer extends js.Object {
    var ip: String = js.native
  }

  object Viewer {
    def apply(
        ip: String
    ): Viewer = {
      val _obj$ = js.Dynamic.literal(
        "ip" -> ip.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[Viewer]
    }
  }

  @js.native
  trait Request extends js.Object {
    var method: String = js.native
    var uri: String = js.native
    var querystring: CloudFrontFunctionsQuerystring = js.native
    var headers: CloudFrontFunctionsHeaders = js.native
    var cookies: CloudFrontFunctionsCookies = js.native
  }

  object Request {
    def apply(
        method: String,
        uri: String,
        querystring: CloudFrontFunctionsQuerystring,
        headers: CloudFrontFunctionsHeaders,
        cookies: CloudFrontFunctionsCookies
    ): Request = {
      val _obj$ = js.Dynamic.literal(
        "method" -> method.asInstanceOf[js.Any],
        "uri" -> uri.asInstanceOf[js.Any],
        "querystring" -> querystring.asInstanceOf[js.Any],
        "headers" -> headers.asInstanceOf[js.Any],
        "cookies" -> cookies.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[Request]
    }
  }

  @js.native
  trait Response extends js.Object {
    var statusCode: Double = js.native
    var statusDescription: js.UndefOr[String] = js.native
    var headers: CloudFrontFunctionsHeaders = js.native
    var cookies: CloudFrontFunctionsCookies = js.native
  }

  object Response {
    def apply(
        statusCode: Double,
        headers: CloudFrontFunctionsHeaders,
        cookies: CloudFrontFunctionsCookies,
        statusDescription: js.UndefOr[String] = js.undefined
    ): Response = {
      val _obj$ = js.Dynamic.literal(
        "statusCode" -> statusCode.asInstanceOf[js.Any],
        "headers" -> headers.asInstanceOf[js.Any],
        "cookies" -> cookies.asInstanceOf[js.Any]
      )
      statusDescription.foreach(_v => _obj$.updateDynamic("statusDescription")(_v.asInstanceOf[js.Any]))
      _obj$.asInstanceOf[Response]
    }
  }
}
