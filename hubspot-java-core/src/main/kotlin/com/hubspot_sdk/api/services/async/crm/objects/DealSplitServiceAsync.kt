// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.BatchInputPublicObjectId
import com.hubspot_sdk.api.models.crm.objects.dealsplits.BatchResponseDealToDealSplits
import com.hubspot_sdk.api.models.crm.objects.dealsplits.DealSplitBatchReadParams
import com.hubspot_sdk.api.models.crm.objects.dealsplits.DealSplitBatchUpsertParams
import com.hubspot_sdk.api.models.crm.objects.dealsplits.PublicDealSplitsBatchCreateRequest
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DealSplitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DealSplitServiceAsync

    /** Read a batch of deal split objects by their associated deal object internal ID */
    fun batchRead(
        params: DealSplitBatchReadParams
    ): CompletableFuture<BatchResponseDealToDealSplits> = batchRead(params, RequestOptions.none())

    /** @see batchRead */
    fun batchRead(
        params: DealSplitBatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseDealToDealSplits>

    /** @see batchRead */
    fun batchRead(
        batchInputPublicObjectId: BatchInputPublicObjectId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseDealToDealSplits> =
        batchRead(
            DealSplitBatchReadParams.builder()
                .batchInputPublicObjectId(batchInputPublicObjectId)
                .build(),
            requestOptions,
        )

    /** @see batchRead */
    fun batchRead(
        batchInputPublicObjectId: BatchInputPublicObjectId
    ): CompletableFuture<BatchResponseDealToDealSplits> =
        batchRead(batchInputPublicObjectId, RequestOptions.none())

    /**
     * Create or replace deal splits for deals with the provided IDs. Deal split percentages for
     * each deal must sum up to 1.0 (100%) and may have up to 8 decimal places
     */
    fun batchUpsert(
        params: DealSplitBatchUpsertParams
    ): CompletableFuture<BatchResponseDealToDealSplits> = batchUpsert(params, RequestOptions.none())

    /** @see batchUpsert */
    fun batchUpsert(
        params: DealSplitBatchUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseDealToDealSplits>

    /** @see batchUpsert */
    fun batchUpsert(
        publicDealSplitsBatchCreateRequest: PublicDealSplitsBatchCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseDealToDealSplits> =
        batchUpsert(
            DealSplitBatchUpsertParams.builder()
                .publicDealSplitsBatchCreateRequest(publicDealSplitsBatchCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see batchUpsert */
    fun batchUpsert(
        publicDealSplitsBatchCreateRequest: PublicDealSplitsBatchCreateRequest
    ): CompletableFuture<BatchResponseDealToDealSplits> =
        batchUpsert(publicDealSplitsBatchCreateRequest, RequestOptions.none())

    /**
     * A view of [DealSplitServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DealSplitServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/deals/splits/batch/read`, but is
         * otherwise the same as [DealSplitServiceAsync.batchRead].
         */
        fun batchRead(
            params: DealSplitBatchReadParams
        ): CompletableFuture<HttpResponseFor<BatchResponseDealToDealSplits>> =
            batchRead(params, RequestOptions.none())

        /** @see batchRead */
        fun batchRead(
            params: DealSplitBatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseDealToDealSplits>>

        /** @see batchRead */
        fun batchRead(
            batchInputPublicObjectId: BatchInputPublicObjectId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseDealToDealSplits>> =
            batchRead(
                DealSplitBatchReadParams.builder()
                    .batchInputPublicObjectId(batchInputPublicObjectId)
                    .build(),
                requestOptions,
            )

        /** @see batchRead */
        fun batchRead(
            batchInputPublicObjectId: BatchInputPublicObjectId
        ): CompletableFuture<HttpResponseFor<BatchResponseDealToDealSplits>> =
            batchRead(batchInputPublicObjectId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/deals/splits/batch/upsert`, but is
         * otherwise the same as [DealSplitServiceAsync.batchUpsert].
         */
        fun batchUpsert(
            params: DealSplitBatchUpsertParams
        ): CompletableFuture<HttpResponseFor<BatchResponseDealToDealSplits>> =
            batchUpsert(params, RequestOptions.none())

        /** @see batchUpsert */
        fun batchUpsert(
            params: DealSplitBatchUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseDealToDealSplits>>

        /** @see batchUpsert */
        fun batchUpsert(
            publicDealSplitsBatchCreateRequest: PublicDealSplitsBatchCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseDealToDealSplits>> =
            batchUpsert(
                DealSplitBatchUpsertParams.builder()
                    .publicDealSplitsBatchCreateRequest(publicDealSplitsBatchCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see batchUpsert */
        fun batchUpsert(
            publicDealSplitsBatchCreateRequest: PublicDealSplitsBatchCreateRequest
        ): CompletableFuture<HttpResponseFor<BatchResponseDealToDealSplits>> =
            batchUpsert(publicDealSplitsBatchCreateRequest, RequestOptions.none())
    }
}
