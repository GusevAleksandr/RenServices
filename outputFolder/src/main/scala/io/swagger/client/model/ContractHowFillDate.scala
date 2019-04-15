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

case class ContractHowFillDate (
  content: Option[String] = None,
  /* Код */
  code: Option[String] = None,
  /* Undefined - Не определено, Fixed - дата введенная пользователем будет использована в качестве даты вступления в силу договора/ДС, DateSign - дата подписи партнера будет использована в качестве даты вступления в силу договора/ДС */
  value: Option[ContractHowFillDateEnums.Value] = None
) extends ApiModel

object ContractHowFillDateEnums {

  type Value = Value.Value
  object Value extends Enumeration {
    val Undefined = Value("Undefined")
    val Fixed = Value("Fixed")
    val DateSign = Value("DateSign")
  }

}

