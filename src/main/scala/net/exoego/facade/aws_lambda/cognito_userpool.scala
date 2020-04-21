package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.|

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
  def apply(
      version: Double,
      triggerSource: String,
      region: String,
      userPoolId: String,
      callerContext: CognitoUserPoolTriggerEvent.CallerContext,
      request: CognitoUserPoolTriggerEvent.Request,
      response: CognitoUserPoolTriggerEvent.Response,
      userName: js.UndefOr[String] = js.undefined
  ): CognitoUserPoolTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "version" -> version.asInstanceOf[js.Any],
      "triggerSource" -> triggerSource.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    userName.foreach(_v =>
      _obj$.updateDynamic("userName")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[CognitoUserPoolTriggerEvent]
  }

  @js.native
  trait CallerContext extends js.Object {
    var awsSdkVersion: String = js.native
    var clientId: String = js.native
  }

  object CallerContext {
    def apply(
        awsSdkVersion: String,
        clientId: String
    ): CallerContext = {
      val _obj$ = js.Dynamic.literal(
        "awsSdkVersion" -> awsSdkVersion.asInstanceOf[js.Any],
        "clientId" -> clientId.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[CallerContext]
    }
  }

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
    var privateChallengeParameters
        : js.UndefOr[Request.PrivateChallengeParameters] = js.native
    var challengeAnswer: js.UndefOr[String] = js.native
    var password: js.UndefOr[String] = js.native
    var clientMetadata: js.UndefOr[Request.ClientMetadata] = js.native
    var userNotFound: js.UndefOr[Boolean] = js.native
  }

  object Request {
    def apply(
        userAttributes: Request.UserAttributes,
        validationData: js.UndefOr[Request.ValidationData] = js.undefined,
        codeParameter: js.UndefOr[String] = js.undefined,
        linkParameter: js.UndefOr[String] = js.undefined,
        usernameParameter: js.UndefOr[String] = js.undefined,
        newDeviceUsed: js.UndefOr[Boolean] = js.undefined,
        session: js.UndefOr[js.Array[js.Any]] = js.undefined,
        challengeName: js.UndefOr[String] = js.undefined,
        privateChallengeParameters: js.UndefOr[
          Request.PrivateChallengeParameters
        ] = js.undefined,
        challengeAnswer: js.UndefOr[String] = js.undefined,
        password: js.UndefOr[String] = js.undefined,
        clientMetadata: js.UndefOr[Request.ClientMetadata] = js.undefined,
        userNotFound: js.UndefOr[Boolean] = js.undefined
    ): Request = {
      val _obj$ = js.Dynamic.literal(
        "userAttributes" -> userAttributes.asInstanceOf[js.Any]
      )
      validationData.foreach(_v =>
        _obj$.updateDynamic("validationData")(_v.asInstanceOf[js.Any])
      )
      codeParameter.foreach(_v =>
        _obj$.updateDynamic("codeParameter")(_v.asInstanceOf[js.Any])
      )
      linkParameter.foreach(_v =>
        _obj$.updateDynamic("linkParameter")(_v.asInstanceOf[js.Any])
      )
      usernameParameter.foreach(_v =>
        _obj$.updateDynamic("usernameParameter")(_v.asInstanceOf[js.Any])
      )
      newDeviceUsed.foreach(_v =>
        _obj$.updateDynamic("newDeviceUsed")(_v.asInstanceOf[js.Any])
      )
      session.foreach(_v =>
        _obj$.updateDynamic("session")(_v.asInstanceOf[js.Any])
      )
      challengeName.foreach(_v =>
        _obj$.updateDynamic("challengeName")(_v.asInstanceOf[js.Any])
      )
      privateChallengeParameters.foreach(_v =>
        _obj$.updateDynamic("privateChallengeParameters")(
          _v.asInstanceOf[js.Any]
        )
      )
      challengeAnswer.foreach(_v =>
        _obj$.updateDynamic("challengeAnswer")(_v.asInstanceOf[js.Any])
      )
      password.foreach(_v =>
        _obj$.updateDynamic("password")(_v.asInstanceOf[js.Any])
      )
      clientMetadata.foreach(_v =>
        _obj$.updateDynamic("clientMetadata")(_v.asInstanceOf[js.Any])
      )
      userNotFound.foreach(_v =>
        _obj$.updateDynamic("userNotFound")(_v.asInstanceOf[js.Any])
      )
      _obj$.asInstanceOf[Request]
    }
    type UserAttributes = js.Dictionary[String]
    type ValidationData = js.Dictionary[String]
    type PrivateChallengeParameters = js.Dictionary[String]
    type ClientMetadata = js.Dictionary[String]
  }

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
    var publicChallengeParameters
        : js.UndefOr[Response.PublicChallengeParameters] = js.native
    var privateChallengeParameters
        : js.UndefOr[Response.PrivateChallengeParameters] = js.native
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
    def apply(
        autoConfirmUser: js.UndefOr[Boolean] = js.undefined,
        autoVerifyPhone: js.UndefOr[Boolean] = js.undefined,
        autoVerifyEmail: js.UndefOr[Boolean] = js.undefined,
        smsMessage: js.UndefOr[String] = js.undefined,
        emailMessage: js.UndefOr[String] = js.undefined,
        emailSubject: js.UndefOr[String] = js.undefined,
        challengeName: js.UndefOr[String] = js.undefined,
        issueTokens: js.UndefOr[Boolean] = js.undefined,
        failAuthentication: js.UndefOr[Boolean] = js.undefined,
        publicChallengeParameters: js.UndefOr[
          Response.PublicChallengeParameters
        ] = js.undefined,
        privateChallengeParameters: js.UndefOr[
          Response.PrivateChallengeParameters
        ] = js.undefined,
        challengeMetadata: js.UndefOr[String] = js.undefined,
        answerCorrect: js.UndefOr[Boolean] = js.undefined,
        userAttributes: js.UndefOr[Response.UserAttributes] = js.undefined,
        finalUserStatus: js.UndefOr[String] = js.undefined,
        messageAction: js.UndefOr[String] = js.undefined,
        desiredDeliveryMediums: js.UndefOr[js.Array[String]] = js.undefined,
        forceAliasCreation: js.UndefOr[Boolean] = js.undefined,
        claimsOverrideDetails: js.UndefOr[Response.ClaimsOverrideDetails] =
          js.undefined
    ): Response = {
      val _obj$ = js.Dynamic.literal(
        )
      autoConfirmUser.foreach(_v =>
        _obj$.updateDynamic("autoConfirmUser")(_v.asInstanceOf[js.Any])
      )
      autoVerifyPhone.foreach(_v =>
        _obj$.updateDynamic("autoVerifyPhone")(_v.asInstanceOf[js.Any])
      )
      autoVerifyEmail.foreach(_v =>
        _obj$.updateDynamic("autoVerifyEmail")(_v.asInstanceOf[js.Any])
      )
      smsMessage.foreach(_v =>
        _obj$.updateDynamic("smsMessage")(_v.asInstanceOf[js.Any])
      )
      emailMessage.foreach(_v =>
        _obj$.updateDynamic("emailMessage")(_v.asInstanceOf[js.Any])
      )
      emailSubject.foreach(_v =>
        _obj$.updateDynamic("emailSubject")(_v.asInstanceOf[js.Any])
      )
      challengeName.foreach(_v =>
        _obj$.updateDynamic("challengeName")(_v.asInstanceOf[js.Any])
      )
      issueTokens.foreach(_v =>
        _obj$.updateDynamic("issueTokens")(_v.asInstanceOf[js.Any])
      )
      failAuthentication.foreach(_v =>
        _obj$.updateDynamic("failAuthentication")(_v.asInstanceOf[js.Any])
      )
      publicChallengeParameters.foreach(_v =>
        _obj$.updateDynamic("publicChallengeParameters")(
          _v.asInstanceOf[js.Any]
        )
      )
      privateChallengeParameters.foreach(_v =>
        _obj$.updateDynamic("privateChallengeParameters")(
          _v.asInstanceOf[js.Any]
        )
      )
      challengeMetadata.foreach(_v =>
        _obj$.updateDynamic("challengeMetadata")(_v.asInstanceOf[js.Any])
      )
      answerCorrect.foreach(_v =>
        _obj$.updateDynamic("answerCorrect")(_v.asInstanceOf[js.Any])
      )
      userAttributes.foreach(_v =>
        _obj$.updateDynamic("userAttributes")(_v.asInstanceOf[js.Any])
      )
      finalUserStatus.foreach(_v =>
        _obj$.updateDynamic("finalUserStatus")(_v.asInstanceOf[js.Any])
      )
      messageAction.foreach(_v =>
        _obj$.updateDynamic("messageAction")(_v.asInstanceOf[js.Any])
      )
      desiredDeliveryMediums.foreach(_v =>
        _obj$.updateDynamic("desiredDeliveryMediums")(_v.asInstanceOf[js.Any])
      )
      forceAliasCreation.foreach(_v =>
        _obj$.updateDynamic("forceAliasCreation")(_v.asInstanceOf[js.Any])
      )
      claimsOverrideDetails.foreach(_v =>
        _obj$.updateDynamic("claimsOverrideDetails")(_v.asInstanceOf[js.Any])
      )
      _obj$.asInstanceOf[Response]
    }
    type PublicChallengeParameters = js.Dictionary[String]
    type PrivateChallengeParameters = js.Dictionary[String]
    type UserAttributes = js.Dictionary[String]

    @js.native
    trait ClaimsOverrideDetails extends js.Object {
      var claimsToAddOrOverride
          : js.UndefOr[ClaimsOverrideDetails.ClaimsToAddOrOverride] = js.native
      var claimsToSuppress: js.UndefOr[js.Array[String]] = js.native
      var groupOverrideDetails: js.UndefOr[Null | js.Any] = js.native
    }

    object ClaimsOverrideDetails {
      def apply(
          claimsToAddOrOverride: js.UndefOr[
            ClaimsOverrideDetails.ClaimsToAddOrOverride
          ] = js.undefined,
          claimsToSuppress: js.UndefOr[js.Array[String]] = js.undefined,
          groupOverrideDetails: js.UndefOr[Null | js.Any] = js.undefined
      ): ClaimsOverrideDetails = {
        val _obj$ = js.Dynamic.literal(
          )
        claimsToAddOrOverride.foreach(_v =>
          _obj$.updateDynamic("claimsToAddOrOverride")(_v.asInstanceOf[js.Any])
        )
        claimsToSuppress.foreach(_v =>
          _obj$.updateDynamic("claimsToSuppress")(_v.asInstanceOf[js.Any])
        )
        groupOverrideDetails.foreach(_v =>
          _obj$.updateDynamic("groupOverrideDetails")(_v.asInstanceOf[js.Any])
        )
        _obj$.asInstanceOf[ClaimsOverrideDetails]
      }

      type ClaimsToAddOrOverride = js.Dictionary[String]
    }
  }
}
