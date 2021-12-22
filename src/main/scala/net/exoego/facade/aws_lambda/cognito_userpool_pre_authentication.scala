package net.exoego.facade.aws_lambda

import scala.scalajs.js

/** @see
  *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-authentication.html
  */
@js.native
trait PreAuthenticationTriggerEvent extends BaseTriggerEvent["PreAuthentication_Authentication"] {
  var request: PreAuthenticationTriggerEventRequest = js.native
}

object PreAuthenticationTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: PreAuthenticationTriggerEventRequest
  ): PreAuthenticationTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "PreAuthentication_Authentication",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[PreAuthenticationTriggerEvent]
  }
}

@js.native
trait PreAuthenticationTriggerEventRequest extends js.Object {
  var userAttributes: js.Dictionary[String] = js.native
  var userNotFound: js.UndefOr[Boolean] = js.native
  var validationData: js.UndefOr[js.Dictionary[String]] = js.native
}

object PreAuthenticationTriggerEventRequest {
  def apply(
      userAttributes: js.Dictionary[String],
      userNotFound: js.UndefOr[Boolean] = js.undefined,
      validationData: js.UndefOr[js.Dictionary[String]] = js.undefined
  ): PreAuthenticationTriggerEventRequest = {
    val _obj$ = js.Dynamic.literal(
      "userAttributes" -> userAttributes.asInstanceOf[js.Any]
    )
    userNotFound.foreach(_v => _obj$.updateDynamic("userNotFound")(_v.asInstanceOf[js.Any]))
    validationData.foreach(_v => _obj$.updateDynamic("validationData")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[PreAuthenticationTriggerEventRequest]
  }
}
