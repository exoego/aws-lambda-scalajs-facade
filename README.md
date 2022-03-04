# aws-lambda-scalajs-facade

A set of type definition and utility to implement AWS Lambda functions.

This is NOT a type definition for AWS Lambda API in aws-sdk-js.
It can be found in [aws-sdk-scalajs-facade](https://github.com/exoego/aws-sdk-scalajs-facade/tree/master/services/lambda/src/main/scala/facade/amazonaws/services).

[exoego/scala-js-nodejs](https://github.com/exoego/scala-js-nodejs) offers type definition and utilities for Node.js API.


## Support matrix

|            |   ScalaJS 0.6.28+                    |              ScalaJS 1.x              |
| ---------- | :------------------------------------|:-------------------------------------:|
| Scala 2.13 | :heavy_check_mark: (0.9.0 was final) |          :heavy_check_mark:           |
| Scala 2.12 | :heavy_check_mark: (0.9.0 was final) | :heavy_check_mark: (0.11.0 was final) |
| Scala 2.11 |         N/A                          |                  N/A                  |
| Scala 2.10 |         N/A                          |                  N/A                  |

-   :heavy_check_mark: Supported
-   :construction: Not supported but planned


## How to use

Add dependency in `build.sbt`.

```sbt
libraryDependencies += "net.exoego" %%% "aws-lambda-scalajs-facade" % "0.12.1"
```

Import and code.

```scala
import scala.concurrent.{ExecutionContext, Future}
import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.annotation._
import net.exoego.facade.aws_lambda._

object Main {
  @JSExportTopLevel("handler")
  val handler: AsyncAPIGatewayProxyHandler = (event, context) => {
    val json = js.JSON.stringify(event)
    js.Dynamic.global.console.log(json)

    implicit val ec = ExecutionContext.global
    handle(event).toJSPromise
  }

  private def handle(event: APIGatewayProxyEvent)(implicit ec: ExecutionContext): Future[APIGatewayProxyResult] = Future {
    APIGatewayProxyResult(
      statusCode = 200,
      body = "hello " + event.body,
      headers = js.defined(js.Dictionary("Content-Type" -> "text/plain"))
    )
  }
}
```

Some of pre-defined handler traits:

* APIGatewayProxyHandlerV2
* AppSyncResolverHandler
* DynamoDBStreamHandler
* S3Handler
* SNSHandler

Each has `Async~` variant that returns `js.Promise` instead of accepting callback.

## License

* Apache License version 2.0
* Basically generated from https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/types/aws-lambda/index.d.ts which is under MIT License
