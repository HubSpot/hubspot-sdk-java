// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.subscriptions.v4

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.ActionResponseWithResultsPublicStatus
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.ActionResponseWithResultsPublicWideStatus
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.BatchInputPublicStatusRequest
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.BatchResponsePublicBulkOptOutFromAllResponse
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.BatchResponsePublicStatus
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.BatchResponsePublicStatusBulkResponse
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.BatchResponsePublicWideStatusBulkResponse
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusBatchGetParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusBatchGetUnsubscribeAllStatusParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusBatchUnsubscribeAllParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusBatchUpdateParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusGetParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusGetUnsubscribeAllStatusParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusUnsubscribeAllParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusUpdateParams
import java.util.function.Consumer

interface StatusService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatusService

    /** Set the subscription status of a specific contact. */
    fun update(
        subscriberIdString: String,
        params: StatusUpdateParams,
    ): ActionResponseWithResultsPublicStatus =
        update(subscriberIdString, params, RequestOptions.none())

    /** @see update */
    fun update(
        subscriberIdString: String,
        params: StatusUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponseWithResultsPublicStatus =
        update(params.toBuilder().subscriberIdString(subscriberIdString).build(), requestOptions)

    /** @see update */
    fun update(params: StatusUpdateParams): ActionResponseWithResultsPublicStatus =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: StatusUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponseWithResultsPublicStatus

    /** Batch retrieve subscription statuses for a set of contacts. */
    fun batchGet(params: StatusBatchGetParams): BatchResponsePublicStatusBulkResponse =
        batchGet(params, RequestOptions.none())

    /** @see batchGet */
    fun batchGet(
        params: StatusBatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicStatusBulkResponse

    /** Checks whether a set of contacts have opted out of all communications. */
    fun batchGetUnsubscribeAllStatus(
        params: StatusBatchGetUnsubscribeAllStatusParams
    ): BatchResponsePublicWideStatusBulkResponse =
        batchGetUnsubscribeAllStatus(params, RequestOptions.none())

    /** @see batchGetUnsubscribeAllStatus */
    fun batchGetUnsubscribeAllStatus(
        params: StatusBatchGetUnsubscribeAllStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicWideStatusBulkResponse

    /** Unsubscribe a set of contacts from all email subscriptions. */
    fun batchUnsubscribeAll(
        params: StatusBatchUnsubscribeAllParams
    ): BatchResponsePublicBulkOptOutFromAllResponse =
        batchUnsubscribeAll(params, RequestOptions.none())

    /** @see batchUnsubscribeAll */
    fun batchUnsubscribeAll(
        params: StatusBatchUnsubscribeAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicBulkOptOutFromAllResponse

    /** Update the subscription status for a set of contacts. */
    fun batchUpdate(params: StatusBatchUpdateParams): BatchResponsePublicStatus =
        batchUpdate(params, RequestOptions.none())

    /** @see batchUpdate */
    fun batchUpdate(
        params: StatusBatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicStatus

    /** @see batchUpdate */
    fun batchUpdate(
        batchInputPublicStatusRequest: BatchInputPublicStatusRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicStatus =
        batchUpdate(
            StatusBatchUpdateParams.builder()
                .batchInputPublicStatusRequest(batchInputPublicStatusRequest)
                .build(),
            requestOptions,
        )

    /** @see batchUpdate */
    fun batchUpdate(
        batchInputPublicStatusRequest: BatchInputPublicStatusRequest
    ): BatchResponsePublicStatus = batchUpdate(batchInputPublicStatusRequest, RequestOptions.none())

    /** Retrieve a contact's current email subscription preferences. */
    fun get(
        subscriberIdString: String,
        params: StatusGetParams,
    ): ActionResponseWithResultsPublicStatus =
        get(subscriberIdString, params, RequestOptions.none())

    /** @see get */
    fun get(
        subscriberIdString: String,
        params: StatusGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponseWithResultsPublicStatus =
        get(params.toBuilder().subscriberIdString(subscriberIdString).build(), requestOptions)

    /** @see get */
    fun get(params: StatusGetParams): ActionResponseWithResultsPublicStatus =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: StatusGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponseWithResultsPublicStatus

    /**
     * Check whether a contact has unsubscribed from all email subscriptions. If a contact has not
     * opted out of all communications, the response `results` array will be empty.
     */
    fun getUnsubscribeAllStatus(
        subscriberIdString: String,
        params: StatusGetUnsubscribeAllStatusParams,
    ): ActionResponseWithResultsPublicWideStatus =
        getUnsubscribeAllStatus(subscriberIdString, params, RequestOptions.none())

    /** @see getUnsubscribeAllStatus */
    fun getUnsubscribeAllStatus(
        subscriberIdString: String,
        params: StatusGetUnsubscribeAllStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponseWithResultsPublicWideStatus =
        getUnsubscribeAllStatus(
            params.toBuilder().subscriberIdString(subscriberIdString).build(),
            requestOptions,
        )

    /** @see getUnsubscribeAllStatus */
    fun getUnsubscribeAllStatus(
        params: StatusGetUnsubscribeAllStatusParams
    ): ActionResponseWithResultsPublicWideStatus =
        getUnsubscribeAllStatus(params, RequestOptions.none())

    /** @see getUnsubscribeAllStatus */
    fun getUnsubscribeAllStatus(
        params: StatusGetUnsubscribeAllStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponseWithResultsPublicWideStatus

    /** Unsubscribe a contact from all email subscriptions. */
    fun unsubscribeAll(
        subscriberIdString: String,
        params: StatusUnsubscribeAllParams,
    ): ActionResponseWithResultsPublicStatus =
        unsubscribeAll(subscriberIdString, params, RequestOptions.none())

    /** @see unsubscribeAll */
    fun unsubscribeAll(
        subscriberIdString: String,
        params: StatusUnsubscribeAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponseWithResultsPublicStatus =
        unsubscribeAll(
            params.toBuilder().subscriberIdString(subscriberIdString).build(),
            requestOptions,
        )

    /** @see unsubscribeAll */
    fun unsubscribeAll(params: StatusUnsubscribeAllParams): ActionResponseWithResultsPublicStatus =
        unsubscribeAll(params, RequestOptions.none())

    /** @see unsubscribeAll */
    fun unsubscribeAll(
        params: StatusUnsubscribeAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponseWithResultsPublicStatus

    /** A view of [StatusService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatusService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /communication-preferences/v4/statuses/{subscriberIdString}`, but is otherwise the same
         * as [StatusService.update].
         */
        @MustBeClosed
        fun update(
            subscriberIdString: String,
            params: StatusUpdateParams,
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> =
            update(subscriberIdString, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            subscriberIdString: String,
            params: StatusUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> =
            update(
                params.toBuilder().subscriberIdString(subscriberIdString).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(
            params: StatusUpdateParams
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: StatusUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus>

        /**
         * Returns a raw HTTP response for `post /communication-preferences/v4/statuses/batch/read`,
         * but is otherwise the same as [StatusService.batchGet].
         */
        @MustBeClosed
        fun batchGet(
            params: StatusBatchGetParams
        ): HttpResponseFor<BatchResponsePublicStatusBulkResponse> =
            batchGet(params, RequestOptions.none())

        /** @see batchGet */
        @MustBeClosed
        fun batchGet(
            params: StatusBatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicStatusBulkResponse>

        /**
         * Returns a raw HTTP response for `post
         * /communication-preferences/v4/statuses/batch/unsubscribe-all/read`, but is otherwise the
         * same as [StatusService.batchGetUnsubscribeAllStatus].
         */
        @MustBeClosed
        fun batchGetUnsubscribeAllStatus(
            params: StatusBatchGetUnsubscribeAllStatusParams
        ): HttpResponseFor<BatchResponsePublicWideStatusBulkResponse> =
            batchGetUnsubscribeAllStatus(params, RequestOptions.none())

        /** @see batchGetUnsubscribeAllStatus */
        @MustBeClosed
        fun batchGetUnsubscribeAllStatus(
            params: StatusBatchGetUnsubscribeAllStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicWideStatusBulkResponse>

        /**
         * Returns a raw HTTP response for `post
         * /communication-preferences/v4/statuses/batch/unsubscribe-all`, but is otherwise the same
         * as [StatusService.batchUnsubscribeAll].
         */
        @MustBeClosed
        fun batchUnsubscribeAll(
            params: StatusBatchUnsubscribeAllParams
        ): HttpResponseFor<BatchResponsePublicBulkOptOutFromAllResponse> =
            batchUnsubscribeAll(params, RequestOptions.none())

        /** @see batchUnsubscribeAll */
        @MustBeClosed
        fun batchUnsubscribeAll(
            params: StatusBatchUnsubscribeAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicBulkOptOutFromAllResponse>

        /**
         * Returns a raw HTTP response for `post
         * /communication-preferences/v4/statuses/batch/write`, but is otherwise the same as
         * [StatusService.batchUpdate].
         */
        @MustBeClosed
        fun batchUpdate(
            params: StatusBatchUpdateParams
        ): HttpResponseFor<BatchResponsePublicStatus> = batchUpdate(params, RequestOptions.none())

        /** @see batchUpdate */
        @MustBeClosed
        fun batchUpdate(
            params: StatusBatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicStatus>

        /** @see batchUpdate */
        @MustBeClosed
        fun batchUpdate(
            batchInputPublicStatusRequest: BatchInputPublicStatusRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicStatus> =
            batchUpdate(
                StatusBatchUpdateParams.builder()
                    .batchInputPublicStatusRequest(batchInputPublicStatusRequest)
                    .build(),
                requestOptions,
            )

        /** @see batchUpdate */
        @MustBeClosed
        fun batchUpdate(
            batchInputPublicStatusRequest: BatchInputPublicStatusRequest
        ): HttpResponseFor<BatchResponsePublicStatus> =
            batchUpdate(batchInputPublicStatusRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /communication-preferences/v4/statuses/{subscriberIdString}`, but is otherwise the same
         * as [StatusService.get].
         */
        @MustBeClosed
        fun get(
            subscriberIdString: String,
            params: StatusGetParams,
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> =
            get(subscriberIdString, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            subscriberIdString: String,
            params: StatusGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> =
            get(params.toBuilder().subscriberIdString(subscriberIdString).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: StatusGetParams): HttpResponseFor<ActionResponseWithResultsPublicStatus> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: StatusGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus>

        /**
         * Returns a raw HTTP response for `get
         * /communication-preferences/v4/statuses/{subscriberIdString}/unsubscribe-all`, but is
         * otherwise the same as [StatusService.getUnsubscribeAllStatus].
         */
        @MustBeClosed
        fun getUnsubscribeAllStatus(
            subscriberIdString: String,
            params: StatusGetUnsubscribeAllStatusParams,
        ): HttpResponseFor<ActionResponseWithResultsPublicWideStatus> =
            getUnsubscribeAllStatus(subscriberIdString, params, RequestOptions.none())

        /** @see getUnsubscribeAllStatus */
        @MustBeClosed
        fun getUnsubscribeAllStatus(
            subscriberIdString: String,
            params: StatusGetUnsubscribeAllStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponseWithResultsPublicWideStatus> =
            getUnsubscribeAllStatus(
                params.toBuilder().subscriberIdString(subscriberIdString).build(),
                requestOptions,
            )

        /** @see getUnsubscribeAllStatus */
        @MustBeClosed
        fun getUnsubscribeAllStatus(
            params: StatusGetUnsubscribeAllStatusParams
        ): HttpResponseFor<ActionResponseWithResultsPublicWideStatus> =
            getUnsubscribeAllStatus(params, RequestOptions.none())

        /** @see getUnsubscribeAllStatus */
        @MustBeClosed
        fun getUnsubscribeAllStatus(
            params: StatusGetUnsubscribeAllStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponseWithResultsPublicWideStatus>

        /**
         * Returns a raw HTTP response for `post
         * /communication-preferences/v4/statuses/{subscriberIdString}/unsubscribe-all`, but is
         * otherwise the same as [StatusService.unsubscribeAll].
         */
        @MustBeClosed
        fun unsubscribeAll(
            subscriberIdString: String,
            params: StatusUnsubscribeAllParams,
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> =
            unsubscribeAll(subscriberIdString, params, RequestOptions.none())

        /** @see unsubscribeAll */
        @MustBeClosed
        fun unsubscribeAll(
            subscriberIdString: String,
            params: StatusUnsubscribeAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> =
            unsubscribeAll(
                params.toBuilder().subscriberIdString(subscriberIdString).build(),
                requestOptions,
            )

        /** @see unsubscribeAll */
        @MustBeClosed
        fun unsubscribeAll(
            params: StatusUnsubscribeAllParams
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> =
            unsubscribeAll(params, RequestOptions.none())

        /** @see unsubscribeAll */
        @MustBeClosed
        fun unsubscribeAll(
            params: StatusUnsubscribeAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus>
    }
}
