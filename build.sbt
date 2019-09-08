import org.apache.logging.log4j.core.config.DefaultConfiguration

lazy val commonSettings = sbt.Defaults.itSettings ++ Seq(
  name := "mower",
  organization := "com.mowitnow.mower",
  scalaVersion := "2.13.0"
)

lazy val mower = project.in(file("."))
  .settings(
    name := "mower",
  ).aggregate(mowerApp)


lazy val mowerApp = project.in(file("app"))
  .settings(commonSettings: _*)
  .settings(
    libraryDependencies ++= Seq(
      "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"
    )
  )

name := "mower"
version := "0.1"
scalaVersion := "2.13.0"