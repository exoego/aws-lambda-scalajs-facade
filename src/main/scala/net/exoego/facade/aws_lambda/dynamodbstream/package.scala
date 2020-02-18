package net.exoego.facade.aws_lambda

package object dynamodbstream {
  type AttributeValue = facade.amazonaws.services.dynamodb.AttributeValue
  type DynamoDBStreamHandler = Handler[DynamoDBStreamEvent, Unit]
  type AsyncDynamoDBStreamHandler = AsyncHandler[DynamoDBStreamEvent, Unit]
}
