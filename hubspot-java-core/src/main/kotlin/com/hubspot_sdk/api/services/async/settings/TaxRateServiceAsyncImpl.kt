// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.settings

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
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.settings.taxrates.CollectionResponsePublicTaxRateGroupForwardPaging
import com.hubspot_sdk.api.models.settings.taxrates.PublicTaxRateGroup
import com.hubspot_sdk.api.models.settings.taxrates.TaxRateGetParams
import com.hubspot_sdk.api.models.settings.taxrates.TaxRateListPageAsync
import com.hubspot_sdk.api.models.settings.taxrates.TaxRateListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TaxRateServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TaxRateServiceAsync {

    private val withRawResponse: TaxRateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TaxRateServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaxRateServiceAsync =
        TaxRateServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: TaxRateListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TaxRateListPageAsync> =
        // get /tax-rates/2026-03/tax-rates
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: TaxRateGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicTaxRateGroup> =
        // get /tax-rates/2026-03/tax-rates/{taxRateGroupId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TaxRateServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TaxRateServiceAsync.WithRawResponse =
            TaxRateServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponsePublicTaxRateGroupForwardPaging> =
            jsonHandler<CollectionResponsePublicTaxRateGroupForwardPaging>(clientOptions.jsonMapper)

        override fun list(
            params: TaxRateListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TaxRateListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tax-rates", "2026-03", "tax-rates")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                TaxRateListPageAsync.builder()
                                    .service(TaxRateServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val getHandler: Handler<PublicTaxRateGroup> =
            jsonHandler<PublicTaxRateGroup>(clientOptions.jsonMapper)

        override fun get(
            params: TaxRateGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicTaxRateGroup>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("taxRateGroupId", params.taxRateGroupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tax-rates", "2026-03", "tax-rates", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
