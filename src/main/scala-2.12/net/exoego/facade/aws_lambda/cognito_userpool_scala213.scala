package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js

/** @see https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-create-auth-challenge.html
  */
@Factory
@js.native
trait CreateAuthChallengeTriggerEvent extends BaseTriggerEvent[String] {
  var request: CreateAuthChallengeTriggerEventRequest = js.native
  var response: CreateAuthChallengeTriggerEventResponse = js.native
}

/** @see https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-authentication.html
  */
@Factory
@js.native
trait PreAuthenticationTriggerEvent extends BaseTriggerEvent[String] {
  var request: PreAuthenticationTriggerEventRequest = js.native
}

/** @see https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-define-auth-challenge.html
  */
@Factory
@js.native
trait DefineAuthChallengeTriggerEvent extends BaseTriggerEvent[String] {
  var request: DefineAuthChallengeTriggerEventRequest = js.native
  var response: DefineAuthChallengeTriggerEventResponse = js.native
}

/** @see https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-post-authentication.html
  */
@Factory
@js.native
trait PostAuthenticationTriggerEvent extends BaseTriggerEvent[String] {
  var request: PostAuthenticationTriggerEventRequest = js.native
}

/** @see https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-verify-auth-challenge-response.html
  */
@Factory
@js.native
trait VerifyAuthChallengeResponseTriggerEvent extends BaseTriggerEvent[String] {
  var request: VerifyAuthChallengeResponseTriggerEventRequest = js.native
  var response: VerifyAuthChallengeResponseTriggerEventResponse = js.native
}
