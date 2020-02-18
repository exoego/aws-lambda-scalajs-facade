package net.exoego.facade.aws_lambda.apigateway

import net.exoego.facade.aws_lambda.{AsyncHandler, Handler}

import scala.scalajs.js
import scala.scalajs.js.|

package object authorizer {
  type AuthResponse = CustomAuthorizerResult
  type CustomAuthorizerHandler =
    Handler[CustomAuthorizerEvent, CustomAuthorizerResult]
  type AsyncCustomAuthorizerHandler =
    AsyncHandler[CustomAuthorizerEvent, CustomAuthorizerResult]
  type Condition = js.Dictionary[String | js.Array[String]]
  type ConditionBlock = js.Dictionary[Condition | js.Array[Condition]]
  type Statement =
    BaseStatement with StatementAction with StatementResource | StatementPrincipal
  type StatementAction = js.Any
  type StatementPrincipal = MaybeStatementResource
  type StatementResource = MaybeStatementPrincipal
  type PrincipalValue =
    js.Dictionary[String | js.Array[String]] | String | js.Array[String]

}
