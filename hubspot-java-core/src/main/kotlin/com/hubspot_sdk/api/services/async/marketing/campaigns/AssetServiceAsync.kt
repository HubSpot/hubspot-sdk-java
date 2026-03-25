// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.campaigns

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.campaigns.CollectionResponsePublicCampaignAssetForwardPaging
import com.hubspot_sdk.api.models.marketing.campaigns.assets.AssetDeleteParams
import com.hubspot_sdk.api.models.marketing.campaigns.assets.AssetListParams
import com.hubspot_sdk.api.models.marketing.campaigns.assets.AssetUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AssetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssetServiceAsync

    /**
     * Associate an asset with a specific campaign in your HubSpot account. This operation allows
     * you to link an asset of a specified type and ID to a campaign, facilitating better
     * organization and tracking of campaign resources.
     */
    fun update(assetId: String, params: AssetUpdateParams): CompletableFuture<Void?> =
        update(assetId, params, RequestOptions.none())

    /** @see update */
    fun update(
        assetId: String,
        params: AssetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        update(params.toBuilder().assetId(assetId).build(), requestOptions)

    /** @see update */
    fun update(params: AssetUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AssetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * List all assets of a specified campaign by asset type. This endpoint allows you to retrieve
     * assets associated with a campaign, filtered by the type of asset. It supports pagination and
     * date filtering to manage and refine the results.
     */
    fun list(
        assetType: String,
        params: AssetListParams,
    ): CompletableFuture<CollectionResponsePublicCampaignAssetForwardPaging> =
        list(assetType, params, RequestOptions.none())

    /** @see list */
    fun list(
        assetType: String,
        params: AssetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicCampaignAssetForwardPaging> =
        list(params.toBuilder().assetType(assetType).build(), requestOptions)

    /** @see list */
    fun list(
        params: AssetListParams
    ): CompletableFuture<CollectionResponsePublicCampaignAssetForwardPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AssetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicCampaignAssetForwardPaging>

    /**
     * Disassociate an asset from a specific campaign. This operation removes the association
     * between the specified asset and campaign, effectively detaching the asset from the campaign's
     * context.
     */
    fun delete(assetId: String, params: AssetDeleteParams): CompletableFuture<Void?> =
        delete(assetId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        assetId: String,
        params: AssetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().assetId(assetId).build(), requestOptions)

    /** @see delete */
    fun delete(params: AssetDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AssetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [AssetServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /marketing/campaigns/2026-03/{campaignGuid}/assets/{assetType}/{assetId}`, but is
         * otherwise the same as [AssetServiceAsync.update].
         */
        fun update(assetId: String, params: AssetUpdateParams): CompletableFuture<HttpResponse> =
            update(assetId, params, RequestOptions.none())

        /** @see update */
        fun update(
            assetId: String,
            params: AssetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().assetId(assetId).build(), requestOptions)

        /** @see update */
        fun update(params: AssetUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AssetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /marketing/campaigns/2026-03/{campaignGuid}/assets/{assetType}`, but is otherwise the
         * same as [AssetServiceAsync.list].
         */
        fun list(
            assetType: String,
            params: AssetListParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicCampaignAssetForwardPaging>> =
            list(assetType, params, RequestOptions.none())

        /** @see list */
        fun list(
            assetType: String,
            params: AssetListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicCampaignAssetForwardPaging>> =
            list(params.toBuilder().assetType(assetType).build(), requestOptions)

        /** @see list */
        fun list(
            params: AssetListParams
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicCampaignAssetForwardPaging>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: AssetListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicCampaignAssetForwardPaging>>

        /**
         * Returns a raw HTTP response for `delete
         * /marketing/campaigns/2026-03/{campaignGuid}/assets/{assetType}/{assetId}`, but is
         * otherwise the same as [AssetServiceAsync.delete].
         */
        fun delete(assetId: String, params: AssetDeleteParams): CompletableFuture<HttpResponse> =
            delete(assetId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            assetId: String,
            params: AssetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().assetId(assetId).build(), requestOptions)

        /** @see delete */
        fun delete(params: AssetDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AssetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
