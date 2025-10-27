// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.events.EventListEventTypesParams
import com.hubspot_sdk.api.models.events.EventListPage
import com.hubspot_sdk.api.models.events.EventListParams
import com.hubspot_sdk.api.models.events.VisibleExternalEventTypeNames
import com.hubspot_sdk.api.services.blocking.events.EventDefinitionService
import com.hubspot_sdk.api.services.blocking.events.SendService
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

    fun eventDefinitions(): EventDefinitionService

    fun send(): SendService

    /**
     * Retrieve instances of event completion data. For example, retrieve all event completions
     * associated with a specific contact.
     */
    fun list(): EventListPage = list(EventListParams.none())

    /** @see list */
    fun list(
        params: EventListParams = EventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventListPage

    /** @see list */
    fun list(params: EventListParams = EventListParams.none()): EventListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EventListPage =
        list(EventListParams.none(), requestOptions)

    /**
     * This endpoint returns a list of event type names which are visible to you. You may use these
     * event type names to query the API for specific event instances of a desired type.
     *
     * Note: the `get_types` method is only supported in the Python SDK version `12.0.0-beta.1` or
     * later.
     */
    fun listEventTypes(): VisibleExternalEventTypeNames =
        listEventTypes(EventListEventTypesParams.none())

    /** @see listEventTypes */
    fun listEventTypes(
        params: EventListEventTypesParams = EventListEventTypesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VisibleExternalEventTypeNames

    /** @see listEventTypes */
    fun listEventTypes(
        params: EventListEventTypesParams = EventListEventTypesParams.none()
    ): VisibleExternalEventTypeNames = listEventTypes(params, RequestOptions.none())

    /** @see listEventTypes */
    fun listEventTypes(requestOptions: RequestOptions): VisibleExternalEventTypeNames =
        listEventTypes(EventListEventTypesParams.none(), requestOptions)

    /** A view of [EventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService.WithRawResponse

        fun eventDefinitions(): EventDefinitionService.WithRawResponse

        fun send(): SendService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /events/v3/events/`, but is otherwise the same as
         * [EventService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<EventListPage> = list(EventListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EventListParams = EventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: EventListParams = EventListParams.none()): HttpResponseFor<EventListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EventListPage> =
            list(EventListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /events/v3/events/event-types`, but is otherwise the
         * same as [EventService.listEventTypes].
         */
        @MustBeClosed
        fun listEventTypes(): HttpResponseFor<VisibleExternalEventTypeNames> =
            listEventTypes(EventListEventTypesParams.none())

        /** @see listEventTypes */
        @MustBeClosed
        fun listEventTypes(
            params: EventListEventTypesParams = EventListEventTypesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VisibleExternalEventTypeNames>

        /** @see listEventTypes */
        @MustBeClosed
        fun listEventTypes(
            params: EventListEventTypesParams = EventListEventTypesParams.none()
        ): HttpResponseFor<VisibleExternalEventTypeNames> =
            listEventTypes(params, RequestOptions.none())

        /** @see listEventTypes */
        @MustBeClosed
        fun listEventTypes(
            requestOptions: RequestOptions
        ): HttpResponseFor<VisibleExternalEventTypeNames> =
            listEventTypes(EventListEventTypesParams.none(), requestOptions)
    }
}
