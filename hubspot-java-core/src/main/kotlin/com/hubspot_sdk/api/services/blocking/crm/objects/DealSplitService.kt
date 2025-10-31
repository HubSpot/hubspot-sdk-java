// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.BatchInputPublicObjectId
import com.hubspot_sdk.api.models.crm.objects.dealsplits.DealSplitBatchReadParams
import com.hubspot_sdk.api.models.crm.objects.dealsplits.DealSplitBatchReadResponse
import com.hubspot_sdk.api.models.crm.objects.dealsplits.DealSplitBatchUpsertParams
import com.hubspot_sdk.api.models.crm.objects.dealsplits.DealSplitBatchUpsertResponse
import java.util.function.Consumer

interface DealSplitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DealSplitService

    /** Read a batch of deal split objects by their associated deal object internal ID */
    fun batchRead(params: DealSplitBatchReadParams): DealSplitBatchReadResponse =
        batchRead(params, RequestOptions.none())

    /** @see batchRead */
    fun batchRead(
        params: DealSplitBatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DealSplitBatchReadResponse

    /** @see batchRead */
    fun batchRead(
        batchInputPublicObjectId: BatchInputPublicObjectId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DealSplitBatchReadResponse =
        batchRead(
            DealSplitBatchReadParams.builder()
                .batchInputPublicObjectId(batchInputPublicObjectId)
                .build(),
            requestOptions,
        )

    /** @see batchRead */
    fun batchRead(batchInputPublicObjectId: BatchInputPublicObjectId): DealSplitBatchReadResponse =
        batchRead(batchInputPublicObjectId, RequestOptions.none())

    /**
     * Create or replace deal splits for deals with the provided IDs. Deal split percentages for
     * each deal must sum up to 1.0 (100%) and may have up to 8 decimal places
     */
    fun batchUpsert(params: DealSplitBatchUpsertParams): DealSplitBatchUpsertResponse =
        batchUpsert(params, RequestOptions.none())

    /** @see batchUpsert */
    fun batchUpsert(
        params: DealSplitBatchUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DealSplitBatchUpsertResponse

    /** A view of [DealSplitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DealSplitService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/deals/splits/batch/read`, but is
         * otherwise the same as [DealSplitService.batchRead].
         */
        @MustBeClosed
        fun batchRead(
            params: DealSplitBatchReadParams
        ): HttpResponseFor<DealSplitBatchReadResponse> = batchRead(params, RequestOptions.none())

        /** @see batchRead */
        @MustBeClosed
        fun batchRead(
            params: DealSplitBatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DealSplitBatchReadResponse>

        /** @see batchRead */
        @MustBeClosed
        fun batchRead(
            batchInputPublicObjectId: BatchInputPublicObjectId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DealSplitBatchReadResponse> =
            batchRead(
                DealSplitBatchReadParams.builder()
                    .batchInputPublicObjectId(batchInputPublicObjectId)
                    .build(),
                requestOptions,
            )

        /** @see batchRead */
        @MustBeClosed
        fun batchRead(
            batchInputPublicObjectId: BatchInputPublicObjectId
        ): HttpResponseFor<DealSplitBatchReadResponse> =
            batchRead(batchInputPublicObjectId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/deals/splits/batch/upsert`, but is
         * otherwise the same as [DealSplitService.batchUpsert].
         */
        @MustBeClosed
        fun batchUpsert(
            params: DealSplitBatchUpsertParams
        ): HttpResponseFor<DealSplitBatchUpsertResponse> =
            batchUpsert(params, RequestOptions.none())

        /** @see batchUpsert */
        @MustBeClosed
        fun batchUpsert(
            params: DealSplitBatchUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DealSplitBatchUpsertResponse>
    }
}
