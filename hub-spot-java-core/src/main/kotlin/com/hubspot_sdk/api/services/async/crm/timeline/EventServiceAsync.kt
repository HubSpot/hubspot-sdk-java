// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.timeline

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

    /** Send a single instance of event data to a specified event type. */
    fun create(params: EventCreateParams): CompletableFuture<TimelineEventResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EventCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TimelineEventResponse>

    /** @see create */
    fun create(
        timelineEvent: TimelineEvent,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TimelineEventResponse> =
        create(EventCreateParams.builder().timelineEvent(timelineEvent).build(), requestOptions)

    /** @see create */
    fun create(timelineEvent: TimelineEvent): CompletableFuture<TimelineEventResponse> =
        create(timelineEvent, RequestOptions.none())

    /**
     * Batch create multiple instances of timeline events based on an event template. Once created,
     * these event are immutable on the object timeline and cannot be modified. If the event
     * template was configured to update object properties via `objectPropertyName`, this call will
     * also attempt to updates those properties, or add them if they don't exist.
     */
    fun batchCreate(params: EventBatchCreateParams): CompletableFuture<Void?> =
        batchCreate(params, RequestOptions.none())

    /** @see batchCreate */
    fun batchCreate(
        params: EventBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see batchCreate */
    fun batchCreate(
        batchInputTimelineEvent: BatchInputTimelineEvent,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        batchCreate(
            EventBatchCreateParams.builder()
                .batchInputTimelineEvent(batchInputTimelineEvent)
                .build(),
            requestOptions,
        )

    /** @see batchCreate */
    fun batchCreate(batchInputTimelineEvent: BatchInputTimelineEvent): CompletableFuture<Void?> =
        batchCreate(batchInputTimelineEvent, RequestOptions.none())

    /** Retrieve an event instance, specified by template ID and event ID. */
    fun get(eventId: String, params: EventGetParams): CompletableFuture<TimelineEventResponse> =
        get(eventId, params, RequestOptions.none())

    /** @see get */
    fun get(
        eventId: String,
        params: EventGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TimelineEventResponse> =
        get(params.toBuilder().eventId(eventId).build(), requestOptions)

    /** @see get */
    fun get(params: EventGetParams): CompletableFuture<TimelineEventResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: EventGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TimelineEventResponse>

    /** Retrieve details for a specific event, specified by template ID and event ID. */
    fun getDetail(eventId: String, params: EventGetDetailParams): CompletableFuture<EventDetail> =
        getDetail(eventId, params, RequestOptions.none())

    /** @see getDetail */
    fun getDetail(
        eventId: String,
        params: EventGetDetailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventDetail> =
        getDetail(params.toBuilder().eventId(eventId).build(), requestOptions)

    /** @see getDetail */
    fun getDetail(params: EventGetDetailParams): CompletableFuture<EventDetail> =
        getDetail(params, RequestOptions.none())

    /** @see getDetail */
    fun getDetail(
        params: EventGetDetailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventDetail>

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
         * Returns a raw HTTP response for `post /integrators/timeline/v3/events`, but is otherwise
         * the same as [EventServiceAsync.create].
         */
        fun create(
            params: EventCreateParams
        ): CompletableFuture<HttpResponseFor<TimelineEventResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EventCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TimelineEventResponse>>

        /** @see create */
        fun create(
            timelineEvent: TimelineEvent,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TimelineEventResponse>> =
            create(EventCreateParams.builder().timelineEvent(timelineEvent).build(), requestOptions)

        /** @see create */
        fun create(
            timelineEvent: TimelineEvent
        ): CompletableFuture<HttpResponseFor<TimelineEventResponse>> =
            create(timelineEvent, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /integrators/timeline/v3/events/batch/create`, but
         * is otherwise the same as [EventServiceAsync.batchCreate].
         */
        fun batchCreate(params: EventBatchCreateParams): CompletableFuture<HttpResponse> =
            batchCreate(params, RequestOptions.none())

        /** @see batchCreate */
        fun batchCreate(
            params: EventBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see batchCreate */
        fun batchCreate(
            batchInputTimelineEvent: BatchInputTimelineEvent,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            batchCreate(
                EventBatchCreateParams.builder()
                    .batchInputTimelineEvent(batchInputTimelineEvent)
                    .build(),
                requestOptions,
            )

        /** @see batchCreate */
        fun batchCreate(
            batchInputTimelineEvent: BatchInputTimelineEvent
        ): CompletableFuture<HttpResponse> =
            batchCreate(batchInputTimelineEvent, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /integrators/timeline/v3/events/{eventTemplateId}/{eventId}`, but is otherwise the same
         * as [EventServiceAsync.get].
         */
        fun get(
            eventId: String,
            params: EventGetParams,
        ): CompletableFuture<HttpResponseFor<TimelineEventResponse>> =
            get(eventId, params, RequestOptions.none())

        /** @see get */
        fun get(
            eventId: String,
            params: EventGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TimelineEventResponse>> =
            get(params.toBuilder().eventId(eventId).build(), requestOptions)

        /** @see get */
        fun get(params: EventGetParams): CompletableFuture<HttpResponseFor<TimelineEventResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: EventGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TimelineEventResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /integrators/timeline/v3/events/{eventTemplateId}/{eventId}/detail`, but is otherwise the
         * same as [EventServiceAsync.getDetail].
         */
        fun getDetail(
            eventId: String,
            params: EventGetDetailParams,
        ): CompletableFuture<HttpResponseFor<EventDetail>> =
            getDetail(eventId, params, RequestOptions.none())

        /** @see getDetail */
        fun getDetail(
            eventId: String,
            params: EventGetDetailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventDetail>> =
            getDetail(params.toBuilder().eventId(eventId).build(), requestOptions)

        /** @see getDetail */
        fun getDetail(
            params: EventGetDetailParams
        ): CompletableFuture<HttpResponseFor<EventDetail>> =
            getDetail(params, RequestOptions.none())

        /** @see getDetail */
        fun getDetail(
            params: EventGetDetailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventDetail>>
    }
}
