// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

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
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.events.CollectionResponseExternalUnifiedEvent
import com.hubspot_sdk.api.models.events.EventListEventTypesParams
import com.hubspot_sdk.api.models.events.EventListPage
import com.hubspot_sdk.api.models.events.EventListParams
import com.hubspot_sdk.api.models.events.VisibleExternalEventTypeNames
import com.hubspot_sdk.api.services.blocking.events.EventDefinitionService
import com.hubspot_sdk.api.services.blocking.events.EventDefinitionServiceImpl
import com.hubspot_sdk.api.services.blocking.events.SendService
import com.hubspot_sdk.api.services.blocking.events.SendServiceImpl
import java.util.function.Consumer

class EventServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EventService {

    private val withRawResponse: EventService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val eventDefinitions: EventDefinitionService by lazy {
        EventDefinitionServiceImpl(clientOptions)
    }

    private val send: SendService by lazy { SendServiceImpl(clientOptions) }

    override fun withRawResponse(): EventService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService =
        EventServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun eventDefinitions(): EventDefinitionService = eventDefinitions

    override fun send(): SendService = send

    override fun list(params: EventListParams, requestOptions: RequestOptions): EventListPage =
        // get /events/v3/events/
        withRawResponse().list(params, requestOptions).parse()

    override fun listEventTypes(
        params: EventListEventTypesParams,
        requestOptions: RequestOptions,
    ): VisibleExternalEventTypeNames =
        // get /events/v3/events/event-types
        withRawResponse().listEventTypes(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val eventDefinitions: EventDefinitionService.WithRawResponse by lazy {
            EventDefinitionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val send: SendService.WithRawResponse by lazy {
            SendServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventService.WithRawResponse =
            EventServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun eventDefinitions(): EventDefinitionService.WithRawResponse = eventDefinitions

        override fun send(): SendService.WithRawResponse = send

        private val listHandler: Handler<CollectionResponseExternalUnifiedEvent> =
            jsonHandler<CollectionResponseExternalUnifiedEvent>(clientOptions.jsonMapper)

        override fun list(
            params: EventListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "v3", "events", "")
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
                        EventListPage.builder()
                            .service(EventServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listEventTypesHandler: Handler<VisibleExternalEventTypeNames> =
            jsonHandler<VisibleExternalEventTypeNames>(clientOptions.jsonMapper)

        override fun listEventTypes(
            params: EventListEventTypesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VisibleExternalEventTypeNames> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "v3", "events", "event-types")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
