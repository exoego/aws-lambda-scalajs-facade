package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js

@Factory
trait CloudFrontRequestEventRecordItem extends js.Object with CloudFrontEvent {
  var request: CloudFrontRequest
}

@Factory
trait CloudFrontRequestEvent extends js.Object {
  var Records: js.Array[CloudFrontRequestEventRecordItem]
}
