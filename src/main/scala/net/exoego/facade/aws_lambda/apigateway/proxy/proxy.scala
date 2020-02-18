package net.exoego.facade.aws_lambda.apigateway.proxy

import net.exoego.facade.aws_lambda.{HeadersBDS, MultiValueHeadersBDS}
import net.exoego.facade.aws_lambda.apigateway.APIGatewayEventRequestContext

import scala.scalajs.js
import scala.scalajs.js.|

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
