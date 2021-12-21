package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
sealed trait ChallengeName extends js.Any
object ChallengeName {
  final val PASSWORD_VERIFIER: ChallengeName = "PASSWORD_VERIFIER".asInstanceOf[ChallengeName]
  final val SMS_MFA: ChallengeName = "SMS_MFA".asInstanceOf[ChallengeName]
  final val DEVICE_SRP_AUTH: ChallengeName = "DEVICE_SRP_AUTH".asInstanceOf[ChallengeName]
  final val DEVICE_PASSWORD_VERIFIER: ChallengeName = "DEVICE_PASSWORD_VERIFIER".asInstanceOf[ChallengeName]
  final val ADMIN_NO_SRP_AUTH: ChallengeName = "ADMIN_NO_SRP_AUTH".asInstanceOf[ChallengeName]
  final val SRP_A: ChallengeName = "SRP_A".asInstanceOf[ChallengeName]
}

@js.native
trait ChallengeResult extends js.Object {
  var challengeName: ChallengeName
  var challengeResult: Boolean
  var challengeMetadata: js.UndefOr[Unit]
}

@js.native
trait CustomChallengeResult extends js.Object {
  var challengeName: String
  var challengeResult: Boolean
  var challengeMetadata: js.UndefOr[String]
}

@js.native
trait BaseTriggerEvent[T <: String] extends js.Object {
  var version: String
  var region: String
  var userPoolId: String
  var triggerSource: T
  var userName: String
  var callerContext: CognitoUserpoolCallerContext = js.native
}

@js.native
trait CognitoUserpoolCallerContext extends js.Object {
  var awsSdkVersion: String
  var clientId: String
}

@deprecated("Use specific event types instead", "v0.10.0")
@js.native
trait CognitoUserPoolTriggerEvent extends js.Object with BaseTriggerEvent[String] {
  var request: CognitoUserPoolTriggerEvent.Request = js.native
  var response: CognitoUserPoolTriggerEvent.Response = js.native
}

object CognitoUserPoolTriggerEvent {
  @deprecated("Use specific event types instead", "v0.10.0")
  @js.native
  trait Request extends js.Object {
    var userAttributes: Request.UserAttributes = js.native
    var validationData: js.UndefOr[Request.ValidationData] = js.native
    var codeParameter: js.UndefOr[String] = js.native
    var linkParameter: js.UndefOr[String] = js.native
    var usernameParameter: js.UndefOr[String] = js.native
    var newDeviceUsed: js.UndefOr[Boolean] = js.native
    var session: js.UndefOr[js.Array[js.Any]] = js.native
    var challengeName: js.UndefOr[String] = js.native
    var privateChallengeParameters: js.UndefOr[Request.PrivateChallengeParameters] = js.native
    var challengeAnswer: js.UndefOr[String] = js.native
    var password: js.UndefOr[String] = js.native
    var clientMetadata: js.UndefOr[Request.ClientMetadata] = js.native
    var userNotFound: js.UndefOr[Boolean] = js.native
  }

  object Request {
    @deprecated("Use specific event types instead", "v0.10.0")
    type UserAttributes = js.Dictionary[String]
    @deprecated("Use specific event types instead", "v0.10.0")
    type ValidationData = js.Dictionary[String]
    @deprecated("Use specific event types instead", "v0.10.0")
    type PrivateChallengeParameters = js.Dictionary[String]
    @deprecated("Use specific event types instead", "v0.10.0")
    type ClientMetadata = js.Dictionary[String]
  }

  @deprecated("Use specific event types instead", "v0.10.0")
  @js.native
  trait Response extends js.Object {
    var autoConfirmUser: js.UndefOr[Boolean] = js.native
    var autoVerifyPhone: js.UndefOr[Boolean] = js.native
    var autoVerifyEmail: js.UndefOr[Boolean] = js.native
    var smsMessage: js.UndefOr[String] = js.native
    var emailMessage: js.UndefOr[String] = js.native
    var emailSubject: js.UndefOr[String] = js.native
    var challengeName: js.UndefOr[String] = js.native
    var issueTokens: js.UndefOr[Boolean] = js.native
    var failAuthentication: js.UndefOr[Boolean] = js.native
    var publicChallengeParameters: js.UndefOr[Response.PublicChallengeParameters] = js.native
    var privateChallengeParameters: js.UndefOr[Response.PrivateChallengeParameters] = js.native
    var challengeMetadata: js.UndefOr[String] = js.native
    var answerCorrect: js.UndefOr[Boolean] = js.native
    var userAttributes: js.UndefOr[Response.UserAttributes] = js.native
    var finalUserStatus: js.UndefOr[String] = js.native
    var messageAction: js.UndefOr[String] = js.native
    var desiredDeliveryMediums: js.UndefOr[js.Array[String]] = js.native
    var forceAliasCreation: js.UndefOr[Boolean] = js.native
    var claimsOverrideDetails: js.UndefOr[Response.ClaimsOverrideDetails] = js.native
  }

