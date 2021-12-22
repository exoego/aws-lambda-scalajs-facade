package net.exoego.facade.aws_lambda

import scala.scalajs.js

/** @see
  *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-migrate-user.html
  */
@js.native
trait BaseUserMigrationTriggerEvent[T <: String] extends BaseTriggerEvent[T] {
  var request: UserMigrationTriggerEventRequest = js.native
  var response: UserMigrationTriggerEventResponse = js.native
}

@js.native
trait UserMigrationAuthenticationTriggerEvent extends BaseUserMigrationTriggerEvent["UserMigration_Authentication"]

object UserMigrationAuthenticationTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: UserMigrationTriggerEventRequest,
      response: UserMigrationTriggerEventResponse
  ): UserMigrationAuthenticationTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "UserMigration_Authentication",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[UserMigrationAuthenticationTriggerEvent]
  }
}

@js.native
trait UserMigrationForgotPasswordTriggerEvent extends BaseUserMigrationTriggerEvent["UserMigration_ForgotPassword"]

object UserMigrationForgotPasswordTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: UserMigrationTriggerEventRequest,
      response: UserMigrationTriggerEventResponse
  ): UserMigrationForgotPasswordTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "UserMigration_ForgotPassword",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[UserMigrationForgotPasswordTriggerEvent]
  }
}

@js.native
trait UserMigrationTriggerEventRequest extends js.Object {
  var password: String = js.native
  var validationData: js.UndefOr[js.Dictionary[String]] = js.native
  var clientMetadata: js.UndefOr[js.Dictionary[String]] = js.native
}

object UserMigrationTriggerEventRequest {
  def apply(
      password: String,
      validationData: js.UndefOr[js.Dictionary[String]] = js.undefined,
      clientMetadata: js.UndefOr[js.Dictionary[String]] = js.undefined
  ): UserMigrationTriggerEventRequest = {
    val _obj$ = js.Dynamic.literal(
      "password" -> password.asInstanceOf[js.Any]
    )
    validationData.foreach(_v => _obj$.updateDynamic("validationData")(_v.asInstanceOf[js.Any]))
    clientMetadata.foreach(_v => _obj$.updateDynamic("clientMetadata")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[UserMigrationTriggerEventRequest]
  }
}

@js.native
trait UserMigrationTriggerEventResponse extends js.Object {
  var userAttributes: js.Dictionary[String] = js.native
  var finalUserStatus: js.UndefOr[literal.CognitoUserPoolUserStatus] = js.native
  var messageAction: js.UndefOr[String] = js.native
  var desiredDeliveryMediums: js.Array[String] = js.native
  var forceAliasCreation: js.UndefOr[Boolean] = js.native
}

object UserMigrationTriggerEventResponse {
  def apply(
      userAttributes: js.Dictionary[String],
      desiredDeliveryMediums: js.Array[String],
      finalUserStatus: js.UndefOr[literal.CognitoUserPoolUserStatus] = js.undefined,
      messageAction: js.UndefOr[String] = js.undefined,
      forceAliasCreation: js.UndefOr[Boolean] = js.undefined
  ): UserMigrationTriggerEventResponse = {
    val _obj$ = js.Dynamic.literal(
      "userAttributes" -> userAttributes.asInstanceOf[js.Any],
      "desiredDeliveryMediums" -> desiredDeliveryMediums.asInstanceOf[js.Any]
    )
    finalUserStatus.foreach(_v => _obj$.updateDynamic("finalUserStatus")(_v.asInstanceOf[js.Any]))
    messageAction.foreach(_v => _obj$.updateDynamic("messageAction")(_v.asInstanceOf[js.Any]))
    forceAliasCreation.foreach(_v => _obj$.updateDynamic("forceAliasCreation")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[UserMigrationTriggerEventResponse]
  }
}
