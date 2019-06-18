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

import io.swagger.client.model.LoanProducts
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object LoanProductApi {

  /**
   * получение одного Кредитного продукта по гуиду
   * 
   * Expected answers:
   *   code 200 : LoanProducts (найденный документ)
   *   code 400 :  (bad input parameter)
   *   code 401 :  (Unauthorized)
   *   code 404 :  (партнер не найден)
   *   code 500 :  (Internal Server Error)
   * 
   * Available security schemes:
   *   Bearer (apiKey)
   * 
   * @param id гуид партнера
   */
  def loanProductGet(id: String)(implicit apiKey: ApiKeyValue): ApiRequest[LoanProducts] =
    ApiRequest[LoanProducts](ApiMethods.GET, "https://virtserver.swaggerhub.com/renessansBankService/restServices/1.0.0", "/services/rest-api/loanProducts/{id}", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withPathParam("id", id)
      .withSuccessResponse[LoanProducts](200)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](401)
      .withErrorResponse[Unit](404)
      .withErrorResponse[Unit](500)
      

}

