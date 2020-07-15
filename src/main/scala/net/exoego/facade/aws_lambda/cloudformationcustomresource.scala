package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js

@Factory
trait CloudFormationCustomResourceEventCommon extends js.Object {
  var ServiceToken: String
  var ResponseURL: String
  var StackId: String
  var RequestId: String
  var LogicalResourceId: String
  var ResourceType: String
  var ResourceProperties: CloudFormationCustomResourceEventCommon.ResourceProperties
}

object CloudFormationCustomResourceEventCommon {
  type ResourceProperties = js.Dictionary[js.Any]
}

@Factory
trait CloudFormationCustomResourceCreateEvent
    extends js.Object
    with CloudFormationCustomResourceEventCommon {
  var RequestType: String
}

@Factory
trait CloudFormationCustomResourceUpdateEvent
    extends js.Object
    with CloudFormationCustomResourceEventCommon {
  var RequestType: String
  var PhysicalResourceId: String
  var OldResourceProperties: CloudFormationCustomResourceUpdateEvent.OldResourceProperties
}

object CloudFormationCustomResourceUpdateEvent {
  type OldResourceProperties = js.Dictionary[js.Any]
}

@Factory
trait CloudFormationCustomResourceDeleteEvent
    extends js.Object
    with CloudFormationCustomResourceEventCommon {
  var RequestType: String
  var PhysicalResourceId: String
}

@Factory
trait CloudFormationCustomResourceResponseCommon extends js.Object {
  var PhysicalResourceId: String
  var StackId: String
  var RequestId: String
  var LogicalResourceId: String
  var Data: js.UndefOr[CloudFormationCustomResourceResponseCommon.Data] =
    js.undefined
}

object CloudFormationCustomResourceResponseCommon {
  type Data = js.Dictionary[js.Any]
}

@Factory
trait CloudFormationCustomResourceSuccessResponse
    extends js.Object
    with CloudFormationCustomResourceResponseCommon {
  var Status: String
  var Reason: js.UndefOr[String]
}

@Factory
trait CloudFormationCustomResourceFailedResponse
    extends js.Object
    with CloudFormationCustomResourceResponseCommon {
  var Status: String
  var Reason: String
}
