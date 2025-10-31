// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.campaigns

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.campaigns.PublicSpendItem
import com.hubspot_sdk.api.models.marketing.campaigns.spend.SpendCreateParams
import com.hubspot_sdk.api.models.marketing.campaigns.spend.SpendDeleteParams
import com.hubspot_sdk.api.models.marketing.campaigns.spend.SpendGetParams
import com.hubspot_sdk.api.models.marketing.campaigns.spend.SpendUpdateParams
import java.util.function.Consumer

interface SpendService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpendService

    /** Create a new campaign spend item */
    fun create(campaignGuid: String, params: SpendCreateParams): PublicSpendItem =
        create(campaignGuid, params, RequestOptions.none())

    /** @see create */
    fun create(
        campaignGuid: String,
        params: SpendCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSpendItem =
        create(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

    /** @see create */
    fun create(params: SpendCreateParams): PublicSpendItem = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SpendCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSpendItem

    /** Update a specific campaign spend item by ID */
    fun update(spendId: Long, params: SpendUpdateParams): PublicSpendItem =
        update(spendId, params, RequestOptions.none())

    /** @see update */
    fun update(
        spendId: Long,
        params: SpendUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSpendItem = update(params.toBuilder().spendId(spendId).build(), requestOptions)

    /** @see update */
    fun update(params: SpendUpdateParams): PublicSpendItem = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SpendUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSpendItem

    /** Delete a specific campaign spend item by ID */
    fun delete(spendId: Long, params: SpendDeleteParams) =
        delete(spendId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        spendId: Long,
        params: SpendDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().spendId(spendId).build(), requestOptions)

    /** @see delete */
    fun delete(params: SpendDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: SpendDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Read a campaign spend item by its spendId */
    fun get(spendId: Long, params: SpendGetParams): PublicSpendItem =
        get(spendId, params, RequestOptions.none())

    /** @see get */
    fun get(
        spendId: Long,
        params: SpendGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSpendItem = get(params.toBuilder().spendId(spendId).build(), requestOptions)

    /** @see get */
    fun get(params: SpendGetParams): PublicSpendItem = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SpendGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSpendItem

    /** A view of [SpendService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpendService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /marketing/v3/campaigns/{campaignGuid}/spend`, but
         * is otherwise the same as [SpendService.create].
         */
        @MustBeClosed
        fun create(
            campaignGuid: String,
            params: SpendCreateParams,
        ): HttpResponseFor<PublicSpendItem> = create(campaignGuid, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            campaignGuid: String,
            params: SpendCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSpendItem> =
            create(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: SpendCreateParams): HttpResponseFor<PublicSpendItem> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SpendCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSpendItem>

        /**
         * Returns a raw HTTP response for `put
         * /marketing/v3/campaigns/{campaignGuid}/spend/{spendId}`, but is otherwise the same as
         * [SpendService.update].
         */
        @MustBeClosed
        fun update(spendId: Long, params: SpendUpdateParams): HttpResponseFor<PublicSpendItem> =
            update(spendId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            spendId: Long,
            params: SpendUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSpendItem> =
            update(params.toBuilder().spendId(spendId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SpendUpdateParams): HttpResponseFor<PublicSpendItem> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SpendUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSpendItem>

        /**
         * Returns a raw HTTP response for `delete
         * /marketing/v3/campaigns/{campaignGuid}/spend/{spendId}`, but is otherwise the same as
         * [SpendService.delete].
         */
        @MustBeClosed
        fun delete(spendId: Long, params: SpendDeleteParams): HttpResponse =
            delete(spendId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            spendId: Long,
            params: SpendDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().spendId(spendId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: SpendDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SpendDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/campaigns/{campaignGuid}/spend/{spendId}`, but is otherwise the same as
         * [SpendService.get].
         */
        @MustBeClosed
        fun get(spendId: Long, params: SpendGetParams): HttpResponseFor<PublicSpendItem> =
            get(spendId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            spendId: Long,
            params: SpendGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSpendItem> =
            get(params.toBuilder().spendId(spendId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: SpendGetParams): HttpResponseFor<PublicSpendItem> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SpendGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSpendItem>
    }
}
