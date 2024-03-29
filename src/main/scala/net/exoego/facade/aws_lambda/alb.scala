package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ALBEventRequestContext extends js.Object {
  var elb: ALBEventRequestContext.Elb = js.native
}

object ALBEventRequestContext {
  def apply(elb: ALBEventRequestContext.Elb): ALBEventRequestContext = {
    val _obj$ = js.Dynamic.literal(
      "elb" -> elb.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[ALBEventRequestContext]
  }

  @js.native
  trait Elb extends js.Object {
    var targetGroupArn: String = js.native
  }

  object Elb {
    def apply(targetGroupArn: String): Elb = {
      val _obj$ = js.Dynamic.literal(
        "targetGroupArn" -> targetGroupArn.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[Elb]
    }
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

  def apply(
      requestContext: ALBEventRequestContext,
      httpMethod: String,
      path: String,
      isBase64Encoded: Boolean,
      body: String | Null = null,
      queryStringParameters: js.UndefOr[QueryStringParameters] = js.undefined,
      headers: js.UndefOr[Headers] = js.undefined,
      multiValueQueryStringParameters: js.UndefOr[MultiValueQueryStringParameters] = js.undefined,
      multiValueHeaders: js.UndefOr[MultiValueHeaders] = js.undefined
  ): ALBEvent = {
    val _obj$ = js.Dynamic.literal(
      "requestContext" -> requestContext.asInstanceOf[js.Any],
      "httpMethod" -> httpMethod.asInstanceOf[js.Any],
      "path" -> path.asInstanceOf[js.Any],
      "body" -> body.asInstanceOf[js.Any],
      "isBase64Encoded" -> isBase64Encoded.asInstanceOf[js.Any]
    )
    queryStringParameters.foreach(_v => _obj$.updateDynamic("queryStringParameters")(_v.asInstanceOf[js.Any]))
    headers.foreach(_v => _obj$.updateDynamic("headers")(_v.asInstanceOf[js.Any]))
    multiValueQueryStringParameters.foreach(_v =>
      _obj$.updateDynamic("multiValueQueryStringParameters")(_v.asInstanceOf[js.Any])
    )
    multiValueHeaders.foreach(_v => _obj$.updateDynamic("multiValueHeaders")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[ALBEvent]
  }
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

  def apply(
      statusCode: Double,
      statusDescription: js.UndefOr[String | Unit] = js.undefined,
      headers: js.UndefOr[Headers] = js.undefined,
      multiValueHeaders: js.UndefOr[MultiValueHeaders] = js.undefined,
      body: js.UndefOr[String] = js.undefined,
      isBase64Encoded: js.UndefOr[Boolean] = js.undefined
  ): ALBResult = {
    val _obj$ = js.Dynamic.literal(
      "statusCode" -> statusCode.asInstanceOf[js.Any]
    )
    statusDescription.foreach(_v => _obj$.updateDynamic("statusDescription")(_v.asInstanceOf[js.Any]))
    headers.foreach(_v => _obj$.updateDynamic("headers")(_v.asInstanceOf[js.Any]))
    multiValueHeaders.foreach(_v => _obj$.updateDynamic("multiValueHeaders")(_v.asInstanceOf[js.Any]))
    body.foreach(_v => _obj$.updateDynamic("body")(_v.asInstanceOf[js.Any]))
    isBase64Encoded.foreach(_v => _obj$.updateDynamic("isBase64Encoded")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[ALBResult]
  }
}
