// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.settings

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
import com.hubspot.models.settings.currencies.CollectionResponseCurrencyCodeInfoNoPaging
import com.hubspot.models.settings.currencies.CompanyCurrency
import com.hubspot.models.settings.currencies.CurrencyGetCompanyCurrencyParams
import com.hubspot.models.settings.currencies.CurrencyListCodesParams
import com.hubspot.models.settings.currencies.CurrencyUpdateCompanyCurrencyParams
import com.hubspot.services.async.settings.currencies.CentralFxRateServiceAsync
import com.hubspot.services.async.settings.currencies.CentralFxRateServiceAsyncImpl
import com.hubspot.services.async.settings.currencies.ExchangeRateServiceAsync
import com.hubspot.services.async.settings.currencies.ExchangeRateServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class CurrencyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CurrencyServiceAsync {

    private val withRawResponse: CurrencyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val centralFxRates: CentralFxRateServiceAsync by lazy {
        CentralFxRateServiceAsyncImpl(clientOptions)
    }

    private val exchangeRates: ExchangeRateServiceAsync by lazy {
        ExchangeRateServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CurrencyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrencyServiceAsync =
        CurrencyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun centralFxRates(): CentralFxRateServiceAsync = centralFxRates

    override fun exchangeRates(): ExchangeRateServiceAsync = exchangeRates

    override fun getCompanyCurrency(
        params: CurrencyGetCompanyCurrencyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CompanyCurrency> =
        // get /settings/currencies/2026-03/company-currency
        withRawResponse().getCompanyCurrency(params, requestOptions).thenApply { it.parse() }

    override fun listCodes(
        params: CurrencyListCodesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseCurrencyCodeInfoNoPaging> =
        // get /settings/currencies/2026-03/codes
        withRawResponse().listCodes(params, requestOptions).thenApply { it.parse() }

    override fun updateCompanyCurrency(
        params: CurrencyUpdateCompanyCurrencyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CompanyCurrency> =
        // put /settings/currencies/2026-03/company-currency
        withRawResponse().updateCompanyCurrency(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CurrencyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val centralFxRates: CentralFxRateServiceAsync.WithRawResponse by lazy {
            CentralFxRateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val exchangeRates: ExchangeRateServiceAsync.WithRawResponse by lazy {
            ExchangeRateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CurrencyServiceAsync.WithRawResponse =
            CurrencyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun centralFxRates(): CentralFxRateServiceAsync.WithRawResponse = centralFxRates

        override fun exchangeRates(): ExchangeRateServiceAsync.WithRawResponse = exchangeRates

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
                    .addPathSegments("settings", "currencies", "2026-03", "company-currency")
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
                    .addPathSegments("settings", "currencies", "2026-03", "codes")
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
                    .addPathSegments("settings", "currencies", "2026-03", "company-currency")
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
    }
}
