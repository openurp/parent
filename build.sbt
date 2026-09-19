import BuildSettings.*
import sbt.*

version := "0.12.7"
description := "OpenURP Parent"
organization := "org.openurp"
homepage := Some(uri("https://github.com/openurp/parent"))
scmInfo := Some(
  ScmInfo(
    uri("https://github.com/openurp/parent"),
    "scm:git@github.com:openurp/parent.git"
  )
)

developers := List(
  Developer(
    id = "duantihua",
    name = "Duan Tihua",
    email = "duantihua@163.com",
    url = uri("https://github.com/duantihua")
  )
)

lazy val root = (project in file("."))
  .enablePlugins(SbtPlugin)
  .settings(
    name := "sbt-openurp-parent",
    commonSettings
  )
