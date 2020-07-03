# aws-lambda-scalajs-facade

A set of type definition and utility to implement AWS Lambda functions.

This is NOT a type definition for AWS Lambda API in aws-sdk-js.
It can be found in [aws-sdk-scalajs-facade](https://github.com/exoego/aws-sdk-scalajs-facade/tree/master/services/lambda/src/main/scala/facade/amazonaws/services).

[exoego/scala-js-nodejs](https://github.com/exoego/scala-js-nodejs) offers type definition and utilities for Node.js API.


## Support matrix

|            |   ScalaJS 0.6.28+  |   ScalaJS 1.x      |
| ---------- | :------------------| :----------------: |
| Scala 2.13 | :heavy_check_mark: | :heavy_check_mark: |
| Scala 2.12 | :heavy_check_mark: | :heavy_check_mark: |
| Scala 2.11 |         N/A        |       N/A          |
| Scala 2.10 |         N/A        |       N/A          |

-   :heavy_check_mark: Supported
-   :construction: Not supported but planned


## How to use

Add dependency in `build.sbt`.

```sbt
// For Node.js v12
libraryDependencies += "net.exoego" %%% "aws-lambda-scalajs-facade" % "0.9.0"
```

Import and code.

```scala
import scala.scalajs.js
import net.exoego.facade.aws_lambda._

object MyFirstLambda extends APIGatewayProxyHandler {
  @js.annotation.JSName("apply")
  override def apply(event: APIGatewayProxyEvent, context: Context, callback: Callback[APIGatewayProxyResult]): Unit = ???
}

object MyFirstAsyncLambda extends AsyncAPIGatewayProxyHandler {
  @js.annotation.JSName("apply")
  override def apply(event: APIGatewayProxyEvent, context: Context): js.Promise[APIGatewayProxyResult]  = ???
}
```

Below is available list of pre-defined handler traits:

* ALBHandler
* APIGatewayProxyHandler
* APIGatewayProxyHandlerV2
* APIGatewayRequestAuthorizerHandler
* APIGatewayRequestAuthorizerWithContextHandler
* APIGatewayTokenAuthorizerHandler
* APIGatewayTokenAuthorizerWithContextHandler
* CloudFormationCustomResourceHandler
* CloudFrontRequestHandler
* CloudFrontResponseHandler
* CloudWatchLogsHandler
* CodePipelineCloudWatchActionHandler
* CodePipelineCloudWatchHandler
* CodePipelineCloudWatchPipelineHandler
* CodePipelineCloudWatchStageHandler
* CodePipelineHandler
* CognitoUserPoolTriggerHandler
* CustomAuthorizerHandler
* DynamoDBStreamHandler
* EventBridgeHandler
* FirehoseTransformationHandler
* KinesisStreamHandler
* LexHandler
* ProxyHandler (alias of APIGatewayProxyHandler)
* S3BatchHandler
* S3Handler
* SNSHandler
* SQSHandler
* ScheduledHandler

Each has `Async~` variant that returns `js.Promise` instead of accepting callback.

## Note

This facade leverages [`@Factory` marcro](https://github.com/exoego/scalajs-types-util#factory-macro) to create highly-optimized factory method without boilerplate.

## License

* Apache License version 2.0
* Basically generated from https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/types/aws-lambda/index.d.ts which is under MIT License
