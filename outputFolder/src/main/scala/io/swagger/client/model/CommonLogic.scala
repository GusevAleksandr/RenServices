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

case class CommonLogic (
  /* условие равенства (==) */
  eq: Option[LeftRightCLSchema] = None,
  /* условие больше или равно (>=) */
  ge: Option[LeftRightCLSchema] = None,
  /* условие строго больше (>) */
  gt: Option[LeftRightCLSchema] = None,
  /* условие меньше или равно (<=) */
  le: Option[LeftRightCLSchema] = None,
  /* условие строго меньше (<) */
  lt: Option[LeftRightCLSchema] = None,
  between: Option[CommonLogicBetween] = None
) extends ApiModel


