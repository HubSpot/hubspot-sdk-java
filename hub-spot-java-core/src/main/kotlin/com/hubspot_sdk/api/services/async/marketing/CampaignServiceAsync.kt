// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignCreateParams
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignDeleteParams
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignGetParams
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignListPageAsync
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignListParams
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignUpdateParams
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaign
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaignInput
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaignWithAssets
import com.hubspot_sdk.api.services.async.marketing.campaigns.AssetServiceAsync
import com.hubspot_sdk.api.services.async.marketing.campaigns.BatchServiceAsync
import com.hubspot_sdk.api.services.async.marketing.campaigns.BudgetServiceAsync
import com.hubspot_sdk.api.services.async.marketing.campaigns.ReportServiceAsync
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

    fun reports(): ReportServiceAsync

    fun spend(): SpendServiceAsync

    /**
     * Create a campaign with the given properties and return the campaign object, including the
     * campaignGuid and created properties.
     */
    fun create(params: CampaignCreateParams): CompletableFuture<PublicCampaign> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CampaignCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCampaign>

    /** @see create */
    fun create(
        publicCampaignInput: PublicCampaignInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCampaign> =
        create(
            CampaignCreateParams.builder().publicCampaignInput(publicCampaignInput).build(),
            requestOptions,
        )

    /** @see create */
    fun create(publicCampaignInput: PublicCampaignInput): CompletableFuture<PublicCampaign> =
        create(publicCampaignInput, RequestOptions.none())

    /**
     * Perform a partial update of a campaign identified by the specified campaignGuid. Provided
     * property values will be overwritten. Read-only and non-existent properties will cause 400
     * error. If an empty string is passed for any property in the Batch Update, it will reset that
     * property's value.
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
     * This endpoint allows users to search for and return a page of campaigns based on various
     * query parameters. Users can filter by name, sort, and paginate through the campaigns, as well
     * as control which properties are returned in the response.
     */
    fun list(): CompletableFuture<CampaignListPageAsync> = list(CampaignListParams.none())

    /** @see list */
    fun list(
        params: CampaignListParams = CampaignListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignListPageAsync>

    /** @see list */
    fun list(
        params: CampaignListParams = CampaignListParams.none()
    ): CompletableFuture<CampaignListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CampaignListPageAsync> =
        list(CampaignListParams.none(), requestOptions)

    /**
     * Delete a specified campaign from the system. This call will return a 204 No Content response
     * regardless of whether the campaignGuid provided corresponds to an existing campaign or not.
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
     * Get a campaign identified by a specific campaignGuid with the given properties. Along with
     * the campaign information, it also returns information about assets. Depending on the query
     * parameters used, this can also be used to return information about the corresponding assets'
     * metrics. Metrics are available only if startDate and endDate are provided.
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

        fun reports(): ReportServiceAsync.WithRawResponse

        fun spend(): SpendServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /marketing/v3/campaigns/`, but is otherwise the
         * same as [CampaignServiceAsync.create].
         */
        fun create(
            params: CampaignCreateParams
        ): CompletableFuture<HttpResponseFor<PublicCampaign>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CampaignCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCampaign>>

        /** @see create */
        fun create(
            publicCampaignInput: PublicCampaignInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCampaign>> =
            create(
                CampaignCreateParams.builder().publicCampaignInput(publicCampaignInput).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            publicCampaignInput: PublicCampaignInput
        ): CompletableFuture<HttpResponseFor<PublicCampaign>> =
            create(publicCampaignInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /marketing/v3/campaigns/{campaignGuid}`, but is
         * otherwise the same as [CampaignServiceAsync.update].
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
         * Returns a raw HTTP response for `get /marketing/v3/campaigns/`, but is otherwise the same
         * as [CampaignServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CampaignListPageAsync>> =
            list(CampaignListParams.none())

        /** @see list */
        fun list(
            params: CampaignListParams = CampaignListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignListPageAsync>>

        /** @see list */
        fun list(
            params: CampaignListParams = CampaignListParams.none()
        ): CompletableFuture<HttpResponseFor<CampaignListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CampaignListPageAsync>> =
            list(CampaignListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /marketing/v3/campaigns/{campaignGuid}`, but is
         * otherwise the same as [CampaignServiceAsync.delete].
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
         * Returns a raw HTTP response for `get /marketing/v3/campaigns/{campaignGuid}`, but is
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
