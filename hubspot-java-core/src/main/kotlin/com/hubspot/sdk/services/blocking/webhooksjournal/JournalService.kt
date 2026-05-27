// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.webhooksjournal

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.SnapshotStatusResponse
import com.hubspot.sdk.models.webhooksjournal.journal.JournalGetEarliestParams
import com.hubspot.sdk.models.webhooksjournal.journal.JournalGetNextFromOffsetParams
import com.hubspot.sdk.models.webhooksjournal.journal.JournalGetStatusParams
import com.hubspot.sdk.services.blocking.webhooksjournal.journal.BatchService
import java.util.function.Consumer

interface JournalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JournalService

    fun batch(): BatchService

    /**
     * Retrieve the earliest entry from the webhooks journal for the specified portal. This endpoint
     * is useful for accessing the first recorded webhook event in the journal, which can be helpful
     * for auditing or debugging purposes.
     */
    @MustBeClosed fun getEarliest(): HttpResponse = getEarliest(JournalGetEarliestParams.none())

    /** @see getEarliest */
    @MustBeClosed
    fun getEarliest(
        params: JournalGetEarliestParams = JournalGetEarliestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getEarliest */
    @MustBeClosed
    fun getEarliest(
        params: JournalGetEarliestParams = JournalGetEarliestParams.none()
    ): HttpResponse = getEarliest(params, RequestOptions.none())

    /** @see getEarliest */
    @MustBeClosed
    fun getEarliest(requestOptions: RequestOptions): HttpResponse =
        getEarliest(JournalGetEarliestParams.none(), requestOptions)

    /**
     * Retrieve the next set of entries from the webhooks journal starting from a specified offset.
     * This endpoint is useful for paginating through journal entries to process or analyze webhook
     * events sequentially.
     */
    @MustBeClosed
    fun getNextFromOffset(offset: String): HttpResponse =
        getNextFromOffset(offset, JournalGetNextFromOffsetParams.none())

    /** @see getNextFromOffset */
    @MustBeClosed
    fun getNextFromOffset(
        offset: String,
        params: JournalGetNextFromOffsetParams = JournalGetNextFromOffsetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = getNextFromOffset(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getNextFromOffset */
    @MustBeClosed
    fun getNextFromOffset(
        offset: String,
        params: JournalGetNextFromOffsetParams = JournalGetNextFromOffsetParams.none(),
    ): HttpResponse = getNextFromOffset(offset, params, RequestOptions.none())

    /** @see getNextFromOffset */
    @MustBeClosed
    fun getNextFromOffset(
        params: JournalGetNextFromOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getNextFromOffset */
    @MustBeClosed
    fun getNextFromOffset(params: JournalGetNextFromOffsetParams): HttpResponse =
        getNextFromOffset(params, RequestOptions.none())

    /** @see getNextFromOffset */
    @MustBeClosed
    fun getNextFromOffset(offset: String, requestOptions: RequestOptions): HttpResponse =
        getNextFromOffset(offset, JournalGetNextFromOffsetParams.none(), requestOptions)

    /**
     * Retrieve the status of a specific webhook journal entry using its unique status ID. This
     * endpoint provides detailed information about the status, including whether it is pending, in
     * progress, completed, failed, or expired. It is useful for monitoring and managing the state
     * of webhook journal entries.
     */
    fun getStatus(statusId: String): SnapshotStatusResponse =
        getStatus(statusId, JournalGetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        statusId: String,
        params: JournalGetStatusParams = JournalGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotStatusResponse =
        getStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(
        statusId: String,
        params: JournalGetStatusParams = JournalGetStatusParams.none(),
    ): SnapshotStatusResponse = getStatus(statusId, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: JournalGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotStatusResponse

    /** @see getStatus */
    fun getStatus(params: JournalGetStatusParams): SnapshotStatusResponse =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(statusId: String, requestOptions: RequestOptions): SnapshotStatusResponse =
        getStatus(statusId, JournalGetStatusParams.none(), requestOptions)

    /** A view of [JournalService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JournalService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal/2026-03/earliest`, but is
         * otherwise the same as [JournalService.getEarliest].
         */
        @MustBeClosed fun getEarliest(): HttpResponse = getEarliest(JournalGetEarliestParams.none())

        /** @see getEarliest */
        @MustBeClosed
        fun getEarliest(
            params: JournalGetEarliestParams = JournalGetEarliestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getEarliest */
        @MustBeClosed
        fun getEarliest(
            params: JournalGetEarliestParams = JournalGetEarliestParams.none()
        ): HttpResponse = getEarliest(params, RequestOptions.none())

        /** @see getEarliest */
        @MustBeClosed
        fun getEarliest(requestOptions: RequestOptions): HttpResponse =
            getEarliest(JournalGetEarliestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/offset/{offset}/next`, but is otherwise the same as
         * [JournalService.getNextFromOffset].
         */
        @MustBeClosed
        fun getNextFromOffset(offset: String): HttpResponse =
            getNextFromOffset(offset, JournalGetNextFromOffsetParams.none())

        /** @see getNextFromOffset */
        @MustBeClosed
        fun getNextFromOffset(
            offset: String,
            params: JournalGetNextFromOffsetParams = JournalGetNextFromOffsetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getNextFromOffset(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getNextFromOffset */
        @MustBeClosed
        fun getNextFromOffset(
            offset: String,
            params: JournalGetNextFromOffsetParams = JournalGetNextFromOffsetParams.none(),
        ): HttpResponse = getNextFromOffset(offset, params, RequestOptions.none())

        /** @see getNextFromOffset */
        @MustBeClosed
        fun getNextFromOffset(
            params: JournalGetNextFromOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getNextFromOffset */
        @MustBeClosed
        fun getNextFromOffset(params: JournalGetNextFromOffsetParams): HttpResponse =
            getNextFromOffset(params, RequestOptions.none())

        /** @see getNextFromOffset */
        @MustBeClosed
        fun getNextFromOffset(offset: String, requestOptions: RequestOptions): HttpResponse =
            getNextFromOffset(offset, JournalGetNextFromOffsetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/status/{statusId}`, but is otherwise the same as
         * [JournalService.getStatus].
         */
        @MustBeClosed
        fun getStatus(statusId: String): HttpResponseFor<SnapshotStatusResponse> =
            getStatus(statusId, JournalGetStatusParams.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            statusId: String,
            params: JournalGetStatusParams = JournalGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotStatusResponse> =
            getStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            statusId: String,
            params: JournalGetStatusParams = JournalGetStatusParams.none(),
        ): HttpResponseFor<SnapshotStatusResponse> =
            getStatus(statusId, params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            params: JournalGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotStatusResponse>

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(params: JournalGetStatusParams): HttpResponseFor<SnapshotStatusResponse> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            statusId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SnapshotStatusResponse> =
            getStatus(statusId, JournalGetStatusParams.none(), requestOptions)
    }
}
