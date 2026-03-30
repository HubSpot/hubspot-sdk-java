// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.webhooks.webhooks

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.webhooks.webhooks.BatchResponseJournalFetchResponse
import com.hubspot_sdk.api.models.webhooks.webhooks.BatchResponseSubscriptionResponse
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchCreateParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetEarliestParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetLatestParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetNextParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchReadParams
import java.util.function.Consumer

interface BatchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService

    /** Batch create event subscriptions for the specified app. */
    fun create(appId: Int, params: BatchCreateParams): BatchResponseSubscriptionResponse =
        create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSubscriptionResponse =
        create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(params: BatchCreateParams): BatchResponseSubscriptionResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSubscriptionResponse

    fun getEarliest(count: Int): BatchResponseJournalFetchResponse =
        getEarliest(count, BatchGetEarliestParams.none())

    /** @see getEarliest */
    fun getEarliest(
        count: Int,
        params: BatchGetEarliestParams = BatchGetEarliestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse =
        getEarliest(params.toBuilder().count(count).build(), requestOptions)

    /** @see getEarliest */
    fun getEarliest(
        count: Int,
        params: BatchGetEarliestParams = BatchGetEarliestParams.none(),
    ): BatchResponseJournalFetchResponse = getEarliest(count, params, RequestOptions.none())

    /** @see getEarliest */
    fun getEarliest(
        params: BatchGetEarliestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse

    /** @see getEarliest */
    fun getEarliest(params: BatchGetEarliestParams): BatchResponseJournalFetchResponse =
        getEarliest(params, RequestOptions.none())

    /** @see getEarliest */
    fun getEarliest(count: Int, requestOptions: RequestOptions): BatchResponseJournalFetchResponse =
        getEarliest(count, BatchGetEarliestParams.none(), requestOptions)

    fun getLatest(count: Int): BatchResponseJournalFetchResponse =
        getLatest(count, BatchGetLatestParams.none())

    /** @see getLatest */
    fun getLatest(
        count: Int,
        params: BatchGetLatestParams = BatchGetLatestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse =
        getLatest(params.toBuilder().count(count).build(), requestOptions)

    /** @see getLatest */
    fun getLatest(
        count: Int,
        params: BatchGetLatestParams = BatchGetLatestParams.none(),
    ): BatchResponseJournalFetchResponse = getLatest(count, params, RequestOptions.none())

    /** @see getLatest */
    fun getLatest(
        params: BatchGetLatestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse

    /** @see getLatest */
    fun getLatest(params: BatchGetLatestParams): BatchResponseJournalFetchResponse =
        getLatest(params, RequestOptions.none())

    /** @see getLatest */
    fun getLatest(count: Int, requestOptions: RequestOptions): BatchResponseJournalFetchResponse =
        getLatest(count, BatchGetLatestParams.none(), requestOptions)

    fun getNext(count: Int, params: BatchGetNextParams): BatchResponseJournalFetchResponse =
        getNext(count, params, RequestOptions.none())

    /** @see getNext */
    fun getNext(
        count: Int,
        params: BatchGetNextParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse =
        getNext(params.toBuilder().count(count).build(), requestOptions)

    /** @see getNext */
    fun getNext(params: BatchGetNextParams): BatchResponseJournalFetchResponse =
        getNext(params, RequestOptions.none())

    /** @see getNext */
    fun getNext(
        params: BatchGetNextParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse

    fun read(params: BatchReadParams): BatchResponseJournalFetchResponse =
        read(params, RequestOptions.none())

    /** @see read */
    fun read(
        params: BatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse

    /** @see read */
    fun read(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse =
        read(BatchReadParams.builder().batchInputString(batchInputString).build(), requestOptions)

    /** @see read */
    fun read(batchInputString: BatchInputString): BatchResponseJournalFetchResponse =
        read(batchInputString, RequestOptions.none())

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /webhooks/2026-03/{appId}/subscriptions/batch/update`, but is otherwise the same as
         * [BatchService.create].
         */
        @MustBeClosed
        fun create(
            appId: Int,
            params: BatchCreateParams,
        ): HttpResponseFor<BatchResponseSubscriptionResponse> =
            create(appId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            appId: Int,
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSubscriptionResponse> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: BatchCreateParams): HttpResponseFor<BatchResponseSubscriptionResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSubscriptionResponse>

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/batch/earliest/{count}`, but is otherwise the same as
         * [BatchService.getEarliest].
         */
        @MustBeClosed
        fun getEarliest(count: Int): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getEarliest(count, BatchGetEarliestParams.none())

        /** @see getEarliest */
        @MustBeClosed
        fun getEarliest(
            count: Int,
            params: BatchGetEarliestParams = BatchGetEarliestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getEarliest(params.toBuilder().count(count).build(), requestOptions)

        /** @see getEarliest */
        @MustBeClosed
        fun getEarliest(
            count: Int,
            params: BatchGetEarliestParams = BatchGetEarliestParams.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getEarliest(count, params, RequestOptions.none())

        /** @see getEarliest */
        @MustBeClosed
        fun getEarliest(
            params: BatchGetEarliestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse>

        /** @see getEarliest */
        @MustBeClosed
        fun getEarliest(
            params: BatchGetEarliestParams
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getEarliest(params, RequestOptions.none())

        /** @see getEarliest */
        @MustBeClosed
        fun getEarliest(
            count: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getEarliest(count, BatchGetEarliestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/batch/latest/{count}`, but is otherwise the same as
         * [BatchService.getLatest].
         */
        @MustBeClosed
        fun getLatest(count: Int): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLatest(count, BatchGetLatestParams.none())

        /** @see getLatest */
        @MustBeClosed
        fun getLatest(
            count: Int,
            params: BatchGetLatestParams = BatchGetLatestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLatest(params.toBuilder().count(count).build(), requestOptions)

        /** @see getLatest */
        @MustBeClosed
        fun getLatest(
            count: Int,
            params: BatchGetLatestParams = BatchGetLatestParams.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLatest(count, params, RequestOptions.none())

        /** @see getLatest */
        @MustBeClosed
        fun getLatest(
            params: BatchGetLatestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse>

        /** @see getLatest */
        @MustBeClosed
        fun getLatest(
            params: BatchGetLatestParams
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLatest(params, RequestOptions.none())

        /** @see getLatest */
        @MustBeClosed
        fun getLatest(
            count: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLatest(count, BatchGetLatestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/batch/{offset}/next/{count}`, but is otherwise the same
         * as [BatchService.getNext].
         */
        @MustBeClosed
        fun getNext(
            count: Int,
            params: BatchGetNextParams,
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getNext(count, params, RequestOptions.none())

        /** @see getNext */
        @MustBeClosed
        fun getNext(
            count: Int,
            params: BatchGetNextParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getNext(params.toBuilder().count(count).build(), requestOptions)

        /** @see getNext */
        @MustBeClosed
        fun getNext(
            params: BatchGetNextParams
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getNext(params, RequestOptions.none())

        /** @see getNext */
        @MustBeClosed
        fun getNext(
            params: BatchGetNextParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse>

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/journal/2026-03/batch/read`, but
         * is otherwise the same as [BatchService.read].
         */
        @MustBeClosed
        fun read(params: BatchReadParams): HttpResponseFor<BatchResponseJournalFetchResponse> =
            read(params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(
            params: BatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse>

        /** @see read */
        @MustBeClosed
        fun read(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            read(
                BatchReadParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see read */
        @MustBeClosed
        fun read(
            batchInputString: BatchInputString
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            read(batchInputString, RequestOptions.none())
    }
}
