// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.mediabridge

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateAttentionSpanEventParams
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateAttentionSpanEventResponse
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateMediaPlayedEventParams
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateMediaPlayedEventResponse
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateMediaPlayedPercentEventParams
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateMediaPlayedPercentEventResponse
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
    fun createAttentionSpanEvent(
        params: EventCreateAttentionSpanEventParams
    ): EventCreateAttentionSpanEventResponse =
        createAttentionSpanEvent(params, RequestOptions.none())

    /** @see createAttentionSpanEvent */
    fun createAttentionSpanEvent(
        params: EventCreateAttentionSpanEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventCreateAttentionSpanEventResponse

    /** Create an event for when a user begins playing a piece of media. */
    fun createMediaPlayedEvent(
        params: EventCreateMediaPlayedEventParams
    ): EventCreateMediaPlayedEventResponse = createMediaPlayedEvent(params, RequestOptions.none())

    /** @see createMediaPlayedEvent */
    fun createMediaPlayedEvent(
        params: EventCreateMediaPlayedEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventCreateMediaPlayedEventResponse

    /**
     * Create an event representing a user reaching quarterly milestones in a piece of media they're
     * viewing.
     */
    fun createMediaPlayedPercentEvent(
        params: EventCreateMediaPlayedPercentEventParams
    ): EventCreateMediaPlayedPercentEventResponse =
        createMediaPlayedPercentEvent(params, RequestOptions.none())

    /** @see createMediaPlayedPercentEvent */
    fun createMediaPlayedPercentEvent(
        params: EventCreateMediaPlayedPercentEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventCreateMediaPlayedPercentEventResponse

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
        ): HttpResponseFor<EventCreateAttentionSpanEventResponse> =
            createAttentionSpanEvent(params, RequestOptions.none())

        /** @see createAttentionSpanEvent */
        @MustBeClosed
        fun createAttentionSpanEvent(
            params: EventCreateAttentionSpanEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventCreateAttentionSpanEventResponse>

        /**
         * Returns a raw HTTP response for `post /media-bridge/v1/events/media-played`, but is
         * otherwise the same as [EventService.createMediaPlayedEvent].
         */
        @MustBeClosed
        fun createMediaPlayedEvent(
            params: EventCreateMediaPlayedEventParams
        ): HttpResponseFor<EventCreateMediaPlayedEventResponse> =
            createMediaPlayedEvent(params, RequestOptions.none())

        /** @see createMediaPlayedEvent */
        @MustBeClosed
        fun createMediaPlayedEvent(
            params: EventCreateMediaPlayedEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventCreateMediaPlayedEventResponse>

        /**
         * Returns a raw HTTP response for `post /media-bridge/v1/events/media-played-percent`, but
         * is otherwise the same as [EventService.createMediaPlayedPercentEvent].
         */
        @MustBeClosed
        fun createMediaPlayedPercentEvent(
            params: EventCreateMediaPlayedPercentEventParams
        ): HttpResponseFor<EventCreateMediaPlayedPercentEventResponse> =
            createMediaPlayedPercentEvent(params, RequestOptions.none())

        /** @see createMediaPlayedPercentEvent */
        @MustBeClosed
        fun createMediaPlayedPercentEvent(
            params: EventCreateMediaPlayedPercentEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventCreateMediaPlayedPercentEventResponse>
    }
}
