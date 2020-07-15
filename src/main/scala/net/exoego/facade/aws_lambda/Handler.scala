package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

/**
  * Callback-style handler
  *
  * @tparam TEvent
  * @tparam TResult
  */
trait Handler[TEvent, TResult] extends js.Object {
  @JSName("apply")
  def apply(event: TEvent, context: Context, callback: Callback[TResult]): Unit
}

/**
  * Asynchronous-style handler that returns js.Promise.
  * This can be used Node.js 8 runtime or more
  *
  * @tparam TEvent
  * @tparam TResult
  */
trait AsyncHandler[TEvent, TResult] extends js.Object {
  @JSName("apply")
  def apply(event: TEvent, context: Context): js.Promise[TResult]
}

@js.native
trait Context extends js.Object {
  var callbackWaitsForEmptyEventLoop: Boolean
  var functionName: String
  var functionVersion: String
  var invokedFunctionArn: String
  var memoryLimitInMB: String
  var awsRequestId: String
  var logGroupName: String
  var logStreamName: String
  var identity: js.UndefOr[CognitoIdentity]
  var clientContext: js.UndefOr[ClientContext]
  def getRemainingTimeInMillis(): Double
  def done(error: js.Error = ???, result: js.Any = ???): Unit
  def fail(error: js.Error | String): Unit
  def succeed(messageOrObject: js.Any): Unit
  def succeed(message: String, `object`: js.Any): Unit
}

@Factory
trait CognitoIdentity extends js.Object {
  var cognitoIdentityId: String
  var cognitoIdentityPoolId: String
}

@Factory
trait ClientContext extends js.Object {
  var client: ClientContextClient
  var Custom: js.UndefOr[js.Any]
  var env: ClientContextEnv
}

@Factory
trait ClientContextClient extends js.Object {
  var installationId: String
  var appTitle: String
  var appVersionName: String
  var appVersionCode: String
  var appPackageName: String
}

@Factory
trait ClientContextEnv extends js.Object {
  var platformVersion: String
  var platform: String
  var make: String
  var model: String
  var locale: String
}
