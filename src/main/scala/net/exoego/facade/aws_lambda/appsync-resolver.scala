package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js
import scala.scalajs.js.|

@Factory
@js.native
trait AppSyncResolverEvent[T] extends js.Object {
  var arguments: T = js.native
  var identity: js.UndefOr[AppSyncIdentityIAM | AppSyncIdentityCognito] = js.native
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

@Factory
@js.native
trait AppSyncResolverEventRequest extends js.Object {
  var headers: AppSyncResolverEventRequest.Headers = js.native
}
object AppSyncResolverEventRequest {
  type Headers = js.Dictionary[String]
}

@Factory
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
}

@Factory
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

@Factory
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
