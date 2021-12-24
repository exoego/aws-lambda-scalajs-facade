package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.|

/** @see
  *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-create-auth-challenge.html
  */
@js.native
trait BaseCustomEmailSenderTriggerEvent[T <: String, TRequestType] extends BaseTriggerEvent[T] {
  var request: BaseCustomEmailSenderTriggerEvent.Request = js.native
}

object BaseCustomEmailSenderTriggerEvent {
  @js.native
  trait Request extends js.Object {
    var `type`: String = js.native
    var code: String | Null = js.native
    var userAttributes: js.Dictionary[String] = js.native
    var clientMetadata: js.UndefOr[js.Dictionary[String]] = js.native
  }
}

@js.native
trait CustomEmailSender_AccountTakeOverNotification_UserAttributes extends js.Object {
  var EVENT_ID: String = js.native
  var USER_NAME: String = js.native
  var IP_ADDRESS: String = js.native
  var ACCOUNT_TAKE_OVER_ACTION: literal.AccountTakeOverActionType = js.native
  var ONE_CLICK_LINK_VALID: String = js.native
  var ONE_CLICK_LINK_INVALID: String = js.native
  var LOGIN_TIME: String = js.native
  var FEEDBACK_TOKEN: String = js.native
  var CITY: js.UndefOr[String] = js.native
  var COUNTRY: js.UndefOr[String] = js.native
  var DEVICE_NAME: js.UndefOr[String] = js.native
}

object CustomEmailSender_AccountTakeOverNotification_UserAttributes {
  def apply(
      EVENT_ID: String,
      USER_NAME: String,
      IP_ADDRESS: String,
      ACCOUNT_TAKE_OVER_ACTION: literal.AccountTakeOverActionType,
      ONE_CLICK_LINK_VALID: String,
      ONE_CLICK_LINK_INVALID: String,
      LOGIN_TIME: String,
      FEEDBACK_TOKEN: String,
      CITY: js.UndefOr[String] = js.undefined,
      COUNTRY: js.UndefOr[String] = js.undefined,
      DEVICE_NAME: js.UndefOr[String] = js.undefined
  ): CustomEmailSender_AccountTakeOverNotification_UserAttributes = {
    val _obj$ = js.Dynamic.literal(
      "EVENT_ID" -> EVENT_ID.asInstanceOf[js.Any],
      "USER_NAME" -> USER_NAME.asInstanceOf[js.Any],
      "IP_ADDRESS" -> IP_ADDRESS.asInstanceOf[js.Any],
      "ACCOUNT_TAKE_OVER_ACTION" -> ACCOUNT_TAKE_OVER_ACTION.asInstanceOf[js.Any],
      "ONE_CLICK_LINK_VALID" -> ONE_CLICK_LINK_VALID.asInstanceOf[js.Any],
      "ONE_CLICK_LINK_INVALID" -> ONE_CLICK_LINK_INVALID.asInstanceOf[js.Any],
      "LOGIN_TIME" -> LOGIN_TIME.asInstanceOf[js.Any],
      "FEEDBACK_TOKEN" -> FEEDBACK_TOKEN.asInstanceOf[js.Any]
    )
    CITY.foreach(_v => _obj$.updateDynamic("CITY")(_v.asInstanceOf[js.Any]))
    COUNTRY.foreach(_v => _obj$.updateDynamic("COUNTRY")(_v.asInstanceOf[js.Any]))
    DEVICE_NAME.foreach(_v => _obj$.updateDynamic("DEVICE_NAME")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CustomEmailSender_AccountTakeOverNotification_UserAttributes]
  }
}

@js.native
trait CustomEmailSenderSignUpTriggerEvent
    extends BaseCustomEmailSenderTriggerEvent["CustomEmailSender_SignUp", BaseCustomEmailSenderTriggerEvent.Request]

object CustomEmailSenderSignUpTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: BaseCustomEmailSenderTriggerEvent.Request
  ): CustomEmailSenderSignUpTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "CustomEmailSender_SignUp",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CustomEmailSenderSignUpTriggerEvent]
  }
}

@js.native
trait CustomEmailSenderResendCodeTriggerEvent
    extends BaseCustomEmailSenderTriggerEvent[
      "CustomEmailSender_ResendCode",
      BaseCustomEmailSenderTriggerEvent.Request
    ]

object CustomEmailSenderResendCodeTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: BaseCustomEmailSenderTriggerEvent.Request
  ): CustomEmailSenderResendCodeTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "CustomEmailSender_ResendCode",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CustomEmailSenderResendCodeTriggerEvent]
  }
}

@js.native
trait CustomEmailSenderForgotPasswordTriggerEvent
    extends BaseCustomEmailSenderTriggerEvent[
      "CustomEmailSender_ForgotPassword",
      BaseCustomEmailSenderTriggerEvent.Request
    ]

object CustomEmailSenderForgotPasswordTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: BaseCustomEmailSenderTriggerEvent.Request
  ): CustomEmailSenderForgotPasswordTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "CustomEmailSender_ForgotPassword",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CustomEmailSenderForgotPasswordTriggerEvent]
  }
}

@js.native
trait CustomEmailSenderUpdateUserAttributeTriggerEvent
    extends BaseCustomEmailSenderTriggerEvent[
      "CustomEmailSender_UpdateUserAttribute",
      BaseCustomEmailSenderTriggerEvent.Request
    ]

object CustomEmailSenderUpdateUserAttributeTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: BaseCustomEmailSenderTriggerEvent.Request
  ): CustomEmailSenderUpdateUserAttributeTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "CustomEmailSender_ForgotPassword",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CustomEmailSenderUpdateUserAttributeTriggerEvent]
  }
}

@js.native
trait CustomEmailSenderVerifyUserAttributeTriggerEvent
    extends BaseCustomEmailSenderTriggerEvent[
      "CustomEmailSender_VerifyUserAttribute",
      BaseCustomEmailSenderTriggerEvent.Request
    ]

object CustomEmailSenderVerifyUserAttributeTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: BaseCustomEmailSenderTriggerEvent.Request
  ): CustomEmailSenderVerifyUserAttributeTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "CustomEmailSender_VerifyUserAttribute",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CustomEmailSenderVerifyUserAttributeTriggerEvent]
  }
}

@js.native
trait CustomEmailSenderAdminCreateUserTriggerEvent
    extends BaseCustomEmailSenderTriggerEvent[
      "CustomEmailSender_AdminCreateUser",
      BaseCustomEmailSenderTriggerEvent.Request
    ]

object CustomEmailSenderAdminCreateUserTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: BaseCustomEmailSenderTriggerEvent.Request
  ): CustomEmailSenderAdminCreateUserTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "CustomEmailSender_AdminCreateUser",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CustomEmailSenderAdminCreateUserTriggerEvent]
  }
}

@js.native
trait CustomEmailSenderAccountTakeOverNotificationTriggerEvent
    extends BaseCustomEmailSenderTriggerEvent[
      "CustomEmailSender_AccountTakeOverNotification",
      CustomEmailSender_AccountTakeOverNotification_UserAttributes
    ]

object CustomEmailSenderAccountTakeOverNotificationTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: BaseCustomEmailSenderTriggerEvent.Request
  ): CustomEmailSenderAccountTakeOverNotificationTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "CustomEmailSender_AccountTakeOverNotification",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CustomEmailSenderAccountTakeOverNotificationTriggerEvent]
  }
}
