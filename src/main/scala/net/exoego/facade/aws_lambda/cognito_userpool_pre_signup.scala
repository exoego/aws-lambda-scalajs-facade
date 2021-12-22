package net.exoego.facade.aws_lambda

import scala.scalajs.js

/** @see
  *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-sign-up.html
  */
@js.native
trait BasePreSignUpTriggerEvent[T <: String] extends BaseTriggerEvent[T] {
  var request: PreSignUpTriggerEventRequest = js.native
  var response: PreSignUpTriggerEventResponse = js.native
}

@js.native
trait PreSignUpEmailTriggerEvent extends BaseTriggerEvent["PreSignUp_SignUp"]

object PreSignUpEmailTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: PreSignUpTriggerEventRequest,
      response: PreSignUpTriggerEventResponse
  ): PreSignUpEmailTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "PreSignUp_SignUp",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[PreSignUpEmailTriggerEvent]
  }
}

@js.native
trait PreSignUpExternalProviderTriggerEvent extends BaseTriggerEvent["PreSignUp_ExternalProvider"]

object PreSignUpExternalProviderTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: PreSignUpTriggerEventRequest,
      response: PreSignUpTriggerEventResponse
  ): PreSignUpExternalProviderTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "PreSignUp_ExternalProvider",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[PreSignUpExternalProviderTriggerEvent]
  }
}

@js.native
trait PreSignUpAdminCreateUserTriggerEvent extends BaseTriggerEvent["PreSignUp_AdminCreateUser"]

object PreSignUpAdminCreateUserTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: PreSignUpTriggerEventRequest,
      response: PreSignUpTriggerEventResponse
  ): PreSignUpAdminCreateUserTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "PreSignUp_ExternalProvider",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[PreSignUpAdminCreateUserTriggerEvent]
  }
}

@js.native
trait PreSignUpTriggerEventRequest extends js.Object {
  var userAttributes: js.Dictionary[String]
  var validationData: js.UndefOr[js.Dictionary[String]]
  var clientMetadata: js.UndefOr[js.Dictionary[String]]
}

object PreSignUpTriggerEventRequest {
  def apply(
      userAttributes: js.Dictionary[String],
      validationData: js.UndefOr[js.Dictionary[String]] = js.undefined,
      clientMetadata: js.UndefOr[js.Dictionary[String]] = js.undefined
  ): PreSignUpTriggerEventRequest = {
    val _obj$ = js.Dynamic.literal(
      "userAttributes" -> userAttributes.asInstanceOf[js.Any]
    )
    validationData.foreach(_v => _obj$.updateDynamic("validationData")(_v.asInstanceOf[js.Any]))
    clientMetadata.foreach(_v => _obj$.updateDynamic("clientMetadata")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[PreSignUpTriggerEventRequest]
  }
}

@js.native
trait PreSignUpTriggerEventResponse extends js.Object {
  var autoConfirmUser: Boolean
  var autoVerifyEmail: Boolean
  var autoVerifyPhone: Boolean
}

object PreSignUpTriggerEventResponse {
  def apply(
      autoConfirmUser: Boolean,
      autoVerifyEmail: Boolean,
      autoVerifyPhone: Boolean
  ): PreSignUpTriggerEventResponse = {
    val _obj$ = js.Dynamic.literal(
      "autoConfirmUser" -> autoConfirmUser.asInstanceOf[js.Any],
      "autoVerifyEmail" -> autoVerifyEmail.asInstanceOf[js.Any],
      "autoVerifyPhone" -> autoVerifyPhone.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[PreSignUpTriggerEventResponse]
  }
}
