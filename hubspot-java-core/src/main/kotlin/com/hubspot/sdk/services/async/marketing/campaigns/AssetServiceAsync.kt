// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.marketing.campaigns

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.marketing.campaigns.CollectionResponsePublicCampaignAssetForwardPaging
import com.hubspot.sdk.models.marketing.campaigns.assets.AssetDeleteParams
import com.hubspot.sdk.models.marketing.campaigns.assets.AssetListParams
import com.hubspot.sdk.models.marketing.campaigns.assets.AssetUpdateParams
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
     * Associate a specified asset with a campaign. Using the API, you can create associations for
     * the following asset types: ads, blog posts, calls, case studies, CTAs, CTAs (legacy),
     * external website pages, feedback surveys, forms, files, knowledge base articles, landing
     * pages, marketing email, marketing events, meetings, playbooks, podcast episodes, sales
     * documents, sales emails, sequences, SMS, social posts, static lists, videos, website pages,
     * and workflows.
     *
     * For other asset types, it is recommended to manage your associations directly in the campaign
     * tool in HubSpot.
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
     * This endpoint lists all assets of the campaign by asset type. The assetType parameter is
     * required, and each request can only fetch assets of a single type. Asset metrics can also be
     * fetched along with the assets; they are available only if start and end dates are provided.
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
     * Disassociate a specified asset from a campaign. Using the API, you can remove associations
     * for the following asset types: ads, blog posts, calls, case studies, CTAs, CTAs (legacy),
     * external website pages, feedback surveys, forms, files, knowledge base articles, landing
     * pages, marketing email, marketing events, meetings, playbooks, podcast episodes, sales
     * documents, sales emails, sequences, SMS, social posts, static lists, videos, website pages,
     * and workflows.
     *
     * For other asset types, it is recommended to manage your associations directly in the campaign
     * tool in HubSpot.
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
