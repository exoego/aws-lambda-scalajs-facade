package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSBracketAccess, JSName}
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
  @js.native
  trait Claims extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.UndefOr[String | Double | Boolean] = js.native

    @JSName("cognito:username")
    val cognitoUsername: String = js.native

    @JSName("preferred_username")
    val preferredUsername: String = js.native
    val name: String = js.native
    val email: String = js.native

    @JSName("auth_time")
    val authTime: Double = js.native
    val sub: String = js.native
    val aud: String = js.native

    @JSName("token_use")
    val tokenUse: String = js.native
    val iss: String = js.native
    val exp: String = js.native
    val iat: String = js.native
  }

  implicit def toDictionary(obj: Claims): js.Dictionary[String] = obj.asInstanceOf[js.Dictionary[String]]
}

/** Works with Lambda Proxy Integration for Rest API or HTTP API integration Payload Format version 1.0
  * @see
  *   - https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html
  */
@js.native
trait APIGatewayProxyEventBase[TAuthorizerContext] extends js.Object {
  var body: String | Null = js.native
  var headers: APIGatewayProxyEventBase.Headers = js.native
  var multiValueHeaders: APIGatewayProxyEventBase.MultiValueHeaders = js.native
  var httpMethod: String = js.native
  var isBase64Encoded: Boolean = js.native
  var path: String = js.native
  var pathParameters: APIGatewayProxyEventBase.PathParameters | Null = js.native
  var queryStringParameters: APIGatewayProxyEventBase.QueryStringParameters | Null = js.native
  var multiValueQueryStringParameters: APIGatewayProxyEventBase.MultiValueQueryStringParameters | Null = js.native
  var stageVariables: APIGatewayProxyEventBase.StageVariables | Null = js.native
  var requestContext: APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext] = js.native
  var resource: String = js.native
}

object APIGatewayProxyEventBase {
  type Headers = js.Dictionary[String]
  type MultiValueHeaders = js.Dictionary[js.Array[String]]
  type PathParameters = js.Dictionary[String]
  type QueryStringParameters = js.Dictionary[String]
  type MultiValueQueryStringParameters = js.Dictionary[js.Array[String]]
  type StageVariables = js.Dictionary[String]
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
  var headers: APIGatewayProxyEventBase.Headers = js.native
  var queryStringParameters: js.UndefOr[APIGatewayProxyEventBase.QueryStringParameters] = js.native
  var requestContext: APIGatewayProxyEventV2.RequestContext = js.native
  var body: js.UndefOr[String] = js.native
  var pathParameters: js.UndefOr[APIGatewayProxyEventBase.PathParameters] = js.native
  var isBase64Encoded: Boolean = js.native
  var stageVariables: js.UndefOr[APIGatewayProxyEventBase.StageVariables] = js.native
}

object APIGatewayProxyEventV2 {
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
    @js.native
    trait Authorizer extends js.Object {
      var jwt: Authorizer.Jwt = js.native
    }

    object Authorizer {
      @js.native
      trait Jwt extends js.Object {
        var claims: HeadersBDSA = js.native
        var scopes: js.Array[String] = js.native
      }
    }

    @js.native
    trait Authentication extends js.Object {
      var clientCert: APIGatewayEventClientCertificate = js.native
    }

    @js.native
    trait Http extends js.Object {
      var method: String = js.native
      var path: String = js.native
      var protocol: String = js.native
      var sourceIp: String = js.native
      var userAgent: String = js.native
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
