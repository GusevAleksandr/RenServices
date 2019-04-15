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

case class TradingPointAgreementRole (
  content: Option[String] = None,
  code: Option[String] = None,
  /* Manager - правляющий Сектора, Coordinator - Центральный офис, WithoutAgree - Согласование не требуется */
  value: Option[TradingPointAgreementRoleEnums.Value] = None
) extends ApiModel

object TradingPointAgreementRoleEnums {

  type Value = Value.Value
  object Value extends Enumeration {
    val Manager = Value("Manager")
    val Coordinator = Value("Coordinator")
    val WithoutAgree = Value("WithoutAgree")
  }

}

