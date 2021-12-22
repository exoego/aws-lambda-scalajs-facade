package net.exoego.facade.aws_lambda

import scala.scalajs.js

/** @see
  *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-post-authentication.html
  */
@js.native
trait PostAuthenticationTriggerEvent extends BaseTriggerEvent["PostAuthentication_Authentication"] {
  var request: PostAuthenticationTriggerEventRequest = js.native
}

object PostAuthenticationTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: PostAuthenticationTriggerEventRequest
  ): PostAuthenticationTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "PostAuthentication_Authentication",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[PostAuthenticationTriggerEvent]
  }
}

@js.native
trait PostAuthenticationTriggerEventRequest extends js.Object {
  var userAttributes: js.Dictionary[String] = js.native
  var newDeviceUsed: Boolean = js.native
  var clientMetadata: js.UndefOr[js.Dictionary[String]] = js.native
}

object PostAuthenticationTriggerEventRequest {
  def apply(
      userAttributes: js.Dictionary[String],
      newDeviceUsed: Boolean,
      clientMetadata: js.UndefOr[js.Dictionary[String]] = js.undefined
  ): PostAuthenticationTriggerEventRequest = {
    val _obj$ = js.Dynamic.literal(
      "userAttributes" -> userAttributes.asInstanceOf[js.Any],
      "newDeviceUsed" -> newDeviceUsed.asInstanceOf[js.Any]
    )
    clientMetadata.foreach(_v => _obj$.updateDynamic("clientMetadata")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[PostAuthenticationTriggerEventRequest]
  }
}
