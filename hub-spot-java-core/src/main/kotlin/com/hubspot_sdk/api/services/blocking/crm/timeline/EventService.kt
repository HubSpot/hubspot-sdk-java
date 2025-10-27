// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.timeline

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.timeline.BatchInputTimelineEvent
import com.hubspot_sdk.api.models.crm.timeline.EventDetail
import com.hubspot_sdk.api.models.crm.timeline.TimelineEvent
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventResponse
import com.hubspot_sdk.api.models.crm.timeline.events.EventBatchCreateParams
import com.hubspot_sdk.api.models.crm.timeline.events.EventCreateParams
import com.hubspot_sdk.api.models.crm.timeline.events.EventGetDetailParams
import com.hubspot_sdk.api.models.crm.timeline.events.EventGetParams
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

    /** Send a single instance of event data to a specified event type. */
    fun create(params: EventCreateParams): TimelineEventResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EventCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TimelineEventResponse

    /** @see create */
    fun create(
        timelineEvent: TimelineEvent,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TimelineEventResponse =
        create(EventCreateParams.builder().timelineEvent(timelineEvent).build(), requestOptions)

    /** @see create */
    fun create(timelineEvent: TimelineEvent): TimelineEventResponse =
        create(timelineEvent, RequestOptions.none())

    /**
     * Batch create multiple instances of timeline events based on an event template. Once created,
     * these event are immutable on the object timeline and cannot be modified. If the event
     * template was configured to update object properties via `objectPropertyName`, this call will
     * also attempt to updates those properties, or add them if they don't exist.
     */
    fun batchCreate(params: EventBatchCreateParams) = batchCreate(params, RequestOptions.none())

    /** @see batchCreate */
    fun batchCreate(
        params: EventBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see batchCreate */
    fun batchCreate(
        batchInputTimelineEvent: BatchInputTimelineEvent,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        batchCreate(
            EventBatchCreateParams.builder()
                .batchInputTimelineEvent(batchInputTimelineEvent)
                .build(),
            requestOptions,
        )

    /** @see batchCreate */
    fun batchCreate(batchInputTimelineEvent: BatchInputTimelineEvent) =
        batchCreate(batchInputTimelineEvent, RequestOptions.none())

    /** Retrieve an event instance, specified by template ID and event ID. */
    fun get(eventId: String, params: EventGetParams): TimelineEventResponse =
        get(eventId, params, RequestOptions.none())

    /** @see get */
    fun get(
        eventId: String,
        params: EventGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TimelineEventResponse = get(params.toBuilder().eventId(eventId).build(), requestOptions)

    /** @see get */
    fun get(params: EventGetParams): TimelineEventResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: EventGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TimelineEventResponse

    /** Retrieve details for a specific event, specified by template ID and event ID. */
    fun getDetail(eventId: String, params: EventGetDetailParams): EventDetail =
        getDetail(eventId, params, RequestOptions.none())

    /** @see getDetail */
    fun getDetail(
        eventId: String,
        params: EventGetDetailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventDetail = getDetail(params.toBuilder().eventId(eventId).build(), requestOptions)

    /** @see getDetail */
    fun getDetail(params: EventGetDetailParams): EventDetail =
        getDetail(params, RequestOptions.none())

    /** @see getDetail */
    fun getDetail(
        params: EventGetDetailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventDetail

    /** A view of [EventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /integrators/timeline/v3/events`, but is otherwise
         * the same as [EventService.create].
         */
        @MustBeClosed
        fun create(params: EventCreateParams): HttpResponseFor<TimelineEventResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EventCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TimelineEventResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            timelineEvent: TimelineEvent,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TimelineEventResponse> =
            create(EventCreateParams.builder().timelineEvent(timelineEvent).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(timelineEvent: TimelineEvent): HttpResponseFor<TimelineEventResponse> =
            create(timelineEvent, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /integrators/timeline/v3/events/batch/create`, but
         * is otherwise the same as [EventService.batchCreate].
         */
        @MustBeClosed
        fun batchCreate(params: EventBatchCreateParams): HttpResponse =
            batchCreate(params, RequestOptions.none())

        /** @see batchCreate */
        @MustBeClosed
        fun batchCreate(
            params: EventBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see batchCreate */
        @MustBeClosed
        fun batchCreate(
            batchInputTimelineEvent: BatchInputTimelineEvent,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            batchCreate(
                EventBatchCreateParams.builder()
                    .batchInputTimelineEvent(batchInputTimelineEvent)
                    .build(),
                requestOptions,
            )

        /** @see batchCreate */
        @MustBeClosed
        fun batchCreate(batchInputTimelineEvent: BatchInputTimelineEvent): HttpResponse =
            batchCreate(batchInputTimelineEvent, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /integrators/timeline/v3/events/{eventTemplateId}/{eventId}`, but is otherwise the same
         * as [EventService.get].
         */
        @MustBeClosed
        fun get(eventId: String, params: EventGetParams): HttpResponseFor<TimelineEventResponse> =
            get(eventId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            eventId: String,
            params: EventGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TimelineEventResponse> =
            get(params.toBuilder().eventId(eventId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: EventGetParams): HttpResponseFor<TimelineEventResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: EventGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TimelineEventResponse>

        /**
         * Returns a raw HTTP response for `get
         * /integrators/timeline/v3/events/{eventTemplateId}/{eventId}/detail`, but is otherwise the
         * same as [EventService.getDetail].
         */
        @MustBeClosed
        fun getDetail(eventId: String, params: EventGetDetailParams): HttpResponseFor<EventDetail> =
            getDetail(eventId, params, RequestOptions.none())

        /** @see getDetail */
        @MustBeClosed
        fun getDetail(
            eventId: String,
            params: EventGetDetailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventDetail> =
            getDetail(params.toBuilder().eventId(eventId).build(), requestOptions)

        /** @see getDetail */
        @MustBeClosed
        fun getDetail(params: EventGetDetailParams): HttpResponseFor<EventDetail> =
            getDetail(params, RequestOptions.none())

        /** @see getDetail */
        @MustBeClosed
        fun getDetail(
            params: EventGetDetailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventDetail>
    }
}
