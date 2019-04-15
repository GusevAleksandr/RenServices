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

case class PartnerListRewardSchemes (
  /* Ручная оплата */
  manualPayment: Option[Boolean] = None,
  /* Схема экспортирована в ДВХ */
  exportDWH: Option[Boolean] = None,
  /* Проценты вознаграждений */
  rewardPercent: Option[Seq[PartnerRewardPercent]] = None,
  /* Границы вознаграждений */
  rewardScope: Option[Seq[PartnerRewardScope]] = None,
  /* Границы вознаграждений дополнительное вознаграждение */
  additionalRewardScope: Option[Seq[PartnerAdditionalRewardScope]] = None,
  /* Категории ТТ */
  ttCategories: Option[Seq[PartnerTtCategories]] = None,
  /* Дополнительные услуги */
  additionalServices: Option[Seq[PartnerAdditionalServices]] = None,
  /* СВ ГУИД схемы */
  svGuid: Option[String] = None,
  /* СВ Версия бизнес-объекта */
  svVersionBO: Option[Int] = None,
  /* СВ Алгорим расчета Наименование */
  svacName: Option[String] = None,
  /* СВ Алгорим расчета Код */
  svacCode: Option[Int] = None,
  /* СВ Дата подключения */
  svDateOn: Option[Double] = None,
  /* СВ Дата отключения */
  svDateOff: Option[Double] = None,
  /* СВ Начало отчетного периода */
  svPeriodOn: Option[Int] = None,
  /* СВ Окончание отчетного периода */
  svPeriodOff: Option[Int] = None,
  /* СВ Длительность отчетного периода */
  svPeriodRange: Option[Int] = None,
  /* СВ Учитывать НДС */
  svFlagNDS: Option[Boolean] = None,
  /* СВ Учитывать страховку */
  svFlagInsurance: Option[Boolean] = None,
  /* СВ Сумма за реализацию сервис пакетов Комфорт Лайт */
  svAmountSP: Option[Double] = None,
  /* СВ Гарантированное вознаграждение */
  svGuaranAmount: Option[Double] = None,
  /* СВ Владелец строки */
  svStateLine: Option[String] = None,
  /* СВ Начало отчетного периода */
  thsvPeriodOn: Option[String] = None,
  /* СВ Окончание отчетного периода */
  thsvPeriodOff: Option[String] = None,
  /* СВ Длительность отчетного периода */
  thsvPeriodRange: Option[String] = None,
  /* СВ Сумма за реализацию сервис пакетов Комфорт Лайт */
  thsvAmountSP: Option[String] = None,
  /* Ручная оплата. Комментарий */
  mpComment: Option[String] = None
) extends ApiModel

