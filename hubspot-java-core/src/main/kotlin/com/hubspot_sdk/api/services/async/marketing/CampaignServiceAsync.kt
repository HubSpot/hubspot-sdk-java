// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignDeleteParams
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignGetParams
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignUpdateParams
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaign
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaignWithAssets
import com.hubspot_sdk.api.services.async.marketing.campaigns.AssetServiceAsync
import com.hubspot_sdk.api.services.async.marketing.campaigns.BatchServiceAsync
import com.hubspot_sdk.api.services.async.marketing.campaigns.BudgetServiceAsync
import com.hubspot_sdk.api.services.async.marketing.campaigns.MetricServiceAsync
import com.hubspot_sdk.api.services.async.marketing.campaigns.SpendServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CampaignServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignServiceAsync

    fun assets(): AssetServiceAsync

    fun batch(): BatchServiceAsync

    fun budget(): BudgetServiceAsync

    fun metrics(): MetricServiceAsync

    fun spend(): SpendServiceAsync

    /**
     * Perform a partial update of a campaign identified by the specified ID. Provided property
     * values will be overwritten. Read-only and non-existent properties will be ignored. Properties
     * values can be cleared by passing an empty string. Note: The 'hs_goal' property is deprecated
     * and will be ignored if provided.
     */
    fun update(
        campaignGuid: String,
        params: CampaignUpdateParams,
    ): CompletableFuture<PublicCampaign> = update(campaignGuid, params, RequestOptions.none())

    /** @see update */
    fun update(
        campaignGuid: String,
        params: CampaignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCampaign> =
        update(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

    /** @see update */
    fun update(params: CampaignUpdateParams): CompletableFuture<PublicCampaign> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CampaignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCampaign>

    /**
     * Delete a specified campaign from the system. This operation removes the campaign identified
     * by the provided campaignGuid from your HubSpot account.
     */
    fun delete(campaignGuid: String): CompletableFuture<Void?> =
        delete(campaignGuid, CampaignDeleteParams.none())

    /** @see delete */
    fun delete(
        campaignGuid: String,
        params: CampaignDeleteParams = CampaignDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

    /** @see delete */
    fun delete(
        campaignGuid: String,
        params: CampaignDeleteParams = CampaignDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(campaignGuid, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CampaignDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: CampaignDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(campaignGuid: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(campaignGuid, CampaignDeleteParams.none(), requestOptions)

    /**
     * Read a campaign identified by a specified internal ID. This endpoint allows you to retrieve
     * detailed information about a specific marketing campaign using its unique identifier. It
     * supports filtering the response by specific properties and date ranges.
     */
    fun get(campaignGuid: String): CompletableFuture<PublicCampaignWithAssets> =
        get(campaignGuid, CampaignGetParams.none())

    /** @see get */
    fun get(
        campaignGuid: String,
        params: CampaignGetParams = CampaignGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCampaignWithAssets> =
        get(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

    /** @see get */
    fun get(
        campaignGuid: String,
        params: CampaignGetParams = CampaignGetParams.none(),
    ): CompletableFuture<PublicCampaignWithAssets> =
        get(campaignGuid, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CampaignGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCampaignWithAssets>

    /** @see get */
    fun get(params: CampaignGetParams): CompletableFuture<PublicCampaignWithAssets> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        campaignGuid: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicCampaignWithAssets> =
        get(campaignGuid, CampaignGetParams.none(), requestOptions)

    /**
     * A view of [CampaignServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CampaignServiceAsync.WithRawResponse

        fun assets(): AssetServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        fun budget(): BudgetServiceAsync.WithRawResponse

        fun metrics(): MetricServiceAsync.WithRawResponse

        fun spend(): SpendServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /marketing/campaigns/2026-03/{campaignGuid}`, but
         * is otherwise the same as [CampaignServiceAsync.update].
         */
        fun update(
            campaignGuid: String,
            params: CampaignUpdateParams,
        ): CompletableFuture<HttpResponseFor<PublicCampaign>> =
            update(campaignGuid, params, RequestOptions.none())

        /** @see update */
        fun update(
            campaignGuid: String,
            params: CampaignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCampaign>> =
            update(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

        /** @see update */
        fun update(
            params: CampaignUpdateParams
        ): CompletableFuture<HttpResponseFor<PublicCampaign>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CampaignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCampaign>>

        /**
         * Returns a raw HTTP response for `delete /marketing/campaigns/2026-03/{campaignGuid}`, but
         * is otherwise the same as [CampaignServiceAsync.delete].
         */
        fun delete(campaignGuid: String): CompletableFuture<HttpResponse> =
            delete(campaignGuid, CampaignDeleteParams.none())

        /** @see delete */
        fun delete(
            campaignGuid: String,
            params: CampaignDeleteParams = CampaignDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

        /** @see delete */
        fun delete(
            campaignGuid: String,
            params: CampaignDeleteParams = CampaignDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(campaignGuid, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CampaignDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: CampaignDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            campaignGuid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(campaignGuid, CampaignDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /marketing/campaigns/2026-03/{campaignGuid}`, but is
         * otherwise the same as [CampaignServiceAsync.get].
         */
        fun get(
            campaignGuid: String
        ): CompletableFuture<HttpResponseFor<PublicCampaignWithAssets>> =
            get(campaignGuid, CampaignGetParams.none())

        /** @see get */
        fun get(
            campaignGuid: String,
            params: CampaignGetParams = CampaignGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCampaignWithAssets>> =
            get(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

        /** @see get */
        fun get(
            campaignGuid: String,
            params: CampaignGetParams = CampaignGetParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicCampaignWithAssets>> =
            get(campaignGuid, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: CampaignGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCampaignWithAssets>>

        /** @see get */
        fun get(
            params: CampaignGetParams
        ): CompletableFuture<HttpResponseFor<PublicCampaignWithAssets>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            campaignGuid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicCampaignWithAssets>> =
            get(campaignGuid, CampaignGetParams.none(), requestOptions)
    }
}
