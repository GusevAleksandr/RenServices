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

case class TradingPointTtkamhistoryt (
  /* Закрепленный КАМ */
  fiofixedkam: Option[String] = None,
  /* Гуид закрепленного КАМ */
  guidfixedkam: Option[String] = None,
  /* Дата закрепления КАМ */
  dateOn: Option[Double] = None,
  /* Дата открепления КАМ */
  dateOff: Option[Double] = None,
  /* Дата изменения */
  dateChanges: Option[Double] = None,
  /* Автор изменения */
  authorChanges: Option[String] = None,
  /* Тип сотрудника */
  typeempl: Option[String] = None
) extends ApiModel


