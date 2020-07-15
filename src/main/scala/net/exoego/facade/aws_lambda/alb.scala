package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js
import scala.scalajs.js.|

@Factory
trait ALBEventRequestContext extends js.Object {
  var elb: ALBEventRequestContext.Elb
}

object ALBEventRequestContext {
  @Factory(false)
  trait Elb extends js.Object {
    var targetGroupArn: String
  }
}

@Factory
trait ALBEvent extends js.Object {
  var requestContext: ALBEventRequestContext
  var httpMethod: String
  var path: String
  var queryStringParameters: js.UndefOr[ALBEvent.QueryStringParameters] =
    js.undefined
  var headers: js.UndefOr[ALBEvent.Headers] = js.undefined
  var multiValueQueryStringParameters
      : js.UndefOr[ALBEvent.MultiValueQueryStringParameters] = js.undefined
  var multiValueHeaders: js.UndefOr[ALBEvent.MultiValueHeaders] = js.undefined
  var body: String | Null
  var isBase64Encoded: Boolean
}

object ALBEvent {
  type QueryStringParameters = js.Dictionary[String]
  type Headers = js.Dictionary[String]
  type MultiValueQueryStringParameters = js.Dictionary[js.Array[String]]
  type MultiValueHeaders = js.Dictionary[js.Array[String]]
}

@Factory
trait ALBResult extends js.Object {
  var statusCode: Double
  var statusDescription: js.UndefOr[String]
  var headers: js.UndefOr[ALBResult.Headers]
  var multiValueHeaders: js.UndefOr[ALBResult.MultiValueHeaders]
  var body: js.UndefOr[String]
  var isBase64Encoded: js.UndefOr[Boolean]
}

object ALBResult {
  type Headers = HeadersBDS
  type MultiValueHeaders = MultiValueHeadersBDS
}
