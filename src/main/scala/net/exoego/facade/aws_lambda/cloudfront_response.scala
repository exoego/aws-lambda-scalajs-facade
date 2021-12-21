package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait CloudFrontResponseEventCf extends js.Object {
  var config: CloudFrontEvent.Config = js.native
  def request: CloudFrontRequest = js.native
  var response: CloudFrontResponse = js.native
}

@js.native
trait CloudFrontResponseEventRecordItem extends js.Object {
  var cf: CloudFrontResponseEventCf = js.native
}

@js.native
trait CloudFrontResponseEvent extends js.Object {
  var Records: js.Array[CloudFrontResponseEventRecordItem] = js.native
}
