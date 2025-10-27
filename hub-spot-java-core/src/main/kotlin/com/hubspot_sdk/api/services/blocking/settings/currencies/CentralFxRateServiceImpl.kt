// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.settings.currencies

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
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
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.settings.currencies.CentralExchangeRatesInformation
import com.hubspot_sdk.api.models.settings.currencies.CollectionResponseCurrencyCodeInfoNoPaging
import com.hubspot_sdk.api.models.settings.currencies.ExchangeRate
import com.hubspot_sdk.api.models.settings.currencies.centralfxrates.CentralFxRateCreateCurrencyParams
import com.hubspot_sdk.api.models.settings.currencies.centralfxrates.CentralFxRateGetInformationParams
import com.hubspot_sdk.api.models.settings.currencies.centralfxrates.CentralFxRateGetUnsupportedCurrenciesParams
import java.util.function.Consumer

class CentralFxRateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CentralFxRateService {

    private val withRawResponse: CentralFxRateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CentralFxRateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CentralFxRateService =
        CentralFxRateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createCurrency(
        params: CentralFxRateCreateCurrencyParams,
        requestOptions: RequestOptions,
    ): ExchangeRate =
        // post /settings/v3/currencies/central-fx-rates/add-currency
        withRawResponse().createCurrency(params, requestOptions).parse()

    override fun getInformation(
        params: CentralFxRateGetInformationParams,
        requestOptions: RequestOptions,
    ): CentralExchangeRatesInformation =
        // get /settings/v3/currencies/central-fx-rates/information
        withRawResponse().getInformation(params, requestOptions).parse()

    override fun getUnsupportedCurrencies(
        params: CentralFxRateGetUnsupportedCurrenciesParams,
        requestOptions: RequestOptions,
    ): CollectionResponseCurrencyCodeInfoNoPaging =
        // get /settings/v3/currencies/central-fx-rates/unsupported-currencies
        withRawResponse().getUnsupportedCurrencies(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CentralFxRateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CentralFxRateService.WithRawResponse =
            CentralFxRateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createCurrencyHandler: Handler<ExchangeRate> =
            jsonHandler<ExchangeRate>(clientOptions.jsonMapper)

        override fun createCurrency(
            params: CentralFxRateCreateCurrencyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExchangeRate> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "settings",
                        "v3",
                        "currencies",
                        "central-fx-rates",
                        "add-currency",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createCurrencyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getInformationHandler: Handler<CentralExchangeRatesInformation> =
            jsonHandler<CentralExchangeRatesInformation>(clientOptions.jsonMapper)

        override fun getInformation(
            params: CentralFxRateGetInformationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CentralExchangeRatesInformation> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "settings",
                        "v3",
                        "currencies",
                        "central-fx-rates",
                        "information",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getInformationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<CollectionResponseCurrencyCodeInfoNoPaging> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "settings",
                        "v3",
                        "currencies",
                        "central-fx-rates",
                        "unsupported-currencies",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
