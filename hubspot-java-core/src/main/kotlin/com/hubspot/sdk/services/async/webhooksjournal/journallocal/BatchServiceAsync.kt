// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.webhooksjournal.journallocal

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.BatchInputString
import com.hubspot.sdk.models.BatchResponseJournalFetchResponse
import com.hubspot.sdk.models.webhooksjournal.journallocal.batch.BatchGetEarliestParams
import com.hubspot.sdk.models.webhooksjournal.journallocal.batch.BatchGetFromOffsetParams
import com.hubspot.sdk.models.webhooksjournal.journallocal.batch.BatchGetParams
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
     * Execute a batch read operation on the webhooks journal. This endpoint allows you to retrieve
     * a batch of webhook journal entries by providing the necessary input data. It is useful for
     * processing multiple records in a single request, streamlining data retrieval tasks.
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
     * Retrieve the earliest batch of webhook journal entries. This endpoint is useful for accessing
     * the oldest available data in the webhook journal, allowing users to process or analyze
     * historical webhook events. The number of entries to fetch is specified by the 'count' path
     * parameter.
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
     * is useful for paginating through large sets of webhook data. The number of entries returned
     * is determined by the 'count' parameter.
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
         * Returns a raw HTTP response for `post
         * /webhooks-journal/journal-local/2026-03/batch/read`, but is otherwise the same as
         * [BatchServiceAsync.get].
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
         * /webhooks-journal/journal-local/2026-03/batch/earliest/{count}`, but is otherwise the
         * same as [BatchServiceAsync.getEarliest].
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
         * /webhooks-journal/journal-local/2026-03/batch/{offset}/next/{count}`, but is otherwise
         * the same as [BatchServiceAsync.getFromOffset].
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
    }
}
