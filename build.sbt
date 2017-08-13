name := """inspector-gadget"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "org.scalatest"           %% "scalatest"    % "3.0.1"  % Test,
  "org.scalacheck"          %% "scalacheck"   % "1.13.5" % Test,
  "org.seleniumhq.selenium" % "selenium-java" % "3.4.0"  % Test
)

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture"
)

// verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))

wartremoverErrors in (Compile, compile) ++= Warts.unsafe

scalafmtOnCompile := true
