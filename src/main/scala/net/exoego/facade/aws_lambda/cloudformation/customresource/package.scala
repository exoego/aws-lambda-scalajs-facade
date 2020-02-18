package net.exoego.facade.aws_lambda.cloudformation

import net.exoego.facade.aws_lambda.{AsyncHandler, Handler}

import scala.scalajs.js.|

package object customresource {
  type CloudFormationCustomResourceEvent =
    CloudFormationCustomResourceCreateEvent | CloudFormationCustomResourceUpdateEvent | CloudFormationCustomResourceDeleteEvent
  type CloudFormationCustomResourceHandler =
    Handler[CloudFormationCustomResourceEvent, Unit]
  type AsyncCloudFormationCustomResourceHandler =
    AsyncHandler[CloudFormationCustomResourceEvent, Unit]
  type CloudFormationCustomResourceResponse =
    CloudFormationCustomResourceSuccessResponse | CloudFormationCustomResourceFailedResponse
}
