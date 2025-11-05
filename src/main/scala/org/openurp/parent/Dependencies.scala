/*
 * Copyright © 2005, The Beangle Software.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.openurp.parent

import sbt.*

object Dependencies {
  val beangle_commons = "org.beangle.commons" % "beangle-commons" % "5.6.32"

  val beangle_jdbc = "org.beangle.jdbc" % "beangle-jdbc" % "1.1.3"
  val beangle_model = "org.beangle.data" % "beangle-model" % "5.11.0"
  val beangle_cdi = "org.beangle.cdi" % "beangle-cdi" % "0.8.0"

  val beangle_cache = "org.beangle.cache" % "beangle-cache" % "0.1.16"
  val beangle_template = "org.beangle.template" % "beangle-template" % "0.2.0"

  val beangle_web = "org.beangle.web" % "beangle-web" % "0.7.0"
  val beangle_webmvc = "org.beangle.webmvc" % "beangle-webmvc" % "0.12.0"
  val beangle_bui_bootstrap = "org.beangle.bui" % "beangle-bui-bootstrap" % "0.1.0"
  val beangle_serializer = "org.beangle.serializer" % "beangle-serializer" % "0.1.21"

  val beangle_security = "org.beangle.security" % "beangle-security" % "4.4.2"
  val beangle_ids = "org.beangle.ids" % "beangle-ids" % "0.4.2"

  val beangle_event = "org.beangle.event" % "beangle-event" % "0.1.2"

  val beangle_ems_app = "org.beangle.ems" % "beangle-ems-app" % "4.13.0"
  val beangle_doc_pdf = "org.beangle.doc" % "beangle-doc-pdf" % "0.4.18"
  val beangle_doc_docx = "org.beangle.doc" % "beangle-doc-docx" % "0.4.18"
  val beangle_doc_excel = "org.beangle.doc" % "beangle-doc-excel" % "0.4.18"
  val beangle_doc_transfer = "org.beangle.doc" % "beangle-doc-transfer" % "0.4.18"
  val beangle_doc_html = "org.beangle.doc" % "beangle-doc-html" % "0.4.18"

  val beangle_notify = "org.beangle.notify" % "beangle-notify" % "0.1.15"

  var freemarker = "org.freemarker" % "freemarker" % "2.3.34"
  val spring_beans = "org.springframework" % "spring-beans" % "6.2.12"
  val spring_context = "org.springframework" % "spring-context" % "6.2.12"
  val spring_tx = "org.springframework" % "spring-tx" % "6.2.12"
  val spring_aop = "org.springframework" % "spring-aop" % "6.2.12"
  val spring_jdbc = "org.springframework" % "spring-jdbc" % "6.2.12"
  val protobuf = "com.google.protobuf" % "protobuf-java" % "4.33.0"

  val scalatest = "org.scalatest" %% "scalatest" % "3.2.19" % "test"
  val servletapi = "jakarta.servlet" % "jakarta.servlet-api" % "6.1.0"
  val caffeine = "com.github.ben-manes.caffeine" % "caffeine" % "3.2.3"
  val caffeine_jcache = "com.github.ben-manes.caffeine" % "jcache" % "3.2.3" exclude("org.osgi", "org.osgi.service.component.annotations") exclude("javax.inject", "javax.inject")
  val hibernate_core = "org.beangle.hibernate" % "beangle-hibernate-core" % "7.2.0.CR1"
  val hibernate_jcache = "org.hibernate.orm" % "hibernate-jcache" % "7.2.0.CR1" exclude("org.hibernate.orm", "hibernate-core")
  val logback_classic = "ch.qos.logback" % "logback-classic" % "1.5.20"
  val logback_core = "ch.qos.logback" % "logback-core" % "1.5.20"
}
