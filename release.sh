#! /bin/bash

cat ./version.sbt

export SCALAJS_VERSION=0.6.32
sbt clean +publishSigned sonatypeBundleUpload sonatypeReleaseAll
unsert SCALAJS_VERSION
sbt clean +publishSigned sonatypeBundleUpload sonatypeReleaseAll
