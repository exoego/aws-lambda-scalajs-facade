enablePlugins(ScalaJSPlugin)

lazy val scala213 = "2.13.6"
lazy val scala212 = "2.12.15"
crossScalaVersions in ThisBuild := Seq(scala213, scala212)
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
  "net.exoego" %%% "scalajs-types-util" % "0.3.0" % Provided,
  "net.exoego" %%% "aws-sdk-scalajs-facade-dynamodb" % awsSdkScalajsFacadeVersion
)

Compile / scalacOptions ++= {
  CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2, n)) if n >= 13 => "-Ymacro-annotations" :: Nil
    case _                       => Nil
  }
}

libraryDependencies ++= {
  CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2, n)) if n >= 13 => Nil
    case _ =>
      compilerPlugin(
        "org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full
      ) :: Nil
  }
}
