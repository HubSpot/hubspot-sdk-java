// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.emails

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
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.marketing.emails.AggregateEmailStatistics
import com.hubspot_sdk.api.models.marketing.emails.CollectionResponseWithTotalEmailStatisticIntervalNoPaging
import com.hubspot_sdk.api.models.marketing.emails.statistics.StatisticGetHistogramParams
import com.hubspot_sdk.api.models.marketing.emails.statistics.StatisticGetParams
import java.util.function.Consumer

class StatisticServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StatisticService {

    private val withRawResponse: StatisticService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StatisticService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatisticService =
        StatisticServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun get(
        params: StatisticGetParams,
        requestOptions: RequestOptions,
    ): AggregateEmailStatistics =
        // get /marketing/v3/emails/statistics/list
        withRawResponse().get(params, requestOptions).parse()

    override fun getHistogram(
        params: StatisticGetHistogramParams,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalEmailStatisticIntervalNoPaging =
        // get /marketing/v3/emails/statistics/histogram
        withRawResponse().getHistogram(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StatisticService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatisticService.WithRawResponse =
            StatisticServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getHandler: Handler<AggregateEmailStatistics> =
            jsonHandler<AggregateEmailStatistics>(clientOptions.jsonMapper)

        override fun get(
            params: StatisticGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AggregateEmailStatistics> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "emails", "statistics", "list")
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

        private val getHistogramHandler:
            Handler<CollectionResponseWithTotalEmailStatisticIntervalNoPaging> =
            jsonHandler<CollectionResponseWithTotalEmailStatisticIntervalNoPaging>(
                clientOptions.jsonMapper
            )

        override fun getHistogram(
            params: StatisticGetHistogramParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalEmailStatisticIntervalNoPaging> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "emails", "statistics", "histogram")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHistogramHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
