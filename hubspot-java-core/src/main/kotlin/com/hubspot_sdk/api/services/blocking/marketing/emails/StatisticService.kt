// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.emails

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.emails.AggregateEmailStatistics
import com.hubspot_sdk.api.models.marketing.emails.CollectionResponseWithTotalEmailStatisticIntervalNoPaging
import com.hubspot_sdk.api.models.marketing.emails.statistics.StatisticGetHistogramParams
import com.hubspot_sdk.api.models.marketing.emails.statistics.StatisticGetParams
import java.util.function.Consumer

interface StatisticService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatisticService

    /**
     * Use this endpoint to get aggregated statistics of emails sent in a specified time span. It
     * also returns the list of emails that were sent during the time span.
     */
    fun get(): AggregateEmailStatistics = get(StatisticGetParams.none())

    /** @see get */
    fun get(
        params: StatisticGetParams = StatisticGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AggregateEmailStatistics

    /** @see get */
    fun get(params: StatisticGetParams = StatisticGetParams.none()): AggregateEmailStatistics =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): AggregateEmailStatistics =
        get(StatisticGetParams.none(), requestOptions)

    /**
     * Get aggregated statistics in intervals for a specified time span. Each interval contains
     * aggregated statistics of the emails that were sent in that time.
     */
    fun getHistogram(): CollectionResponseWithTotalEmailStatisticIntervalNoPaging =
        getHistogram(StatisticGetHistogramParams.none())

    /** @see getHistogram */
    fun getHistogram(
        params: StatisticGetHistogramParams = StatisticGetHistogramParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalEmailStatisticIntervalNoPaging

    /** @see getHistogram */
    fun getHistogram(
        params: StatisticGetHistogramParams = StatisticGetHistogramParams.none()
    ): CollectionResponseWithTotalEmailStatisticIntervalNoPaging =
        getHistogram(params, RequestOptions.none())

    /** @see getHistogram */
    fun getHistogram(
        requestOptions: RequestOptions
    ): CollectionResponseWithTotalEmailStatisticIntervalNoPaging =
        getHistogram(StatisticGetHistogramParams.none(), requestOptions)

    /** A view of [StatisticService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatisticService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /marketing/v3/emails/statistics/list`, but is
         * otherwise the same as [StatisticService.get].
         */
        @MustBeClosed
        fun get(): HttpResponseFor<AggregateEmailStatistics> = get(StatisticGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: StatisticGetParams = StatisticGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AggregateEmailStatistics>

        /** @see get */
        @MustBeClosed
        fun get(
            params: StatisticGetParams = StatisticGetParams.none()
        ): HttpResponseFor<AggregateEmailStatistics> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(requestOptions: RequestOptions): HttpResponseFor<AggregateEmailStatistics> =
            get(StatisticGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /marketing/v3/emails/statistics/histogram`, but is
         * otherwise the same as [StatisticService.getHistogram].
         */
        @MustBeClosed
        fun getHistogram():
            HttpResponseFor<CollectionResponseWithTotalEmailStatisticIntervalNoPaging> =
            getHistogram(StatisticGetHistogramParams.none())

        /** @see getHistogram */
        @MustBeClosed
        fun getHistogram(
            params: StatisticGetHistogramParams = StatisticGetHistogramParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalEmailStatisticIntervalNoPaging>

        /** @see getHistogram */
        @MustBeClosed
        fun getHistogram(
            params: StatisticGetHistogramParams = StatisticGetHistogramParams.none()
        ): HttpResponseFor<CollectionResponseWithTotalEmailStatisticIntervalNoPaging> =
            getHistogram(params, RequestOptions.none())

        /** @see getHistogram */
        @MustBeClosed
        fun getHistogram(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseWithTotalEmailStatisticIntervalNoPaging> =
            getHistogram(StatisticGetHistogramParams.none(), requestOptions)
    }
}
