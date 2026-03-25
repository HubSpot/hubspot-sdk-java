// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.events

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
import com.hubspot_sdk.api.models.events.occurrences.CollectionResponseExternalUnifiedEvent
import com.hubspot_sdk.api.models.events.occurrences.OccurrenceListEventTypesParams
import com.hubspot_sdk.api.models.events.occurrences.OccurrenceListPageAsync
import com.hubspot_sdk.api.models.events.occurrences.OccurrenceListParams
import com.hubspot_sdk.api.models.events.occurrences.VisibleExternalEventTypeNames
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class OccurrenceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OccurrenceServiceAsync {

    private val withRawResponse: OccurrenceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OccurrenceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OccurrenceServiceAsync =
        OccurrenceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: OccurrenceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OccurrenceListPageAsync> =
        // get /events/event-occurrences/2026-03
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun listEventTypes(
        params: OccurrenceListEventTypesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VisibleExternalEventTypeNames> =
        // get /events/event-occurrences/2026-03/event-types
        withRawResponse().listEventTypes(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OccurrenceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OccurrenceServiceAsync.WithRawResponse =
            OccurrenceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponseExternalUnifiedEvent> =
            jsonHandler<CollectionResponseExternalUnifiedEvent>(clientOptions.jsonMapper)

        override fun list(
            params: OccurrenceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OccurrenceListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "event-occurrences", "2026-03")
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
                                OccurrenceListPageAsync.builder()
                                    .service(OccurrenceServiceAsyncImpl(clientOptions))
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
            params: OccurrenceListEventTypesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VisibleExternalEventTypeNames>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "event-occurrences", "2026-03", "event-types")
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
