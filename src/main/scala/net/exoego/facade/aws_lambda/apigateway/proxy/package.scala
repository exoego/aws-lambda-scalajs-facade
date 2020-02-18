package net.exoego.facade.aws_lambda.apigateway

import net.exoego.facade.aws_lambda.{AsyncHandler, Handler}

package object proxy {
  type APIGatewayProxyHandler =
    Handler[APIGatewayProxyEvent, APIGatewayProxyResult]
  type AsyncAPIGatewayProxyHandler =
    AsyncHandler[APIGatewayProxyEvent, APIGatewayProxyResult]
}
