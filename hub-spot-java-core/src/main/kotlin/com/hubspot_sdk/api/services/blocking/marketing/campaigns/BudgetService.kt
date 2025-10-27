// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.campaigns

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.campaigns.PublicBudgetItem
import com.hubspot_sdk.api.models.marketing.campaigns.PublicBudgetTotals
import com.hubspot_sdk.api.models.marketing.campaigns.budget.BudgetCreateParams
import com.hubspot_sdk.api.models.marketing.campaigns.budget.BudgetDeleteParams
import com.hubspot_sdk.api.models.marketing.campaigns.budget.BudgetGetParams
import com.hubspot_sdk.api.models.marketing.campaigns.budget.BudgetGetTotalsParams
import com.hubspot_sdk.api.models.marketing.campaigns.budget.BudgetUpdateParams
import java.util.function.Consumer

interface BudgetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BudgetService

    /** Add a new budget item to the campaign */
    fun create(campaignGuid: String, params: BudgetCreateParams): PublicBudgetItem =
        create(campaignGuid, params, RequestOptions.none())

    /** @see create */
    fun create(
        campaignGuid: String,
        params: BudgetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicBudgetItem =
        create(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

    /** @see create */
    fun create(params: BudgetCreateParams): PublicBudgetItem = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BudgetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicBudgetItem

    /** Update a specific budget item by ID */
    fun update(budgetId: Long, params: BudgetUpdateParams): PublicBudgetItem =
        update(budgetId, params, RequestOptions.none())

    /** @see update */
    fun update(
        budgetId: Long,
        params: BudgetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicBudgetItem = update(params.toBuilder().budgetId(budgetId).build(), requestOptions)

    /** @see update */
    fun update(params: BudgetUpdateParams): PublicBudgetItem = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BudgetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicBudgetItem

    /** Delete a specific budget item by ID */
    fun delete(budgetId: Long, params: BudgetDeleteParams) =
        delete(budgetId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        budgetId: Long,
        params: BudgetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().budgetId(budgetId).build(), requestOptions)

    /** @see delete */
    fun delete(params: BudgetDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: BudgetDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get a specific budget item by ID */
    fun get(budgetId: Long, params: BudgetGetParams): PublicBudgetItem =
        get(budgetId, params, RequestOptions.none())

    /** @see get */
    fun get(
        budgetId: Long,
        params: BudgetGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicBudgetItem = get(params.toBuilder().budgetId(budgetId).build(), requestOptions)

    /** @see get */
    fun get(params: BudgetGetParams): PublicBudgetItem = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BudgetGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicBudgetItem

    /**
     * Retrieve detailed information about the budget and spend items for a specified campaign,
     * including the total budget, total spend, and remaining budget. Budget and Spend items may be
     * returned in any order, but the order field specifies their sequence based on the creation
     * date. The item with order 0 is the oldest, and items with higher order values are newer
     */
    fun getTotals(campaignGuid: String): PublicBudgetTotals =
        getTotals(campaignGuid, BudgetGetTotalsParams.none())

    /** @see getTotals */
    fun getTotals(
        campaignGuid: String,
        params: BudgetGetTotalsParams = BudgetGetTotalsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicBudgetTotals =
        getTotals(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

    /** @see getTotals */
    fun getTotals(
        campaignGuid: String,
        params: BudgetGetTotalsParams = BudgetGetTotalsParams.none(),
    ): PublicBudgetTotals = getTotals(campaignGuid, params, RequestOptions.none())

    /** @see getTotals */
    fun getTotals(
        params: BudgetGetTotalsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicBudgetTotals

    /** @see getTotals */
    fun getTotals(params: BudgetGetTotalsParams): PublicBudgetTotals =
        getTotals(params, RequestOptions.none())

    /** @see getTotals */
    fun getTotals(campaignGuid: String, requestOptions: RequestOptions): PublicBudgetTotals =
        getTotals(campaignGuid, BudgetGetTotalsParams.none(), requestOptions)

    /** A view of [BudgetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BudgetService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /marketing/v3/campaigns/{campaignGuid}/budget`, but
         * is otherwise the same as [BudgetService.create].
         */
        @MustBeClosed
        fun create(
            campaignGuid: String,
            params: BudgetCreateParams,
        ): HttpResponseFor<PublicBudgetItem> = create(campaignGuid, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            campaignGuid: String,
            params: BudgetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicBudgetItem> =
            create(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: BudgetCreateParams): HttpResponseFor<PublicBudgetItem> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BudgetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicBudgetItem>

        /**
         * Returns a raw HTTP response for `put
         * /marketing/v3/campaigns/{campaignGuid}/budget/{budgetId}`, but is otherwise the same as
         * [BudgetService.update].
         */
        @MustBeClosed
        fun update(budgetId: Long, params: BudgetUpdateParams): HttpResponseFor<PublicBudgetItem> =
            update(budgetId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            budgetId: Long,
            params: BudgetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicBudgetItem> =
            update(params.toBuilder().budgetId(budgetId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: BudgetUpdateParams): HttpResponseFor<PublicBudgetItem> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BudgetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicBudgetItem>

        /**
         * Returns a raw HTTP response for `delete
         * /marketing/v3/campaigns/{campaignGuid}/budget/{budgetId}`, but is otherwise the same as
         * [BudgetService.delete].
         */
        @MustBeClosed
        fun delete(budgetId: Long, params: BudgetDeleteParams): HttpResponse =
            delete(budgetId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            budgetId: Long,
            params: BudgetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().budgetId(budgetId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: BudgetDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BudgetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/campaigns/{campaignGuid}/budget/{budgetId}`, but is otherwise the same as
         * [BudgetService.get].
         */
        @MustBeClosed
        fun get(budgetId: Long, params: BudgetGetParams): HttpResponseFor<PublicBudgetItem> =
            get(budgetId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            budgetId: Long,
            params: BudgetGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicBudgetItem> =
            get(params.toBuilder().budgetId(budgetId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: BudgetGetParams): HttpResponseFor<PublicBudgetItem> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: BudgetGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicBudgetItem>

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/campaigns/{campaignGuid}/budget/totals`, but is otherwise the same as
         * [BudgetService.getTotals].
         */
        @MustBeClosed
        fun getTotals(campaignGuid: String): HttpResponseFor<PublicBudgetTotals> =
            getTotals(campaignGuid, BudgetGetTotalsParams.none())

        /** @see getTotals */
        @MustBeClosed
        fun getTotals(
            campaignGuid: String,
            params: BudgetGetTotalsParams = BudgetGetTotalsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicBudgetTotals> =
            getTotals(params.toBuilder().campaignGuid(campaignGuid).build(), requestOptions)

        /** @see getTotals */
        @MustBeClosed
        fun getTotals(
            campaignGuid: String,
            params: BudgetGetTotalsParams = BudgetGetTotalsParams.none(),
        ): HttpResponseFor<PublicBudgetTotals> =
            getTotals(campaignGuid, params, RequestOptions.none())

        /** @see getTotals */
        @MustBeClosed
        fun getTotals(
            params: BudgetGetTotalsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicBudgetTotals>

        /** @see getTotals */
        @MustBeClosed
        fun getTotals(params: BudgetGetTotalsParams): HttpResponseFor<PublicBudgetTotals> =
            getTotals(params, RequestOptions.none())

        /** @see getTotals */
        @MustBeClosed
        fun getTotals(
            campaignGuid: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicBudgetTotals> =
            getTotals(campaignGuid, BudgetGetTotalsParams.none(), requestOptions)
    }
}
