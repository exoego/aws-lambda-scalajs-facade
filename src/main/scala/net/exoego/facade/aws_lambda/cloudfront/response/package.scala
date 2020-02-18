package net.exoego.facade.aws_lambda.cloudfront

import net.exoego.facade.aws_lambda.{AsyncHandler, Handler}

import scala.scalajs.js

package object response {
  type CloudFrontResponseHandler =
    Handler[CloudFrontResponseEvent, CloudFrontResponseResult]
  type AsyncCloudFrontResponseHandler =
    AsyncHandler[CloudFrontResponseEvent, CloudFrontResponseResult]
  type CloudFrontResponseResult = js.UndefOr[CloudFrontResultResponse]
}
