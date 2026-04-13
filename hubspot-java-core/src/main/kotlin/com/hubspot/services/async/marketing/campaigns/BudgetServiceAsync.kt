// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.marketing.campaigns

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.marketing.campaigns.PublicBudgetItem
import com.hubspot.models.marketing.campaigns.PublicBudgetTotals
import com.hubspot.models.marketing.campaigns.budget.BudgetCreateParams
import com.hubspot.models.marketing.campaigns.budget.BudgetDeleteParams
import com.hubspot.models.marketing.campaigns.budget.BudgetGetParams
import com.hubspot.models.marketing.campaigns.budget.BudgetGetTotalsParams
import com.hubspot.models.marketing.campaigns.budget.BudgetUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BudgetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BudgetServiceAsync

    /** Add a new budget item to the campaign */
    fun create(
        campaignGuid: String,
        params: BudgetCreateParams,
    ): CompletableFuture<PublicBudgetItem> = create(campaignGuid, params, RequestOptions.none())

    /** @see create */
    fun create(
        campaignGuid: String,
        params: BudgetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicBudgetItem> =
        create(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

    /** @see create */
    fun create(params: BudgetCreateParams): CompletableFuture<PublicBudgetItem> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BudgetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicBudgetItem>

    /** Update a specific budget item by ID */
    fun update(budgetId: Long, params: BudgetUpdateParams): CompletableFuture<PublicBudgetItem> =
        update(budgetId, params, RequestOptions.none())

    /** @see update */
    fun update(
        budgetId: Long,
        params: BudgetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicBudgetItem> =
        update(params.toBuilder().budgetId(budgetId).build(), requestOptions)

    /** @see update */
    fun update(params: BudgetUpdateParams): CompletableFuture<PublicBudgetItem> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BudgetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicBudgetItem>

    /** Delete a specific budget item by ID */
    fun delete(budgetId: Long, params: BudgetDeleteParams): CompletableFuture<Void?> =
        delete(budgetId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        budgetId: Long,
        params: BudgetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().budgetId(budgetId).build(), requestOptions)

    /** @see delete */
    fun delete(params: BudgetDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BudgetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get a specific budget item by ID */
    fun get(budgetId: Long, params: BudgetGetParams): CompletableFuture<PublicBudgetItem> =
        get(budgetId, params, RequestOptions.none())

    /** @see get */
    fun get(
        budgetId: Long,
        params: BudgetGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicBudgetItem> =
        get(params.toBuilder().budgetId(budgetId).build(), requestOptions)

    /** @see get */
    fun get(params: BudgetGetParams): CompletableFuture<PublicBudgetItem> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BudgetGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicBudgetItem>

    /**
     * Retrieve detailed information about the budget and spend items for a specified campaign,
     * including the total budget, total spend, and remaining budget. Budget and Spend items may be
     * returned in any order, but the order field specifies their sequence based on the creation
     * date. The item with order 0 is the oldest, and items with higher order values are newer
     */
    fun getTotals(campaignGuid: String): CompletableFuture<PublicBudgetTotals> =
        getTotals(campaignGuid, BudgetGetTotalsParams.none())

    /** @see getTotals */
    fun getTotals(
        campaignGuid: String,
        params: BudgetGetTotalsParams = BudgetGetTotalsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicBudgetTotals> =
        getTotals(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

    /** @see getTotals */
    fun getTotals(
        campaignGuid: String,
        params: BudgetGetTotalsParams = BudgetGetTotalsParams.none(),
    ): CompletableFuture<PublicBudgetTotals> =
        getTotals(campaignGuid, params, RequestOptions.none())

    /** @see getTotals */
    fun getTotals(
        params: BudgetGetTotalsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicBudgetTotals>

    /** @see getTotals */
    fun getTotals(params: BudgetGetTotalsParams): CompletableFuture<PublicBudgetTotals> =
        getTotals(params, RequestOptions.none())

    /** @see getTotals */
    fun getTotals(
        campaignGuid: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicBudgetTotals> =
        getTotals(campaignGuid, BudgetGetTotalsParams.none(), requestOptions)

    /**
     * A view of [BudgetServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BudgetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /marketing/campaigns/2026-03/{campaignGuid}/budget`, but is otherwise the same as
         * [BudgetServiceAsync.create].
         */
        fun create(
            campaignGuid: String,
            params: BudgetCreateParams,
        ): CompletableFuture<HttpResponseFor<PublicBudgetItem>> =
            create(campaignGuid, params, RequestOptions.none())

        /** @see create */
        fun create(
            campaignGuid: String,
            params: BudgetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicBudgetItem>> =
            create(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

        /** @see create */
        fun create(
            params: BudgetCreateParams
        ): CompletableFuture<HttpResponseFor<PublicBudgetItem>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BudgetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicBudgetItem>>

        /**
         * Returns a raw HTTP response for `put
         * /marketing/campaigns/2026-03/{campaignGuid}/budget/{budgetId}`, but is otherwise the same
         * as [BudgetServiceAsync.update].
         */
        fun update(
            budgetId: Long,
            params: BudgetUpdateParams,
        ): CompletableFuture<HttpResponseFor<PublicBudgetItem>> =
            update(budgetId, params, RequestOptions.none())

        /** @see update */
        fun update(
            budgetId: Long,
            params: BudgetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicBudgetItem>> =
            update(params.toBuilder().budgetId(budgetId).build(), requestOptions)

        /** @see update */
        fun update(
            params: BudgetUpdateParams
        ): CompletableFuture<HttpResponseFor<PublicBudgetItem>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BudgetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicBudgetItem>>

        /**
         * Returns a raw HTTP response for `delete
         * /marketing/campaigns/2026-03/{campaignGuid}/budget/{budgetId}`, but is otherwise the same
         * as [BudgetServiceAsync.delete].
         */
        fun delete(budgetId: Long, params: BudgetDeleteParams): CompletableFuture<HttpResponse> =
            delete(budgetId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            budgetId: Long,
            params: BudgetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().budgetId(budgetId).build(), requestOptions)

        /** @see delete */
        fun delete(params: BudgetDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BudgetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /marketing/campaigns/2026-03/{campaignGuid}/budget/{budgetId}`, but is otherwise the same
         * as [BudgetServiceAsync.get].
         */
        fun get(
            budgetId: Long,
            params: BudgetGetParams,
        ): CompletableFuture<HttpResponseFor<PublicBudgetItem>> =
            get(budgetId, params, RequestOptions.none())

        /** @see get */
        fun get(
            budgetId: Long,
            params: BudgetGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicBudgetItem>> =
            get(params.toBuilder().budgetId(budgetId).build(), requestOptions)

        /** @see get */
        fun get(params: BudgetGetParams): CompletableFuture<HttpResponseFor<PublicBudgetItem>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: BudgetGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicBudgetItem>>

        /**
         * Returns a raw HTTP response for `get
         * /marketing/campaigns/2026-03/{campaignGuid}/budget/totals`, but is otherwise the same as
         * [BudgetServiceAsync.getTotals].
         */
        fun getTotals(
            campaignGuid: String
        ): CompletableFuture<HttpResponseFor<PublicBudgetTotals>> =
            getTotals(campaignGuid, BudgetGetTotalsParams.none())

        /** @see getTotals */
        fun getTotals(
            campaignGuid: String,
            params: BudgetGetTotalsParams = BudgetGetTotalsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicBudgetTotals>> =
            getTotals(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

        /** @see getTotals */
        fun getTotals(
            campaignGuid: String,
            params: BudgetGetTotalsParams = BudgetGetTotalsParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicBudgetTotals>> =
            getTotals(campaignGuid, params, RequestOptions.none())

        /** @see getTotals */
        fun getTotals(
            params: BudgetGetTotalsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicBudgetTotals>>

        /** @see getTotals */
        fun getTotals(
            params: BudgetGetTotalsParams
        ): CompletableFuture<HttpResponseFor<PublicBudgetTotals>> =
            getTotals(params, RequestOptions.none())

        /** @see getTotals */
        fun getTotals(
            campaignGuid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicBudgetTotals>> =
            getTotals(campaignGuid, BudgetGetTotalsParams.none(), requestOptions)
    }
}
