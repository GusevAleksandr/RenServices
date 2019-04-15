/**
 * rest сервисы ренессанс
 * rest сервисы ренессанс
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class RewardRewAgentDocs (
  /* Тип документа */
  docType: Option[String] = None,
  /* Описание */
  descript: Option[String] = None,
  /* Файл */
  attachment: Option[String] = None,
  /* Признак актуальности */
  isActive: Option[Boolean] = None,
  /* Дата представления */
  uploadDate: Option[Double] = None,
  /* Дата поступления */
  receiptDate: Option[Double] = None,
  /* Дата отправки в архив */
  archivDate: Option[Double] = None,
  /* Флаг удаления */
  docsDelFlag: Option[String] = None,
  /* ссылка на вложение */
  attachlink: Option[String] = None,
  /* МимеТип */
  mimetype: Option[String] = None
) extends ApiModel


