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

case class DocListRequest (
  filter: Option[CommonLogic] = None,
  additionalFilter: Option[DocListRequestAdditionalFilter] = None,
  fields: Option[Seq[String]] = None,
  orders: Option[Seq[OrderElement]] = None,
  /* флаг, указывающий необходимость загрузки только заголовочных полей документа. Под заголовочными понимаются поля первого уровня, не являющиеся таблицами (множественные элементы). Является необязательным, значение по умолчанию - true. */
  onlyHeaderFields: Option[Boolean] = None,
  /* количество элементов на странице. Если не задан - используется значиние по умолчанию, равное 20. */
  pageSize: Option[Int] = None
) extends ApiModel


