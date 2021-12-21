package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.annotation.JSBracketAccess
import scala.scalajs.js.|

@js.native
trait APIGatewayAuthorizerResultContext extends js.Object {
  @JSBracketAccess
  def apply(key: String): js.UndefOr[String | Double | Boolean] = js.native
}

trait APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext] extends js.Object {
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

@js.native
trait APIGatewayEventClientCertificate extends js.Object {
  var clientCertPem: String = js.native
  var serialNumber: String = js.native
  var subjectDN: String = js.native
  var issuerDN: String = js.native
  var validity: APIGatewayEventClientCertificate.Validity = js.native
}

object APIGatewayEventClientCertificate {
  @js.native
  trait Validity extends js.Object {
    var notAfter: String = js.native
    var notBefore: String = js.native
  }
}

trait APIGatewayEventIdentity extends js.Object {
  var accessKey: String | Null
  var accountId: String | Null
  var apiKey: String | Null
  var apiKeyId: String | Null
  var caller: String | Null
  var clientCert: APIGatewayEventClientCertificate | Null
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
