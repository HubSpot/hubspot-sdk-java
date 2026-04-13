// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm

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
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.crm.timeline.AppEventResolutionResponse
import com.hubspot.sdk.models.crm.timeline.TimelineCreateEventParams
import com.hubspot.sdk.models.crm.timeline.TimelineCreateProjectTypeParams
import com.hubspot.sdk.services.blocking.crm.timeline.BatchService
import com.hubspot.sdk.services.blocking.crm.timeline.BatchServiceImpl
import java.util.function.Consumer

class TimelineServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TimelineService {

    private val withRawResponse: TimelineService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): TimelineService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TimelineService =
        TimelineServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun createEvent(params: TimelineCreateEventParams, requestOptions: RequestOptions) {
        // post /integrators/timeline/2026-03/events
        withRawResponse().createEvent(params, requestOptions)
    }

    override fun createProjectType(
        params: TimelineCreateProjectTypeParams,
        requestOptions: RequestOptions,
    ): AppEventResolutionResponse =
        // post /integrators/timeline/2026-03/types/projects
        withRawResponse().createProjectType(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TimelineService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TimelineService.WithRawResponse =
            TimelineServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        private val createEventHandler: Handler<Void?> = emptyHandler()

        override fun createEvent(
            params: TimelineCreateEventParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("integrators", "timeline", "2026-03", "events")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createEventHandler.handle(it) }
            }
        }

        private val createProjectTypeHandler: Handler<AppEventResolutionResponse> =
            jsonHandler<AppEventResolutionResponse>(clientOptions.jsonMapper)

        override fun createProjectType(
            params: TimelineCreateProjectTypeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AppEventResolutionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("integrators", "timeline", "2026-03", "types", "projects")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
