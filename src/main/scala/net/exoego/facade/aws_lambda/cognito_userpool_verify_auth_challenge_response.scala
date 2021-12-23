package net.exoego.facade.aws_lambda

import scala.scalajs.js

/** @see
  *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-verify-auth-challenge-response.html
  */
@js.native
trait VerifyAuthChallengeResponseTriggerEvent extends BaseTriggerEvent["VerifyAuthChallengeResponse_Authentication"] {
  var request: VerifyAuthChallengeResponseTriggerEventRequest = js.native
  var response: VerifyAuthChallengeResponseTriggerEventResponse = js.native
}

object VerifyAuthChallengeResponseTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: VerifyAuthChallengeResponseTriggerEventRequest,
      response: VerifyAuthChallengeResponseTriggerEventResponse
  ): VerifyAuthChallengeResponseTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "VerifyAuthChallengeResponse_Authentication",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[VerifyAuthChallengeResponseTriggerEvent]
  }
}

@js.native
trait VerifyAuthChallengeResponseTriggerEventRequest extends js.Object {
  var userAttributes: js.Dictionary[String]
  var privateChallengeParameters: js.Dictionary[String]
  var challengeAnswer: String
  var clientMetadata: js.UndefOr[js.Dictionary[String]]
  var userNotFound: js.UndefOr[Boolean]
}

object VerifyAuthChallengeResponseTriggerEventRequest {
  def apply(
      userAttributes: js.Dictionary[String],
      privateChallengeParameters: js.Dictionary[String],
      challengeAnswer: String,
      clientMetadata: js.UndefOr[js.Dictionary[String]] = js.undefined,
      userNotFound: js.UndefOr[Boolean] = js.undefined
  ): VerifyAuthChallengeResponseTriggerEventRequest = {
    val _obj$ = js.Dynamic.literal(
      "userAttributes" -> userAttributes.asInstanceOf[js.Any],
      "privateChallengeParameters" -> privateChallengeParameters.asInstanceOf[js.Any],
      "challengeAnswer" -> challengeAnswer.asInstanceOf[js.Any]
    )
    clientMetadata.foreach(_v => _obj$.updateDynamic("clientMetadata")(_v.asInstanceOf[js.Any]))
    userNotFound.foreach(_v => _obj$.updateDynamic("userNotFound")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[VerifyAuthChallengeResponseTriggerEventRequest]
  }
}

@js.native
trait VerifyAuthChallengeResponseTriggerEventResponse extends js.Object {
  var answerCorrect: Boolean
}

object VerifyAuthChallengeResponseTriggerEventResponse {
  def apply(
      answerCorrect: Boolean
  ): VerifyAuthChallengeResponseTriggerEventResponse = {
    val _obj$ = js.Dynamic.literal(
      "answerCorrect" -> answerCorrect.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[VerifyAuthChallengeResponseTriggerEventResponse]
  }
}
