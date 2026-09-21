# Changelog

All notable changes to this project are documented in this file.

## [0.13.0] - 2026-09-21

### Changed

- Default `scalaVersion` for consumer projects: 3.3.8 → 3.9.0 (LTS)
- Require JDK 25+: `scalacOptions` now `-Xtarget:25`, `javacOptions` now `--release 25`
- Add `-Xcheck-macros` to `scalacOptions` (macro hygiene check)
- Upgrade sbt to 2.0.9
- Upgrade `sbt-beangle-build` to 0.1.10, `sbt-pgp` to 2.3.2
- Bump Beangle dependencies: commons 6.3.7, jdbc 1.1.21, data 5.12.16, cdi 0.10.8, cache 0.1.24, template 0.2.14, web 0.7.12, webmvc 0.15.6, bui 0.9.6, serializer 0.1.30, security 4.5.5, ids 0.4.23, event 0.1.12, config 1.1.12, doc 0.5.15, transfer 0.0.10, notify 0.1.28, she 0.0.19, cron 0.0.8
- Upgrade hibernate-core / hibernate-jcache to 7.4.9.Final

## [0.12.0] - 2026-09-14

### Changed

- Upgrade sbt to 2.0.8
- Upgrade `sbt-beangle-build` to 0.1.7
- Bump Beangle dependencies: commons 6.3.3, jdbc 1.1.16, data 5.12.9, cdi 0.10.7, cache 0.1.22, template 0.2.12, web 0.7.10, webmvc 0.15.3, bui 0.9.4, serializer 0.1.28, security 4.5.2, ids 0.4.21, event 0.1.11, config 1.1.11, ems 4.20.13, doc 0.5.13, transfer 0.0.8, notify 0.1.27, she 0.0.18, cron 0.0.7
- Upgrade hibernate-core to 7.4.7.Final, freemarker to 2.3.35, protobuf to 4.36.1, logback to 1.6.3

### Removed

- Drop the `sbt-beangle-tools` plugin dependency; its plugins and downloader now ship with `sbt-beangle-build` 0.1.x

## [0.11.3] - 2026-08-11

### Changed

- Update ems to 4.20.5

## [0.11.2] - 2026-08-07

### Changed

- Upgrade sbt to 2.0.6
- Upgrade `sbt-beangle-build` to 0.1.3 and `sbt-beangle-tools` to 0.1.1
- Bump Beangle dependencies: commons 6.2.2, jdbc 1.1.12, data 5.12.7, webmvc 0.15.1, bui 0.9.0, ids 0.4.20, ems 4.20.3, she 0.0.17
- Upgrade hibernate-core to 7.4.5.Final, hibernate-jcache to 8.0.0.Beta1
- Upgrade logback to 1.6.1

## [0.11.1] - 2026-08-03

### Changed

- Upgrade `sbt-beangle-build` to 0.1.2
- Bump Beangle dependencies: jdbc 1.1.10, bui 0.8.5, ems 4.20.2

## [0.11.0] - 2026-07-27

### Changed

- Migrate plugin build to sbt 2.0.4
- Adapt settings for sbt 2 (`Def.uncached`, `fileConverter`, license API)
- Upgrade companion plugins: `sbt-beangle-build` 0.1.x, `sbt-pgp` 2.3.1, `sbt-version-policy` 3.3.0
- Publish SNAPSHOT builds to Central Snapshots repository

### Breaking

- Requires sbt 2.x; sbt 1.x consumers should stay on the 0.10.x line

## [0.10.54] - 2026-07-22

### Changed

- Update security / ids / ems / notify dependency versions

## [0.10.53] - 2026-07-13

### Changed

- Update ems to 4.19.8

## [0.10.52] - 2026-07-13

### Changed

- Bump webmvc, bui, ids, ems, doc, she, and logback versions

## Earlier

See git history for 0.10.51 and older releases.

[Unreleased]: https://github.com/openurp/parent/compare/v0.12.0...HEAD
[0.12.0]: https://github.com/openurp/parent/compare/v0.11.3...v0.12.0
[0.11.3]: https://github.com/openurp/parent/compare/v0.11.2...v0.11.3
[0.11.2]: https://github.com/openurp/parent/compare/v0.11.1...v0.11.2
[0.11.1]: https://github.com/openurp/parent/compare/v0.11.0...v0.11.1
[0.11.0]: https://github.com/openurp/parent/compare/v0.10.54...v0.11.0
[0.10.54]: https://github.com/openurp/parent/compare/v0.10.53...v0.10.54
[0.10.53]: https://github.com/openurp/parent/compare/v0.10.52...v0.10.53
[0.10.52]: https://github.com/openurp/parent/releases/tag/v0.10.52
