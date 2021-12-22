package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait CloudFrontRequestEventCf extends CloudFrontEvent {
  var request: CloudFrontRequest = js.native
}

object CloudFrontRequestEventCf {
  def apply(
      config: CloudFrontEvent.Config,
      request: CloudFrontRequest
  ): CloudFrontRequestEventCf = {
    val _obj$ = js.Dynamic.literal(
      "config" -> config.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFrontRequestEventCf]
  }
}

@js.native
trait CloudFrontRequestEventRecordItem extends js.Object {
  var cf: CloudFrontRequestEventCf = js.native
}

object CloudFrontRequestEventRecordItem {
  def apply(
      cf: CloudFrontRequestEventCf
  ): CloudFrontRequestEventRecordItem = {
    val _obj$ = js.Dynamic.literal(
      "cf" -> cf.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFrontRequestEventRecordItem]
  }
}

@js.native
trait CloudFrontRequestEvent extends js.Object {
  var Records: js.Array[CloudFrontRequestEventRecordItem] = js.native
}

object CloudFrontRequestEvent {
  def apply(
      Records: js.Array[CloudFrontRequestEventRecordItem]
  ): CloudFrontRequestEvent = {
    val _obj$ = js.Dynamic.literal(
      "Records" -> Records.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFrontRequestEvent]
  }
}
