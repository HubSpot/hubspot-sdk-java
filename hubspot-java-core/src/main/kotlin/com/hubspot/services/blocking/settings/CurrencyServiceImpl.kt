// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.settings

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
import com.hubspot.core.prepare
import com.hubspot.models.settings.currencies.CollectionResponseCurrencyCodeInfoNoPaging
import com.hubspot.models.settings.currencies.CompanyCurrency
import com.hubspot.models.settings.currencies.CurrencyGetCompanyCurrencyParams
import com.hubspot.models.settings.currencies.CurrencyListCodesParams
import com.hubspot.models.settings.currencies.CurrencyUpdateCompanyCurrencyParams
import com.hubspot.services.blocking.settings.currencies.CentralFxRateService
import com.hubspot.services.blocking.settings.currencies.CentralFxRateServiceImpl
import com.hubspot.services.blocking.settings.currencies.ExchangeRateService
import com.hubspot.services.blocking.settings.currencies.ExchangeRateServiceImpl
import java.util.function.Consumer

class CurrencyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CurrencyService {

    private val withRawResponse: CurrencyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val centralFxRates: CentralFxRateService by lazy {
        CentralFxRateServiceImpl(clientOptions)
    }

    private val exchangeRates: ExchangeRateService by lazy {
        ExchangeRateServiceImpl(clientOptions)
    }

    override fun withRawResponse(): CurrencyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrencyService =
        CurrencyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun centralFxRates(): CentralFxRateService = centralFxRates

    override fun exchangeRates(): ExchangeRateService = exchangeRates

    override fun getCompanyCurrency(
        params: CurrencyGetCompanyCurrencyParams,
        requestOptions: RequestOptions,
    ): CompanyCurrency =
        // get /settings/currencies/2026-03/company-currency
        withRawResponse().getCompanyCurrency(params, requestOptions).parse()

    override fun listCodes(
        params: CurrencyListCodesParams,
        requestOptions: RequestOptions,
    ): CollectionResponseCurrencyCodeInfoNoPaging =
        // get /settings/currencies/2026-03/codes
        withRawResponse().listCodes(params, requestOptions).parse()

    override fun updateCompanyCurrency(
        params: CurrencyUpdateCompanyCurrencyParams,
        requestOptions: RequestOptions,
    ): CompanyCurrency =
        // put /settings/currencies/2026-03/company-currency
        withRawResponse().updateCompanyCurrency(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CurrencyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val centralFxRates: CentralFxRateService.WithRawResponse by lazy {
            CentralFxRateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val exchangeRates: ExchangeRateService.WithRawResponse by lazy {
            ExchangeRateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CurrencyService.WithRawResponse =
            CurrencyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun centralFxRates(): CentralFxRateService.WithRawResponse = centralFxRates

        override fun exchangeRates(): ExchangeRateService.WithRawResponse = exchangeRates

        private val getCompanyCurrencyHandler: Handler<CompanyCurrency> =
            jsonHandler<CompanyCurrency>(clientOptions.jsonMapper)

        override fun getCompanyCurrency(
            params: CurrencyGetCompanyCurrencyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompanyCurrency> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "currencies", "2026-03", "company-currency")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getCompanyCurrencyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listCodesHandler: Handler<CollectionResponseCurrencyCodeInfoNoPaging> =
            jsonHandler<CollectionResponseCurrencyCodeInfoNoPaging>(clientOptions.jsonMapper)

        override fun listCodes(
            params: CurrencyListCodesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseCurrencyCodeInfoNoPaging> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "currencies", "2026-03", "codes")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listCodesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateCompanyCurrencyHandler: Handler<CompanyCurrency> =
            jsonHandler<CompanyCurrency>(clientOptions.jsonMapper)

        override fun updateCompanyCurrency(
            params: CurrencyUpdateCompanyCurrencyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompanyCurrency> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "currencies", "2026-03", "company-currency")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
