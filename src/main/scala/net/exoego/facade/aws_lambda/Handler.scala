package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

/** Callback-style handler
  *
  * @tparam TEvent
  * @tparam TResult
  */
trait Handler[TEvent, TResult] extends js.Object {
  @JSName("apply")
  def apply(event: TEvent, context: Context, callback: Callback[TResult]): Unit
}

/** Asynchronous-style handler that returns js.Promise. This can be used Node.js 8 runtime or more
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
  var callbackWaitsForEmptyEventLoop: Boolean = js.native
  var functionName: String = js.native
  var functionVersion: String = js.native
  var invokedFunctionArn: String = js.native
  var memoryLimitInMB: String = js.native
  var awsRequestId: String = js.native
  var logGroupName: String = js.native
  var logStreamName: String = js.native
  var identity: js.UndefOr[CognitoIdentity] = js.native
  var clientContext: js.UndefOr[ClientContext] = js.native
  def getRemainingTimeInMillis(): Double = js.native
  def done(error: js.Error = ???, result: js.Any = ???): Unit = js.native
  def fail(error: js.Error | String): Unit = js.native
  def succeed(messageOrObject: js.Any): Unit = js.native
  def succeed(message: String, `object`: js.Any): Unit = js.native
}

@js.native
trait CognitoIdentity extends js.Object {
  var cognitoIdentityId: String = js.native
  var cognitoIdentityPoolId: String = js.native
}
object CognitoIdentity {
  def apply(cognitoIdentityId: String, cognitoIdentityPoolId: String): CognitoIdentity = {
    val _obj$ = js.Dynamic.literal(
      "cognitoIdentityId" -> cognitoIdentityId.asInstanceOf[js.Any],
      "cognitoIdentityPoolId" -> cognitoIdentityPoolId.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CognitoIdentity]
  }
}

@js.native
trait ClientContext extends js.Object {
  var client: ClientContextClient = js.native
  var Custom: js.UndefOr[js.Any] = js.native
  var env: ClientContextEnv = js.native
}
object ClientContext {
  def apply(
      client: ClientContextClient,
      env: ClientContextEnv,
      Custom: js.UndefOr[js.Any] = js.undefined
  ): ClientContext = {
    val _obj$ = js.Dynamic.literal(
      "client" -> client.asInstanceOf[js.Any],
      "env" -> env.asInstanceOf[js.Any]
    )
    Custom.foreach(_v => _obj$.updateDynamic("Custom")(_v))
    _obj$.asInstanceOf[ClientContext]
  }
}

@js.native
trait ClientContextClient extends js.Object {
  var installationId: String = js.native
  var appTitle: String = js.native
  var appVersionName: String = js.native
  var appVersionCode: String = js.native
  var appPackageName: String = js.native
}
object ClientContextClient {
  def apply(
      installationId: String,
      appTitle: String,
      appVersionName: String,
      appVersionCode: String,
      appPackageName: String
  ): ClientContextClient = {
    val _obj$ = js.Dynamic.literal(
      "installationId" -> installationId.asInstanceOf[js.Any],
      "appTitle" -> appTitle.asInstanceOf[js.Any],
      "appVersionName" -> appVersionName.asInstanceOf[js.Any],
      "appVersionCode" -> appVersionCode.asInstanceOf[js.Any],
      "appPackageName" -> appPackageName.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[ClientContextClient]
  }
}

@js.native
trait ClientContextEnv extends js.Object {
  var platformVersion: String = js.native
  var platform: String = js.native
  var make: String = js.native
  var model: String = js.native
  var locale: String = js.native
}
object ClientContextEnv {
  def apply(
      platformVersion: String,
      platform: String,
      make: String,
      model: String,
      locale: String
  ): ClientContextEnv = {
    val _obj$ = js.Dynamic.literal(
      "platformVersion" -> platformVersion.asInstanceOf[js.Any],
      "platform" -> platform.asInstanceOf[js.Any],
      "make" -> make.asInstanceOf[js.Any],
      "model" -> model.asInstanceOf[js.Any],
      "locale" -> locale.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[ClientContextEnv]
  }
}
