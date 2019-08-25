enablePlugins(ScalaJSPlugin)

name := "aws-lambda-scalajs-facade"
organization := "net.exoego"
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
// false positive on js.native
scalacOptions --= Seq(
  "-Wdead-code",
  "-Wunused:params",
  "-Ywarn-dead-code",
  "-Ywarn-unused:params"
)
