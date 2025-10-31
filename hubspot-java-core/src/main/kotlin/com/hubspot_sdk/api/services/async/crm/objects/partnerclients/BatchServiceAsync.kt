// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects.partnerclients

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.BatchInputSimplePublicObjectBatchInput
import com.hubspot_sdk.api.models.crm.BatchReadInputSimplePublicObjectId
import com.hubspot_sdk.api.models.crm.BatchResponseSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.partnerclients.batch.BatchBatchGetParams
import com.hubspot_sdk.api.models.crm.objects.partnerclients.batch.BatchBatchUpdateParams
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

    fun batchGet(params: BatchBatchGetParams): CompletableFuture<BatchResponseSimplePublicObject> =
        batchGet(params, RequestOptions.none())

    /** @see batchGet */
    fun batchGet(
        params: BatchBatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject>

    /** @see batchGet */
    fun batchGet(
        batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        batchGet(
            BatchBatchGetParams.builder()
                .batchReadInputSimplePublicObjectId(batchReadInputSimplePublicObjectId)
                .build(),
            requestOptions,
        )

    /** @see batchGet */
    fun batchGet(
        batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        batchGet(batchReadInputSimplePublicObjectId, RequestOptions.none())

    fun batchUpdate(
        params: BatchBatchUpdateParams
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        batchUpdate(params, RequestOptions.none())

    /** @see batchUpdate */
    fun batchUpdate(
        params: BatchBatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject>

    /** @see batchUpdate */
    fun batchUpdate(
        batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        batchUpdate(
            BatchBatchUpdateParams.builder()
                .batchInputSimplePublicObjectBatchInput(batchInputSimplePublicObjectBatchInput)
                .build(),
            requestOptions,
        )

    /** @see batchUpdate */
    fun batchUpdate(
        batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        batchUpdate(batchInputSimplePublicObjectBatchInput, RequestOptions.none())

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
         * Returns a raw HTTP response for `post /crm/v3/objects/partner_clients/batch/read`, but is
         * otherwise the same as [BatchServiceAsync.batchGet].
         */
        fun batchGet(
            params: BatchBatchGetParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            batchGet(params, RequestOptions.none())

        /** @see batchGet */
        fun batchGet(
            params: BatchBatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>>

        /** @see batchGet */
        fun batchGet(
            batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            batchGet(
                BatchBatchGetParams.builder()
                    .batchReadInputSimplePublicObjectId(batchReadInputSimplePublicObjectId)
                    .build(),
                requestOptions,
            )

        /** @see batchGet */
        fun batchGet(
            batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            batchGet(batchReadInputSimplePublicObjectId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/partner_clients/batch/update`, but
         * is otherwise the same as [BatchServiceAsync.batchUpdate].
         */
        fun batchUpdate(
            params: BatchBatchUpdateParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            batchUpdate(params, RequestOptions.none())

        /** @see batchUpdate */
        fun batchUpdate(
            params: BatchBatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>>

        /** @see batchUpdate */
        fun batchUpdate(
            batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            batchUpdate(
                BatchBatchUpdateParams.builder()
                    .batchInputSimplePublicObjectBatchInput(batchInputSimplePublicObjectBatchInput)
                    .build(),
                requestOptions,
            )

        /** @see batchUpdate */
        fun batchUpdate(
            batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            batchUpdate(batchInputSimplePublicObjectBatchInput, RequestOptions.none())
    }
}
