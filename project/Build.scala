import sbt.*
import sbt.Keys.*

object BuildSettings {

  /** 与 org.openurp.parent.Settings.stubJavadoc 相同，供本插件工程自身 build 使用。 */
  private val stubJavadocSettings = Seq(
    Compile / doc / sources := Nil,
    Compile / packageDoc := {
      val out = (Compile / packageDoc / artifactPath).value
      val dir = (Compile / target).value / "stub-javadoc"
      IO.createDirectory(dir)
      val docUrl = homepage.value.map(_.toString).getOrElse("https://openurp.github.io/")
      IO.write(
        dir / "README.md",
        s"""# No bundled API documentation
           |
           |Documentation: $docUrl
           |Source code: `-sources.jar`
           |""".stripMargin
      )
      val manifest = new java.util.jar.Manifest()
      manifest.getMainAttributes.put(java.util.jar.Attributes.Name.MANIFEST_VERSION, "1.0")
      val mappings = (dir ** "*").get pair Path.rebase(dir, "")
      IO.jar(mappings, out, manifest, Some(0L))
      out
    }
  )

  val commonSettings = stubJavadocSettings ++ Seq(
    organizationName := "The OpenURP Software",
    startYear := Some(2014),
    licenses += ("GNU General Public License version 3", url("http://www.gnu.org/licenses/lgpl-3.0.txt")),
    crossPaths := false,

    publishMavenStyle := true,
    publishConfiguration := publishConfiguration.value.withOverwrite(true),
    publishM2Configuration := publishM2Configuration.value.withOverwrite(true),
    publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true),

    versionScheme := Some("early-semver"),
    pomIncludeRepository := { _ => false }, // Remove all additional repository other than Maven Central from POM
    sbtPluginPublishLegacyMavenStyle := false,
    publishTo := localStaging.value,
    credentials += Credentials(Path.userHome / ".sbt" / "sonatype_central_credentials"),

    addSbtPlugin("org.beangle.build" % "sbt-beangle-build" % "0.0.21"),
    addSbtPlugin("org.beangle.tools" % "sbt-beangle-tools" % "0.0.27"),
    addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.2.1"),
    addSbtPlugin("ch.epfl.scala" % "sbt-version-policy" % "3.2.1"),
    addDependencyTreePlugin
  )
}
