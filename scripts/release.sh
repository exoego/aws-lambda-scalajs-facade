#!/usr/bin/env bash

cat ./version.sbt
unset SCALAJS_VERSION
sbt clean +publishSigned sonatypeBundleRelease
