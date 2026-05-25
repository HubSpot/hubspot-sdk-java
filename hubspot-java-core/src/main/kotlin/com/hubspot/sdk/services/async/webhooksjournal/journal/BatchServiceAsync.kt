// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.webhooksjournal.journal

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.BatchInputString
import com.hubspot.sdk.models.BatchResponseJournalFetchResponse
import com.hubspot.sdk.models.webhooksjournal.journal.batch.BatchGetEarliestParams
import com.hubspot.sdk.models.webhooksjournal.journal.batch.BatchGetFromOffsetParams
import com.hubspot.sdk.models.webhooksjournal.journal.batch.BatchGetLatestParams
import com.hubspot.sdk.models.webhooksjournal.journal.batch.BatchGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchServiceAsync

    /**
     * Execute a batch read operation on the webhooks journal for the specified date, 2026-03. This
     * endpoint allows you to retrieve multiple entries from the webhooks journal in a single
     * request, which can be useful for processing large amounts of data efficiently. Ensure that
     * the request body is provided in the required format.
     */
    fun get(params: BatchGetParams): CompletableFuture<BatchResponseJournalFetchResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

    /** @see get */
    fun get(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        get(BatchGetParams.builder().batchInputString(batchInputString).build(), requestOptions)

    /** @see get */
    fun get(
        batchInputString: BatchInputString
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        get(batchInputString, RequestOptions.none())

    /**
     * Retrieve the earliest batch of webhook journal entries for a specified count. This endpoint
     * is useful for accessing historical webhook data in batches, allowing you to process or
     * analyze older entries. The number of entries retrieved is determined by the count parameter.
     */
    fun getEarliest(count: Int): CompletableFuture<BatchResponseJournalFetchResponse> =
        getEarliest(count, BatchGetEarliestParams.none())

    /** @see getEarliest */
    fun getEarliest(
        count: Int,
        params: BatchGetEarliestParams = BatchGetEarliestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getEarliest(params.toBuilder().count(count).build(), requestOptions)

    /** @see getEarliest */
    fun getEarliest(
        count: Int,
        params: BatchGetEarliestParams = BatchGetEarliestParams.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getEarliest(count, params, RequestOptions.none())

    /** @see getEarliest */
    fun getEarliest(
        params: BatchGetEarliestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

    /** @see getEarliest */
    fun getEarliest(
        params: BatchGetEarliestParams
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getEarliest(params, RequestOptions.none())

    /** @see getEarliest */
    fun getEarliest(
        count: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getEarliest(count, BatchGetEarliestParams.none(), requestOptions)

    /**
     * Retrieve a batch of webhook journal entries starting from a specified offset. This endpoint
     * allows you to fetch a defined number of entries, which can be useful for processing large
     * datasets in manageable chunks.
     */
    fun getFromOffset(
        count: Int,
        params: BatchGetFromOffsetParams,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getFromOffset(count, params, RequestOptions.none())

    /** @see getFromOffset */
    fun getFromOffset(
        count: Int,
        params: BatchGetFromOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getFromOffset(params.toBuilder().count(count).build(), requestOptions)

    /** @see getFromOffset */
    fun getFromOffset(
        params: BatchGetFromOffsetParams
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getFromOffset(params, RequestOptions.none())

    /** @see getFromOffset */
    fun getFromOffset(
        params: BatchGetFromOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

    /**
     * Retrieve the latest batch of webhook journal entries up to the specified count. This endpoint
     * is useful for fetching recent webhook data for analysis or processing. The count parameter
     * determines the maximum number of entries to return.
     */
    fun getLatest(count: Int): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLatest(count, BatchGetLatestParams.none())

    /** @see getLatest */
    fun getLatest(
        count: Int,
        params: BatchGetLatestParams = BatchGetLatestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLatest(params.toBuilder().count(count).build(), requestOptions)

    /** @see getLatest */
    fun getLatest(
        count: Int,
        params: BatchGetLatestParams = BatchGetLatestParams.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLatest(count, params, RequestOptions.none())

    /** @see getLatest */
    fun getLatest(
        params: BatchGetLatestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

    /** @see getLatest */
    fun getLatest(
        params: BatchGetLatestParams
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLatest(params, RequestOptions.none())

    /** @see getLatest */
    fun getLatest(
        count: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLatest(count, BatchGetLatestParams.none(), requestOptions)

    /** A view of [BatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/journal/2026-03/batch/read`, but
         * is otherwise the same as [BatchServiceAsync.get].
         */
        fun get(
            params: BatchGetParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>>

        /** @see get */
        fun get(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            get(BatchGetParams.builder().batchInputString(batchInputString).build(), requestOptions)

        /** @see get */
        fun get(
            batchInputString: BatchInputString
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            get(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/batch/earliest/{count}`, but is otherwise the same as
         * [BatchServiceAsync.getEarliest].
         */
        fun getEarliest(
            count: Int
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getEarliest(count, BatchGetEarliestParams.none())

        /** @see getEarliest */
        fun getEarliest(
            count: Int,
            params: BatchGetEarliestParams = BatchGetEarliestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getEarliest(params.toBuilder().count(count).build(), requestOptions)

        /** @see getEarliest */
        fun getEarliest(
            count: Int,
            params: BatchGetEarliestParams = BatchGetEarliestParams.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getEarliest(count, params, RequestOptions.none())

        /** @see getEarliest */
        fun getEarliest(
            params: BatchGetEarliestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>>

        /** @see getEarliest */
        fun getEarliest(
            params: BatchGetEarliestParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getEarliest(params, RequestOptions.none())

        /** @see getEarliest */
        fun getEarliest(
            count: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getEarliest(count, BatchGetEarliestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/batch/{offset}/next/{count}`, but is otherwise the same
         * as [BatchServiceAsync.getFromOffset].
         */
        fun getFromOffset(
            count: Int,
            params: BatchGetFromOffsetParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getFromOffset(count, params, RequestOptions.none())

        /** @see getFromOffset */
        fun getFromOffset(
            count: Int,
            params: BatchGetFromOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getFromOffset(params.toBuilder().count(count).build(), requestOptions)

        /** @see getFromOffset */
        fun getFromOffset(
            params: BatchGetFromOffsetParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getFromOffset(params, RequestOptions.none())

        /** @see getFromOffset */
        fun getFromOffset(
            params: BatchGetFromOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/batch/latest/{count}`, but is otherwise the same as
         * [BatchServiceAsync.getLatest].
         */
        fun getLatest(
            count: Int
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLatest(count, BatchGetLatestParams.none())

        /** @see getLatest */
        fun getLatest(
            count: Int,
            params: BatchGetLatestParams = BatchGetLatestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLatest(params.toBuilder().count(count).build(), requestOptions)

        /** @see getLatest */
        fun getLatest(
            count: Int,
            params: BatchGetLatestParams = BatchGetLatestParams.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLatest(count, params, RequestOptions.none())

        /** @see getLatest */
        fun getLatest(
            params: BatchGetLatestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>>

        /** @see getLatest */
        fun getLatest(
            params: BatchGetLatestParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLatest(params, RequestOptions.none())

        /** @see getLatest */
        fun getLatest(
            count: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLatest(count, BatchGetLatestParams.none(), requestOptions)
    }
}
