// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.emails

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
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.marketing.emails.AggregateEmailStatistics
import com.hubspot_sdk.api.models.marketing.emails.CollectionResponseWithTotalEmailStatisticIntervalNoPaging
import com.hubspot_sdk.api.models.marketing.emails.statistics.StatisticGetHistogramParams
import com.hubspot_sdk.api.models.marketing.emails.statistics.StatisticGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class StatisticServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    StatisticServiceAsync {

    private val withRawResponse: StatisticServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StatisticServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatisticServiceAsync =
        StatisticServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun get(
        params: StatisticGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AggregateEmailStatistics> =
        // get /marketing/v3/emails/statistics/list
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getHistogram(
        params: StatisticGetHistogramParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseWithTotalEmailStatisticIntervalNoPaging> =
        // get /marketing/v3/emails/statistics/histogram
        withRawResponse().getHistogram(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StatisticServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatisticServiceAsync.WithRawResponse =
            StatisticServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getHandler: Handler<AggregateEmailStatistics> =
            jsonHandler<AggregateEmailStatistics>(clientOptions.jsonMapper)

        override fun get(
            params: StatisticGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AggregateEmailStatistics>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "emails", "statistics", "list")
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

        private val getHistogramHandler:
            Handler<CollectionResponseWithTotalEmailStatisticIntervalNoPaging> =
            jsonHandler<CollectionResponseWithTotalEmailStatisticIntervalNoPaging>(
                clientOptions.jsonMapper
            )

        override fun getHistogram(
            params: StatisticGetHistogramParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalEmailStatisticIntervalNoPaging>
        > {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "emails", "statistics", "histogram")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
