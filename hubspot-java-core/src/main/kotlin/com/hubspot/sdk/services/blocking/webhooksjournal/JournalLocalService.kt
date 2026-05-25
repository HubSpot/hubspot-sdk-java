// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.webhooksjournal

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.SnapshotStatusResponse
import com.hubspot.sdk.models.webhooksjournal.journallocal.JournalLocalGetEarliestParams
import com.hubspot.sdk.models.webhooksjournal.journallocal.JournalLocalGetLatestParams
import com.hubspot.sdk.models.webhooksjournal.journallocal.JournalLocalGetNextFromOffsetParams
import com.hubspot.sdk.models.webhooksjournal.journallocal.JournalLocalGetStatusParams
import com.hubspot.sdk.services.blocking.webhooksjournal.journallocal.BatchService
import java.util.function.Consumer

interface JournalLocalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JournalLocalService

    fun batch(): BatchService

    /**
     * Retrieve the earliest webhook journal entries for the specified portal. This endpoint can be
     * used to access the oldest records available in the webhook journal, which may be useful for
     * auditing or historical analysis.
     */
    @MustBeClosed
    fun getEarliest(): HttpResponse = getEarliest(JournalLocalGetEarliestParams.none())

    /** @see getEarliest */
    @MustBeClosed
    fun getEarliest(
        params: JournalLocalGetEarliestParams = JournalLocalGetEarliestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getEarliest */
    @MustBeClosed
    fun getEarliest(
        params: JournalLocalGetEarliestParams = JournalLocalGetEarliestParams.none()
    ): HttpResponse = getEarliest(params, RequestOptions.none())

    /** @see getEarliest */
    @MustBeClosed
    fun getEarliest(requestOptions: RequestOptions): HttpResponse =
        getEarliest(JournalLocalGetEarliestParams.none(), requestOptions)

    /**
     * Retrieve the latest entries from the webhooks journal for the specified portal. This endpoint
     * is useful for accessing the most recent webhook events and their statuses, allowing you to
     * monitor and debug webhook activity effectively.
     */
    @MustBeClosed fun getLatest(): HttpResponse = getLatest(JournalLocalGetLatestParams.none())

    /** @see getLatest */
    @MustBeClosed
    fun getLatest(
        params: JournalLocalGetLatestParams = JournalLocalGetLatestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getLatest */
    @MustBeClosed
    fun getLatest(
        params: JournalLocalGetLatestParams = JournalLocalGetLatestParams.none()
    ): HttpResponse = getLatest(params, RequestOptions.none())

    /** @see getLatest */
    @MustBeClosed
    fun getLatest(requestOptions: RequestOptions): HttpResponse =
        getLatest(JournalLocalGetLatestParams.none(), requestOptions)

    /**
     * Retrieve the next set of webhook journal entries starting from a specified offset. This
     * endpoint is useful for paginating through large sets of webhook data, allowing you to
     * continue from where a previous request left off.
     */
    @MustBeClosed
    fun getNextFromOffset(offset: String): HttpResponse =
        getNextFromOffset(offset, JournalLocalGetNextFromOffsetParams.none())

    /** @see getNextFromOffset */
    @MustBeClosed
    fun getNextFromOffset(
        offset: String,
        params: JournalLocalGetNextFromOffsetParams = JournalLocalGetNextFromOffsetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = getNextFromOffset(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getNextFromOffset */
    @MustBeClosed
    fun getNextFromOffset(
        offset: String,
        params: JournalLocalGetNextFromOffsetParams = JournalLocalGetNextFromOffsetParams.none(),
    ): HttpResponse = getNextFromOffset(offset, params, RequestOptions.none())

    /** @see getNextFromOffset */
    @MustBeClosed
    fun getNextFromOffset(
        params: JournalLocalGetNextFromOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getNextFromOffset */
    @MustBeClosed
    fun getNextFromOffset(params: JournalLocalGetNextFromOffsetParams): HttpResponse =
        getNextFromOffset(params, RequestOptions.none())

    /** @see getNextFromOffset */
    @MustBeClosed
    fun getNextFromOffset(offset: String, requestOptions: RequestOptions): HttpResponse =
        getNextFromOffset(offset, JournalLocalGetNextFromOffsetParams.none(), requestOptions)

    /**
     * Retrieve the status of a specific webhook journal entry using its unique status ID. This
     * endpoint is useful for monitoring the progress or outcome of webhook journal entries,
     * allowing you to check if an entry is pending, in progress, completed, failed, or expired.
     */
    fun getStatus(statusId: String): SnapshotStatusResponse =
        getStatus(statusId, JournalLocalGetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        statusId: String,
        params: JournalLocalGetStatusParams = JournalLocalGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotStatusResponse =
        getStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(
        statusId: String,
        params: JournalLocalGetStatusParams = JournalLocalGetStatusParams.none(),
    ): SnapshotStatusResponse = getStatus(statusId, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: JournalLocalGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotStatusResponse

    /** @see getStatus */
    fun getStatus(params: JournalLocalGetStatusParams): SnapshotStatusResponse =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(statusId: String, requestOptions: RequestOptions): SnapshotStatusResponse =
        getStatus(statusId, JournalLocalGetStatusParams.none(), requestOptions)

    /**
     * A view of [JournalLocalService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JournalLocalService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/earliest`,
         * but is otherwise the same as [JournalLocalService.getEarliest].
         */
        @MustBeClosed
        fun getEarliest(): HttpResponse = getEarliest(JournalLocalGetEarliestParams.none())

        /** @see getEarliest */
        @MustBeClosed
        fun getEarliest(
            params: JournalLocalGetEarliestParams = JournalLocalGetEarliestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getEarliest */
        @MustBeClosed
        fun getEarliest(
            params: JournalLocalGetEarliestParams = JournalLocalGetEarliestParams.none()
        ): HttpResponse = getEarliest(params, RequestOptions.none())

        /** @see getEarliest */
        @MustBeClosed
        fun getEarliest(requestOptions: RequestOptions): HttpResponse =
            getEarliest(JournalLocalGetEarliestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal/2026-03/latest`, but is
         * otherwise the same as [JournalLocalService.getLatest].
         */
        @MustBeClosed fun getLatest(): HttpResponse = getLatest(JournalLocalGetLatestParams.none())

        /** @see getLatest */
        @MustBeClosed
        fun getLatest(
            params: JournalLocalGetLatestParams = JournalLocalGetLatestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getLatest */
        @MustBeClosed
        fun getLatest(
            params: JournalLocalGetLatestParams = JournalLocalGetLatestParams.none()
        ): HttpResponse = getLatest(params, RequestOptions.none())

        /** @see getLatest */
        @MustBeClosed
        fun getLatest(requestOptions: RequestOptions): HttpResponse =
            getLatest(JournalLocalGetLatestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/offset/{offset}/next`, but is otherwise the same
         * as [JournalLocalService.getNextFromOffset].
         */
        @MustBeClosed
        fun getNextFromOffset(offset: String): HttpResponse =
            getNextFromOffset(offset, JournalLocalGetNextFromOffsetParams.none())

        /** @see getNextFromOffset */
        @MustBeClosed
        fun getNextFromOffset(
            offset: String,
            params: JournalLocalGetNextFromOffsetParams =
                JournalLocalGetNextFromOffsetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getNextFromOffset(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getNextFromOffset */
        @MustBeClosed
        fun getNextFromOffset(
            offset: String,
            params: JournalLocalGetNextFromOffsetParams = JournalLocalGetNextFromOffsetParams.none(),
        ): HttpResponse = getNextFromOffset(offset, params, RequestOptions.none())

        /** @see getNextFromOffset */
        @MustBeClosed
        fun getNextFromOffset(
            params: JournalLocalGetNextFromOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getNextFromOffset */
        @MustBeClosed
        fun getNextFromOffset(params: JournalLocalGetNextFromOffsetParams): HttpResponse =
            getNextFromOffset(params, RequestOptions.none())

        /** @see getNextFromOffset */
        @MustBeClosed
        fun getNextFromOffset(offset: String, requestOptions: RequestOptions): HttpResponse =
            getNextFromOffset(offset, JournalLocalGetNextFromOffsetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/status/{statusId}`, but is otherwise the same as
         * [JournalLocalService.getStatus].
         */
        @MustBeClosed
        fun getStatus(statusId: String): HttpResponseFor<SnapshotStatusResponse> =
            getStatus(statusId, JournalLocalGetStatusParams.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            statusId: String,
            params: JournalLocalGetStatusParams = JournalLocalGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotStatusResponse> =
            getStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            statusId: String,
            params: JournalLocalGetStatusParams = JournalLocalGetStatusParams.none(),
        ): HttpResponseFor<SnapshotStatusResponse> =
            getStatus(statusId, params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            params: JournalLocalGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotStatusResponse>

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            params: JournalLocalGetStatusParams
        ): HttpResponseFor<SnapshotStatusResponse> = getStatus(params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            statusId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SnapshotStatusResponse> =
            getStatus(statusId, JournalLocalGetStatusParams.none(), requestOptions)
    }
}
