// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.campaigns

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
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.marketing.campaigns.CollectionResponseContactReferenceForwardPaging
import com.hubspot_sdk.api.models.marketing.campaigns.MetricsCounters
import com.hubspot_sdk.api.models.marketing.campaigns.RevenueAttributionAggregate
import com.hubspot_sdk.api.models.marketing.campaigns.metrics.MetricGetAttributionMetricsParams
import com.hubspot_sdk.api.models.marketing.campaigns.metrics.MetricGetRevenueAttributionParams
import com.hubspot_sdk.api.models.marketing.campaigns.metrics.MetricListContactIdsByTypePage
import com.hubspot_sdk.api.models.marketing.campaigns.metrics.MetricListContactIdsByTypeParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MetricServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MetricService {

    private val withRawResponse: MetricService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MetricService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MetricService =
        MetricServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getAttributionMetrics(
        params: MetricGetAttributionMetricsParams,
        requestOptions: RequestOptions,
    ): MetricsCounters =
        // get /marketing/campaigns/2026-03/{campaignGuid}/reports/metrics
        withRawResponse().getAttributionMetrics(params, requestOptions).parse()

    override fun getRevenueAttribution(
        params: MetricGetRevenueAttributionParams,
        requestOptions: RequestOptions,
    ): RevenueAttributionAggregate =
        // get /marketing/campaigns/2026-03/{campaignGuid}/reports/revenue
        withRawResponse().getRevenueAttribution(params, requestOptions).parse()

    override fun listContactIdsByType(
        params: MetricListContactIdsByTypeParams,
        requestOptions: RequestOptions,
    ): MetricListContactIdsByTypePage =
        // get /marketing/campaigns/2026-03/{campaignGuid}/reports/contacts/{contactType}
        withRawResponse().listContactIdsByType(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MetricService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MetricService.WithRawResponse =
            MetricServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getAttributionMetricsHandler: Handler<MetricsCounters> =
            jsonHandler<MetricsCounters>(clientOptions.jsonMapper)

        override fun getAttributionMetrics(
            params: MetricGetAttributionMetricsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MetricsCounters> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignGuid", params.campaignGuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "campaigns",
                        "2026-03",
                        params._pathParam(0),
                        "reports",
                        "metrics",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getAttributionMetricsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getRevenueAttributionHandler: Handler<RevenueAttributionAggregate> =
            jsonHandler<RevenueAttributionAggregate>(clientOptions.jsonMapper)

        override fun getRevenueAttribution(
            params: MetricGetRevenueAttributionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RevenueAttributionAggregate> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignGuid", params.campaignGuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "campaigns",
                        "2026-03",
                        params._pathParam(0),
                        "reports",
                        "revenue",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getRevenueAttributionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listContactIdsByTypeHandler:
            Handler<CollectionResponseContactReferenceForwardPaging> =
            jsonHandler<CollectionResponseContactReferenceForwardPaging>(clientOptions.jsonMapper)

        override fun listContactIdsByType(
            params: MetricListContactIdsByTypeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MetricListContactIdsByTypePage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("contactType", params.contactType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "campaigns",
                        "2026-03",
                        params._pathParam(0),
                        "reports",
                        "contacts",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listContactIdsByTypeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        MetricListContactIdsByTypePage.builder()
                            .service(MetricServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
