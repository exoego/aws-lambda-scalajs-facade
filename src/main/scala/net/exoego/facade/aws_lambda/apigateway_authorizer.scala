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

@deprecated("Use APIGatewayAuthorizerEvent or a subtype", "0.7.0")
@js.native
trait CustomAuthorizerEvent extends js.Object {
  var `type`: String = js.native
  var methodArn: String = js.native
  var authorizationToken: js.UndefOr[String] = js.native
  var resource: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var httpMethod: js.UndefOr[String] = js.native
  var headers: js.UndefOr[CustomAuthorizerEvent.Headers] = js.native
  var multiValueHeaders: js.UndefOr[CustomAuthorizerEvent.MultiValueHeaders] =
    js.native
  var pathParameters: js.UndefOr[js.Dictionary[String] | Null] = js.native
  var queryStringParameters: js.UndefOr[js.Dictionary[String] | Null] =
    js.native
  var multiValueQueryStringParameters
      : js.UndefOr[js.Dictionary[js.Array[String]] | Null] = js.native
  var stageVariables: js.UndefOr[CustomAuthorizerEvent.StageVariables] =
    js.native
  var requestContext: js.UndefOr[APIGatewayEventRequestContextWithAuthorizer[
    APIGatewayEventDefaultAuthorizerContext
  ]] = js.native
}

object CustomAuthorizerEvent {
  @deprecated("Use APIGatewayAuthorizerEvent or a subtype", "0.7.0")
  def apply(
      `type`: String,
      methodArn: String,
      authorizationToken: js.UndefOr[String] = js.undefined,
      resource: js.UndefOr[String] = js.undefined,
      path: js.UndefOr[String] = js.undefined,
      httpMethod: js.UndefOr[String] = js.undefined,
      headers: js.UndefOr[CustomAuthorizerEvent.Headers] = js.undefined,
      multiValueHeaders: js.UndefOr[CustomAuthorizerEvent.MultiValueHeaders] =
        js.undefined,
      pathParameters: js.UndefOr[js.Dictionary[String] | Null] = js.undefined,
      queryStringParameters: js.UndefOr[js.Dictionary[String] | Null] =
        js.undefined,
      multiValueQueryStringParameters: js.UndefOr[
        js.Dictionary[js.Array[String]] | Null
      ] = js.undefined,
      stageVariables: js.UndefOr[CustomAuthorizerEvent.StageVariables] =
        js.undefined,
      requestContext: js.UndefOr[APIGatewayEventRequestContext] = js.undefined
  ): CustomAuthorizerEvent = {
    val _obj$ = js.Dynamic.literal(
      "type" -> `type`.asInstanceOf[js.Any],
      "methodArn" -> methodArn.asInstanceOf[js.Any]
    )
    authorizationToken.foreach(_v =>
      _obj$.updateDynamic("authorizationToken")(_v.asInstanceOf[js.Any])
    )
    resource.foreach(_v =>
      _obj$.updateDynamic("resource")(_v.asInstanceOf[js.Any])
    )
    path.foreach(_v => _obj$.updateDynamic("path")(_v.asInstanceOf[js.Any]))
    httpMethod.foreach(_v =>
      _obj$.updateDynamic("httpMethod")(_v.asInstanceOf[js.Any])
    )
    headers.foreach(_v =>
      _obj$.updateDynamic("headers")(_v.asInstanceOf[js.Any])
    )
    multiValueHeaders.foreach(_v =>
      _obj$.updateDynamic("multiValueHeaders")(_v.asInstanceOf[js.Any])
    )
    pathParameters.foreach(_v =>
      _obj$.updateDynamic("pathParameters")(_v.asInstanceOf[js.Any])
    )
    queryStringParameters.foreach(_v =>
      _obj$.updateDynamic("queryStringParameters")(_v.asInstanceOf[js.Any])
    )
    multiValueQueryStringParameters.foreach(_v =>
      _obj$.updateDynamic("multiValueQueryStringParameters")(
        _v.asInstanceOf[js.Any]
      )
    )
    stageVariables.foreach(_v =>
      _obj$.updateDynamic("stageVariables")(_v.asInstanceOf[js.Any])
    )
    requestContext.foreach(_v =>
      _obj$.updateDynamic("requestContext")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[CustomAuthorizerEvent]
  }
  type Headers = js.Dictionary[String]
  type MultiValueHeaders = js.Dictionary[String]
  type StageVariables = js.Dictionary[String]
  type PathParameters = js.Dictionary[String]
  type QueryStringParameters = js.Dictionary[String]
  type MultiValueQueryStringParameters = js.Dictionary[js.Array[String]]
}

object CustomAuthorizerResult {
  @deprecated("Use APIGatewayAuthorizerResult", "0.7.0")
  def apply(
      principalId: String,
      policyDocument: PolicyDocument,
      context: js.UndefOr[AuthResponseContext] = js.undefined,
      usageIdentifierKey: js.UndefOr[String] = js.undefined
  ): CustomAuthorizerResult = {
    val _obj$ = js.Dynamic.literal(
      "principalId" -> principalId.asInstanceOf[js.Any],
      "policyDocument" -> policyDocument.asInstanceOf[js.Any]
    )
    context.foreach(_v =>
      _obj$.updateDynamic("context")(_v.asInstanceOf[js.Any])
    )
    usageIdentifierKey.foreach(_v =>
      _obj$.updateDynamic("usageIdentifierKey")(_v.asInstanceOf[js.Any])
    )
    _obj$.asInstanceOf[CustomAuthorizerResult]
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
