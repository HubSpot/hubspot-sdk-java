// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.campaigns

import com.google.errorprone.annotations.MustBeClosed
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

    /**
     * Create a batch of campaigns with specified properties. This endpoint allows for the creation
     * of multiple campaigns in a single request. Note that the 'hs_goal' property is deprecated and
     * will be ignored if provided.
     */
    fun create(params: BatchCreateParams): BatchResponsePublicCampaign =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicCampaign

    /** @see create */
    fun create(
        batchInputPublicCampaignInput: BatchInputPublicCampaignInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicCampaign =
        create(
            BatchCreateParams.builder()
                .batchInputPublicCampaignInput(batchInputPublicCampaignInput)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        batchInputPublicCampaignInput: BatchInputPublicCampaignInput
    ): BatchResponsePublicCampaign = create(batchInputPublicCampaignInput, RequestOptions.none())

    /**
     * Update a batch of marketing campaigns with specified properties. This endpoint allows you to
     * modify multiple campaigns in one request. Note that the 'hs_goal' property is deprecated and
     * will be ignored if provided.
     */
    fun update(params: BatchUpdateParams): BatchResponsePublicCampaign =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicCampaign

    /** @see update */
    fun update(
        batchInputPublicCampaignBatchUpdateItem: BatchInputPublicCampaignBatchUpdateItem,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicCampaign =
        update(
            BatchUpdateParams.builder()
                .batchInputPublicCampaignBatchUpdateItem(batchInputPublicCampaignBatchUpdateItem)
                .build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        batchInputPublicCampaignBatchUpdateItem: BatchInputPublicCampaignBatchUpdateItem
    ): BatchResponsePublicCampaign =
        update(batchInputPublicCampaignBatchUpdateItem, RequestOptions.none())

    /**
     * Archive a batch of marketing campaigns in your HubSpot account. This operation permanently
     * removes the specified campaigns, making them inaccessible. It is useful for cleaning up
     * outdated or unnecessary campaigns in bulk.
     */
    fun delete(params: BatchDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: BatchDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(
        batchInputPublicCampaignDeleteInput: BatchInputPublicCampaignDeleteInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        delete(
            BatchDeleteParams.builder()
                .batchInputPublicCampaignDeleteInput(batchInputPublicCampaignDeleteInput)
                .build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(batchInputPublicCampaignDeleteInput: BatchInputPublicCampaignDeleteInput) =
        delete(batchInputPublicCampaignDeleteInput, RequestOptions.none())

    /**
     * Retrieve a batch of campaigns with specified properties and date range. This endpoint allows
     * you to filter campaigns by start and end dates and specify which properties to include in the
     * response.
     */
    fun get(params: BatchGetParams): BatchResponsePublicCampaignWithAssets =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicCampaignWithAssets

    /** @see get */
    fun get(
        batchInputPublicCampaignReadInput: BatchInputPublicCampaignReadInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicCampaignWithAssets =
        get(
            BatchGetParams.builder()
                .batchInputPublicCampaignReadInput(batchInputPublicCampaignReadInput)
                .build(),
            requestOptions,
        )

    /** @see get */
    fun get(
        batchInputPublicCampaignReadInput: BatchInputPublicCampaignReadInput
    ): BatchResponsePublicCampaignWithAssets =
        get(batchInputPublicCampaignReadInput, RequestOptions.none())

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /marketing/campaigns/2026-03/batch/create`, but is
         * otherwise the same as [BatchService.create].
         */
        @MustBeClosed
        fun create(params: BatchCreateParams): HttpResponseFor<BatchResponsePublicCampaign> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicCampaign>

        /** @see create */
        @MustBeClosed
        fun create(
            batchInputPublicCampaignInput: BatchInputPublicCampaignInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicCampaign> =
            create(
                BatchCreateParams.builder()
                    .batchInputPublicCampaignInput(batchInputPublicCampaignInput)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            batchInputPublicCampaignInput: BatchInputPublicCampaignInput
        ): HttpResponseFor<BatchResponsePublicCampaign> =
            create(batchInputPublicCampaignInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /marketing/campaigns/2026-03/batch/update`, but is
         * otherwise the same as [BatchService.update].
         */
        @MustBeClosed
        fun update(params: BatchUpdateParams): HttpResponseFor<BatchResponsePublicCampaign> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicCampaign>

        /** @see update */
        @MustBeClosed
        fun update(
            batchInputPublicCampaignBatchUpdateItem: BatchInputPublicCampaignBatchUpdateItem,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicCampaign> =
            update(
                BatchUpdateParams.builder()
                    .batchInputPublicCampaignBatchUpdateItem(
                        batchInputPublicCampaignBatchUpdateItem
                    )
                    .build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(
            batchInputPublicCampaignBatchUpdateItem: BatchInputPublicCampaignBatchUpdateItem
        ): HttpResponseFor<BatchResponsePublicCampaign> =
            update(batchInputPublicCampaignBatchUpdateItem, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /marketing/campaigns/2026-03/batch/archive`, but is
         * otherwise the same as [BatchService.delete].
         */
        @MustBeClosed
        fun delete(params: BatchDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(
            batchInputPublicCampaignDeleteInput: BatchInputPublicCampaignDeleteInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(
                BatchDeleteParams.builder()
                    .batchInputPublicCampaignDeleteInput(batchInputPublicCampaignDeleteInput)
                    .build(),
                requestOptions,
            )

        /** @see delete */
        @MustBeClosed
        fun delete(
            batchInputPublicCampaignDeleteInput: BatchInputPublicCampaignDeleteInput
        ): HttpResponse = delete(batchInputPublicCampaignDeleteInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /marketing/campaigns/2026-03/batch/read`, but is
         * otherwise the same as [BatchService.get].
         */
        @MustBeClosed
        fun get(params: BatchGetParams): HttpResponseFor<BatchResponsePublicCampaignWithAssets> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicCampaignWithAssets>

        /** @see get */
        @MustBeClosed
        fun get(
            batchInputPublicCampaignReadInput: BatchInputPublicCampaignReadInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicCampaignWithAssets> =
            get(
                BatchGetParams.builder()
                    .batchInputPublicCampaignReadInput(batchInputPublicCampaignReadInput)
                    .build(),
                requestOptions,
            )

        /** @see get */
        @MustBeClosed
        fun get(
            batchInputPublicCampaignReadInput: BatchInputPublicCampaignReadInput
        ): HttpResponseFor<BatchResponsePublicCampaignWithAssets> =
            get(batchInputPublicCampaignReadInput, RequestOptions.none())
    }
}
