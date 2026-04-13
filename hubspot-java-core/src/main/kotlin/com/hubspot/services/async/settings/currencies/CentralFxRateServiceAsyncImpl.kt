// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.settings.currencies

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
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
import com.hubspot.models.settings.currencies.CentralExchangeRatesInformation
import com.hubspot.models.settings.currencies.CollectionResponseCurrencyCodeInfoNoPaging
import com.hubspot.models.settings.currencies.ExchangeRate
import com.hubspot.models.settings.currencies.centralfxrates.CentralFxRateCreateCurrencyParams
import com.hubspot.models.settings.currencies.centralfxrates.CentralFxRateGetInformationParams
import com.hubspot.models.settings.currencies.centralfxrates.CentralFxRateGetUnsupportedCurrenciesParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class CentralFxRateServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CentralFxRateServiceAsync {

    private val withRawResponse: CentralFxRateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CentralFxRateServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CentralFxRateServiceAsync =
        CentralFxRateServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createCurrency(
        params: CentralFxRateCreateCurrencyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExchangeRate> =
        // post /settings/currencies/2026-03/central-fx-rates/add-currency
        withRawResponse().createCurrency(params, requestOptions).thenApply { it.parse() }

    override fun getInformation(
        params: CentralFxRateGetInformationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CentralExchangeRatesInformation> =
        // get /settings/currencies/2026-03/central-fx-rates/information
        withRawResponse().getInformation(params, requestOptions).thenApply { it.parse() }

    override fun getUnsupportedCurrencies(
        params: CentralFxRateGetUnsupportedCurrenciesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseCurrencyCodeInfoNoPaging> =
        // get /settings/currencies/2026-03/central-fx-rates/unsupported-currencies
        withRawResponse().getUnsupportedCurrencies(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CentralFxRateServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CentralFxRateServiceAsync.WithRawResponse =
            CentralFxRateServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createCurrencyHandler: Handler<ExchangeRate> =
            jsonHandler<ExchangeRate>(clientOptions.jsonMapper)

        override fun createCurrency(
            params: CentralFxRateCreateCurrencyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "settings",
                        "currencies",
                        "2026-03",
                        "central-fx-rates",
                        "add-currency",
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
                            .use { createCurrencyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getInformationHandler: Handler<CentralExchangeRatesInformation> =
            jsonHandler<CentralExchangeRatesInformation>(clientOptions.jsonMapper)

        override fun getInformation(
            params: CentralFxRateGetInformationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CentralExchangeRatesInformation>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "settings",
                        "currencies",
                        "2026-03",
                        "central-fx-rates",
                        "information",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getInformationHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getUnsupportedCurrenciesHandler:
            Handler<CollectionResponseCurrencyCodeInfoNoPaging> =
            jsonHandler<CollectionResponseCurrencyCodeInfoNoPaging>(clientOptions.jsonMapper)

        override fun getUnsupportedCurrencies(
            params: CentralFxRateGetUnsupportedCurrenciesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseCurrencyCodeInfoNoPaging>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "settings",
                        "currencies",
                        "2026-03",
                        "central-fx-rates",
                        "unsupported-currencies",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getUnsupportedCurrenciesHandler.handle(it) }
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
