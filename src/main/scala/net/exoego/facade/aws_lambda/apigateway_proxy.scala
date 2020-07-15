package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js
import scala.scalajs.js.|

/**
  * Works with Lambda Proxy Integration for Rest API or HTTP API integration Payload Format version 1.0
  * @see - https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html
  */
@Factory
trait APIGatewayProxyEvent extends js.Object {
  var body: String | Null
  var headers: APIGatewayProxyEvent.Headers
  var multiValueHeaders: APIGatewayProxyEvent.MultiValueHeaders
  var httpMethod: String
  var isBase64Encoded: Boolean
  var path: String
  var pathParameters: js.Dictionary[String] | Null
  var queryStringParameters: js.Dictionary[String] | Null
  var multiValueQueryStringParameters: js.Dictionary[js.Array[String]] | Null
  var stageVariables: js.Dictionary[String] | Null
  var requestContext: APIGatewayEventRequestContext
  var resource: String
}

object APIGatewayProxyEvent {
  type Headers = js.Dictionary[String]
  type MultiValueHeaders = js.Dictionary[js.Array[String]]
}

/**
  * Works with Lambda Proxy Integration for Rest API or HTTP API integration Payload Format version 1.0
  * @see - https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html
  */
@Factory
trait APIGatewayProxyResult extends js.Object {
  var statusCode: Double
  var headers: js.UndefOr[APIGatewayProxyResult.Headers] = js.undefined
  var multiValueHeaders: js.UndefOr[APIGatewayProxyResult.MultiValueHeaders] =
    js.undefined
  var body: String
  var isBase64Encoded: js.UndefOr[Boolean] = js.undefined
}

object APIGatewayProxyResult {
  type Headers = HeadersBDS
  type MultiValueHeaders = MultiValueHeadersBDS
}

/**
  * Works with Lambda Proxy Integration for Rest API or HTTP API integration Payload Format version 2.0
  * @see - https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html
  */
@Factory
trait APIGatewayProxyEventV2 extends js.Object {
  var version: String
  var routeKey: String
  var rawPath: String
  var rawQueryString: String
  var cookies: js.UndefOr[js.Array[String]] = js.undefined
  var headers: Headers
  var queryStringParameters: js.UndefOr[Headers] = js.undefined
  var requestContext: APIGatewayProxyEventV2.RequestContext
  var body: js.UndefOr[String] = js.undefined
  var pathParameters: js.UndefOr[Headers] = js.undefined
  var isBase64Encoded: Boolean
  var stageVariables: js.UndefOr[Headers] = js.undefined
}

object APIGatewayProxyEventV2 {
  @Factory(false)
  trait RequestContext extends js.Object {
    var accountId: String
    var apiId: String
    var authorizer: js.UndefOr[RequestContext.Authorizer] = js.undefined
    var domainName: String
    var domainPrefix: String
    var http: RequestContext.Http
    var requestId: String
    var routeKey: String
    var stage: String
    var time: String
    var timeEpoch: Double
  }

  object RequestContext {
    @Factory(false)
    trait Authorizer extends js.Object {
      var jwt: Authorizer.Jwt
    }

    object Authorizer {
      @Factory(false)
      trait Jwt extends js.Object {
        var claims: HeadersBDSA
        var scopes: js.Array[String]
      }
    }

    @Factory(false)
    trait Http extends js.Object {
      var method: String
      var path: String
      var protocol: String
      var sourceIp: String
      var userAgent: String
    }
  }
}

/**
  * Works with Lambda Proxy Integration for Rest API or HTTP API integration Payload Format version 2.0
  * @see - https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html
  */
@Factory
trait APIGatewayProxyStructuredResultV2 extends js.Object {
  var statusCode: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[HeadersBDS] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  var isBase64Encoded: js.UndefOr[Boolean] = js.undefined
  var cookies: js.UndefOr[js.Array[String]] = js.undefined
}
