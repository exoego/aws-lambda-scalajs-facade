package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js

@Factory
@js.native
trait CloudFrontResponseEventRecordItem extends js.Object {
  var config: CloudFrontEvent.Config
  def request: CloudFrontRequest
  var response: CloudFrontResponse
}

@Factory
trait CloudFrontResponseEvent extends js.Object {
  var Records: js.Array[CloudFrontResponseEventRecordItem]
}
