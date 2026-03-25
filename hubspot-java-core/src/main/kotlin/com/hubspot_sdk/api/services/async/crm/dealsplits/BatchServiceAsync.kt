// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.dealsplits

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.BatchInputPublicObjectId
import com.hubspot_sdk.api.models.crm.dealsplits.BatchResponseDealToDealSplits
import com.hubspot_sdk.api.models.crm.dealsplits.PublicDealSplitsBatchCreateRequest
import com.hubspot_sdk.api.models.crm.dealsplits.batch.BatchReadParams
import com.hubspot_sdk.api.models.crm.dealsplits.batch.BatchUpsertParams
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

    fun read(params: BatchReadParams): CompletableFuture<BatchResponseDealToDealSplits> =
        read(params, RequestOptions.none())

    /** @see read */
    fun read(
        params: BatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseDealToDealSplits>

    /** @see read */
    fun read(
        batchInputPublicObjectId: BatchInputPublicObjectId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseDealToDealSplits> =
        read(
            BatchReadParams.builder().batchInputPublicObjectId(batchInputPublicObjectId).build(),
            requestOptions,
        )

    /** @see read */
    fun read(
        batchInputPublicObjectId: BatchInputPublicObjectId
    ): CompletableFuture<BatchResponseDealToDealSplits> =
        read(batchInputPublicObjectId, RequestOptions.none())

    fun upsert(params: BatchUpsertParams): CompletableFuture<BatchResponseDealToDealSplits> =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: BatchUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseDealToDealSplits>

    /** @see upsert */
    fun upsert(
        publicDealSplitsBatchCreateRequest: PublicDealSplitsBatchCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseDealToDealSplits> =
        upsert(
            BatchUpsertParams.builder()
                .publicDealSplitsBatchCreateRequest(publicDealSplitsBatchCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see upsert */
    fun upsert(
        publicDealSplitsBatchCreateRequest: PublicDealSplitsBatchCreateRequest
    ): CompletableFuture<BatchResponseDealToDealSplits> =
        upsert(publicDealSplitsBatchCreateRequest, RequestOptions.none())

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
         * Returns a raw HTTP response for `post /deal-splits/2026-03/batch/read`, but is otherwise
         * the same as [BatchServiceAsync.read].
         */
        fun read(
            params: BatchReadParams
        ): CompletableFuture<HttpResponseFor<BatchResponseDealToDealSplits>> =
            read(params, RequestOptions.none())

        /** @see read */
        fun read(
            params: BatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseDealToDealSplits>>

        /** @see read */
        fun read(
            batchInputPublicObjectId: BatchInputPublicObjectId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseDealToDealSplits>> =
            read(
                BatchReadParams.builder()
                    .batchInputPublicObjectId(batchInputPublicObjectId)
                    .build(),
                requestOptions,
            )

        /** @see read */
        fun read(
            batchInputPublicObjectId: BatchInputPublicObjectId
        ): CompletableFuture<HttpResponseFor<BatchResponseDealToDealSplits>> =
            read(batchInputPublicObjectId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /deal-splits/2026-03/batch/upsert`, but is
         * otherwise the same as [BatchServiceAsync.upsert].
         */
        fun upsert(
            params: BatchUpsertParams
        ): CompletableFuture<HttpResponseFor<BatchResponseDealToDealSplits>> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        fun upsert(
            params: BatchUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseDealToDealSplits>>

        /** @see upsert */
        fun upsert(
            publicDealSplitsBatchCreateRequest: PublicDealSplitsBatchCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseDealToDealSplits>> =
            upsert(
                BatchUpsertParams.builder()
                    .publicDealSplitsBatchCreateRequest(publicDealSplitsBatchCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see upsert */
        fun upsert(
            publicDealSplitsBatchCreateRequest: PublicDealSplitsBatchCreateRequest
        ): CompletableFuture<HttpResponseFor<BatchResponseDealToDealSplits>> =
            upsert(publicDealSplitsBatchCreateRequest, RequestOptions.none())
    }
}
