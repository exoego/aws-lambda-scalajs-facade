package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

// API Gateway proxy integration mangles the context from a custom authorizer,
trait APIGatewayEventLambdaAuthorizerContext[TAuthorizerContext <: js.Object] extends js.Object {
  var principalId: String
  var integrationLatency: Double
}

@js.native
trait APIGatewayProxyCognitoAuthorizer extends js.Object {
  var claims: APIGatewayProxyCognitoAuthorizer.Claims = js.native
}

object APIGatewayProxyCognitoAuthorizer {
  def apply(
      claims: APIGatewayProxyCognitoAuthorizer.Claims
  ): APIGatewayProxyCognitoAuthorizer = {
    val _obj$ = js.Dynamic.literal(
      "claims" -> claims.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[APIGatewayProxyCognitoAuthorizer]
  }

  @js.native
  trait Claims extends js.Object {
    var sub: String = js.native
    var aud: String = js.native
    var email_verified: Boolean = js.native
    var token_use: String = js.native
    var auth_time: Double = js.native
    var iss: String = js.native
    var `cognito:username`: String = js.native
    var exp: Double = js.native
    var given_name: String = js.native
    var iat: Double = js.native
    var email: String = js.native
    val preferred_username: js.UndefOr[String] = js.native
    val name: js.UndefOr[String] = js.native

    @deprecated("Use cognito:username instead", "v0.12.0")
    @JSName("cognito:username")
    val cognitoUsername: String = js.native

    @deprecated("Use preferred_username instead", "v0.12.0")
    @JSName("preferred_username")
    val preferredUsername: js.UndefOr[String] = js.native

    @deprecated("Use token_use instead", "v0.12.0")
    @JSName("auth_time")
    val authTime: Double = js.native

    @deprecated("Use token_use instead", "v0.12.0")
    @JSName("token_use")
    val tokenUse: String = js.native
  }

  object Claims {
    def apply(
        sub: String,
        aud: String,
        email_verified: Boolean,
        token_use: String,
        auth_time: Double,
        iss: String,
        `cognito:username`: String,
        exp: Double,
        given_name: String,
        iat: Double,
        email: String,
        name: js.UndefOr[String] = js.undefined,
        preferred_username: js.UndefOr[String] = js.undefined
    ): Claims = {
      val _obj$ = js.Dynamic.literal(
        "sub" -> sub.asInstanceOf[js.Any],
        "aud" -> aud.asInstanceOf[js.Any],
        "email_verified" -> email_verified.asInstanceOf[js.Any],
        "token_use" -> token_use.asInstanceOf[js.Any],
        "auth_time" -> auth_time.asInstanceOf[js.Any],
        "iss" -> iss.asInstanceOf[js.Any],
        "cognito:username" -> `cognito:username`.asInstanceOf[js.Any],
        "exp" -> exp.asInstanceOf[js.Any],
        "given_name" -> given_name.asInstanceOf[js.Any],
        "iat" -> iat.asInstanceOf[js.Any],
        "email" -> email.asInstanceOf[js.Any]
      )
      name.foreach(_v => _obj$.updateDynamic("name")(_v.asInstanceOf[js.Any]))
      preferred_username.foreach(_v => _obj$.updateDynamic("preferred_username")(_v.asInstanceOf[js.Any]))
      _obj$.asInstanceOf[Claims]
    }
  }
}

/** Works with Lambda Proxy Integration for Rest API or HTTP API integration Payload Format version 1.0
  * @see
  *   - https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html
  */
@js.native
trait APIGatewayProxyEventBase[TAuthorizerContext] extends js.Object {
  var body: String | Null = js.native
  var headers: APIGatewayProxyEventHeaders = js.native
  var multiValueHeaders: APIGatewayProxyEventMultiValueHeaders = js.native
  var httpMethod: String = js.native
  var isBase64Encoded: Boolean = js.native
  var path: String = js.native
  var pathParameters: APIGatewayProxyEventPathParameters | Null = js.native
  var queryStringParameters: APIGatewayProxyEventQueryStringParameters | Null = js.native
  var multiValueQueryStringParameters: APIGatewayProxyEventMultiValueQueryStringParameters | Null = js.native
  var stageVariables: APIGatewayProxyEventStageVariables | Null = js.native
  var requestContext: APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext] = js.native
  var resource: String = js.native
}

