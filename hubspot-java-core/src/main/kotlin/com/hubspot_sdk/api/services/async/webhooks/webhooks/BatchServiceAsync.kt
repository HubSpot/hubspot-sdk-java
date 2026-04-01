// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.webhooks.webhooks

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.webhooks.webhooks.BatchResponseJournalFetchResponse
import com.hubspot_sdk.api.models.webhooks.webhooks.BatchResponseSubscriptionResponse
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetEarliestParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetLatestParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetLocalEarliestParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetLocalLatestParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetLocalNextParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetLocalParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetNextParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchUpdateSubscriptionsParams
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

    fun getLocal(
        params: BatchGetLocalParams
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocal(params, RequestOptions.none())

    /** @see getLocal */
    fun getLocal(
        params: BatchGetLocalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

    /** @see getLocal */
    fun getLocal(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocal(
            BatchGetLocalParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getLocal */
    fun getLocal(
        batchInputString: BatchInputString
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocal(batchInputString, RequestOptions.none())

    fun getLocalEarliest(count: Int): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalEarliest(count, BatchGetLocalEarliestParams.none())

    /** @see getLocalEarliest */
    fun getLocalEarliest(
        count: Int,
        params: BatchGetLocalEarliestParams = BatchGetLocalEarliestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalEarliest(params.toBuilder().count(count).build(), requestOptions)

    /** @see getLocalEarliest */
    fun getLocalEarliest(
        count: Int,
        params: BatchGetLocalEarliestParams = BatchGetLocalEarliestParams.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalEarliest(count, params, RequestOptions.none())

    /** @see getLocalEarliest */
    fun getLocalEarliest(
        params: BatchGetLocalEarliestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

    /** @see getLocalEarliest */
    fun getLocalEarliest(
        params: BatchGetLocalEarliestParams
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalEarliest(params, RequestOptions.none())

    /** @see getLocalEarliest */
    fun getLocalEarliest(
        count: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalEarliest(count, BatchGetLocalEarliestParams.none(), requestOptions)

    fun getLocalLatest(count: Int): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalLatest(count, BatchGetLocalLatestParams.none())

    /** @see getLocalLatest */
    fun getLocalLatest(
        count: Int,
        params: BatchGetLocalLatestParams = BatchGetLocalLatestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalLatest(params.toBuilder().count(count).build(), requestOptions)

    /** @see getLocalLatest */
    fun getLocalLatest(
        count: Int,
        params: BatchGetLocalLatestParams = BatchGetLocalLatestParams.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalLatest(count, params, RequestOptions.none())

    /** @see getLocalLatest */
    fun getLocalLatest(
        params: BatchGetLocalLatestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

    /** @see getLocalLatest */
    fun getLocalLatest(
        params: BatchGetLocalLatestParams
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalLatest(params, RequestOptions.none())

    /** @see getLocalLatest */
    fun getLocalLatest(
        count: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalLatest(count, BatchGetLocalLatestParams.none(), requestOptions)

    fun getLocalNext(
        count: Int,
        params: BatchGetLocalNextParams,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalNext(count, params, RequestOptions.none())

    /** @see getLocalNext */
    fun getLocalNext(
        count: Int,
        params: BatchGetLocalNextParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalNext(params.toBuilder().count(count).build(), requestOptions)

    /** @see getLocalNext */
    fun getLocalNext(
        params: BatchGetLocalNextParams
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalNext(params, RequestOptions.none())

    /** @see getLocalNext */
    fun getLocalNext(
        params: BatchGetLocalNextParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

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

    /** Batch create event subscriptions for the specified app. */
    fun updateSubscriptions(
        appId: Int,
        params: BatchUpdateSubscriptionsParams,
    ): CompletableFuture<BatchResponseSubscriptionResponse> =
        updateSubscriptions(appId, params, RequestOptions.none())

    /** @see updateSubscriptions */
    fun updateSubscriptions(
        appId: Int,
        params: BatchUpdateSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSubscriptionResponse> =
        updateSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateSubscriptions */
    fun updateSubscriptions(
        params: BatchUpdateSubscriptionsParams
    ): CompletableFuture<BatchResponseSubscriptionResponse> =
        updateSubscriptions(params, RequestOptions.none())

    /** @see updateSubscriptions */
    fun updateSubscriptions(
        params: BatchUpdateSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSubscriptionResponse>

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
         * Returns a raw HTTP response for `post /webhooks-journal/journal/2026-03/batch/read`, but
         * is otherwise the same as [BatchServiceAsync.getLocal].
         */
        fun getLocal(
            params: BatchGetLocalParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocal(params, RequestOptions.none())

        /** @see getLocal */
        fun getLocal(
            params: BatchGetLocalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>>

        /** @see getLocal */
        fun getLocal(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocal(
                BatchGetLocalParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see getLocal */
        fun getLocal(
            batchInputString: BatchInputString
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocal(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/batch/earliest/{count}`, but is otherwise the
         * same as [BatchServiceAsync.getLocalEarliest].
         */
        fun getLocalEarliest(
            count: Int
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalEarliest(count, BatchGetLocalEarliestParams.none())

        /** @see getLocalEarliest */
        fun getLocalEarliest(
            count: Int,
            params: BatchGetLocalEarliestParams = BatchGetLocalEarliestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalEarliest(params.toBuilder().count(count).build(), requestOptions)

        /** @see getLocalEarliest */
        fun getLocalEarliest(
            count: Int,
            params: BatchGetLocalEarliestParams = BatchGetLocalEarliestParams.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalEarliest(count, params, RequestOptions.none())

        /** @see getLocalEarliest */
        fun getLocalEarliest(
            params: BatchGetLocalEarliestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>>

        /** @see getLocalEarliest */
        fun getLocalEarliest(
            params: BatchGetLocalEarliestParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalEarliest(params, RequestOptions.none())

        /** @see getLocalEarliest */
        fun getLocalEarliest(
            count: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalEarliest(count, BatchGetLocalEarliestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/batch/latest/{count}`, but is otherwise the same
         * as [BatchServiceAsync.getLocalLatest].
         */
        fun getLocalLatest(
            count: Int
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalLatest(count, BatchGetLocalLatestParams.none())

        /** @see getLocalLatest */
        fun getLocalLatest(
            count: Int,
            params: BatchGetLocalLatestParams = BatchGetLocalLatestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalLatest(params.toBuilder().count(count).build(), requestOptions)

        /** @see getLocalLatest */
        fun getLocalLatest(
            count: Int,
            params: BatchGetLocalLatestParams = BatchGetLocalLatestParams.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalLatest(count, params, RequestOptions.none())

        /** @see getLocalLatest */
        fun getLocalLatest(
            params: BatchGetLocalLatestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>>

        /** @see getLocalLatest */
        fun getLocalLatest(
            params: BatchGetLocalLatestParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalLatest(params, RequestOptions.none())

        /** @see getLocalLatest */
        fun getLocalLatest(
            count: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalLatest(count, BatchGetLocalLatestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/batch/{offset}/next/{count}`, but is otherwise
         * the same as [BatchServiceAsync.getLocalNext].
         */
        fun getLocalNext(
            count: Int,
            params: BatchGetLocalNextParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalNext(count, params, RequestOptions.none())

        /** @see getLocalNext */
        fun getLocalNext(
            count: Int,
            params: BatchGetLocalNextParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalNext(params.toBuilder().count(count).build(), requestOptions)

        /** @see getLocalNext */
        fun getLocalNext(
            params: BatchGetLocalNextParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalNext(params, RequestOptions.none())

        /** @see getLocalNext */
        fun getLocalNext(
            params: BatchGetLocalNextParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>>

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
         * Returns a raw HTTP response for `post
         * /webhooks/2026-03/{appId}/subscriptions/batch/update`, but is otherwise the same as
         * [BatchServiceAsync.updateSubscriptions].
         */
        fun updateSubscriptions(
            appId: Int,
            params: BatchUpdateSubscriptionsParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>> =
            updateSubscriptions(appId, params, RequestOptions.none())

        /** @see updateSubscriptions */
        fun updateSubscriptions(
            appId: Int,
            params: BatchUpdateSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>> =
            updateSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateSubscriptions */
        fun updateSubscriptions(
            params: BatchUpdateSubscriptionsParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>> =
            updateSubscriptions(params, RequestOptions.none())

        /** @see updateSubscriptions */
        fun updateSubscriptions(
            params: BatchUpdateSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>>
    }
}
