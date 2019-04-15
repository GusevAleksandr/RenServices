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

case class ContractRcrContractAS (
  /* Код услуги */
  code: Option[String] = None,
  /* Наименование услуги */
  name: Option[String] = None,
  /* ГУИД документа */
  guidDoc: Option[String] = None,
  /* Периоды действия услуг */
  rcrContractASP: Option[Seq[ContractRcrContractASP]] = None
) extends ApiModel


