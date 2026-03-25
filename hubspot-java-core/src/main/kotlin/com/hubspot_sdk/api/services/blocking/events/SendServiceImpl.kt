// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.events

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
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.events.send.CollectionResponseWithTotalExternalBehavioralEventTypeDefinition
import com.hubspot_sdk.api.models.events.send.ExternalBehavioralEventTypeDefinition
import com.hubspot_sdk.api.models.events.send.Property
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
import kotlin.jvm.optionals.getOrNull

class SendServiceImpl internal constructor(private val clientOptions: ClientOptions) : SendService {

    private val withRawResponse: SendService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SendService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SendService =
        SendServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createEventDefinition(
        params: SendCreateEventDefinitionParams,
        requestOptions: RequestOptions,
    ): ExternalBehavioralEventTypeDefinition =
        // post /events/custom/2026-03/event-definitions
        withRawResponse().createEventDefinition(params, requestOptions).parse()

    override fun createEventDefinitionProperty(
        params: SendCreateEventDefinitionPropertyParams,
        requestOptions: RequestOptions,
    ): Property =
        // post /events/custom/2026-03/event-definitions/{eventName}/property
        withRawResponse().createEventDefinitionProperty(params, requestOptions).parse()

    override fun deleteEventDefinition(
        params: SendDeleteEventDefinitionParams,
        requestOptions: RequestOptions,
    ) {
        // delete /events/custom/2026-03/event-definitions/{eventName}
        withRawResponse().deleteEventDefinition(params, requestOptions)
    }

    override fun deleteEventDefinitionProperty(
        params: SendDeleteEventDefinitionPropertyParams,
        requestOptions: RequestOptions,
    ) {
        // delete /events/custom/2026-03/event-definitions/{eventName}/property/{propertyName}
        withRawResponse().deleteEventDefinitionProperty(params, requestOptions)
    }

    override fun getEventDefinition(
        params: SendGetEventDefinitionParams,
        requestOptions: RequestOptions,
    ): ExternalBehavioralEventTypeDefinition =
        // get /events/custom/2026-03/event-definitions/{eventName}
        withRawResponse().getEventDefinition(params, requestOptions).parse()

    override fun listEventDefinitions(
        params: SendListEventDefinitionsParams,
        requestOptions: RequestOptions,
    ): SendListEventDefinitionsPage =
        // get /events/custom/2026-03/event-definitions
        withRawResponse().listEventDefinitions(params, requestOptions).parse()

    override fun sendEvent(params: SendSendEventParams, requestOptions: RequestOptions) {
        // post /events/custom/2026-03/send
        withRawResponse().sendEvent(params, requestOptions)
    }

    override fun sendEventBatch(params: SendSendEventBatchParams, requestOptions: RequestOptions) {
        // post /events/custom/2026-03/send/batch
        withRawResponse().sendEventBatch(params, requestOptions)
    }

    override fun updateEventDefinition(
        params: SendUpdateEventDefinitionParams,
        requestOptions: RequestOptions,
    ): ExternalBehavioralEventTypeDefinition =
        // patch /events/custom/2026-03/event-definitions/{eventName}
        withRawResponse().updateEventDefinition(params, requestOptions).parse()

    override fun updateEventDefinitionProperty(
        params: SendUpdateEventDefinitionPropertyParams,
        requestOptions: RequestOptions,
    ): Property =
        // patch /events/custom/2026-03/event-definitions/{eventName}/property/{propertyName}
        withRawResponse().updateEventDefinitionProperty(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SendService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SendService.WithRawResponse =
            SendServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createEventDefinitionHandler: Handler<ExternalBehavioralEventTypeDefinition> =
            jsonHandler<ExternalBehavioralEventTypeDefinition>(clientOptions.jsonMapper)

        override fun createEventDefinition(
            params: SendCreateEventDefinitionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "custom", "2026-03", "event-definitions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createEventDefinitionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createEventDefinitionPropertyHandler: Handler<Property> =
            jsonHandler<Property>(clientOptions.jsonMapper)

        override fun createEventDefinitionProperty(
            params: SendCreateEventDefinitionPropertyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Property> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createEventDefinitionPropertyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteEventDefinitionHandler: Handler<Void?> = emptyHandler()

        override fun deleteEventDefinition(
            params: SendDeleteEventDefinitionParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteEventDefinitionHandler.handle(it) }
            }
        }

        private val deleteEventDefinitionPropertyHandler: Handler<Void?> = emptyHandler()

        override fun deleteEventDefinitionProperty(
            params: SendDeleteEventDefinitionPropertyParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteEventDefinitionPropertyHandler.handle(it) }
            }
        }

        private val getEventDefinitionHandler: Handler<ExternalBehavioralEventTypeDefinition> =
            jsonHandler<ExternalBehavioralEventTypeDefinition>(clientOptions.jsonMapper)

        override fun getEventDefinition(
            params: SendGetEventDefinitionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getEventDefinitionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<SendListEventDefinitionsPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "custom", "2026-03", "event-definitions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listEventDefinitionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        SendListEventDefinitionsPage.builder()
                            .service(SendServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val sendEventHandler: Handler<Void?> = emptyHandler()

        override fun sendEvent(
            params: SendSendEventParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "custom", "2026-03", "send")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { sendEventHandler.handle(it) }
            }
        }

        private val sendEventBatchHandler: Handler<Void?> = emptyHandler()

        override fun sendEventBatch(
            params: SendSendEventBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "custom", "2026-03", "send", "batch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { sendEventBatchHandler.handle(it) }
            }
        }

        private val updateEventDefinitionHandler: Handler<ExternalBehavioralEventTypeDefinition> =
            jsonHandler<ExternalBehavioralEventTypeDefinition>(clientOptions.jsonMapper)

        override fun updateEventDefinition(
            params: SendUpdateEventDefinitionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalBehavioralEventTypeDefinition> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateEventDefinitionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateEventDefinitionPropertyHandler: Handler<Property> =
            jsonHandler<Property>(clientOptions.jsonMapper)

        override fun updateEventDefinitionProperty(
            params: SendUpdateEventDefinitionPropertyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Property> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
