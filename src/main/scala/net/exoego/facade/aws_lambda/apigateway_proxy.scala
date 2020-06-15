package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.|

/**
  * Works with Lambda Proxy Integration for Rest API or HTTP API integration Payload Format version 1.0
  * @see - https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html
  */
@js.native
trait APIGatewayProxyEvent extends js.Object {
  var body: String | Null = js.native
  var headers: APIGatewayProxyEvent.Headers = js.native
  var multiValueHeaders: APIGatewayProxyEvent.MultiValueHeaders = js.native
  var httpMethod: String = js.native
  var isBase64Encoded: Boolean = js.native
  var path: String = js.native
  var pathParameters: js.Dictionary[String] | Null = js.native
  var queryStringParameters: js.Dictionary[String] | Null = js.native
  var multiValueQueryStringParameters: js.Dictionary[js.Array[String]] | Null =
    js.native
  var stageVariables: js.Dictionary[String] | Null = js.native
  var requestContext: APIGatewayEventRequestContext = js.native
  var resource: String = js.native
}

object APIGatewayProxyEvent {
  def apply(
      headers: APIGatewayProxyEvent.Headers,
      multiValueHeaders: APIGatewayProxyEvent.MultiValueHeaders,
      httpMethod: String,
      isBase64Encoded: Boolean,
      path: String,
      requestContext: APIGatewayEventRequestContext,
      resource: String,
      body: String | Null = null,
      pathParameters: js.Dictionary[String] | Null = null,
      queryStringParameters: js.Dictionary[String] | Null = null,
      multiValueQueryStringParameters: js.Dictionary[js.Array[String]] | Null =
        null,
      stageVariables: js.Dictionary[String] | Null = null
  ): APIGatewayProxyEvent = {
    val _obj$ = js.Dynamic.literal(
      "body" -> body.asInstanceOf[js.Any],
      "headers" -> headers.asInstanceOf[js.Any],
      "multiValueHeaders" -> multiValueHeaders.asInstanceOf[js.Any],
      "httpMethod" -> httpMethod.asInstanceOf[js.Any],
      "isBase64Encoded" -> isBase64Encoded.asInstanceOf[js.Any],
      "path" -> path.asInstanceOf[js.Any],
      "pathParameters" -> pathParameters.asInstanceOf[js.Any],
      "queryStringParameters" -> queryStringParameters.asInstanceOf[js.Any],
      "multiValueQueryStringParameters" -> multiValueQueryStringParameters
        .asInstanceOf[js.Any],
      "stageVariables" -> stageVariables.asInstanceOf[js.Any],
      "requestContext" -> requestContext.asInstanceOf[js.Any],
      "resource" -> resource.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[APIGatewayProxyEvent]
  }
  type Headers = js.Dictionary[String]
  type MultiValueHeaders = js.Dictionary[js.Array[String]]
}

/**
  * Works with Lambda Proxy Integration for Rest API or HTTP API integration Payload Format version 1.0
  * @see - https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html
  */
@js.native
trait APIGatewayProxyResult extends js.Object {
  var statusCode: Double = js.native
  var headers: js.UndefOr[APIGatewayProxyResult.Headers] = js.native
  var multiValueHeaders: js.UndefOr[APIGatewayProxyResult.MultiValueHeaders] =
    js.native
  var body: String = js.native
  var isBase64Encoded: js.UndefOr[Boolean] = js.native
}

object APIGatewayProxyResult {
  def apply(
      statusCode: Double,
      body: String,
      headers: js.UndefOr[APIGatewayProxyResult.Headers] = js.undefined,
      multiValueHeaders: js.UndefOr[APIGatewayProxyResult.MultiValueHeaders] =
        js.undefined,
      isBase64Encoded: js.UndefOr[Boolean] = js.undefined
  ): APIGatewayProxyResult = {
    val _obj$ = js.Dynamic.literal(
      "statusCode" -> statusCode.asInstanceOf[js.Any],
      "body" -> body.asInstanceOf[js.Any]
    )
    headers.foreach(_v =>
      _obj$.updateDynamic("headers")(_v.asInstanceOf[js.Any])
    )
    multiValueHeaders.foreach(_v =>
      _obj$.updateDynamic("multiValueHeaders")(_v.asInstanceOf[js.Any])
    )
    isBase64Encoded.foreach(_v =>
      _obj$.updateDynamic("isBase64Encoded")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[APIGatewayProxyResult]
  }
  type Headers = HeadersBDS
  type MultiValueHeaders = MultiValueHeadersBDS
}

/**
  * Works with Lambda Proxy Integration for Rest API or HTTP API integration Payload Format version 2.0
  * @see - https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html
  */

@js.native
trait APIGatewayProxyEventV2 extends js.Object {
  var version: String = js.native
  var routeKey: String = js.native
  var rawPath: String = js.native
  var rawQueryString: String = js.native
  var cookies: js.UndefOr[js.Array[String]] = js.native
  var headers: Headers = js.native
  var queryStringParameters: js.UndefOr[Headers] = js.native
  var requestContext: APIGatewayProxyEventV2.RequestContext = js.native
  var body: js.UndefOr[String] = js.native
  var pathParameters: js.UndefOr[Headers] = js.native
  var isBase64Encoded: Boolean = js.native
  var stageVariables: js.UndefOr[Headers] = js.native
}

object APIGatewayProxyEventV2 {
  def apply(
      version: String,
      routeKey: String,
      rawPath: String,
      rawQueryString: String,
      headers: Headers,
      requestContext: APIGatewayProxyEventV2.RequestContext,
      isBase64Encoded: Boolean,
      cookies: js.UndefOr[js.Array[String]] = js.undefined,
      queryStringParameters: js.UndefOr[Headers] = js.undefined,
      body: js.UndefOr[String] = js.undefined,
      pathParameters: js.UndefOr[Headers] = js.undefined,
      stageVariables: js.UndefOr[Headers] = js.undefined
  ): APIGatewayProxyEventV2 = {
    val _obj$ = js.Dynamic.literal(
      "version" -> version.asInstanceOf[js.Any],
      "routeKey" -> routeKey.asInstanceOf[js.Any],
      "rawPath" -> rawPath.asInstanceOf[js.Any],
      "rawQueryString" -> rawQueryString.asInstanceOf[js.Any],
      "headers" -> headers.asInstanceOf[js.Any],
      "requestContext" -> requestContext.asInstanceOf[js.Any],
      "isBase64Encoded" -> isBase64Encoded.asInstanceOf[js.Any]
    )
    cookies.foreach(_v =>
      _obj$.updateDynamic("cookies")(_v.asInstanceOf[js.Any])
    )
    queryStringParameters.foreach(_v =>
      _obj$.updateDynamic("queryStringParameters")(_v.asInstanceOf[js.Any])
    )
    body.foreach(_v => _obj$.updateDynamic("body")(_v.asInstanceOf[js.Any]))
    pathParameters.foreach(_v =>
      _obj$.updateDynamic("pathParameters")(_v.asInstanceOf[js.Any])
    )
    stageVariables.foreach(_v =>
      _obj$.updateDynamic("stageVariables")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[APIGatewayProxyEventV2]
  }

  @js.native
  trait RequestContext extends js.Object {
    var accountId: String = js.native
    var apiId: String = js.native
    var authorizer: js.UndefOr[RequestContext.Authorizer] = js.native
    var domainName: String = js.native
    var domainPrefix: String = js.native
    var http: RequestContext.Http = js.native
    var requestId: String = js.native
    var routeKey: String = js.native
    var stage: String = js.native
    var time: String = js.native
    var timeEpoch: Double = js.native
  }

  object RequestContext {
    def apply(
        accountId: String,
        apiId: String,
        domainName: String,
        domainPrefix: String,
        http: RequestContext.Http,
        requestId: String,
        routeKey: String,
        stage: String,
        time: String,
        timeEpoch: Double,
        authorizer: js.UndefOr[RequestContext.Authorizer] = js.undefined
    ): RequestContext = {
      val _obj$ = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "apiId" -> apiId.asInstanceOf[js.Any],
        "domainName" -> domainName.asInstanceOf[js.Any],
        "domainPrefix" -> domainPrefix.asInstanceOf[js.Any],
        "http" -> http.asInstanceOf[js.Any],
        "requestId" -> requestId.asInstanceOf[js.Any],
        "routeKey" -> routeKey.asInstanceOf[js.Any],
        "stage" -> stage.asInstanceOf[js.Any],
        "time" -> time.asInstanceOf[js.Any],
        "timeEpoch" -> timeEpoch.asInstanceOf[js.Any]
      )
      authorizer.foreach(_v =>
        _obj$.updateDynamic("authorizer")(_v.asInstanceOf[js.Any])
      )
      _obj$.asInstanceOf[RequestContext]
    }

    @js.native
    trait Authorizer extends js.Object {
      var jwt: Authorizer.Jwt = js.native
    }

    object Authorizer {
      def apply(
          jwt: Authorizer.Jwt
      ): Authorizer = {
        val _obj$ = js.Dynamic.literal(
          "jwt" -> jwt.asInstanceOf[js.Any]
        )
        _obj$.asInstanceOf[Authorizer]
      }

      @js.native
      trait Jwt extends js.Object {
        var claims: Headers = js.native
        var scopes: js.Array[String] = js.native
      }

      object Jwt {
        def apply(
            claims: Headers,
            scopes: js.Array[String]
        ): Jwt = {
          val _obj$ = js.Dynamic.literal(
            "claims" -> claims.asInstanceOf[js.Any],
            "scopes" -> scopes.asInstanceOf[js.Any]
          )
          _obj$.asInstanceOf[Jwt]
        }
      }
    }

    @js.native
    trait Http extends js.Object {
      var method: String = js.native
      var path: String = js.native
      var protocol: String = js.native
      var sourceIp: String = js.native
      var userAgent: String = js.native
    }

    object Http {
      def apply(
          method: String,
          path: String,
          protocol: String,
          sourceIp: String,
          userAgent: String
      ): Http = {
        val _obj$ = js.Dynamic.literal(
          "method" -> method.asInstanceOf[js.Any],
          "path" -> path.asInstanceOf[js.Any],
          "protocol" -> protocol.asInstanceOf[js.Any],
          "sourceIp" -> sourceIp.asInstanceOf[js.Any],
          "userAgent" -> userAgent.asInstanceOf[js.Any]
        )
        _obj$.asInstanceOf[Http]
      }
    }
  }
}

/**
  * Works with Lambda Proxy Integration for Rest API or HTTP API integration Payload Format version 2.0
  * @see - https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html
  */
@js.native
trait APIGatewayProxyStructuredResultV2 extends js.Object {
  var statusCode: js.UndefOr[Double] = js.native
  var headers: js.UndefOr[HeadersBDS] = js.native
  var body: js.UndefOr[String] = js.native
  var isBase64Encoded: js.UndefOr[Boolean] = js.native
  var cookies: js.UndefOr[js.Array[String]] = js.native
}

object APIGatewayProxyStructuredResultV2 {
  def apply(
      statusCode: js.UndefOr[Double] = js.undefined,
      headers: js.UndefOr[HeadersBDS] = js.undefined,
      body: js.UndefOr[String] = js.undefined,
      isBase64Encoded: js.UndefOr[Boolean] = js.undefined,
      cookies: js.UndefOr[js.Array[String]] = js.undefined
  ): APIGatewayProxyStructuredResultV2 = {
    val _obj$ = js.Dynamic.literal(
    )
    statusCode.foreach(_v =>
      _obj$.updateDynamic("statusCode")(_v.asInstanceOf[js.Any])
    )
    headers.foreach(_v =>
      _obj$.updateDynamic("headers")(_v.asInstanceOf[js.Any])
    )
    body.foreach(_v => _obj$.updateDynamic("body")(_v.asInstanceOf[js.Any]))
    isBase64Encoded.foreach(_v =>
      _obj$.updateDynamic("isBase64Encoded")(_v.asInstanceOf[js.Any])
    )
    cookies.foreach(_v =>
      _obj$.updateDynamic("cookies")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[APIGatewayProxyStructuredResultV2]
  }
}
