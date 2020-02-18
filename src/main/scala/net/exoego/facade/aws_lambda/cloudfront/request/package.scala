package net.exoego.facade.aws_lambda.cloudfront

import net.exoego.facade.aws_lambda.{AsyncHandler, Handler}

import scala.scalajs.js
import scala.scalajs.js.|

package object request {
  type CloudFrontRequestHandler =
    Handler[CloudFrontRequestEvent, CloudFrontRequestResult]
  type AsyncCloudFrontRequestHandler =
    AsyncHandler[CloudFrontRequestEvent, CloudFrontRequestResult]
  type CloudFrontRequestResult =
    js.UndefOr[CloudFrontResultResponse | CloudFrontRequest]

}
