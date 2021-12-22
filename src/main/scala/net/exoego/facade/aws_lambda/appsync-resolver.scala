package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait AppSyncResolverEvent[T] extends js.Object {
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
