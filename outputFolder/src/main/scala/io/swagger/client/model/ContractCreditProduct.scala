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

case class ContractCreditProduct (
  /* ГУИД записи справочника Кредитные продукты */
  guidcp: Option[String] = None,
  /* Название кредитного продукта */
  nameCP: Option[String] = None,
  /* Первоначальный взнос, % */
  downPayments: Option[String] = None,
  /* Скидка предприятия торговли  от первоначальной цены */
  discount: Option[Double] = None,
  /* Возможный срок, мес.: от */
  loanTermMin: Option[Int] = None,
  /* Возможный срок, мес.: до */
  loanTermMax: Option[Int] = None,
  /* Минимальная сумма кредита, руб. */
  limitMin: Option[Double] = None,
  /* Максимальная сумма кредита, руб. */
  limitMax: Option[Double] = None,
  /* ФПН */
  fpn: Option[String] = None,
  /* Код продукта */
  code: Option[String] = None
) extends ApiModel

