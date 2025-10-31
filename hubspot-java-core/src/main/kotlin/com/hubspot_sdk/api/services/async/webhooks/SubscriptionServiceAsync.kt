// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.webhooks

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionServiceAsync

    /** Create new event subscription for the specified app. */
    fun create(
        appId: Int,
        params: SubscriptionCreateParams,
    ): CompletableFuture<SubscriptionResponse> = create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(params: SubscriptionCreateParams): CompletableFuture<SubscriptionResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse>

    /** Update an existing event subscription by ID. */
    fun update(
        subscriptionId: Int,
        params: SubscriptionUpdateParams,
    ): CompletableFuture<SubscriptionResponse> =
        update(subscriptionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        subscriptionId: Int,
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        update(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see update */
    fun update(params: SubscriptionUpdateParams): CompletableFuture<SubscriptionResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse>

    /** Retrieve event subscriptions for the specified app. */
    fun list(appId: Int): CompletableFuture<SubscriptionListResponse> =
        list(appId, SubscriptionListParams.none())

    /** @see list */
    fun list(
        appId: Int,
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionListResponse> =
        list(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see list */
    fun list(
        appId: Int,
        params: SubscriptionListParams = SubscriptionListParams.none(),
    ): CompletableFuture<SubscriptionListResponse> = list(appId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionListResponse>

    /** @see list */
    fun list(params: SubscriptionListParams): CompletableFuture<SubscriptionListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionListResponse> =
        list(appId, SubscriptionListParams.none(), requestOptions)

    /** Delete an existing event subscription by ID. */
    fun delete(subscriptionId: Int, params: SubscriptionDeleteParams): CompletableFuture<Void?> =
        delete(subscriptionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        subscriptionId: Int,
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see delete */
    fun delete(params: SubscriptionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Retrieve a specific event subscription by ID. */
    fun get(
        subscriptionId: Int,
        params: SubscriptionGetParams,
    ): CompletableFuture<SubscriptionResponse> = get(subscriptionId, params, RequestOptions.none())

    /** @see get */
    fun get(
        subscriptionId: Int,
        params: SubscriptionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        get(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see get */
    fun get(params: SubscriptionGetParams): CompletableFuture<SubscriptionResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SubscriptionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse>

    /** Batch create event subscriptions for the specified app. */
    fun updateBatch(
        appId: Int,
        params: SubscriptionUpdateBatchParams,
    ): CompletableFuture<BatchResponseSubscriptionResponse> =
        updateBatch(appId, params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        appId: Int,
        params: SubscriptionUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSubscriptionResponse> =
        updateBatch(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateBatch */
    fun updateBatch(
        params: SubscriptionUpdateBatchParams
    ): CompletableFuture<BatchResponseSubscriptionResponse> =
        updateBatch(params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        params: SubscriptionUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSubscriptionResponse>

    /**
     * A view of [SubscriptionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks/v3/{appId}/subscriptions`, but is
         * otherwise the same as [SubscriptionServiceAsync.create].
         */
        fun create(
            appId: Int,
            params: SubscriptionCreateParams,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            create(appId, params, RequestOptions.none())

        /** @see create */
        fun create(
            appId: Int,
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        fun create(
            params: SubscriptionCreateParams
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /webhooks/v3/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [SubscriptionServiceAsync.update].
         */
        fun update(
            subscriptionId: Int,
            params: SubscriptionUpdateParams,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            update(subscriptionId, params, RequestOptions.none())

        /** @see update */
        fun update(
            subscriptionId: Int,
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            update(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see update */
        fun update(
            params: SubscriptionUpdateParams
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>>

        /**
         * Returns a raw HTTP response for `get /webhooks/v3/{appId}/subscriptions`, but is
         * otherwise the same as [SubscriptionServiceAsync.list].
         */
        fun list(appId: Int): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            list(appId, SubscriptionListParams.none())

        /** @see list */
        fun list(
            appId: Int,
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            list(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see list */
        fun list(
            appId: Int,
            params: SubscriptionListParams = SubscriptionListParams.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            list(appId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SubscriptionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>>

        /** @see list */
        fun list(
            params: SubscriptionListParams
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            list(appId, SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks/v3/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [SubscriptionServiceAsync.delete].
         */
        fun delete(
            subscriptionId: Int,
            params: SubscriptionDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(subscriptionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            subscriptionId: Int,
            params: SubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see delete */
        fun delete(params: SubscriptionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /webhooks/v3/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [SubscriptionServiceAsync.get].
         */
        fun get(
            subscriptionId: Int,
            params: SubscriptionGetParams,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            get(subscriptionId, params, RequestOptions.none())

        /** @see get */
        fun get(
            subscriptionId: Int,
            params: SubscriptionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            get(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see get */
        fun get(
            params: SubscriptionGetParams
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SubscriptionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>>

        /**
         * Returns a raw HTTP response for `post /webhooks/v3/{appId}/subscriptions/batch/update`,
         * but is otherwise the same as [SubscriptionServiceAsync.updateBatch].
         */
        fun updateBatch(
            appId: Int,
            params: SubscriptionUpdateBatchParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>> =
            updateBatch(appId, params, RequestOptions.none())

        /** @see updateBatch */
        fun updateBatch(
            appId: Int,
            params: SubscriptionUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>> =
            updateBatch(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateBatch */
        fun updateBatch(
            params: SubscriptionUpdateBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>> =
            updateBatch(params, RequestOptions.none())

        /** @see updateBatch */
        fun updateBatch(
            params: SubscriptionUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>>
    }
}
