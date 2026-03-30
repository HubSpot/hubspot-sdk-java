// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.events

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.events.MarketingEventDefaultResponse
import com.hubspot_sdk.api.models.marketing.events.events.EventCancelByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.events.EventCompleteByExternalEventIdParams
import java.util.function.Consumer

interface EventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService

    /** Mark a marketing event as cancelled. */
    fun cancelByExternalEventId(
        externalEventId: String,
        params: EventCancelByExternalEventIdParams,
    ): MarketingEventDefaultResponse =
        cancelByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see cancelByExternalEventId */
    fun cancelByExternalEventId(
        externalEventId: String,
        params: EventCancelByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventDefaultResponse =
        cancelByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see cancelByExternalEventId */
    fun cancelByExternalEventId(
        params: EventCancelByExternalEventIdParams
    ): MarketingEventDefaultResponse = cancelByExternalEventId(params, RequestOptions.none())

    /** @see cancelByExternalEventId */
    fun cancelByExternalEventId(
        params: EventCancelByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventDefaultResponse

    /** Mark a marketing event as completed */
    fun completeByExternalEventId(
        externalEventId: String,
        params: EventCompleteByExternalEventIdParams,
    ): MarketingEventDefaultResponse =
        completeByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see completeByExternalEventId */
    fun completeByExternalEventId(
        externalEventId: String,
        params: EventCompleteByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventDefaultResponse =
        completeByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see completeByExternalEventId */
    fun completeByExternalEventId(
        params: EventCompleteByExternalEventIdParams
    ): MarketingEventDefaultResponse = completeByExternalEventId(params, RequestOptions.none())

    /** @see completeByExternalEventId */
    fun completeByExternalEventId(
        params: EventCompleteByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventDefaultResponse

    /** A view of [EventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /marketing/marketing-events/2026-03/events/{externalEventId}/cancel`, but is otherwise
         * the same as [EventService.cancelByExternalEventId].
         */
        @MustBeClosed
        fun cancelByExternalEventId(
            externalEventId: String,
            params: EventCancelByExternalEventIdParams,
        ): HttpResponseFor<MarketingEventDefaultResponse> =
            cancelByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see cancelByExternalEventId */
        @MustBeClosed
        fun cancelByExternalEventId(
            externalEventId: String,
            params: EventCancelByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventDefaultResponse> =
            cancelByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see cancelByExternalEventId */
        @MustBeClosed
        fun cancelByExternalEventId(
            params: EventCancelByExternalEventIdParams
        ): HttpResponseFor<MarketingEventDefaultResponse> =
            cancelByExternalEventId(params, RequestOptions.none())

        /** @see cancelByExternalEventId */
        @MustBeClosed
        fun cancelByExternalEventId(
            params: EventCancelByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventDefaultResponse>

        /**
         * Returns a raw HTTP response for `post
         * /marketing/marketing-events/2026-03/events/{externalEventId}/complete`, but is otherwise
         * the same as [EventService.completeByExternalEventId].
         */
        @MustBeClosed
        fun completeByExternalEventId(
            externalEventId: String,
            params: EventCompleteByExternalEventIdParams,
        ): HttpResponseFor<MarketingEventDefaultResponse> =
            completeByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see completeByExternalEventId */
        @MustBeClosed
        fun completeByExternalEventId(
            externalEventId: String,
            params: EventCompleteByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventDefaultResponse> =
            completeByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see completeByExternalEventId */
        @MustBeClosed
        fun completeByExternalEventId(
            params: EventCompleteByExternalEventIdParams
        ): HttpResponseFor<MarketingEventDefaultResponse> =
            completeByExternalEventId(params, RequestOptions.none())

        /** @see completeByExternalEventId */
        @MustBeClosed
        fun completeByExternalEventId(
            params: EventCompleteByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventDefaultResponse>
    }
}