  object Response {
    @deprecated("Use specific event types instead", "v0.10.0")
    type PublicChallengeParameters = js.Dictionary[String]
    @deprecated("Use specific event types instead", "v0.10.0")
    type PrivateChallengeParameters = js.Dictionary[String]
    @deprecated("Use specific event types instead", "v0.10.0")
    type UserAttributes = js.Dictionary[String]

    @deprecated("Use specific event types instead", "v0.10.0")
    @js.native
    trait ClaimsOverrideDetails extends js.Object {
      var claimsToAddOrOverride: js.UndefOr[ClaimsOverrideDetails.ClaimsToAddOrOverride] = js.native
      var claimsToSuppress: js.UndefOr[js.Array[String]] = js.native
      var groupOverrideDetails: js.UndefOr[Null | js.Any] = js.native
    }

    object ClaimsOverrideDetails {
      @deprecated("Use specific event types instead", "v0.10.0")
      type ClaimsToAddOrOverride = js.Dictionary[String]
    }
  }
}

@js.native
trait CreateAuthChallengeTriggerEventRequest extends js.Object {
  var userAttributes: js.Dictionary[String]
  var challengeName: String
  var session: js.Array[ChallengeResult | CustomChallengeResult]
  var clientMetadata: js.UndefOr[js.Dictionary[String]]
  var userNotFound: js.UndefOr[Boolean]
}

@js.native
trait CreateAuthChallengeTriggerEventResponse extends js.Object {
  var publicChallengeParameters: js.Dictionary[String]
  var privateChallengeParameters: js.Dictionary[String]
  var challengeMetadata: String
}

/** @see
  *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-custom-message.html
  */
@js.native
trait CustomMessageTriggerEvent[T <: String] extends BaseTriggerEvent[T] {
  var request: CustomMessageTriggerEventRequest = js.native
  var response: CustomMessageTriggerEventResponse = js.native
}

@js.native
trait CustomMessageTriggerEventRequest extends js.Object {
  var userAttributes: js.Dictionary[String]
  var codeParameter: String
  var usernameParameter: String
  var clientMetadata: js.UndefOr[js.Dictionary[String]]
}

@js.native
trait CustomMessageTriggerEventResponse extends js.Object {
  var smsMessage: String
  var emailMessage: String
  var emailSubject: String
}

@js.native
trait DefineAuthChallengeTriggerEventRequest extends js.Object {
  var userAttributes: js.Dictionary[String]
  var session: js.Array[ChallengeResult | CustomChallengeResult]
  var clientMetadata: js.UndefOr[js.Dictionary[String]]
  var userNotFound: js.UndefOr[Boolean]
}

@js.native
trait DefineAuthChallengeTriggerEventResponse extends js.Object {
  var challengeName: String
  var failAuthentication: Boolean
  var issueTokens: Boolean
}

@js.native
trait PostAuthenticationTriggerEventRequest extends js.Object {
  var userAttributes: js.Dictionary[String]
  var newDeviceUsed: Boolean
  var clientMetadata: js.UndefOr[js.Dictionary[String]]
}

/** @see
  *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-post-confirmation.html
  */
@js.native
trait PostConfirmationTriggerEvent[T <: String] extends BaseTriggerEvent[T] {
  var request: PostConfirmationTriggerEventRequest = js.native
}

@js.native
trait PostConfirmationTriggerEventRequest extends js.Object {
  var userAttributes: js.Dictionary[String]
  var clientMetadata: js.UndefOr[js.Dictionary[String]]
}

@js.native
trait PreAuthenticationTriggerEventRequest extends js.Object {
  var userAttributes: js.Dictionary[String]
  var userNotFound: js.UndefOr[Boolean]
  var validationData: js.UndefOr[js.Dictionary[String]]
}

/** @see
  *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-sign-up.html
  */
