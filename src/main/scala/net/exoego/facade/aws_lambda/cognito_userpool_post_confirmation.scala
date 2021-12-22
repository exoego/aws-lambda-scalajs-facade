package net.exoego.facade.aws_lambda

import scala.scalajs.js

/** @see
  *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-post-confirmation.html
  */
@js.native
trait BasePostConfirmationTriggerEvent[T <: String] extends BaseTriggerEvent[T] {
  var request: PostConfirmationTriggerEventRequest = js.native
}

@js.native
trait PostConfirmationConfirmSignUpTriggerEvent
    extends BasePostConfirmationTriggerEvent["PostConfirmation_ConfirmSignUp"]

object PostConfirmationConfirmSignUpTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: PostConfirmationTriggerEventRequest
  ): PostConfirmationConfirmSignUpTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "PostConfirmation_ConfirmSignUp",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[PostConfirmationConfirmSignUpTriggerEvent]
  }
}

@js.native
trait PostConfirmationConfirmForgotPassword
    extends BasePostConfirmationTriggerEvent["PostConfirmation_ConfirmForgotPassword"]

object PostConfirmationConfirmForgotPassword {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: PostConfirmationTriggerEventRequest
  ): PostConfirmationConfirmForgotPassword = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "PostConfirmation_ConfirmForgotPassword",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[PostConfirmationConfirmForgotPassword]
  }
}

@js.native
trait PostConfirmationTriggerEventRequest extends js.Object {
  var userAttributes: js.Dictionary[String]
  var clientMetadata: js.UndefOr[js.Dictionary[String]]
}

object PostConfirmationTriggerEventRequest {
  def apply(
      userAttributes: js.Dictionary[String],
      clientMetadata: js.UndefOr[js.Dictionary[String]] = js.undefined
  ): PostConfirmationTriggerEventRequest = {
    val _obj$ = js.Dynamic.literal(
      "userAttributes" -> userAttributes.asInstanceOf[js.Any]
    )
    clientMetadata.foreach(_v => _obj$.updateDynamic("clientMetadata")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[PostConfirmationTriggerEventRequest]
  }
}
