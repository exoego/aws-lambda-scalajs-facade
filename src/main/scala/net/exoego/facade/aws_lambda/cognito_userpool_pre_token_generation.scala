package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait GroupOverrideDetails extends js.Object {
  var groupsToOverride: js.UndefOr[js.Array[String]]
  var iamRolesToOverride: js.UndefOr[js.Array[String]]
  var preferredRole: js.UndefOr[String]
}

object GroupOverrideDetails {
  def apply(
      groupsToOverride: js.UndefOr[js.Array[String]] = js.undefined,
      iamRolesToOverride: js.UndefOr[js.Array[String]] = js.undefined,
      preferredRole: js.UndefOr[String] = js.undefined
  ): GroupOverrideDetails = {
    val _obj$ = js.Dynamic.literal(
    )
    groupsToOverride.foreach(_v => _obj$.updateDynamic("groupsToOverride")(_v.asInstanceOf[js.Any]))
    iamRolesToOverride.foreach(_v => _obj$.updateDynamic("iamRolesToOverride")(_v.asInstanceOf[js.Any]))
    preferredRole.foreach(_v => _obj$.updateDynamic("preferredRole")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[GroupOverrideDetails]
  }
}

/** @see
  *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-token-generation.html
  */
@js.native
trait BasePreTokenGenerationTriggerEvent[T <: String] extends BaseTriggerEvent[T] {
  var request: PreTokenGenerationTriggerEventRequest = js.native
  var response: PreTokenGenerationTriggerEventResponse = js.native
}

@js.native
trait PreTokenGenerationTriggerEventRequest extends js.Object {
  var userAttributes: js.Dictionary[String]
  var groupConfiguration: GroupOverrideDetails
  var clientMetadata: js.UndefOr[js.Dictionary[String]]
}

object PreTokenGenerationTriggerEventRequest {
  def apply(
      userAttributes: js.Dictionary[String],
      groupConfiguration: GroupOverrideDetails,
      clientMetadata: js.UndefOr[js.Dictionary[String]] = js.undefined
  ): PreTokenGenerationTriggerEventRequest = {
    val _obj$ = js.Dynamic.literal(
      "userAttributes" -> userAttributes.asInstanceOf[js.Any],
      "groupConfiguration" -> groupConfiguration.asInstanceOf[js.Any]
    )
    clientMetadata.foreach(_v => _obj$.updateDynamic("clientMetadata")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[PreTokenGenerationTriggerEventRequest]
  }
}

@js.native
trait PreTokenGenerationTriggerEventResponse extends js.Object {
  var claimsOverrideDetails: PreTokenGenerationTriggerEventResponse.ClaimsOverrideDetails = js.native
}

object PreTokenGenerationTriggerEventResponse {
  def apply(
      claimsOverrideDetails: PreTokenGenerationTriggerEventResponse.ClaimsOverrideDetails
  ): PreTokenGenerationTriggerEventResponse = {
    val _obj$ = js.Dynamic.literal(
      "claimsOverrideDetails" -> claimsOverrideDetails.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[PreTokenGenerationTriggerEventResponse]
  }

  @js.native
  trait ClaimsOverrideDetails extends js.Object {
    var claimsToAddOrOverride: js.UndefOr[js.Dictionary[String]] = js.native
    var claimsToSuppress: js.UndefOr[js.Array[String]] = js.native
    var groupOverrideDetails: js.UndefOr[GroupOverrideDetails] = js.native
  }

  object ClaimsOverrideDetails {
    def apply(
        claimsToAddOrOverride: js.UndefOr[js.Dictionary[String]] = js.undefined,
        claimsToSuppress: js.UndefOr[js.Array[String]] = js.undefined,
        groupOverrideDetails: js.UndefOr[GroupOverrideDetails] = js.undefined
    ): ClaimsOverrideDetails = {
      val _obj$ = js.Dynamic.literal(
      )
      claimsToAddOrOverride.foreach(_v => _obj$.updateDynamic("claimsToAddOrOverride")(_v.asInstanceOf[js.Any]))
      claimsToSuppress.foreach(_v => _obj$.updateDynamic("claimsToSuppress")(_v.asInstanceOf[js.Any]))
      groupOverrideDetails.foreach(_v => _obj$.updateDynamic("groupOverrideDetails")(_v.asInstanceOf[js.Any]))
      _obj$.asInstanceOf[ClaimsOverrideDetails]
    }
  }
}

@js.native
trait PreTokenGenerationHostedAuthTriggerEvent extends BasePreTokenGenerationTriggerEvent["TokenGeneration_HostedAuth"]

object PreTokenGenerationHostedAuthTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: UserMigrationTriggerEventRequest,
      response: UserMigrationTriggerEventResponse
  ): PreTokenGenerationHostedAuthTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "TokenGeneration_HostedAuth",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[PreTokenGenerationHostedAuthTriggerEvent]
  }
}

@js.native
trait PreTokenGenerationAuthenticationTriggerEvent
    extends BasePreTokenGenerationTriggerEvent["TokenGeneration_Authentication"]

object PreTokenGenerationAuthenticationTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: UserMigrationTriggerEventRequest,
      response: UserMigrationTriggerEventResponse
  ): PreTokenGenerationAuthenticationTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "TokenGeneration_Authentication",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[PreTokenGenerationAuthenticationTriggerEvent]
  }
}

@js.native
trait PreTokenGenerationNewPasswordChallengeTriggerEvent
    extends BasePreTokenGenerationTriggerEvent["TokenGeneration_NewPasswordChallenge"]

object PreTokenGenerationNewPasswordChallengeTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: UserMigrationTriggerEventRequest,
      response: UserMigrationTriggerEventResponse
  ): PreTokenGenerationNewPasswordChallengeTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "TokenGeneration_NewPasswordChallenge",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[PreTokenGenerationNewPasswordChallengeTriggerEvent]
  }
}

@js.native
trait PreTokenGenerationAuthenticateDeviceTriggerEvent
    extends BasePreTokenGenerationTriggerEvent["TokenGeneration_AuthenticateDevice"]

object PreTokenGenerationAuthenticateDeviceTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: UserMigrationTriggerEventRequest,
      response: UserMigrationTriggerEventResponse
  ): PreTokenGenerationAuthenticateDeviceTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "TokenGeneration_AuthenticateDevice",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[PreTokenGenerationAuthenticateDeviceTriggerEvent]
  }
}

@js.native
trait PreTokenGenerationRefreshTokensTriggerEvent
    extends BasePreTokenGenerationTriggerEvent["TokenGeneration_RefreshTokens"]

object PreTokenGenerationRefreshTokensTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: UserMigrationTriggerEventRequest,
      response: UserMigrationTriggerEventResponse
  ): PreTokenGenerationRefreshTokensTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "TokenGeneration_RefreshTokens",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[PreTokenGenerationRefreshTokensTriggerEvent]
  }
}
