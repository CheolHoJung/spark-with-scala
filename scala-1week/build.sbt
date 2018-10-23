name := "scala-1week"

version := "0.1"

scalaVersion := "2.11.8"

resolvers ++= Seq(
  "maven" at "http://central.maven.org/maven2/"
)

val sparkVersion = "2.3.2"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"
libraryDependencies += "org.apache.spark" % "spark-core_2.11" % sparkVersion