package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait IoTPreProvisioningHookEvent extends js.Object {
  var claimCertificateId: String = js.native
  var certificateId: String = js.native
  var certificatePem: String = js.native
  var templateArn: String = js.native
  var clientId: String = js.native
  var parameters: js.Dictionary[String] = js.native
}

object IoTPreProvisioningHookEvent {
  def apply(
      claimCertificateId: String,
      certificateId: String,
      certificatePem: String,
      templateArn: String,
      clientId: String,
      parameters: js.Dictionary[String]
  ): IoTPreProvisioningHookEvent = {
    val _obj$ = js.Dynamic.literal(
      "claimCertificateId" -> claimCertificateId.asInstanceOf[js.Any],
      "certificateId" -> certificateId.asInstanceOf[js.Any],
      "certificatePem" -> certificatePem.asInstanceOf[js.Any],
      "templateArn" -> templateArn.asInstanceOf[js.Any],
      "clientId" -> clientId.asInstanceOf[js.Any],
      "parameters" -> parameters.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[IoTPreProvisioningHookEvent]
  }
}

@js.native
trait IoTPreProvisioningHookResult extends js.Object {
  var allowProvisioning: Boolean = js.native
  var parameterOverrides: js.Dictionary[String] = js.native
}

object IoTPreProvisioningHookResult {
  def apply(
      allowProvisioning: Boolean,
      parameterOverrides: js.Dictionary[String]
  ): IoTPreProvisioningHookResult = {
    val _obj$ = js.Dynamic.literal(
      "allowProvisioning" -> allowProvisioning.asInstanceOf[js.Any],
      "parameterOverrides" -> parameterOverrides.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[IoTPreProvisioningHookResult]
  }
}
