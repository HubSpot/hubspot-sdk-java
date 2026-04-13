// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.settings.currencies

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
import com.hubspot.core.handlers.emptyHandler
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.handlers.jsonHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.core.http.json
import com.hubspot.core.http.parseable
import com.hubspot.core.prepareAsync
import com.hubspot.models.settings.currencies.CollectionResponseExchangeRateForwardPaging
import com.hubspot.models.settings.currencies.CollectionResponseExchangeRateNoPaging
import com.hubspot.models.settings.currencies.ExchangeRate
import com.hubspot.models.settings.currencies.exchangerates.ExchangeRateCreateExchangeRateParams
import com.hubspot.models.settings.currencies.exchangerates.ExchangeRateGetExchangeRateByIdParams
import com.hubspot.models.settings.currencies.exchangerates.ExchangeRateListCurrentExchangeRatesParams
import com.hubspot.models.settings.currencies.exchangerates.ExchangeRateListExchangeRatesPageAsync
import com.hubspot.models.settings.currencies.exchangerates.ExchangeRateListExchangeRatesParams
import com.hubspot.models.settings.currencies.exchangerates.ExchangeRateUpdateExchangeRateParams
import com.hubspot.models.settings.currencies.exchangerates.ExchangeRateUpdateVisibilityParams
import com.hubspot.services.async.settings.currencies.exchangerates.BatchServiceAsync
import com.hubspot.services.async.settings.currencies.exchangerates.BatchServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExchangeRateServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ExchangeRateServiceAsync {

    private val withRawResponse: ExchangeRateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ExchangeRateServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExchangeRateServiceAsync =
        ExchangeRateServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchServiceAsync = batch

    override fun createExchangeRate(
        params: ExchangeRateCreateExchangeRateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExchangeRate> =
        // post /settings/currencies/2026-03/exchange-rates
        withRawResponse().createExchangeRate(params, requestOptions).thenApply { it.parse() }

    override fun getExchangeRateById(
        params: ExchangeRateGetExchangeRateByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExchangeRate> =
        // get /settings/currencies/2026-03/exchange-rates/{exchangeRateId}
        withRawResponse().getExchangeRateById(params, requestOptions).thenApply { it.parse() }

    override fun listCurrentExchangeRates(
        params: ExchangeRateListCurrentExchangeRatesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseExchangeRateNoPaging> =
        // get /settings/currencies/2026-03/exchange-rates/current
        withRawResponse().listCurrentExchangeRates(params, requestOptions).thenApply { it.parse() }

    override fun listExchangeRates(
        params: ExchangeRateListExchangeRatesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExchangeRateListExchangeRatesPageAsync> =
        // get /settings/currencies/2026-03/exchange-rates
        withRawResponse().listExchangeRates(params, requestOptions).thenApply { it.parse() }

    override fun updateExchangeRate(
        params: ExchangeRateUpdateExchangeRateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExchangeRate> =
        // patch /settings/currencies/2026-03/exchange-rates/{exchangeRateId}
        withRawResponse().updateExchangeRate(params, requestOptions).thenApply { it.parse() }

    override fun updateVisibility(
        params: ExchangeRateUpdateVisibilityParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /settings/currencies/2026-03/exchange-rates/update-visibility
        withRawResponse().updateVisibility(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExchangeRateServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExchangeRateServiceAsync.WithRawResponse =
            ExchangeRateServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        private val createExchangeRateHandler: Handler<ExchangeRate> =
            jsonHandler<ExchangeRate>(clientOptions.jsonMapper)

        override fun createExchangeRate(
            params: ExchangeRateCreateExchangeRateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "currencies", "2026-03", "exchange-rates")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createExchangeRateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getExchangeRateByIdHandler: Handler<ExchangeRate> =
            jsonHandler<ExchangeRate>(clientOptions.jsonMapper)

        override fun getExchangeRateById(
            params: ExchangeRateGetExchangeRateByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("exchangeRateId", params.exchangeRateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "settings",
                        "currencies",
                        "2026-03",
                        "exchange-rates",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getExchangeRateByIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listCurrentExchangeRatesHandler:
            Handler<CollectionResponseExchangeRateNoPaging> =
            jsonHandler<CollectionResponseExchangeRateNoPaging>(clientOptions.jsonMapper)

        override fun listCurrentExchangeRates(
            params: ExchangeRateListCurrentExchangeRatesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseExchangeRateNoPaging>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "settings",
                        "currencies",
                        "2026-03",
                        "exchange-rates",
                        "current",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listCurrentExchangeRatesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listExchangeRatesHandler: Handler<CollectionResponseExchangeRateForwardPaging> =
            jsonHandler<CollectionResponseExchangeRateForwardPaging>(clientOptions.jsonMapper)

        override fun listExchangeRates(
            params: ExchangeRateListExchangeRatesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExchangeRateListExchangeRatesPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "currencies", "2026-03", "exchange-rates")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listExchangeRatesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ExchangeRateListExchangeRatesPageAsync.builder()
                                    .service(ExchangeRateServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val updateExchangeRateHandler: Handler<ExchangeRate> =
            jsonHandler<ExchangeRate>(clientOptions.jsonMapper)

        override fun updateExchangeRate(
            params: ExchangeRateUpdateExchangeRateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("exchangeRateId", params.exchangeRateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "settings",
                        "currencies",
                        "2026-03",
                        "exchange-rates",
                        params._pathParam(0),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateExchangeRateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateVisibilityHandler: Handler<Void?> = emptyHandler()

        override fun updateVisibility(
            params: ExchangeRateUpdateVisibilityParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "settings",
                        "currencies",
                        "2026-03",
                        "exchange-rates",
                        "update-visibility",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { updateVisibilityHandler.handle(it) }
                    }
                }
        }
    }
}
