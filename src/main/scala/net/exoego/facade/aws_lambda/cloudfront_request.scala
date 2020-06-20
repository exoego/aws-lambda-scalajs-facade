package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js

@Factory
@js.native
trait CloudFrontRequestEventRecordItem extends js.Object with CloudFrontEvent {
  var request: CloudFrontRequest = js.native
}

@Factory
@js.native
trait CloudFrontRequestEvent extends js.Object {
  var Records: js.Array[CloudFrontRequestEventRecordItem] = js.native
}
