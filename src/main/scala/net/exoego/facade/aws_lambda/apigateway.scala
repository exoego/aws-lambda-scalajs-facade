package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSBracketAccess, JSName}
import scala.scalajs.js.|

@js.native
trait APIGatewayAuthorizerResultContext extends js.Object {
  @JSBracketAccess
  def apply(key: String): js.UndefOr[String | Double | Boolean]
}

@js.native
trait APIGatewayEventDefaultAuthorizerContext extends js.Object {
  @JSBracketAccess
  def apply(key: String): js.UndefOr[js.Any]
}

trait APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext]
    extends js.Object {
  var accountId: String
  var apiId: String
  var authorizer: TAuthorizerContext
  var connectedAt: js.UndefOr[Double]
  var connectionId: js.UndefOr[String]
  var domainName: js.UndefOr[String]
  var domainPrefix: js.UndefOr[String]
  var eventType: js.UndefOr[String]
  var extendedRequestId: js.UndefOr[String]
  var protocol: String
  var httpMethod: String
  var identity: APIGatewayEventIdentity
  var messageDirection: js.UndefOr[String]
  var messageId: js.UndefOr[String | Null]
  var path: String
  var stage: String
  var requestId: String
  var requestTime: js.UndefOr[String]
  var requestTimeEpoch: Double
  var resourceId: String
  var resourcePath: String
  var routeKey: js.UndefOr[String]
}

trait APIGatewayEventRequestContext
    extends APIGatewayEventRequestContextWithAuthorizer[
      js.UndefOr[AuthResponseContext | Null]
    ]

trait APIGatewayEventIdentity extends js.Object {
  var accessKey: String | Null
  var accountId: String | Null
  var apiKey: String | Null
  var apiKeyId: String | Null
  var caller: String | Null
  var cognitoAuthenticationProvider: String | Null
  var cognitoAuthenticationType: String | Null
  var cognitoIdentityId: String | Null
  var cognitoIdentityPoolId: String | Null
  var principalOrgId: String | Null
  var sourceIp: String
  var user: String | Null
  var userAgent: String | Null
  var userArn: String | Null
}

@js.native
trait AuthResponseContext extends APIGatewayEventDefaultAuthorizerContext {
  var claims: js.UndefOr[AuthResponseContext.CognitoUserPoolAuthorizerEvent] =
    js.native
}

object AuthResponseContext {
  trait CognitoUserPoolAuthorizerEvent extends js.Object {
    @JSName("cognito:username")
    val cognitoUsername: String

    @JSName("preferred_username")
    val preferredUsername: String
    val name: String
    val email: String

    @JSName("auth_time")
    val authTime: Double
    val sub: String
    val aud: String

    @JSName("token_use")
    val tokenUse: String
    val iss: String
    val exp: String
    val iat: String
  }
}
