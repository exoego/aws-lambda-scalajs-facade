enablePlugins(ScalaJSPlugin)

lazy val scala213 = "2.13.8"
lazy val scala3 = "3.1.0"
crossScalaVersions in ThisBuild := Seq(scala213, scala3)
scalaVersion in ThisBuild := scala213
name := "aws-lambda-scalajs-facade"
organization := "net.exoego"
scalaJSLinkerConfig ~= (_.withModuleKind(ModuleKind.CommonJSModule))
scalacOptions --= Seq(
  // false positive on js.native
  "-Wdead-code",
  "-Wunused:params",
  "-Wunused:explicits",
  "-Ywarn-dead-code",
  "-Ywarn-unused:params"
)

val awsSdkScalajsFacadeVersion = "0.33.0-v2.892.0"
libraryDependencies ++= Seq(
  "net.exoego" %%% "aws-sdk-scalajs-facade-dynamodb" % awsSdkScalajsFacadeVersion cross CrossVersion.for3Use2_13
)
