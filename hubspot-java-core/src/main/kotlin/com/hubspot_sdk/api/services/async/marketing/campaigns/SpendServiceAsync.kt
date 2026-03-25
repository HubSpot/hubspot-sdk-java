// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.campaigns

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.campaigns.PublicSpendItem
import com.hubspot_sdk.api.models.marketing.campaigns.spend.SpendCreateParams
import com.hubspot_sdk.api.models.marketing.campaigns.spend.SpendDeleteParams
import com.hubspot_sdk.api.models.marketing.campaigns.spend.SpendGetParams
import com.hubspot_sdk.api.models.marketing.campaigns.spend.SpendUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SpendServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpendServiceAsync

    /**
     * Create a new campaign spend item for a specific campaign identified by its unique ID. This
     * endpoint allows you to add financial details related to campaign expenditures, which can be
     * useful for budget tracking and financial reporting.
     */
    fun create(
        campaignGuid: String,
        params: SpendCreateParams,
    ): CompletableFuture<PublicSpendItem> = create(campaignGuid, params, RequestOptions.none())

    /** @see create */
    fun create(
        campaignGuid: String,
        params: SpendCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSpendItem> =
        create(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

    /** @see create */
    fun create(params: SpendCreateParams): CompletableFuture<PublicSpendItem> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SpendCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSpendItem>

    /**
     * Update a specific campaign spend item by its ID. This endpoint allows you to modify the
     * details of a spend item associated with a marketing campaign, such as its amount, name, or
     * order. Use this to keep your campaign spend data accurate and up-to-date.
     */
    fun update(spendId: Long, params: SpendUpdateParams): CompletableFuture<PublicSpendItem> =
        update(spendId, params, RequestOptions.none())

    /** @see update */
    fun update(
        spendId: Long,
        params: SpendUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSpendItem> =
        update(params.toBuilder().spendId(spendId).build(), requestOptions)

    /** @see update */
    fun update(params: SpendUpdateParams): CompletableFuture<PublicSpendItem> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SpendUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSpendItem>

    /**
     * Delete a specific campaign spend item by its ID. This operation is useful for removing spend
     * items that are no longer needed or were added in error. Once deleted, the spend item cannot
     * be recovered.
     */
    fun delete(spendId: Long, params: SpendDeleteParams): CompletableFuture<Void?> =
        delete(spendId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        spendId: Long,
        params: SpendDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().spendId(spendId).build(), requestOptions)

    /** @see delete */
    fun delete(params: SpendDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SpendDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Retrieve details of a specific campaign spend item using its spendId. This endpoint allows
     * you to access information about the spend associated with a particular campaign, identified
     * by the campaignGuid.
     */
    fun get(spendId: Long, params: SpendGetParams): CompletableFuture<PublicSpendItem> =
        get(spendId, params, RequestOptions.none())

    /** @see get */
    fun get(
        spendId: Long,
        params: SpendGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSpendItem> =
        get(params.toBuilder().spendId(spendId).build(), requestOptions)

    /** @see get */
    fun get(params: SpendGetParams): CompletableFuture<PublicSpendItem> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SpendGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSpendItem>

    /** A view of [SpendServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SpendServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /marketing/campaigns/2026-03/{campaignGuid}/spend`,
         * but is otherwise the same as [SpendServiceAsync.create].
         */
        fun create(
            campaignGuid: String,
            params: SpendCreateParams,
        ): CompletableFuture<HttpResponseFor<PublicSpendItem>> =
            create(campaignGuid, params, RequestOptions.none())

        /** @see create */
        fun create(
            campaignGuid: String,
            params: SpendCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSpendItem>> =
            create(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

        /** @see create */
        fun create(params: SpendCreateParams): CompletableFuture<HttpResponseFor<PublicSpendItem>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SpendCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSpendItem>>

        /**
         * Returns a raw HTTP response for `put
         * /marketing/campaigns/2026-03/{campaignGuid}/spend/{spendId}`, but is otherwise the same
         * as [SpendServiceAsync.update].
         */
        fun update(
            spendId: Long,
            params: SpendUpdateParams,
        ): CompletableFuture<HttpResponseFor<PublicSpendItem>> =
            update(spendId, params, RequestOptions.none())

        /** @see update */
        fun update(
            spendId: Long,
            params: SpendUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSpendItem>> =
            update(params.toBuilder().spendId(spendId).build(), requestOptions)

        /** @see update */
        fun update(params: SpendUpdateParams): CompletableFuture<HttpResponseFor<PublicSpendItem>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SpendUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSpendItem>>

        /**
         * Returns a raw HTTP response for `delete
         * /marketing/campaigns/2026-03/{campaignGuid}/spend/{spendId}`, but is otherwise the same
         * as [SpendServiceAsync.delete].
         */
        fun delete(spendId: Long, params: SpendDeleteParams): CompletableFuture<HttpResponse> =
            delete(spendId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            spendId: Long,
            params: SpendDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().spendId(spendId).build(), requestOptions)

        /** @see delete */
        fun delete(params: SpendDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SpendDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /marketing/campaigns/2026-03/{campaignGuid}/spend/{spendId}`, but is otherwise the same
         * as [SpendServiceAsync.get].
         */
        fun get(
            spendId: Long,
            params: SpendGetParams,
        ): CompletableFuture<HttpResponseFor<PublicSpendItem>> =
            get(spendId, params, RequestOptions.none())

        /** @see get */
        fun get(
            spendId: Long,
            params: SpendGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSpendItem>> =
            get(params.toBuilder().spendId(spendId).build(), requestOptions)

        /** @see get */
        fun get(params: SpendGetParams): CompletableFuture<HttpResponseFor<PublicSpendItem>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SpendGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSpendItem>>
    }
}
