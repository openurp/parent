import sbt.Keys.*
import sbt.*
import xerial.sbt.Sonatype.autoImport.*
import xerial.sbt.Sonatype.sonatypeCentralHost

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
    sonatypeProfileName    := "org.openurp",
    sonatypeCredentialHost := sonatypeCentralHost,
    sbtPluginPublishLegacyMavenStyle := false,
    publishTo := sonatypePublishToBundle.value,
    addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.12.2"),
    addSbtPlugin("org.beangle.build" % "sbt-beangle-build" % "0.0.16"),
    addSbtPlugin("org.beangle.tools" % "sbt-beangle-tools" % "0.0.21"),
    addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.2.1")
  )
}
