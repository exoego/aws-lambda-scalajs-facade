package net.exoego.facade.aws_lambda

import scala.scalajs.js

/** @see
  *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-create-auth-challenge.html
  */
@js.native
trait CreateAuthChallengeTriggerEvent extends BaseTriggerEvent["CreateAuthChallenge_Authentication"] {
  var request: CreateAuthChallengeTriggerEventRequest = js.native
  var response: CreateAuthChallengeTriggerEventResponse = js.native
}

/** @see
  *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-authentication.html
  */
@js.native
trait PreAuthenticationTriggerEvent extends BaseTriggerEvent["PreAuthentication_Authentication"] {
  var request: PreAuthenticationTriggerEventRequest = js.native
}

/** @see
  *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-define-auth-challenge.html
  */
@js.native
trait DefineAuthChallengeTriggerEvent extends BaseTriggerEvent["DefineAuthChallenge_Authentication"] {
  var request: DefineAuthChallengeTriggerEventRequest = js.native
  var response: DefineAuthChallengeTriggerEventResponse = js.native
}

/** @see
  *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-post-authentication.html
  */
@js.native
trait PostAuthenticationTriggerEvent extends BaseTriggerEvent["PostAuthentication_Authentication"] {
  var request: PostAuthenticationTriggerEventRequest = js.native
}

/** @see
  *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-verify-auth-challenge-response.html
  */
@js.native
trait VerifyAuthChallengeResponseTriggerEvent extends BaseTriggerEvent["VerifyAuthChallengeResponse_Authentication"] {
  var request: VerifyAuthChallengeResponseTriggerEventRequest = js.native
  var response: VerifyAuthChallengeResponseTriggerEventResponse = js.native
}
