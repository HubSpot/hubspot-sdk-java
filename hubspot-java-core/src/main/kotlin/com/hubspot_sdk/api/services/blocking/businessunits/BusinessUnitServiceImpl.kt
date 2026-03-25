// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.businessunits

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.errorBodyHandler
import com.hubspot_sdk.api.core.handlers.errorHandler
import com.hubspot_sdk.api.core.handlers.jsonHandler
import com.hubspot_sdk.api.core.http.HttpMethod
import com.hubspot_sdk.api.core.http.HttpRequest
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponse.Handler
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.businessunits.CollectionResponsePublicBusinessUnitNoPaging
import com.hubspot_sdk.api.models.businessunits.businessunits.BusinessUnitGetByUserIdParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BusinessUnitServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BusinessUnitService {

    private val withRawResponse: BusinessUnitService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BusinessUnitService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusinessUnitService =
        BusinessUnitServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getByUserId(
        params: BusinessUnitGetByUserIdParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePublicBusinessUnitNoPaging =
        // get /business-units/public/2026-03/business-units/user/{userId}
        withRawResponse().getByUserId(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BusinessUnitService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BusinessUnitService.WithRawResponse =
            BusinessUnitServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getByUserIdHandler: Handler<CollectionResponsePublicBusinessUnitNoPaging> =
            jsonHandler<CollectionResponsePublicBusinessUnitNoPaging>(clientOptions.jsonMapper)

        override fun getByUserId(
            params: BusinessUnitGetByUserIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "business-units",
                        "public",
                        "2026-03",
                        "business-units",
                        "user",
                        params._pathParam(0),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getByUserIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
