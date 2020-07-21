enablePlugins(ScalaJSPlugin)

name := "aws-lambda-scalajs-facade"
organization := "net.exoego"
scalacOptions ++= Seq("-P:scalajs:sjsDefinedByDefault").filter { _ =>
  Option(System.getenv("SCALAJS_VERSION")).exists(_.startsWith("0.6."))
}
scalaJSLinkerConfig ~= (_.withModuleKind(ModuleKind.CommonJSModule))
scalacOptions --= Seq(
  // false positive on js.native
  "-Wdead-code",
  "-Wunused:params",
  "-Wunused:explicits",
  "-Ywarn-dead-code",
  "-Ywarn-unused:params"
)

val awsSdkScalajsFacadeVersion = "[0.29.0-v2.624.0,1.0)"
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
