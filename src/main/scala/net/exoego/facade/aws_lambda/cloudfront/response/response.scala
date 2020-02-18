package net.exoego.facade.aws_lambda.cloudfront.response

import net.exoego.facade.aws_lambda.cloudfront._
import scala.scalajs.js

@js.native
trait CloudFrontResponseEventRecordItem extends js.Object {
  var config: CloudFrontEvent.Config = js.native
  def request: CloudFrontRequest = js.native
  var response: CloudFrontResponse = js.native
}

object CloudFrontResponseEventRecordItem {
  def apply(
      config: CloudFrontEvent.Config,
      request: CloudFrontRequest,
      response: CloudFrontResponse
  ): CloudFrontResponseEventRecordItem = {
    val _obj$ = js.Dynamic.literal(
      "config" -> config.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFrontResponseEventRecordItem]
  }
}

@js.native
trait CloudFrontResponseEvent extends js.Object {
  var Records: js.Array[CloudFrontResponseEventRecordItem] = js.native
}

object CloudFrontResponseEvent {
  def apply(
      Records: js.Array[js.Any]
  ): CloudFrontResponseEvent = {
    val _obj$ = js.Dynamic.literal(
      "Records" -> Records.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFrontResponseEvent]
  }
}
