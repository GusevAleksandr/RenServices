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
package io.swagger.client.api

import io.swagger.client.model.PartnerEmployee
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object PartnerEmployeeListSimpleApi {

  /**
   * получение списка документов переданного типа с поддержкой простой фильтрации и сортировки. Возможно указание необходимых полей загрузки
   * 
   * Expected answers:
   *   code 200 : Seq[PartnerEmployee] (массив доступных пользователю документов. Если заданы поля, необходимые для загрузки, или флаг onlyHeaderFields не выставлен в значение false возвращается массив объектов в виде пар ключ&#x3D;значение. Если параметр onlyHeaderFields выставлен в значение false, возвращается полное JSON представление документа)
   *   code 400 :  (bad input parameter)
   *   code 401 :  (Unauthorized)
   *   code 500 :  (Internal Server Error)
   * 
   * Available security schemes:
   *   Bearer (apiKey)
   * 
   * @param filter дополнительные условия фильтрации в формате простых запросов. Используются логические выражения (&#x3D;, !&#x3D;, &gt;, &gt;&#x3D;, &lt;, &lt;&#x3D;), операции коньюнкции (AND), коньюнкции (OR), отрицания (NOT) ключевые слова like
   * @param fields список возвращаемых полей. Если параметр не задан, и установлен флаг onlyHeaderFields, выгружаются только заголовочные поля, без вложенных таблиц.
   * @param onlyHeaderFields флаг, указывающий необходимость загрузки только заголовочных полей документа. Является необязательным, значение по умолчанию - true.
   * @param ordersAsc список полей для сортировки по возрастанию
   * @param ordersDesc список полей для сортировки по убыванию
   * @param page номер требуемой страницы. Нумерация начинается с 1. Если параметр не задан, используется значение по умолчанию, равное 1.
   * @param pageSize количество элементов на странице. Если не задан - используется значиние по умолчанию, равное 20.
   */
  def simplePartnerEmployeesList(filter: Option[String] = None, fields: Seq[String], onlyHeaderFields: Option[Boolean] = None, ordersAsc: Seq[String], ordersDesc: Seq[String], page: Option[Int] = None, pageSize: Option[Int] = None)(implicit apiKey: ApiKeyValue): ApiRequest[Seq[PartnerEmployee]] =
    ApiRequest[Seq[PartnerEmployee]](ApiMethods.GET, "https://virtserver.swaggerhub.com/renessansBankService/restServices/1.0.0", "/rest-api/simple/list/partnerEmployee", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withQueryParam("filter", filter)
      .withQueryParam("fields", ArrayValues(fields, MULTI))
      .withQueryParam("onlyHeaderFields", onlyHeaderFields)
      .withQueryParam("ordersAsc", ArrayValues(ordersAsc, MULTI))
      .withQueryParam("ordersDesc", ArrayValues(ordersDesc, MULTI))
      .withQueryParam("page", page)
      .withQueryParam("pageSize", pageSize)
      .withSuccessResponse[Seq[PartnerEmployee]](200)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](401)
      .withErrorResponse[Unit](500)
      

}

