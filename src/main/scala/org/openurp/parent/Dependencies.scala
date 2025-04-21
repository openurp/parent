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
  val beangle_commons_ver = "5.6.27"
  val beangle_jdbc_ver = "1.0.10"
  val beangle_data_ver = "5.8.22"
  val beangle_cdi_ver = "0.7.2"
  val beangle_web_ver = "0.6.3"
  val beangle_serializer_ver = "0.1.16"
  val beangle_cache_ver = "0.1.13"
  val beangle_template_ver = "0.1.25"
  val beangle_webmvc_ver = "0.10.5"
  val beangle_buiVer = "0.0.4"
  val beangle_security_ver = "4.3.27"
  val beangle_ids_ver = "0.3.23"
  val beangle_event_ver = "0.0.12"
  val beangle_doc_ver = "0.4.11"
  val beangle_notify_ver = "0.1.12"
  val beangle_ems_ver = "4.11.1"

  val beangle_commons = "org.beangle.commons" % "beangle-commons" % beangle_commons_ver

  val beangle_jdbc = "org.beangle.jdbc" % "beangle-jdbc" % beangle_jdbc_ver
  val beangle_model = "org.beangle.data" % "beangle-model" % beangle_data_ver
  val beangle_cdi = "org.beangle.cdi" % "beangle-cdi" % beangle_cdi_ver

  val beangle_cache = "org.beangle.cache" % "beangle-cache" % beangle_cache_ver
  val beangle_template = "org.beangle.template" % "beangle-template" % beangle_template_ver

  val beangle_web = "org.beangle.web" % "beangle-web" % beangle_web_ver
  val beangle_webmvc = "org.beangle.webmvc" % "beangle-webmvc" % beangle_webmvc_ver
  val beangle_bui_bootstrap = "org.beangle.bui" % "beangle-bui-bootstrap" % beangle_buiVer
  val beangle_serializer = "org.beangle.serializer" % "beangle-serializer" % beangle_serializer_ver

  val beangle_security = "org.beangle.security" % "beangle-security" % beangle_security_ver
  val beangle_ids = "org.beangle.ids" % "beangle-ids" % beangle_ids_ver

  val beangle_event = "org.beangle.event" % "beangle-event" % beangle_event_ver

  val beangle_ems_app = "org.beangle.ems" % "beangle-ems-app" % beangle_ems_ver
  val beangle_doc_pdf = "org.beangle.doc" % "beangle-doc-pdf" % beangle_doc_ver
  val beangle_doc_docx = "org.beangle.doc" % "beangle-doc-docx" % beangle_doc_ver
  val beangle_doc_excel = "org.beangle.doc" % "beangle-doc-excel" % beangle_doc_ver
  val beangle_doc_transfer = "org.beangle.doc" % "beangle-doc-transfer" % beangle_doc_ver

  val beangle_notify = "org.beangle.notify" % "beangle-notify" % beangle_notify_ver

  var freemarker = "org.freemarker" % "freemarker" % "2.3.34"
  val spring_beans = "org.springframework" % "spring-beans" % "6.2.2"
  val spring_context = "org.springframework" % "spring-context" % "6.2.2"
  val spring_tx = "org.springframework" % "spring-tx" % "6.2.2"
  val spring_aop = "org.springframework" % "spring-aop" % "6.2.2"
  val spring_jdbc = "org.springframework" % "spring-jdbc" % "6.2.2"
  val protobuf = "com.google.protobuf" % "protobuf-java" % "4.29.3"

  val scalatest = "org.scalatest" %% "scalatest" % "3.2.19" % "test"
  val servletapi = "jakarta.servlet" % "jakarta.servlet-api" % "6.1.0"
  val caffeine = "com.github.ben-manes.caffeine" % "caffeine" % "3.2.0"
  val caffeine_jcache = "com.github.ben-manes.caffeine" % "jcache" % "3.2.0" exclude("org.osgi", "org.osgi.service.component.annotations") exclude("javax.inject", "javax.inject")
  val hibernate_core = "org.beangle.hibernate" % "beangle-hibernate-core" % "6.6.5.Final"
  val hibernate_jcache = "org.hibernate.orm" % "hibernate-jcache" % "6.6.5.Final" exclude("org.hibernate.orm", "hibernate-core")
  val logback_classic = "ch.qos.logback" % "logback-classic" % "1.5.16"
  val logback_core = "ch.qos.logback" % "logback-core" % "1.5.16"
}
