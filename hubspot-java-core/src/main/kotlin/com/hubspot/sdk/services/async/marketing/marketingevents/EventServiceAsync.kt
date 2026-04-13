// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.marketing.marketingevents

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.marketing.marketingevents.MarketingEventDefaultResponse
import com.hubspot.sdk.models.marketing.marketingevents.events.EventCancelByExternalEventIdParams
import com.hubspot.sdk.models.marketing.marketingevents.events.EventCompleteByExternalEventIdParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventServiceAsync

    /** Mark a marketing event as cancelled. */
    fun cancelByExternalEventId(
        externalEventId: String,
        params: EventCancelByExternalEventIdParams,
    ): CompletableFuture<MarketingEventDefaultResponse> =
        cancelByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see cancelByExternalEventId */
    fun cancelByExternalEventId(
        externalEventId: String,
        params: EventCancelByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventDefaultResponse> =
        cancelByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see cancelByExternalEventId */
    fun cancelByExternalEventId(
        params: EventCancelByExternalEventIdParams
    ): CompletableFuture<MarketingEventDefaultResponse> =
        cancelByExternalEventId(params, RequestOptions.none())

    /** @see cancelByExternalEventId */
    fun cancelByExternalEventId(
        params: EventCancelByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventDefaultResponse>

    /** Mark a marketing event as completed */
    fun completeByExternalEventId(
        externalEventId: String,
        params: EventCompleteByExternalEventIdParams,
    ): CompletableFuture<MarketingEventDefaultResponse> =
        completeByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see completeByExternalEventId */
    fun completeByExternalEventId(
        externalEventId: String,
        params: EventCompleteByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventDefaultResponse> =
        completeByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see completeByExternalEventId */
    fun completeByExternalEventId(
        params: EventCompleteByExternalEventIdParams
    ): CompletableFuture<MarketingEventDefaultResponse> =
        completeByExternalEventId(params, RequestOptions.none())

    /** @see completeByExternalEventId */
    fun completeByExternalEventId(
        params: EventCompleteByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventDefaultResponse>

    /** A view of [EventServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /marketing/marketing-events/2026-03/events/{externalEventId}/cancel`, but is otherwise
         * the same as [EventServiceAsync.cancelByExternalEventId].
         */
        fun cancelByExternalEventId(
            externalEventId: String,
            params: EventCancelByExternalEventIdParams,
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>> =
            cancelByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see cancelByExternalEventId */
        fun cancelByExternalEventId(
            externalEventId: String,
            params: EventCancelByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>> =
            cancelByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see cancelByExternalEventId */
        fun cancelByExternalEventId(
            params: EventCancelByExternalEventIdParams
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>> =
            cancelByExternalEventId(params, RequestOptions.none())

        /** @see cancelByExternalEventId */
        fun cancelByExternalEventId(
            params: EventCancelByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /marketing/marketing-events/2026-03/events/{externalEventId}/complete`, but is otherwise
         * the same as [EventServiceAsync.completeByExternalEventId].
         */
        fun completeByExternalEventId(
            externalEventId: String,
            params: EventCompleteByExternalEventIdParams,
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>> =
            completeByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see completeByExternalEventId */
        fun completeByExternalEventId(
            externalEventId: String,
            params: EventCompleteByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>> =
            completeByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see completeByExternalEventId */
        fun completeByExternalEventId(
            params: EventCompleteByExternalEventIdParams
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>> =
            completeByExternalEventId(params, RequestOptions.none())

        /** @see completeByExternalEventId */
        fun completeByExternalEventId(
            params: EventCompleteByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>>
    }
}
