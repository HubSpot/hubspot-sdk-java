// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.campaigns

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.campaigns.CollectionResponseContactReferenceForwardPaging
import com.hubspot_sdk.api.models.marketing.campaigns.MetricsCounters
import com.hubspot_sdk.api.models.marketing.campaigns.RevenueAttributionAggregate
import com.hubspot_sdk.api.models.marketing.campaigns.reports.ReportGetAttributionMetricsParams
import com.hubspot_sdk.api.models.marketing.campaigns.reports.ReportGetRevenueAttributionParams
import com.hubspot_sdk.api.models.marketing.campaigns.reports.ReportListContactIdsByTypeParams
import java.util.function.Consumer

interface ReportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportService

    /**
     * This endpoint retrieves key attribution metrics for a specified campaign, such as sessions,
     * new contacts, and influenced contacts.
     */
    fun getAttributionMetrics(campaignGuid: String): MetricsCounters =
        getAttributionMetrics(campaignGuid, ReportGetAttributionMetricsParams.none())

    /** @see getAttributionMetrics */
    fun getAttributionMetrics(
        campaignGuid: String,
        params: ReportGetAttributionMetricsParams = ReportGetAttributionMetricsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MetricsCounters =
        getAttributionMetrics(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

    /** @see getAttributionMetrics */
    fun getAttributionMetrics(
        campaignGuid: String,
        params: ReportGetAttributionMetricsParams = ReportGetAttributionMetricsParams.none(),
    ): MetricsCounters = getAttributionMetrics(campaignGuid, params, RequestOptions.none())

    /** @see getAttributionMetrics */
    fun getAttributionMetrics(
        params: ReportGetAttributionMetricsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MetricsCounters

    /** @see getAttributionMetrics */
    fun getAttributionMetrics(params: ReportGetAttributionMetricsParams): MetricsCounters =
        getAttributionMetrics(params, RequestOptions.none())

    /** @see getAttributionMetrics */
    fun getAttributionMetrics(
        campaignGuid: String,
        requestOptions: RequestOptions,
    ): MetricsCounters =
        getAttributionMetrics(
            campaignGuid,
            ReportGetAttributionMetricsParams.none(),
            requestOptions,
        )

    /** Fetch revenue attribution report data for a specified campaign */
    fun getRevenueAttribution(campaignGuid: String): RevenueAttributionAggregate =
        getRevenueAttribution(campaignGuid, ReportGetRevenueAttributionParams.none())

    /** @see getRevenueAttribution */
    fun getRevenueAttribution(
        campaignGuid: String,
        params: ReportGetRevenueAttributionParams = ReportGetRevenueAttributionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RevenueAttributionAggregate =
        getRevenueAttribution(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

    /** @see getRevenueAttribution */
    fun getRevenueAttribution(
        campaignGuid: String,
        params: ReportGetRevenueAttributionParams = ReportGetRevenueAttributionParams.none(),
    ): RevenueAttributionAggregate =
        getRevenueAttribution(campaignGuid, params, RequestOptions.none())

    /** @see getRevenueAttribution */
    fun getRevenueAttribution(
        params: ReportGetRevenueAttributionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RevenueAttributionAggregate

    /** @see getRevenueAttribution */
    fun getRevenueAttribution(
        params: ReportGetRevenueAttributionParams
    ): RevenueAttributionAggregate = getRevenueAttribution(params, RequestOptions.none())

    /** @see getRevenueAttribution */
    fun getRevenueAttribution(
        campaignGuid: String,
        requestOptions: RequestOptions,
    ): RevenueAttributionAggregate =
        getRevenueAttribution(
            campaignGuid,
            ReportGetRevenueAttributionParams.none(),
            requestOptions,
        )

    /** Fetch the list of contact IDs for the specified campaign and contact type */
    fun listContactIdsByType(
        contactType: String,
        params: ReportListContactIdsByTypeParams,
    ): CollectionResponseContactReferenceForwardPaging =
        listContactIdsByType(contactType, params, RequestOptions.none())

    /** @see listContactIdsByType */
    fun listContactIdsByType(
        contactType: String,
        params: ReportListContactIdsByTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseContactReferenceForwardPaging =
        listContactIdsByType(params.toBuilder().contactType(contactType).build(), requestOptions)

    /** @see listContactIdsByType */
    fun listContactIdsByType(
        params: ReportListContactIdsByTypeParams
    ): CollectionResponseContactReferenceForwardPaging =
        listContactIdsByType(params, RequestOptions.none())

    /** @see listContactIdsByType */
    fun listContactIdsByType(
        params: ReportListContactIdsByTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseContactReferenceForwardPaging

    /** A view of [ReportService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/campaigns/{campaignGuid}/reports/metrics`, but is otherwise the same as
         * [ReportService.getAttributionMetrics].
         */
        @MustBeClosed
        fun getAttributionMetrics(campaignGuid: String): HttpResponseFor<MetricsCounters> =
            getAttributionMetrics(campaignGuid, ReportGetAttributionMetricsParams.none())

        /** @see getAttributionMetrics */
        @MustBeClosed
        fun getAttributionMetrics(
            campaignGuid: String,
            params: ReportGetAttributionMetricsParams = ReportGetAttributionMetricsParams.none(),
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
            params: ReportGetAttributionMetricsParams = ReportGetAttributionMetricsParams.none(),
        ): HttpResponseFor<MetricsCounters> =
            getAttributionMetrics(campaignGuid, params, RequestOptions.none())

        /** @see getAttributionMetrics */
        @MustBeClosed
        fun getAttributionMetrics(
            params: ReportGetAttributionMetricsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MetricsCounters>

        /** @see getAttributionMetrics */
        @MustBeClosed
        fun getAttributionMetrics(
            params: ReportGetAttributionMetricsParams
        ): HttpResponseFor<MetricsCounters> = getAttributionMetrics(params, RequestOptions.none())

        /** @see getAttributionMetrics */
        @MustBeClosed
        fun getAttributionMetrics(
            campaignGuid: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MetricsCounters> =
            getAttributionMetrics(
                campaignGuid,
                ReportGetAttributionMetricsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/campaigns/{campaignGuid}/reports/revenue`, but is otherwise the same as
         * [ReportService.getRevenueAttribution].
         */
        @MustBeClosed
        fun getRevenueAttribution(
            campaignGuid: String
        ): HttpResponseFor<RevenueAttributionAggregate> =
            getRevenueAttribution(campaignGuid, ReportGetRevenueAttributionParams.none())

        /** @see getRevenueAttribution */
        @MustBeClosed
        fun getRevenueAttribution(
            campaignGuid: String,
            params: ReportGetRevenueAttributionParams = ReportGetRevenueAttributionParams.none(),
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
            params: ReportGetRevenueAttributionParams = ReportGetRevenueAttributionParams.none(),
        ): HttpResponseFor<RevenueAttributionAggregate> =
            getRevenueAttribution(campaignGuid, params, RequestOptions.none())

        /** @see getRevenueAttribution */
        @MustBeClosed
        fun getRevenueAttribution(
            params: ReportGetRevenueAttributionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RevenueAttributionAggregate>

        /** @see getRevenueAttribution */
        @MustBeClosed
        fun getRevenueAttribution(
            params: ReportGetRevenueAttributionParams
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
                ReportGetRevenueAttributionParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/campaigns/{campaignGuid}/reports/contacts/{contactType}`, but is otherwise
         * the same as [ReportService.listContactIdsByType].
         */
        @MustBeClosed
        fun listContactIdsByType(
            contactType: String,
            params: ReportListContactIdsByTypeParams,
        ): HttpResponseFor<CollectionResponseContactReferenceForwardPaging> =
            listContactIdsByType(contactType, params, RequestOptions.none())

        /** @see listContactIdsByType */
        @MustBeClosed
        fun listContactIdsByType(
            contactType: String,
            params: ReportListContactIdsByTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseContactReferenceForwardPaging> =
            listContactIdsByType(
                params.toBuilder().contactType(contactType).build(),
                requestOptions,
            )

        /** @see listContactIdsByType */
        @MustBeClosed
        fun listContactIdsByType(
            params: ReportListContactIdsByTypeParams
        ): HttpResponseFor<CollectionResponseContactReferenceForwardPaging> =
            listContactIdsByType(params, RequestOptions.none())

        /** @see listContactIdsByType */
        @MustBeClosed
        fun listContactIdsByType(
            params: ReportListContactIdsByTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseContactReferenceForwardPaging>
    }
}
