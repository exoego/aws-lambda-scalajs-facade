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

@js.native
trait IoTPreProvisioningHookResult extends js.Object {
  var allowProvisioning: Boolean = js.native
  var parameterOverrides: js.Dictionary[String] = js.native
}
