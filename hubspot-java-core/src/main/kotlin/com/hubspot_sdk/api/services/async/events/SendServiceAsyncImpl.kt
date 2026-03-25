// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.events

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.emptyHandler
import com.hubspot_sdk.api.core.handlers.errorBodyHandler
import com.hubspot_sdk.api.core.handlers.errorHandler
import com.hubspot_sdk.api.core.handlers.jsonHandler
import com.hubspot_sdk.api.core.http.HttpMethod
import com.hubspot_sdk.api.core.http.HttpRequest
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponse.Handler
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.core.http.json
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.events.send.CollectionResponseWithTotalExternalBehavioralEventTypeDefinition
import com.hubspot_sdk.api.models.events.send.ExternalBehavioralEventTypeDefinition
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
import kotlin.jvm.optionals.getOrNull

class SendServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SendServiceAsync {

    private val withRawResponse: SendServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SendServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SendServiceAsync =
        SendServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createEventDefinition(
        params: SendCreateEventDefinitionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        // post /events/custom/2026-03/event-definitions
        withRawResponse().createEventDefinition(params, requestOptions).thenApply { it.parse() }

    override fun createEventDefinitionProperty(
        params: SendCreateEventDefinitionPropertyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Property> =
        // post /events/custom/2026-03/event-definitions/{eventName}/property
        withRawResponse().createEventDefinitionProperty(params, requestOptions).thenApply {
            it.parse()
        }

    override fun deleteEventDefinition(
        params: SendDeleteEventDefinitionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /events/custom/2026-03/event-definitions/{eventName}
        withRawResponse().deleteEventDefinition(params, requestOptions).thenAccept {}

    override fun deleteEventDefinitionProperty(
        params: SendDeleteEventDefinitionPropertyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /events/custom/2026-03/event-definitions/{eventName}/property/{propertyName}
        withRawResponse().deleteEventDefinitionProperty(params, requestOptions).thenAccept {}

    override fun getEventDefinition(
        params: SendGetEventDefinitionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        // get /events/custom/2026-03/event-definitions/{eventName}
        withRawResponse().getEventDefinition(params, requestOptions).thenApply { it.parse() }

    override fun listEventDefinitions(
        params: SendListEventDefinitionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SendListEventDefinitionsPageAsync> =
        // get /events/custom/2026-03/event-definitions
        withRawResponse().listEventDefinitions(params, requestOptions).thenApply { it.parse() }

    override fun sendEvent(
        params: SendSendEventParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /events/custom/2026-03/send
        withRawResponse().sendEvent(params, requestOptions).thenAccept {}

    override fun sendEventBatch(
        params: SendSendEventBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /events/custom/2026-03/send/batch
        withRawResponse().sendEventBatch(params, requestOptions).thenAccept {}

    override fun updateEventDefinition(
        params: SendUpdateEventDefinitionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalBehavioralEventTypeDefinition> =
        // patch /events/custom/2026-03/event-definitions/{eventName}
        withRawResponse().updateEventDefinition(params, requestOptions).thenApply { it.parse() }

    override fun updateEventDefinitionProperty(
        params: SendUpdateEventDefinitionPropertyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Property> =
        // patch /events/custom/2026-03/event-definitions/{eventName}/property/{propertyName}
        withRawResponse().updateEventDefinitionProperty(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SendServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SendServiceAsync.WithRawResponse =
            SendServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createEventDefinitionHandler: Handler<ExternalBehavioralEventTypeDefinition> =
            jsonHandler<ExternalBehavioralEventTypeDefinition>(clientOptions.jsonMapper)

        override fun createEventDefinition(
            params: SendCreateEventDefinitionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "custom", "2026-03", "event-definitions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createEventDefinitionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createEventDefinitionPropertyHandler: Handler<Property> =
            jsonHandler<Property>(clientOptions.jsonMapper)

        override fun createEventDefinitionProperty(
            params: SendCreateEventDefinitionPropertyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Property>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventName", params.eventName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "events",
                        "custom",
                        "2026-03",
                        "event-definitions",
                        params._pathParam(0),
                        "property",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createEventDefinitionPropertyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteEventDefinitionHandler: Handler<Void?> = emptyHandler()

        override fun deleteEventDefinition(
            params: SendDeleteEventDefinitionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventName", params.eventName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "events",
                        "custom",
                        "2026-03",
                        "event-definitions",
                        params._pathParam(0),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteEventDefinitionHandler.handle(it) }
                    }
                }
        }

        private val deleteEventDefinitionPropertyHandler: Handler<Void?> = emptyHandler()

        override fun deleteEventDefinitionProperty(
            params: SendDeleteEventDefinitionPropertyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("propertyName", params.propertyName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "events",
                        "custom",
                        "2026-03",
                        "event-definitions",
                        params._pathParam(0),
                        "property",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteEventDefinitionPropertyHandler.handle(it) }
                    }
                }
        }

        private val getEventDefinitionHandler: Handler<ExternalBehavioralEventTypeDefinition> =
            jsonHandler<ExternalBehavioralEventTypeDefinition>(clientOptions.jsonMapper)

        override fun getEventDefinition(
            params: SendGetEventDefinitionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventName", params.eventName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "events",
                        "custom",
                        "2026-03",
                        "event-definitions",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getEventDefinitionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listEventDefinitionsHandler:
            Handler<CollectionResponseWithTotalExternalBehavioralEventTypeDefinition> =
            jsonHandler<CollectionResponseWithTotalExternalBehavioralEventTypeDefinition>(
                clientOptions.jsonMapper
            )

        override fun listEventDefinitions(
            params: SendListEventDefinitionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SendListEventDefinitionsPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "custom", "2026-03", "event-definitions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listEventDefinitionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                SendListEventDefinitionsPageAsync.builder()
                                    .service(SendServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val sendEventHandler: Handler<Void?> = emptyHandler()

        override fun sendEvent(
            params: SendSendEventParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "custom", "2026-03", "send")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { sendEventHandler.handle(it) }
                    }
                }
        }

        private val sendEventBatchHandler: Handler<Void?> = emptyHandler()

        override fun sendEventBatch(
            params: SendSendEventBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "custom", "2026-03", "send", "batch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { sendEventBatchHandler.handle(it) }
                    }
                }
        }

        private val updateEventDefinitionHandler: Handler<ExternalBehavioralEventTypeDefinition> =
            jsonHandler<ExternalBehavioralEventTypeDefinition>(clientOptions.jsonMapper)

        override fun updateEventDefinition(
            params: SendUpdateEventDefinitionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalBehavioralEventTypeDefinition>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventName", params.eventName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "events",
                        "custom",
                        "2026-03",
                        "event-definitions",
                        params._pathParam(0),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateEventDefinitionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateEventDefinitionPropertyHandler: Handler<Property> =
            jsonHandler<Property>(clientOptions.jsonMapper)

        override fun updateEventDefinitionProperty(
            params: SendUpdateEventDefinitionPropertyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Property>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("propertyName", params.propertyName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "events",
                        "custom",
                        "2026-03",
                        "event-definitions",
                        params._pathParam(0),
                        "property",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateEventDefinitionPropertyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
