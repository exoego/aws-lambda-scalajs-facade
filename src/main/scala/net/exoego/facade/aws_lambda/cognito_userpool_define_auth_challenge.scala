package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.|

/** @see
  *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-define-auth-challenge.html
  */
@js.native
trait DefineAuthChallengeTriggerEvent extends BaseTriggerEvent["DefineAuthChallenge_Authentication"] {
  var request: DefineAuthChallengeTriggerEventRequest = js.native
  var response: DefineAuthChallengeTriggerEventResponse = js.native
}

object DefineAuthChallengeTriggerEvent {
  def apply(
      version: String,
      region: String,
      userPoolId: String,
      userName: String,
      callerContext: CognitoUserpoolCallerContext,
      request: DefineAuthChallengeTriggerEventRequest,
      response: DefineAuthChallengeTriggerEventResponse
  ): DefineAuthChallengeTriggerEvent = {
    val _obj$ = js.Dynamic.literal(
      "triggerSource" -> "DefineAuthChallenge_Authentication",
      "version" -> version.asInstanceOf[js.Any],
      "region" -> region.asInstanceOf[js.Any],
      "userPoolId" -> userPoolId.asInstanceOf[js.Any],
      "userName" -> userName.asInstanceOf[js.Any],
      "callerContext" -> callerContext.asInstanceOf[js.Any],
      "request" -> request.asInstanceOf[js.Any],
      "response" -> response.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[DefineAuthChallengeTriggerEvent]
  }
}

@js.native
trait DefineAuthChallengeTriggerEventRequest extends js.Object {
  var userAttributes: js.Dictionary[String]
  var session: js.Array[ChallengeResult | CustomChallengeResult]
  var clientMetadata: js.UndefOr[js.Dictionary[String]]
  var userNotFound: js.UndefOr[Boolean]
}

object DefineAuthChallengeTriggerEventRequest {
  def apply(
      userAttributes: js.Dictionary[String],
      session: js.Array[ChallengeResult | CustomChallengeResult],
      clientMetadata: js.UndefOr[js.Dictionary[String]] = js.undefined,
      userNotFound: js.UndefOr[Boolean] = js.undefined
  ): DefineAuthChallengeTriggerEventRequest = {
    val _obj$ = js.Dynamic.literal(
      "userAttributes" -> userAttributes.asInstanceOf[js.Any],
      "session" -> session.asInstanceOf[js.Any]
    )
    clientMetadata.foreach(_v => _obj$.updateDynamic("clientMetadata")(_v.asInstanceOf[js.Any]))
    userNotFound.foreach(_v => _obj$.updateDynamic("userNotFound")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[DefineAuthChallengeTriggerEventRequest]
  }
}

@js.native
trait DefineAuthChallengeTriggerEventResponse extends js.Object {
  var challengeName: String
  var failAuthentication: Boolean
  var issueTokens: Boolean
}

object DefineAuthChallengeTriggerEventResponse {
  def apply(
      challengeName: String,
      failAuthentication: Boolean,
      issueTokens: Boolean
  ): DefineAuthChallengeTriggerEventResponse = {
    val _obj$ = js.Dynamic.literal(
      "challengeName" -> challengeName.asInstanceOf[js.Any],
      "failAuthentication" -> failAuthentication.asInstanceOf[js.Any],
      "issueTokens" -> issueTokens.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[DefineAuthChallengeTriggerEventResponse]
  }
}
