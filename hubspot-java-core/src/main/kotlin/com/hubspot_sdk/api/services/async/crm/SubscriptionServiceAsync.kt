// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.models.crm.subscriptions.SubscriptionCancelParams
import com.hubspot_sdk.api.models.crm.subscriptions.SubscriptionPauseParams
import com.hubspot_sdk.api.models.crm.subscriptions.SubscriptionUnpauseParams
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

    /** Cancel an active commerce subscription using the subscription ID. */
    fun cancel(objectId: Long): CompletableFuture<HttpResponse> =
        cancel(objectId, SubscriptionCancelParams.none())

    /** @see cancel */
    fun cancel(
        objectId: Long,
        params: SubscriptionCancelParams = SubscriptionCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        cancel(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        objectId: Long,
        params: SubscriptionCancelParams = SubscriptionCancelParams.none(),
    ): CompletableFuture<HttpResponse> = cancel(objectId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: SubscriptionCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see cancel */
    fun cancel(params: SubscriptionCancelParams): CompletableFuture<HttpResponse> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(objectId: Long, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        cancel(objectId, SubscriptionCancelParams.none(), requestOptions)

    /** Pause an active subscription using the subscription ID. */
    fun pause(objectId: Long, params: SubscriptionPauseParams): CompletableFuture<HttpResponse> =
        pause(objectId, params, RequestOptions.none())

    /** @see pause */
    fun pause(
        objectId: Long,
        params: SubscriptionPauseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        pause(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see pause */
    fun pause(params: SubscriptionPauseParams): CompletableFuture<HttpResponse> =
        pause(params, RequestOptions.none())

    /** @see pause */
    fun pause(
        params: SubscriptionPauseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** Resume a previously paused subscription using the subscription ID. */
    fun unpause(
        objectId: Long,
        params: SubscriptionUnpauseParams,
    ): CompletableFuture<HttpResponse> = unpause(objectId, params, RequestOptions.none())

    /** @see unpause */
    fun unpause(
        objectId: Long,
        params: SubscriptionUnpauseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        unpause(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see unpause */
    fun unpause(params: SubscriptionUnpauseParams): CompletableFuture<HttpResponse> =
        unpause(params, RequestOptions.none())

    /** @see unpause */
    fun unpause(
        params: SubscriptionUnpauseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

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
         * Returns a raw HTTP response for `post
         * /payments-subscriptions/v1/subscriptions/crm/{objectId}/cancel`, but is otherwise the
         * same as [SubscriptionServiceAsync.cancel].
         */
        fun cancel(objectId: Long): CompletableFuture<HttpResponse> =
            cancel(objectId, SubscriptionCancelParams.none())

        /** @see cancel */
        fun cancel(
            objectId: Long,
            params: SubscriptionCancelParams = SubscriptionCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            cancel(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            objectId: Long,
            params: SubscriptionCancelParams = SubscriptionCancelParams.none(),
        ): CompletableFuture<HttpResponse> = cancel(objectId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: SubscriptionCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see cancel */
        fun cancel(params: SubscriptionCancelParams): CompletableFuture<HttpResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            objectId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            cancel(objectId, SubscriptionCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /payments-subscriptions/v1/subscriptions/crm/{objectId}/pause`, but is otherwise the same
         * as [SubscriptionServiceAsync.pause].
         */
        fun pause(
            objectId: Long,
            params: SubscriptionPauseParams,
        ): CompletableFuture<HttpResponse> = pause(objectId, params, RequestOptions.none())

        /** @see pause */
        fun pause(
            objectId: Long,
            params: SubscriptionPauseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            pause(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see pause */
        fun pause(params: SubscriptionPauseParams): CompletableFuture<HttpResponse> =
            pause(params, RequestOptions.none())

        /** @see pause */
        fun pause(
            params: SubscriptionPauseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /payments-subscriptions/v1/subscriptions/crm/{objectId}/unpause`, but is otherwise the
         * same as [SubscriptionServiceAsync.unpause].
         */
        fun unpause(
            objectId: Long,
            params: SubscriptionUnpauseParams,
        ): CompletableFuture<HttpResponse> = unpause(objectId, params, RequestOptions.none())

        /** @see unpause */
        fun unpause(
            objectId: Long,
            params: SubscriptionUnpauseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            unpause(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see unpause */
        fun unpause(params: SubscriptionUnpauseParams): CompletableFuture<HttpResponse> =
            unpause(params, RequestOptions.none())

        /** @see unpause */
        fun unpause(
            params: SubscriptionUnpauseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
