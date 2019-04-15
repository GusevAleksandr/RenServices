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

case class TradingPointAddInfoReceiveCanal (
  content: Option[String] = None,
  code: Option[String] = None,
  /* phone - телефон, email - e-mail, courier - курьер */
  value: Option[TradingPointAddInfoReceiveCanalEnums.Value] = None
) extends ApiModel

object TradingPointAddInfoReceiveCanalEnums {

  type Value = Value.Value
  object Value extends Enumeration {
    val Phone = Value("phone")
    val Email = Value("email")
    val Courier = Value("courier")
  }

}
