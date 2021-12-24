package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait AppSyncResolverEvent[T <: js.Any] extends js.Object {
  var arguments: T = js.native
  var identity: js.UndefOr[AppSyncIdentity] = js.native
  var source: AppSyncResolverEvent.Source | Null = js.native
  var request: AppSyncResolverEventRequest = js.native
  var info: AppSyncResolverEventInfo = js.native
  var prev: AppSyncResolverEvent.Prev | Null = js.native
  var stash: AppSyncResolverEvent.Stash = js.native
}
object AppSyncResolverEvent {
  type Source = js.Dictionary[js.Any]
  type Prev = js.Dictionary[js.Any]
  type Stash = js.Dictionary[js.Any]
}

@js.native
trait AppSyncResolverEventRequest extends js.Object {
  var headers: AppSyncResolverEventRequest.Headers = js.native
}
object AppSyncResolverEventRequest {
  type Headers = js.Dictionary[String]

  def apply(
      headers: AppSyncResolverEventRequest.Headers
  ): AppSyncResolverEventRequest = {
    val _obj$ = js.Dynamic.literal(
      "headers" -> headers.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[AppSyncResolverEventRequest]
  }
}

@js.native
trait AppSyncResolverEventInfo extends js.Object {
  var selectionSetList: js.Array[String] = js.native
  var selectionSetGraphQL: String = js.native
  var parentTypeName: String = js.native
  var fieldName: String = js.native
  var variables: AppSyncResolverEventInfo.Variables = js.native
}

object AppSyncResolverEventInfo {
  type Variables = js.Dictionary[js.Any]

