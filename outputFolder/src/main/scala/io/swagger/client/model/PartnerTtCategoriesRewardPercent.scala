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

case class PartnerTtCategoriesRewardPercent (
  /* ПВТ ФПН */
  ttlfpn: Option[String] = None,
  /* ПВТ ГУИД КП */
  ttlGuidDoc: Option[String] = None,
  /* ПВТ Код продукта */
  ttlCode: Option[String] = None,
  /* ПВТ Наименование КП */
  ttlNameKP: Option[String] = None,
  /* ПВТ Без страховки */
  ttlOutInsurance: Option[Double] = None,
  /* ПВТ Страховка 1 */
  ttlInsurance1: Option[Double] = None,
  /* ПВТ Страховка 2 */
  ttlInsurance2: Option[Double] = None
) extends ApiModel


