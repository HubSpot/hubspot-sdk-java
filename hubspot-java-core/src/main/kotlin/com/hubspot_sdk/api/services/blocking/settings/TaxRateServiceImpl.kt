// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.settings

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
import com.hubspot_sdk.api.models.settings.taxrates.CollectionResponsePublicTaxRateGroupForwardPaging
import com.hubspot_sdk.api.models.settings.taxrates.PublicTaxRateGroup
import com.hubspot_sdk.api.models.settings.taxrates.TaxRateGetParams
import com.hubspot_sdk.api.models.settings.taxrates.TaxRateListPage
import com.hubspot_sdk.api.models.settings.taxrates.TaxRateListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TaxRateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TaxRateService {

    private val withRawResponse: TaxRateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TaxRateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaxRateService =
        TaxRateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: TaxRateListParams, requestOptions: RequestOptions): TaxRateListPage =
        // get /tax-rates/v1/tax-rates
        withRawResponse().list(params, requestOptions).parse()

    override fun get(params: TaxRateGetParams, requestOptions: RequestOptions): PublicTaxRateGroup =
        // get /tax-rates/v1/tax-rates/{taxRateGroupId}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TaxRateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TaxRateService.WithRawResponse =
            TaxRateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponsePublicTaxRateGroupForwardPaging> =
            jsonHandler<CollectionResponsePublicTaxRateGroupForwardPaging>(clientOptions.jsonMapper)

        override fun list(
            params: TaxRateListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TaxRateListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tax-rates", "v1", "tax-rates")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        TaxRateListPage.builder()
                            .service(TaxRateServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getHandler: Handler<PublicTaxRateGroup> =
            jsonHandler<PublicTaxRateGroup>(clientOptions.jsonMapper)

        override fun get(
            params: TaxRateGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicTaxRateGroup> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("taxRateGroupId", params.taxRateGroupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tax-rates", "v1", "tax-rates", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
