// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.events

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.events.send.BatchedBehavioralEventHttpCompletionRequest
import com.hubspot_sdk.api.models.events.send.BehavioralEventHttpCompletionRequest
import com.hubspot_sdk.api.models.events.send.ExternalBehavioralEventTypeDefinition
import com.hubspot_sdk.api.models.events.send.ExternalBehavioralEventTypeDefinitionEgg
import com.hubspot_sdk.api.models.events.send.Property
import com.hubspot_sdk.api.models.events.send.SendCreateEventDefinitionParams
import com.hubspot_sdk.api.models.events.send.SendCreateEventDefinitionPropertyParams
import com.hubspot_sdk.api.models.events.send.SendDeleteEventDefinitionParams
import com.hubspot_sdk.api.models.events.send.SendDeleteEventDefinitionPropertyParams
import com.hubspot_sdk.api.models.events.send.SendGetEventDefinitionParams
import com.hubspot_sdk.api.models.events.send.SendListEventDefinitionsPageAsync
import com.hubspot_sdk.api.models.events.send.SendListEventDefinitionsParams
import com.hubspot_sdk.api.models.events.send.SendSendEventBatchParams
import com.hubspot_sdk.api.models.events.send.SendSendEventParams
import com.hubspot_sdk.api.models.events.send.SendUpdateEventDefinitionParams
import com.hubspot_sdk.api.models.events.send.SendUpdateEventDefinitionPropertyParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SendServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SendServiceAsync

    fun createEventDefinition(
        params: SendCreateEventDefinitionParams
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        createEventDefinition(params, RequestOptions.none())

    /** @see createEventDefinition */
    fun createEventDefinition(
        params: SendCreateEventDefinitionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition>

    /** @see createEventDefinition */
    fun createEventDefinition(
        externalBehavioralEventTypeDefinitionEgg: ExternalBehavioralEventTypeDefinitionEgg,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        createEventDefinition(
            SendCreateEventDefinitionParams.builder()
                .externalBehavioralEventTypeDefinitionEgg(externalBehavioralEventTypeDefinitionEgg)
                .build(),
            requestOptions,
        )

    /** @see createEventDefinition */
    fun createEventDefinition(
        externalBehavioralEventTypeDefinitionEgg: ExternalBehavioralEventTypeDefinitionEgg
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        createEventDefinition(externalBehavioralEventTypeDefinitionEgg, RequestOptions.none())

    fun createEventDefinitionProperty(
        eventName: String,
        params: SendCreateEventDefinitionPropertyParams,
    ): CompletableFuture<Property> =
        createEventDefinitionProperty(eventName, params, RequestOptions.none())

    /** @see createEventDefinitionProperty */
    fun createEventDefinitionProperty(
        eventName: String,
        params: SendCreateEventDefinitionPropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Property> =
        createEventDefinitionProperty(
            params.toBuilder().eventName(eventName).build(),
            requestOptions,
        )

    /** @see createEventDefinitionProperty */
    fun createEventDefinitionProperty(
        params: SendCreateEventDefinitionPropertyParams
    ): CompletableFuture<Property> = createEventDefinitionProperty(params, RequestOptions.none())

    /** @see createEventDefinitionProperty */
    fun createEventDefinitionProperty(
        params: SendCreateEventDefinitionPropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Property>

    fun deleteEventDefinition(eventName: String): CompletableFuture<Void?> =
        deleteEventDefinition(eventName, SendDeleteEventDefinitionParams.none())

    /** @see deleteEventDefinition */
    fun deleteEventDefinition(
        eventName: String,
        params: SendDeleteEventDefinitionParams = SendDeleteEventDefinitionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteEventDefinition(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see deleteEventDefinition */
    fun deleteEventDefinition(
        eventName: String,
        params: SendDeleteEventDefinitionParams = SendDeleteEventDefinitionParams.none(),
    ): CompletableFuture<Void?> = deleteEventDefinition(eventName, params, RequestOptions.none())

    /** @see deleteEventDefinition */
    fun deleteEventDefinition(
        params: SendDeleteEventDefinitionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteEventDefinition */
    fun deleteEventDefinition(params: SendDeleteEventDefinitionParams): CompletableFuture<Void?> =
        deleteEventDefinition(params, RequestOptions.none())

    /** @see deleteEventDefinition */
    fun deleteEventDefinition(
        eventName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        deleteEventDefinition(eventName, SendDeleteEventDefinitionParams.none(), requestOptions)

    fun deleteEventDefinitionProperty(
        propertyName: String,
        params: SendDeleteEventDefinitionPropertyParams,
    ): CompletableFuture<Void?> =
        deleteEventDefinitionProperty(propertyName, params, RequestOptions.none())

    /** @see deleteEventDefinitionProperty */
    fun deleteEventDefinitionProperty(
        propertyName: String,
        params: SendDeleteEventDefinitionPropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteEventDefinitionProperty(
            params.toBuilder().propertyName(propertyName).build(),
            requestOptions,
        )

    /** @see deleteEventDefinitionProperty */
    fun deleteEventDefinitionProperty(
        params: SendDeleteEventDefinitionPropertyParams
    ): CompletableFuture<Void?> = deleteEventDefinitionProperty(params, RequestOptions.none())

    /** @see deleteEventDefinitionProperty */
    fun deleteEventDefinitionProperty(
        params: SendDeleteEventDefinitionPropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    fun getEventDefinition(
        eventName: String
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        getEventDefinition(eventName, SendGetEventDefinitionParams.none())

    /** @see getEventDefinition */
    fun getEventDefinition(
        eventName: String,
        params: SendGetEventDefinitionParams = SendGetEventDefinitionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        getEventDefinition(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see getEventDefinition */
    fun getEventDefinition(
        eventName: String,
        params: SendGetEventDefinitionParams = SendGetEventDefinitionParams.none(),
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        getEventDefinition(eventName, params, RequestOptions.none())

    /** @see getEventDefinition */
    fun getEventDefinition(
        params: SendGetEventDefinitionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition>

    /** @see getEventDefinition */
    fun getEventDefinition(
        params: SendGetEventDefinitionParams
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        getEventDefinition(params, RequestOptions.none())

    /** @see getEventDefinition */
    fun getEventDefinition(
        eventName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        getEventDefinition(eventName, SendGetEventDefinitionParams.none(), requestOptions)

    fun listEventDefinitions(): CompletableFuture<SendListEventDefinitionsPageAsync> =
        listEventDefinitions(SendListEventDefinitionsParams.none())

    /** @see listEventDefinitions */
    fun listEventDefinitions(
        params: SendListEventDefinitionsParams = SendListEventDefinitionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SendListEventDefinitionsPageAsync>

    /** @see listEventDefinitions */
    fun listEventDefinitions(
        params: SendListEventDefinitionsParams = SendListEventDefinitionsParams.none()
    ): CompletableFuture<SendListEventDefinitionsPageAsync> =
        listEventDefinitions(params, RequestOptions.none())

    /** @see listEventDefinitions */
    fun listEventDefinitions(
        requestOptions: RequestOptions
    ): CompletableFuture<SendListEventDefinitionsPageAsync> =
        listEventDefinitions(SendListEventDefinitionsParams.none(), requestOptions)

    fun sendEvent(params: SendSendEventParams): CompletableFuture<Void?> =
        sendEvent(params, RequestOptions.none())

    /** @see sendEvent */
    fun sendEvent(
        params: SendSendEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see sendEvent */
    fun sendEvent(
        behavioralEventHttpCompletionRequest: BehavioralEventHttpCompletionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        sendEvent(
            SendSendEventParams.builder()
                .behavioralEventHttpCompletionRequest(behavioralEventHttpCompletionRequest)
                .build(),
            requestOptions,
        )

    /** @see sendEvent */
    fun sendEvent(
        behavioralEventHttpCompletionRequest: BehavioralEventHttpCompletionRequest
    ): CompletableFuture<Void?> =
        sendEvent(behavioralEventHttpCompletionRequest, RequestOptions.none())

    fun sendEventBatch(params: SendSendEventBatchParams): CompletableFuture<Void?> =
        sendEventBatch(params, RequestOptions.none())

    /** @see sendEventBatch */
    fun sendEventBatch(
        params: SendSendEventBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see sendEventBatch */
    fun sendEventBatch(
        batchedBehavioralEventHttpCompletionRequest: BatchedBehavioralEventHttpCompletionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        sendEventBatch(
            SendSendEventBatchParams.builder()
                .batchedBehavioralEventHttpCompletionRequest(
                    batchedBehavioralEventHttpCompletionRequest
                )
                .build(),
            requestOptions,
        )

    /** @see sendEventBatch */
    fun sendEventBatch(
        batchedBehavioralEventHttpCompletionRequest: BatchedBehavioralEventHttpCompletionRequest
    ): CompletableFuture<Void?> =
        sendEventBatch(batchedBehavioralEventHttpCompletionRequest, RequestOptions.none())

    fun updateEventDefinition(
        eventName: String,
        params: SendUpdateEventDefinitionParams,
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        updateEventDefinition(eventName, params, RequestOptions.none())

    /** @see updateEventDefinition */
    fun updateEventDefinition(
        eventName: String,
        params: SendUpdateEventDefinitionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        updateEventDefinition(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see updateEventDefinition */
    fun updateEventDefinition(
        params: SendUpdateEventDefinitionParams
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        updateEventDefinition(params, RequestOptions.none())

    /** @see updateEventDefinition */
    fun updateEventDefinition(
        params: SendUpdateEventDefinitionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition>

    fun updateEventDefinitionProperty(
        propertyName: String,
        params: SendUpdateEventDefinitionPropertyParams,
    ): CompletableFuture<Property> =
        updateEventDefinitionProperty(propertyName, params, RequestOptions.none())

    /** @see updateEventDefinitionProperty */
    fun updateEventDefinitionProperty(
        propertyName: String,
        params: SendUpdateEventDefinitionPropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Property> =
        updateEventDefinitionProperty(
            params.toBuilder().propertyName(propertyName).build(),
            requestOptions,
        )

    /** @see updateEventDefinitionProperty */
    fun updateEventDefinitionProperty(
        params: SendUpdateEventDefinitionPropertyParams
    ): CompletableFuture<Property> = updateEventDefinitionProperty(params, RequestOptions.none())

    /** @see updateEventDefinitionProperty */
    fun updateEventDefinitionProperty(
        params: SendUpdateEventDefinitionPropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Property>

    /** A view of [SendServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SendServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /events/custom/2026-03/event-definitions`, but is
         * otherwise the same as [SendServiceAsync.createEventDefinition].
         */
        fun createEventDefinition(
            params: SendCreateEventDefinitionParams
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            createEventDefinition(params, RequestOptions.none())

        /** @see createEventDefinition */
        fun createEventDefinition(
            params: SendCreateEventDefinitionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>>

        /** @see createEventDefinition */
        fun createEventDefinition(
            externalBehavioralEventTypeDefinitionEgg: ExternalBehavioralEventTypeDefinitionEgg,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            createEventDefinition(
                SendCreateEventDefinitionParams.builder()
                    .externalBehavioralEventTypeDefinitionEgg(
                        externalBehavioralEventTypeDefinitionEgg
                    )
                    .build(),
                requestOptions,
            )

        /** @see createEventDefinition */
        fun createEventDefinition(
            externalBehavioralEventTypeDefinitionEgg: ExternalBehavioralEventTypeDefinitionEgg
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            createEventDefinition(externalBehavioralEventTypeDefinitionEgg, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /events/custom/2026-03/event-definitions/{eventName}/property`, but is otherwise the same
         * as [SendServiceAsync.createEventDefinitionProperty].
         */
        fun createEventDefinitionProperty(
            eventName: String,
            params: SendCreateEventDefinitionPropertyParams,
        ): CompletableFuture<HttpResponseFor<Property>> =
            createEventDefinitionProperty(eventName, params, RequestOptions.none())

        /** @see createEventDefinitionProperty */
        fun createEventDefinitionProperty(
            eventName: String,
            params: SendCreateEventDefinitionPropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Property>> =
            createEventDefinitionProperty(
                params.toBuilder().eventName(eventName).build(),
                requestOptions,
            )

        /** @see createEventDefinitionProperty */
        fun createEventDefinitionProperty(
            params: SendCreateEventDefinitionPropertyParams
        ): CompletableFuture<HttpResponseFor<Property>> =
            createEventDefinitionProperty(params, RequestOptions.none())

        /** @see createEventDefinitionProperty */
        fun createEventDefinitionProperty(
            params: SendCreateEventDefinitionPropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Property>>

        /**
         * Returns a raw HTTP response for `delete
         * /events/custom/2026-03/event-definitions/{eventName}`, but is otherwise the same as
         * [SendServiceAsync.deleteEventDefinition].
         */
        fun deleteEventDefinition(eventName: String): CompletableFuture<HttpResponse> =
            deleteEventDefinition(eventName, SendDeleteEventDefinitionParams.none())

        /** @see deleteEventDefinition */
        fun deleteEventDefinition(
            eventName: String,
            params: SendDeleteEventDefinitionParams = SendDeleteEventDefinitionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteEventDefinition(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see deleteEventDefinition */
        fun deleteEventDefinition(
            eventName: String,
            params: SendDeleteEventDefinitionParams = SendDeleteEventDefinitionParams.none(),
        ): CompletableFuture<HttpResponse> =
            deleteEventDefinition(eventName, params, RequestOptions.none())

        /** @see deleteEventDefinition */
        fun deleteEventDefinition(
            params: SendDeleteEventDefinitionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteEventDefinition */
        fun deleteEventDefinition(
            params: SendDeleteEventDefinitionParams
        ): CompletableFuture<HttpResponse> = deleteEventDefinition(params, RequestOptions.none())

        /** @see deleteEventDefinition */
        fun deleteEventDefinition(
            eventName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteEventDefinition(eventName, SendDeleteEventDefinitionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /events/custom/2026-03/event-definitions/{eventName}/property/{propertyName}`, but is
         * otherwise the same as [SendServiceAsync.deleteEventDefinitionProperty].
         */
        fun deleteEventDefinitionProperty(
            propertyName: String,
            params: SendDeleteEventDefinitionPropertyParams,
        ): CompletableFuture<HttpResponse> =
            deleteEventDefinitionProperty(propertyName, params, RequestOptions.none())

        /** @see deleteEventDefinitionProperty */
        fun deleteEventDefinitionProperty(
            propertyName: String,
            params: SendDeleteEventDefinitionPropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteEventDefinitionProperty(
                params.toBuilder().propertyName(propertyName).build(),
                requestOptions,
            )

        /** @see deleteEventDefinitionProperty */
        fun deleteEventDefinitionProperty(
            params: SendDeleteEventDefinitionPropertyParams
        ): CompletableFuture<HttpResponse> =
            deleteEventDefinitionProperty(params, RequestOptions.none())

        /** @see deleteEventDefinitionProperty */
        fun deleteEventDefinitionProperty(
            params: SendDeleteEventDefinitionPropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /events/custom/2026-03/event-definitions/{eventName}`, but is otherwise the same as
         * [SendServiceAsync.getEventDefinition].
         */
        fun getEventDefinition(
            eventName: String
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            getEventDefinition(eventName, SendGetEventDefinitionParams.none())

        /** @see getEventDefinition */
        fun getEventDefinition(
            eventName: String,
            params: SendGetEventDefinitionParams = SendGetEventDefinitionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            getEventDefinition(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see getEventDefinition */
        fun getEventDefinition(
            eventName: String,
            params: SendGetEventDefinitionParams = SendGetEventDefinitionParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            getEventDefinition(eventName, params, RequestOptions.none())

        /** @see getEventDefinition */
        fun getEventDefinition(
            params: SendGetEventDefinitionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>>

        /** @see getEventDefinition */
        fun getEventDefinition(
            params: SendGetEventDefinitionParams
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            getEventDefinition(params, RequestOptions.none())

        /** @see getEventDefinition */
        fun getEventDefinition(
            eventName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            getEventDefinition(eventName, SendGetEventDefinitionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /events/custom/2026-03/event-definitions`, but is
         * otherwise the same as [SendServiceAsync.listEventDefinitions].
         */
        fun listEventDefinitions():
            CompletableFuture<HttpResponseFor<SendListEventDefinitionsPageAsync>> =
            listEventDefinitions(SendListEventDefinitionsParams.none())

        /** @see listEventDefinitions */
        fun listEventDefinitions(
            params: SendListEventDefinitionsParams = SendListEventDefinitionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SendListEventDefinitionsPageAsync>>

        /** @see listEventDefinitions */
        fun listEventDefinitions(
            params: SendListEventDefinitionsParams = SendListEventDefinitionsParams.none()
        ): CompletableFuture<HttpResponseFor<SendListEventDefinitionsPageAsync>> =
            listEventDefinitions(params, RequestOptions.none())

        /** @see listEventDefinitions */
        fun listEventDefinitions(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SendListEventDefinitionsPageAsync>> =
            listEventDefinitions(SendListEventDefinitionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /events/custom/2026-03/send`, but is otherwise the
         * same as [SendServiceAsync.sendEvent].
         */
        fun sendEvent(params: SendSendEventParams): CompletableFuture<HttpResponse> =
            sendEvent(params, RequestOptions.none())

        /** @see sendEvent */
        fun sendEvent(
            params: SendSendEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see sendEvent */
        fun sendEvent(
            behavioralEventHttpCompletionRequest: BehavioralEventHttpCompletionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            sendEvent(
                SendSendEventParams.builder()
                    .behavioralEventHttpCompletionRequest(behavioralEventHttpCompletionRequest)
                    .build(),
                requestOptions,
            )

        /** @see sendEvent */
        fun sendEvent(
            behavioralEventHttpCompletionRequest: BehavioralEventHttpCompletionRequest
        ): CompletableFuture<HttpResponse> =
            sendEvent(behavioralEventHttpCompletionRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /events/custom/2026-03/send/batch`, but is
         * otherwise the same as [SendServiceAsync.sendEventBatch].
         */
        fun sendEventBatch(params: SendSendEventBatchParams): CompletableFuture<HttpResponse> =
            sendEventBatch(params, RequestOptions.none())

        /** @see sendEventBatch */
        fun sendEventBatch(
            params: SendSendEventBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see sendEventBatch */
        fun sendEventBatch(
            batchedBehavioralEventHttpCompletionRequest:
                BatchedBehavioralEventHttpCompletionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            sendEventBatch(
                SendSendEventBatchParams.builder()
                    .batchedBehavioralEventHttpCompletionRequest(
                        batchedBehavioralEventHttpCompletionRequest
                    )
                    .build(),
                requestOptions,
            )

        /** @see sendEventBatch */
        fun sendEventBatch(
            batchedBehavioralEventHttpCompletionRequest: BatchedBehavioralEventHttpCompletionRequest
        ): CompletableFuture<HttpResponse> =
            sendEventBatch(batchedBehavioralEventHttpCompletionRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch
         * /events/custom/2026-03/event-definitions/{eventName}`, but is otherwise the same as
         * [SendServiceAsync.updateEventDefinition].
         */
        fun updateEventDefinition(
            eventName: String,
            params: SendUpdateEventDefinitionParams,
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            updateEventDefinition(eventName, params, RequestOptions.none())

        /** @see updateEventDefinition */
        fun updateEventDefinition(
            eventName: String,
            params: SendUpdateEventDefinitionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            updateEventDefinition(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see updateEventDefinition */
        fun updateEventDefinition(
            params: SendUpdateEventDefinitionParams
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> =
            updateEventDefinition(params, RequestOptions.none())

        /** @see updateEventDefinition */
        fun updateEventDefinition(
            params: SendUpdateEventDefinitionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>>

        /**
         * Returns a raw HTTP response for `patch
         * /events/custom/2026-03/event-definitions/{eventName}/property/{propertyName}`, but is
         * otherwise the same as [SendServiceAsync.updateEventDefinitionProperty].
         */
        fun updateEventDefinitionProperty(
            propertyName: String,
            params: SendUpdateEventDefinitionPropertyParams,
        ): CompletableFuture<HttpResponseFor<Property>> =
            updateEventDefinitionProperty(propertyName, params, RequestOptions.none())

        /** @see updateEventDefinitionProperty */
        fun updateEventDefinitionProperty(
            propertyName: String,
            params: SendUpdateEventDefinitionPropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Property>> =
            updateEventDefinitionProperty(
                params.toBuilder().propertyName(propertyName).build(),
                requestOptions,
            )

        /** @see updateEventDefinitionProperty */
        fun updateEventDefinitionProperty(
            params: SendUpdateEventDefinitionPropertyParams
        ): CompletableFuture<HttpResponseFor<Property>> =
            updateEventDefinitionProperty(params, RequestOptions.none())

        /** @see updateEventDefinitionProperty */
        fun updateEventDefinitionProperty(
            params: SendUpdateEventDefinitionPropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Property>>
    }
}
