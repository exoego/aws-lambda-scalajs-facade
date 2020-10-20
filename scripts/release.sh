#!/usr/bin/env bash

cat ./version.sbt
sbt clean +publishSigned sonatypeBundleRelease
