// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.timeline

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
import com.hubspot_sdk.api.models.crm.timeline.EventDetail
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventResponse
import com.hubspot_sdk.api.models.crm.timeline.events.EventBatchCreateParams
import com.hubspot_sdk.api.models.crm.timeline.events.EventCreateParams
import com.hubspot_sdk.api.models.crm.timeline.events.EventGetDetailParams
import com.hubspot_sdk.api.models.crm.timeline.events.EventGetParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EventServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EventService {

    private val withRawResponse: EventService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EventService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService =
        EventServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: EventCreateParams,
        requestOptions: RequestOptions,
    ): TimelineEventResponse =
        // post /integrators/timeline/v3/events
        withRawResponse().create(params, requestOptions).parse()

    override fun batchCreate(params: EventBatchCreateParams, requestOptions: RequestOptions) {
        // post /integrators/timeline/v3/events/batch/create
        withRawResponse().batchCreate(params, requestOptions)
    }

    override fun get(
        params: EventGetParams,
        requestOptions: RequestOptions,
    ): TimelineEventResponse =
        // get /integrators/timeline/v3/events/{eventTemplateId}/{eventId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getDetail(
        params: EventGetDetailParams,
        requestOptions: RequestOptions,
    ): EventDetail =
        // get /integrators/timeline/v3/events/{eventTemplateId}/{eventId}/detail
        withRawResponse().getDetail(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventService.WithRawResponse =
            EventServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TimelineEventResponse> =
            jsonHandler<TimelineEventResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EventCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TimelineEventResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("integrators", "timeline", "v3", "events")
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

        private val batchCreateHandler: Handler<Void?> = emptyHandler()

        override fun batchCreate(
            params: EventBatchCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("integrators", "timeline", "v3", "events", "batch", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { batchCreateHandler.handle(it) }
            }
        }

        private val getHandler: Handler<TimelineEventResponse> =
            jsonHandler<TimelineEventResponse>(clientOptions.jsonMapper)

        override fun get(
            params: EventGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TimelineEventResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventId", params.eventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "integrators",
                        "timeline",
                        "v3",
                        "events",
                        params._pathParam(0),
                        params._pathParam(1),
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

        private val getDetailHandler: Handler<EventDetail> =
            jsonHandler<EventDetail>(clientOptions.jsonMapper)

        override fun getDetail(
            params: EventGetDetailParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventDetail> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventId", params.eventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "integrators",
                        "timeline",
                        "v3",
                        "events",
                        params._pathParam(0),
                        params._pathParam(1),
                        "detail",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getDetailHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
