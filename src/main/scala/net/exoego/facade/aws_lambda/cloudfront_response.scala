package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait CloudFrontResponseEventCf extends CloudFrontEvent {
  def request: CloudFrontRequest = js.native
  var response: CloudFrontResponse = js.native
}

object CloudFrontResponseEventCf {
  def apply(
      config: CloudFrontEvent.Config,
      request: CloudFrontRequest,
      response: CloudFrontResponse
  ): CloudFrontResponseEventCf = {
    val _obj$ = js.Dynamic.literal(
      "config" -> config.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFrontResponseEventCf]
  }
}

@js.native
trait CloudFrontResponseEventRecordItem extends js.Object {
  var cf: CloudFrontResponseEventCf = js.native
}

object CloudFrontResponseEventRecordItem {
  def apply(
      cf: CloudFrontResponseEventCf
  ): CloudFrontResponseEventRecordItem = {
    val _obj$ = js.Dynamic.literal(
      "cf" -> cf.asInstanceOf[js.Any]
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
      Records: js.Array[CloudFrontResponseEventRecordItem]
  ): CloudFrontResponseEvent = {
    val _obj$ = js.Dynamic.literal(
      "Records" -> Records.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFrontResponseEvent]
  }
}
