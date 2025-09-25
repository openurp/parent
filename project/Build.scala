import sbt.*
import sbt.Keys.*

object BuildSettings {

  val commonSettings = Seq(
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

    addSbtPlugin("org.beangle.build" % "sbt-beangle-build" % "0.0.18"),
    addSbtPlugin("org.beangle.tools" % "sbt-beangle-tools" % "0.0.23"),
    addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.2.1"),
    addSbtPlugin("ch.epfl.scala" % "sbt-version-policy" % "3.2.1"),
    addDependencyTreePlugin
  )
}
