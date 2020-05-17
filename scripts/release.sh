#!/usr/bin/env bash

cat ./version.sbt
export SCALAJS_VERSION="0.6.33"
sbt clean +publishSigned sonatypeBundleRelease
unset SCALAJS_VERSION
sbt clean +publishSigned sonatypeBundleRelease
