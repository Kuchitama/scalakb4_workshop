name := """scalakb4_workshop"""

version := "1.0"

scalaVersion := "2.11.1"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.1.6" % "test",
  "com.github.scala-incubator.io" %% "scala-io-core" % "0.4.3-1",
  "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.3-1",
  "com.github.scopt" %% "scopt" % "3.2.0"
)

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.3"

