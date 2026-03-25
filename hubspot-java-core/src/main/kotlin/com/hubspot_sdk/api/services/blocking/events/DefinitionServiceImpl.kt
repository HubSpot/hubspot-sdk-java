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
import com.hubspot_sdk.api.models.Property
import com.hubspot_sdk.api.models.events.CollectionResponseWithTotalExternalBehavioralEventTypeDefinition
import com.hubspot_sdk.api.models.events.ExternalBehavioralEventTypeDefinition
import com.hubspot_sdk.api.models.events.definitions.DefinitionCreateParams
import com.hubspot_sdk.api.models.events.definitions.DefinitionCreatePropertyParams
import com.hubspot_sdk.api.models.events.definitions.DefinitionDeleteParams
import com.hubspot_sdk.api.models.events.definitions.DefinitionDeletePropertyParams
import com.hubspot_sdk.api.models.events.definitions.DefinitionGetParams
import com.hubspot_sdk.api.models.events.definitions.DefinitionListPage
import com.hubspot_sdk.api.models.events.definitions.DefinitionListParams
import com.hubspot_sdk.api.models.events.definitions.DefinitionSendBatchParams
import com.hubspot_sdk.api.models.events.definitions.DefinitionSendParams
import com.hubspot_sdk.api.models.events.definitions.DefinitionUpdateParams
import com.hubspot_sdk.api.models.events.definitions.DefinitionUpdatePropertyParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DefinitionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DefinitionService {

    private val withRawResponse: DefinitionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DefinitionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DefinitionService =
        DefinitionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: DefinitionCreateParams,
        requestOptions: RequestOptions,
    ): ExternalBehavioralEventTypeDefinition =
        // post /events/custom/2026-03/event-definitions
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: DefinitionUpdateParams,
        requestOptions: RequestOptions,
    ): ExternalBehavioralEventTypeDefinition =
        // patch /events/custom/2026-03/event-definitions/{eventName}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: DefinitionListParams,
        requestOptions: RequestOptions,
    ): DefinitionListPage =
        // get /events/custom/2026-03/event-definitions
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: DefinitionDeleteParams, requestOptions: RequestOptions) {
        // delete /events/custom/2026-03/event-definitions/{eventName}
        withRawResponse().delete(params, requestOptions)
    }

    override fun createProperty(
        params: DefinitionCreatePropertyParams,
        requestOptions: RequestOptions,
    ): Property =
        // post /events/custom/2026-03/event-definitions/{eventName}/property
        withRawResponse().createProperty(params, requestOptions).parse()

    override fun deleteProperty(
        params: DefinitionDeletePropertyParams,
        requestOptions: RequestOptions,
    ) {
        // delete /events/custom/2026-03/event-definitions/{eventName}/property/{propertyName}
        withRawResponse().deleteProperty(params, requestOptions)
    }

    override fun get(
        params: DefinitionGetParams,
        requestOptions: RequestOptions,
    ): ExternalBehavioralEventTypeDefinition =
        // get /events/custom/2026-03/event-definitions/{eventName}
        withRawResponse().get(params, requestOptions).parse()

    override fun send(params: DefinitionSendParams, requestOptions: RequestOptions) {
        // post /events/custom/2026-03/send
        withRawResponse().send(params, requestOptions)
    }

    override fun sendBatch(params: DefinitionSendBatchParams, requestOptions: RequestOptions) {
        // post /events/custom/2026-03/send/batch
        withRawResponse().sendBatch(params, requestOptions)
    }

    override fun updateProperty(
        params: DefinitionUpdatePropertyParams,
        requestOptions: RequestOptions,
    ): Property =
        // patch /events/custom/2026-03/event-definitions/{eventName}/property/{propertyName}
        withRawResponse().updateProperty(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DefinitionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DefinitionService.WithRawResponse =
            DefinitionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ExternalBehavioralEventTypeDefinition> =
            jsonHandler<ExternalBehavioralEventTypeDefinition>(clientOptions.jsonMapper)

        override fun create(
            params: DefinitionCreateParams,
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
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<ExternalBehavioralEventTypeDefinition> =
            jsonHandler<ExternalBehavioralEventTypeDefinition>(clientOptions.jsonMapper)

        override fun update(
            params: DefinitionUpdateParams,
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
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler:
            Handler<CollectionResponseWithTotalExternalBehavioralEventTypeDefinition> =
            jsonHandler<CollectionResponseWithTotalExternalBehavioralEventTypeDefinition>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: DefinitionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DefinitionListPage> {
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
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        DefinitionListPage.builder()
                            .service(DefinitionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: DefinitionDeleteParams,
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
                response.use { deleteHandler.handle(it) }
            }
        }

        private val createPropertyHandler: Handler<Property> =
            jsonHandler<Property>(clientOptions.jsonMapper)

        override fun createProperty(
            params: DefinitionCreatePropertyParams,
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
                    .use { createPropertyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deletePropertyHandler: Handler<Void?> = emptyHandler()

        override fun deleteProperty(
            params: DefinitionDeletePropertyParams,
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
                response.use { deletePropertyHandler.handle(it) }
            }
        }

        private val getHandler: Handler<ExternalBehavioralEventTypeDefinition> =
            jsonHandler<ExternalBehavioralEventTypeDefinition>(clientOptions.jsonMapper)

        override fun get(
            params: DefinitionGetParams,
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
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val sendHandler: Handler<Void?> = emptyHandler()

        override fun send(
            params: DefinitionSendParams,
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
                response.use { sendHandler.handle(it) }
            }
        }

        private val sendBatchHandler: Handler<Void?> = emptyHandler()

        override fun sendBatch(
            params: DefinitionSendBatchParams,
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
                response.use { sendBatchHandler.handle(it) }
            }
        }

        private val updatePropertyHandler: Handler<Property> =
            jsonHandler<Property>(clientOptions.jsonMapper)

        override fun updateProperty(
            params: DefinitionUpdatePropertyParams,
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
                    .use { updatePropertyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
