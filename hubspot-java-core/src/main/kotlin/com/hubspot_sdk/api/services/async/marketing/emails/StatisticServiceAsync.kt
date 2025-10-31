// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.emails

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.emails.AggregateEmailStatistics
import com.hubspot_sdk.api.models.marketing.emails.CollectionResponseWithTotalEmailStatisticIntervalNoPaging
import com.hubspot_sdk.api.models.marketing.emails.statistics.StatisticGetHistogramParams
import com.hubspot_sdk.api.models.marketing.emails.statistics.StatisticGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface StatisticServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatisticServiceAsync

    /**
     * Use this endpoint to get aggregated statistics of emails sent in a specified time span. It
     * also returns the list of emails that were sent during the time span.
     */
    fun get(): CompletableFuture<AggregateEmailStatistics> = get(StatisticGetParams.none())

    /** @see get */
    fun get(
        params: StatisticGetParams = StatisticGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregateEmailStatistics>

    /** @see get */
    fun get(
        params: StatisticGetParams = StatisticGetParams.none()
    ): CompletableFuture<AggregateEmailStatistics> = get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): CompletableFuture<AggregateEmailStatistics> =
        get(StatisticGetParams.none(), requestOptions)

    /**
     * Get aggregated statistics in intervals for a specified time span. Each interval contains
     * aggregated statistics of the emails that were sent in that time.
     */
    fun getHistogram():
        CompletableFuture<CollectionResponseWithTotalEmailStatisticIntervalNoPaging> =
        getHistogram(StatisticGetHistogramParams.none())

    /** @see getHistogram */
    fun getHistogram(
        params: StatisticGetHistogramParams = StatisticGetHistogramParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalEmailStatisticIntervalNoPaging>

    /** @see getHistogram */
    fun getHistogram(
        params: StatisticGetHistogramParams = StatisticGetHistogramParams.none()
    ): CompletableFuture<CollectionResponseWithTotalEmailStatisticIntervalNoPaging> =
        getHistogram(params, RequestOptions.none())

    /** @see getHistogram */
    fun getHistogram(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponseWithTotalEmailStatisticIntervalNoPaging> =
        getHistogram(StatisticGetHistogramParams.none(), requestOptions)

    /**
     * A view of [StatisticServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatisticServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /marketing/v3/emails/statistics/list`, but is
         * otherwise the same as [StatisticServiceAsync.get].
         */
        fun get(): CompletableFuture<HttpResponseFor<AggregateEmailStatistics>> =
            get(StatisticGetParams.none())

        /** @see get */
        fun get(
            params: StatisticGetParams = StatisticGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregateEmailStatistics>>

        /** @see get */
        fun get(
            params: StatisticGetParams = StatisticGetParams.none()
        ): CompletableFuture<HttpResponseFor<AggregateEmailStatistics>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AggregateEmailStatistics>> =
            get(StatisticGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /marketing/v3/emails/statistics/histogram`, but is
         * otherwise the same as [StatisticServiceAsync.getHistogram].
         */
        fun getHistogram():
            CompletableFuture<
                HttpResponseFor<CollectionResponseWithTotalEmailStatisticIntervalNoPaging>
            > = getHistogram(StatisticGetHistogramParams.none())

        /** @see getHistogram */
        fun getHistogram(
            params: StatisticGetHistogramParams = StatisticGetHistogramParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalEmailStatisticIntervalNoPaging>
        >

        /** @see getHistogram */
        fun getHistogram(
            params: StatisticGetHistogramParams = StatisticGetHistogramParams.none()
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalEmailStatisticIntervalNoPaging>
        > = getHistogram(params, RequestOptions.none())

        /** @see getHistogram */
        fun getHistogram(
            requestOptions: RequestOptions
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalEmailStatisticIntervalNoPaging>
        > = getHistogram(StatisticGetHistogramParams.none(), requestOptions)
    }
}
