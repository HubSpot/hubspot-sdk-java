// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.marketing.campaigns

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.marketing.campaigns.BatchInputPublicCampaignBatchUpdateItem
import com.hubspot.models.marketing.campaigns.BatchInputPublicCampaignDeleteInput
import com.hubspot.models.marketing.campaigns.BatchInputPublicCampaignInput
import com.hubspot.models.marketing.campaigns.BatchInputPublicCampaignReadInput
import com.hubspot.models.marketing.campaigns.BatchResponsePublicCampaign
import com.hubspot.models.marketing.campaigns.BatchResponsePublicCampaignWithAssets
import com.hubspot.models.marketing.campaigns.batch.BatchCreateParams
import com.hubspot.models.marketing.campaigns.batch.BatchDeleteParams
import com.hubspot.models.marketing.campaigns.batch.BatchGetParams
import com.hubspot.models.marketing.campaigns.batch.BatchUpdateParams
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

    /**
     * This endpoint creates a batch of campaigns. The maximum number of items in a batch request
     * is 50. The campaigns in the response are not guaranteed to be in the same order as they were
     * provided in the request.
     */
    fun create(params: BatchCreateParams): CompletableFuture<BatchResponsePublicCampaign> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicCampaign>

    /** @see create */
    fun create(
        batchInputPublicCampaignInput: BatchInputPublicCampaignInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicCampaign> =
        create(
            BatchCreateParams.builder()
                .batchInputPublicCampaignInput(batchInputPublicCampaignInput)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        batchInputPublicCampaignInput: BatchInputPublicCampaignInput
    ): CompletableFuture<BatchResponsePublicCampaign> =
        create(batchInputPublicCampaignInput, RequestOptions.none())

    /**
     * This endpoint updates a batch of campaigns based on the provided input data. The maximum
     * number of items in a batch request is 50. If an empty string ("") is passed for any property
     * in the Batch Update, it will reset that property's value.
     */
    fun update(params: BatchUpdateParams): CompletableFuture<BatchResponsePublicCampaign> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicCampaign>

    /** @see update */
    fun update(
        batchInputPublicCampaignBatchUpdateItem: BatchInputPublicCampaignBatchUpdateItem,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicCampaign> =
        update(
            BatchUpdateParams.builder()
                .batchInputPublicCampaignBatchUpdateItem(batchInputPublicCampaignBatchUpdateItem)
                .build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        batchInputPublicCampaignBatchUpdateItem: BatchInputPublicCampaignBatchUpdateItem
    ): CompletableFuture<BatchResponsePublicCampaign> =
        update(batchInputPublicCampaignBatchUpdateItem, RequestOptions.none())

    /**
     * This endpoint deletes a batch of campaigns. The maximum number of items in a batch request
     * is 50. The response will always be 204 No Content, regardless of whether the campaigns exist
     * or not, whether they were successfully deleted or not, or if only some of the campaigns in
     * the batch were deleted.
     */
    fun delete(params: BatchDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(
        batchInputPublicCampaignDeleteInput: BatchInputPublicCampaignDeleteInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(
            BatchDeleteParams.builder()
                .batchInputPublicCampaignDeleteInput(batchInputPublicCampaignDeleteInput)
                .build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(
        batchInputPublicCampaignDeleteInput: BatchInputPublicCampaignDeleteInput
    ): CompletableFuture<Void?> = delete(batchInputPublicCampaignDeleteInput, RequestOptions.none())

    /**
     * This endpoint reads a batch of campaigns based on the provided input data and returns the
     * campaigns along with their associated assets. The maximum number of items in a batch request
     * is 50. The campaigns in the response are not guaranteed to be in the same order as they were
     * provided in the request. If duplicate campaign IDs are provided in the request, duplicates
     * will be ignored. The response will include only unique IDs and will be returned without
     * duplicates.
     */
    fun get(params: BatchGetParams): CompletableFuture<BatchResponsePublicCampaignWithAssets> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicCampaignWithAssets>

    /** @see get */
    fun get(
        batchInputPublicCampaignReadInput: BatchInputPublicCampaignReadInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicCampaignWithAssets> =
        get(
            BatchGetParams.builder()
                .batchInputPublicCampaignReadInput(batchInputPublicCampaignReadInput)
                .build(),
            requestOptions,
        )

    /** @see get */
    fun get(
        batchInputPublicCampaignReadInput: BatchInputPublicCampaignReadInput
    ): CompletableFuture<BatchResponsePublicCampaignWithAssets> =
        get(batchInputPublicCampaignReadInput, RequestOptions.none())

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
         * Returns a raw HTTP response for `post /marketing/campaigns/2026-03/batch/create`, but is
         * otherwise the same as [BatchServiceAsync.create].
         */
        fun create(
            params: BatchCreateParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicCampaign>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicCampaign>>

        /** @see create */
        fun create(
            batchInputPublicCampaignInput: BatchInputPublicCampaignInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicCampaign>> =
            create(
                BatchCreateParams.builder()
                    .batchInputPublicCampaignInput(batchInputPublicCampaignInput)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            batchInputPublicCampaignInput: BatchInputPublicCampaignInput
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicCampaign>> =
            create(batchInputPublicCampaignInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /marketing/campaigns/2026-03/batch/update`, but is
         * otherwise the same as [BatchServiceAsync.update].
         */
        fun update(
            params: BatchUpdateParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicCampaign>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicCampaign>>

        /** @see update */
        fun update(
            batchInputPublicCampaignBatchUpdateItem: BatchInputPublicCampaignBatchUpdateItem,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicCampaign>> =
            update(
                BatchUpdateParams.builder()
                    .batchInputPublicCampaignBatchUpdateItem(
                        batchInputPublicCampaignBatchUpdateItem
                    )
                    .build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            batchInputPublicCampaignBatchUpdateItem: BatchInputPublicCampaignBatchUpdateItem
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicCampaign>> =
            update(batchInputPublicCampaignBatchUpdateItem, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /marketing/campaigns/2026-03/batch/archive`, but is
         * otherwise the same as [BatchServiceAsync.delete].
         */
        fun delete(params: BatchDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(
            batchInputPublicCampaignDeleteInput: BatchInputPublicCampaignDeleteInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(
                BatchDeleteParams.builder()
                    .batchInputPublicCampaignDeleteInput(batchInputPublicCampaignDeleteInput)
                    .build(),
                requestOptions,
            )

        /** @see delete */
        fun delete(
            batchInputPublicCampaignDeleteInput: BatchInputPublicCampaignDeleteInput
        ): CompletableFuture<HttpResponse> =
            delete(batchInputPublicCampaignDeleteInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /marketing/campaigns/2026-03/batch/read`, but is
         * otherwise the same as [BatchServiceAsync.get].
         */
        fun get(
            params: BatchGetParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicCampaignWithAssets>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicCampaignWithAssets>>

        /** @see get */
        fun get(
            batchInputPublicCampaignReadInput: BatchInputPublicCampaignReadInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicCampaignWithAssets>> =
            get(
                BatchGetParams.builder()
                    .batchInputPublicCampaignReadInput(batchInputPublicCampaignReadInput)
                    .build(),
                requestOptions,
            )

        /** @see get */
        fun get(
            batchInputPublicCampaignReadInput: BatchInputPublicCampaignReadInput
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicCampaignWithAssets>> =
            get(batchInputPublicCampaignReadInput, RequestOptions.none())
    }
}
