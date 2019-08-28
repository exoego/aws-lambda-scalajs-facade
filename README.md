# aws-lambda-scalajs-facade

A set of type definition and utility to implement AWS Lambda functions.

This is NOT a type definition for AWS Lambda API in aws-sdk-js.
It can be found in [aws-sdk-scalajs-facade](https://github.com/exoego/aws-sdk-scalajs-facade/tree/master/services/lambda/src/main/scala/facade/amazonaws/services).


## Support matrix

|            |   ScalaJS 0.6.28+              |   ScalaJS 1.x  |
| ---------- | :----------------------------: | :------------: |
| Scala 2.13 | :heavy_check_mark: from 0.22.0 | :construction: |
| Scala 2.12 | :heavy_check_mark:             | :construction: |
| Scala 2.11 |         N/A                    |       N/A      |
| Scala 2.10 |         N/A                    |       N/A      |

-   :heavy_check_mark: Supported
-   :construction: Not supported but planned


## How to use

Add dependency in `build.sbt`.

```sbt
libraryDependencies += "net.exoego" %%% "aws-lambda-scalajs-facade" % "0.2.0"
```

Import and code.

```scala

import net.exoego.facade.aws_lambda._

object MyFirstLambda extends APIGatewayProxyHandler {
  override def apply(arg1: APIGatewayEvent, arg2: Context, arg3: Callback[ProxyResult]): Unit | Promise[APIGatewayProxyResult]
    = ???
}
```


## License

* Apache License version 2.0
* Basically generated from https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/types/aws-lambda/index.d.ts which is under MIT License
