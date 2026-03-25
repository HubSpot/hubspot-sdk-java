// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignDeleteParams
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignGetParams
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignUpdateParams
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaign
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaignWithAssets
import com.hubspot_sdk.api.services.blocking.marketing.campaigns.AssetService
import com.hubspot_sdk.api.services.blocking.marketing.campaigns.BatchService
import com.hubspot_sdk.api.services.blocking.marketing.campaigns.BudgetService
import com.hubspot_sdk.api.services.blocking.marketing.campaigns.MetricService
import com.hubspot_sdk.api.services.blocking.marketing.campaigns.SpendService
import java.util.function.Consumer

interface CampaignService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignService

    fun assets(): AssetService

    fun batch(): BatchService

    fun budget(): BudgetService

    fun metrics(): MetricService

    fun spend(): SpendService

    /**
     * Perform a partial update of a campaign identified by the specified ID. Provided property
     * values will be overwritten. Read-only and non-existent properties will be ignored. Properties
     * values can be cleared by passing an empty string. Note: The 'hs_goal' property is deprecated
     * and will be ignored if provided.
     */
    fun update(campaignGuid: String, params: CampaignUpdateParams): PublicCampaign =
        update(campaignGuid, params, RequestOptions.none())

    /** @see update */
    fun update(
        campaignGuid: String,
        params: CampaignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCampaign =
        update(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

    /** @see update */
    fun update(params: CampaignUpdateParams): PublicCampaign = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CampaignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCampaign

    /**
     * Delete a specified campaign from the system. This operation removes the campaign identified
     * by the provided campaignGuid from your HubSpot account.
     */
    fun delete(campaignGuid: String) = delete(campaignGuid, CampaignDeleteParams.none())

    /** @see delete */
    fun delete(
        campaignGuid: String,
        params: CampaignDeleteParams = CampaignDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

    /** @see delete */
    fun delete(campaignGuid: String, params: CampaignDeleteParams = CampaignDeleteParams.none()) =
        delete(campaignGuid, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: CampaignDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: CampaignDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(campaignGuid: String, requestOptions: RequestOptions) =
        delete(campaignGuid, CampaignDeleteParams.none(), requestOptions)

    /**
     * Read a campaign identified by a specified internal ID. This endpoint allows you to retrieve
     * detailed information about a specific marketing campaign using its unique identifier. It
     * supports filtering the response by specific properties and date ranges.
     */
    fun get(campaignGuid: String): PublicCampaignWithAssets =
        get(campaignGuid, CampaignGetParams.none())

    /** @see get */
    fun get(
        campaignGuid: String,
        params: CampaignGetParams = CampaignGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCampaignWithAssets =
        get(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

    /** @see get */
    fun get(
        campaignGuid: String,
        params: CampaignGetParams = CampaignGetParams.none(),
    ): PublicCampaignWithAssets = get(campaignGuid, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CampaignGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCampaignWithAssets

    /** @see get */
    fun get(params: CampaignGetParams): PublicCampaignWithAssets =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(campaignGuid: String, requestOptions: RequestOptions): PublicCampaignWithAssets =
        get(campaignGuid, CampaignGetParams.none(), requestOptions)

    /** A view of [CampaignService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignService.WithRawResponse

        fun assets(): AssetService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        fun budget(): BudgetService.WithRawResponse

        fun metrics(): MetricService.WithRawResponse

        fun spend(): SpendService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /marketing/campaigns/2026-03/{campaignGuid}`, but
         * is otherwise the same as [CampaignService.update].
         */
        @MustBeClosed
        fun update(
            campaignGuid: String,
            params: CampaignUpdateParams,
        ): HttpResponseFor<PublicCampaign> = update(campaignGuid, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            campaignGuid: String,
            params: CampaignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCampaign> =
            update(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CampaignUpdateParams): HttpResponseFor<PublicCampaign> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CampaignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCampaign>

        /**
         * Returns a raw HTTP response for `delete /marketing/campaigns/2026-03/{campaignGuid}`, but
         * is otherwise the same as [CampaignService.delete].
         */
        @MustBeClosed
        fun delete(campaignGuid: String): HttpResponse =
            delete(campaignGuid, CampaignDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            campaignGuid: String,
            params: CampaignDeleteParams = CampaignDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            campaignGuid: String,
            params: CampaignDeleteParams = CampaignDeleteParams.none(),
        ): HttpResponse = delete(campaignGuid, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CampaignDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: CampaignDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(campaignGuid: String, requestOptions: RequestOptions): HttpResponse =
            delete(campaignGuid, CampaignDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /marketing/campaigns/2026-03/{campaignGuid}`, but is
         * otherwise the same as [CampaignService.get].
         */
        @MustBeClosed
        fun get(campaignGuid: String): HttpResponseFor<PublicCampaignWithAssets> =
            get(campaignGuid, CampaignGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            campaignGuid: String,
            params: CampaignGetParams = CampaignGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCampaignWithAssets> =
            get(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            campaignGuid: String,
            params: CampaignGetParams = CampaignGetParams.none(),
        ): HttpResponseFor<PublicCampaignWithAssets> =
            get(campaignGuid, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: CampaignGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCampaignWithAssets>

        /** @see get */
        @MustBeClosed
        fun get(params: CampaignGetParams): HttpResponseFor<PublicCampaignWithAssets> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            campaignGuid: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicCampaignWithAssets> =
            get(campaignGuid, CampaignGetParams.none(), requestOptions)
    }
}
