package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.|

/** @see
  *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-create-auth-challenge.html
  */
@js.native
trait CreateAuthChallengeTriggerEvent extends BaseTriggerEvent["CreateAuthChallenge_Authentication"] {
  var request: CreateAuthChallengeTriggerEventRequest = js.native
  var response: CreateAuthChallengeTriggerEventResponse = js.native
}

object CreateAuthChallengeTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: CreateAuthChallengeTriggerEventRequest,
      response: CreateAuthChallengeTriggerEventResponse
  ): CreateAuthChallengeTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "CreateAuthChallenge_Authentication",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CreateAuthChallengeTriggerEvent]
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

object CreateAuthChallengeTriggerEventRequest {
  def apply(
      userAttributes: js.Dictionary[String],
      challengeName: String,
      session: js.Array[ChallengeResult | CustomChallengeResult],
      clientMetadata: js.UndefOr[js.Dictionary[String]] = js.undefined,
      userNotFound: js.UndefOr[Boolean] = js.undefined
  ): CreateAuthChallengeTriggerEventRequest = {
    val _obj$ = js.Dynamic.literal(
      "userAttributes" -> userAttributes.asInstanceOf[js.Any],
      "challengeName" -> challengeName.asInstanceOf[js.Any],
      "session" -> session.asInstanceOf[js.Any]
    )
    clientMetadata.foreach(_v => _obj$.updateDynamic("clientMetadata")(_v.asInstanceOf[js.Any]))
    userNotFound.foreach(_v => _obj$.updateDynamic("userNotFound")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CreateAuthChallengeTriggerEventRequest]
  }
}

@js.native
trait CreateAuthChallengeTriggerEventResponse extends js.Object {
  var publicChallengeParameters: js.Dictionary[String]
  var privateChallengeParameters: js.Dictionary[String]
  var challengeMetadata: String
}

object CreateAuthChallengeTriggerEventResponse {
  def apply(
      publicChallengeParameters: js.Dictionary[String],
      privateChallengeParameters: js.Dictionary[String],
      challengeMetadata: String
  ): CreateAuthChallengeTriggerEventResponse = {
    val _obj$ = js.Dynamic.literal(
      "publicChallengeParameters" -> publicChallengeParameters.asInstanceOf[js.Any],
      "privateChallengeParameters" -> privateChallengeParameters.asInstanceOf[js.Any],
      "challengeMetadata" -> challengeMetadata.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CreateAuthChallengeTriggerEventResponse]
  }
}
