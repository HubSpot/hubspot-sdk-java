// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.marketing.campaigns

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.marketing.campaigns.MetricsCounters
import com.hubspot.sdk.models.marketing.campaigns.RevenueAttributionAggregate
import com.hubspot.sdk.models.marketing.campaigns.metrics.MetricGetAttributionMetricsParams
import com.hubspot.sdk.models.marketing.campaigns.metrics.MetricGetRevenueAttributionParams
import com.hubspot.sdk.models.marketing.campaigns.metrics.MetricListContactIdsByTypePage
import com.hubspot.sdk.models.marketing.campaigns.metrics.MetricListContactIdsByTypeParams
import java.util.function.Consumer

interface MetricService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MetricService

    /**
     * This endpoint retrieves key attribution metrics for a specified campaign, such as sessions,
     * new contacts, and influenced contacts.
     */
    fun getAttributionMetrics(campaignGuid: String): MetricsCounters =
        getAttributionMetrics(campaignGuid, MetricGetAttributionMetricsParams.none())

    /** @see getAttributionMetrics */
    fun getAttributionMetrics(
        campaignGuid: String,
        params: MetricGetAttributionMetricsParams = MetricGetAttributionMetricsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MetricsCounters =
        getAttributionMetrics(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

    /** @see getAttributionMetrics */
    fun getAttributionMetrics(
        campaignGuid: String,
        params: MetricGetAttributionMetricsParams = MetricGetAttributionMetricsParams.none(),
    ): MetricsCounters = getAttributionMetrics(campaignGuid, params, RequestOptions.none())

    /** @see getAttributionMetrics */
    fun getAttributionMetrics(
        params: MetricGetAttributionMetricsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MetricsCounters

    /** @see getAttributionMetrics */
    fun getAttributionMetrics(params: MetricGetAttributionMetricsParams): MetricsCounters =
        getAttributionMetrics(params, RequestOptions.none())

    /** @see getAttributionMetrics */
    fun getAttributionMetrics(
        campaignGuid: String,
        requestOptions: RequestOptions,
    ): MetricsCounters =
        getAttributionMetrics(
            campaignGuid,
            MetricGetAttributionMetricsParams.none(),
            requestOptions,
        )

    /** Fetch revenue attribution report data for a specified campaign */
    fun getRevenueAttribution(campaignGuid: String): RevenueAttributionAggregate =
        getRevenueAttribution(campaignGuid, MetricGetRevenueAttributionParams.none())

    /** @see getRevenueAttribution */
    fun getRevenueAttribution(
        campaignGuid: String,
        params: MetricGetRevenueAttributionParams = MetricGetRevenueAttributionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RevenueAttributionAggregate =
        getRevenueAttribution(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

    /** @see getRevenueAttribution */
    fun getRevenueAttribution(
        campaignGuid: String,
        params: MetricGetRevenueAttributionParams = MetricGetRevenueAttributionParams.none(),
    ): RevenueAttributionAggregate =
        getRevenueAttribution(campaignGuid, params, RequestOptions.none())

    /** @see getRevenueAttribution */
    fun getRevenueAttribution(
        params: MetricGetRevenueAttributionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RevenueAttributionAggregate

    /** @see getRevenueAttribution */
    fun getRevenueAttribution(
        params: MetricGetRevenueAttributionParams
    ): RevenueAttributionAggregate = getRevenueAttribution(params, RequestOptions.none())

    /** @see getRevenueAttribution */
    fun getRevenueAttribution(
        campaignGuid: String,
        requestOptions: RequestOptions,
    ): RevenueAttributionAggregate =
        getRevenueAttribution(
            campaignGuid,
            MetricGetRevenueAttributionParams.none(),
            requestOptions,
        )

    /** Fetch the list of contact IDs for the specified campaign and contact type */
    fun listContactIdsByType(
        contactType: String,
        params: MetricListContactIdsByTypeParams,
    ): MetricListContactIdsByTypePage =
        listContactIdsByType(contactType, params, RequestOptions.none())

    /** @see listContactIdsByType */
    fun listContactIdsByType(
        contactType: String,
        params: MetricListContactIdsByTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MetricListContactIdsByTypePage =
        listContactIdsByType(params.toBuilder().contactType(contactType).build(), requestOptions)

    /** @see listContactIdsByType */
    fun listContactIdsByType(
        params: MetricListContactIdsByTypeParams
    ): MetricListContactIdsByTypePage = listContactIdsByType(params, RequestOptions.none())

    /** @see listContactIdsByType */
    fun listContactIdsByType(
        params: MetricListContactIdsByTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MetricListContactIdsByTypePage

    /** A view of [MetricService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MetricService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /marketing/campaigns/2026-03/{campaignGuid}/reports/metrics`, but is otherwise the same
         * as [MetricService.getAttributionMetrics].
         */
        @MustBeClosed
        fun getAttributionMetrics(campaignGuid: String): HttpResponseFor<MetricsCounters> =
            getAttributionMetrics(campaignGuid, MetricGetAttributionMetricsParams.none())

        /** @see getAttributionMetrics */
        @MustBeClosed
        fun getAttributionMetrics(
            campaignGuid: String,
            params: MetricGetAttributionMetricsParams = MetricGetAttributionMetricsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MetricsCounters> =
            getAttributionMetrics(
                params.toBuilder().campaignGuid(campaignGuid).build(),
                requestOptions,
            )

        /** @see getAttributionMetrics */
        @MustBeClosed
        fun getAttributionMetrics(
            campaignGuid: String,
            params: MetricGetAttributionMetricsParams = MetricGetAttributionMetricsParams.none(),
        ): HttpResponseFor<MetricsCounters> =
            getAttributionMetrics(campaignGuid, params, RequestOptions.none())

        /** @see getAttributionMetrics */
        @MustBeClosed
        fun getAttributionMetrics(
            params: MetricGetAttributionMetricsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MetricsCounters>

        /** @see getAttributionMetrics */
        @MustBeClosed
        fun getAttributionMetrics(
            params: MetricGetAttributionMetricsParams
        ): HttpResponseFor<MetricsCounters> = getAttributionMetrics(params, RequestOptions.none())

        /** @see getAttributionMetrics */
        @MustBeClosed
        fun getAttributionMetrics(
            campaignGuid: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MetricsCounters> =
            getAttributionMetrics(
                campaignGuid,
                MetricGetAttributionMetricsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /marketing/campaigns/2026-03/{campaignGuid}/reports/revenue`, but is otherwise the same
         * as [MetricService.getRevenueAttribution].
         */
        @MustBeClosed
        fun getRevenueAttribution(
            campaignGuid: String
        ): HttpResponseFor<RevenueAttributionAggregate> =
            getRevenueAttribution(campaignGuid, MetricGetRevenueAttributionParams.none())

        /** @see getRevenueAttribution */
        @MustBeClosed
        fun getRevenueAttribution(
            campaignGuid: String,
            params: MetricGetRevenueAttributionParams = MetricGetRevenueAttributionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RevenueAttributionAggregate> =
            getRevenueAttribution(
                params.toBuilder().campaignGuid(campaignGuid).build(),
                requestOptions,
            )

        /** @see getRevenueAttribution */
        @MustBeClosed
        fun getRevenueAttribution(
            campaignGuid: String,
            params: MetricGetRevenueAttributionParams = MetricGetRevenueAttributionParams.none(),
        ): HttpResponseFor<RevenueAttributionAggregate> =
            getRevenueAttribution(campaignGuid, params, RequestOptions.none())

        /** @see getRevenueAttribution */
        @MustBeClosed
        fun getRevenueAttribution(
            params: MetricGetRevenueAttributionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RevenueAttributionAggregate>

        /** @see getRevenueAttribution */
        @MustBeClosed
        fun getRevenueAttribution(
            params: MetricGetRevenueAttributionParams
        ): HttpResponseFor<RevenueAttributionAggregate> =
            getRevenueAttribution(params, RequestOptions.none())

        /** @see getRevenueAttribution */
        @MustBeClosed
        fun getRevenueAttribution(
            campaignGuid: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RevenueAttributionAggregate> =
            getRevenueAttribution(
                campaignGuid,
                MetricGetRevenueAttributionParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /marketing/campaigns/2026-03/{campaignGuid}/reports/contacts/{contactType}`, but is
         * otherwise the same as [MetricService.listContactIdsByType].
         */
        @MustBeClosed
        fun listContactIdsByType(
            contactType: String,
            params: MetricListContactIdsByTypeParams,
        ): HttpResponseFor<MetricListContactIdsByTypePage> =
            listContactIdsByType(contactType, params, RequestOptions.none())

        /** @see listContactIdsByType */
        @MustBeClosed
        fun listContactIdsByType(
            contactType: String,
            params: MetricListContactIdsByTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MetricListContactIdsByTypePage> =
            listContactIdsByType(
                params.toBuilder().contactType(contactType).build(),
                requestOptions,
            )

        /** @see listContactIdsByType */
        @MustBeClosed
        fun listContactIdsByType(
            params: MetricListContactIdsByTypeParams
        ): HttpResponseFor<MetricListContactIdsByTypePage> =
            listContactIdsByType(params, RequestOptions.none())

        /** @see listContactIdsByType */
        @MustBeClosed
        fun listContactIdsByType(
            params: MetricListContactIdsByTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MetricListContactIdsByTypePage>
    }
}
