// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.events.EventListEventTypesParams
import com.hubspot_sdk.api.models.events.EventListPageAsync
import com.hubspot_sdk.api.models.events.EventListParams
import com.hubspot_sdk.api.models.events.VisibleExternalEventTypeNames
import com.hubspot_sdk.api.services.async.events.EventDefinitionServiceAsync
import com.hubspot_sdk.api.services.async.events.SendServiceAsync
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

    fun eventDefinitions(): EventDefinitionServiceAsync

    fun send(): SendServiceAsync

    /**
     * Retrieve instances of event completion data. For example, retrieve all event completions
     * associated with a specific contact.
     */
    fun list(): CompletableFuture<EventListPageAsync> = list(EventListParams.none())

    /** @see list */
    fun list(
        params: EventListParams = EventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventListPageAsync>

    /** @see list */
    fun list(
        params: EventListParams = EventListParams.none()
    ): CompletableFuture<EventListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EventListPageAsync> =
        list(EventListParams.none(), requestOptions)

    /**
     * This endpoint returns a list of event type names which are visible to you. You may use these
     * event type names to query the API for specific event instances of a desired type.
     *
     * Note: the `get_types` method is only supported in the Python SDK version `12.0.0-beta.1` or
     * later.
     */
    fun listEventTypes(): CompletableFuture<VisibleExternalEventTypeNames> =
        listEventTypes(EventListEventTypesParams.none())

    /** @see listEventTypes */
    fun listEventTypes(
        params: EventListEventTypesParams = EventListEventTypesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VisibleExternalEventTypeNames>

    /** @see listEventTypes */
    fun listEventTypes(
        params: EventListEventTypesParams = EventListEventTypesParams.none()
    ): CompletableFuture<VisibleExternalEventTypeNames> =
        listEventTypes(params, RequestOptions.none())

    /** @see listEventTypes */
    fun listEventTypes(
        requestOptions: RequestOptions
    ): CompletableFuture<VisibleExternalEventTypeNames> =
        listEventTypes(EventListEventTypesParams.none(), requestOptions)

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

        fun eventDefinitions(): EventDefinitionServiceAsync.WithRawResponse

        fun send(): SendServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /events/v3/events/`, but is otherwise the same as
         * [EventServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EventListPageAsync>> =
            list(EventListParams.none())

        /** @see list */
        fun list(
            params: EventListParams = EventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventListPageAsync>>

        /** @see list */
        fun list(
            params: EventListParams = EventListParams.none()
        ): CompletableFuture<HttpResponseFor<EventListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EventListPageAsync>> =
            list(EventListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /events/v3/events/event-types`, but is otherwise the
         * same as [EventServiceAsync.listEventTypes].
         */
        fun listEventTypes(): CompletableFuture<HttpResponseFor<VisibleExternalEventTypeNames>> =
            listEventTypes(EventListEventTypesParams.none())

        /** @see listEventTypes */
        fun listEventTypes(
            params: EventListEventTypesParams = EventListEventTypesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VisibleExternalEventTypeNames>>

        /** @see listEventTypes */
        fun listEventTypes(
            params: EventListEventTypesParams = EventListEventTypesParams.none()
        ): CompletableFuture<HttpResponseFor<VisibleExternalEventTypeNames>> =
            listEventTypes(params, RequestOptions.none())

        /** @see listEventTypes */
        fun listEventTypes(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VisibleExternalEventTypeNames>> =
            listEventTypes(EventListEventTypesParams.none(), requestOptions)
    }
}
