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

case class TradingPointInteractionSchemeTTMode (
  /* Отображаемое значение */
  name: Option[String] = None,
  /* Техническое поле */
  enumType: Option[String] = None,
  /* Отображаемое значение */
  description: Option[String] = None,
  /* Lit1 - online, lit2 - offline. Возможные значения: \"Lit1\", \"lit2\" */
  value: Option[String] = None
) extends ApiModel


