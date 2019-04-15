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

case class ContractPartiesAgreed (
  content: Option[String] = None,
  code: Option[String] = None,
  /* lit1 - дополнить Договор Приложением № 2 и изложить его в редакции Приложения № 1 к настоящему Дополнительному соглашению, lit2 - изменить Приложение № 2 к Договору и изложить его в редакции Приложения № 1 к настоящему Дополнительному соглашению */
  value: Option[ContractPartiesAgreedEnums.Value] = None
) extends ApiModel

object ContractPartiesAgreedEnums {

  type Value = Value.Value
  object Value extends Enumeration {
    val Lit1 = Value("lit1")
    val Lit2 = Value("lit2")
  }

}

