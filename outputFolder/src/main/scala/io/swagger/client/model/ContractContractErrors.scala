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

case class ContractContractErrors (
  /* Тип ошибки */
  errorType: Option[String] = None,
  /* Описание */
  errorDescription: Option[String] = None,
  /* Автор */
  errorAuthor: Option[String] = None,
  /* Дата */
  errorDate: Option[Double] = None,
  /* СтатусОшибки */
  errorState: Option[String] = None
) extends ApiModel


