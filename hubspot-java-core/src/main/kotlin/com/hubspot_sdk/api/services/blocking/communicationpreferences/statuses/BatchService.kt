// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.communicationpreferences.statuses

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.communicationpreferences.BatchInputPublicStatusRequest
import com.hubspot_sdk.api.models.communicationpreferences.BatchResponsePublicBulkOptOutFromAllResponse
import com.hubspot_sdk.api.models.communicationpreferences.BatchResponsePublicStatus
import com.hubspot_sdk.api.models.communicationpreferences.BatchResponsePublicStatusBulkResponse
import com.hubspot_sdk.api.models.communicationpreferences.BatchResponsePublicWideStatusBulkResponse
import com.hubspot_sdk.api.models.communicationpreferences.statuses.batch.BatchGetUnsubscribeAllStatusesParams
import com.hubspot_sdk.api.models.communicationpreferences.statuses.batch.BatchReadParams
import com.hubspot_sdk.api.models.communicationpreferences.statuses.batch.BatchUnsubscribeAllParams
import com.hubspot_sdk.api.models.communicationpreferences.statuses.batch.BatchUpdateStatusesParams
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

    /** Checks whether a set of contacts have opted out of all communications. */
    fun getUnsubscribeAllStatuses(
        params: BatchGetUnsubscribeAllStatusesParams
    ): BatchResponsePublicWideStatusBulkResponse =
        getUnsubscribeAllStatuses(params, RequestOptions.none())

    /** @see getUnsubscribeAllStatuses */
    fun getUnsubscribeAllStatuses(
        params: BatchGetUnsubscribeAllStatusesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicWideStatusBulkResponse

    /** Batch retrieve subscription statuses for a set of contacts. */
    fun read(params: BatchReadParams): BatchResponsePublicStatusBulkResponse =
        read(params, RequestOptions.none())

    /** @see read */
    fun read(
        params: BatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicStatusBulkResponse

    /** Unsubscribe a set of contacts from all email subscriptions. */
    fun unsubscribeAll(
        params: BatchUnsubscribeAllParams
    ): BatchResponsePublicBulkOptOutFromAllResponse = unsubscribeAll(params, RequestOptions.none())

    /** @see unsubscribeAll */
    fun unsubscribeAll(
        params: BatchUnsubscribeAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicBulkOptOutFromAllResponse

    /** Update the subscription status for a set of contacts. */
    fun updateStatuses(params: BatchUpdateStatusesParams): BatchResponsePublicStatus =
        updateStatuses(params, RequestOptions.none())

    /** @see updateStatuses */
    fun updateStatuses(
        params: BatchUpdateStatusesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicStatus

    /** @see updateStatuses */
    fun updateStatuses(
        batchInputPublicStatusRequest: BatchInputPublicStatusRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicStatus =
        updateStatuses(
            BatchUpdateStatusesParams.builder()
                .batchInputPublicStatusRequest(batchInputPublicStatusRequest)
                .build(),
            requestOptions,
        )

    /** @see updateStatuses */
    fun updateStatuses(
        batchInputPublicStatusRequest: BatchInputPublicStatusRequest
    ): BatchResponsePublicStatus =
        updateStatuses(batchInputPublicStatusRequest, RequestOptions.none())

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
         * /communication-preferences/2026-03/statuses/batch/unsubscribe-all/read`, but is otherwise
         * the same as [BatchService.getUnsubscribeAllStatuses].
         */
        @MustBeClosed
        fun getUnsubscribeAllStatuses(
            params: BatchGetUnsubscribeAllStatusesParams
        ): HttpResponseFor<BatchResponsePublicWideStatusBulkResponse> =
            getUnsubscribeAllStatuses(params, RequestOptions.none())

        /** @see getUnsubscribeAllStatuses */
        @MustBeClosed
        fun getUnsubscribeAllStatuses(
            params: BatchGetUnsubscribeAllStatusesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicWideStatusBulkResponse>

        /**
         * Returns a raw HTTP response for `post
         * /communication-preferences/2026-03/statuses/batch/read`, but is otherwise the same as
         * [BatchService.read].
         */
        @MustBeClosed
        fun read(params: BatchReadParams): HttpResponseFor<BatchResponsePublicStatusBulkResponse> =
            read(params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(
            params: BatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicStatusBulkResponse>

        /**
         * Returns a raw HTTP response for `post
         * /communication-preferences/2026-03/statuses/batch/unsubscribe-all`, but is otherwise the
         * same as [BatchService.unsubscribeAll].
         */
        @MustBeClosed
        fun unsubscribeAll(
            params: BatchUnsubscribeAllParams
        ): HttpResponseFor<BatchResponsePublicBulkOptOutFromAllResponse> =
            unsubscribeAll(params, RequestOptions.none())

        /** @see unsubscribeAll */
        @MustBeClosed
        fun unsubscribeAll(
            params: BatchUnsubscribeAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicBulkOptOutFromAllResponse>

        /**
         * Returns a raw HTTP response for `post
         * /communication-preferences/2026-03/statuses/batch/write`, but is otherwise the same as
         * [BatchService.updateStatuses].
         */
        @MustBeClosed
        fun updateStatuses(
            params: BatchUpdateStatusesParams
        ): HttpResponseFor<BatchResponsePublicStatus> =
            updateStatuses(params, RequestOptions.none())

        /** @see updateStatuses */
        @MustBeClosed
        fun updateStatuses(
            params: BatchUpdateStatusesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicStatus>

        /** @see updateStatuses */
        @MustBeClosed
        fun updateStatuses(
            batchInputPublicStatusRequest: BatchInputPublicStatusRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicStatus> =
            updateStatuses(
                BatchUpdateStatusesParams.builder()
                    .batchInputPublicStatusRequest(batchInputPublicStatusRequest)
                    .build(),
                requestOptions,
            )

        /** @see updateStatuses */
        @MustBeClosed
        fun updateStatuses(
            batchInputPublicStatusRequest: BatchInputPublicStatusRequest
        ): HttpResponseFor<BatchResponsePublicStatus> =
            updateStatuses(batchInputPublicStatusRequest, RequestOptions.none())
    }
}
