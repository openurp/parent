# sbt-openurp-parent

Shared sbt plugin for OpenURP projects. It provides common build settings and a curated set of Beangle / third-party dependency versions.

## Requirements

- sbt 2.x (plugin built with sbt 2.0+)
- Scala 3.3.x / JVM 21 (defaults from `Settings.common`)

## Install

In `project/plugin.sbt`:

```scala
addSbtPlugin("org.openurp" % "sbt-openurp-parent" % "0.12.0")
```

## Usage

In `build.sbt`:

```scala
import org.openurp.parent.Dependencies.*
import org.openurp.parent.Settings.*

lazy val root = (project in file("."))
  .settings(
    common,
    libraryDependencies ++= Seq(beangle_commons, beangle_ems_app)
  )
```

### What you get

| API | Description |
| --- | --- |
| `Settings.common` | Organization, license, Scala/Java options, publish settings, version policy |
| `Settings.stubJavadoc` | Placeholder `-javadoc.jar` for Maven Central (no full Scaladoc) |
| `Dependencies.*` | Versioned Beangle and common library coordinates |

## Build & publish

```bash
sbt compile
sbt publishLocal
sbt publish
```

Snapshots publish to Central Snapshots; releases use Sonatype Central staging (`localStaging`).

## License

[LGPL-3.0](LICENSE)

## Links

- Homepage: https://github.com/openurp/parent
- Docs: https://openurp.github.io/
