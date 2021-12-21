package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait CloudFormationCustomResourceEventCommon extends js.Object {
  var ServiceToken: String = js.native
  var ResponseURL: String = js.native
  var StackId: String = js.native
  var RequestId: String = js.native
  var LogicalResourceId: String = js.native
  var ResourceType: String = js.native
  var ResourceProperties: CloudFormationCustomResourceEventCommon.ResourceProperties = js.native
}

object CloudFormationCustomResourceEventCommon {
  type ResourceProperties = js.Dictionary[js.Any]
}

@js.native
trait CloudFormationCustomResourceCreateEvent extends js.Object with CloudFormationCustomResourceEventCommon {
  var RequestType: String = js.native
}

@js.native
trait CloudFormationCustomResourceUpdateEvent extends js.Object with CloudFormationCustomResourceEventCommon {
  var RequestType: String = js.native
  var PhysicalResourceId: String = js.native
  var OldResourceProperties: CloudFormationCustomResourceUpdateEvent.OldResourceProperties = js.native
}

object CloudFormationCustomResourceUpdateEvent {
  type OldResourceProperties = js.Dictionary[js.Any]
}

@js.native
trait CloudFormationCustomResourceDeleteEvent extends js.Object with CloudFormationCustomResourceEventCommon {
  var RequestType: String = js.native
  var PhysicalResourceId: String = js.native
}

@js.native
trait CloudFormationCustomResourceResponseCommon extends js.Object {
  var PhysicalResourceId: String = js.native
  var StackId: String = js.native
  var RequestId: String = js.native
  var LogicalResourceId: String = js.native
  var Data: js.UndefOr[CloudFormationCustomResourceResponseCommon.Data] = js.native
}

object CloudFormationCustomResourceResponseCommon {
  type Data = js.Dictionary[js.Any]
}

@js.native
trait CloudFormationCustomResourceSuccessResponse extends js.Object with CloudFormationCustomResourceResponseCommon {
  var Status: String = js.native
  var Reason: js.UndefOr[String] = js.native
}

@js.native
trait CloudFormationCustomResourceFailedResponse extends js.Object with CloudFormationCustomResourceResponseCommon {
  var Status: String = js.native
  var Reason: String = js.native
}
