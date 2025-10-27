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
     * Associate a specified asset with a campaign. Using the API, you can create and remove
     * associations for the following asset types: forms, static lists, external website pages,
     * sequences, meetings, playbooks, feedback surveys, podcast episodes, sales documents,
     * marketing emails, case studies, knowledge base articles, calls, and CTAs.
     *
     * For other asset types, it is recommended to manage your associations directly in the campaign
     * tool in HubSpot.
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
     * This endpoint lists all assets of the campaign by asset type. The assetType parameter is
     * required, and each request can only fetch assets of a single type. Asset metrics can also be
     * fetched along with the assets; they are available only if start and end dates are provided.
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
     * Disassociate a specified asset from a campaign. Important: Currently, only the following
     * asset types can be associated and disassociated via the API: Forms, Static lists, External
     * website pages
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
         * /marketing/v3/campaigns/{campaignGuid}/assets/{assetType}/{assetId}`, but is otherwise
         * the same as [AssetService.update].
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
         * /marketing/v3/campaigns/{campaignGuid}/assets/{assetType}`, but is otherwise the same as
         * [AssetService.list].
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
         * /marketing/v3/campaigns/{campaignGuid}/assets/{assetType}/{assetId}`, but is otherwise
         * the same as [AssetService.delete].
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
