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

case class ContractAgentSchemeRCRContractT13 (
  /* ПВ Группа продуктов */
  irNameKP: Option[String] = None,
  /* ПВ Без страховки */
  irOutInsurance: Option[Double] = None,
  /* ПВ Страховка 1 */
  irInsurance1: Option[Double] = None,
  /* ПВ Страховка 2 */
  irInsurance2: Option[Double] = None
) extends ApiModel

