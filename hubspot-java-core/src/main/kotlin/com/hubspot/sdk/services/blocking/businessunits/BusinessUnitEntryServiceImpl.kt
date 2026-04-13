// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.businessunits

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.handlers.errorBodyHandler
import com.hubspot.sdk.core.handlers.errorHandler
import com.hubspot.sdk.core.handlers.jsonHandler
import com.hubspot.sdk.core.http.HttpMethod
import com.hubspot.sdk.core.http.HttpRequest
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponse.Handler
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.businessunits.CollectionResponsePublicBusinessUnitNoPaging
import com.hubspot.sdk.models.businessunits.businessunitentries.BusinessUnitEntryGetByUserIdParams
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
