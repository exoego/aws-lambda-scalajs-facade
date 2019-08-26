package net.exoego.facade.aws.lambda

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait AuthResponseContext extends js.Object {
  var claims: js.UndefOr[AuthResponseContext.CognitoUserPoolAuthorizerEvent] =
    js.native
}

object AuthResponseContext {
  @js.native
  trait CognitoUserPoolAuthorizerEvent extends js.Object {
    @JSName("cognito:username")
    val cognitoUsername: String = js.native

    @JSName("preferred_username")
    val preferredUsername: String = js.native
    val name: String = js.native
    val email: String = js.native

    @JSName("auth_time")
    val authTime: Double = js.native
    val sub: String = js.native
    val aud: String = js.native

    @JSName("token_use")
    val tokenUse: String = js.native
    val iss: String = js.native
    val exp: String = js.native
    val iat: String = js.native
  }
}
