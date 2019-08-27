import sbt._
import Keys._
import org.scalajs.sbtplugin.ScalaJSPlugin._
import sbtrelease.ReleasePlugin.autoImport._
import sbtrelease.ReleaseStateTransformations._
import autoImport._
import com.typesafe.sbt.pgp.PgpKeys

licenses := Seq("APL2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))
scmInfo := Some(
  ScmInfo(
    url("https://github.com/exoego/aws-lambda-scalajs-facade"),
    "scm:git:git@github.com:exoego/aws-lambda-scalajs-facade.git"
  )
)
homepage := scmInfo.value.map(_.browseUrl)
developers := List(
  Developer(
    id = "exoego",
    name = "TATSUNO Yasuhiro",
    email = "ytatsuno.jp@gmail.com",
    url = url("https://www.exoego.net")
  )
)
publishTo in ThisBuild := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)
publishMavenStyle := true
publishArtifact in Test := false
publishArtifact in (Compile, packageDoc) := false
publishArtifact in (Compile, packageSrc) := true
pomIncludeRepository := { _ =>
  false
}
publishConfiguration := publishConfiguration.value.withOverwrite(true)
publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true)
releaseCrossBuild := true
releasePublishArtifactsAction := PgpKeys.publishSigned.value
releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runClean,
  runTest,
  setReleaseVersion,
  commitReleaseVersion,
  tagRelease,
  releaseStepCommandAndRemaining("+publishSigned"),
  releaseStepCommand("sonatypeReleaseAll"),
  setNextVersion,
  commitNextVersion
)
skip in packageJSDependencies := false
