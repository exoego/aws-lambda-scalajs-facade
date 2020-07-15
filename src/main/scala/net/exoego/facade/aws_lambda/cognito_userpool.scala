package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js
import scala.scalajs.js.|

@Factory
trait CognitoUserPoolTriggerEvent extends js.Object {
  var version: Double
  var triggerSource: String
  var region: String
  var userPoolId: String
  var userName: js.UndefOr[String] = js.undefined
  var callerContext: CognitoUserPoolTriggerEvent.CallerContext
  var request: CognitoUserPoolTriggerEvent.Request
  var response: CognitoUserPoolTriggerEvent.Response
}

object CognitoUserPoolTriggerEvent {
  @Factory(false)
  trait CallerContext extends js.Object {
    var awsSdkVersion: String
    var clientId: String
  }

  @Factory(false)
  trait Request extends js.Object {
    var userAttributes: Request.UserAttributes
    var validationData: js.UndefOr[Request.ValidationData] = js.undefined
    var codeParameter: js.UndefOr[String] = js.undefined
    var linkParameter: js.UndefOr[String] = js.undefined
    var usernameParameter: js.UndefOr[String] = js.undefined
    var newDeviceUsed: js.UndefOr[Boolean] = js.undefined
    var session: js.UndefOr[js.Array[js.Any]] = js.undefined
    var challengeName: js.UndefOr[String] = js.undefined
    var privateChallengeParameters
        : js.UndefOr[Request.PrivateChallengeParameters] = js.undefined
    var challengeAnswer: js.UndefOr[String] = js.undefined
    var password: js.UndefOr[String] = js.undefined
    var clientMetadata: js.UndefOr[Request.ClientMetadata] = js.undefined
    var userNotFound: js.UndefOr[Boolean] = js.undefined
  }

  object Request {
    type UserAttributes = js.Dictionary[String]
    type ValidationData = js.Dictionary[String]
    type PrivateChallengeParameters = js.Dictionary[String]
    type ClientMetadata = js.Dictionary[String]
  }

  @Factory(false)
  trait Response extends js.Object {
    var autoConfirmUser: js.UndefOr[Boolean] = js.undefined
    var autoVerifyPhone: js.UndefOr[Boolean] = js.undefined
    var autoVerifyEmail: js.UndefOr[Boolean] = js.undefined
    var smsMessage: js.UndefOr[String] = js.undefined
    var emailMessage: js.UndefOr[String] = js.undefined
    var emailSubject: js.UndefOr[String] = js.undefined
    var challengeName: js.UndefOr[String] = js.undefined
    var issueTokens: js.UndefOr[Boolean] = js.undefined
    var failAuthentication: js.UndefOr[Boolean] = js.undefined
    var publicChallengeParameters
        : js.UndefOr[Response.PublicChallengeParameters] = js.undefined
    var privateChallengeParameters
        : js.UndefOr[Response.PrivateChallengeParameters] = js.undefined
    var challengeMetadata: js.UndefOr[String] = js.undefined
    var answerCorrect: js.UndefOr[Boolean] = js.undefined
    var userAttributes: js.UndefOr[Response.UserAttributes] = js.undefined
    var finalUserStatus: js.UndefOr[String] = js.undefined
    var messageAction: js.UndefOr[String] = js.undefined
    var desiredDeliveryMediums: js.UndefOr[js.Array[String]] = js.undefined
    var forceAliasCreation: js.UndefOr[Boolean] = js.undefined
    var claimsOverrideDetails: js.UndefOr[Response.ClaimsOverrideDetails] =
      js.undefined
  }

  object Response {
    type PublicChallengeParameters = js.Dictionary[String]
    type PrivateChallengeParameters = js.Dictionary[String]
    type UserAttributes = js.Dictionary[String]

    @Factory(false)
    trait ClaimsOverrideDetails extends js.Object {
      var claimsToAddOrOverride
          : js.UndefOr[ClaimsOverrideDetails.ClaimsToAddOrOverride] =
        js.undefined
      var claimsToSuppress: js.UndefOr[js.Array[String]] = js.undefined
      var groupOverrideDetails: js.UndefOr[Null | js.Any] = js.undefined
    }

    object ClaimsOverrideDetails {
      type ClaimsToAddOrOverride = js.Dictionary[String]
    }
  }
}
