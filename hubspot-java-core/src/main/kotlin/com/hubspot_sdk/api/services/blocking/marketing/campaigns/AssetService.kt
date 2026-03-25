// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.campaigns

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.campaigns.CollectionResponsePublicCampaignAssetForwardPaging
import com.hubspot_sdk.api.models.marketing.campaigns.assets.AssetDeleteParams
import com.hubspot_sdk.api.models.marketing.campaigns.assets.AssetListParams
import com.hubspot_sdk.api.models.marketing.campaigns.assets.AssetUpdateParams
import java.util.function.Consumer

interface AssetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssetService

    /**
     * Associate an asset with a specific campaign in your HubSpot account. This operation allows
     * you to link an asset of a specified type and ID to a campaign, facilitating better
     * organization and tracking of campaign resources.
     */
    fun update(assetId: String, params: AssetUpdateParams) =
        update(assetId, params, RequestOptions.none())

    /** @see update */
    fun update(
        assetId: String,
        params: AssetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().assetId(assetId).build(), requestOptions)

    /** @see update */
    fun update(params: AssetUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: AssetUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * List all assets of a specified campaign by asset type. This endpoint allows you to retrieve
     * assets associated with a campaign, filtered by the type of asset. It supports pagination and
     * date filtering to manage and refine the results.
     */
    fun list(
        assetType: String,
        params: AssetListParams,
    ): CollectionResponsePublicCampaignAssetForwardPaging =
        list(assetType, params, RequestOptions.none())

    /** @see list */
    fun list(
        assetType: String,
        params: AssetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicCampaignAssetForwardPaging =
        list(params.toBuilder().assetType(assetType).build(), requestOptions)

    /** @see list */
    fun list(params: AssetListParams): CollectionResponsePublicCampaignAssetForwardPaging =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AssetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicCampaignAssetForwardPaging

    /**
     * Disassociate an asset from a specific campaign. This operation removes the association
     * between the specified asset and campaign, effectively detaching the asset from the campaign's
     * context.
     */
    fun delete(assetId: String, params: AssetDeleteParams) =
        delete(assetId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        assetId: String,
        params: AssetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().assetId(assetId).build(), requestOptions)

    /** @see delete */
    fun delete(params: AssetDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: AssetDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [AssetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssetService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /marketing/campaigns/2026-03/{campaignGuid}/assets/{assetType}/{assetId}`, but is
         * otherwise the same as [AssetService.update].
         */
        @MustBeClosed
        fun update(assetId: String, params: AssetUpdateParams): HttpResponse =
            update(assetId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            assetId: String,
            params: AssetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().assetId(assetId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: AssetUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AssetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /marketing/campaigns/2026-03/{campaignGuid}/assets/{assetType}`, but is otherwise the
         * same as [AssetService.list].
         */
        @MustBeClosed
        fun list(
            assetType: String,
            params: AssetListParams,
        ): HttpResponseFor<CollectionResponsePublicCampaignAssetForwardPaging> =
            list(assetType, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            assetType: String,
            params: AssetListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicCampaignAssetForwardPaging> =
            list(params.toBuilder().assetType(assetType).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: AssetListParams
        ): HttpResponseFor<CollectionResponsePublicCampaignAssetForwardPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AssetListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicCampaignAssetForwardPaging>

        /**
         * Returns a raw HTTP response for `delete
         * /marketing/campaigns/2026-03/{campaignGuid}/assets/{assetType}/{assetId}`, but is
         * otherwise the same as [AssetService.delete].
         */
        @MustBeClosed
        fun delete(assetId: String, params: AssetDeleteParams): HttpResponse =
            delete(assetId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            assetId: String,
            params: AssetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().assetId(assetId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: AssetDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AssetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
