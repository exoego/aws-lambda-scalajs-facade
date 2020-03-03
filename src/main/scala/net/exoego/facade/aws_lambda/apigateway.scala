package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSBracketAccess, JSName}
import scala.scalajs.js.|

@js.native
trait APIGatewayAuthorizerResultContext extends js.Object {
  @JSBracketAccess
  def apply(key: String): js.UndefOr[String | Double | Boolean] = js.native
}

@js.native
trait APIGatewayEventDefaultAuthorizerContext extends js.Object {
  @JSBracketAccess
  def apply(key: String): js.UndefOr[js.Any] = js.native
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

object APIGatewayEventRequestContext {
  @deprecated("Use new APIGatewayEventRequestContext{}", "0.7.0")
  def apply(
      accountId: String,
      apiId: String,
      protocol: String,
      httpMethod: String,
      identity: APIGatewayEventIdentity,
      path: String,
      stage: String,
      requestId: String,
      requestTimeEpoch: Double,
      resourceId: String,
      resourcePath: String,
      authorizer: js.UndefOr[AuthResponseContext | Null] = js.undefined,
      connectedAt: js.UndefOr[Double] = js.undefined,
      connectionId: js.UndefOr[String] = js.undefined,
      domainName: js.UndefOr[String] = js.undefined,
      domainPrefix: js.UndefOr[String] = js.undefined,
      eventType: js.UndefOr[String] = js.undefined,
      extendedRequestId: js.UndefOr[String] = js.undefined,
      messageDirection: js.UndefOr[String] = js.undefined,
      messageId: js.UndefOr[String | Null] = js.undefined,
      requestTime: js.UndefOr[String] = js.undefined,
      routeKey: js.UndefOr[String] = js.undefined
  ): APIGatewayEventRequestContext = {
    val _obj$ = js.Dynamic.literal(
      "accountId" -> accountId.asInstanceOf[js.Any],
      "apiId" -> apiId.asInstanceOf[js.Any],
      "protocol" -> protocol.asInstanceOf[js.Any],
      "httpMethod" -> httpMethod.asInstanceOf[js.Any],
      "identity" -> identity.asInstanceOf[js.Any],
      "path" -> path.asInstanceOf[js.Any],
      "stage" -> stage.asInstanceOf[js.Any],
      "requestId" -> requestId.asInstanceOf[js.Any],
      "requestTimeEpoch" -> requestTimeEpoch.asInstanceOf[js.Any],
      "resourceId" -> resourceId.asInstanceOf[js.Any],
      "resourcePath" -> resourcePath.asInstanceOf[js.Any]
    )
    authorizer.foreach(_v =>
      _obj$.updateDynamic("authorizer")(_v.asInstanceOf[js.Any])
    )
    connectedAt.foreach(_v =>
      _obj$.updateDynamic("connectedAt")(_v.asInstanceOf[js.Any])
    )
    connectionId.foreach(_v =>
      _obj$.updateDynamic("connectionId")(_v.asInstanceOf[js.Any])
    )
    domainName.foreach(_v =>
      _obj$.updateDynamic("domainName")(_v.asInstanceOf[js.Any])
    )
    domainPrefix.foreach(_v =>
      _obj$.updateDynamic("domainPrefix")(_v.asInstanceOf[js.Any])
    )
    eventType.foreach(_v =>
      _obj$.updateDynamic("eventType")(_v.asInstanceOf[js.Any])
    )
    extendedRequestId.foreach(_v =>
      _obj$.updateDynamic("extendedRequestId")(_v.asInstanceOf[js.Any])
    )
    messageDirection.foreach(_v =>
      _obj$.updateDynamic("messageDirection")(_v.asInstanceOf[js.Any])
    )
    messageId.foreach(_v =>
      _obj$.updateDynamic("messageId")(_v.asInstanceOf[js.Any])
    )
    requestTime.foreach(_v =>
      _obj$.updateDynamic("requestTime")(_v.asInstanceOf[js.Any])
    )
    routeKey.foreach(_v =>
      _obj$.updateDynamic("routeKey")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[APIGatewayEventRequestContext]
  }

  @deprecated("Use APIGatewayEventIdentity instead.", "0.7.0")
  type Identity = APIGatewayEventIdentity

  @deprecated("Use APIGatewayEventIdentity instead.", "0.7.0")
  object Identity {
    def apply(
        sourceIp: String,
        accessKey: String | Null = null,
        accountId: String | Null = null,
        apiKey: String | Null = null,
        apiKeyId: String | Null = null,
        caller: String | Null = null,
        cognitoAuthenticationProvider: String | Null = null,
        cognitoAuthenticationType: String | Null = null,
        cognitoIdentityId: String | Null = null,
        cognitoIdentityPoolId: String | Null = null,
        principalOrgId: String | Null = null,
        user: String | Null = null,
        userAgent: String | Null = null,
        userArn: String | Null = null
    ): Identity = {
      val _obj$ = js.Dynamic.literal(
        "accessKey" -> accessKey.asInstanceOf[js.Any],
        "accountId" -> accountId.asInstanceOf[js.Any],
        "apiKey" -> apiKey.asInstanceOf[js.Any],
        "apiKeyId" -> apiKeyId.asInstanceOf[js.Any],
        "caller" -> caller.asInstanceOf[js.Any],
        "cognitoAuthenticationProvider" -> cognitoAuthenticationProvider
          .asInstanceOf[js.Any],
        "cognitoAuthenticationType" -> cognitoAuthenticationType
          .asInstanceOf[js.Any],
        "cognitoIdentityId" -> cognitoIdentityId.asInstanceOf[js.Any],
        "cognitoIdentityPoolId" -> cognitoIdentityPoolId.asInstanceOf[js.Any],
        "principalOrgId" -> principalOrgId.asInstanceOf[js.Any],
        "sourceIp" -> sourceIp.asInstanceOf[js.Any],
        "user" -> user.asInstanceOf[js.Any],
        "userAgent" -> userAgent.asInstanceOf[js.Any],
        "userArn" -> userArn.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[Identity]
    }
  }
}

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
