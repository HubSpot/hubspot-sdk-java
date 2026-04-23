// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.events

import com.google.errorprone.annotations.MustBeClosed
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
import com.hubspot.sdk.models.events.definitions.DefinitionListPage
import com.hubspot.sdk.models.events.definitions.DefinitionListParams
import com.hubspot.sdk.models.events.definitions.DefinitionSendBatchParams
import com.hubspot.sdk.models.events.definitions.DefinitionUpdateParams
import com.hubspot.sdk.models.events.definitions.DefinitionUpdatePropertyParams
import com.hubspot.sdk.models.events.definitions.ExternalBehavioralEventTypeDefinition
import com.hubspot.sdk.models.events.definitions.ExternalBehavioralEventTypeDefinitionEgg
import java.util.function.Consumer

interface DefinitionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DefinitionService

    /** Create a custom event definition. */
    fun create(params: DefinitionCreateParams): ExternalBehavioralEventTypeDefinition =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DefinitionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBehavioralEventTypeDefinition

    /** @see create */
    fun create(
        externalBehavioralEventTypeDefinitionEgg: ExternalBehavioralEventTypeDefinitionEgg,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBehavioralEventTypeDefinition =
        create(
            DefinitionCreateParams.builder()
                .externalBehavioralEventTypeDefinitionEgg(externalBehavioralEventTypeDefinitionEgg)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        externalBehavioralEventTypeDefinitionEgg: ExternalBehavioralEventTypeDefinitionEgg
    ): ExternalBehavioralEventTypeDefinition =
        create(externalBehavioralEventTypeDefinitionEgg, RequestOptions.none())

    /** Update a specific custom event definition by name. */
    fun update(
        eventName: String,
        params: DefinitionUpdateParams,
    ): ExternalBehavioralEventTypeDefinition = update(eventName, params, RequestOptions.none())

    /** @see update */
    fun update(
        eventName: String,
        params: DefinitionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBehavioralEventTypeDefinition =
        update(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see update */
    fun update(params: DefinitionUpdateParams): ExternalBehavioralEventTypeDefinition =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DefinitionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBehavioralEventTypeDefinition

    /** Retrieve existing custom event definitions. */
    fun list(): DefinitionListPage = list(DefinitionListParams.none())

    /** @see list */
    fun list(
        params: DefinitionListParams = DefinitionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DefinitionListPage

    /** @see list */
    fun list(params: DefinitionListParams = DefinitionListParams.none()): DefinitionListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DefinitionListPage =
        list(DefinitionListParams.none(), requestOptions)

    /** Delete a custom event definition by name. */
    fun delete(eventName: String) = delete(eventName, DefinitionDeleteParams.none())

    /** @see delete */
    fun delete(
        eventName: String,
        params: DefinitionDeleteParams = DefinitionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see delete */
    fun delete(eventName: String, params: DefinitionDeleteParams = DefinitionDeleteParams.none()) =
        delete(eventName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DefinitionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: DefinitionDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(eventName: String, requestOptions: RequestOptions) =
        delete(eventName, DefinitionDeleteParams.none(), requestOptions)

    /** Create a new property for an existing event definition. */
    fun createProperty(eventName: String, params: DefinitionCreatePropertyParams): BaseProperty =
        createProperty(eventName, params, RequestOptions.none())

    /** @see createProperty */
    fun createProperty(
        eventName: String,
        params: DefinitionCreatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BaseProperty =
        createProperty(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see createProperty */
    fun createProperty(params: DefinitionCreatePropertyParams): BaseProperty =
        createProperty(params, RequestOptions.none())

    /** @see createProperty */
    fun createProperty(
        params: DefinitionCreatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BaseProperty

    /** Delete an existing property from a custom event definition. */
    fun deleteProperty(propertyName: String, params: DefinitionDeletePropertyParams) =
        deleteProperty(propertyName, params, RequestOptions.none())

    /** @see deleteProperty */
    fun deleteProperty(
        propertyName: String,
        params: DefinitionDeletePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see deleteProperty */
    fun deleteProperty(params: DefinitionDeletePropertyParams) =
        deleteProperty(params, RequestOptions.none())

    /** @see deleteProperty */
    fun deleteProperty(
        params: DefinitionDeletePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Fetch a single custom event definition by name. */
    fun get(eventName: String): ExternalBehavioralEventTypeDefinition =
        get(eventName, DefinitionGetParams.none())

    /** @see get */
    fun get(
        eventName: String,
        params: DefinitionGetParams = DefinitionGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBehavioralEventTypeDefinition =
        get(params.toBuilder().eventName(eventName).build(), requestOptions)

    /** @see get */
    fun get(
        eventName: String,
        params: DefinitionGetParams = DefinitionGetParams.none(),
    ): ExternalBehavioralEventTypeDefinition = get(eventName, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DefinitionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBehavioralEventTypeDefinition

    /** @see get */
    fun get(params: DefinitionGetParams): ExternalBehavioralEventTypeDefinition =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        eventName: String,
        requestOptions: RequestOptions,
    ): ExternalBehavioralEventTypeDefinition =
        get(eventName, DefinitionGetParams.none(), requestOptions)

    /** Send multiple event occurrences at once. */
    fun sendBatch(params: DefinitionSendBatchParams) = sendBatch(params, RequestOptions.none())

    /** @see sendBatch */
    fun sendBatch(
        params: DefinitionSendBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see sendBatch */
    fun sendBatch(
        batchedBehavioralEventHttpCompletionRequest: BatchedBehavioralEventHttpCompletionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
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
    ) = sendBatch(batchedBehavioralEventHttpCompletionRequest, RequestOptions.none())

    /** Update an existing property in a custom event definition. */
    fun updateProperty(propertyName: String, params: DefinitionUpdatePropertyParams): BaseProperty =
        updateProperty(propertyName, params, RequestOptions.none())

    /** @see updateProperty */
    fun updateProperty(
        propertyName: String,
        params: DefinitionUpdatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BaseProperty =
        updateProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see updateProperty */
    fun updateProperty(params: DefinitionUpdatePropertyParams): BaseProperty =
        updateProperty(params, RequestOptions.none())

    /** @see updateProperty */
    fun updateProperty(
        params: DefinitionUpdatePropertyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BaseProperty

    /** A view of [DefinitionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DefinitionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /events/2026-03/event-definitions`, but is
         * otherwise the same as [DefinitionService.create].
         */
        @MustBeClosed
        fun create(
            params: DefinitionCreateParams
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DefinitionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition>

        /** @see create */
        @MustBeClosed
        fun create(
            externalBehavioralEventTypeDefinitionEgg: ExternalBehavioralEventTypeDefinitionEgg,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            create(
                DefinitionCreateParams.builder()
                    .externalBehavioralEventTypeDefinitionEgg(
                        externalBehavioralEventTypeDefinitionEgg
                    )
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            externalBehavioralEventTypeDefinitionEgg: ExternalBehavioralEventTypeDefinitionEgg
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            create(externalBehavioralEventTypeDefinitionEgg, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /events/2026-03/event-definitions/{eventName}`,
         * but is otherwise the same as [DefinitionService.update].
         */
        @MustBeClosed
        fun update(
            eventName: String,
            params: DefinitionUpdateParams,
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            update(eventName, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            eventName: String,
            params: DefinitionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            update(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: DefinitionUpdateParams
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DefinitionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition>

        /**
         * Returns a raw HTTP response for `get /events/2026-03/event-definitions`, but is otherwise
         * the same as [DefinitionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DefinitionListPage> = list(DefinitionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DefinitionListParams = DefinitionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DefinitionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DefinitionListParams = DefinitionListParams.none()
        ): HttpResponseFor<DefinitionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DefinitionListPage> =
            list(DefinitionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /events/2026-03/event-definitions/{eventName}`,
         * but is otherwise the same as [DefinitionService.delete].
         */
        @MustBeClosed
        fun delete(eventName: String): HttpResponse =
            delete(eventName, DefinitionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            eventName: String,
            params: DefinitionDeleteParams = DefinitionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            eventName: String,
            params: DefinitionDeleteParams = DefinitionDeleteParams.none(),
        ): HttpResponse = delete(eventName, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DefinitionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: DefinitionDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(eventName: String, requestOptions: RequestOptions): HttpResponse =
            delete(eventName, DefinitionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /events/2026-03/event-definitions/{eventName}/property`, but is otherwise the same as
         * [DefinitionService.createProperty].
         */
        @MustBeClosed
        fun createProperty(
            eventName: String,
            params: DefinitionCreatePropertyParams,
        ): HttpResponseFor<BaseProperty> = createProperty(eventName, params, RequestOptions.none())

        /** @see createProperty */
        @MustBeClosed
        fun createProperty(
            eventName: String,
            params: DefinitionCreatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BaseProperty> =
            createProperty(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see createProperty */
        @MustBeClosed
        fun createProperty(params: DefinitionCreatePropertyParams): HttpResponseFor<BaseProperty> =
            createProperty(params, RequestOptions.none())

        /** @see createProperty */
        @MustBeClosed
        fun createProperty(
            params: DefinitionCreatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BaseProperty>

        /**
         * Returns a raw HTTP response for `delete
         * /events/2026-03/event-definitions/{eventName}/property/{propertyName}`, but is otherwise
         * the same as [DefinitionService.deleteProperty].
         */
        @MustBeClosed
        fun deleteProperty(
            propertyName: String,
            params: DefinitionDeletePropertyParams,
        ): HttpResponse = deleteProperty(propertyName, params, RequestOptions.none())

        /** @see deleteProperty */
        @MustBeClosed
        fun deleteProperty(
            propertyName: String,
            params: DefinitionDeletePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see deleteProperty */
        @MustBeClosed
        fun deleteProperty(params: DefinitionDeletePropertyParams): HttpResponse =
            deleteProperty(params, RequestOptions.none())

        /** @see deleteProperty */
        @MustBeClosed
        fun deleteProperty(
            params: DefinitionDeletePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /events/2026-03/event-definitions/{eventName}`, but
         * is otherwise the same as [DefinitionService.get].
         */
        @MustBeClosed
        fun get(eventName: String): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            get(eventName, DefinitionGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            eventName: String,
            params: DefinitionGetParams = DefinitionGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            get(params.toBuilder().eventName(eventName).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            eventName: String,
            params: DefinitionGetParams = DefinitionGetParams.none(),
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            get(eventName, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: DefinitionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition>

        /** @see get */
        @MustBeClosed
        fun get(
            params: DefinitionGetParams
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            eventName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> =
            get(eventName, DefinitionGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /events/2026-03/send/batch`, but is otherwise the
         * same as [DefinitionService.sendBatch].
         */
        @MustBeClosed
        fun sendBatch(params: DefinitionSendBatchParams): HttpResponse =
            sendBatch(params, RequestOptions.none())

        /** @see sendBatch */
        @MustBeClosed
        fun sendBatch(
            params: DefinitionSendBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see sendBatch */
        @MustBeClosed
        fun sendBatch(
            batchedBehavioralEventHttpCompletionRequest:
                BatchedBehavioralEventHttpCompletionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            sendBatch(
                DefinitionSendBatchParams.builder()
                    .batchedBehavioralEventHttpCompletionRequest(
                        batchedBehavioralEventHttpCompletionRequest
                    )
                    .build(),
                requestOptions,
            )

        /** @see sendBatch */
        @MustBeClosed
        fun sendBatch(
            batchedBehavioralEventHttpCompletionRequest: BatchedBehavioralEventHttpCompletionRequest
        ): HttpResponse =
            sendBatch(batchedBehavioralEventHttpCompletionRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch
         * /events/2026-03/event-definitions/{eventName}/property/{propertyName}`, but is otherwise
         * the same as [DefinitionService.updateProperty].
         */
        @MustBeClosed
        fun updateProperty(
            propertyName: String,
            params: DefinitionUpdatePropertyParams,
        ): HttpResponseFor<BaseProperty> =
            updateProperty(propertyName, params, RequestOptions.none())

        /** @see updateProperty */
        @MustBeClosed
        fun updateProperty(
            propertyName: String,
            params: DefinitionUpdatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BaseProperty> =
            updateProperty(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see updateProperty */
        @MustBeClosed
        fun updateProperty(params: DefinitionUpdatePropertyParams): HttpResponseFor<BaseProperty> =
            updateProperty(params, RequestOptions.none())

        /** @see updateProperty */
        @MustBeClosed
        fun updateProperty(
            params: DefinitionUpdatePropertyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BaseProperty>
    }
}
