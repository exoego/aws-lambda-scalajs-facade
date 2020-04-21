enablePlugins(ScalaJSPlugin)

name := "aws-lambda-scalajs-facade"
organization := "net.exoego"
scalacOptions ++= Seq("-P:scalajs:sjsDefinedByDefault").filter { _ =>
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("1.0.1").startsWith("0.6.")
}
// false positive on js.native
scalacOptions --= Seq(
  "-Wdead-code",
  "-Wunused:params",
  "-Ywarn-dead-code",
  "-Ywarn-unused:params"
)

val awsSdkScalajsFacadeVersion = "[0.29.0-v2.624.0,1.0)"
libraryDependencies ++= Seq(
  "net.exoego" %%% "aws-sdk-scalajs-facade-dynamodb" % awsSdkScalajsFacadeVersion
)
