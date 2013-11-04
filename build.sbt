import AssemblyKeys._

organization := "net.joshdevins"

name := "sbt-template"

scalaVersion := "2.10.2"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-optimise")

// main dependencies
// none yet, but will need a few eventually

// test dependencies
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)

// release plugin
releaseSettings

// assembly plugin
seq(assemblySettings: _*)

jarName in assembly := "sbt-template.jar"

mainClass in assembly := None

test in assembly := {}

// dependency graph plugin
net.virtualvoid.sbt.graph.Plugin.graphSettings
