// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.webhooksjournal

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.SnapshotStatusResponse
import com.hubspot.sdk.models.webhooksjournal.journallocal.JournalLocalGetEarliestParams
import com.hubspot.sdk.models.webhooksjournal.journallocal.JournalLocalGetLatestParams
import com.hubspot.sdk.models.webhooksjournal.journallocal.JournalLocalGetNextFromOffsetParams
import com.hubspot.sdk.models.webhooksjournal.journallocal.JournalLocalGetStatusParams
import com.hubspot.sdk.services.async.webhooksjournal.journallocal.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface JournalLocalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JournalLocalServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Retrieve the earliest webhook journal entries for the specified portal. This endpoint can be
     * used to access the oldest records available in the webhook journal, which may be useful for
     * auditing or historical analysis.
     */
    fun getEarliest(): CompletableFuture<HttpResponse> =
        getEarliest(JournalLocalGetEarliestParams.none())

    /** @see getEarliest */
    fun getEarliest(
        params: JournalLocalGetEarliestParams = JournalLocalGetEarliestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getEarliest */
    fun getEarliest(
        params: JournalLocalGetEarliestParams = JournalLocalGetEarliestParams.none()
    ): CompletableFuture<HttpResponse> = getEarliest(params, RequestOptions.none())

    /** @see getEarliest */
    fun getEarliest(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        getEarliest(JournalLocalGetEarliestParams.none(), requestOptions)

    /**
     * Retrieve the latest entries from the webhooks journal for the specified portal. This endpoint
     * is useful for accessing the most recent webhook events and their statuses, allowing you to
     * monitor and debug webhook activity effectively.
     */
    fun getLatest(): CompletableFuture<HttpResponse> = getLatest(JournalLocalGetLatestParams.none())

    /** @see getLatest */
    fun getLatest(
        params: JournalLocalGetLatestParams = JournalLocalGetLatestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getLatest */
    fun getLatest(
        params: JournalLocalGetLatestParams = JournalLocalGetLatestParams.none()
    ): CompletableFuture<HttpResponse> = getLatest(params, RequestOptions.none())

    /** @see getLatest */
    fun getLatest(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        getLatest(JournalLocalGetLatestParams.none(), requestOptions)

    /**
     * Retrieve the next set of webhook journal entries starting from a specified offset. This
     * endpoint is useful for paginating through large sets of webhook data, allowing you to
     * continue from where a previous request left off.
     */
    fun getNextFromOffset(offset: String): CompletableFuture<HttpResponse> =
        getNextFromOffset(offset, JournalLocalGetNextFromOffsetParams.none())

    /** @see getNextFromOffset */
    fun getNextFromOffset(
        offset: String,
        params: JournalLocalGetNextFromOffsetParams = JournalLocalGetNextFromOffsetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        getNextFromOffset(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getNextFromOffset */
    fun getNextFromOffset(
        offset: String,
        params: JournalLocalGetNextFromOffsetParams = JournalLocalGetNextFromOffsetParams.none(),
    ): CompletableFuture<HttpResponse> = getNextFromOffset(offset, params, RequestOptions.none())

    /** @see getNextFromOffset */
    fun getNextFromOffset(
        params: JournalLocalGetNextFromOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getNextFromOffset */
    fun getNextFromOffset(
        params: JournalLocalGetNextFromOffsetParams
    ): CompletableFuture<HttpResponse> = getNextFromOffset(params, RequestOptions.none())

    /** @see getNextFromOffset */
    fun getNextFromOffset(
        offset: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        getNextFromOffset(offset, JournalLocalGetNextFromOffsetParams.none(), requestOptions)

    /**
     * Retrieve the status of a specific webhook journal entry using its unique status ID. This
     * endpoint is useful for monitoring the progress or outcome of webhook journal entries,
     * allowing you to check if an entry is pending, in progress, completed, failed, or expired.
     */
    fun getStatus(statusId: String): CompletableFuture<SnapshotStatusResponse> =
        getStatus(statusId, JournalLocalGetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        statusId: String,
        params: JournalLocalGetStatusParams = JournalLocalGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotStatusResponse> =
        getStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(
        statusId: String,
        params: JournalLocalGetStatusParams = JournalLocalGetStatusParams.none(),
    ): CompletableFuture<SnapshotStatusResponse> =
        getStatus(statusId, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: JournalLocalGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotStatusResponse>

    /** @see getStatus */
    fun getStatus(params: JournalLocalGetStatusParams): CompletableFuture<SnapshotStatusResponse> =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        statusId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SnapshotStatusResponse> =
        getStatus(statusId, JournalLocalGetStatusParams.none(), requestOptions)

    /**
     * A view of [JournalLocalServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JournalLocalServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/earliest`,
         * but is otherwise the same as [JournalLocalServiceAsync.getEarliest].
         */
        fun getEarliest(): CompletableFuture<HttpResponse> =
            getEarliest(JournalLocalGetEarliestParams.none())

        /** @see getEarliest */
        fun getEarliest(
            params: JournalLocalGetEarliestParams = JournalLocalGetEarliestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getEarliest */
        fun getEarliest(
            params: JournalLocalGetEarliestParams = JournalLocalGetEarliestParams.none()
        ): CompletableFuture<HttpResponse> = getEarliest(params, RequestOptions.none())

        /** @see getEarliest */
        fun getEarliest(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getEarliest(JournalLocalGetEarliestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal/2026-03/latest`, but is
         * otherwise the same as [JournalLocalServiceAsync.getLatest].
         */
        fun getLatest(): CompletableFuture<HttpResponse> =
            getLatest(JournalLocalGetLatestParams.none())

        /** @see getLatest */
        fun getLatest(
            params: JournalLocalGetLatestParams = JournalLocalGetLatestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getLatest */
        fun getLatest(
            params: JournalLocalGetLatestParams = JournalLocalGetLatestParams.none()
        ): CompletableFuture<HttpResponse> = getLatest(params, RequestOptions.none())

        /** @see getLatest */
        fun getLatest(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getLatest(JournalLocalGetLatestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/offset/{offset}/next`, but is otherwise the same
         * as [JournalLocalServiceAsync.getNextFromOffset].
         */
        fun getNextFromOffset(offset: String): CompletableFuture<HttpResponse> =
            getNextFromOffset(offset, JournalLocalGetNextFromOffsetParams.none())

        /** @see getNextFromOffset */
        fun getNextFromOffset(
            offset: String,
            params: JournalLocalGetNextFromOffsetParams =
                JournalLocalGetNextFromOffsetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getNextFromOffset(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getNextFromOffset */
        fun getNextFromOffset(
            offset: String,
            params: JournalLocalGetNextFromOffsetParams = JournalLocalGetNextFromOffsetParams.none(),
        ): CompletableFuture<HttpResponse> =
            getNextFromOffset(offset, params, RequestOptions.none())

        /** @see getNextFromOffset */
        fun getNextFromOffset(
            params: JournalLocalGetNextFromOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getNextFromOffset */
        fun getNextFromOffset(
            params: JournalLocalGetNextFromOffsetParams
        ): CompletableFuture<HttpResponse> = getNextFromOffset(params, RequestOptions.none())

        /** @see getNextFromOffset */
        fun getNextFromOffset(
            offset: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            getNextFromOffset(offset, JournalLocalGetNextFromOffsetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/status/{statusId}`, but is otherwise the same as
         * [JournalLocalServiceAsync.getStatus].
         */
        fun getStatus(
            statusId: String
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getStatus(statusId, JournalLocalGetStatusParams.none())

        /** @see getStatus */
        fun getStatus(
            statusId: String,
            params: JournalLocalGetStatusParams = JournalLocalGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

        /** @see getStatus */
        fun getStatus(
            statusId: String,
            params: JournalLocalGetStatusParams = JournalLocalGetStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getStatus(statusId, params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            params: JournalLocalGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>>

        /** @see getStatus */
        fun getStatus(
            params: JournalLocalGetStatusParams
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            statusId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getStatus(statusId, JournalLocalGetStatusParams.none(), requestOptions)
    }
}
