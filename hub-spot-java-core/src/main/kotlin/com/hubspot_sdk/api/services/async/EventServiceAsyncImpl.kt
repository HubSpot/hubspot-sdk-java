// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.handlers.errorBodyHandler
import com.hubspot_sdk.api.core.handlers.errorHandler
import com.hubspot_sdk.api.core.handlers.jsonHandler
import com.hubspot_sdk.api.core.http.HttpMethod
import com.hubspot_sdk.api.core.http.HttpRequest
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponse.Handler
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.events.CollectionResponseExternalUnifiedEvent
import com.hubspot_sdk.api.models.events.EventListEventTypesParams
import com.hubspot_sdk.api.models.events.EventListPageAsync
import com.hubspot_sdk.api.models.events.EventListParams
import com.hubspot_sdk.api.models.events.VisibleExternalEventTypeNames
import com.hubspot_sdk.api.services.async.events.EventDefinitionServiceAsync
import com.hubspot_sdk.api.services.async.events.EventDefinitionServiceAsyncImpl
import com.hubspot_sdk.api.services.async.events.SendServiceAsync
import com.hubspot_sdk.api.services.async.events.SendServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class EventServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EventServiceAsync {

    private val withRawResponse: EventServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val eventDefinitions: EventDefinitionServiceAsync by lazy {
        EventDefinitionServiceAsyncImpl(clientOptions)
    }

    private val send: SendServiceAsync by lazy { SendServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EventServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventServiceAsync =
        EventServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun eventDefinitions(): EventDefinitionServiceAsync = eventDefinitions

    override fun send(): SendServiceAsync = send

    override fun list(
        params: EventListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventListPageAsync> =
        // get /events/v3/events/
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun listEventTypes(
        params: EventListEventTypesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VisibleExternalEventTypeNames> =
        // get /events/v3/events/event-types
        withRawResponse().listEventTypes(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val eventDefinitions: EventDefinitionServiceAsync.WithRawResponse by lazy {
            EventDefinitionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val send: SendServiceAsync.WithRawResponse by lazy {
            SendServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventServiceAsync.WithRawResponse =
            EventServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun eventDefinitions(): EventDefinitionServiceAsync.WithRawResponse =
            eventDefinitions

        override fun send(): SendServiceAsync.WithRawResponse = send

        private val listHandler: Handler<CollectionResponseExternalUnifiedEvent> =
            jsonHandler<CollectionResponseExternalUnifiedEvent>(clientOptions.jsonMapper)

        override fun list(
            params: EventListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "v3", "events", "")
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
                                EventListPageAsync.builder()
                                    .service(EventServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listEventTypesHandler: Handler<VisibleExternalEventTypeNames> =
            jsonHandler<VisibleExternalEventTypeNames>(clientOptions.jsonMapper)

        override fun listEventTypes(
            params: EventListEventTypesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VisibleExternalEventTypeNames>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "v3", "events", "event-types")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listEventTypesHandler.handle(it) }
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
