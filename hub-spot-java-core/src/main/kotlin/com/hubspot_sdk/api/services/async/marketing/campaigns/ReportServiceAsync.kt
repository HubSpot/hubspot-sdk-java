// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.campaigns

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.campaigns.CollectionResponseContactReferenceForwardPaging
import com.hubspot_sdk.api.models.marketing.campaigns.MetricsCounters
import com.hubspot_sdk.api.models.marketing.campaigns.RevenueAttributionAggregate
import com.hubspot_sdk.api.models.marketing.campaigns.reports.ReportGetAttributionMetricsParams
import com.hubspot_sdk.api.models.marketing.campaigns.reports.ReportGetRevenueAttributionParams
import com.hubspot_sdk.api.models.marketing.campaigns.reports.ReportListContactIdsByTypeParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ReportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportServiceAsync

    /**
     * This endpoint retrieves key attribution metrics for a specified campaign, such as sessions,
     * new contacts, and influenced contacts.
     */
    fun getAttributionMetrics(campaignGuid: String): CompletableFuture<MetricsCounters> =
        getAttributionMetrics(campaignGuid, ReportGetAttributionMetricsParams.none())

    /** @see getAttributionMetrics */
    fun getAttributionMetrics(
        campaignGuid: String,
        params: ReportGetAttributionMetricsParams = ReportGetAttributionMetricsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MetricsCounters> =
        getAttributionMetrics(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

    /** @see getAttributionMetrics */
    fun getAttributionMetrics(
        campaignGuid: String,
        params: ReportGetAttributionMetricsParams = ReportGetAttributionMetricsParams.none(),
    ): CompletableFuture<MetricsCounters> =
        getAttributionMetrics(campaignGuid, params, RequestOptions.none())

    /** @see getAttributionMetrics */
    fun getAttributionMetrics(
        params: ReportGetAttributionMetricsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MetricsCounters>

    /** @see getAttributionMetrics */
    fun getAttributionMetrics(
        params: ReportGetAttributionMetricsParams
    ): CompletableFuture<MetricsCounters> = getAttributionMetrics(params, RequestOptions.none())

    /** @see getAttributionMetrics */
    fun getAttributionMetrics(
        campaignGuid: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MetricsCounters> =
        getAttributionMetrics(
            campaignGuid,
            ReportGetAttributionMetricsParams.none(),
            requestOptions,
        )

    /** Fetch revenue attribution report data for a specified campaign */
    fun getRevenueAttribution(
        campaignGuid: String
    ): CompletableFuture<RevenueAttributionAggregate> =
        getRevenueAttribution(campaignGuid, ReportGetRevenueAttributionParams.none())

    /** @see getRevenueAttribution */
    fun getRevenueAttribution(
        campaignGuid: String,
        params: ReportGetRevenueAttributionParams = ReportGetRevenueAttributionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RevenueAttributionAggregate> =
        getRevenueAttribution(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

    /** @see getRevenueAttribution */
    fun getRevenueAttribution(
        campaignGuid: String,
        params: ReportGetRevenueAttributionParams = ReportGetRevenueAttributionParams.none(),
    ): CompletableFuture<RevenueAttributionAggregate> =
        getRevenueAttribution(campaignGuid, params, RequestOptions.none())

    /** @see getRevenueAttribution */
    fun getRevenueAttribution(
        params: ReportGetRevenueAttributionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RevenueAttributionAggregate>

    /** @see getRevenueAttribution */
    fun getRevenueAttribution(
        params: ReportGetRevenueAttributionParams
    ): CompletableFuture<RevenueAttributionAggregate> =
        getRevenueAttribution(params, RequestOptions.none())

    /** @see getRevenueAttribution */
    fun getRevenueAttribution(
        campaignGuid: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RevenueAttributionAggregate> =
        getRevenueAttribution(
            campaignGuid,
            ReportGetRevenueAttributionParams.none(),
            requestOptions,
        )

    /** Fetch the list of contact IDs for the specified campaign and contact type */
    fun listContactIdsByType(
        contactType: String,
        params: ReportListContactIdsByTypeParams,
    ): CompletableFuture<CollectionResponseContactReferenceForwardPaging> =
        listContactIdsByType(contactType, params, RequestOptions.none())

    /** @see listContactIdsByType */
    fun listContactIdsByType(
        contactType: String,
        params: ReportListContactIdsByTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseContactReferenceForwardPaging> =
        listContactIdsByType(params.toBuilder().contactType(contactType).build(), requestOptions)

    /** @see listContactIdsByType */
    fun listContactIdsByType(
        params: ReportListContactIdsByTypeParams
    ): CompletableFuture<CollectionResponseContactReferenceForwardPaging> =
        listContactIdsByType(params, RequestOptions.none())

    /** @see listContactIdsByType */
    fun listContactIdsByType(
        params: ReportListContactIdsByTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseContactReferenceForwardPaging>

    /**
     * A view of [ReportServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/campaigns/{campaignGuid}/reports/metrics`, but is otherwise the same as
         * [ReportServiceAsync.getAttributionMetrics].
         */
        fun getAttributionMetrics(
            campaignGuid: String
        ): CompletableFuture<HttpResponseFor<MetricsCounters>> =
            getAttributionMetrics(campaignGuid, ReportGetAttributionMetricsParams.none())

        /** @see getAttributionMetrics */
        fun getAttributionMetrics(
            campaignGuid: String,
            params: ReportGetAttributionMetricsParams = ReportGetAttributionMetricsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MetricsCounters>> =
            getAttributionMetrics(
                params.toBuilder().campaignGuid(campaignGuid).build(),
                requestOptions,
            )

        /** @see getAttributionMetrics */
        fun getAttributionMetrics(
            campaignGuid: String,
            params: ReportGetAttributionMetricsParams = ReportGetAttributionMetricsParams.none(),
        ): CompletableFuture<HttpResponseFor<MetricsCounters>> =
            getAttributionMetrics(campaignGuid, params, RequestOptions.none())

        /** @see getAttributionMetrics */
        fun getAttributionMetrics(
            params: ReportGetAttributionMetricsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MetricsCounters>>

        /** @see getAttributionMetrics */
        fun getAttributionMetrics(
            params: ReportGetAttributionMetricsParams
        ): CompletableFuture<HttpResponseFor<MetricsCounters>> =
            getAttributionMetrics(params, RequestOptions.none())

        /** @see getAttributionMetrics */
        fun getAttributionMetrics(
            campaignGuid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MetricsCounters>> =
            getAttributionMetrics(
                campaignGuid,
                ReportGetAttributionMetricsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/campaigns/{campaignGuid}/reports/revenue`, but is otherwise the same as
         * [ReportServiceAsync.getRevenueAttribution].
         */
        fun getRevenueAttribution(
            campaignGuid: String
        ): CompletableFuture<HttpResponseFor<RevenueAttributionAggregate>> =
            getRevenueAttribution(campaignGuid, ReportGetRevenueAttributionParams.none())

        /** @see getRevenueAttribution */
        fun getRevenueAttribution(
            campaignGuid: String,
            params: ReportGetRevenueAttributionParams = ReportGetRevenueAttributionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RevenueAttributionAggregate>> =
            getRevenueAttribution(
                params.toBuilder().campaignGuid(campaignGuid).build(),
                requestOptions,
            )

        /** @see getRevenueAttribution */
        fun getRevenueAttribution(
            campaignGuid: String,
            params: ReportGetRevenueAttributionParams = ReportGetRevenueAttributionParams.none(),
        ): CompletableFuture<HttpResponseFor<RevenueAttributionAggregate>> =
            getRevenueAttribution(campaignGuid, params, RequestOptions.none())

        /** @see getRevenueAttribution */
        fun getRevenueAttribution(
            params: ReportGetRevenueAttributionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RevenueAttributionAggregate>>

        /** @see getRevenueAttribution */
        fun getRevenueAttribution(
            params: ReportGetRevenueAttributionParams
        ): CompletableFuture<HttpResponseFor<RevenueAttributionAggregate>> =
            getRevenueAttribution(params, RequestOptions.none())

        /** @see getRevenueAttribution */
        fun getRevenueAttribution(
            campaignGuid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RevenueAttributionAggregate>> =
            getRevenueAttribution(
                campaignGuid,
                ReportGetRevenueAttributionParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/campaigns/{campaignGuid}/reports/contacts/{contactType}`, but is otherwise
         * the same as [ReportServiceAsync.listContactIdsByType].
         */
        fun listContactIdsByType(
            contactType: String,
            params: ReportListContactIdsByTypeParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponseContactReferenceForwardPaging>> =
            listContactIdsByType(contactType, params, RequestOptions.none())

        /** @see listContactIdsByType */
        fun listContactIdsByType(
            contactType: String,
            params: ReportListContactIdsByTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseContactReferenceForwardPaging>> =
            listContactIdsByType(
                params.toBuilder().contactType(contactType).build(),
                requestOptions,
            )

        /** @see listContactIdsByType */
        fun listContactIdsByType(
            params: ReportListContactIdsByTypeParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseContactReferenceForwardPaging>> =
            listContactIdsByType(params, RequestOptions.none())

        /** @see listContactIdsByType */
        fun listContactIdsByType(
            params: ReportListContactIdsByTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseContactReferenceForwardPaging>>
    }
}
