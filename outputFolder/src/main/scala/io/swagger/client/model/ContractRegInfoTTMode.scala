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

case class ContractRegInfoTTMode (
  content: Option[String] = None,
  /* Код ТТ */
  code: Option[String] = None,
  /* Lit1 - online, lit2 - offline */
  value: Option[ContractRegInfoTTModeEnums.Value] = None
) extends ApiModel

object ContractRegInfoTTModeEnums {

  type Value = Value.Value
  object Value extends Enumeration {
    val Lit1 = Value("Lit1")
    val Lit2 = Value("lit2")
  }

}
