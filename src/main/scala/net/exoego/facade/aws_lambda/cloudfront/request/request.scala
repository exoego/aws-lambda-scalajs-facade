package net.exoego.facade.aws_lambda.cloudfront.request

import net.exoego.facade.aws_lambda.cloudfront._
import scala.scalajs.js

@js.native
trait CloudFrontRequestEventRecordItem extends CloudFrontEvent {
  var request: CloudFrontRequest = js.native
}

object CloudFrontRequestEventRecordItem {
  def apply(
      config: CloudFrontEvent.Config,
      requrest: CloudFrontRequest
  ): CloudFrontRequestEventRecordItem = {
    val _obj$ = js.Dynamic.literal(
      "config" -> config.asInstanceOf[js.Any],
      "requrest" -> requrest.asInstanceOf[js.Any]
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
