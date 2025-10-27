// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.settings

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.emptyHandler
import com.hubspot_sdk.api.core.handlers.errorBodyHandler
import com.hubspot_sdk.api.core.handlers.errorHandler
import com.hubspot_sdk.api.core.handlers.jsonHandler
import com.hubspot_sdk.api.core.http.HttpMethod
import com.hubspot_sdk.api.core.http.HttpRequest
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponse.Handler
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.core.http.json
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.settings.currencies.BatchResponseExchangeRate
import com.hubspot_sdk.api.models.settings.currencies.CollectionResponseCurrencyCodeInfoNoPaging
import com.hubspot_sdk.api.models.settings.currencies.CollectionResponseExchangeRateForwardPaging
import com.hubspot_sdk.api.models.settings.currencies.CollectionResponseExchangeRateNoPaging
import com.hubspot_sdk.api.models.settings.currencies.CompanyCurrency
import com.hubspot_sdk.api.models.settings.currencies.CurrencyBatchCreateParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyBatchGetParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyBatchUpdateParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyCreateExchangeRateParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyGetCompanyCurrencyParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyGetExchangeRateByIdParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyListCodesParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyListCurrentExchangeRatesParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyListExchangeRatesParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyUpdateCompanyCurrencyParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyUpdateExchangeRateParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyUpdateVisibilityParams
import com.hubspot_sdk.api.models.settings.currencies.ExchangeRate
import com.hubspot_sdk.api.services.async.settings.currencies.CentralFxRateServiceAsync
import com.hubspot_sdk.api.services.async.settings.currencies.CentralFxRateServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CurrencyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CurrencyServiceAsync {

    private val withRawResponse: CurrencyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val centralFxRates: CentralFxRateServiceAsync by lazy {
        CentralFxRateServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CurrencyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrencyServiceAsync =
        CurrencyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun centralFxRates(): CentralFxRateServiceAsync = centralFxRates

    override fun batchCreate(
        params: CurrencyBatchCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseExchangeRate> =
        // post /settings/v3/currencies/exchange-rates/batch/create
        withRawResponse().batchCreate(params, requestOptions).thenApply { it.parse() }

    override fun batchGet(
        params: CurrencyBatchGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseExchangeRate> =
        // post /settings/v3/currencies/exchange-rates/batch/read
        withRawResponse().batchGet(params, requestOptions).thenApply { it.parse() }

    override fun batchUpdate(
        params: CurrencyBatchUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseExchangeRate> =
        // post /settings/v3/currencies/exchange-rates/batch/update
        withRawResponse().batchUpdate(params, requestOptions).thenApply { it.parse() }

    override fun createExchangeRate(
        params: CurrencyCreateExchangeRateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExchangeRate> =
        // post /settings/v3/currencies/exchange-rates
        withRawResponse().createExchangeRate(params, requestOptions).thenApply { it.parse() }

    override fun getCompanyCurrency(
        params: CurrencyGetCompanyCurrencyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CompanyCurrency> =
        // get /settings/v3/currencies/company-currency
        withRawResponse().getCompanyCurrency(params, requestOptions).thenApply { it.parse() }

    override fun getExchangeRateById(
        params: CurrencyGetExchangeRateByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExchangeRate> =
        // get /settings/v3/currencies/exchange-rates/{exchangeRateId}
        withRawResponse().getExchangeRateById(params, requestOptions).thenApply { it.parse() }

    override fun listCodes(
        params: CurrencyListCodesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseCurrencyCodeInfoNoPaging> =
        // get /settings/v3/currencies/codes
        withRawResponse().listCodes(params, requestOptions).thenApply { it.parse() }

    override fun listCurrentExchangeRates(
        params: CurrencyListCurrentExchangeRatesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseExchangeRateNoPaging> =
        // get /settings/v3/currencies/exchange-rates/current
        withRawResponse().listCurrentExchangeRates(params, requestOptions).thenApply { it.parse() }

    override fun listExchangeRates(
        params: CurrencyListExchangeRatesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseExchangeRateForwardPaging> =
        // get /settings/v3/currencies/exchange-rates
        withRawResponse().listExchangeRates(params, requestOptions).thenApply { it.parse() }

    override fun updateCompanyCurrency(
        params: CurrencyUpdateCompanyCurrencyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CompanyCurrency> =
        // put /settings/v3/currencies/company-currency
        withRawResponse().updateCompanyCurrency(params, requestOptions).thenApply { it.parse() }

    override fun updateExchangeRate(
        params: CurrencyUpdateExchangeRateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExchangeRate> =
        // patch /settings/v3/currencies/exchange-rates/{exchangeRateId}
        withRawResponse().updateExchangeRate(params, requestOptions).thenApply { it.parse() }

    override fun updateVisibility(
        params: CurrencyUpdateVisibilityParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /settings/v3/currencies/exchange-rates/update-visibility
        withRawResponse().updateVisibility(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CurrencyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val centralFxRates: CentralFxRateServiceAsync.WithRawResponse by lazy {
            CentralFxRateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CurrencyServiceAsync.WithRawResponse =
            CurrencyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun centralFxRates(): CentralFxRateServiceAsync.WithRawResponse = centralFxRates

        private val batchCreateHandler: Handler<BatchResponseExchangeRate> =
            jsonHandler<BatchResponseExchangeRate>(clientOptions.jsonMapper)

        override fun batchCreate(
            params: CurrencyBatchCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "settings",
                        "v3",
                        "currencies",
                        "exchange-rates",
                        "batch",
                        "create",
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
                            .use { batchCreateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val batchGetHandler: Handler<BatchResponseExchangeRate> =
            jsonHandler<BatchResponseExchangeRate>(clientOptions.jsonMapper)

        override fun batchGet(
            params: CurrencyBatchGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "settings",
                        "v3",
                        "currencies",
                        "exchange-rates",
                        "batch",
                        "read",
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
                            .use { batchGetHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val batchUpdateHandler: Handler<BatchResponseExchangeRate> =
            jsonHandler<BatchResponseExchangeRate>(clientOptions.jsonMapper)

        override fun batchUpdate(
            params: CurrencyBatchUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "settings",
                        "v3",
                        "currencies",
                        "exchange-rates",
                        "batch",
                        "update",
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
                            .use { batchUpdateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createExchangeRateHandler: Handler<ExchangeRate> =
            jsonHandler<ExchangeRate>(clientOptions.jsonMapper)

        override fun createExchangeRate(
            params: CurrencyCreateExchangeRateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "v3", "currencies", "exchange-rates")
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

        private val getCompanyCurrencyHandler: Handler<CompanyCurrency> =
            jsonHandler<CompanyCurrency>(clientOptions.jsonMapper)

        override fun getCompanyCurrency(
            params: CurrencyGetCompanyCurrencyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CompanyCurrency>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "v3", "currencies", "company-currency")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getCompanyCurrencyHandler.handle(it) }
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
            params: CurrencyGetExchangeRateByIdParams,
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
                        "v3",
                        "currencies",
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

        private val listCodesHandler: Handler<CollectionResponseCurrencyCodeInfoNoPaging> =
            jsonHandler<CollectionResponseCurrencyCodeInfoNoPaging>(clientOptions.jsonMapper)

        override fun listCodes(
            params: CurrencyListCodesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseCurrencyCodeInfoNoPaging>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "v3", "currencies", "codes")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listCodesHandler.handle(it) }
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
            params: CurrencyListCurrentExchangeRatesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseExchangeRateNoPaging>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "v3", "currencies", "exchange-rates", "current")
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
            params: CurrencyListExchangeRatesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseExchangeRateForwardPaging>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "v3", "currencies", "exchange-rates")
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
                    }
                }
        }

        private val updateCompanyCurrencyHandler: Handler<CompanyCurrency> =
            jsonHandler<CompanyCurrency>(clientOptions.jsonMapper)

        override fun updateCompanyCurrency(
            params: CurrencyUpdateCompanyCurrencyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CompanyCurrency>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "v3", "currencies", "company-currency")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateCompanyCurrencyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateExchangeRateHandler: Handler<ExchangeRate> =
            jsonHandler<ExchangeRate>(clientOptions.jsonMapper)

        override fun updateExchangeRate(
            params: CurrencyUpdateExchangeRateParams,
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
                        "v3",
                        "currencies",
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
            params: CurrencyUpdateVisibilityParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "settings",
                        "v3",
                        "currencies",
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
