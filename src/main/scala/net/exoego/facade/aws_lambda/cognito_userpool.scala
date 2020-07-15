package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js
import scala.scalajs.js.|

@Factory
@js.native
trait CognitoUserPoolTriggerEvent extends js.Object {
  var version: Double = js.native
  var triggerSource: String = js.native
  var region: String = js.native
  var userPoolId: String = js.native
  var userName: js.UndefOr[String] = js.native
  var callerContext: CognitoUserPoolTriggerEvent.CallerContext = js.native
  var request: CognitoUserPoolTriggerEvent.Request = js.native
  var response: CognitoUserPoolTriggerEvent.Response = js.native
}

object CognitoUserPoolTriggerEvent {
  @Factory(false)
  @js.native
  trait CallerContext extends js.Object {
    var awsSdkVersion: String = js.native
    var clientId: String = js.native
  }

  @Factory(false)
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
    type UserAttributes = js.Dictionary[String]
    type ValidationData = js.Dictionary[String]
    type PrivateChallengeParameters = js.Dictionary[String]
    type ClientMetadata = js.Dictionary[String]
  }

  @Factory(false)
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
    var claimsOverrideDetails: js.UndefOr[Response.ClaimsOverrideDetails] =
      js.native
  }

  object Response {
    type PublicChallengeParameters = js.Dictionary[String]
    type PrivateChallengeParameters = js.Dictionary[String]
    type UserAttributes = js.Dictionary[String]

    @Factory(false)
    @js.native
    trait ClaimsOverrideDetails extends js.Object {
      var claimsToAddOrOverride: js.UndefOr[ClaimsOverrideDetails.ClaimsToAddOrOverride] = js.native
      var claimsToSuppress: js.UndefOr[js.Array[String]] = js.native
      var groupOverrideDetails: js.UndefOr[Null | js.Any] = js.native
    }

    object ClaimsOverrideDetails {
      type ClaimsToAddOrOverride = js.Dictionary[String]
    }
  }
}
