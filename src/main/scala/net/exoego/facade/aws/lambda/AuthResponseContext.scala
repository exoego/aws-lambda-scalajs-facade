package net.exoego.facade.aws.lambda

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Defined here to override auto-generated type.
  *
  * @see http://docs.aws.amazon.com/ja_jp/cognito/latest/developerguide/user-pool-settings-attributes.html
  */
@js.native
trait AuthResponseContext extends js.Object {

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
