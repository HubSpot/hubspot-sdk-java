// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.mediabridge

import com.google.errorprone.annotations.MustBeClosed
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

    /** Create an event containing the viewers attention span details for the media. */
    fun createAttentionSpanEvent(params: EventCreateAttentionSpanEventParams): AttentionSpanEvent =
        createAttentionSpanEvent(params, RequestOptions.none())

    /** @see createAttentionSpanEvent */
    fun createAttentionSpanEvent(
        params: EventCreateAttentionSpanEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttentionSpanEvent

    /** @see createAttentionSpanEvent */
    fun createAttentionSpanEvent(
        attentionSpanEventRequest: AttentionSpanEventRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttentionSpanEvent =
        createAttentionSpanEvent(
            EventCreateAttentionSpanEventParams.builder()
                .attentionSpanEventRequest(attentionSpanEventRequest)
                .build(),
            requestOptions,
        )

    /** @see createAttentionSpanEvent */
    fun createAttentionSpanEvent(
        attentionSpanEventRequest: AttentionSpanEventRequest
    ): AttentionSpanEvent =
        createAttentionSpanEvent(attentionSpanEventRequest, RequestOptions.none())

    /** Create an event for when a user begins playing a piece of media. */
    fun createMediaPlayedEvent(params: EventCreateMediaPlayedEventParams): MediaPlayedEvent =
        createMediaPlayedEvent(params, RequestOptions.none())

    /** @see createMediaPlayedEvent */
    fun createMediaPlayedEvent(
        params: EventCreateMediaPlayedEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaPlayedEvent

    /** @see createMediaPlayedEvent */
    fun createMediaPlayedEvent(
        mediaPlayedEventRequest: MediaPlayedEventRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaPlayedEvent =
        createMediaPlayedEvent(
            EventCreateMediaPlayedEventParams.builder()
                .mediaPlayedEventRequest(mediaPlayedEventRequest)
                .build(),
            requestOptions,
        )

    /** @see createMediaPlayedEvent */
    fun createMediaPlayedEvent(mediaPlayedEventRequest: MediaPlayedEventRequest): MediaPlayedEvent =
        createMediaPlayedEvent(mediaPlayedEventRequest, RequestOptions.none())

    /**
     * Create an event representing a user reaching quarterly milestones in a piece of media they're
     * viewing.
     */
    fun createMediaPlayedPercentEvent(
        params: EventCreateMediaPlayedPercentEventParams
    ): MediaPlayedPercentageEvent = createMediaPlayedPercentEvent(params, RequestOptions.none())

    /** @see createMediaPlayedPercentEvent */
    fun createMediaPlayedPercentEvent(
        params: EventCreateMediaPlayedPercentEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaPlayedPercentageEvent

    /** @see createMediaPlayedPercentEvent */
    fun createMediaPlayedPercentEvent(
        mediaPlayedPercentageEventRequest: MediaPlayedPercentageEventRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaPlayedPercentageEvent =
        createMediaPlayedPercentEvent(
            EventCreateMediaPlayedPercentEventParams.builder()
                .mediaPlayedPercentageEventRequest(mediaPlayedPercentageEventRequest)
                .build(),
            requestOptions,
        )

    /** @see createMediaPlayedPercentEvent */
    fun createMediaPlayedPercentEvent(
        mediaPlayedPercentageEventRequest: MediaPlayedPercentageEventRequest
    ): MediaPlayedPercentageEvent =
        createMediaPlayedPercentEvent(mediaPlayedPercentageEventRequest, RequestOptions.none())

    /** A view of [EventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /media-bridge/v1/events/attention-span`, but is
         * otherwise the same as [EventService.createAttentionSpanEvent].
         */
        @MustBeClosed
        fun createAttentionSpanEvent(
            params: EventCreateAttentionSpanEventParams
        ): HttpResponseFor<AttentionSpanEvent> =
            createAttentionSpanEvent(params, RequestOptions.none())

        /** @see createAttentionSpanEvent */
        @MustBeClosed
        fun createAttentionSpanEvent(
            params: EventCreateAttentionSpanEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttentionSpanEvent>

        /** @see createAttentionSpanEvent */
        @MustBeClosed
        fun createAttentionSpanEvent(
            attentionSpanEventRequest: AttentionSpanEventRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttentionSpanEvent> =
            createAttentionSpanEvent(
                EventCreateAttentionSpanEventParams.builder()
                    .attentionSpanEventRequest(attentionSpanEventRequest)
                    .build(),
                requestOptions,
            )

        /** @see createAttentionSpanEvent */
        @MustBeClosed
        fun createAttentionSpanEvent(
            attentionSpanEventRequest: AttentionSpanEventRequest
        ): HttpResponseFor<AttentionSpanEvent> =
            createAttentionSpanEvent(attentionSpanEventRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /media-bridge/v1/events/media-played`, but is
         * otherwise the same as [EventService.createMediaPlayedEvent].
         */
        @MustBeClosed
        fun createMediaPlayedEvent(
            params: EventCreateMediaPlayedEventParams
        ): HttpResponseFor<MediaPlayedEvent> = createMediaPlayedEvent(params, RequestOptions.none())

        /** @see createMediaPlayedEvent */
        @MustBeClosed
        fun createMediaPlayedEvent(
            params: EventCreateMediaPlayedEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaPlayedEvent>

        /** @see createMediaPlayedEvent */
        @MustBeClosed
        fun createMediaPlayedEvent(
            mediaPlayedEventRequest: MediaPlayedEventRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaPlayedEvent> =
            createMediaPlayedEvent(
                EventCreateMediaPlayedEventParams.builder()
                    .mediaPlayedEventRequest(mediaPlayedEventRequest)
                    .build(),
                requestOptions,
            )

        /** @see createMediaPlayedEvent */
        @MustBeClosed
        fun createMediaPlayedEvent(
            mediaPlayedEventRequest: MediaPlayedEventRequest
        ): HttpResponseFor<MediaPlayedEvent> =
            createMediaPlayedEvent(mediaPlayedEventRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /media-bridge/v1/events/media-played-percent`, but
         * is otherwise the same as [EventService.createMediaPlayedPercentEvent].
         */
        @MustBeClosed
        fun createMediaPlayedPercentEvent(
            params: EventCreateMediaPlayedPercentEventParams
        ): HttpResponseFor<MediaPlayedPercentageEvent> =
            createMediaPlayedPercentEvent(params, RequestOptions.none())

        /** @see createMediaPlayedPercentEvent */
        @MustBeClosed
        fun createMediaPlayedPercentEvent(
            params: EventCreateMediaPlayedPercentEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaPlayedPercentageEvent>

        /** @see createMediaPlayedPercentEvent */
        @MustBeClosed
        fun createMediaPlayedPercentEvent(
            mediaPlayedPercentageEventRequest: MediaPlayedPercentageEventRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaPlayedPercentageEvent> =
            createMediaPlayedPercentEvent(
                EventCreateMediaPlayedPercentEventParams.builder()
                    .mediaPlayedPercentageEventRequest(mediaPlayedPercentageEventRequest)
                    .build(),
                requestOptions,
            )

        /** @see createMediaPlayedPercentEvent */
        @MustBeClosed
        fun createMediaPlayedPercentEvent(
            mediaPlayedPercentageEventRequest: MediaPlayedPercentageEventRequest
        ): HttpResponseFor<MediaPlayedPercentageEvent> =
            createMediaPlayedPercentEvent(mediaPlayedPercentageEventRequest, RequestOptions.none())
    }
}
