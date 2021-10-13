import sbt.Keys._
import sbt._

object BuildSettings {

  val commonSettings = Seq(
    organizationName := "The Beangle Software",
    startYear := Some(2005),
    licenses += ("GNU General Public License version 3", new URL("http://www.gnu.org/licenses/lgpl-3.0.txt")),
    crossPaths := false,

    publishMavenStyle := true,
    publishConfiguration := publishConfiguration.value.withOverwrite(true),
    publishM2Configuration := publishM2Configuration.value.withOverwrite(true),
    publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true),

    versionScheme := Some("early-semver"),
    pomIncludeRepository := { _ => false }, // Remove all additional repository other than Maven Central from POM
    publishTo := {
      val nexus = "https://oss.sonatype.org/"
      Some("releases" at nexus + "service/local/staging/deploy/maven2")
    },
    credentials += Credentials(Path.userHome / ".sbt" / "sonatype_credentials")
  )
}