  def apply(
      selectionSetList: js.Array[String],
      selectionSetGraphQL: String,
      parentTypeName: String,
      fieldName: String,
      variables: Variables
  ): AppSyncResolverEventInfo = {
    val _obj$ = js.Dynamic.literal(
      "selectionSetList" -> selectionSetList.asInstanceOf[js.Any],
      "selectionSetGraphQL" -> selectionSetGraphQL.asInstanceOf[js.Any],
      "parentTypeName" -> parentTypeName.asInstanceOf[js.Any],
      "fieldName" -> fieldName.asInstanceOf[js.Any],
      "variables" -> variables.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[AppSyncResolverEventInfo]
  }
}

@js.native
trait AppSyncIdentityIAM extends js.Object {
  var accountId: String = js.native
  var cognitoIdentityPoolId: String = js.native
  var cognitoIdentityId: String = js.native
  var sourceIp: js.Array[String] = js.native
  var username: String = js.native
  var userArn: String = js.native
  var cognitoIdentityAuthType: String = js.native
  var cognitoIdentityAuthProvider: String = js.native
}

object AppSyncIdentityIAM {
  def apply(
      accountId: String,
      cognitoIdentityPoolId: String,
      cognitoIdentityId: String,
      sourceIp: js.Array[String],
      username: String,
      userArn: String,
      cognitoIdentityAuthType: String,
      cognitoIdentityAuthProvider: String
  ): AppSyncIdentityIAM = {
    val _obj$ = js.Dynamic.literal(
      "accountId" -> accountId.asInstanceOf[js.Any],
      "cognitoIdentityPoolId" -> cognitoIdentityPoolId.asInstanceOf[js.Any],
      "cognitoIdentityId" -> cognitoIdentityId.asInstanceOf[js.Any],
      "sourceIp" -> sourceIp.asInstanceOf[js.Any],
      "username" -> username.asInstanceOf[js.Any],
      "userArn" -> userArn.asInstanceOf[js.Any],
      "cognitoIdentityAuthType" -> cognitoIdentityAuthType.asInstanceOf[js.Any],
      "cognitoIdentityAuthProvider" -> cognitoIdentityAuthProvider.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[AppSyncIdentityIAM]
  }
}

@js.native
trait AppSyncAuthorizerEvent extends js.Object {
  var authorizationToken: String = js.native
  var requestContext: AppSyncAuthorizerEvent.RequestContext = js.native
}

object AppSyncAuthorizerEvent {
  def apply(
      authorizationToken: String,
      requestContext: AppSyncAuthorizerEvent.RequestContext
  ): AppSyncAuthorizerEvent = {
    val _obj$ = js.Dynamic.literal(
      "authorizationToken" -> authorizationToken.asInstanceOf[js.Any],
      "requestContext" -> requestContext.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[AppSyncAuthorizerEvent]
  }

  @js.native
  trait RequestContext extends js.Object {
    var apiId: String = js.native
    var accountId: String = js.native
    var requestId: String = js.native
    var queryString: String = js.native
    var variables: RequestContext.Variables = js.native
  }

  object RequestContext {
    def apply(
        apiId: String,
        accountId: String,
        requestId: String,
        queryString: String,
        variables: RequestContext.Variables
    ): RequestContext = {
      val _obj$ = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "accountId" -> accountId.asInstanceOf[js.Any],
        "requestId" -> requestId.asInstanceOf[js.Any],
        "queryString" -> queryString.asInstanceOf[js.Any],
        "variables" -> variables.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[RequestContext]
    }

    type Variables = js.Dictionary[js.Any]
  }
}

@js.native
trait AppSyncAuthorizerResult[TResolverContext <: js.Any] extends js.Object {
  var isAuthorized: Boolean = js.native
  var resolverContext: js.UndefOr[TResolverContext] = js.native
  var deniedFields: js.UndefOr[js.Array[String]] = js.native
  var ttlOverride: js.UndefOr[Double] = js.native
}

object AppSyncAuthorizerResult {
  def apply[TResolverContext <: js.Any](
      isAuthorized: Boolean,
      resolverContext: js.UndefOr[TResolverContext] = js.undefined,
      deniedFields: js.UndefOr[js.Array[String]] = js.undefined,
      ttlOverride: js.UndefOr[Double] = js.undefined
  ): AppSyncAuthorizerResult[TResolverContext] = {
    val _obj$ = js.Dynamic.literal(
      "isAuthorized" -> isAuthorized.asInstanceOf[js.Any]
    )
    resolverContext.foreach(_v => _obj$.updateDynamic("resolverContext")(_v.asInstanceOf[js.Any]))
    deniedFields.foreach(_v => _obj$.updateDynamic("deniedFields")(_v.asInstanceOf[js.Any]))
    ttlOverride.foreach(_v => _obj$.updateDynamic("ttlOverride")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[AppSyncAuthorizerResult[TResolverContext]]
  }
}

@js.native
trait AppSyncIdentityCognito extends js.Object {
  var sub: String = js.native
  var issuer: String = js.native
  var username: String = js.native
  var claims: js.Any = js.native
  var sourceIp: js.Array[String] = js.native
  var defaultAuthStrategy: String = js.native
  var groups: js.Array[String] | Null = js.native
}

object AppSyncIdentityCognito {
  def apply(
      sub: String,
      issuer: String,
      username: String,
      claims: js.Any,
      sourceIp: js.Array[String],
      defaultAuthStrategy: String,
      groups: js.Array[String] | Null = null
  ): AppSyncIdentityCognito = {
    val _obj$ = js.Dynamic.literal(
      "sub" -> sub.asInstanceOf[js.Any],
      "issuer" -> issuer.asInstanceOf[js.Any],
      "username" -> username.asInstanceOf[js.Any],
      "claims" -> claims.asInstanceOf[js.Any],
      "sourceIp" -> sourceIp.asInstanceOf[js.Any],
      "defaultAuthStrategy" -> defaultAuthStrategy.asInstanceOf[js.Any],
      "groups" -> groups.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[AppSyncIdentityCognito]
  }
}

@js.native
trait AppSyncIdentityOIDC extends js.Object {
  var claims: js.Any = js.native
  var issuer: String = js.native
  var sub: String = js.native
}

object AppSyncIdentityOIDC {
  def apply(
      claims: js.Any,
      issuer: String,
      sub: String
  ): AppSyncIdentityOIDC = {
    val _obj$ = js.Dynamic.literal(
      "claims" -> claims.asInstanceOf[js.Any],
      "issuer" -> issuer.asInstanceOf[js.Any],
      "sub" -> sub.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[AppSyncIdentityOIDC]
  }
}

@js.native
trait AppSyncIdentityLambda extends js.Object {
  var resolverContext: js.Any = js.native
}

object AppSyncIdentityLambda {
  def apply(
      resolverContext: js.Any
  ): AppSyncIdentityLambda = {
    val _obj$ = js.Dynamic.literal(
      "resolverContext" -> resolverContext.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[AppSyncIdentityLambda]
  }
}
