package net.exoego.facade.aws_lambda

import scala.scalajs.js

package object cognitouserpool {
  type CognitoUserPoolEvent = CognitoUserPoolTriggerEvent
  type CognitoUserPoolTriggerHandler =
    Handler[CognitoUserPoolTriggerEvent, js.Any]
  type AsyncCognitoUserPoolTriggerHandler =
    AsyncHandler[CognitoUserPoolTriggerEvent, js.Any]
}
