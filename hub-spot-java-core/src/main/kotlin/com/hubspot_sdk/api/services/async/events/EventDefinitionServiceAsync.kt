// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.events

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.Property
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionCreateParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionCreatePropertyParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionDeleteParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionDeletePropertyParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionGetParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionListPageAsync
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionListParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionUpdateParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionUpdatePropertyParams
import com.hubspot_sdk.api.models.events.eventdefinitions.ExternalBehavioralEventTypeDefinition
import com.hubspot_sdk.api.models.events.eventdefinitions.ExternalBehavioralEventTypeDefinitionEgg
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EventDefinitionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventDefinitionServiceAsync

    /** Create a custom event definition. */
    fun create(
        params: EventDefinitionCreateParams
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EventDefinitionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition>

    /** @see create */
    fun create(
        externalBehavioralEventTypeDefinitionEgg: ExternalBehavioralEventTypeDefinitionEgg,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        create(
            EventDefinitionCreateParams.builder()
                .externalBehavioralEventTypeDefinitionEgg(externalBehavioralEventTypeDefinitionEgg)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        externalBehavioralEventTypeDefinitionEgg: ExternalBehavioralEventTypeDefinitionEgg
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        create(externalBehavioralEventTypeDefinitionEgg, RequestOptions.none())

    /** Update a specific custom event definition by name. */
    fun update(
        eventName: String,
        params: EventDefinitionUpdateParams,
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        update(eventName, params, RequestOptions.none())

    /** @see update */
    fun update(
        eventName: String,
        params: EventDefinitionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        update(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see update */
    fun update(
        params: EventDefinitionUpdateParams
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EventDefinitionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition>

    /** Retrieve existing custom event definitions. */
    fun list(): CompletableFuture<EventDefinitionListPageAsync> =
        list(EventDefinitionListParams.none())

    /** @see list */
    fun list(
        params: EventDefinitionListParams = EventDefinitionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventDefinitionListPageAsync>

    /** @see list */
    fun list(
        params: EventDefinitionListParams = EventDefinitionListParams.none()
    ): CompletableFuture<EventDefinitionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EventDefinitionListPageAsync> =
        list(EventDefinitionListParams.none(), requestOptions)

    /** Delete a custom event definition by name. */
    fun delete(eventName: String): CompletableFuture<Void?> =
        delete(eventName, EventDefinitionDeleteParams.none())

    /** @see delete */
    fun delete(
        eventName: String,
        params: EventDefinitionDeleteParams = EventDefinitionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see delete */
    fun delete(
        eventName: String,
        params: EventDefinitionDeleteParams = EventDefinitionDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(eventName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EventDefinitionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: EventDefinitionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(eventName: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(eventName, EventDefinitionDeleteParams.none(), requestOptions)

    /** Create a new property for an existing event definition. */
    fun createProperty(
        eventName: String,
        params: EventDefinitionCreatePropertyParams,
    ): CompletableFuture<Property> = createProperty(eventName, params, RequestOptions.none())

    /** @see createProperty */
    fun createProperty(
        eventName: String,
        params: EventDefinitionCreatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Property> =
        createProperty(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see createProperty */
    fun createProperty(params: EventDefinitionCreatePropertyParams): CompletableFuture<Property> =
        createProperty(params, RequestOptions.none())

    /** @see createProperty */
    fun createProperty(
        params: EventDefinitionCreatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Property>

    /** Delete an existing property from a custom event definition. */
    fun deleteProperty(
        propertyName: String,
        params: EventDefinitionDeletePropertyParams,
    ): CompletableFuture<Void?> = deleteProperty(propertyName, params, RequestOptions.none())

    /** @see deleteProperty */
    fun deleteProperty(
        propertyName: String,
        params: EventDefinitionDeletePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see deleteProperty */
    fun deleteProperty(params: EventDefinitionDeletePropertyParams): CompletableFuture<Void?> =
        deleteProperty(params, RequestOptions.none())

    /** @see deleteProperty */
    fun deleteProperty(
        params: EventDefinitionDeletePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Fetch a single custom event definition by name. */
    fun get(eventName: String): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        get(eventName, EventDefinitionGetParams.none())

    /** @see get */
    fun get(
        eventName: String,
        params: EventDefinitionGetParams = EventDefinitionGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        get(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see get */
    fun get(
        eventName: String,
        params: EventDefinitionGetParams = EventDefinitionGetParams.none(),
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        get(eventName, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: EventDefinitionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition>

    /** @see get */
    fun get(
        params: EventDefinitionGetParams
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        eventName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        get(eventName, EventDefinitionGetParams.none(), requestOptions)

    /** Update an existing property in a custom event definition. */
    fun updateProperty(
        propertyName: String,
        params: EventDefinitionUpdatePropertyParams,
    ): CompletableFuture<Property> = updateProperty(propertyName, params, RequestOptions.none())

    /** @see updateProperty */
    fun updateProperty(
        propertyName: String,
        params: EventDefinitionUpdatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Property> =
        updateProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see updateProperty */
    fun updateProperty(params: EventDefinitionUpdatePropertyParams): CompletableFuture<Property> =
        updateProperty(params, RequestOptions.none())

    /** @see updateProperty */
    fun updateProperty(
        params: EventDefinitionUpdatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Property>

    /**
     * A view of [EventDefinitionServiceAsync] that provides access to raw HTTP responses for each
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
        ): EventDefinitionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /events/v3/event-definitions`, but is otherwise the
         * same as [EventDefinitionServiceAsync.create].
         */
        fun create(
            params: EventDefinitionCreateParams
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EventDefinitionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>>

        /** @see create */
        fun create(
            externalBehavioralEventTypeDefinitionEgg: ExternalBehavioralEventTypeDefinitionEgg,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            create(
                EventDefinitionCreateParams.builder()
                    .externalBehavioralEventTypeDefinitionEgg(
                        externalBehavioralEventTypeDefinitionEgg
                    )
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            externalBehavioralEventTypeDefinitionEgg: ExternalBehavioralEventTypeDefinitionEgg
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            create(externalBehavioralEventTypeDefinitionEgg, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /events/v3/event-definitions/{eventName}`, but is
         * otherwise the same as [EventDefinitionServiceAsync.update].
         */
        fun update(
            eventName: String,
            params: EventDefinitionUpdateParams,
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            update(eventName, params, RequestOptions.none())

        /** @see update */
        fun update(
            eventName: String,
            params: EventDefinitionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            update(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see update */
        fun update(
            params: EventDefinitionUpdateParams
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: EventDefinitionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>>

        /**
         * Returns a raw HTTP response for `get /events/v3/event-definitions`, but is otherwise the
         * same as [EventDefinitionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EventDefinitionListPageAsync>> =
            list(EventDefinitionListParams.none())

        /** @see list */
        fun list(
            params: EventDefinitionListParams = EventDefinitionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventDefinitionListPageAsync>>

        /** @see list */
        fun list(
            params: EventDefinitionListParams = EventDefinitionListParams.none()
        ): CompletableFuture<HttpResponseFor<EventDefinitionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EventDefinitionListPageAsync>> =
            list(EventDefinitionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /events/v3/event-definitions/{eventName}`, but is
         * otherwise the same as [EventDefinitionServiceAsync.delete].
         */
        fun delete(eventName: String): CompletableFuture<HttpResponse> =
            delete(eventName, EventDefinitionDeleteParams.none())

        /** @see delete */
        fun delete(
            eventName: String,
            params: EventDefinitionDeleteParams = EventDefinitionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see delete */
        fun delete(
            eventName: String,
            params: EventDefinitionDeleteParams = EventDefinitionDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(eventName, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EventDefinitionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: EventDefinitionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            eventName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(eventName, EventDefinitionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /events/v3/event-definitions/{eventName}/property`,
         * but is otherwise the same as [EventDefinitionServiceAsync.createProperty].
         */
        fun createProperty(
            eventName: String,
            params: EventDefinitionCreatePropertyParams,
        ): CompletableFuture<HttpResponseFor<Property>> =
            createProperty(eventName, params, RequestOptions.none())

        /** @see createProperty */
        fun createProperty(
            eventName: String,
            params: EventDefinitionCreatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Property>> =
            createProperty(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see createProperty */
        fun createProperty(
            params: EventDefinitionCreatePropertyParams
        ): CompletableFuture<HttpResponseFor<Property>> =
            createProperty(params, RequestOptions.none())

        /** @see createProperty */
        fun createProperty(
            params: EventDefinitionCreatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Property>>

        /**
         * Returns a raw HTTP response for `delete
         * /events/v3/event-definitions/{eventName}/property/{propertyName}`, but is otherwise the
         * same as [EventDefinitionServiceAsync.deleteProperty].
         */
        fun deleteProperty(
            propertyName: String,
            params: EventDefinitionDeletePropertyParams,
        ): CompletableFuture<HttpResponse> =
            deleteProperty(propertyName, params, RequestOptions.none())

        /** @see deleteProperty */
        fun deleteProperty(
            propertyName: String,
            params: EventDefinitionDeletePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see deleteProperty */
        fun deleteProperty(
            params: EventDefinitionDeletePropertyParams
        ): CompletableFuture<HttpResponse> = deleteProperty(params, RequestOptions.none())

        /** @see deleteProperty */
        fun deleteProperty(
            params: EventDefinitionDeletePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /events/v3/event-definitions/{eventName}`, but is
         * otherwise the same as [EventDefinitionServiceAsync.get].
         */
        fun get(
            eventName: String
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            get(eventName, EventDefinitionGetParams.none())

        /** @see get */
        fun get(
            eventName: String,
            params: EventDefinitionGetParams = EventDefinitionGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            get(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see get */
        fun get(
            eventName: String,
            params: EventDefinitionGetParams = EventDefinitionGetParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            get(eventName, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: EventDefinitionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>>

        /** @see get */
        fun get(
            params: EventDefinitionGetParams
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            eventName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            get(eventName, EventDefinitionGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /events/v3/event-definitions/{eventName}/property/{propertyName}`, but is otherwise the
         * same as [EventDefinitionServiceAsync.updateProperty].
         */
        fun updateProperty(
            propertyName: String,
            params: EventDefinitionUpdatePropertyParams,
        ): CompletableFuture<HttpResponseFor<Property>> =
            updateProperty(propertyName, params, RequestOptions.none())

        /** @see updateProperty */
        fun updateProperty(
            propertyName: String,
            params: EventDefinitionUpdatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Property>> =
            updateProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see updateProperty */
        fun updateProperty(
            params: EventDefinitionUpdatePropertyParams
        ): CompletableFuture<HttpResponseFor<Property>> =
            updateProperty(params, RequestOptions.none())

        /** @see updateProperty */
        fun updateProperty(
            params: EventDefinitionUpdatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Property>>
    }
}
