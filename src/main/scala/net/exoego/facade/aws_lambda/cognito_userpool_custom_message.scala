package net.exoego.facade.aws_lambda

import scala.scalajs.js

/** @see
  *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-custom-message.html
  */
@js.native
trait BaseCustomMessageTriggerEvent[T <: String] extends BaseTriggerEvent[T] {
  var request: CustomMessageTriggerEventRequest = js.native
  var response: CustomMessageTriggerEventResponse = js.native
}

@js.native
trait CustomMessageAdminCreateUserTriggerEvent extends BaseCustomMessageTriggerEvent["CustomMessage_AdminCreateUser"]

object CustomMessageAdminCreateUserTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: CustomMessageTriggerEventRequest,
      response: CustomMessageTriggerEventResponse
  ): CustomMessageAdminCreateUserTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "CustomMessage_AdminCreateUser",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CustomMessageAdminCreateUserTriggerEvent]
  }
}

@js.native
trait CustomMessageAuthenticationTriggerEvent extends BaseCustomMessageTriggerEvent["CustomMessage_Authentication"]

object CustomMessageAuthenticationTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: CustomMessageTriggerEventRequest,
      response: CustomMessageTriggerEventResponse
  ): CustomMessageAuthenticationTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "CustomMessage_Authentication",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CustomMessageAuthenticationTriggerEvent]
  }
}

@js.native
trait CustomMessageForgotPasswordTriggerEvent extends BaseCustomMessageTriggerEvent["CustomMessage_ForgotPassword"]

object CustomMessageForgotPasswordTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: CustomMessageTriggerEventRequest,
      response: CustomMessageTriggerEventResponse
  ): CustomMessageForgotPasswordTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "CustomMessage_ForgotPassword",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CustomMessageForgotPasswordTriggerEvent]
  }
}

@js.native
trait CustomMessageResendCodeTriggerEvent extends BaseCustomMessageTriggerEvent["CustomMessage_ResendCode"]

object CustomMessageResendCodeTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: CustomMessageTriggerEventRequest,
      response: CustomMessageTriggerEventResponse
  ): CustomMessageResendCodeTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "CustomMessage_ResendCode",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CustomMessageResendCodeTriggerEvent]
  }
}

@js.native
trait CustomMessageSignUpTriggerEvent extends BaseCustomMessageTriggerEvent["CustomMessage_SignUp"]

object CustomMessageSignUpTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: CustomMessageTriggerEventRequest,
      response: CustomMessageTriggerEventResponse
  ): CustomMessageSignUpTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "CustomMessage_SignUp",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CustomMessageSignUpTriggerEvent]
  }
}

@js.native
trait CustomMessageUpdateUserAttributeTriggerEvent
    extends BaseCustomMessageTriggerEvent["CustomMessage_UpdateUserAttribute"]

object CustomMessageUpdateUserAttributeTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: CustomMessageTriggerEventRequest,
      response: CustomMessageTriggerEventResponse
  ): CustomMessageUpdateUserAttributeTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "CustomMessage_UpdateUserAttribute",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CustomMessageUpdateUserAttributeTriggerEvent]
  }
}

@js.native
trait CustomMessageVerifyUserAttributeTriggerEvent
    extends BaseCustomMessageTriggerEvent["CustomMessage_VerifyUserAttribute"]

object CustomMessageVerifyUserAttributeTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: CustomMessageTriggerEventRequest,
      response: CustomMessageTriggerEventResponse
  ): CustomMessageVerifyUserAttributeTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "CustomMessage_VerifyUserAttribute",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CustomMessageVerifyUserAttributeTriggerEvent]
  }
}

@js.native
trait CustomMessageTriggerEventRequest extends js.Object {
  var userAttributes: js.Dictionary[String]
  var codeParameter: String
  var usernameParameter: String
  var clientMetadata: js.UndefOr[js.Dictionary[String]]
}

object CustomMessageTriggerEventRequest {
  def apply(
      userAttributes: js.Dictionary[String],
      codeParameter: String,
      usernameParameter: String,
      clientMetadata: js.UndefOr[js.Dictionary[String]] = js.undefined
  ): CustomMessageTriggerEventRequest = {
    val _obj$ = js.Dynamic.literal(
      "userAttributes" -> userAttributes.asInstanceOf[js.Any],
      "codeParameter" -> codeParameter.asInstanceOf[js.Any],
      "usernameParameter" -> usernameParameter.asInstanceOf[js.Any]
    )
    clientMetadata.foreach(_v => _obj$.updateDynamic("clientMetadata")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CustomMessageTriggerEventRequest]
  }
}

@js.native
trait CustomMessageTriggerEventResponse extends js.Object {
  var smsMessage: String
  var emailMessage: String
  var emailSubject: String
}

object CustomMessageTriggerEventResponse {
  def apply(
      smsMessage: String,
      emailMessage: String,
      emailSubject: String
  ): CustomMessageTriggerEventResponse = {
    val _obj$ = js.Dynamic.literal(
      "smsMessage" -> smsMessage.asInstanceOf[js.Any],
      "emailMessage" -> emailMessage.asInstanceOf[js.Any],
      "emailSubject" -> emailSubject.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CustomMessageTriggerEventResponse]
  }
}
