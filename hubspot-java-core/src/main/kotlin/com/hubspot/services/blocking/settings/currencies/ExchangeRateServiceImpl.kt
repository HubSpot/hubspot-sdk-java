// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.settings.currencies

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
import com.hubspot.core.prepare
import com.hubspot.models.settings.currencies.CollectionResponseExchangeRateForwardPaging
import com.hubspot.models.settings.currencies.CollectionResponseExchangeRateNoPaging
import com.hubspot.models.settings.currencies.ExchangeRate
import com.hubspot.models.settings.currencies.exchangerates.ExchangeRateCreateExchangeRateParams
import com.hubspot.models.settings.currencies.exchangerates.ExchangeRateGetExchangeRateByIdParams
import com.hubspot.models.settings.currencies.exchangerates.ExchangeRateListCurrentExchangeRatesParams
import com.hubspot.models.settings.currencies.exchangerates.ExchangeRateListExchangeRatesPage
import com.hubspot.models.settings.currencies.exchangerates.ExchangeRateListExchangeRatesParams
import com.hubspot.models.settings.currencies.exchangerates.ExchangeRateUpdateExchangeRateParams
import com.hubspot.models.settings.currencies.exchangerates.ExchangeRateUpdateVisibilityParams
import com.hubspot.services.blocking.settings.currencies.exchangerates.BatchService
import com.hubspot.services.blocking.settings.currencies.exchangerates.BatchServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExchangeRateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExchangeRateService {

    private val withRawResponse: ExchangeRateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): ExchangeRateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExchangeRateService =
        ExchangeRateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun createExchangeRate(
        params: ExchangeRateCreateExchangeRateParams,
        requestOptions: RequestOptions,
    ): ExchangeRate =
        // post /settings/currencies/2026-03/exchange-rates
        withRawResponse().createExchangeRate(params, requestOptions).parse()

    override fun getExchangeRateById(
        params: ExchangeRateGetExchangeRateByIdParams,
        requestOptions: RequestOptions,
    ): ExchangeRate =
        // get /settings/currencies/2026-03/exchange-rates/{exchangeRateId}
        withRawResponse().getExchangeRateById(params, requestOptions).parse()

    override fun listCurrentExchangeRates(
        params: ExchangeRateListCurrentExchangeRatesParams,
        requestOptions: RequestOptions,
    ): CollectionResponseExchangeRateNoPaging =
        // get /settings/currencies/2026-03/exchange-rates/current
        withRawResponse().listCurrentExchangeRates(params, requestOptions).parse()

    override fun listExchangeRates(
        params: ExchangeRateListExchangeRatesParams,
        requestOptions: RequestOptions,
    ): ExchangeRateListExchangeRatesPage =
        // get /settings/currencies/2026-03/exchange-rates
        withRawResponse().listExchangeRates(params, requestOptions).parse()

    override fun updateExchangeRate(
        params: ExchangeRateUpdateExchangeRateParams,
        requestOptions: RequestOptions,
    ): ExchangeRate =
        // patch /settings/currencies/2026-03/exchange-rates/{exchangeRateId}
        withRawResponse().updateExchangeRate(params, requestOptions).parse()

    override fun updateVisibility(
        params: ExchangeRateUpdateVisibilityParams,
        requestOptions: RequestOptions,
    ) {
        // post /settings/currencies/2026-03/exchange-rates/update-visibility
        withRawResponse().updateVisibility(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExchangeRateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExchangeRateService.WithRawResponse =
            ExchangeRateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        private val createExchangeRateHandler: Handler<ExchangeRate> =
            jsonHandler<ExchangeRate>(clientOptions.jsonMapper)

        override fun createExchangeRate(
            params: ExchangeRateCreateExchangeRateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExchangeRate> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "currencies", "2026-03", "exchange-rates")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createExchangeRateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getExchangeRateByIdHandler: Handler<ExchangeRate> =
            jsonHandler<ExchangeRate>(clientOptions.jsonMapper)

        override fun getExchangeRateById(
            params: ExchangeRateGetExchangeRateByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExchangeRate> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getExchangeRateByIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<CollectionResponseExchangeRateNoPaging> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listCurrentExchangeRatesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listExchangeRatesHandler: Handler<CollectionResponseExchangeRateForwardPaging> =
            jsonHandler<CollectionResponseExchangeRateForwardPaging>(clientOptions.jsonMapper)

        override fun listExchangeRates(
            params: ExchangeRateListExchangeRatesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExchangeRateListExchangeRatesPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "currencies", "2026-03", "exchange-rates")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listExchangeRatesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ExchangeRateListExchangeRatesPage.builder()
                            .service(ExchangeRateServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val updateExchangeRateHandler: Handler<ExchangeRate> =
            jsonHandler<ExchangeRate>(clientOptions.jsonMapper)

        override fun updateExchangeRate(
            params: ExchangeRateUpdateExchangeRateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExchangeRate> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateExchangeRateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateVisibilityHandler: Handler<Void?> = emptyHandler()

        override fun updateVisibility(
            params: ExchangeRateUpdateVisibilityParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateVisibilityHandler.handle(it) }
            }
        }
    }
}
