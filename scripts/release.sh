#!/usr/bin/env bash

export SCALAJS_VERSION="0.6.32"
sbt show scalaVersion
unset SCALAJS_VERSION
sbt show scalaVersion
