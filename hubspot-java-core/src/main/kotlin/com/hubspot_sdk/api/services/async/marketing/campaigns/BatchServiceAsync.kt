// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.campaigns

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.campaigns.BatchInputPublicCampaignBatchUpdateItem
import com.hubspot_sdk.api.models.marketing.campaigns.BatchInputPublicCampaignDeleteInput
import com.hubspot_sdk.api.models.marketing.campaigns.BatchInputPublicCampaignInput
import com.hubspot_sdk.api.models.marketing.campaigns.BatchInputPublicCampaignReadInput
import com.hubspot_sdk.api.models.marketing.campaigns.BatchResponsePublicCampaign
import com.hubspot_sdk.api.models.marketing.campaigns.BatchResponsePublicCampaignWithAssets
import com.hubspot_sdk.api.models.marketing.campaigns.batch.BatchCreateParams
import com.hubspot_sdk.api.models.marketing.campaigns.batch.BatchDeleteParams
import com.hubspot_sdk.api.models.marketing.campaigns.batch.BatchGetParams
import com.hubspot_sdk.api.models.marketing.campaigns.batch.BatchUpdateParams
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
     * Create a batch of campaigns with specified properties. This endpoint allows for the creation
     * of multiple campaigns in a single request. Note that the 'hs_goal' property is deprecated and
     * will be ignored if provided.
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
     * Update a batch of marketing campaigns with specified properties. This endpoint allows you to
     * modify multiple campaigns in one request. Note that the 'hs_goal' property is deprecated and
     * will be ignored if provided.
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
     * Archive a batch of marketing campaigns in your HubSpot account. This operation permanently
     * removes the specified campaigns, making them inaccessible. It is useful for cleaning up
     * outdated or unnecessary campaigns in bulk.
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
     * Retrieve a batch of campaigns with specified properties and date range. This endpoint allows
     * you to filter campaigns by start and end dates and specify which properties to include in the
     * response.
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
