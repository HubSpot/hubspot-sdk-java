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
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionCreateParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionCreatePropertyParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionCreateResponse
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionDeleteParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionDeletePropertyParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionGetParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionGetResponse
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionListPage
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionListPageResponse
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionListParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionUpdateParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionUpdatePropertyParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EventDefinitionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EventDefinitionService {

    private val withRawResponse: EventDefinitionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EventDefinitionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventDefinitionService =
        EventDefinitionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: EventDefinitionCreateParams,
        requestOptions: RequestOptions,
    ): EventDefinitionCreateResponse =
        // post /events/v3/event-definitions
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: EventDefinitionUpdateParams,
        requestOptions: RequestOptions,
    ): EventDefinitionUpdateResponse =
        // patch /events/v3/event-definitions/{eventName}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: EventDefinitionListParams,
        requestOptions: RequestOptions,
    ): EventDefinitionListPage =
        // get /events/v3/event-definitions
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: EventDefinitionDeleteParams, requestOptions: RequestOptions) {
        // delete /events/v3/event-definitions/{eventName}
        withRawResponse().delete(params, requestOptions)
    }

    override fun createProperty(
        params: EventDefinitionCreatePropertyParams,
        requestOptions: RequestOptions,
    ): Property =
        // post /events/v3/event-definitions/{eventName}/property
        withRawResponse().createProperty(params, requestOptions).parse()

    override fun deleteProperty(
        params: EventDefinitionDeletePropertyParams,
        requestOptions: RequestOptions,
    ) {
        // delete /events/v3/event-definitions/{eventName}/property/{propertyName}
        withRawResponse().deleteProperty(params, requestOptions)
    }

    override fun get(
        params: EventDefinitionGetParams,
        requestOptions: RequestOptions,
    ): EventDefinitionGetResponse =
        // get /events/v3/event-definitions/{eventName}
        withRawResponse().get(params, requestOptions).parse()

    override fun updateProperty(
        params: EventDefinitionUpdatePropertyParams,
        requestOptions: RequestOptions,
    ): Property =
        // patch /events/v3/event-definitions/{eventName}/property/{propertyName}
        withRawResponse().updateProperty(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventDefinitionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventDefinitionService.WithRawResponse =
            EventDefinitionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EventDefinitionCreateResponse> =
            jsonHandler<EventDefinitionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EventDefinitionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventDefinitionCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "v3", "event-definitions")
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

        private val updateHandler: Handler<EventDefinitionUpdateResponse> =
            jsonHandler<EventDefinitionUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: EventDefinitionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventDefinitionUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventName", params.eventName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "v3", "event-definitions", params._pathParam(0))
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

        private val listHandler: Handler<EventDefinitionListPageResponse> =
            jsonHandler<EventDefinitionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EventDefinitionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventDefinitionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "v3", "event-definitions")
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
                        EventDefinitionListPage.builder()
                            .service(EventDefinitionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: EventDefinitionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventName", params.eventName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "v3", "event-definitions", params._pathParam(0))
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
            params: EventDefinitionCreatePropertyParams,
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
                        "v3",
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
            params: EventDefinitionDeletePropertyParams,
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
                        "v3",
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

        private val getHandler: Handler<EventDefinitionGetResponse> =
            jsonHandler<EventDefinitionGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: EventDefinitionGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventDefinitionGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventName", params.eventName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "v3", "event-definitions", params._pathParam(0))
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

        private val updatePropertyHandler: Handler<Property> =
            jsonHandler<Property>(clientOptions.jsonMapper)

        override fun updateProperty(
            params: EventDefinitionUpdatePropertyParams,
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
                        "v3",
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
