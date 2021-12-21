package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait CloudFrontRequestEventCf extends js.Object with CloudFrontEvent {
  var request: CloudFrontRequest = js.native
}

@js.native
trait CloudFrontRequestEventRecordItem extends js.Object {
  var cf: CloudFrontRequestEventCf = js.native
}

@js.native
trait CloudFrontRequestEvent extends js.Object {
  var Records: js.Array[CloudFrontRequestEventRecordItem] = js.native
}
