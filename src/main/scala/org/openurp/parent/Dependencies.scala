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
  val beangle_commons_ver = "5.6.2"
  val beangle_data_ver = "5.7.3"
  val beangle_cdi_ver = "0.5.5"
  val beangle_web_ver = "0.4.6"
  val beangle_serializer_ver= "0.1.5"
  val beangle_cache_ver= "0.1.5"
  val beangle_template_ver ="0.1.7"
  val beangle_webmvc_ver="0.9.10"
  val beangle_security_ver="4.3.13"
  val beangle_ids_ver="0.3.12"
  val beangle_doc_ver="0.1.7"
  val beangle_ems_ver="4.7.2"

  val beangle_commons_core = "org.beangle.commons" %% "beangle-commons-core" % beangle_commons_ver
  val beangle_commons_file = "org.beangle.commons" %% "beangle-commons-file" % beangle_commons_ver
  val beangle_commons_text = "org.beangle.commons" %% "beangle-commons-text" % beangle_commons_ver

  val beangle_data_jdbc = "org.beangle.data" %% "beangle-data-jdbc" % beangle_data_ver
  val beangle_data_orm = "org.beangle.data" %% "beangle-data-orm" % beangle_data_ver
  val beangle_data_transfer = "org.beangle.data" %% "beangle-data-transfer" % beangle_data_ver
  val beangle_data_excel = "org.beangle.data" %% "beangle-data-excel" % beangle_data_ver

  val beangle_cdi_api = "org.beangle.cdi" %% "beangle-cdi-api" % beangle_cdi_ver
  val beangle_cdi_spring = "org.beangle.cdi" %% "beangle-cdi-spring" % beangle_cdi_ver

  val beangle_cache_api = "org.beangle.cache" %% "beangle-cache-api" % beangle_cache_ver
  val beangle_cache_caffeine = "org.beangle.cache" %% "beangle-cache-caffeine" % beangle_cache_ver

  val beangle_template_api = "org.beangle.template" %% "beangle-template-api" % beangle_template_ver
  val beangle_template_freemarker = "org.beangle.template" %% "beangle-template-freemarker" % beangle_template_ver

  val beangle_web_action = "org.beangle.web" %% "beangle-web-action" % beangle_web_ver
  val beangle_webmvc_core= "org.beangle.webmvc" %% "beangle-webmvc-core" % beangle_webmvc_ver
  val beangle_webmvc_view= "org.beangle.webmvc" %% "beangle-webmvc-view" % beangle_webmvc_ver
  val beangle_webmvc_support= "org.beangle.webmvc" %% "beangle-webmvc-support" % beangle_webmvc_ver

  val beangle_serializer_text = "org.beangle.serializer" %% "beangle-serializer-text" % beangle_serializer_ver
  val beangle_serializer_protobuf = "org.beangle.serializer" %% "beangle-serializer-protobuf" % beangle_serializer_ver

  val beangle_security_core= "org.beangle.security" %% "beangle-security-core" % beangle_security_ver
  val beangle_security_web= "org.beangle.security" %% "beangle-security-web" % beangle_security_ver
  val beangle_security_session= "org.beangle.security" %% "beangle-security-session" % beangle_security_ver
  val beangle_security_cas= "org.beangle.security" %% "beangle-security-cas" % beangle_security_ver

  val beangle_ids_cas = "org.beangle.ids" %% "beangle-ids-cas" % beangle_ids_ver

  val beangle_ems_web = "org.beangle.ems" %% "beangle-ems-web" % beangle_ems_ver
  val beangle_ems_app = "org.beangle.ems" %% "beangle-ems-app" % beangle_ems_ver
  val beangle_ems_service = "org.beangle.ems" %% "beangle-ems-service" % beangle_ems_ver

  val beangle_doc_pdf = "org.beangle.doc" %% "beangle-doc-pdf" % beangle_doc_ver
  val beangle_doc_docx = "org.beangle.doc" %% "beangle-doc-docx" % beangle_doc_ver

  val scalatest = "org.scalatest" %% "scalatest" % "3.2.16" % "test"
  val caffeine = "com.github.ben-manes.caffeine" % "caffeine" % "3.1.8"
  val servletapi = "jakarta.servlet" % "jakarta.servlet-api" % "6.0.0"
  val hibernate_jcache = "org.hibernate.orm" % "hibernate-jcache" % "6.2.9.Final" exclude("org.hibernate.orm", "hibernate-core")
  val caffeine_jcache = "com.github.ben-manes.caffeine" % "jcache" % "3.1.8" exclude("org.osgi", "org.osgi.service.component.annotations") exclude("javax.inject", "javax.inject")
  val hibernate_core = "org.beangle.hibernate" % "beangle-hibernate-core" % "6.2.9.Final"
  val gson ="com.google.code.gson" % "gson" % "2.10.1"
  val logback_classic = "ch.qos.logback" % "logback-classic" % "1.4.11"
  val logback_core = "ch.qos.logback" % "logback-core" % "1.4.11"

}
