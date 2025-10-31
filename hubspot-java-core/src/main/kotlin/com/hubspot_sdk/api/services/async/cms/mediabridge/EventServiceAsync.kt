// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.mediabridge

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateAttentionSpanEventParams
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateAttentionSpanEventResponse
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateMediaPlayedEventParams
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateMediaPlayedEventResponse
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateMediaPlayedPercentEventParams
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateMediaPlayedPercentEventResponse
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

    /** Create an event containing the viewers attention span details for the media. */
    fun createAttentionSpanEvent(
        params: EventCreateAttentionSpanEventParams
    ): CompletableFuture<EventCreateAttentionSpanEventResponse> =
        createAttentionSpanEvent(params, RequestOptions.none())

    /** @see createAttentionSpanEvent */
    fun createAttentionSpanEvent(
        params: EventCreateAttentionSpanEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventCreateAttentionSpanEventResponse>

    /** Create an event for when a user begins playing a piece of media. */
    fun createMediaPlayedEvent(
        params: EventCreateMediaPlayedEventParams
    ): CompletableFuture<EventCreateMediaPlayedEventResponse> =
        createMediaPlayedEvent(params, RequestOptions.none())

    /** @see createMediaPlayedEvent */
    fun createMediaPlayedEvent(
        params: EventCreateMediaPlayedEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventCreateMediaPlayedEventResponse>

    /**
     * Create an event representing a user reaching quarterly milestones in a piece of media they're
     * viewing.
     */
    fun createMediaPlayedPercentEvent(
        params: EventCreateMediaPlayedPercentEventParams
    ): CompletableFuture<EventCreateMediaPlayedPercentEventResponse> =
        createMediaPlayedPercentEvent(params, RequestOptions.none())

    /** @see createMediaPlayedPercentEvent */
    fun createMediaPlayedPercentEvent(
        params: EventCreateMediaPlayedPercentEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventCreateMediaPlayedPercentEventResponse>

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
         * Returns a raw HTTP response for `post /media-bridge/v1/events/attention-span`, but is
         * otherwise the same as [EventServiceAsync.createAttentionSpanEvent].
         */
        fun createAttentionSpanEvent(
            params: EventCreateAttentionSpanEventParams
        ): CompletableFuture<HttpResponseFor<EventCreateAttentionSpanEventResponse>> =
            createAttentionSpanEvent(params, RequestOptions.none())

        /** @see createAttentionSpanEvent */
        fun createAttentionSpanEvent(
            params: EventCreateAttentionSpanEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventCreateAttentionSpanEventResponse>>

        /**
         * Returns a raw HTTP response for `post /media-bridge/v1/events/media-played`, but is
         * otherwise the same as [EventServiceAsync.createMediaPlayedEvent].
         */
        fun createMediaPlayedEvent(
            params: EventCreateMediaPlayedEventParams
        ): CompletableFuture<HttpResponseFor<EventCreateMediaPlayedEventResponse>> =
            createMediaPlayedEvent(params, RequestOptions.none())

        /** @see createMediaPlayedEvent */
        fun createMediaPlayedEvent(
            params: EventCreateMediaPlayedEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventCreateMediaPlayedEventResponse>>

        /**
         * Returns a raw HTTP response for `post /media-bridge/v1/events/media-played-percent`, but
         * is otherwise the same as [EventServiceAsync.createMediaPlayedPercentEvent].
         */
        fun createMediaPlayedPercentEvent(
            params: EventCreateMediaPlayedPercentEventParams
        ): CompletableFuture<HttpResponseFor<EventCreateMediaPlayedPercentEventResponse>> =
            createMediaPlayedPercentEvent(params, RequestOptions.none())

        /** @see createMediaPlayedPercentEvent */
        fun createMediaPlayedPercentEvent(
            params: EventCreateMediaPlayedPercentEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventCreateMediaPlayedPercentEventResponse>>
    }
}
