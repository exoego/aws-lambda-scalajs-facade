package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js

@Factory
@js.native
trait CloudFrontResponseEventRecordItem extends js.Object {
  var config: CloudFrontEvent.Config = js.native
  def request: CloudFrontRequest = js.native
  var response: CloudFrontResponse = js.native
}

@Factory
@js.native
trait CloudFrontResponseEvent extends js.Object {
  var Records: js.Array[CloudFrontResponseEventRecordItem] = js.native
}
