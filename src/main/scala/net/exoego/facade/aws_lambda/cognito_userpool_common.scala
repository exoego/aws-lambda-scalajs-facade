package net.exoego.facade.aws_lambda

import scala.scalajs.js

@js.native
trait ChallengeResultBase[T <: String, M] extends js.Object {
  var challengeName: T = js.native
  var challengeResult: Boolean = js.native
  var challengeMetadata: js.UndefOr[M] = js.native
}

@js.native
trait ChallengeResult extends ChallengeResultBase[literal.CognitoUserPoolChallengeName, Unit]

object ChallengeResult {
  def apply(
      challengeName: literal.CognitoUserPoolChallengeName,
      challengeResult: Boolean
  ): ChallengeResult = {
    val _obj$ = js.Dynamic.literal(
      "challengeName" -> challengeName.asInstanceOf[js.Any],
      "challengeResult" -> challengeResult.asInstanceOf[js.Any],
      "challengeMetadata" -> js.undefined
    )
    _obj$.asInstanceOf[ChallengeResult]
  }
}

@js.native
trait CustomChallengeResult extends ChallengeResultBase["CUSTOM_CHALLENGE", String]

object CustomChallengeResult {
  def apply(
      challengeName: "CUSTOM_CHALLENGE",
      challengeResult: Boolean,
      challengeMetadata: js.UndefOr[String] = js.undefined
  ): CustomChallengeResult = {
    val _obj$ = js.Dynamic.literal(
      "challengeName" -> challengeName.asInstanceOf[js.Any],
      "challengeResult" -> challengeResult.asInstanceOf[js.Any]
    )
    challengeMetadata.foreach(_v => _obj$.updateDynamic("challengeMetadata")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CustomChallengeResult]
  }
}

@js.native
trait BaseTriggerEvent[T <: String] extends js.Object {
  var version: String = js.native
  var region: String = js.native
  var userPoolId: String = js.native
  var triggerSource: T = js.native
  var userName: String = js.native
  var callerContext: CognitoUserpoolCallerContext = js.native
}

@js.native
trait CognitoUserpoolCallerContext extends js.Object {
  var awsSdkVersion: String
  var clientId: String
}

object CallerContext {
  def apply(
      awsSdkVersion: String,
      clientId: String
  ): CognitoUserpoolCallerContext = {
    val _obj$ = js.Dynamic.literal(
      "awsSdkVersion" -> awsSdkVersion.asInstanceOf[js.Any],
      "clientId" -> clientId.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CognitoUserpoolCallerContext]
  }
}