object APIGatewayProxyEventBase {
  def apply[TAuthorizerContext <: js.Object](
      headers: APIGatewayProxyEventHeaders,
      multiValueHeaders: APIGatewayProxyEventMultiValueHeaders,
      httpMethod: String,
      isBase64Encoded: Boolean,
      path: String,
      requestContext: APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext],
      resource: String,
      body: String | Null = null,
      pathParameters: APIGatewayProxyEventPathParameters | Null = null,
      queryStringParameters: APIGatewayProxyEventQueryStringParameters | Null = null,
      multiValueQueryStringParameters: APIGatewayProxyEventMultiValueQueryStringParameters | Null = null,
      stageVariables: APIGatewayProxyEventStageVariables | Null = null
  ): APIGatewayProxyEventBase[TAuthorizerContext] = {
    val _obj$ = js.Dynamic.literal(
      "body" -> body.asInstanceOf[js.Any],
      "headers" -> headers.asInstanceOf[js.Any],
      "multiValueHeaders" -> multiValueHeaders.asInstanceOf[js.Any],
      "httpMethod" -> httpMethod.asInstanceOf[js.Any],
      "isBase64Encoded" -> isBase64Encoded.asInstanceOf[js.Any],
      "path" -> path.asInstanceOf[js.Any],
      "pathParameters" -> pathParameters.asInstanceOf[js.Any],
      "queryStringParameters" -> queryStringParameters.asInstanceOf[js.Any],
      "multiValueQueryStringParameters" -> multiValueQueryStringParameters.asInstanceOf[js.Any],
      "stageVariables" -> stageVariables.asInstanceOf[js.Any],
      "requestContext" -> requestContext.asInstanceOf[js.Any],
      "resource" -> resource.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[APIGatewayProxyEventBase[TAuthorizerContext]]
  }
}

/** Works with Lambda Proxy Integration for Rest API or HTTP API integration Payload Format version 1.0
  * @see
  *   - https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html
  */
@js.native
trait APIGatewayProxyResult extends js.Object {
  var statusCode: Double = js.native
  var headers: js.UndefOr[APIGatewayProxyResult.Headers] = js.native
  var multiValueHeaders: js.UndefOr[APIGatewayProxyResult.MultiValueHeaders] = js.native
  var body: String = js.native
  var isBase64Encoded: js.UndefOr[Boolean] = js.native
}

object APIGatewayProxyResult {
  type Headers = HeadersBDS
  type MultiValueHeaders = MultiValueHeadersBDS

