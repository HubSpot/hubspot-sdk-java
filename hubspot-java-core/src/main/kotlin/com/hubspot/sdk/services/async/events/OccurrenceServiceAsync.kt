// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.events

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.events.occurrences.OccurrenceListEventTypesParams
import com.hubspot.sdk.models.events.occurrences.OccurrenceListPageAsync
import com.hubspot.sdk.models.events.occurrences.OccurrenceListParams
import com.hubspot.sdk.models.events.occurrences.VisibleExternalEventTypeNames
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OccurrenceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OccurrenceServiceAsync

    /**
     * Retrieve event occurrences for the specified time frame. This endpoint allows filtering by
     * various parameters such as object type, event type, and occurrence time. It supports
     * pagination and sorting of results.
     */
    fun list(): CompletableFuture<OccurrenceListPageAsync> = list(OccurrenceListParams.none())

    /** @see list */
    fun list(
        params: OccurrenceListParams = OccurrenceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OccurrenceListPageAsync>

    /** @see list */
    fun list(
        params: OccurrenceListParams = OccurrenceListParams.none()
    ): CompletableFuture<OccurrenceListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OccurrenceListPageAsync> =
        list(OccurrenceListParams.none(), requestOptions)

    /**
     * Retrieve a list of event type names. You may use these event types to query the API for event
     * occurrences of a desired type.
     *
     * Note: the `get_types` method is only supported in the Python SDK version `12.0.0-beta.1` or
     * later.
     */
    fun listEventTypes(): CompletableFuture<VisibleExternalEventTypeNames> =
        listEventTypes(OccurrenceListEventTypesParams.none())

    /** @see listEventTypes */
    fun listEventTypes(
        params: OccurrenceListEventTypesParams = OccurrenceListEventTypesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VisibleExternalEventTypeNames>

    /** @see listEventTypes */
    fun listEventTypes(
        params: OccurrenceListEventTypesParams = OccurrenceListEventTypesParams.none()
    ): CompletableFuture<VisibleExternalEventTypeNames> =
        listEventTypes(params, RequestOptions.none())

    /** @see listEventTypes */
    fun listEventTypes(
        requestOptions: RequestOptions
    ): CompletableFuture<VisibleExternalEventTypeNames> =
        listEventTypes(OccurrenceListEventTypesParams.none(), requestOptions)

    /**
     * A view of [OccurrenceServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OccurrenceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /events/event-occurrences/2026-03`, but is otherwise
         * the same as [OccurrenceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<OccurrenceListPageAsync>> =
            list(OccurrenceListParams.none())

        /** @see list */
        fun list(
            params: OccurrenceListParams = OccurrenceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OccurrenceListPageAsync>>

        /** @see list */
        fun list(
            params: OccurrenceListParams = OccurrenceListParams.none()
        ): CompletableFuture<HttpResponseFor<OccurrenceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OccurrenceListPageAsync>> =
            list(OccurrenceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /events/event-occurrences/2026-03/event-types`, but
         * is otherwise the same as [OccurrenceServiceAsync.listEventTypes].
         */
        fun listEventTypes(): CompletableFuture<HttpResponseFor<VisibleExternalEventTypeNames>> =
            listEventTypes(OccurrenceListEventTypesParams.none())

        /** @see listEventTypes */
        fun listEventTypes(
            params: OccurrenceListEventTypesParams = OccurrenceListEventTypesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VisibleExternalEventTypeNames>>

        /** @see listEventTypes */
        fun listEventTypes(
            params: OccurrenceListEventTypesParams = OccurrenceListEventTypesParams.none()
        ): CompletableFuture<HttpResponseFor<VisibleExternalEventTypeNames>> =
            listEventTypes(params, RequestOptions.none())

        /** @see listEventTypes */
        fun listEventTypes(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VisibleExternalEventTypeNames>> =
            listEventTypes(OccurrenceListEventTypesParams.none(), requestOptions)
    }
}
