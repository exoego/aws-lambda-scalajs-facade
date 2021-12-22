package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait CloudFormationCustomResourceEventCommon[TRequestType <: String] extends js.Object {
  var ServiceToken: String = js.native
  var ResponseURL: String = js.native
  var StackId: String = js.native
  var RequestId: String = js.native
  var RequestType: TRequestType = js.native
  var LogicalResourceId: String = js.native
  var ResourceType: String = js.native
  var ResourceProperties: CloudFormationCustomResourceEventCommon.ResourceProperties = js.native
}

object CloudFormationCustomResourceEventCommon {
  type ResourceProperties = js.Dictionary[js.Any]
}

@js.native
trait CloudFormationCustomResourceCreateEvent extends CloudFormationCustomResourceEventCommon["Create"]

object CloudFormationCustomResourceCreateEvent {
  def apply(
      ServiceToken: String,
      ResponseURL: String,
      StackId: String,
      RequestId: String,
      LogicalResourceId: String,
      ResourceType: String,
      ResourceProperties: CloudFormationCustomResourceEventCommon.ResourceProperties
  ): CloudFormationCustomResourceCreateEvent = {
    val _obj$ = js.Dynamic.literal(
      "RequestType" -> "Create",
      "ServiceToken" -> ServiceToken.asInstanceOf[js.Any],
      "ResponseURL" -> ResponseURL.asInstanceOf[js.Any],
      "StackId" -> StackId.asInstanceOf[js.Any],
      "RequestId" -> RequestId.asInstanceOf[js.Any],
      "LogicalResourceId" -> LogicalResourceId.asInstanceOf[js.Any],
      "ResourceType" -> ResourceType.asInstanceOf[js.Any],
      "ResourceProperties" -> ResourceProperties.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFormationCustomResourceCreateEvent]
  }
}

@js.native
trait CloudFormationCustomResourceUpdateEvent extends CloudFormationCustomResourceEventCommon["Update"] {
  var PhysicalResourceId: String = js.native
  var OldResourceProperties: CloudFormationCustomResourceUpdateEvent.OldResourceProperties = js.native
}

object CloudFormationCustomResourceUpdateEvent {
  type OldResourceProperties = js.Dictionary[js.Any]

  def apply(
      ServiceToken: String,
      ResponseURL: String,
      StackId: String,
      RequestId: String,
      LogicalResourceId: String,
      ResourceType: String,
      ResourceProperties: CloudFormationCustomResourceEventCommon.ResourceProperties,
      PhysicalResourceId: String,
      OldResourceProperties: CloudFormationCustomResourceUpdateEvent.OldResourceProperties
  ): CloudFormationCustomResourceUpdateEvent = {
    val _obj$ = js.Dynamic.literal(
      "RequestType" -> "Update",
      "ServiceToken" -> ServiceToken.asInstanceOf[js.Any],
      "ResponseURL" -> ResponseURL.asInstanceOf[js.Any],
      "StackId" -> StackId.asInstanceOf[js.Any],
      "RequestId" -> RequestId.asInstanceOf[js.Any],
      "LogicalResourceId" -> LogicalResourceId.asInstanceOf[js.Any],
      "ResourceType" -> ResourceType.asInstanceOf[js.Any],
      "ResourceProperties" -> ResourceProperties.asInstanceOf[js.Any],
      "PhysicalResourceId" -> PhysicalResourceId.asInstanceOf[js.Any],
      "OldResourceProperties" -> OldResourceProperties.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFormationCustomResourceUpdateEvent]
  }
}

@js.native
trait CloudFormationCustomResourceDeleteEvent extends js.Object with CloudFormationCustomResourceEventCommon["Delete"] {
  var PhysicalResourceId: String = js.native
}

