/**
 * rest сервисы ренессанс
 * rest сервисы ренессансsdsdd
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

case class PartnerListErrors (
  /* Статус */
  errorState: Option[String] = None,
  /* Тип ошибки */
  errorType: Option[String] = None,
  /* Описание */
  errorDescription: Option[String] = None,
  /* Автор */
  errorAuthor: Option[String] = None,
  /* Дата */
  errorDate: Option[Double] = None,
  /* Флаг удаления */
  errorDelFlag: Option[String] = None
) extends ApiModel


