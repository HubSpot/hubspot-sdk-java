// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.webhooks.webhooks

import com.google.errorprone.annotations.MustBeClosed
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

    fun get(params: BatchGetParams): BatchResponseJournalFetchResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse

    /** @see get */
    fun get(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse =
        get(BatchGetParams.builder().batchInputString(batchInputString).build(), requestOptions)

    /** @see get */
    fun get(batchInputString: BatchInputString): BatchResponseJournalFetchResponse =
        get(batchInputString, RequestOptions.none())

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

    fun getLocal(params: BatchGetLocalParams): BatchResponseJournalFetchResponse =
        getLocal(params, RequestOptions.none())

    /** @see getLocal */
    fun getLocal(
        params: BatchGetLocalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse

    /** @see getLocal */
    fun getLocal(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse =
        getLocal(
            BatchGetLocalParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getLocal */
    fun getLocal(batchInputString: BatchInputString): BatchResponseJournalFetchResponse =
        getLocal(batchInputString, RequestOptions.none())

    fun getLocalEarliest(count: Int): BatchResponseJournalFetchResponse =
        getLocalEarliest(count, BatchGetLocalEarliestParams.none())

    /** @see getLocalEarliest */
    fun getLocalEarliest(
        count: Int,
        params: BatchGetLocalEarliestParams = BatchGetLocalEarliestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse =
        getLocalEarliest(params.toBuilder().count(count).build(), requestOptions)

    /** @see getLocalEarliest */
    fun getLocalEarliest(
        count: Int,
        params: BatchGetLocalEarliestParams = BatchGetLocalEarliestParams.none(),
    ): BatchResponseJournalFetchResponse = getLocalEarliest(count, params, RequestOptions.none())

    /** @see getLocalEarliest */
    fun getLocalEarliest(
        params: BatchGetLocalEarliestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse

    /** @see getLocalEarliest */
    fun getLocalEarliest(params: BatchGetLocalEarliestParams): BatchResponseJournalFetchResponse =
        getLocalEarliest(params, RequestOptions.none())

    /** @see getLocalEarliest */
    fun getLocalEarliest(
        count: Int,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        getLocalEarliest(count, BatchGetLocalEarliestParams.none(), requestOptions)

    fun getLocalLatest(count: Int): BatchResponseJournalFetchResponse =
        getLocalLatest(count, BatchGetLocalLatestParams.none())

    /** @see getLocalLatest */
    fun getLocalLatest(
        count: Int,
        params: BatchGetLocalLatestParams = BatchGetLocalLatestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse =
        getLocalLatest(params.toBuilder().count(count).build(), requestOptions)

    /** @see getLocalLatest */
    fun getLocalLatest(
        count: Int,
        params: BatchGetLocalLatestParams = BatchGetLocalLatestParams.none(),
    ): BatchResponseJournalFetchResponse = getLocalLatest(count, params, RequestOptions.none())

    /** @see getLocalLatest */
    fun getLocalLatest(
        params: BatchGetLocalLatestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse

    /** @see getLocalLatest */
    fun getLocalLatest(params: BatchGetLocalLatestParams): BatchResponseJournalFetchResponse =
        getLocalLatest(params, RequestOptions.none())

    /** @see getLocalLatest */
    fun getLocalLatest(
        count: Int,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        getLocalLatest(count, BatchGetLocalLatestParams.none(), requestOptions)

    fun getLocalNext(
        count: Int,
        params: BatchGetLocalNextParams,
    ): BatchResponseJournalFetchResponse = getLocalNext(count, params, RequestOptions.none())

    /** @see getLocalNext */
    fun getLocalNext(
        count: Int,
        params: BatchGetLocalNextParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse =
        getLocalNext(params.toBuilder().count(count).build(), requestOptions)

    /** @see getLocalNext */
    fun getLocalNext(params: BatchGetLocalNextParams): BatchResponseJournalFetchResponse =
        getLocalNext(params, RequestOptions.none())

    /** @see getLocalNext */
    fun getLocalNext(
        params: BatchGetLocalNextParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse

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

    /** Batch create event subscriptions for the specified app. */
    fun updateSubscriptions(
        appId: Int,
        params: BatchUpdateSubscriptionsParams,
    ): BatchResponseSubscriptionResponse = updateSubscriptions(appId, params, RequestOptions.none())

    /** @see updateSubscriptions */
    fun updateSubscriptions(
        appId: Int,
        params: BatchUpdateSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSubscriptionResponse =
        updateSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateSubscriptions */
    fun updateSubscriptions(
        params: BatchUpdateSubscriptionsParams
    ): BatchResponseSubscriptionResponse = updateSubscriptions(params, RequestOptions.none())

    /** @see updateSubscriptions */
    fun updateSubscriptions(
        params: BatchUpdateSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSubscriptionResponse

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
         * /webhooks-journal/journal-local/2026-03/batch/read`, but is otherwise the same as
         * [BatchService.get].
         */
        @MustBeClosed
        fun get(params: BatchGetParams): HttpResponseFor<BatchResponseJournalFetchResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse>

        /** @see get */
        @MustBeClosed
        fun get(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            get(BatchGetParams.builder().batchInputString(batchInputString).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            batchInputString: BatchInputString
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            get(batchInputString, RequestOptions.none())

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
         * Returns a raw HTTP response for `post /webhooks-journal/journal/2026-03/batch/read`, but
         * is otherwise the same as [BatchService.getLocal].
         */
        @MustBeClosed
        fun getLocal(
            params: BatchGetLocalParams
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocal(params, RequestOptions.none())

        /** @see getLocal */
        @MustBeClosed
        fun getLocal(
            params: BatchGetLocalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse>

        /** @see getLocal */
        @MustBeClosed
        fun getLocal(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocal(
                BatchGetLocalParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see getLocal */
        @MustBeClosed
        fun getLocal(
            batchInputString: BatchInputString
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocal(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/batch/earliest/{count}`, but is otherwise the
         * same as [BatchService.getLocalEarliest].
         */
        @MustBeClosed
        fun getLocalEarliest(count: Int): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalEarliest(count, BatchGetLocalEarliestParams.none())

        /** @see getLocalEarliest */
        @MustBeClosed
        fun getLocalEarliest(
            count: Int,
            params: BatchGetLocalEarliestParams = BatchGetLocalEarliestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalEarliest(params.toBuilder().count(count).build(), requestOptions)

        /** @see getLocalEarliest */
        @MustBeClosed
        fun getLocalEarliest(
            count: Int,
            params: BatchGetLocalEarliestParams = BatchGetLocalEarliestParams.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalEarliest(count, params, RequestOptions.none())

        /** @see getLocalEarliest */
        @MustBeClosed
        fun getLocalEarliest(
            params: BatchGetLocalEarliestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse>

        /** @see getLocalEarliest */
        @MustBeClosed
        fun getLocalEarliest(
            params: BatchGetLocalEarliestParams
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalEarliest(params, RequestOptions.none())

        /** @see getLocalEarliest */
        @MustBeClosed
        fun getLocalEarliest(
            count: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalEarliest(count, BatchGetLocalEarliestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/batch/latest/{count}`, but is otherwise the same
         * as [BatchService.getLocalLatest].
         */
        @MustBeClosed
        fun getLocalLatest(count: Int): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalLatest(count, BatchGetLocalLatestParams.none())

        /** @see getLocalLatest */
        @MustBeClosed
        fun getLocalLatest(
            count: Int,
            params: BatchGetLocalLatestParams = BatchGetLocalLatestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalLatest(params.toBuilder().count(count).build(), requestOptions)

        /** @see getLocalLatest */
        @MustBeClosed
        fun getLocalLatest(
            count: Int,
            params: BatchGetLocalLatestParams = BatchGetLocalLatestParams.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalLatest(count, params, RequestOptions.none())

        /** @see getLocalLatest */
        @MustBeClosed
        fun getLocalLatest(
            params: BatchGetLocalLatestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse>

        /** @see getLocalLatest */
        @MustBeClosed
        fun getLocalLatest(
            params: BatchGetLocalLatestParams
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalLatest(params, RequestOptions.none())

        /** @see getLocalLatest */
        @MustBeClosed
        fun getLocalLatest(
            count: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalLatest(count, BatchGetLocalLatestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/batch/{offset}/next/{count}`, but is otherwise
         * the same as [BatchService.getLocalNext].
         */
        @MustBeClosed
        fun getLocalNext(
            count: Int,
            params: BatchGetLocalNextParams,
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalNext(count, params, RequestOptions.none())

        /** @see getLocalNext */
        @MustBeClosed
        fun getLocalNext(
            count: Int,
            params: BatchGetLocalNextParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalNext(params.toBuilder().count(count).build(), requestOptions)

        /** @see getLocalNext */
        @MustBeClosed
        fun getLocalNext(
            params: BatchGetLocalNextParams
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalNext(params, RequestOptions.none())

        /** @see getLocalNext */
        @MustBeClosed
        fun getLocalNext(
            params: BatchGetLocalNextParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse>

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
         * Returns a raw HTTP response for `post
         * /webhooks/2026-03/{appId}/subscriptions/batch/update`, but is otherwise the same as
         * [BatchService.updateSubscriptions].
         */
        @MustBeClosed
        fun updateSubscriptions(
            appId: Int,
            params: BatchUpdateSubscriptionsParams,
        ): HttpResponseFor<BatchResponseSubscriptionResponse> =
            updateSubscriptions(appId, params, RequestOptions.none())

        /** @see updateSubscriptions */
        @MustBeClosed
        fun updateSubscriptions(
            appId: Int,
            params: BatchUpdateSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSubscriptionResponse> =
            updateSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateSubscriptions */
        @MustBeClosed
        fun updateSubscriptions(
            params: BatchUpdateSubscriptionsParams
        ): HttpResponseFor<BatchResponseSubscriptionResponse> =
            updateSubscriptions(params, RequestOptions.none())

        /** @see updateSubscriptions */
        @MustBeClosed
        fun updateSubscriptions(
            params: BatchUpdateSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSubscriptionResponse>
    }
}
