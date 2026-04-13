// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.events

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.handlers.errorBodyHandler
import com.hubspot.sdk.core.handlers.errorHandler
import com.hubspot.sdk.core.handlers.jsonHandler
import com.hubspot.sdk.core.http.HttpMethod
import com.hubspot.sdk.core.http.HttpRequest
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponse.Handler
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.events.occurrences.CollectionResponseExternalUnifiedEvent
import com.hubspot.sdk.models.events.occurrences.OccurrenceListEventTypesParams
import com.hubspot.sdk.models.events.occurrences.OccurrenceListPage
import com.hubspot.sdk.models.events.occurrences.OccurrenceListParams
import com.hubspot.sdk.models.events.occurrences.VisibleExternalEventTypeNames
import java.util.function.Consumer

class OccurrenceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OccurrenceService {

    private val withRawResponse: OccurrenceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OccurrenceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OccurrenceService =
        OccurrenceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: OccurrenceListParams,
        requestOptions: RequestOptions,
    ): OccurrenceListPage =
        // get /events/event-occurrences/2026-03
        withRawResponse().list(params, requestOptions).parse()

    override fun listEventTypes(
        params: OccurrenceListEventTypesParams,
        requestOptions: RequestOptions,
    ): VisibleExternalEventTypeNames =
        // get /events/event-occurrences/2026-03/event-types
        withRawResponse().listEventTypes(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OccurrenceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OccurrenceService.WithRawResponse =
            OccurrenceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponseExternalUnifiedEvent> =
            jsonHandler<CollectionResponseExternalUnifiedEvent>(clientOptions.jsonMapper)

        override fun list(
            params: OccurrenceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OccurrenceListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "event-occurrences", "2026-03")
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
                        OccurrenceListPage.builder()
                            .service(OccurrenceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listEventTypesHandler: Handler<VisibleExternalEventTypeNames> =
            jsonHandler<VisibleExternalEventTypeNames>(clientOptions.jsonMapper)

        override fun listEventTypes(
            params: OccurrenceListEventTypesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VisibleExternalEventTypeNames> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "event-occurrences", "2026-03", "event-types")
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
