enablePlugins(ScalaJSPlugin)

lazy val scala213 = "2.13.8"
lazy val scala3 = "3.1.3"
crossScalaVersions := Seq(scala213, scala3)
scalaVersion := scala213
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

libraryDependencies ++= Seq(
  "net.exoego" %%% "scalajs-dynamodb-shared" % "0.0.1"
)
