// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.webhooks.webhooks

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

    /** Batch create event subscriptions for the specified app. */
    fun create(
        appId: Int,
        params: BatchCreateParams,
    ): CompletableFuture<BatchResponseSubscriptionResponse> =
        create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSubscriptionResponse> =
        create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(params: BatchCreateParams): CompletableFuture<BatchResponseSubscriptionResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSubscriptionResponse>

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

    fun getNext(
        count: Int,
        params: BatchGetNextParams,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getNext(count, params, RequestOptions.none())

    /** @see getNext */
    fun getNext(
        count: Int,
        params: BatchGetNextParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getNext(params.toBuilder().count(count).build(), requestOptions)

    /** @see getNext */
    fun getNext(params: BatchGetNextParams): CompletableFuture<BatchResponseJournalFetchResponse> =
        getNext(params, RequestOptions.none())

    /** @see getNext */
    fun getNext(
        params: BatchGetNextParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

    fun read(params: BatchReadParams): CompletableFuture<BatchResponseJournalFetchResponse> =
        read(params, RequestOptions.none())

    /** @see read */
    fun read(
        params: BatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

    /** @see read */
    fun read(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        read(BatchReadParams.builder().batchInputString(batchInputString).build(), requestOptions)

    /** @see read */
    fun read(
        batchInputString: BatchInputString
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        read(batchInputString, RequestOptions.none())

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
         * /webhooks/2026-03/{appId}/subscriptions/batch/update`, but is otherwise the same as
         * [BatchServiceAsync.create].
         */
        fun create(
            appId: Int,
            params: BatchCreateParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>> =
            create(appId, params, RequestOptions.none())

        /** @see create */
        fun create(
            appId: Int,
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        fun create(
            params: BatchCreateParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>>

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

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/batch/{offset}/next/{count}`, but is otherwise the same
         * as [BatchServiceAsync.getNext].
         */
        fun getNext(
            count: Int,
            params: BatchGetNextParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getNext(count, params, RequestOptions.none())

        /** @see getNext */
        fun getNext(
            count: Int,
            params: BatchGetNextParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getNext(params.toBuilder().count(count).build(), requestOptions)

        /** @see getNext */
        fun getNext(
            params: BatchGetNextParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getNext(params, RequestOptions.none())

        /** @see getNext */
        fun getNext(
            params: BatchGetNextParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>>

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/journal/2026-03/batch/read`, but
         * is otherwise the same as [BatchServiceAsync.read].
         */
        fun read(
            params: BatchReadParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            read(params, RequestOptions.none())

        /** @see read */
        fun read(
            params: BatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>>

        /** @see read */
        fun read(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            read(
                BatchReadParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see read */
        fun read(
            batchInputString: BatchInputString
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            read(batchInputString, RequestOptions.none())
    }
}
