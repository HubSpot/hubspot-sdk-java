// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.events

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.Property
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionCreateParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionCreatePropertyParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionCreateResponse
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionDeleteParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionDeletePropertyParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionGetParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionGetResponse
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionListPage
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionListParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionUpdateParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionUpdatePropertyParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionUpdateResponse
import java.util.function.Consumer

interface EventDefinitionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventDefinitionService

    /** Create a custom event definition. */
    fun create(params: EventDefinitionCreateParams): EventDefinitionCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EventDefinitionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventDefinitionCreateResponse

    /** Update a specific custom event definition by name. */
    fun update(eventName: String): EventDefinitionUpdateResponse =
        update(eventName, EventDefinitionUpdateParams.none())

    /** @see update */
    fun update(
        eventName: String,
        params: EventDefinitionUpdateParams = EventDefinitionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventDefinitionUpdateResponse =
        update(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see update */
    fun update(
        eventName: String,
        params: EventDefinitionUpdateParams = EventDefinitionUpdateParams.none(),
    ): EventDefinitionUpdateResponse = update(eventName, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EventDefinitionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventDefinitionUpdateResponse

    /** @see update */
    fun update(params: EventDefinitionUpdateParams): EventDefinitionUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(eventName: String, requestOptions: RequestOptions): EventDefinitionUpdateResponse =
        update(eventName, EventDefinitionUpdateParams.none(), requestOptions)

    /** Retrieve existing custom event definitions. */
    fun list(): EventDefinitionListPage = list(EventDefinitionListParams.none())

    /** @see list */
    fun list(
        params: EventDefinitionListParams = EventDefinitionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventDefinitionListPage

    /** @see list */
    fun list(
        params: EventDefinitionListParams = EventDefinitionListParams.none()
    ): EventDefinitionListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EventDefinitionListPage =
        list(EventDefinitionListParams.none(), requestOptions)

    /** Delete a custom event definition by name. */
    fun delete(eventName: String) = delete(eventName, EventDefinitionDeleteParams.none())

    /** @see delete */
    fun delete(
        eventName: String,
        params: EventDefinitionDeleteParams = EventDefinitionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see delete */
    fun delete(
        eventName: String,
        params: EventDefinitionDeleteParams = EventDefinitionDeleteParams.none(),
    ) = delete(eventName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EventDefinitionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: EventDefinitionDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(eventName: String, requestOptions: RequestOptions) =
        delete(eventName, EventDefinitionDeleteParams.none(), requestOptions)

    /** Create a new property for an existing event definition. */
    fun createProperty(eventName: String, params: EventDefinitionCreatePropertyParams): Property =
        createProperty(eventName, params, RequestOptions.none())

    /** @see createProperty */
    fun createProperty(
        eventName: String,
        params: EventDefinitionCreatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property = createProperty(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see createProperty */
    fun createProperty(params: EventDefinitionCreatePropertyParams): Property =
        createProperty(params, RequestOptions.none())

    /** @see createProperty */
    fun createProperty(
        params: EventDefinitionCreatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property

    /** Delete an existing property from a custom event definition. */
    fun deleteProperty(propertyName: String, params: EventDefinitionDeletePropertyParams) =
        deleteProperty(propertyName, params, RequestOptions.none())

    /** @see deleteProperty */
    fun deleteProperty(
        propertyName: String,
        params: EventDefinitionDeletePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see deleteProperty */
    fun deleteProperty(params: EventDefinitionDeletePropertyParams) =
        deleteProperty(params, RequestOptions.none())

    /** @see deleteProperty */
    fun deleteProperty(
        params: EventDefinitionDeletePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Fetch a single custom event definition by name. */
    fun get(eventName: String): EventDefinitionGetResponse =
        get(eventName, EventDefinitionGetParams.none())

    /** @see get */
    fun get(
        eventName: String,
        params: EventDefinitionGetParams = EventDefinitionGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventDefinitionGetResponse =
        get(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see get */
    fun get(
        eventName: String,
        params: EventDefinitionGetParams = EventDefinitionGetParams.none(),
    ): EventDefinitionGetResponse = get(eventName, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: EventDefinitionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventDefinitionGetResponse

    /** @see get */
    fun get(params: EventDefinitionGetParams): EventDefinitionGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(eventName: String, requestOptions: RequestOptions): EventDefinitionGetResponse =
        get(eventName, EventDefinitionGetParams.none(), requestOptions)

    /** Update an existing property in a custom event definition. */
    fun updateProperty(
        propertyName: String,
        params: EventDefinitionUpdatePropertyParams,
    ): Property = updateProperty(propertyName, params, RequestOptions.none())

    /** @see updateProperty */
    fun updateProperty(
        propertyName: String,
        params: EventDefinitionUpdatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property =
        updateProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see updateProperty */
    fun updateProperty(params: EventDefinitionUpdatePropertyParams): Property =
        updateProperty(params, RequestOptions.none())

    /** @see updateProperty */
    fun updateProperty(
        params: EventDefinitionUpdatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property

    /**
     * A view of [EventDefinitionService] that provides access to raw HTTP responses for each
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
        ): EventDefinitionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /events/v3/event-definitions`, but is otherwise the
         * same as [EventDefinitionService.create].
         */
        @MustBeClosed
        fun create(
            params: EventDefinitionCreateParams
        ): HttpResponseFor<EventDefinitionCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EventDefinitionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventDefinitionCreateResponse>

        /**
         * Returns a raw HTTP response for `patch /events/v3/event-definitions/{eventName}`, but is
         * otherwise the same as [EventDefinitionService.update].
         */
        @MustBeClosed
        fun update(eventName: String): HttpResponseFor<EventDefinitionUpdateResponse> =
            update(eventName, EventDefinitionUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            eventName: String,
            params: EventDefinitionUpdateParams = EventDefinitionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventDefinitionUpdateResponse> =
            update(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            eventName: String,
            params: EventDefinitionUpdateParams = EventDefinitionUpdateParams.none(),
        ): HttpResponseFor<EventDefinitionUpdateResponse> =
            update(eventName, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: EventDefinitionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventDefinitionUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: EventDefinitionUpdateParams
        ): HttpResponseFor<EventDefinitionUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            eventName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventDefinitionUpdateResponse> =
            update(eventName, EventDefinitionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /events/v3/event-definitions`, but is otherwise the
         * same as [EventDefinitionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<EventDefinitionListPage> =
            list(EventDefinitionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EventDefinitionListParams = EventDefinitionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventDefinitionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EventDefinitionListParams = EventDefinitionListParams.none()
        ): HttpResponseFor<EventDefinitionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EventDefinitionListPage> =
            list(EventDefinitionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /events/v3/event-definitions/{eventName}`, but is
         * otherwise the same as [EventDefinitionService.delete].
         */
        @MustBeClosed
        fun delete(eventName: String): HttpResponse =
            delete(eventName, EventDefinitionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            eventName: String,
            params: EventDefinitionDeleteParams = EventDefinitionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            eventName: String,
            params: EventDefinitionDeleteParams = EventDefinitionDeleteParams.none(),
        ): HttpResponse = delete(eventName, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EventDefinitionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: EventDefinitionDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(eventName: String, requestOptions: RequestOptions): HttpResponse =
            delete(eventName, EventDefinitionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /events/v3/event-definitions/{eventName}/property`,
         * but is otherwise the same as [EventDefinitionService.createProperty].
         */
        @MustBeClosed
        fun createProperty(
            eventName: String,
            params: EventDefinitionCreatePropertyParams,
        ): HttpResponseFor<Property> = createProperty(eventName, params, RequestOptions.none())

        /** @see createProperty */
        @MustBeClosed
        fun createProperty(
            eventName: String,
            params: EventDefinitionCreatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property> =
            createProperty(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see createProperty */
        @MustBeClosed
        fun createProperty(params: EventDefinitionCreatePropertyParams): HttpResponseFor<Property> =
            createProperty(params, RequestOptions.none())

        /** @see createProperty */
        @MustBeClosed
        fun createProperty(
            params: EventDefinitionCreatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property>

        /**
         * Returns a raw HTTP response for `delete
         * /events/v3/event-definitions/{eventName}/property/{propertyName}`, but is otherwise the
         * same as [EventDefinitionService.deleteProperty].
         */
        @MustBeClosed
        fun deleteProperty(
            propertyName: String,
            params: EventDefinitionDeletePropertyParams,
        ): HttpResponse = deleteProperty(propertyName, params, RequestOptions.none())

        /** @see deleteProperty */
        @MustBeClosed
        fun deleteProperty(
            propertyName: String,
            params: EventDefinitionDeletePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see deleteProperty */
        @MustBeClosed
        fun deleteProperty(params: EventDefinitionDeletePropertyParams): HttpResponse =
            deleteProperty(params, RequestOptions.none())

        /** @see deleteProperty */
        @MustBeClosed
        fun deleteProperty(
            params: EventDefinitionDeletePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /events/v3/event-definitions/{eventName}`, but is
         * otherwise the same as [EventDefinitionService.get].
         */
        @MustBeClosed
        fun get(eventName: String): HttpResponseFor<EventDefinitionGetResponse> =
            get(eventName, EventDefinitionGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            eventName: String,
            params: EventDefinitionGetParams = EventDefinitionGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventDefinitionGetResponse> =
            get(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            eventName: String,
            params: EventDefinitionGetParams = EventDefinitionGetParams.none(),
        ): HttpResponseFor<EventDefinitionGetResponse> =
            get(eventName, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: EventDefinitionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventDefinitionGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: EventDefinitionGetParams): HttpResponseFor<EventDefinitionGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            eventName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventDefinitionGetResponse> =
            get(eventName, EventDefinitionGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /events/v3/event-definitions/{eventName}/property/{propertyName}`, but is otherwise the
         * same as [EventDefinitionService.updateProperty].
         */
        @MustBeClosed
        fun updateProperty(
            propertyName: String,
            params: EventDefinitionUpdatePropertyParams,
        ): HttpResponseFor<Property> = updateProperty(propertyName, params, RequestOptions.none())

        /** @see updateProperty */
        @MustBeClosed
        fun updateProperty(
            propertyName: String,
            params: EventDefinitionUpdatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property> =
            updateProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see updateProperty */
        @MustBeClosed
        fun updateProperty(params: EventDefinitionUpdatePropertyParams): HttpResponseFor<Property> =
            updateProperty(params, RequestOptions.none())

        /** @see updateProperty */
        @MustBeClosed
        fun updateProperty(
            params: EventDefinitionUpdatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property>
    }
}
