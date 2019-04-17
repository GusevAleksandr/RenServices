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

import io.swagger.client.model.DocListRequest
import io.swagger.client.model.Partner
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object PartnerListApi {

  /**
   * получение списка документов ранее переданными параметрами фильтрации. Параметры фильтрации передавались post-запросом на /services/rest-api/list/partner
   * 
   * Expected answers:
   *   code 200 : Seq[Partner] (массив доступных пользователю документов. Если в post-запросе, сохранившем запрос на выборку, заданы поля, необходимые для загрузки, или флаг onlyHeaderFields не выставлен в значение false возвращается массив объектов в виде пар ключ&#x3D;значение. Если параметр onlyHeaderFields выставлен в значение false, возвращается полное JSON представление документа)
   *   code 400 :  (bad input parameter)
   *   code 401 :  (Unauthorized)
   *   code 404 :  (запрос с переданным идентификатором не найден)
   *   code 500 :  (Internal Server Error)
   * 
   * Available security schemes:
   *   Bearer (apiKey)
   * 
   * @param id идентификатор сохраненных параметров запроса не сервере приложений, возвращенных ранее при вызове метода post
   * @param page номер требуемой страницы. Нумерация начинается с 1. Если параметр не задан, используется значение по умолчанию, равное 1.
   * @param pageSize количество элементов на странице. Если не задан - используется значение по умолчанию, равное 20.
   */
  def getPartnerList(id: String, page: Option[Int] = None, pageSize: Option[Int] = None)(implicit apiKey: ApiKeyValue): ApiRequest[Seq[Partner]] =
    ApiRequest[Seq[Partner]](ApiMethods.GET, "https://virtserver.swaggerhub.com/renessansBankService/restServices/1.0.0", "/services/rest-api/list/partner/{id}", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withQueryParam("page", page)
      .withQueryParam("pageSize", pageSize)
      .withPathParam("id", id)
      .withSuccessResponse[Seq[Partner]](200)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](401)
      .withErrorResponse[Unit](404)
      .withErrorResponse[Unit](500)
        /**
   * сохраниение параметров запроса на сервере приложений, для последующего использования в get запросе
   * 
   * Expected answers:
   *   code 200 : String (в качестве ответа возвращается уникальный идентификатор запроса по переданным параметрам, который в последствии должен быть передан через запрос get)
   *   code 400 :  (bad input parameter)
   *   code 401 :  (Unauthorized)
   *   code 500 :  (Internal Server Error)
   * 
   * Available security schemes:
   *   Bearer (apiKey)
   * 
   * @param postBody параметры запроса
   */
  def postPartnersList(postBody: DocListRequest)(implicit apiKey: ApiKeyValue): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://virtserver.swaggerhub.com/renessansBankService/restServices/1.0.0", "/services/rest-api/list/partner", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withBody(postBody)
      .withSuccessResponse[String](200)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](401)
      .withErrorResponse[Unit](500)
      

}