@js.native
trait PreSignUpTriggerEvent[T <: String] extends BaseTriggerEvent[T] {
  var request: PreSignUpTriggerEventRequest = js.native
  var response: PreSignUpTriggerEventResponse = js.native
}

@js.native
trait PreSignUpTriggerEventRequest extends js.Object {
  var userAttributes: js.Dictionary[String]
  var validationData: js.UndefOr[js.Dictionary[String]]
  var clientMetadata: js.UndefOr[js.Dictionary[String]]
}

@js.native
trait PreSignUpTriggerEventResponse extends js.Object {
  var autoConfirmUser: Boolean
  var autoVerifyEmail: Boolean
  var autoVerifyPhone: Boolean
}

@js.native
trait GroupOverrideDetails extends js.Object {
  var groupsToOverride: js.UndefOr[js.Array[String]]
  var iamRolesToOverride: js.UndefOr[js.Array[String]]
  var preferredRole: js.UndefOr[String]
}

/** @see
  *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-token-generation.html
  */
@js.native
trait PreTokenGenerationTriggerEvent[T <: String] extends BaseTriggerEvent[T] {
  var request: PreTokenGenerationTriggerEventRequest = js.native
  var response: PreTokenGenerationTriggerEventResponse = js.native
}

@js.native
trait PreTokenGenerationTriggerEventRequest extends js.Object {
  var userAttributes: js.Dictionary[String]
  var groupConfiguration: GroupOverrideDetails
  var clientMetadata: js.UndefOr[js.Dictionary[String]]
}

@js.native
trait PreTokenGenerationTriggerEventResponse extends js.Object {
  var claimsOverrideDetails: PreTokenGenerationTriggerEventResponse.ClaimsOverrideDetails = js.native
}

object PreTokenGenerationTriggerEventResponse {
  @js.native
  trait ClaimsOverrideDetails extends js.Object {
    var claimsToAddOrOverride: js.UndefOr[js.Dictionary[String]]
    var claimsToSuppress: js.UndefOr[js.Array[String]]
    var groupOverrideDetails: js.UndefOr[GroupOverrideDetails]
  }
}

@js.native
sealed trait UserStatus extends js.Any
object UserStatus {
  final val UNCONFIRMED: UserStatus = "UNCONFIRMED".asInstanceOf[UserStatus]
  final val CONFIRMED: UserStatus = "CONFIRMED".asInstanceOf[UserStatus]
  final val ARCHIVED: UserStatus = "ARCHIVED".asInstanceOf[UserStatus]
  final val COMPROMISED: UserStatus = "COMPROMISED".asInstanceOf[UserStatus]
  final val UNKNOWN: UserStatus = "UNKNOWN".asInstanceOf[UserStatus]
  final val RESET_REQUIRED: UserStatus = "RESET_REQUIRED".asInstanceOf[UserStatus]
  final val FORCE_CHANGE_PASSWORD: UserStatus = "FORCE_CHANGE_PASSWORD".asInstanceOf[UserStatus]
}

/** @see
  *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-migrate-user.html
  */
@js.native
trait UserMigrationTriggerEvent[T <: String] extends BaseTriggerEvent[T] {
  var request: UserMigrationTriggerEventRequest = js.native
  var response: UserMigrationTriggerEventResponse = js.native
}

@js.native
trait UserMigrationTriggerEventRequest extends js.Object {
  var password: String
  var validationData: js.UndefOr[js.Dictionary[String]]
  var clientMetadata: js.UndefOr[js.Dictionary[String]]
}

@js.native
trait UserMigrationTriggerEventResponse extends js.Object {
  var userAttributes: js.Dictionary[String]
  var finalUserStatus: js.UndefOr[UserStatus]
  var messageAction: js.UndefOr[String]
  var desiredDeliveryMediums: js.Array[String]
  var forceAliasCreation: js.UndefOr[Boolean]
}

@js.native
trait VerifyAuthChallengeResponseTriggerEventRequest extends js.Object {
  var userAttributes: js.Dictionary[String]
  var privateChallengeParameters: js.Dictionary[String]
  var challengeAnswer: String
  var clientMetadata: js.UndefOr[js.Dictionary[String]]
  var userNotFound: js.UndefOr[Boolean]
}

@js.native
trait VerifyAuthChallengeResponseTriggerEventResponse extends js.Object {
  var answerCorrect: Boolean
}
