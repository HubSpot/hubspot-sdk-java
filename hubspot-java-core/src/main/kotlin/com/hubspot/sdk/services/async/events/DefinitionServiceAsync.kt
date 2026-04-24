// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.events

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.BaseProperty
import com.hubspot.sdk.models.events.BatchedBehavioralEventHttpCompletionRequest
import com.hubspot.sdk.models.events.definitions.DefinitionCreateParams
import com.hubspot.sdk.models.events.definitions.DefinitionCreatePropertyParams
import com.hubspot.sdk.models.events.definitions.DefinitionDeleteParams
import com.hubspot.sdk.models.events.definitions.DefinitionDeletePropertyParams
import com.hubspot.sdk.models.events.definitions.DefinitionGetParams
import com.hubspot.sdk.models.events.definitions.DefinitionListPageAsync
import com.hubspot.sdk.models.events.definitions.DefinitionListParams
import com.hubspot.sdk.models.events.definitions.DefinitionSendBatchParams
import com.hubspot.sdk.models.events.definitions.DefinitionUpdateParams
import com.hubspot.sdk.models.events.definitions.DefinitionUpdatePropertyParams
import com.hubspot.sdk.models.events.definitions.ExternalBehavioralEventTypeDefinition
import com.hubspot.sdk.models.events.definitions.ExternalBehavioralEventTypeDefinitionEgg
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DefinitionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DefinitionServiceAsync

    /** Create a custom event definition. */
    fun create(
        params: DefinitionCreateParams
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DefinitionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition>

    /** @see create */
    fun create(
        externalBehavioralEventTypeDefinitionEgg: ExternalBehavioralEventTypeDefinitionEgg,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        create(
            DefinitionCreateParams.builder()
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
        params: DefinitionUpdateParams,
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        update(eventName, params, RequestOptions.none())

    /** @see update */
    fun update(
        eventName: String,
        params: DefinitionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        update(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see update */
    fun update(
        params: DefinitionUpdateParams
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DefinitionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition>

    /** Retrieve existing custom event definitions. */
    fun list(): CompletableFuture<DefinitionListPageAsync> = list(DefinitionListParams.none())

    /** @see list */
    fun list(
        params: DefinitionListParams = DefinitionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DefinitionListPageAsync>

    /** @see list */
    fun list(
        params: DefinitionListParams = DefinitionListParams.none()
    ): CompletableFuture<DefinitionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DefinitionListPageAsync> =
        list(DefinitionListParams.none(), requestOptions)

    /** Delete a custom event definition by name. */
    fun delete(eventName: String): CompletableFuture<Void?> =
        delete(eventName, DefinitionDeleteParams.none())

    /** @see delete */
    fun delete(
        eventName: String,
        params: DefinitionDeleteParams = DefinitionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see delete */
    fun delete(
        eventName: String,
        params: DefinitionDeleteParams = DefinitionDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(eventName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DefinitionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: DefinitionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(eventName: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(eventName, DefinitionDeleteParams.none(), requestOptions)

    /** Create a new property for an existing event definition. */
    fun createProperty(
        eventName: String,
        params: DefinitionCreatePropertyParams,
    ): CompletableFuture<BaseProperty> = createProperty(eventName, params, RequestOptions.none())

    /** @see createProperty */
    fun createProperty(
        eventName: String,
        params: DefinitionCreatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BaseProperty> =
        createProperty(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see createProperty */
    fun createProperty(params: DefinitionCreatePropertyParams): CompletableFuture<BaseProperty> =
        createProperty(params, RequestOptions.none())

    /** @see createProperty */
    fun createProperty(
        params: DefinitionCreatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BaseProperty>

    /** Delete an existing property from a custom event definition. */
    fun deleteProperty(
        propertyName: String,
        params: DefinitionDeletePropertyParams,
    ): CompletableFuture<Void?> = deleteProperty(propertyName, params, RequestOptions.none())

    /** @see deleteProperty */
    fun deleteProperty(
        propertyName: String,
        params: DefinitionDeletePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see deleteProperty */
    fun deleteProperty(params: DefinitionDeletePropertyParams): CompletableFuture<Void?> =
        deleteProperty(params, RequestOptions.none())

    /** @see deleteProperty */
    fun deleteProperty(
        params: DefinitionDeletePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Fetch a single custom event definition by name. */
    fun get(eventName: String): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        get(eventName, DefinitionGetParams.none())

    /** @see get */
    fun get(
        eventName: String,
        params: DefinitionGetParams = DefinitionGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        get(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see get */
    fun get(
        eventName: String,
        params: DefinitionGetParams = DefinitionGetParams.none(),
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        get(eventName, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DefinitionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition>

    /** @see get */
    fun get(params: DefinitionGetParams): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        eventName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        get(eventName, DefinitionGetParams.none(), requestOptions)

    /** Send multiple event occurrences at once. */
    fun sendBatch(params: DefinitionSendBatchParams): CompletableFuture<Void?> =
        sendBatch(params, RequestOptions.none())

    /** @see sendBatch */
    fun sendBatch(
        params: DefinitionSendBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see sendBatch */
    fun sendBatch(
        batchedBehavioralEventHttpCompletionRequest: BatchedBehavioralEventHttpCompletionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        sendBatch(
            DefinitionSendBatchParams.builder()
                .batchedBehavioralEventHttpCompletionRequest(
                    batchedBehavioralEventHttpCompletionRequest
                )
                .build(),
            requestOptions,
        )

    /** @see sendBatch */
    fun sendBatch(
        batchedBehavioralEventHttpCompletionRequest: BatchedBehavioralEventHttpCompletionRequest
    ): CompletableFuture<Void?> =
        sendBatch(batchedBehavioralEventHttpCompletionRequest, RequestOptions.none())

    /** Update an existing property in a custom event definition. */
    fun updateProperty(
        propertyName: String,
        params: DefinitionUpdatePropertyParams,
    ): CompletableFuture<BaseProperty> = updateProperty(propertyName, params, RequestOptions.none())

    /** @see updateProperty */
    fun updateProperty(
        propertyName: String,
        params: DefinitionUpdatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BaseProperty> =
        updateProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see updateProperty */
    fun updateProperty(params: DefinitionUpdatePropertyParams): CompletableFuture<BaseProperty> =
        updateProperty(params, RequestOptions.none())

    /** @see updateProperty */
    fun updateProperty(
        params: DefinitionUpdatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BaseProperty>

    /**
     * A view of [DefinitionServiceAsync] that provides access to raw HTTP responses for each
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
        ): DefinitionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /events/2026-03/event-definitions`, but is
         * otherwise the same as [DefinitionServiceAsync.create].
         */
        fun create(
            params: DefinitionCreateParams
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DefinitionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>>

        /** @see create */
        fun create(
            externalBehavioralEventTypeDefinitionEgg: ExternalBehavioralEventTypeDefinitionEgg,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            create(
                DefinitionCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /events/2026-03/event-definitions/{eventName}`,
         * but is otherwise the same as [DefinitionServiceAsync.update].
         */
        fun update(
            eventName: String,
            params: DefinitionUpdateParams,
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            update(eventName, params, RequestOptions.none())

        /** @see update */
        fun update(
            eventName: String,
            params: DefinitionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            update(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see update */
        fun update(
            params: DefinitionUpdateParams
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DefinitionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>>

        /**
         * Returns a raw HTTP response for `get /events/2026-03/event-definitions`, but is otherwise
         * the same as [DefinitionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DefinitionListPageAsync>> =
            list(DefinitionListParams.none())

        /** @see list */
        fun list(
            params: DefinitionListParams = DefinitionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DefinitionListPageAsync>>

        /** @see list */
        fun list(
            params: DefinitionListParams = DefinitionListParams.none()
        ): CompletableFuture<HttpResponseFor<DefinitionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DefinitionListPageAsync>> =
            list(DefinitionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /events/2026-03/event-definitions/{eventName}`,
         * but is otherwise the same as [DefinitionServiceAsync.delete].
         */
        fun delete(eventName: String): CompletableFuture<HttpResponse> =
            delete(eventName, DefinitionDeleteParams.none())

        /** @see delete */
        fun delete(
            eventName: String,
            params: DefinitionDeleteParams = DefinitionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see delete */
        fun delete(
            eventName: String,
            params: DefinitionDeleteParams = DefinitionDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(eventName, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DefinitionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: DefinitionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            eventName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(eventName, DefinitionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /events/2026-03/event-definitions/{eventName}/property`, but is otherwise the same as
         * [DefinitionServiceAsync.createProperty].
         */
        fun createProperty(
            eventName: String,
            params: DefinitionCreatePropertyParams,
        ): CompletableFuture<HttpResponseFor<BaseProperty>> =
            createProperty(eventName, params, RequestOptions.none())

        /** @see createProperty */
        fun createProperty(
            eventName: String,
            params: DefinitionCreatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BaseProperty>> =
            createProperty(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see createProperty */
        fun createProperty(
            params: DefinitionCreatePropertyParams
        ): CompletableFuture<HttpResponseFor<BaseProperty>> =
            createProperty(params, RequestOptions.none())

        /** @see createProperty */
        fun createProperty(
            params: DefinitionCreatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BaseProperty>>

        /**
         * Returns a raw HTTP response for `delete
         * /events/2026-03/event-definitions/{eventName}/property/{propertyName}`, but is otherwise
         * the same as [DefinitionServiceAsync.deleteProperty].
         */
        fun deleteProperty(
            propertyName: String,
            params: DefinitionDeletePropertyParams,
        ): CompletableFuture<HttpResponse> =
            deleteProperty(propertyName, params, RequestOptions.none())

        /** @see deleteProperty */
        fun deleteProperty(
            propertyName: String,
            params: DefinitionDeletePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see deleteProperty */
        fun deleteProperty(
            params: DefinitionDeletePropertyParams
        ): CompletableFuture<HttpResponse> = deleteProperty(params, RequestOptions.none())

        /** @see deleteProperty */
        fun deleteProperty(
            params: DefinitionDeletePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /events/2026-03/event-definitions/{eventName}`, but
         * is otherwise the same as [DefinitionServiceAsync.get].
         */
        fun get(
            eventName: String
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            get(eventName, DefinitionGetParams.none())

        /** @see get */
        fun get(
            eventName: String,
            params: DefinitionGetParams = DefinitionGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            get(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see get */
        fun get(
            eventName: String,
            params: DefinitionGetParams = DefinitionGetParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            get(eventName, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: DefinitionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>>

        /** @see get */
        fun get(
            params: DefinitionGetParams
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            eventName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            get(eventName, DefinitionGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /events/2026-03/send/batch`, but is otherwise the
         * same as [DefinitionServiceAsync.sendBatch].
         */
        fun sendBatch(params: DefinitionSendBatchParams): CompletableFuture<HttpResponse> =
            sendBatch(params, RequestOptions.none())

        /** @see sendBatch */
        fun sendBatch(
            params: DefinitionSendBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see sendBatch */
        fun sendBatch(
            batchedBehavioralEventHttpCompletionRequest:
                BatchedBehavioralEventHttpCompletionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            sendBatch(
                DefinitionSendBatchParams.builder()
                    .batchedBehavioralEventHttpCompletionRequest(
                        batchedBehavioralEventHttpCompletionRequest
                    )
                    .build(),
                requestOptions,
            )

        /** @see sendBatch */
        fun sendBatch(
            batchedBehavioralEventHttpCompletionRequest: BatchedBehavioralEventHttpCompletionRequest
        ): CompletableFuture<HttpResponse> =
            sendBatch(batchedBehavioralEventHttpCompletionRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch
         * /events/2026-03/event-definitions/{eventName}/property/{propertyName}`, but is otherwise
         * the same as [DefinitionServiceAsync.updateProperty].
         */
        fun updateProperty(
            propertyName: String,
            params: DefinitionUpdatePropertyParams,
        ): CompletableFuture<HttpResponseFor<BaseProperty>> =
            updateProperty(propertyName, params, RequestOptions.none())

        /** @see updateProperty */
        fun updateProperty(
            propertyName: String,
            params: DefinitionUpdatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BaseProperty>> =
            updateProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see updateProperty */
        fun updateProperty(
            params: DefinitionUpdatePropertyParams
        ): CompletableFuture<HttpResponseFor<BaseProperty>> =
            updateProperty(params, RequestOptions.none())

        /** @see updateProperty */
        fun updateProperty(
            params: DefinitionUpdatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BaseProperty>>
    }
}