object CloudFormationCustomResourceDeleteEvent {
  def apply(
      ServiceToken: String,
      ResponseURL: String,
      StackId: String,
      RequestId: String,
      LogicalResourceId: String,
      ResourceType: String,
      ResourceProperties: CloudFormationCustomResourceEventCommon.ResourceProperties,
      PhysicalResourceId: String
  ): CloudFormationCustomResourceUpdateEvent = {
    val _obj$ = js.Dynamic.literal(
      "RequestType" -> "Delete",
      "ServiceToken" -> ServiceToken.asInstanceOf[js.Any],
      "ResponseURL" -> ResponseURL.asInstanceOf[js.Any],
      "StackId" -> StackId.asInstanceOf[js.Any],
      "RequestId" -> RequestId.asInstanceOf[js.Any],
      "LogicalResourceId" -> LogicalResourceId.asInstanceOf[js.Any],
      "ResourceType" -> ResourceType.asInstanceOf[js.Any],
      "ResourceProperties" -> ResourceProperties.asInstanceOf[js.Any],
      "PhysicalResourceId" -> PhysicalResourceId.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CloudFormationCustomResourceUpdateEvent]
  }
}

@js.native
trait CloudFormationCustomResourceResponseCommon[TStatus <: String] extends js.Object {
  var PhysicalResourceId: String = js.native
  var StackId: String = js.native
  var RequestId: String = js.native
  var LogicalResourceId: String = js.native
  var Data: js.UndefOr[CloudFormationCustomResourceResponseCommon.Data] = js.native
  var Status: TStatus = js.native
}

object CloudFormationCustomResourceResponseCommon {
  type Data = js.Dictionary[js.Any]
}

@js.native
trait CloudFormationCustomResourceSuccessResponse extends CloudFormationCustomResourceResponseCommon["SUCCESS"] {
  var Reason: js.UndefOr[String] = js.native
}

object CloudFormationCustomResourceSuccessResponse {
  def apply(
      PhysicalResourceId: String,
      StackId: String,
      RequestId: String,
      LogicalResourceId: String,
      Reason: js.UndefOr[String] = js.undefined,
      Data: js.UndefOr[CloudFormationCustomResourceResponseCommon.Data] = js.undefined,
      NoEcho: js.UndefOr[Boolean] = js.undefined
  ): CloudFormationCustomResourceSuccessResponse = {
    val _obj$ = js.Dynamic.literal(
      "Status" -> "SUCCESS",
      "PhysicalResourceId" -> PhysicalResourceId.asInstanceOf[js.Any],
      "StackId" -> StackId.asInstanceOf[js.Any],
      "RequestId" -> RequestId.asInstanceOf[js.Any],
      "Reason" -> Reason.asInstanceOf[js.Any],
      "LogicalResourceId" -> LogicalResourceId.asInstanceOf[js.Any]
    )
    Data.foreach(_v => _obj$.updateDynamic("Data")(_v.asInstanceOf[js.Any]))
    NoEcho.foreach(_v => _obj$.updateDynamic("NoEcho")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CloudFormationCustomResourceSuccessResponse]
  }
}

@js.native
trait CloudFormationCustomResourceFailedResponse extends CloudFormationCustomResourceResponseCommon["FAILED"] {
  var Reason: String = js.native
}

object CloudFormationCustomResourceFailedResponse {
  def apply(
      PhysicalResourceId: String,
      StackId: String,
      RequestId: String,
      LogicalResourceId: String,
      Reason: String,
      Data: js.UndefOr[CloudFormationCustomResourceResponseCommon.Data] = js.undefined,
      NoEcho: js.UndefOr[Boolean] = js.undefined
  ): CloudFormationCustomResourceFailedResponse = {
    val _obj$ = js.Dynamic.literal(
      "Status" -> "FAILED",
      "PhysicalResourceId" -> PhysicalResourceId.asInstanceOf[js.Any],
      "StackId" -> StackId.asInstanceOf[js.Any],
      "RequestId" -> RequestId.asInstanceOf[js.Any],
      "Reason" -> Reason.asInstanceOf[js.Any],
      "LogicalResourceId" -> LogicalResourceId.asInstanceOf[js.Any]
    )
    Data.foreach(_v => _obj$.updateDynamic("Data")(_v.asInstanceOf[js.Any]))
    NoEcho.foreach(_v => _obj$.updateDynamic("NoEcho")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CloudFormationCustomResourceFailedResponse]
  }
}
