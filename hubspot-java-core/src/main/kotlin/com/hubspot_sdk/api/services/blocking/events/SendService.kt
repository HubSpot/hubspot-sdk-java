// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.events

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.Property
import com.hubspot_sdk.api.models.events.BatchedBehavioralEventHttpCompletionRequest
import com.hubspot_sdk.api.models.events.BehavioralEventHttpCompletionRequest
import com.hubspot_sdk.api.models.events.ExternalBehavioralEventTypeDefinition
import com.hubspot_sdk.api.models.events.ExternalBehavioralEventTypeDefinitionEgg
import com.hubspot_sdk.api.models.events.send.SendCreateEventDefinitionParams
import com.hubspot_sdk.api.models.events.send.SendCreateEventDefinitionPropertyParams
import com.hubspot_sdk.api.models.events.send.SendDeleteEventDefinitionParams
import com.hubspot_sdk.api.models.events.send.SendDeleteEventDefinitionPropertyParams
import com.hubspot_sdk.api.models.events.send.SendGetEventDefinitionParams
import com.hubspot_sdk.api.models.events.send.SendListEventDefinitionsPage
import com.hubspot_sdk.api.models.events.send.SendListEventDefinitionsParams
import com.hubspot_sdk.api.models.events.send.SendSendEventBatchParams
import com.hubspot_sdk.api.models.events.send.SendSendEventParams
import com.hubspot_sdk.api.models.events.send.SendUpdateEventDefinitionParams
import com.hubspot_sdk.api.models.events.send.SendUpdateEventDefinitionPropertyParams
import java.util.function.Consumer

