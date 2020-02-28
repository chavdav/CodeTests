#!/bin/bash
set -m

BASEDIR=$(dirname $0)
OUTPUT=${BASEDIR}/out/production/SignalPathCodeTests

scalac ${BASEDIR}/src/SpecialMath.scala -d ${OUTPUT}

scala -classpath ${OUTPUT} SpecialMath 90
