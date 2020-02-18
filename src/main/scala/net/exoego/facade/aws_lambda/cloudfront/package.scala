package net.exoego.facade.aws_lambda

import scala.scalajs.js

package object cloudfront {
  type CloudFrontHeaders = js.Dictionary[js.Array[CloudFrontHeadersItem]]
}
