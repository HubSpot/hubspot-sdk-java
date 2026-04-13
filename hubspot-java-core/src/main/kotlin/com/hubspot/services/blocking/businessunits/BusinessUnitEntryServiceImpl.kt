// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.businessunits

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.handlers.jsonHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.core.http.parseable
import com.hubspot.core.prepare
import com.hubspot.models.businessunits.CollectionResponsePublicBusinessUnitNoPaging
import com.hubspot.models.businessunits.businessunitentries.BusinessUnitEntryGetByUserIdParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BusinessUnitEntryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BusinessUnitEntryService {

    private val withRawResponse: BusinessUnitEntryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BusinessUnitEntryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusinessUnitEntryService =
        BusinessUnitEntryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getByUserId(
        params: BusinessUnitEntryGetByUserIdParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePublicBusinessUnitNoPaging =
        // get /business-units/public/2026-03/business-units/user/{userId}
        withRawResponse().getByUserId(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BusinessUnitEntryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BusinessUnitEntryService.WithRawResponse =
            BusinessUnitEntryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getByUserIdHandler: Handler<CollectionResponsePublicBusinessUnitNoPaging> =
            jsonHandler<CollectionResponsePublicBusinessUnitNoPaging>(clientOptions.jsonMapper)

        override fun getByUserId(
            params: BusinessUnitEntryGetByUserIdParams,
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
