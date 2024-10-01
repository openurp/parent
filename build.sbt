import BuildSettings._
import sbt._

ThisBuild / version := "0.8.36-SNAPSHOT"
ThisBuild / description := "OpenURP Parent"
ThisBuild / organization := "org.openurp"
ThisBuild / homepage := Some(url("https://github.com/openurp/parent"))
ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/openurp/parent"),
    "scm:git@github.com:openurp/parent.git"
  )
)

ThisBuild / developers := List(
  Developer(
    id = "duantihua",
    name = "Duan Tihua",
    email = "duantihua@163.com",
    url = url("https://github.com/duantihua")
  )
)

lazy val root = (project in file("."))
  .enablePlugins(SbtPlugin)
  .settings(
    name := "sbt-openurp-parent",
    commonSettings
  )