interface SendService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SendService

    fun createEventDefinition(
        params: SendCreateEventDefinitionParams
    ): ExternalBehavioralEventTypeDefinition = createEventDefinition(params, RequestOptions.none())

    /** @see createEventDefinition */
    fun createEventDefinition(
        params: SendCreateEventDefinitionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBehavioralEventTypeDefinition

    /** @see createEventDefinition */
    fun createEventDefinition(
        externalBehavioralEventTypeDefinitionEgg: ExternalBehavioralEventTypeDefinitionEgg,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBehavioralEventTypeDefinition =
        createEventDefinition(
            SendCreateEventDefinitionParams.builder()
                .externalBehavioralEventTypeDefinitionEgg(externalBehavioralEventTypeDefinitionEgg)
                .build(),
            requestOptions,
        )

    /** @see createEventDefinition */
    fun createEventDefinition(
        externalBehavioralEventTypeDefinitionEgg: ExternalBehavioralEventTypeDefinitionEgg
    ): ExternalBehavioralEventTypeDefinition =
        createEventDefinition(externalBehavioralEventTypeDefinitionEgg, RequestOptions.none())

    fun createEventDefinitionProperty(
        eventName: String,
        params: SendCreateEventDefinitionPropertyParams,
    ): Property = createEventDefinitionProperty(eventName, params, RequestOptions.none())

    /** @see createEventDefinitionProperty */
    fun createEventDefinitionProperty(
        eventName: String,
        params: SendCreateEventDefinitionPropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property =
        createEventDefinitionProperty(
            params.toBuilder().eventName(eventName).build(),
            requestOptions,
        )

    /** @see createEventDefinitionProperty */
    fun createEventDefinitionProperty(params: SendCreateEventDefinitionPropertyParams): Property =
        createEventDefinitionProperty(params, RequestOptions.none())

    /** @see createEventDefinitionProperty */
    fun createEventDefinitionProperty(
        params: SendCreateEventDefinitionPropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property

    fun deleteEventDefinition(eventName: String) =
        deleteEventDefinition(eventName, SendDeleteEventDefinitionParams.none())

    /** @see deleteEventDefinition */
    fun deleteEventDefinition(
        eventName: String,
        params: SendDeleteEventDefinitionParams = SendDeleteEventDefinitionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteEventDefinition(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see deleteEventDefinition */
    fun deleteEventDefinition(
        eventName: String,
        params: SendDeleteEventDefinitionParams = SendDeleteEventDefinitionParams.none(),
    ) = deleteEventDefinition(eventName, params, RequestOptions.none())

    /** @see deleteEventDefinition */
    fun deleteEventDefinition(
        params: SendDeleteEventDefinitionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteEventDefinition */
    fun deleteEventDefinition(params: SendDeleteEventDefinitionParams) =
        deleteEventDefinition(params, RequestOptions.none())

    /** @see deleteEventDefinition */
    fun deleteEventDefinition(eventName: String, requestOptions: RequestOptions) =
        deleteEventDefinition(eventName, SendDeleteEventDefinitionParams.none(), requestOptions)

    fun deleteEventDefinitionProperty(
        propertyName: String,
        params: SendDeleteEventDefinitionPropertyParams,
    ) = deleteEventDefinitionProperty(propertyName, params, RequestOptions.none())

    /** @see deleteEventDefinitionProperty */
    fun deleteEventDefinitionProperty(
        propertyName: String,
        params: SendDeleteEventDefinitionPropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteEventDefinitionProperty(
            params.toBuilder().propertyName(propertyName).build(),
            requestOptions,
        )

    /** @see deleteEventDefinitionProperty */
    fun deleteEventDefinitionProperty(params: SendDeleteEventDefinitionPropertyParams) =
        deleteEventDefinitionProperty(params, RequestOptions.none())

    /** @see deleteEventDefinitionProperty */
    fun deleteEventDefinitionProperty(
        params: SendDeleteEventDefinitionPropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    fun getEventDefinition(eventName: String): ExternalBehavioralEventTypeDefinition =
        getEventDefinition(eventName, SendGetEventDefinitionParams.none())

    /** @see getEventDefinition */
    fun getEventDefinition(
        eventName: String,
        params: SendGetEventDefinitionParams = SendGetEventDefinitionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBehavioralEventTypeDefinition =
        getEventDefinition(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see getEventDefinition */
    fun getEventDefinition(
        eventName: String,
        params: SendGetEventDefinitionParams = SendGetEventDefinitionParams.none(),
    ): ExternalBehavioralEventTypeDefinition =
        getEventDefinition(eventName, params, RequestOptions.none())

    /** @see getEventDefinition */
    fun getEventDefinition(
        params: SendGetEventDefinitionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBehavioralEventTypeDefinition

    /** @see getEventDefinition */
    fun getEventDefinition(
        params: SendGetEventDefinitionParams
    ): ExternalBehavioralEventTypeDefinition = getEventDefinition(params, RequestOptions.none())

    /** @see getEventDefinition */
    fun getEventDefinition(
        eventName: String,
        requestOptions: RequestOptions,
    ): ExternalBehavioralEventTypeDefinition =
        getEventDefinition(eventName, SendGetEventDefinitionParams.none(), requestOptions)

    fun listEventDefinitions(): SendListEventDefinitionsPage =
        listEventDefinitions(SendListEventDefinitionsParams.none())

    /** @see listEventDefinitions */
    fun listEventDefinitions(
        params: SendListEventDefinitionsParams = SendListEventDefinitionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SendListEventDefinitionsPage

    /** @see listEventDefinitions */
    fun listEventDefinitions(
        params: SendListEventDefinitionsParams = SendListEventDefinitionsParams.none()
    ): SendListEventDefinitionsPage = listEventDefinitions(params, RequestOptions.none())

    /** @see listEventDefinitions */
    fun listEventDefinitions(requestOptions: RequestOptions): SendListEventDefinitionsPage =
        listEventDefinitions(SendListEventDefinitionsParams.none(), requestOptions)

    fun sendEvent(params: SendSendEventParams) = sendEvent(params, RequestOptions.none())

    /** @see sendEvent */
    fun sendEvent(
        params: SendSendEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see sendEvent */
    fun sendEvent(
        behavioralEventHttpCompletionRequest: BehavioralEventHttpCompletionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        sendEvent(
            SendSendEventParams.builder()
                .behavioralEventHttpCompletionRequest(behavioralEventHttpCompletionRequest)
                .build(),
            requestOptions,
        )

    /** @see sendEvent */
    fun sendEvent(behavioralEventHttpCompletionRequest: BehavioralEventHttpCompletionRequest) =
        sendEvent(behavioralEventHttpCompletionRequest, RequestOptions.none())

    fun sendEventBatch(params: SendSendEventBatchParams) =
        sendEventBatch(params, RequestOptions.none())

    /** @see sendEventBatch */
    fun sendEventBatch(
        params: SendSendEventBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see sendEventBatch */
    fun sendEventBatch(
        batchedBehavioralEventHttpCompletionRequest: BatchedBehavioralEventHttpCompletionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
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
    ) = sendEventBatch(batchedBehavioralEventHttpCompletionRequest, RequestOptions.none())

    fun updateEventDefinition(
        eventName: String,
        params: SendUpdateEventDefinitionParams,
    ): ExternalBehavioralEventTypeDefinition =
        updateEventDefinition(eventName, params, RequestOptions.none())

    /** @see updateEventDefinition */
    fun updateEventDefinition(
        eventName: String,
        params: SendUpdateEventDefinitionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBehavioralEventTypeDefinition =
        updateEventDefinition(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see updateEventDefinition */
    fun updateEventDefinition(
        params: SendUpdateEventDefinitionParams
    ): ExternalBehavioralEventTypeDefinition = updateEventDefinition(params, RequestOptions.none())

    /** @see updateEventDefinition */
    fun updateEventDefinition(
        params: SendUpdateEventDefinitionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBehavioralEventTypeDefinition

    fun updateEventDefinitionProperty(
        propertyName: String,
        params: SendUpdateEventDefinitionPropertyParams,
    ): Property = updateEventDefinitionProperty(propertyName, params, RequestOptions.none())

    /** @see updateEventDefinitionProperty */
    fun updateEventDefinitionProperty(
        propertyName: String,
        params: SendUpdateEventDefinitionPropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property =
        updateEventDefinitionProperty(
            params.toBuilder().propertyName(propertyName).build(),
            requestOptions,
        )

    /** @see updateEventDefinitionProperty */
    fun updateEventDefinitionProperty(params: SendUpdateEventDefinitionPropertyParams): Property =
        updateEventDefinitionProperty(params, RequestOptions.none())

    /** @see updateEventDefinitionProperty */
    fun updateEventDefinitionProperty(
        params: SendUpdateEventDefinitionPropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property

    /** A view of [SendService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SendService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /events/custom/2026-03/event-definitions`, but is
         * otherwise the same as [SendService.createEventDefinition].
         */
        @MustBeClosed
        fun createEventDefinition(
            params: SendCreateEventDefinitionParams
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            createEventDefinition(params, RequestOptions.none())

        /** @see createEventDefinition */
        @MustBeClosed
        fun createEventDefinition(
            params: SendCreateEventDefinitionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition>

        /** @see createEventDefinition */
        @MustBeClosed
        fun createEventDefinition(
            externalBehavioralEventTypeDefinitionEgg: ExternalBehavioralEventTypeDefinitionEgg,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            createEventDefinition(
                SendCreateEventDefinitionParams.builder()
                    .externalBehavioralEventTypeDefinitionEgg(
                        externalBehavioralEventTypeDefinitionEgg
                    )
                    .build(),
                requestOptions,
            )

        /** @see createEventDefinition */
        @MustBeClosed
        fun createEventDefinition(
            externalBehavioralEventTypeDefinitionEgg: ExternalBehavioralEventTypeDefinitionEgg
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            createEventDefinition(externalBehavioralEventTypeDefinitionEgg, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /events/custom/2026-03/event-definitions/{eventName}/property`, but is otherwise the same
         * as [SendService.createEventDefinitionProperty].
         */
        @MustBeClosed
        fun createEventDefinitionProperty(
            eventName: String,
            params: SendCreateEventDefinitionPropertyParams,
        ): HttpResponseFor<Property> =
            createEventDefinitionProperty(eventName, params, RequestOptions.none())

        /** @see createEventDefinitionProperty */
        @MustBeClosed
        fun createEventDefinitionProperty(
            eventName: String,
            params: SendCreateEventDefinitionPropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property> =
            createEventDefinitionProperty(
                params.toBuilder().eventName(eventName).build(),
                requestOptions,
            )

        /** @see createEventDefinitionProperty */
        @MustBeClosed
        fun createEventDefinitionProperty(
            params: SendCreateEventDefinitionPropertyParams
        ): HttpResponseFor<Property> = createEventDefinitionProperty(params, RequestOptions.none())

        /** @see createEventDefinitionProperty */
        @MustBeClosed
        fun createEventDefinitionProperty(
            params: SendCreateEventDefinitionPropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property>

        /**
         * Returns a raw HTTP response for `delete
         * /events/custom/2026-03/event-definitions/{eventName}`, but is otherwise the same as
         * [SendService.deleteEventDefinition].
         */
        @MustBeClosed
        fun deleteEventDefinition(eventName: String): HttpResponse =
            deleteEventDefinition(eventName, SendDeleteEventDefinitionParams.none())

        /** @see deleteEventDefinition */
        @MustBeClosed
        fun deleteEventDefinition(
            eventName: String,
            params: SendDeleteEventDefinitionParams = SendDeleteEventDefinitionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteEventDefinition(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see deleteEventDefinition */
        @MustBeClosed
        fun deleteEventDefinition(
            eventName: String,
            params: SendDeleteEventDefinitionParams = SendDeleteEventDefinitionParams.none(),
        ): HttpResponse = deleteEventDefinition(eventName, params, RequestOptions.none())

        /** @see deleteEventDefinition */
        @MustBeClosed
        fun deleteEventDefinition(
            params: SendDeleteEventDefinitionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteEventDefinition */
        @MustBeClosed
        fun deleteEventDefinition(params: SendDeleteEventDefinitionParams): HttpResponse =
            deleteEventDefinition(params, RequestOptions.none())

        /** @see deleteEventDefinition */
        @MustBeClosed
        fun deleteEventDefinition(eventName: String, requestOptions: RequestOptions): HttpResponse =
            deleteEventDefinition(eventName, SendDeleteEventDefinitionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /events/custom/2026-03/event-definitions/{eventName}/property/{propertyName}`, but is
         * otherwise the same as [SendService.deleteEventDefinitionProperty].
         */
        @MustBeClosed
        fun deleteEventDefinitionProperty(
            propertyName: String,
            params: SendDeleteEventDefinitionPropertyParams,
        ): HttpResponse = deleteEventDefinitionProperty(propertyName, params, RequestOptions.none())

        /** @see deleteEventDefinitionProperty */
        @MustBeClosed
        fun deleteEventDefinitionProperty(
            propertyName: String,
            params: SendDeleteEventDefinitionPropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteEventDefinitionProperty(
                params.toBuilder().propertyName(propertyName).build(),
                requestOptions,
            )

        /** @see deleteEventDefinitionProperty */
        @MustBeClosed
        fun deleteEventDefinitionProperty(
            params: SendDeleteEventDefinitionPropertyParams
        ): HttpResponse = deleteEventDefinitionProperty(params, RequestOptions.none())

        /** @see deleteEventDefinitionProperty */
        @MustBeClosed
        fun deleteEventDefinitionProperty(
            params: SendDeleteEventDefinitionPropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /events/custom/2026-03/event-definitions/{eventName}`, but is otherwise the same as
         * [SendService.getEventDefinition].
         */
        @MustBeClosed
        fun getEventDefinition(
            eventName: String
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            getEventDefinition(eventName, SendGetEventDefinitionParams.none())

        /** @see getEventDefinition */
        @MustBeClosed
        fun getEventDefinition(
            eventName: String,
            params: SendGetEventDefinitionParams = SendGetEventDefinitionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            getEventDefinition(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see getEventDefinition */
        @MustBeClosed
        fun getEventDefinition(
            eventName: String,
            params: SendGetEventDefinitionParams = SendGetEventDefinitionParams.none(),
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            getEventDefinition(eventName, params, RequestOptions.none())

        /** @see getEventDefinition */
        @MustBeClosed
        fun getEventDefinition(
            params: SendGetEventDefinitionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition>

        /** @see getEventDefinition */
        @MustBeClosed
        fun getEventDefinition(
            params: SendGetEventDefinitionParams
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            getEventDefinition(params, RequestOptions.none())

        /** @see getEventDefinition */
        @MustBeClosed
        fun getEventDefinition(
            eventName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            getEventDefinition(eventName, SendGetEventDefinitionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /events/custom/2026-03/event-definitions`, but is
         * otherwise the same as [SendService.listEventDefinitions].
         */
        @MustBeClosed
        fun listEventDefinitions(): HttpResponseFor<SendListEventDefinitionsPage> =
            listEventDefinitions(SendListEventDefinitionsParams.none())

        /** @see listEventDefinitions */
        @MustBeClosed
        fun listEventDefinitions(
            params: SendListEventDefinitionsParams = SendListEventDefinitionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SendListEventDefinitionsPage>

        /** @see listEventDefinitions */
        @MustBeClosed
        fun listEventDefinitions(
            params: SendListEventDefinitionsParams = SendListEventDefinitionsParams.none()
        ): HttpResponseFor<SendListEventDefinitionsPage> =
            listEventDefinitions(params, RequestOptions.none())

        /** @see listEventDefinitions */
        @MustBeClosed
        fun listEventDefinitions(
            requestOptions: RequestOptions
        ): HttpResponseFor<SendListEventDefinitionsPage> =
            listEventDefinitions(SendListEventDefinitionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /events/custom/2026-03/send`, but is otherwise the
         * same as [SendService.sendEvent].
         */
        @MustBeClosed
        fun sendEvent(params: SendSendEventParams): HttpResponse =
            sendEvent(params, RequestOptions.none())

        /** @see sendEvent */
        @MustBeClosed
        fun sendEvent(
            params: SendSendEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see sendEvent */
        @MustBeClosed
        fun sendEvent(
            behavioralEventHttpCompletionRequest: BehavioralEventHttpCompletionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            sendEvent(
                SendSendEventParams.builder()
                    .behavioralEventHttpCompletionRequest(behavioralEventHttpCompletionRequest)
                    .build(),
                requestOptions,
            )

        /** @see sendEvent */
        @MustBeClosed
        fun sendEvent(
            behavioralEventHttpCompletionRequest: BehavioralEventHttpCompletionRequest
        ): HttpResponse = sendEvent(behavioralEventHttpCompletionRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /events/custom/2026-03/send/batch`, but is
         * otherwise the same as [SendService.sendEventBatch].
         */
        @MustBeClosed
        fun sendEventBatch(params: SendSendEventBatchParams): HttpResponse =
            sendEventBatch(params, RequestOptions.none())

        /** @see sendEventBatch */
        @MustBeClosed
        fun sendEventBatch(
            params: SendSendEventBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see sendEventBatch */
        @MustBeClosed
        fun sendEventBatch(
            batchedBehavioralEventHttpCompletionRequest:
                BatchedBehavioralEventHttpCompletionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            sendEventBatch(
                SendSendEventBatchParams.builder()
                    .batchedBehavioralEventHttpCompletionRequest(
                        batchedBehavioralEventHttpCompletionRequest
                    )
                    .build(),
                requestOptions,
            )

        /** @see sendEventBatch */
        @MustBeClosed
        fun sendEventBatch(
            batchedBehavioralEventHttpCompletionRequest: BatchedBehavioralEventHttpCompletionRequest
        ): HttpResponse =
            sendEventBatch(batchedBehavioralEventHttpCompletionRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch
         * /events/custom/2026-03/event-definitions/{eventName}`, but is otherwise the same as
         * [SendService.updateEventDefinition].
         */
        @MustBeClosed
        fun updateEventDefinition(
            eventName: String,
            params: SendUpdateEventDefinitionParams,
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            updateEventDefinition(eventName, params, RequestOptions.none())

        /** @see updateEventDefinition */
        @MustBeClosed
        fun updateEventDefinition(
            eventName: String,
            params: SendUpdateEventDefinitionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            updateEventDefinition(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see updateEventDefinition */
        @MustBeClosed
        fun updateEventDefinition(
            params: SendUpdateEventDefinitionParams
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            updateEventDefinition(params, RequestOptions.none())

        /** @see updateEventDefinition */
        @MustBeClosed
        fun updateEventDefinition(
            params: SendUpdateEventDefinitionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition>

        /**
         * Returns a raw HTTP response for `patch
         * /events/custom/2026-03/event-definitions/{eventName}/property/{propertyName}`, but is
         * otherwise the same as [SendService.updateEventDefinitionProperty].
         */
        @MustBeClosed
        fun updateEventDefinitionProperty(
            propertyName: String,
            params: SendUpdateEventDefinitionPropertyParams,
        ): HttpResponseFor<Property> =
            updateEventDefinitionProperty(propertyName, params, RequestOptions.none())

        /** @see updateEventDefinitionProperty */
        @MustBeClosed
        fun updateEventDefinitionProperty(
            propertyName: String,
            params: SendUpdateEventDefinitionPropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property> =
            updateEventDefinitionProperty(
                params.toBuilder().propertyName(propertyName).build(),
                requestOptions,
            )

        /** @see updateEventDefinitionProperty */
        @MustBeClosed
        fun updateEventDefinitionProperty(
            params: SendUpdateEventDefinitionPropertyParams
        ): HttpResponseFor<Property> = updateEventDefinitionProperty(params, RequestOptions.none())

        /** @see updateEventDefinitionProperty */
        @MustBeClosed
        fun updateEventDefinitionProperty(
            params: SendUpdateEventDefinitionPropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property>
    }
}
