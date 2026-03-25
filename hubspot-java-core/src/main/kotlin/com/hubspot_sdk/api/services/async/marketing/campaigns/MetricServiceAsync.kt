// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.campaigns

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.campaigns.MetricsCounters
import com.hubspot_sdk.api.models.marketing.campaigns.RevenueAttributionAggregate
import com.hubspot_sdk.api.models.marketing.campaigns.metrics.MetricGetAttributionMetricsParams
import com.hubspot_sdk.api.models.marketing.campaigns.metrics.MetricGetRevenueAttributionParams
import com.hubspot_sdk.api.models.marketing.campaigns.metrics.MetricListContactIdsByTypePageAsync
import com.hubspot_sdk.api.models.marketing.campaigns.metrics.MetricListContactIdsByTypeParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MetricServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MetricServiceAsync

    /**
     * Fetch the metrics for a specific marketing campaign using its unique identifier. This
     * endpoint allows you to retrieve various performance metrics of the campaign, which can be
     * useful for analyzing the effectiveness of your marketing efforts over a specified time
     * period.
     */
    fun getAttributionMetrics(campaignGuid: String): CompletableFuture<MetricsCounters> =
        getAttributionMetrics(campaignGuid, MetricGetAttributionMetricsParams.none())

    /** @see getAttributionMetrics */
    fun getAttributionMetrics(
        campaignGuid: String,
        params: MetricGetAttributionMetricsParams = MetricGetAttributionMetricsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MetricsCounters> =
        getAttributionMetrics(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

    /** @see getAttributionMetrics */
    fun getAttributionMetrics(
        campaignGuid: String,
        params: MetricGetAttributionMetricsParams = MetricGetAttributionMetricsParams.none(),
    ): CompletableFuture<MetricsCounters> =
        getAttributionMetrics(campaignGuid, params, RequestOptions.none())

    /** @see getAttributionMetrics */
    fun getAttributionMetrics(
        params: MetricGetAttributionMetricsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MetricsCounters>

    /** @see getAttributionMetrics */
    fun getAttributionMetrics(
        params: MetricGetAttributionMetricsParams
    ): CompletableFuture<MetricsCounters> = getAttributionMetrics(params, RequestOptions.none())

    /** @see getAttributionMetrics */
    fun getAttributionMetrics(
        campaignGuid: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MetricsCounters> =
        getAttributionMetrics(
            campaignGuid,
            MetricGetAttributionMetricsParams.none(),
            requestOptions,
        )

    /**
     * Fetch revenue attribution report data for a specific campaign. This endpoint allows you to
     * retrieve detailed revenue attribution information, which can be filtered by attribution model
     * and date range. It is useful for analyzing the financial impact of marketing campaigns.
     */
    fun getRevenueAttribution(
        campaignGuid: String
    ): CompletableFuture<RevenueAttributionAggregate> =
        getRevenueAttribution(campaignGuid, MetricGetRevenueAttributionParams.none())

    /** @see getRevenueAttribution */
    fun getRevenueAttribution(
        campaignGuid: String,
        params: MetricGetRevenueAttributionParams = MetricGetRevenueAttributionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RevenueAttributionAggregate> =
        getRevenueAttribution(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

    /** @see getRevenueAttribution */
    fun getRevenueAttribution(
        campaignGuid: String,
        params: MetricGetRevenueAttributionParams = MetricGetRevenueAttributionParams.none(),
    ): CompletableFuture<RevenueAttributionAggregate> =
        getRevenueAttribution(campaignGuid, params, RequestOptions.none())

    /** @see getRevenueAttribution */
    fun getRevenueAttribution(
        params: MetricGetRevenueAttributionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RevenueAttributionAggregate>

    /** @see getRevenueAttribution */
    fun getRevenueAttribution(
        params: MetricGetRevenueAttributionParams
    ): CompletableFuture<RevenueAttributionAggregate> =
        getRevenueAttribution(params, RequestOptions.none())

    /** @see getRevenueAttribution */
    fun getRevenueAttribution(
        campaignGuid: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RevenueAttributionAggregate> =
        getRevenueAttribution(
            campaignGuid,
            MetricGetRevenueAttributionParams.none(),
            requestOptions,
        )

    /**
     * Fetch the list of contact IDs for the specified campaign and contact type. This endpoint
     * allows you to retrieve contact identifiers associated with a particular campaign, filtered by
     * the type of contact. It is useful for analyzing or processing contacts involved in specific
     * marketing campaigns.
     */
    fun listContactIdsByType(
        contactType: String,
        params: MetricListContactIdsByTypeParams,
    ): CompletableFuture<MetricListContactIdsByTypePageAsync> =
        listContactIdsByType(contactType, params, RequestOptions.none())

    /** @see listContactIdsByType */
    fun listContactIdsByType(
        contactType: String,
        params: MetricListContactIdsByTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MetricListContactIdsByTypePageAsync> =
        listContactIdsByType(params.toBuilder().contactType(contactType).build(), requestOptions)

    /** @see listContactIdsByType */
    fun listContactIdsByType(
        params: MetricListContactIdsByTypeParams
    ): CompletableFuture<MetricListContactIdsByTypePageAsync> =
        listContactIdsByType(params, RequestOptions.none())

    /** @see listContactIdsByType */
    fun listContactIdsByType(
        params: MetricListContactIdsByTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MetricListContactIdsByTypePageAsync>

    /**
     * A view of [MetricServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MetricServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /marketing/campaigns/2026-03/{campaignGuid}/reports/metrics`, but is otherwise the same
         * as [MetricServiceAsync.getAttributionMetrics].
         */
        fun getAttributionMetrics(
            campaignGuid: String
        ): CompletableFuture<HttpResponseFor<MetricsCounters>> =
            getAttributionMetrics(campaignGuid, MetricGetAttributionMetricsParams.none())

        /** @see getAttributionMetrics */
        fun getAttributionMetrics(
            campaignGuid: String,
            params: MetricGetAttributionMetricsParams = MetricGetAttributionMetricsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MetricsCounters>> =
            getAttributionMetrics(
                params.toBuilder().campaignGuid(campaignGuid).build(),
                requestOptions,
            )

        /** @see getAttributionMetrics */
        fun getAttributionMetrics(
            campaignGuid: String,
            params: MetricGetAttributionMetricsParams = MetricGetAttributionMetricsParams.none(),
        ): CompletableFuture<HttpResponseFor<MetricsCounters>> =
            getAttributionMetrics(campaignGuid, params, RequestOptions.none())

        /** @see getAttributionMetrics */
        fun getAttributionMetrics(
            params: MetricGetAttributionMetricsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MetricsCounters>>

        /** @see getAttributionMetrics */
        fun getAttributionMetrics(
            params: MetricGetAttributionMetricsParams
        ): CompletableFuture<HttpResponseFor<MetricsCounters>> =
            getAttributionMetrics(params, RequestOptions.none())

        /** @see getAttributionMetrics */
        fun getAttributionMetrics(
            campaignGuid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MetricsCounters>> =
            getAttributionMetrics(
                campaignGuid,
                MetricGetAttributionMetricsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /marketing/campaigns/2026-03/{campaignGuid}/reports/revenue`, but is otherwise the same
         * as [MetricServiceAsync.getRevenueAttribution].
         */
        fun getRevenueAttribution(
            campaignGuid: String
        ): CompletableFuture<HttpResponseFor<RevenueAttributionAggregate>> =
            getRevenueAttribution(campaignGuid, MetricGetRevenueAttributionParams.none())

        /** @see getRevenueAttribution */
        fun getRevenueAttribution(
            campaignGuid: String,
            params: MetricGetRevenueAttributionParams = MetricGetRevenueAttributionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RevenueAttributionAggregate>> =
            getRevenueAttribution(
                params.toBuilder().campaignGuid(campaignGuid).build(),
                requestOptions,
            )

        /** @see getRevenueAttribution */
        fun getRevenueAttribution(
            campaignGuid: String,
            params: MetricGetRevenueAttributionParams = MetricGetRevenueAttributionParams.none(),
        ): CompletableFuture<HttpResponseFor<RevenueAttributionAggregate>> =
            getRevenueAttribution(campaignGuid, params, RequestOptions.none())

        /** @see getRevenueAttribution */
        fun getRevenueAttribution(
            params: MetricGetRevenueAttributionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RevenueAttributionAggregate>>

        /** @see getRevenueAttribution */
        fun getRevenueAttribution(
            params: MetricGetRevenueAttributionParams
        ): CompletableFuture<HttpResponseFor<RevenueAttributionAggregate>> =
            getRevenueAttribution(params, RequestOptions.none())

        /** @see getRevenueAttribution */
        fun getRevenueAttribution(
            campaignGuid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RevenueAttributionAggregate>> =
            getRevenueAttribution(
                campaignGuid,
                MetricGetRevenueAttributionParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /marketing/campaigns/2026-03/{campaignGuid}/reports/contacts/{contactType}`, but is
         * otherwise the same as [MetricServiceAsync.listContactIdsByType].
         */
        fun listContactIdsByType(
            contactType: String,
            params: MetricListContactIdsByTypeParams,
        ): CompletableFuture<HttpResponseFor<MetricListContactIdsByTypePageAsync>> =
            listContactIdsByType(contactType, params, RequestOptions.none())

        /** @see listContactIdsByType */
        fun listContactIdsByType(
            contactType: String,
            params: MetricListContactIdsByTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MetricListContactIdsByTypePageAsync>> =
            listContactIdsByType(
                params.toBuilder().contactType(contactType).build(),
                requestOptions,
            )

        /** @see listContactIdsByType */
        fun listContactIdsByType(
            params: MetricListContactIdsByTypeParams
        ): CompletableFuture<HttpResponseFor<MetricListContactIdsByTypePageAsync>> =
            listContactIdsByType(params, RequestOptions.none())

        /** @see listContactIdsByType */
        fun listContactIdsByType(
            params: MetricListContactIdsByTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MetricListContactIdsByTypePageAsync>>
    }
}
