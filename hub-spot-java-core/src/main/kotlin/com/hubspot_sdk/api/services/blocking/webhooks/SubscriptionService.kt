// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.webhooks

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.webhooks.BatchResponseSubscriptionResponse
import com.hubspot_sdk.api.models.webhooks.SubscriptionListResponse
import com.hubspot_sdk.api.models.webhooks.SubscriptionResponse
import com.hubspot_sdk.api.models.webhooks.subscriptions.SubscriptionCreateParams
import com.hubspot_sdk.api.models.webhooks.subscriptions.SubscriptionDeleteParams
import com.hubspot_sdk.api.models.webhooks.subscriptions.SubscriptionGetParams
import com.hubspot_sdk.api.models.webhooks.subscriptions.SubscriptionListParams
import com.hubspot_sdk.api.models.webhooks.subscriptions.SubscriptionUpdateBatchParams
import com.hubspot_sdk.api.models.webhooks.subscriptions.SubscriptionUpdateParams
import java.util.function.Consumer

interface SubscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionService

    /** Create new event subscription for the specified app. */
    fun create(appId: Int, params: SubscriptionCreateParams): SubscriptionResponse =
        create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse = create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(params: SubscriptionCreateParams): SubscriptionResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse

    /** Update an existing event subscription by ID. */
    fun update(subscriptionId: Int, params: SubscriptionUpdateParams): SubscriptionResponse =
        update(subscriptionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        subscriptionId: Int,
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse =
        update(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see update */
    fun update(params: SubscriptionUpdateParams): SubscriptionResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse

    /** Retrieve event subscriptions for the specified app. */
    fun list(appId: Int): SubscriptionListResponse = list(appId, SubscriptionListParams.none())

    /** @see list */
    fun list(
        appId: Int,
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListResponse = list(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see list */
    fun list(
        appId: Int,
        params: SubscriptionListParams = SubscriptionListParams.none(),
    ): SubscriptionListResponse = list(appId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListResponse

    /** @see list */
    fun list(params: SubscriptionListParams): SubscriptionListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(appId: Int, requestOptions: RequestOptions): SubscriptionListResponse =
        list(appId, SubscriptionListParams.none(), requestOptions)

    /** Delete an existing event subscription by ID. */
    fun delete(subscriptionId: Int, params: SubscriptionDeleteParams) =
        delete(subscriptionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        subscriptionId: Int,
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see delete */
    fun delete(params: SubscriptionDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Retrieve a specific event subscription by ID. */
    fun get(subscriptionId: Int, params: SubscriptionGetParams): SubscriptionResponse =
        get(subscriptionId, params, RequestOptions.none())

    /** @see get */
    fun get(
        subscriptionId: Int,
        params: SubscriptionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse =
        get(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see get */
    fun get(params: SubscriptionGetParams): SubscriptionResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SubscriptionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse

    /** Batch create event subscriptions for the specified app. */
    fun updateBatch(
        appId: Int,
        params: SubscriptionUpdateBatchParams,
    ): BatchResponseSubscriptionResponse = updateBatch(appId, params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        appId: Int,
        params: SubscriptionUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSubscriptionResponse =
        updateBatch(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateBatch */
    fun updateBatch(params: SubscriptionUpdateBatchParams): BatchResponseSubscriptionResponse =
        updateBatch(params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        params: SubscriptionUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSubscriptionResponse

    /**
     * A view of [SubscriptionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriptionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks/v3/{appId}/subscriptions`, but is
         * otherwise the same as [SubscriptionService.create].
         */
        @MustBeClosed
        fun create(
            appId: Int,
            params: SubscriptionCreateParams,
        ): HttpResponseFor<SubscriptionResponse> = create(appId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            appId: Int,
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: SubscriptionCreateParams): HttpResponseFor<SubscriptionResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /webhooks/v3/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [SubscriptionService.update].
         */
        @MustBeClosed
        fun update(
            subscriptionId: Int,
            params: SubscriptionUpdateParams,
        ): HttpResponseFor<SubscriptionResponse> =
            update(subscriptionId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            subscriptionId: Int,
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse> =
            update(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SubscriptionUpdateParams): HttpResponseFor<SubscriptionResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse>

        /**
         * Returns a raw HTTP response for `get /webhooks/v3/{appId}/subscriptions`, but is
         * otherwise the same as [SubscriptionService.list].
         */
        @MustBeClosed
        fun list(appId: Int): HttpResponseFor<SubscriptionListResponse> =
            list(appId, SubscriptionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            appId: Int,
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListResponse> =
            list(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            appId: Int,
            params: SubscriptionListParams = SubscriptionListParams.none(),
        ): HttpResponseFor<SubscriptionListResponse> = list(appId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SubscriptionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: SubscriptionListParams): HttpResponseFor<SubscriptionListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionListResponse> =
            list(appId, SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks/v3/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [SubscriptionService.delete].
         */
        @MustBeClosed
        fun delete(subscriptionId: Int, params: SubscriptionDeleteParams): HttpResponse =
            delete(subscriptionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            subscriptionId: Int,
            params: SubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: SubscriptionDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /webhooks/v3/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [SubscriptionService.get].
         */
        @MustBeClosed
        fun get(
            subscriptionId: Int,
            params: SubscriptionGetParams,
        ): HttpResponseFor<SubscriptionResponse> =
            get(subscriptionId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            subscriptionId: Int,
            params: SubscriptionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse> =
            get(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: SubscriptionGetParams): HttpResponseFor<SubscriptionResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SubscriptionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse>

        /**
         * Returns a raw HTTP response for `post /webhooks/v3/{appId}/subscriptions/batch/update`,
         * but is otherwise the same as [SubscriptionService.updateBatch].
         */
        @MustBeClosed
        fun updateBatch(
            appId: Int,
            params: SubscriptionUpdateBatchParams,
        ): HttpResponseFor<BatchResponseSubscriptionResponse> =
            updateBatch(appId, params, RequestOptions.none())

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            appId: Int,
            params: SubscriptionUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSubscriptionResponse> =
            updateBatch(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            params: SubscriptionUpdateBatchParams
        ): HttpResponseFor<BatchResponseSubscriptionResponse> =
            updateBatch(params, RequestOptions.none())

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            params: SubscriptionUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSubscriptionResponse>
    }
}
