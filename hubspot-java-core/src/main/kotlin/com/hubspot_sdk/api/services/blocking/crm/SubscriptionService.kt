// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.models.crm.subscriptions.SubscriptionCancelParams
import com.hubspot_sdk.api.models.crm.subscriptions.SubscriptionPauseParams
import com.hubspot_sdk.api.models.crm.subscriptions.SubscriptionUnpauseParams
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

    /** Cancel an active commerce subscription using the subscription ID. */
    @MustBeClosed
    fun cancel(objectId: Long): HttpResponse = cancel(objectId, SubscriptionCancelParams.none())

    /** @see cancel */
    @MustBeClosed
    fun cancel(
        objectId: Long,
        params: SubscriptionCancelParams = SubscriptionCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = cancel(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see cancel */
    @MustBeClosed
    fun cancel(
        objectId: Long,
        params: SubscriptionCancelParams = SubscriptionCancelParams.none(),
    ): HttpResponse = cancel(objectId, params, RequestOptions.none())

    /** @see cancel */
    @MustBeClosed
    fun cancel(
        params: SubscriptionCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see cancel */
    @MustBeClosed
    fun cancel(params: SubscriptionCancelParams): HttpResponse =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    @MustBeClosed
    fun cancel(objectId: Long, requestOptions: RequestOptions): HttpResponse =
        cancel(objectId, SubscriptionCancelParams.none(), requestOptions)

    /** Pause an active subscription using the subscription ID. */
    @MustBeClosed
    fun pause(objectId: Long, params: SubscriptionPauseParams): HttpResponse =
        pause(objectId, params, RequestOptions.none())

    /** @see pause */
    @MustBeClosed
    fun pause(
        objectId: Long,
        params: SubscriptionPauseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = pause(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see pause */
    @MustBeClosed
    fun pause(params: SubscriptionPauseParams): HttpResponse = pause(params, RequestOptions.none())

    /** @see pause */
    @MustBeClosed
    fun pause(
        params: SubscriptionPauseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** Resume a previously paused subscription using the subscription ID. */
    @MustBeClosed
    fun unpause(objectId: Long, params: SubscriptionUnpauseParams): HttpResponse =
        unpause(objectId, params, RequestOptions.none())

    /** @see unpause */
    @MustBeClosed
    fun unpause(
        objectId: Long,
        params: SubscriptionUnpauseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = unpause(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see unpause */
    @MustBeClosed
    fun unpause(params: SubscriptionUnpauseParams): HttpResponse =
        unpause(params, RequestOptions.none())

    /** @see unpause */
    @MustBeClosed
    fun unpause(
        params: SubscriptionUnpauseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

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
         * Returns a raw HTTP response for `post
         * /payments-subscriptions/v1/subscriptions/crm/{objectId}/cancel`, but is otherwise the
         * same as [SubscriptionService.cancel].
         */
        @MustBeClosed
        fun cancel(objectId: Long): HttpResponse = cancel(objectId, SubscriptionCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            objectId: Long,
            params: SubscriptionCancelParams = SubscriptionCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = cancel(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            objectId: Long,
            params: SubscriptionCancelParams = SubscriptionCancelParams.none(),
        ): HttpResponse = cancel(objectId, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: SubscriptionCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: SubscriptionCancelParams): HttpResponse =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(objectId: Long, requestOptions: RequestOptions): HttpResponse =
            cancel(objectId, SubscriptionCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /payments-subscriptions/v1/subscriptions/crm/{objectId}/pause`, but is otherwise the same
         * as [SubscriptionService.pause].
         */
        @MustBeClosed
        fun pause(objectId: Long, params: SubscriptionPauseParams): HttpResponse =
            pause(objectId, params, RequestOptions.none())

        /** @see pause */
        @MustBeClosed
        fun pause(
            objectId: Long,
            params: SubscriptionPauseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = pause(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see pause */
        @MustBeClosed
        fun pause(params: SubscriptionPauseParams): HttpResponse =
            pause(params, RequestOptions.none())

        /** @see pause */
        @MustBeClosed
        fun pause(
            params: SubscriptionPauseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /payments-subscriptions/v1/subscriptions/crm/{objectId}/unpause`, but is otherwise the
         * same as [SubscriptionService.unpause].
         */
        @MustBeClosed
        fun unpause(objectId: Long, params: SubscriptionUnpauseParams): HttpResponse =
            unpause(objectId, params, RequestOptions.none())

        /** @see unpause */
        @MustBeClosed
        fun unpause(
            objectId: Long,
            params: SubscriptionUnpauseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = unpause(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see unpause */
        @MustBeClosed
        fun unpause(params: SubscriptionUnpauseParams): HttpResponse =
            unpause(params, RequestOptions.none())

        /** @see unpause */
        @MustBeClosed
        fun unpause(
            params: SubscriptionUnpauseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
