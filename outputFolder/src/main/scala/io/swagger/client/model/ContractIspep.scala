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

case class ContractIspep (
  content: Option[String] = None,
  code: Option[String] = None,
  /* Yes - ПЭП, No - Бумажный, Nothing - Не определено */
  value: Option[ContractIspepEnums.Value] = None
) extends ApiModel

object ContractIspepEnums {

  type Value = Value.Value
  object Value extends Enumeration {
    val Yes = Value("Yes")
    val No = Value("No")
    val Nothing = Value("Nothing")
  }

}
