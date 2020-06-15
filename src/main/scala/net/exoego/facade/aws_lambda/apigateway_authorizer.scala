package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.|

trait APIGatewayTokenAuthorizerEvent extends js.Object {
  var `type`: String
  var methodArn: String
  var authorizationToken: String
}

trait APIGatewayRequestAuthorizerEvent extends js.Object {
  var `type`: String
  var methodArn: String
  var resource: String
  var path: String
  var httpMethod: String
  var headers: js.Dictionary[String] | Null
  var multiValueHeaders: js.Dictionary[js.Array[String]] | Null
  var pathParameters: js.Dictionary[String] | Null
  var queryStringParameters: js.Dictionary[String] | Null
  var multiValueQueryStringParameters: js.Dictionary[js.Array[String]] | Null
  var stageVariables: js.Dictionary[String] | Null
  var requestContext: APIGatewayEventRequestContextWithAuthorizer[Unit]
}

trait APIGatewayAuthorizerResult extends js.Object {
  var principalId: String
  var policyDocument: PolicyDocument
  var context: js.UndefOr[APIGatewayAuthorizerResultContext | Null]
  var usageIdentifierKey: js.UndefOr[String | Null]
}

trait APIGatewayAuthorizerWithContextResult[
    TAuthorizerContext <: APIGatewayAuthorizerResultContext
] extends js.Object {
  var principalId: String
  var policyDocument: PolicyDocument
  var context: TAuthorizerContext
  var usageIdentifierKey: js.UndefOr[String | Null]
}

@js.native
trait PolicyDocument extends js.Object {
  var Version: String = js.native
  var Id: js.UndefOr[String] = js.native
  var Statement: js.Array[Statement] = js.native
}

object PolicyDocument {
  def apply(
      Version: String,
      Statement: js.Array[Statement],
      Id: js.UndefOr[String] = js.undefined
  ): PolicyDocument = {
    val _obj$ = js.Dynamic.literal(
      "Version" -> Version.asInstanceOf[js.Any],
      "Statement" -> Statement.asInstanceOf[js.Any]
    )
    Id.foreach(_v => _obj$.updateDynamic("Id")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[PolicyDocument]
  }
}

@js.native
trait BaseStatement extends js.Object {
  var Effect: String = js.native
  var Sid: js.UndefOr[String] = js.native
  var Condition: js.UndefOr[ConditionBlock] = js.native
}

object BaseStatement {
  def apply(
      Effect: String,
      Sid: js.UndefOr[String] = js.undefined,
      Condition: js.UndefOr[ConditionBlock] = js.undefined
  ): BaseStatement = {
    val _obj$ = js.Dynamic.literal(
      "Effect" -> Effect.asInstanceOf[js.Any]
    )
    Sid.foreach(_v => _obj$.updateDynamic("Sid")(_v.asInstanceOf[js.Any]))
    Condition.foreach(_v =>
      _obj$.updateDynamic("Condition")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[BaseStatement]
  }
}

@js.native
trait MaybeStatementPrincipal extends js.Object {
  var Principal: js.UndefOr[PrincipalValue] = js.native
  var NotPrincipal: js.UndefOr[PrincipalValue] = js.native
}

object MaybeStatementPrincipal {
  def apply(
      Principal: js.UndefOr[PrincipalValue] = js.undefined,
      NotPrincipal: js.UndefOr[PrincipalValue] = js.undefined
  ): MaybeStatementPrincipal = {
    val _obj$ = js.Dynamic.literal(
    )
    Principal.foreach(_v =>
      _obj$.updateDynamic("Principal")(_v.asInstanceOf[js.Any])
    )
    NotPrincipal.foreach(_v =>
      _obj$.updateDynamic("NotPrincipal")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[MaybeStatementPrincipal]
  }
}

@js.native
trait MaybeStatementResource extends js.Object {
  var Resource: js.UndefOr[String | js.Array[String]] = js.native
  var NotResource: js.UndefOr[String | js.Array[String]] = js.native
}

object MaybeStatementResource {
  def apply(
      Resource: js.UndefOr[String | js.Array[String]] = js.undefined,
      NotResource: js.UndefOr[String | js.Array[String]] = js.undefined
  ): MaybeStatementResource = {
    val _obj$ = js.Dynamic.literal(
    )
    Resource.foreach(_v =>
      _obj$.updateDynamic("Resource")(_v.asInstanceOf[js.Any])
    )
    NotResource.foreach(_v =>
      _obj$.updateDynamic("NotResource")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[MaybeStatementResource]
  }
}
