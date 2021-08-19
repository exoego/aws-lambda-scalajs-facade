package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js
import scala.scalajs.js.|

/** Works with Lambda Proxy Integration for Rest API or HTTP API integration Payload Format version 1.0
  * @see
  *   - https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html
  */
@Factory
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
  var multiValueQueryStringParameters: js.Dictionary[js.Array[String]] | Null = js.native
  var stageVariables: js.Dictionary[String] | Null = js.native
  var requestContext: APIGatewayEventRequestContext = js.native
  var resource: String = js.native
}

object APIGatewayProxyEvent {
  type Headers = js.Dictionary[String]
  type MultiValueHeaders = js.Dictionary[js.Array[String]]
}

/** Works with Lambda Proxy Integration for Rest API or HTTP API integration Payload Format version 1.0
  * @see
  *   - https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html
  */
@Factory
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
@Factory
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
  @Factory(false)
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
    @Factory(false)
    @js.native
    trait Authorizer extends js.Object {
      var jwt: Authorizer.Jwt = js.native
    }

    object Authorizer {
      @Factory(false)
      @js.native
      trait Jwt extends js.Object {
        var claims: HeadersBDSA = js.native
        var scopes: js.Array[String] = js.native
      }
    }

    @Factory(false)
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
@Factory
@js.native
trait APIGatewayProxyStructuredResultV2 extends js.Object {
  var statusCode: js.UndefOr[Double] = js.native
  var headers: js.UndefOr[HeadersBDS] = js.native
  var body: js.UndefOr[String] = js.native
  var isBase64Encoded: js.UndefOr[Boolean] = js.native
  var cookies: js.UndefOr[js.Array[String]] = js.native
}
