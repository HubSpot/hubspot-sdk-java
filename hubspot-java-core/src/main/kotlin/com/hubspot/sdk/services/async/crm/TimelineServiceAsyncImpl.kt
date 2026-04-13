// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.handlers.emptyHandler
import com.hubspot.sdk.core.handlers.errorBodyHandler
import com.hubspot.sdk.core.handlers.errorHandler
import com.hubspot.sdk.core.handlers.jsonHandler
import com.hubspot.sdk.core.http.HttpMethod
import com.hubspot.sdk.core.http.HttpRequest
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponse.Handler
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.core.http.json
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepareAsync
import com.hubspot.sdk.models.crm.timeline.AppEventResolutionResponse
import com.hubspot.sdk.models.crm.timeline.TimelineCreateEventParams
import com.hubspot.sdk.models.crm.timeline.TimelineCreateProjectTypeParams
import com.hubspot.sdk.services.async.crm.timeline.BatchServiceAsync
import com.hubspot.sdk.services.async.crm.timeline.BatchServiceAsyncImpl
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
