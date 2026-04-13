// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.handlers.emptyHandler
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.handlers.jsonHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.core.http.json
import com.hubspot.core.http.parseable
import com.hubspot.core.prepareAsync
import com.hubspot.models.crm.timeline.AppEventResolutionResponse
import com.hubspot.models.crm.timeline.TimelineCreateEventParams
import com.hubspot.models.crm.timeline.TimelineCreateProjectTypeParams
import com.hubspot.services.async.crm.timeline.BatchServiceAsync
import com.hubspot.services.async.crm.timeline.BatchServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class TimelineServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TimelineServiceAsync {

    private val withRawResponse: TimelineServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TimelineServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TimelineServiceAsync =
        TimelineServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchServiceAsync = batch

    override fun createEvent(
        params: TimelineCreateEventParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /integrators/timeline/2026-03/events
        withRawResponse().createEvent(params, requestOptions).thenAccept {}

    override fun createProjectType(
        params: TimelineCreateProjectTypeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AppEventResolutionResponse> =
        // post /integrators/timeline/2026-03/types/projects
        withRawResponse().createProjectType(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TimelineServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TimelineServiceAsync.WithRawResponse =
            TimelineServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        private val createEventHandler: Handler<Void?> = emptyHandler()

        override fun createEvent(
            params: TimelineCreateEventParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("integrators", "timeline", "2026-03", "events")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { createEventHandler.handle(it) }
                    }
                }
        }

        private val createProjectTypeHandler: Handler<AppEventResolutionResponse> =
            jsonHandler<AppEventResolutionResponse>(clientOptions.jsonMapper)

        override fun createProjectType(
            params: TimelineCreateProjectTypeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AppEventResolutionResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("integrators", "timeline", "2026-03", "types", "projects")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createProjectTypeHandler.handle(it) }
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
