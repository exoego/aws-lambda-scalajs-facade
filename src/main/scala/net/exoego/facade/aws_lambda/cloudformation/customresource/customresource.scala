package net.exoego.facade.aws_lambda.cloudformation.customresource

import scala.scalajs.js

@js.native
trait CloudFormationCustomResourceEventCommon extends js.Object {
  var ServiceToken: String = js.native
  var ResponseURL: String = js.native
  var StackId: String = js.native
  var RequestId: String = js.native
  var LogicalResourceId: String = js.native
  var ResourceType: String = js.native
  var ResourceProperties
      : CloudFormationCustomResourceEventCommon.ResourceProperties = js.native
}

object CloudFormationCustomResourceEventCommon {
  def apply(
      ServiceToken: String,
      ResponseURL: String,
      StackId: String,
      RequestId: String,
      LogicalResourceId: String,
      ResourceType: String,
      ResourceProperties: CloudFormationCustomResourceEventCommon.ResourceProperties
  ): CloudFormationCustomResourceEventCommon = {
    val _obj$ = js.Dynamic.literal(
      "ServiceToken" -> ServiceToken.asInstanceOf[js.Any],
      "ResponseURL" -> ResponseURL.asInstanceOf[js.Any],
      "StackId" -> StackId.asInstanceOf[js.Any],
      "RequestId" -> RequestId.asInstanceOf[js.Any],
      "LogicalResourceId" -> LogicalResourceId.asInstanceOf[js.Any],
      "ResourceType" -> ResourceType.asInstanceOf[js.Any],
      "ResourceProperties" -> ResourceProperties.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFormationCustomResourceEventCommon]
  }
  type ResourceProperties = js.Dictionary[js.Any]
}

@js.native
trait CloudFormationCustomResourceCreateEvent
    extends CloudFormationCustomResourceEventCommon {
  var RequestType: String = js.native
}

object CloudFormationCustomResourceCreateEvent {
  def apply(
      RequestType: String
  ): CloudFormationCustomResourceCreateEvent = {
    val _obj$ = js.Dynamic.literal(
      "RequestType" -> RequestType.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFormationCustomResourceCreateEvent]
  }
}

@js.native
trait CloudFormationCustomResourceUpdateEvent
    extends CloudFormationCustomResourceEventCommon {
  var RequestType: String = js.native
  var PhysicalResourceId: String = js.native
  var OldResourceProperties
      : CloudFormationCustomResourceUpdateEvent.OldResourceProperties =
    js.native
}

object CloudFormationCustomResourceUpdateEvent {
  def apply(
      RequestType: String,
      PhysicalResourceId: String,
      OldResourceProperties: CloudFormationCustomResourceUpdateEvent.OldResourceProperties
  ): CloudFormationCustomResourceUpdateEvent = {
    val _obj$ = js.Dynamic.literal(
      "RequestType" -> RequestType.asInstanceOf[js.Any],
      "PhysicalResourceId" -> PhysicalResourceId.asInstanceOf[js.Any],
      "OldResourceProperties" -> OldResourceProperties.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFormationCustomResourceUpdateEvent]
  }
  type OldResourceProperties = js.Dictionary[js.Any]
}

@js.native
trait CloudFormationCustomResourceDeleteEvent
    extends CloudFormationCustomResourceEventCommon {
  var RequestType: String = js.native
  var PhysicalResourceId: String = js.native
}

object CloudFormationCustomResourceDeleteEvent {
  def apply(
      RequestType: String,
      PhysicalResourceId: String
  ): CloudFormationCustomResourceDeleteEvent = {
    val _obj$ = js.Dynamic.literal(
      "RequestType" -> RequestType.asInstanceOf[js.Any],
      "PhysicalResourceId" -> PhysicalResourceId.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFormationCustomResourceDeleteEvent]
  }
}
@js.native
trait CloudFormationCustomResourceResponseCommon extends js.Object {
  var PhysicalResourceId: String = js.native
  var StackId: String = js.native
  var RequestId: String = js.native
  var LogicalResourceId: String = js.native
  var Data: js.UndefOr[CloudFormationCustomResourceResponseCommon.Data] =
    js.native
}

object CloudFormationCustomResourceResponseCommon {
  def apply(
      PhysicalResourceId: String,
      StackId: String,
      RequestId: String,
      LogicalResourceId: String,
      Data: js.UndefOr[CloudFormationCustomResourceResponseCommon.Data] =
        js.undefined,
      NoEcho: js.UndefOr[Boolean] = js.undefined
  ): CloudFormationCustomResourceResponseCommon = {
    val _obj$ = js.Dynamic.literal(
      "PhysicalResourceId" -> PhysicalResourceId.asInstanceOf[js.Any],
      "StackId" -> StackId.asInstanceOf[js.Any],
      "RequestId" -> RequestId.asInstanceOf[js.Any],
      "LogicalResourceId" -> LogicalResourceId.asInstanceOf[js.Any]
    )
    Data.foreach(_v => _obj$.updateDynamic("Data")(_v.asInstanceOf[js.Any]))
    NoEcho.foreach(_v => _obj$.updateDynamic("NoEcho")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CloudFormationCustomResourceResponseCommon]
  }
  type Data = js.Dictionary[js.Any]
}

@js.native
trait CloudFormationCustomResourceSuccessResponse
    extends CloudFormationCustomResourceResponseCommon {
  var Status: String = js.native
  var Reason: js.UndefOr[String] = js.native
}

object CloudFormationCustomResourceSuccessResponse {
  def apply(
      Status: String,
      Reason: js.UndefOr[String] = js.undefined
  ): CloudFormationCustomResourceSuccessResponse = {
    val _obj$ = js.Dynamic.literal(
      "Status" -> Status.asInstanceOf[js.Any]
    )
    Reason.foreach(_v => _obj$.updateDynamic("Reason")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CloudFormationCustomResourceSuccessResponse]
  }
}

@js.native
trait CloudFormationCustomResourceFailedResponse
    extends CloudFormationCustomResourceResponseCommon {
  var Status: String = js.native
  var Reason: String = js.native
}

object CloudFormationCustomResourceFailedResponse {
  def apply(
      Status: String,
      Reason: String
  ): CloudFormationCustomResourceFailedResponse = {
    val _obj$ = js.Dynamic.literal(
      "Status" -> Status.asInstanceOf[js.Any],
      "Reason" -> Reason.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFormationCustomResourceFailedResponse]
  }
}
