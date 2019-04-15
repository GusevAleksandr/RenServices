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

case class TradingPointTtCreditProduct (
  /* ГУИД документа */
  productGUID: Option[String] = None,
  /* ФПН */
  fpn: Option[String] = None,
  /* Кредитные продукты */
  product: Option[String] = None,
  /* Дата запуска */
  dateOn: Option[Double] = None,
  /* Дата отключения */
  dateOff: Option[Double] = None,
  /* Код продукта */
  code: Option[String] = None,
  agreementRole: Option[TradingPointAgreementRole] = None,
  /* ТТ Скидка */
  ttDiscount: Option[Double] = None
) extends ApiModel

