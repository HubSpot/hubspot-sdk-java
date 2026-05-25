// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.webhooksjournal

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.SnapshotStatusResponse
import com.hubspot.sdk.models.webhooksjournal.journal.JournalGetEarliestParams
import com.hubspot.sdk.models.webhooksjournal.journal.JournalGetNextFromOffsetParams
import com.hubspot.sdk.models.webhooksjournal.journal.JournalGetStatusParams
import com.hubspot.sdk.services.async.webhooksjournal.journal.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface JournalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JournalServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Retrieve the earliest entry from the webhooks journal for the specified portal. This endpoint
     * is useful for accessing the first recorded webhook event in the journal, which can be helpful
     * for auditing or debugging purposes.
     */
    fun getEarliest(): CompletableFuture<HttpResponse> =
        getEarliest(JournalGetEarliestParams.none())

    /** @see getEarliest */
    fun getEarliest(
        params: JournalGetEarliestParams = JournalGetEarliestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getEarliest */
    fun getEarliest(
        params: JournalGetEarliestParams = JournalGetEarliestParams.none()
    ): CompletableFuture<HttpResponse> = getEarliest(params, RequestOptions.none())

    /** @see getEarliest */
    fun getEarliest(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        getEarliest(JournalGetEarliestParams.none(), requestOptions)

    /**
     * Retrieve the next set of entries from the webhooks journal starting from a specified offset.
     * This endpoint is useful for paginating through journal entries to process or analyze webhook
     * events sequentially.
     */
    fun getNextFromOffset(offset: String): CompletableFuture<HttpResponse> =
        getNextFromOffset(offset, JournalGetNextFromOffsetParams.none())

    /** @see getNextFromOffset */
    fun getNextFromOffset(
        offset: String,
        params: JournalGetNextFromOffsetParams = JournalGetNextFromOffsetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        getNextFromOffset(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getNextFromOffset */
    fun getNextFromOffset(
        offset: String,
        params: JournalGetNextFromOffsetParams = JournalGetNextFromOffsetParams.none(),
    ): CompletableFuture<HttpResponse> = getNextFromOffset(offset, params, RequestOptions.none())

    /** @see getNextFromOffset */
    fun getNextFromOffset(
        params: JournalGetNextFromOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getNextFromOffset */
    fun getNextFromOffset(params: JournalGetNextFromOffsetParams): CompletableFuture<HttpResponse> =
        getNextFromOffset(params, RequestOptions.none())

    /** @see getNextFromOffset */
    fun getNextFromOffset(
        offset: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        getNextFromOffset(offset, JournalGetNextFromOffsetParams.none(), requestOptions)

    /**
     * Retrieve the status of a specific webhook journal entry using its unique status ID. This
     * endpoint provides detailed information about the status, including whether it is pending, in
     * progress, completed, failed, or expired. It is useful for monitoring and managing the state
     * of webhook journal entries.
     */
    fun getStatus(statusId: String): CompletableFuture<SnapshotStatusResponse> =
        getStatus(statusId, JournalGetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        statusId: String,
        params: JournalGetStatusParams = JournalGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotStatusResponse> =
        getStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(
        statusId: String,
        params: JournalGetStatusParams = JournalGetStatusParams.none(),
    ): CompletableFuture<SnapshotStatusResponse> =
        getStatus(statusId, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: JournalGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotStatusResponse>

    /** @see getStatus */
    fun getStatus(params: JournalGetStatusParams): CompletableFuture<SnapshotStatusResponse> =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        statusId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SnapshotStatusResponse> =
        getStatus(statusId, JournalGetStatusParams.none(), requestOptions)

    /**
     * A view of [JournalServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JournalServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal/2026-03/earliest`, but is
         * otherwise the same as [JournalServiceAsync.getEarliest].
         */
        fun getEarliest(): CompletableFuture<HttpResponse> =
            getEarliest(JournalGetEarliestParams.none())

        /** @see getEarliest */
        fun getEarliest(
            params: JournalGetEarliestParams = JournalGetEarliestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getEarliest */
        fun getEarliest(
            params: JournalGetEarliestParams = JournalGetEarliestParams.none()
        ): CompletableFuture<HttpResponse> = getEarliest(params, RequestOptions.none())

        /** @see getEarliest */
        fun getEarliest(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getEarliest(JournalGetEarliestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/offset/{offset}/next`, but is otherwise the same as
         * [JournalServiceAsync.getNextFromOffset].
         */
        fun getNextFromOffset(offset: String): CompletableFuture<HttpResponse> =
            getNextFromOffset(offset, JournalGetNextFromOffsetParams.none())

        /** @see getNextFromOffset */
        fun getNextFromOffset(
            offset: String,
            params: JournalGetNextFromOffsetParams = JournalGetNextFromOffsetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getNextFromOffset(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getNextFromOffset */
        fun getNextFromOffset(
            offset: String,
            params: JournalGetNextFromOffsetParams = JournalGetNextFromOffsetParams.none(),
        ): CompletableFuture<HttpResponse> =
            getNextFromOffset(offset, params, RequestOptions.none())

        /** @see getNextFromOffset */
        fun getNextFromOffset(
            params: JournalGetNextFromOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getNextFromOffset */
        fun getNextFromOffset(
            params: JournalGetNextFromOffsetParams
        ): CompletableFuture<HttpResponse> = getNextFromOffset(params, RequestOptions.none())

        /** @see getNextFromOffset */
        fun getNextFromOffset(
            offset: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            getNextFromOffset(offset, JournalGetNextFromOffsetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/status/{statusId}`, but is otherwise the same as
         * [JournalServiceAsync.getStatus].
         */
        fun getStatus(
            statusId: String
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getStatus(statusId, JournalGetStatusParams.none())

        /** @see getStatus */
        fun getStatus(
            statusId: String,
            params: JournalGetStatusParams = JournalGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

        /** @see getStatus */
        fun getStatus(
            statusId: String,
            params: JournalGetStatusParams = JournalGetStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getStatus(statusId, params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            params: JournalGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>>

        /** @see getStatus */
        fun getStatus(
            params: JournalGetStatusParams
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            statusId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getStatus(statusId, JournalGetStatusParams.none(), requestOptions)
    }
}
