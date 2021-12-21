package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ALBEventRequestContext extends js.Object {
  var elb: ALBEventRequestContext.Elb = js.native
}

object ALBEventRequestContext {
  @js.native
  trait Elb extends js.Object {
    var targetGroupArn: String = js.native
  }
}

@js.native
trait ALBEvent extends js.Object {
  var requestContext: ALBEventRequestContext = js.native
  var httpMethod: String = js.native
  var path: String = js.native
  var queryStringParameters: js.UndefOr[ALBEvent.QueryStringParameters] = js.native
  var headers: js.UndefOr[ALBEvent.Headers] = js.native
  var multiValueQueryStringParameters: js.UndefOr[ALBEvent.MultiValueQueryStringParameters] = js.native
  var multiValueHeaders: js.UndefOr[ALBEvent.MultiValueHeaders] = js.native
  var body: String | Null = js.native
  var isBase64Encoded: Boolean = js.native
}

object ALBEvent {
  type QueryStringParameters = js.Dictionary[String]
  type Headers = js.Dictionary[String]
  type MultiValueQueryStringParameters = js.Dictionary[js.Array[String]]
  type MultiValueHeaders = js.Dictionary[js.Array[String]]
}

@js.native
trait ALBResult extends js.Object {
  var statusCode: Double = js.native
  var statusDescription: js.UndefOr[String] = js.native
  var headers: js.UndefOr[ALBResult.Headers] = js.native
  var multiValueHeaders: js.UndefOr[ALBResult.MultiValueHeaders] = js.native
  var body: js.UndefOr[String] = js.native
  var isBase64Encoded: js.UndefOr[Boolean] = js.native
}

object ALBResult {
  type Headers = HeadersBDS
  type MultiValueHeaders = MultiValueHeadersBDS
}
