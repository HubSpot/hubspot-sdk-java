// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.events

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.events.occurrences.OccurrenceListEventTypesParams
import com.hubspot_sdk.api.models.events.occurrences.OccurrenceListPage
import com.hubspot_sdk.api.models.events.occurrences.OccurrenceListParams
import com.hubspot_sdk.api.models.events.occurrences.VisibleExternalEventTypeNames
import java.util.function.Consumer

interface OccurrenceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OccurrenceService

    /**
     * Retrieve event occurrences for the specified time frame. This endpoint allows filtering by
     * various parameters such as object type, event type, and occurrence time. It supports
     * pagination and sorting of results.
     */
    fun list(): OccurrenceListPage = list(OccurrenceListParams.none())

    /** @see list */
    fun list(
        params: OccurrenceListParams = OccurrenceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OccurrenceListPage

    /** @see list */
    fun list(params: OccurrenceListParams = OccurrenceListParams.none()): OccurrenceListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): OccurrenceListPage =
        list(OccurrenceListParams.none(), requestOptions)

    /**
     * Retrieve a list of event type names. You may use these event types to query the API for event
     * occurrences of a desired type.
     *
     * Note: the `get_types` method is only supported in the Python SDK version `12.0.0-beta.1` or
     * later.
     */
    fun listEventTypes(): VisibleExternalEventTypeNames =
        listEventTypes(OccurrenceListEventTypesParams.none())

    /** @see listEventTypes */
    fun listEventTypes(
        params: OccurrenceListEventTypesParams = OccurrenceListEventTypesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VisibleExternalEventTypeNames

    /** @see listEventTypes */
    fun listEventTypes(
        params: OccurrenceListEventTypesParams = OccurrenceListEventTypesParams.none()
    ): VisibleExternalEventTypeNames = listEventTypes(params, RequestOptions.none())

    /** @see listEventTypes */
    fun listEventTypes(requestOptions: RequestOptions): VisibleExternalEventTypeNames =
        listEventTypes(OccurrenceListEventTypesParams.none(), requestOptions)

    /** A view of [OccurrenceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OccurrenceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /events/event-occurrences/2026-03`, but is otherwise
         * the same as [OccurrenceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<OccurrenceListPage> = list(OccurrenceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OccurrenceListParams = OccurrenceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OccurrenceListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: OccurrenceListParams = OccurrenceListParams.none()
        ): HttpResponseFor<OccurrenceListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OccurrenceListPage> =
            list(OccurrenceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /events/event-occurrences/2026-03/event-types`, but
         * is otherwise the same as [OccurrenceService.listEventTypes].
         */
        @MustBeClosed
        fun listEventTypes(): HttpResponseFor<VisibleExternalEventTypeNames> =
            listEventTypes(OccurrenceListEventTypesParams.none())

        /** @see listEventTypes */
        @MustBeClosed
        fun listEventTypes(
            params: OccurrenceListEventTypesParams = OccurrenceListEventTypesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VisibleExternalEventTypeNames>

        /** @see listEventTypes */
        @MustBeClosed
        fun listEventTypes(
            params: OccurrenceListEventTypesParams = OccurrenceListEventTypesParams.none()
        ): HttpResponseFor<VisibleExternalEventTypeNames> =
            listEventTypes(params, RequestOptions.none())

        /** @see listEventTypes */
        @MustBeClosed
        fun listEventTypes(
            requestOptions: RequestOptions
        ): HttpResponseFor<VisibleExternalEventTypeNames> =
            listEventTypes(OccurrenceListEventTypesParams.none(), requestOptions)
    }
}
