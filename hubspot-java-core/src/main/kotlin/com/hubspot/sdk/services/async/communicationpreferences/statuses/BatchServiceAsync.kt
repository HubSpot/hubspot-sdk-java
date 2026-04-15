// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.communicationpreferences.statuses

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.communicationpreferences.BatchInputPublicStatusRequest
import com.hubspot.sdk.models.communicationpreferences.BatchResponsePublicBulkOptOutFromAllResponse
import com.hubspot.sdk.models.communicationpreferences.BatchResponsePublicStatus
import com.hubspot.sdk.models.communicationpreferences.BatchResponsePublicStatusBulkResponse
import com.hubspot.sdk.models.communicationpreferences.BatchResponsePublicWideStatusBulkResponse
import com.hubspot.sdk.models.communicationpreferences.statuses.batch.BatchGetUnsubscribeAllStatusesParams
import com.hubspot.sdk.models.communicationpreferences.statuses.batch.BatchReadParams
import com.hubspot.sdk.models.communicationpreferences.statuses.batch.BatchUnsubscribeAllParams
import com.hubspot.sdk.models.communicationpreferences.statuses.batch.BatchUpdateStatusesParams
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

    /** Checks whether a set of contacts have opted out of all communications. */
    fun getUnsubscribeAllStatuses(
        params: BatchGetUnsubscribeAllStatusesParams
    ): CompletableFuture<BatchResponsePublicWideStatusBulkResponse> =
        getUnsubscribeAllStatuses(params, RequestOptions.none())

    /** @see getUnsubscribeAllStatuses */
    fun getUnsubscribeAllStatuses(
        params: BatchGetUnsubscribeAllStatusesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicWideStatusBulkResponse>

    /** Batch retrieve subscription statuses for a set of contacts. */
    fun read(params: BatchReadParams): CompletableFuture<BatchResponsePublicStatusBulkResponse> =
        read(params, RequestOptions.none())

    /** @see read */
    fun read(
        params: BatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicStatusBulkResponse>

    /** Unsubscribe a set of contacts from all email subscriptions. */
    fun unsubscribeAll(
        params: BatchUnsubscribeAllParams
    ): CompletableFuture<BatchResponsePublicBulkOptOutFromAllResponse> =
        unsubscribeAll(params, RequestOptions.none())

    /** @see unsubscribeAll */
    fun unsubscribeAll(
        params: BatchUnsubscribeAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicBulkOptOutFromAllResponse>

    /** Update the subscription status for a set of contacts. */
    fun updateStatuses(
        params: BatchUpdateStatusesParams
    ): CompletableFuture<BatchResponsePublicStatus> = updateStatuses(params, RequestOptions.none())

    /** @see updateStatuses */
    fun updateStatuses(
        params: BatchUpdateStatusesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicStatus>

    /** @see updateStatuses */
    fun updateStatuses(
        batchInputPublicStatusRequest: BatchInputPublicStatusRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicStatus> =
        updateStatuses(
            BatchUpdateStatusesParams.builder()
                .batchInputPublicStatusRequest(batchInputPublicStatusRequest)
                .build(),
            requestOptions,
        )

    /** @see updateStatuses */
    fun updateStatuses(
        batchInputPublicStatusRequest: BatchInputPublicStatusRequest
    ): CompletableFuture<BatchResponsePublicStatus> =
        updateStatuses(batchInputPublicStatusRequest, RequestOptions.none())

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
         * /communication-preferences/2026-03/statuses/batch/unsubscribe-all/read`, but is otherwise
         * the same as [BatchServiceAsync.getUnsubscribeAllStatuses].
         */
        fun getUnsubscribeAllStatuses(
            params: BatchGetUnsubscribeAllStatusesParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicWideStatusBulkResponse>> =
            getUnsubscribeAllStatuses(params, RequestOptions.none())

        /** @see getUnsubscribeAllStatuses */
        fun getUnsubscribeAllStatuses(
            params: BatchGetUnsubscribeAllStatusesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicWideStatusBulkResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /communication-preferences/2026-03/statuses/batch/read`, but is otherwise the same as
         * [BatchServiceAsync.read].
         */
        fun read(
            params: BatchReadParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicStatusBulkResponse>> =
            read(params, RequestOptions.none())

        /** @see read */
        fun read(
            params: BatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicStatusBulkResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /communication-preferences/2026-03/statuses/batch/unsubscribe-all`, but is otherwise the
         * same as [BatchServiceAsync.unsubscribeAll].
         */
        fun unsubscribeAll(
            params: BatchUnsubscribeAllParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicBulkOptOutFromAllResponse>> =
            unsubscribeAll(params, RequestOptions.none())

        /** @see unsubscribeAll */
        fun unsubscribeAll(
            params: BatchUnsubscribeAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicBulkOptOutFromAllResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /communication-preferences/2026-03/statuses/batch/write`, but is otherwise the same as
         * [BatchServiceAsync.updateStatuses].
         */
        fun updateStatuses(
            params: BatchUpdateStatusesParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicStatus>> =
            updateStatuses(params, RequestOptions.none())

        /** @see updateStatuses */
        fun updateStatuses(
            params: BatchUpdateStatusesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicStatus>>

        /** @see updateStatuses */
        fun updateStatuses(
            batchInputPublicStatusRequest: BatchInputPublicStatusRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicStatus>> =
            updateStatuses(
                BatchUpdateStatusesParams.builder()
                    .batchInputPublicStatusRequest(batchInputPublicStatusRequest)
                    .build(),
                requestOptions,
            )

        /** @see updateStatuses */
        fun updateStatuses(
            batchInputPublicStatusRequest: BatchInputPublicStatusRequest
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicStatus>> =
            updateStatuses(batchInputPublicStatusRequest, RequestOptions.none())
    }
}
