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

case class RewardRewCategorOutlets (
  /* Ссылка на запись справочника */
  linkRefBook: Option[String] = None,
  /* Наименование */
  name: Option[String] = None,
  /* Код */
  code: Option[String] = None,
  /* Итоговые суммы */
  groupSum: Option[Seq[RewardGroupSum]] = None,
  /* Детальные сведения о выданных Банком кредитах */
  credits: Option[Seq[RewardCredits]] = None,
  /* Агрегированные реквизиты кредитов */
  creditsAggrReq: Option[Seq[RewardCreditsAggrReq]] = None,
  /* Итоговые суммы дополнительных услуг */
  groupSumAS: Option[Seq[RewardGroupSumAS]] = None
) extends ApiModel