  def apply(
      statusCode: Double,
      body: String,
      headers: js.UndefOr[APIGatewayProxyResult.Headers] = js.undefined,
      multiValueHeaders: js.UndefOr[APIGatewayProxyResult.MultiValueHeaders] = js.undefined,
      isBase64Encoded: js.UndefOr[Boolean] = js.undefined
  ): APIGatewayProxyResult = {
    val _obj$ = js.Dynamic.literal(
      "statusCode" -> statusCode.asInstanceOf[js.Any],
      "body" -> body.asInstanceOf[js.Any]
    )
    headers.foreach(_v => _obj$.updateDynamic("headers")(_v.asInstanceOf[js.Any]))
    multiValueHeaders.foreach(_v => _obj$.updateDynamic("multiValueHeaders")(_v.asInstanceOf[js.Any]))
    isBase64Encoded.foreach(_v => _obj$.updateDynamic("isBase64Encoded")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[APIGatewayProxyResult]
  }
}

/** Works with Lambda Proxy Integration for Rest API or HTTP API integration Payload Format version 2.0
  * @see
  *   - https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html
  */
@js.native
trait APIGatewayProxyEventV2 extends js.Object {
  var version: String = js.native
  var routeKey: String = js.native
  var rawPath: String = js.native
  var rawQueryString: String = js.native
  var cookies: js.UndefOr[js.Array[String]] = js.native
  var headers: APIGatewayProxyEventHeaders = js.native
  var queryStringParameters: js.UndefOr[APIGatewayProxyEventQueryStringParameters] = js.native
  var requestContext: APIGatewayProxyEventV2.RequestContext = js.native
  var body: js.UndefOr[String] = js.native
  var pathParameters: js.UndefOr[APIGatewayProxyEventPathParameters] = js.native
  var isBase64Encoded: Boolean = js.native
  var stageVariables: js.UndefOr[APIGatewayProxyEventStageVariables] = js.native
}

object APIGatewayProxyEventV2 {
  def apply(
      version: String,
      routeKey: String,
      rawPath: String,
      rawQueryString: String,
      headers: APIGatewayProxyEventHeaders,
      requestContext: APIGatewayProxyEventV2.RequestContext,
      isBase64Encoded: Boolean,
      cookies: js.UndefOr[js.Array[String]] = js.undefined,
      queryStringParameters: js.UndefOr[APIGatewayProxyEventQueryStringParameters] = js.undefined,
      body: js.UndefOr[String] = js.undefined,
      pathParameters: js.UndefOr[APIGatewayProxyEventPathParameters] = js.undefined,
      stageVariables: js.UndefOr[APIGatewayProxyEventStageVariables] = js.undefined
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
    cookies.foreach(_v => _obj$.updateDynamic("cookies")(_v.asInstanceOf[js.Any]))
    queryStringParameters.foreach(_v => _obj$.updateDynamic("queryStringParameters")(_v.asInstanceOf[js.Any]))
    body.foreach(_v => _obj$.updateDynamic("body")(_v.asInstanceOf[js.Any]))
    pathParameters.foreach(_v => _obj$.updateDynamic("pathParameters")(_v.asInstanceOf[js.Any]))
    stageVariables.foreach(_v => _obj$.updateDynamic("stageVariables")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[APIGatewayProxyEventV2]
  }

  @js.native
  trait RequestContext extends js.Object {
    var accountId: String = js.native
    var apiId: String = js.native
    var authorizer: js.UndefOr[RequestContext.Authorizer] = js.native
    var authentication: js.UndefOr[RequestContext.Authentication] = js.native
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
        authorizer: js.UndefOr[js.Any] = js.undefined,
        authentication: js.UndefOr[RequestContext.Authentication] = js.undefined
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
      authorizer.foreach(_v => _obj$.updateDynamic("authorizer")(_v.asInstanceOf[js.Any]))
      authentication.foreach(_v => _obj$.updateDynamic("authentication")(_v.asInstanceOf[js.Any]))
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
        var claims: HeadersBDSA = js.native
        var scopes: js.Array[String] = js.native
      }
      object Jwt {
        def apply(
            claims: HeadersBDSA,
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
    trait Authentication extends js.Object {
      var clientCert: APIGatewayEventClientCertificate = js.native
    }
    object Authentication {
      def apply(
          clientCert: APIGatewayEventClientCertificate
      ): Authentication = {
        val _obj$ = js.Dynamic.literal(
          "clientCert" -> clientCert.asInstanceOf[js.Any]
        )
        _obj$.asInstanceOf[Authentication]
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

/** Works with Lambda Proxy Integration for Rest API or HTTP API integration Payload Format version 2.0
  * @see
  *   - https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html
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
    statusCode.foreach(_v => _obj$.updateDynamic("statusCode")(_v.asInstanceOf[js.Any]))
    headers.foreach(_v => _obj$.updateDynamic("headers")(_v.asInstanceOf[js.Any]))
    body.foreach(_v => _obj$.updateDynamic("body")(_v.asInstanceOf[js.Any]))
    isBase64Encoded.foreach(_v => _obj$.updateDynamic("isBase64Encoded")(_v.asInstanceOf[js.Any]))
    cookies.foreach(_v => _obj$.updateDynamic("cookies")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[APIGatewayProxyStructuredResultV2]
  }
}
