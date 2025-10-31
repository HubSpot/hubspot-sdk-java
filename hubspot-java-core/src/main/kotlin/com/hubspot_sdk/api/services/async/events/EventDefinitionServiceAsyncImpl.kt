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
import com.hubspot_sdk.api.models.Property
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionCreateParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionCreatePropertyParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionCreateResponse
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionDeleteParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionDeletePropertyParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionGetParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionGetResponse
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionListPageAsync
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionListPageResponse
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionListParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionUpdateParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionUpdatePropertyParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EventDefinitionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : EventDefinitionServiceAsync {

    private val withRawResponse: EventDefinitionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EventDefinitionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): EventDefinitionServiceAsync =
        EventDefinitionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: EventDefinitionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventDefinitionCreateResponse> =
        // post /events/v3/event-definitions
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: EventDefinitionUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventDefinitionUpdateResponse> =
        // patch /events/v3/event-definitions/{eventName}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: EventDefinitionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventDefinitionListPageAsync> =
        // get /events/v3/event-definitions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: EventDefinitionDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /events/v3/event-definitions/{eventName}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun createProperty(
        params: EventDefinitionCreatePropertyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Property> =
        // post /events/v3/event-definitions/{eventName}/property
        withRawResponse().createProperty(params, requestOptions).thenApply { it.parse() }

    override fun deleteProperty(
        params: EventDefinitionDeletePropertyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /events/v3/event-definitions/{eventName}/property/{propertyName}
        withRawResponse().deleteProperty(params, requestOptions).thenAccept {}

    override fun get(
        params: EventDefinitionGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventDefinitionGetResponse> =
        // get /events/v3/event-definitions/{eventName}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun updateProperty(
        params: EventDefinitionUpdatePropertyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Property> =
        // patch /events/v3/event-definitions/{eventName}/property/{propertyName}
        withRawResponse().updateProperty(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventDefinitionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventDefinitionServiceAsync.WithRawResponse =
            EventDefinitionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EventDefinitionCreateResponse> =
            jsonHandler<EventDefinitionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EventDefinitionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventDefinitionCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "v3", "event-definitions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<EventDefinitionUpdateResponse> =
            jsonHandler<EventDefinitionUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: EventDefinitionUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventDefinitionUpdateResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<EventDefinitionListPageResponse> =
            jsonHandler<EventDefinitionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EventDefinitionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventDefinitionListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "v3", "event-definitions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                EventDefinitionListPageAsync.builder()
                                    .service(EventDefinitionServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: EventDefinitionDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val createPropertyHandler: Handler<Property> =
            jsonHandler<Property>(clientOptions.jsonMapper)

        override fun createProperty(
            params: EventDefinitionCreatePropertyParams,
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
                        "v3",
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
                            .use { createPropertyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deletePropertyHandler: Handler<Void?> = emptyHandler()

        override fun deleteProperty(
            params: EventDefinitionDeletePropertyParams,
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
                        "v3",
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
                        response.use { deletePropertyHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<EventDefinitionGetResponse> =
            jsonHandler<EventDefinitionGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: EventDefinitionGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventDefinitionGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventName", params.eventName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "v3", "event-definitions", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updatePropertyHandler: Handler<Property> =
            jsonHandler<Property>(clientOptions.jsonMapper)

        override fun updateProperty(
            params: EventDefinitionUpdatePropertyParams,
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
                        "v3",
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
}
