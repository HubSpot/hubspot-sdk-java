// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.subscriptions.v4

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface StatusServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatusServiceAsync

    /** Set the subscription status of a specific contact. */
    fun update(
        subscriberIdString: String,
        params: StatusUpdateParams,
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        update(subscriberIdString, params, RequestOptions.none())

    /** @see update */
    fun update(
        subscriberIdString: String,
        params: StatusUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        update(params.toBuilder().subscriberIdString(subscriberIdString).build(), requestOptions)

    /** @see update */
    fun update(
        params: StatusUpdateParams
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: StatusUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponseWithResultsPublicStatus>

    /** Batch retrieve subscription statuses for a set of contacts. */
    fun batchGet(
        params: StatusBatchGetParams
    ): CompletableFuture<BatchResponsePublicStatusBulkResponse> =
        batchGet(params, RequestOptions.none())

    /** @see batchGet */
    fun batchGet(
        params: StatusBatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicStatusBulkResponse>

    /** Checks whether a set of contacts have opted out of all communications. */
    fun batchGetUnsubscribeAllStatus(
        params: StatusBatchGetUnsubscribeAllStatusParams
    ): CompletableFuture<BatchResponsePublicWideStatusBulkResponse> =
        batchGetUnsubscribeAllStatus(params, RequestOptions.none())

    /** @see batchGetUnsubscribeAllStatus */
    fun batchGetUnsubscribeAllStatus(
        params: StatusBatchGetUnsubscribeAllStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicWideStatusBulkResponse>

    /** Unsubscribe a set of contacts from all email subscriptions. */
    fun batchUnsubscribeAll(
        params: StatusBatchUnsubscribeAllParams
    ): CompletableFuture<BatchResponsePublicBulkOptOutFromAllResponse> =
        batchUnsubscribeAll(params, RequestOptions.none())

    /** @see batchUnsubscribeAll */
    fun batchUnsubscribeAll(
        params: StatusBatchUnsubscribeAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicBulkOptOutFromAllResponse>

    /** Update the subscription status for a set of contacts. */
    fun batchUpdate(params: StatusBatchUpdateParams): CompletableFuture<BatchResponsePublicStatus> =
        batchUpdate(params, RequestOptions.none())

    /** @see batchUpdate */
    fun batchUpdate(
        params: StatusBatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicStatus>

    /** @see batchUpdate */
    fun batchUpdate(
        batchInputPublicStatusRequest: BatchInputPublicStatusRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicStatus> =
        batchUpdate(
            StatusBatchUpdateParams.builder()
                .batchInputPublicStatusRequest(batchInputPublicStatusRequest)
                .build(),
            requestOptions,
        )

    /** @see batchUpdate */
    fun batchUpdate(
        batchInputPublicStatusRequest: BatchInputPublicStatusRequest
    ): CompletableFuture<BatchResponsePublicStatus> =
        batchUpdate(batchInputPublicStatusRequest, RequestOptions.none())

    /** Retrieve a contact's current email subscription preferences. */
    fun get(
        subscriberIdString: String,
        params: StatusGetParams,
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        get(subscriberIdString, params, RequestOptions.none())

    /** @see get */
    fun get(
        subscriberIdString: String,
        params: StatusGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        get(params.toBuilder().subscriberIdString(subscriberIdString).build(), requestOptions)

    /** @see get */
    fun get(params: StatusGetParams): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: StatusGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponseWithResultsPublicStatus>

    /**
     * Check whether a contact has unsubscribed from all email subscriptions. If a contact has not
     * opted out of all communications, the response `results` array will be empty.
     */
    fun getUnsubscribeAllStatus(
        subscriberIdString: String,
        params: StatusGetUnsubscribeAllStatusParams,
    ): CompletableFuture<ActionResponseWithResultsPublicWideStatus> =
        getUnsubscribeAllStatus(subscriberIdString, params, RequestOptions.none())

    /** @see getUnsubscribeAllStatus */
    fun getUnsubscribeAllStatus(
        subscriberIdString: String,
        params: StatusGetUnsubscribeAllStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponseWithResultsPublicWideStatus> =
        getUnsubscribeAllStatus(
            params.toBuilder().subscriberIdString(subscriberIdString).build(),
            requestOptions,
        )

    /** @see getUnsubscribeAllStatus */
    fun getUnsubscribeAllStatus(
        params: StatusGetUnsubscribeAllStatusParams
    ): CompletableFuture<ActionResponseWithResultsPublicWideStatus> =
        getUnsubscribeAllStatus(params, RequestOptions.none())

    /** @see getUnsubscribeAllStatus */
    fun getUnsubscribeAllStatus(
        params: StatusGetUnsubscribeAllStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponseWithResultsPublicWideStatus>

    /** Unsubscribe a contact from all email subscriptions. */
    fun unsubscribeAll(
        subscriberIdString: String,
        params: StatusUnsubscribeAllParams,
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        unsubscribeAll(subscriberIdString, params, RequestOptions.none())

    /** @see unsubscribeAll */
    fun unsubscribeAll(
        subscriberIdString: String,
        params: StatusUnsubscribeAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        unsubscribeAll(
            params.toBuilder().subscriberIdString(subscriberIdString).build(),
            requestOptions,
        )

    /** @see unsubscribeAll */
    fun unsubscribeAll(
        params: StatusUnsubscribeAllParams
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        unsubscribeAll(params, RequestOptions.none())

    /** @see unsubscribeAll */
    fun unsubscribeAll(
        params: StatusUnsubscribeAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponseWithResultsPublicStatus>

    /**
     * A view of [StatusServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatusServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /communication-preferences/v4/statuses/{subscriberIdString}`, but is otherwise the same
         * as [StatusServiceAsync.update].
         */
        fun update(
            subscriberIdString: String,
            params: StatusUpdateParams,
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> =
            update(subscriberIdString, params, RequestOptions.none())

        /** @see update */
        fun update(
            subscriberIdString: String,
            params: StatusUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> =
            update(
                params.toBuilder().subscriberIdString(subscriberIdString).build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            params: StatusUpdateParams
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: StatusUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>>

        /**
         * Returns a raw HTTP response for `post /communication-preferences/v4/statuses/batch/read`,
         * but is otherwise the same as [StatusServiceAsync.batchGet].
         */
        fun batchGet(
            params: StatusBatchGetParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicStatusBulkResponse>> =
            batchGet(params, RequestOptions.none())

        /** @see batchGet */
        fun batchGet(
            params: StatusBatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicStatusBulkResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /communication-preferences/v4/statuses/batch/unsubscribe-all/read`, but is otherwise the
         * same as [StatusServiceAsync.batchGetUnsubscribeAllStatus].
         */
        fun batchGetUnsubscribeAllStatus(
            params: StatusBatchGetUnsubscribeAllStatusParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicWideStatusBulkResponse>> =
            batchGetUnsubscribeAllStatus(params, RequestOptions.none())

        /** @see batchGetUnsubscribeAllStatus */
        fun batchGetUnsubscribeAllStatus(
            params: StatusBatchGetUnsubscribeAllStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicWideStatusBulkResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /communication-preferences/v4/statuses/batch/unsubscribe-all`, but is otherwise the same
         * as [StatusServiceAsync.batchUnsubscribeAll].
         */
        fun batchUnsubscribeAll(
            params: StatusBatchUnsubscribeAllParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicBulkOptOutFromAllResponse>> =
            batchUnsubscribeAll(params, RequestOptions.none())

        /** @see batchUnsubscribeAll */
        fun batchUnsubscribeAll(
            params: StatusBatchUnsubscribeAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicBulkOptOutFromAllResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /communication-preferences/v4/statuses/batch/write`, but is otherwise the same as
         * [StatusServiceAsync.batchUpdate].
         */
        fun batchUpdate(
            params: StatusBatchUpdateParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicStatus>> =
            batchUpdate(params, RequestOptions.none())

        /** @see batchUpdate */
        fun batchUpdate(
            params: StatusBatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicStatus>>

        /** @see batchUpdate */
        fun batchUpdate(
            batchInputPublicStatusRequest: BatchInputPublicStatusRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicStatus>> =
            batchUpdate(
                StatusBatchUpdateParams.builder()
                    .batchInputPublicStatusRequest(batchInputPublicStatusRequest)
                    .build(),
                requestOptions,
            )

        /** @see batchUpdate */
        fun batchUpdate(
            batchInputPublicStatusRequest: BatchInputPublicStatusRequest
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicStatus>> =
            batchUpdate(batchInputPublicStatusRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /communication-preferences/v4/statuses/{subscriberIdString}`, but is otherwise the same
         * as [StatusServiceAsync.get].
         */
        fun get(
            subscriberIdString: String,
            params: StatusGetParams,
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> =
            get(subscriberIdString, params, RequestOptions.none())

        /** @see get */
        fun get(
            subscriberIdString: String,
            params: StatusGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> =
            get(params.toBuilder().subscriberIdString(subscriberIdString).build(), requestOptions)

        /** @see get */
        fun get(
            params: StatusGetParams
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: StatusGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>>

        /**
         * Returns a raw HTTP response for `get
         * /communication-preferences/v4/statuses/{subscriberIdString}/unsubscribe-all`, but is
         * otherwise the same as [StatusServiceAsync.getUnsubscribeAllStatus].
         */
        fun getUnsubscribeAllStatus(
            subscriberIdString: String,
            params: StatusGetUnsubscribeAllStatusParams,
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicWideStatus>> =
            getUnsubscribeAllStatus(subscriberIdString, params, RequestOptions.none())

        /** @see getUnsubscribeAllStatus */
        fun getUnsubscribeAllStatus(
            subscriberIdString: String,
            params: StatusGetUnsubscribeAllStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicWideStatus>> =
            getUnsubscribeAllStatus(
                params.toBuilder().subscriberIdString(subscriberIdString).build(),
                requestOptions,
            )

        /** @see getUnsubscribeAllStatus */
        fun getUnsubscribeAllStatus(
            params: StatusGetUnsubscribeAllStatusParams
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicWideStatus>> =
            getUnsubscribeAllStatus(params, RequestOptions.none())

        /** @see getUnsubscribeAllStatus */
        fun getUnsubscribeAllStatus(
            params: StatusGetUnsubscribeAllStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicWideStatus>>

        /**
         * Returns a raw HTTP response for `post
         * /communication-preferences/v4/statuses/{subscriberIdString}/unsubscribe-all`, but is
         * otherwise the same as [StatusServiceAsync.unsubscribeAll].
         */
        fun unsubscribeAll(
            subscriberIdString: String,
            params: StatusUnsubscribeAllParams,
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> =
            unsubscribeAll(subscriberIdString, params, RequestOptions.none())

        /** @see unsubscribeAll */
        fun unsubscribeAll(
            subscriberIdString: String,
            params: StatusUnsubscribeAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> =
            unsubscribeAll(
                params.toBuilder().subscriberIdString(subscriberIdString).build(),
                requestOptions,
            )

        /** @see unsubscribeAll */
        fun unsubscribeAll(
            params: StatusUnsubscribeAllParams
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> =
            unsubscribeAll(params, RequestOptions.none())

        /** @see unsubscribeAll */
        fun unsubscribeAll(
            params: StatusUnsubscribeAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>>
    }
}
