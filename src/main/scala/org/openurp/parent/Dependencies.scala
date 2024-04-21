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

import sbt._

object Dependencies {
  val beangle_commons_ver = "5.6.16"
  val beangle_jdbc_ver = "1.0.1"
  val beangle_data_ver = "5.8.10"
  val beangle_cdi_ver = "0.6.6"
  val beangle_web_ver = "0.4.12"
  val beangle_serializer_ver= "0.1.10"
  val beangle_cache_ver= "0.1.9"
  val beangle_template_ver ="0.1.15"
  val beangle_webmvc_ver="0.9.27"
  val beangle_security_ver="4.3.20"
  val beangle_ids_ver="0.3.17"
  val beangle_event_ver="0.0.5"
  val beangle_doc_ver="0.3.4"
  val beangle_ems_ver="4.9.0"

  val beangle_commons = "org.beangle.commons" % "beangle-commons" % beangle_commons_ver

  val beangle_jdbc = "org.beangle.jdbc" % "beangle-jdbc" % beangle_jdbc_ver
  val beangle_model = "org.beangle.data" % "beangle-model" % beangle_data_ver
  val beangle_cdi = "org.beangle.cdi" % "beangle-cdi" % beangle_cdi_ver

  val beangle_cache = "org.beangle.cache" % "beangle-cache" % beangle_cache_ver
  val beangle_template = "org.beangle.template" % "beangle-template" % beangle_template_ver

  val beangle_web = "org.beangle.web" % "beangle-web" % beangle_web_ver
  val beangle_webmvc = "org.beangle.webmvc" % "beangle-webmvc" % beangle_webmvc_ver
  val beangle_serializer = "org.beangle.serializer" % "beangle-serializer" % beangle_serializer_ver

  val beangle_security = "org.beangle.security" % "beangle-security" % beangle_security_ver
  val beangle_ids = "org.beangle.ids" % "beangle-ids" % beangle_ids_ver

  val beangle_event = "org.beangle.event" % "beangle-event" % beangle_event_ver

  val beangle_ems_app = "org.beangle.ems" % "beangle-ems-app" % beangle_ems_ver
  val beangle_doc_pdf = "org.beangle.doc" % "beangle-doc-pdf" % beangle_doc_ver
  val beangle_doc_docx = "org.beangle.doc" % "beangle-doc-docx" % beangle_doc_ver
  val beangle_doc_excel = "org.beangle.doc" % "beangle-doc-excel" % beangle_doc_ver
  val beangle_doc_transfer = "org.beangle.doc" % "beangle-doc-transfer" % beangle_doc_ver

  var freemarker = "org.freemarker" % "freemarker" % "2.3.32"
  val spring_beans = "org.springframework" % "spring-beans" % "6.1.6"
  val spring_context = "org.springframework" % "spring-context" % "6.1.6"
  val spring_tx = "org.springframework" % "spring-tx" % "6.1.6"
  val spring_aop = "org.springframework" % "spring-aop" % "6.1.6"
  val spring_jdbc = "org.springframework" % "spring-jdbc" % "6.1.6"
  val protobuf = "com.google.protobuf" % "protobuf-java" % "3.25.3"

  val scalatest = "org.scalatest" %% "scalatest" % "3.2.18" % "test"
  val servletapi = "jakarta.servlet" % "jakarta.servlet-api" % "6.0.0"
  val caffeine = "com.github.ben-manes.caffeine" % "caffeine" % "3.1.8"
  val caffeine_jcache = "com.github.ben-manes.caffeine" % "jcache" % "3.1.8" exclude("org.osgi", "org.osgi.service.component.annotations") exclude("javax.inject", "javax.inject")
  val hibernate_core = "org.beangle.hibernate" % "beangle-hibernate-core" % "6.4.4.Final"
  val hibernate_jcache = "org.hibernate.orm" % "hibernate-jcache" % "6.4.4.Final" exclude("org.hibernate.orm", "hibernate-core")
  val gson ="com.google.code.gson" % "gson" % "2.10.1"
  val logback_classic = "ch.qos.logback" % "logback-classic" % "1.5.6"
  val logback_core = "ch.qos.logback" % "logback-core" % "1.5.6"
}
