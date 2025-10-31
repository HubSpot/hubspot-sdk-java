// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignCreateParams
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignDeleteParams
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignGetParams
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignListPage
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignListParams
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignUpdateParams
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaign
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaignInput
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaignWithAssets
import com.hubspot_sdk.api.services.blocking.marketing.campaigns.AssetService
import com.hubspot_sdk.api.services.blocking.marketing.campaigns.BatchService
import com.hubspot_sdk.api.services.blocking.marketing.campaigns.BudgetService
import com.hubspot_sdk.api.services.blocking.marketing.campaigns.ReportService
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

    fun reports(): ReportService

    fun spend(): SpendService

    /**
     * Create a campaign with the given properties and return the campaign object, including the
     * campaignGuid and created properties.
     */
    fun create(params: CampaignCreateParams): PublicCampaign = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CampaignCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCampaign

    /** @see create */
    fun create(
        publicCampaignInput: PublicCampaignInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCampaign =
        create(
            CampaignCreateParams.builder().publicCampaignInput(publicCampaignInput).build(),
            requestOptions,
        )

    /** @see create */
    fun create(publicCampaignInput: PublicCampaignInput): PublicCampaign =
        create(publicCampaignInput, RequestOptions.none())

    /**
     * Perform a partial update of a campaign identified by the specified campaignGuid. Provided
     * property values will be overwritten. Read-only and non-existent properties will cause 400
     * error. If an empty string is passed for any property in the Batch Update, it will reset that
     * property's value.
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
     * This endpoint allows users to search for and return a page of campaigns based on various
     * query parameters. Users can filter by name, sort, and paginate through the campaigns, as well
     * as control which properties are returned in the response.
     */
    fun list(): CampaignListPage = list(CampaignListParams.none())

    /** @see list */
    fun list(
        params: CampaignListParams = CampaignListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignListPage

    /** @see list */
    fun list(params: CampaignListParams = CampaignListParams.none()): CampaignListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CampaignListPage =
        list(CampaignListParams.none(), requestOptions)

    /**
     * Delete a specified campaign from the system. This call will return a 204 No Content response
     * regardless of whether the campaignGuid provided corresponds to an existing campaign or not.
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
     * Get a campaign identified by a specific campaignGuid with the given properties. Along with
     * the campaign information, it also returns information about assets. Depending on the query
     * parameters used, this can also be used to return information about the corresponding assets'
     * metrics. Metrics are available only if startDate and endDate are provided.
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

        fun reports(): ReportService.WithRawResponse

        fun spend(): SpendService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /marketing/v3/campaigns/`, but is otherwise the
         * same as [CampaignService.create].
         */
        @MustBeClosed
        fun create(params: CampaignCreateParams): HttpResponseFor<PublicCampaign> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CampaignCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCampaign>

        /** @see create */
        @MustBeClosed
        fun create(
            publicCampaignInput: PublicCampaignInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCampaign> =
            create(
                CampaignCreateParams.builder().publicCampaignInput(publicCampaignInput).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(publicCampaignInput: PublicCampaignInput): HttpResponseFor<PublicCampaign> =
            create(publicCampaignInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /marketing/v3/campaigns/{campaignGuid}`, but is
         * otherwise the same as [CampaignService.update].
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
         * Returns a raw HTTP response for `get /marketing/v3/campaigns/`, but is otherwise the same
         * as [CampaignService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CampaignListPage> = list(CampaignListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CampaignListParams = CampaignListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CampaignListParams = CampaignListParams.none()
        ): HttpResponseFor<CampaignListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CampaignListPage> =
            list(CampaignListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /marketing/v3/campaigns/{campaignGuid}`, but is
         * otherwise the same as [CampaignService.delete].
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
         * Returns a raw HTTP response for `get /marketing/v3/campaigns/{campaignGuid}`, but is
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
