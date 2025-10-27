// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.mediabridge

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.mediabridge.AttentionSpanEvent
import com.hubspot_sdk.api.models.cms.mediabridge.AttentionSpanEventRequest
import com.hubspot_sdk.api.models.cms.mediabridge.MediaPlayedEvent
import com.hubspot_sdk.api.models.cms.mediabridge.MediaPlayedEventRequest
import com.hubspot_sdk.api.models.cms.mediabridge.MediaPlayedPercentageEvent
import com.hubspot_sdk.api.models.cms.mediabridge.MediaPlayedPercentageEventRequest
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateAttentionSpanEventParams
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateMediaPlayedEventParams
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateMediaPlayedPercentEventParams
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
    ): CompletableFuture<AttentionSpanEvent> =
        createAttentionSpanEvent(params, RequestOptions.none())

    /** @see createAttentionSpanEvent */
    fun createAttentionSpanEvent(
        params: EventCreateAttentionSpanEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AttentionSpanEvent>

    /** @see createAttentionSpanEvent */
    fun createAttentionSpanEvent(
        attentionSpanEventRequest: AttentionSpanEventRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AttentionSpanEvent> =
        createAttentionSpanEvent(
            EventCreateAttentionSpanEventParams.builder()
                .attentionSpanEventRequest(attentionSpanEventRequest)
                .build(),
            requestOptions,
        )

    /** @see createAttentionSpanEvent */
    fun createAttentionSpanEvent(
        attentionSpanEventRequest: AttentionSpanEventRequest
    ): CompletableFuture<AttentionSpanEvent> =
        createAttentionSpanEvent(attentionSpanEventRequest, RequestOptions.none())

    /** Create an event for when a user begins playing a piece of media. */
    fun createMediaPlayedEvent(
        params: EventCreateMediaPlayedEventParams
    ): CompletableFuture<MediaPlayedEvent> = createMediaPlayedEvent(params, RequestOptions.none())

    /** @see createMediaPlayedEvent */
    fun createMediaPlayedEvent(
        params: EventCreateMediaPlayedEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaPlayedEvent>

    /** @see createMediaPlayedEvent */
    fun createMediaPlayedEvent(
        mediaPlayedEventRequest: MediaPlayedEventRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaPlayedEvent> =
        createMediaPlayedEvent(
            EventCreateMediaPlayedEventParams.builder()
                .mediaPlayedEventRequest(mediaPlayedEventRequest)
                .build(),
            requestOptions,
        )

    /** @see createMediaPlayedEvent */
    fun createMediaPlayedEvent(
        mediaPlayedEventRequest: MediaPlayedEventRequest
    ): CompletableFuture<MediaPlayedEvent> =
        createMediaPlayedEvent(mediaPlayedEventRequest, RequestOptions.none())

    /**
     * Create an event representing a user reaching quarterly milestones in a piece of media they're
     * viewing.
     */
    fun createMediaPlayedPercentEvent(
        params: EventCreateMediaPlayedPercentEventParams
    ): CompletableFuture<MediaPlayedPercentageEvent> =
        createMediaPlayedPercentEvent(params, RequestOptions.none())

    /** @see createMediaPlayedPercentEvent */
    fun createMediaPlayedPercentEvent(
        params: EventCreateMediaPlayedPercentEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaPlayedPercentageEvent>

    /** @see createMediaPlayedPercentEvent */
    fun createMediaPlayedPercentEvent(
        mediaPlayedPercentageEventRequest: MediaPlayedPercentageEventRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaPlayedPercentageEvent> =
        createMediaPlayedPercentEvent(
            EventCreateMediaPlayedPercentEventParams.builder()
                .mediaPlayedPercentageEventRequest(mediaPlayedPercentageEventRequest)
                .build(),
            requestOptions,
        )

    /** @see createMediaPlayedPercentEvent */
    fun createMediaPlayedPercentEvent(
        mediaPlayedPercentageEventRequest: MediaPlayedPercentageEventRequest
    ): CompletableFuture<MediaPlayedPercentageEvent> =
        createMediaPlayedPercentEvent(mediaPlayedPercentageEventRequest, RequestOptions.none())

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
        ): CompletableFuture<HttpResponseFor<AttentionSpanEvent>> =
            createAttentionSpanEvent(params, RequestOptions.none())

        /** @see createAttentionSpanEvent */
        fun createAttentionSpanEvent(
            params: EventCreateAttentionSpanEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AttentionSpanEvent>>

        /** @see createAttentionSpanEvent */
        fun createAttentionSpanEvent(
            attentionSpanEventRequest: AttentionSpanEventRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AttentionSpanEvent>> =
            createAttentionSpanEvent(
                EventCreateAttentionSpanEventParams.builder()
                    .attentionSpanEventRequest(attentionSpanEventRequest)
                    .build(),
                requestOptions,
            )

        /** @see createAttentionSpanEvent */
        fun createAttentionSpanEvent(
            attentionSpanEventRequest: AttentionSpanEventRequest
        ): CompletableFuture<HttpResponseFor<AttentionSpanEvent>> =
            createAttentionSpanEvent(attentionSpanEventRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /media-bridge/v1/events/media-played`, but is
         * otherwise the same as [EventServiceAsync.createMediaPlayedEvent].
         */
        fun createMediaPlayedEvent(
            params: EventCreateMediaPlayedEventParams
        ): CompletableFuture<HttpResponseFor<MediaPlayedEvent>> =
            createMediaPlayedEvent(params, RequestOptions.none())

        /** @see createMediaPlayedEvent */
        fun createMediaPlayedEvent(
            params: EventCreateMediaPlayedEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaPlayedEvent>>

        /** @see createMediaPlayedEvent */
        fun createMediaPlayedEvent(
            mediaPlayedEventRequest: MediaPlayedEventRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaPlayedEvent>> =
            createMediaPlayedEvent(
                EventCreateMediaPlayedEventParams.builder()
                    .mediaPlayedEventRequest(mediaPlayedEventRequest)
                    .build(),
                requestOptions,
            )

        /** @see createMediaPlayedEvent */
        fun createMediaPlayedEvent(
            mediaPlayedEventRequest: MediaPlayedEventRequest
        ): CompletableFuture<HttpResponseFor<MediaPlayedEvent>> =
            createMediaPlayedEvent(mediaPlayedEventRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /media-bridge/v1/events/media-played-percent`, but
         * is otherwise the same as [EventServiceAsync.createMediaPlayedPercentEvent].
         */
        fun createMediaPlayedPercentEvent(
            params: EventCreateMediaPlayedPercentEventParams
        ): CompletableFuture<HttpResponseFor<MediaPlayedPercentageEvent>> =
            createMediaPlayedPercentEvent(params, RequestOptions.none())

        /** @see createMediaPlayedPercentEvent */
        fun createMediaPlayedPercentEvent(
            params: EventCreateMediaPlayedPercentEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaPlayedPercentageEvent>>

        /** @see createMediaPlayedPercentEvent */
        fun createMediaPlayedPercentEvent(
            mediaPlayedPercentageEventRequest: MediaPlayedPercentageEventRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaPlayedPercentageEvent>> =
            createMediaPlayedPercentEvent(
                EventCreateMediaPlayedPercentEventParams.builder()
                    .mediaPlayedPercentageEventRequest(mediaPlayedPercentageEventRequest)
                    .build(),
                requestOptions,
            )

        /** @see createMediaPlayedPercentEvent */
        fun createMediaPlayedPercentEvent(
            mediaPlayedPercentageEventRequest: MediaPlayedPercentageEventRequest
        ): CompletableFuture<HttpResponseFor<MediaPlayedPercentageEvent>> =
            createMediaPlayedPercentEvent(mediaPlayedPercentageEventRequest, RequestOptions.none())
    }
}
