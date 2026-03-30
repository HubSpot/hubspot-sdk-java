// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.dealsplits

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.BatchInputPublicObjectId
import com.hubspot_sdk.api.models.crm.dealsplits.BatchResponseDealToDealSplits
import com.hubspot_sdk.api.models.crm.dealsplits.PublicDealSplitsBatchCreateRequest
import com.hubspot_sdk.api.models.crm.dealsplits.batch.BatchReadParams
import com.hubspot_sdk.api.models.crm.dealsplits.batch.BatchUpsertParams
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

    /** Read a batch of deal split objects by their associated deal object internal ID */
    fun read(params: BatchReadParams): BatchResponseDealToDealSplits =
        read(params, RequestOptions.none())

    /** @see read */
    fun read(
        params: BatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseDealToDealSplits

    /** @see read */
    fun read(
        batchInputPublicObjectId: BatchInputPublicObjectId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseDealToDealSplits =
        read(
            BatchReadParams.builder().batchInputPublicObjectId(batchInputPublicObjectId).build(),
            requestOptions,
        )

    /** @see read */
    fun read(batchInputPublicObjectId: BatchInputPublicObjectId): BatchResponseDealToDealSplits =
        read(batchInputPublicObjectId, RequestOptions.none())

    /**
     * Create or replace deal splits for deals with the provided IDs. Deal split percentages for
     * each deal must sum up to 1.0 (100%) and may have up to 8 decimal places
     */
    fun upsert(params: BatchUpsertParams): BatchResponseDealToDealSplits =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: BatchUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseDealToDealSplits

    /** @see upsert */
    fun upsert(
        publicDealSplitsBatchCreateRequest: PublicDealSplitsBatchCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseDealToDealSplits =
        upsert(
            BatchUpsertParams.builder()
                .publicDealSplitsBatchCreateRequest(publicDealSplitsBatchCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see upsert */
    fun upsert(
        publicDealSplitsBatchCreateRequest: PublicDealSplitsBatchCreateRequest
    ): BatchResponseDealToDealSplits =
        upsert(publicDealSplitsBatchCreateRequest, RequestOptions.none())

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /deal-splits/2026-03/batch/read`, but is otherwise
         * the same as [BatchService.read].
         */
        @MustBeClosed
        fun read(params: BatchReadParams): HttpResponseFor<BatchResponseDealToDealSplits> =
            read(params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(
            params: BatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseDealToDealSplits>

        /** @see read */
        @MustBeClosed
        fun read(
            batchInputPublicObjectId: BatchInputPublicObjectId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseDealToDealSplits> =
            read(
                BatchReadParams.builder()
                    .batchInputPublicObjectId(batchInputPublicObjectId)
                    .build(),
                requestOptions,
            )

        /** @see read */
        @MustBeClosed
        fun read(
            batchInputPublicObjectId: BatchInputPublicObjectId
        ): HttpResponseFor<BatchResponseDealToDealSplits> =
            read(batchInputPublicObjectId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /deal-splits/2026-03/batch/upsert`, but is
         * otherwise the same as [BatchService.upsert].
         */
        @MustBeClosed
        fun upsert(params: BatchUpsertParams): HttpResponseFor<BatchResponseDealToDealSplits> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            params: BatchUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseDealToDealSplits>

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            publicDealSplitsBatchCreateRequest: PublicDealSplitsBatchCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseDealToDealSplits> =
            upsert(
                BatchUpsertParams.builder()
                    .publicDealSplitsBatchCreateRequest(publicDealSplitsBatchCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            publicDealSplitsBatchCreateRequest: PublicDealSplitsBatchCreateRequest
        ): HttpResponseFor<BatchResponseDealToDealSplits> =
            upsert(publicDealSplitsBatchCreateRequest, RequestOptions.none())
    }
}
