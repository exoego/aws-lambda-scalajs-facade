package net.exoego.facade.aws_lambda

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait BaseAPIGatewayAuthorizerEvent[T <: String] extends js.Object {
  var `type`: T = js.native
  var methodArn: String = js.native
}

@js.native
trait APIGatewayTokenAuthorizerEvent extends BaseAPIGatewayAuthorizerEvent["TOKEN"] {
  var authorizationToken: String = js.native
}

object APIGatewayTokenAuthorizerEvent {
  def apply(
      methodArn: String,
      authorizationToken: String
  ): APIGatewayTokenAuthorizerEvent = {
    val _obj$ = js.Dynamic.literal(
      "type" -> "TOKEN",
      "methodArn" -> methodArn.asInstanceOf[js.Any],
      "authorizationToken" -> authorizationToken.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[APIGatewayTokenAuthorizerEvent]
  }
}

@js.native
trait APIGatewayRequestAuthorizerEvent extends BaseAPIGatewayAuthorizerEvent["REQUEST"] {
  var resource: String = js.native
  var path: String = js.native
  var httpMethod: String = js.native
  var headers: js.Dictionary[String] | Null = js.native
  var multiValueHeaders: js.Dictionary[js.Array[String]] | Null = js.native
  var pathParameters: js.Dictionary[String] | Null = js.native
  var queryStringParameters: js.Dictionary[String] | Null = js.native
  var multiValueQueryStringParameters: js.Dictionary[js.Array[String]] | Null = js.native
  var stageVariables: js.Dictionary[String] | Null = js.native
  var requestContext: APIGatewayEventRequestContextWithAuthorizer[Unit] = js.native
}

object APIGatewayRequestAuthorizerEvent {
  def apply(
      methodArn: String,
      resource: String,
      path: String,
      httpMethod: String,
      requestContext: APIGatewayEventRequestContextWithAuthorizer[Unit],
      headers: js.Dictionary[String] | Null = null,
      multiValueHeaders: js.Dictionary[js.Array[String]] | Null = null,
      pathParameters: js.Dictionary[String] | Null = null,
      queryStringParameters: js.Dictionary[String] | Null = null,
      multiValueQueryStringParameters: js.Dictionary[js.Array[String]] | Null = null,
      stageVariables: js.Dictionary[String] | Null = null
  ): APIGatewayRequestAuthorizerEvent = {
    val _obj$ = js.Dynamic.literal(
      "type" -> "REQUEST",
      "methodArn" -> methodArn.asInstanceOf[js.Any],
      "resource" -> resource.asInstanceOf[js.Any],
      "path" -> path.asInstanceOf[js.Any],
      "httpMethod" -> httpMethod.asInstanceOf[js.Any],
      "headers" -> headers.asInstanceOf[js.Any],
      "multiValueHeaders" -> multiValueHeaders.asInstanceOf[js.Any],
      "pathParameters" -> pathParameters.asInstanceOf[js.Any],
      "queryStringParameters" -> queryStringParameters.asInstanceOf[js.Any],
      "multiValueQueryStringParameters" -> multiValueQueryStringParameters.asInstanceOf[js.Any],
      "stageVariables" -> stageVariables.asInstanceOf[js.Any],
      "requestContext" -> requestContext.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[APIGatewayRequestAuthorizerEvent]
  }
}

@js.native
trait APIGatewayAuthorizerResult extends js.Object {
  var principalId: String = js.native
  var policyDocument: PolicyDocument = js.native
  var context: js.UndefOr[APIGatewayAuthorizerResultContext | Null] = js.native
  var usageIdentifierKey: js.UndefOr[String | Null] = js.native
}

object APIGatewayAuthorizerResult {
  def apply(
      principalId: String,
      policyDocument: PolicyDocument,
      context: js.UndefOr[APIGatewayAuthorizerResultContext | Null] = js.undefined,
      usageIdentifierKey: js.UndefOr[String | Null] = js.undefined
  ): APIGatewayAuthorizerResult = {
    val _obj$ = js.Dynamic.literal(
      "principalId" -> principalId.asInstanceOf[js.Any],
      "policyDocument" -> policyDocument.asInstanceOf[js.Any]
    )
    context.foreach(_v => _obj$.updateDynamic("context")(_v.asInstanceOf[js.Any]))
    usageIdentifierKey.foreach(_v => _obj$.updateDynamic("usageIdentifierKey")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[APIGatewayAuthorizerResult]
  }
}

@js.native
trait APIGatewayAuthorizerWithContextResult[TAuthorizerContext <: APIGatewayAuthorizerResultContext] extends js.Object {
  var principalId: String = js.native
  var policyDocument: PolicyDocument = js.native
  var context: TAuthorizerContext = js.native
  var usageIdentifierKey: js.UndefOr[String | Null] = js.native
}

object APIGatewayAuthorizerWithContextResult {
  def apply[TAuthorizerContext <: APIGatewayAuthorizerResultContext](
      principalId: String,
      policyDocument: PolicyDocument,
      context: TAuthorizerContext,
      usageIdentifierKey: js.UndefOr[String | Null] = js.undefined
  ): APIGatewayAuthorizerWithContextResult[TAuthorizerContext] = {
    val _obj$ = js.Dynamic.literal(
      "principalId" -> principalId.asInstanceOf[js.Any],
      "policyDocument" -> policyDocument.asInstanceOf[js.Any],
      "context" -> context.asInstanceOf[js.Any]
    )
    usageIdentifierKey.foreach(_v => _obj$.updateDynamic("usageIdentifierKey")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[APIGatewayAuthorizerWithContextResult[TAuthorizerContext]]
  }
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
    Condition.foreach(_v => _obj$.updateDynamic("Condition")(_v.asInstanceOf[js.Any]))
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
    Principal.foreach(_v => _obj$.updateDynamic("Principal")(_v.asInstanceOf[js.Any]))
    NotPrincipal.foreach(_v => _obj$.updateDynamic("NotPrincipal")(_v.asInstanceOf[js.Any]))
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
    Resource.foreach(_v => _obj$.updateDynamic("Resource")(_v.asInstanceOf[js.Any]))
    NotResource.foreach(_v => _obj$.updateDynamic("NotResource")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[MaybeStatementResource]
  }
}
