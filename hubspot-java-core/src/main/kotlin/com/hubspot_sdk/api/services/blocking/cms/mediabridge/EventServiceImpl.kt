// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.mediabridge

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
import com.hubspot_sdk.api.core.http.json
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateAttentionSpanEventParams
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateAttentionSpanEventResponse
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateMediaPlayedEventParams
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateMediaPlayedEventResponse
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateMediaPlayedPercentEventParams
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateMediaPlayedPercentEventResponse
import java.util.function.Consumer

class EventServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EventService {

    private val withRawResponse: EventService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EventService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService =
        EventServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createAttentionSpanEvent(
        params: EventCreateAttentionSpanEventParams,
        requestOptions: RequestOptions,
    ): EventCreateAttentionSpanEventResponse =
        // post /media-bridge/v1/events/attention-span
        withRawResponse().createAttentionSpanEvent(params, requestOptions).parse()

    override fun createMediaPlayedEvent(
        params: EventCreateMediaPlayedEventParams,
        requestOptions: RequestOptions,
    ): EventCreateMediaPlayedEventResponse =
        // post /media-bridge/v1/events/media-played
        withRawResponse().createMediaPlayedEvent(params, requestOptions).parse()

    override fun createMediaPlayedPercentEvent(
        params: EventCreateMediaPlayedPercentEventParams,
        requestOptions: RequestOptions,
    ): EventCreateMediaPlayedPercentEventResponse =
        // post /media-bridge/v1/events/media-played-percent
        withRawResponse().createMediaPlayedPercentEvent(params, requestOptions).parse()

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

        private val createAttentionSpanEventHandler:
            Handler<EventCreateAttentionSpanEventResponse> =
            jsonHandler<EventCreateAttentionSpanEventResponse>(clientOptions.jsonMapper)

        override fun createAttentionSpanEvent(
            params: EventCreateAttentionSpanEventParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventCreateAttentionSpanEventResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "v1", "events", "attention-span")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createAttentionSpanEventHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createMediaPlayedEventHandler: Handler<EventCreateMediaPlayedEventResponse> =
            jsonHandler<EventCreateMediaPlayedEventResponse>(clientOptions.jsonMapper)

        override fun createMediaPlayedEvent(
            params: EventCreateMediaPlayedEventParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventCreateMediaPlayedEventResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "v1", "events", "media-played")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createMediaPlayedEventHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createMediaPlayedPercentEventHandler:
            Handler<EventCreateMediaPlayedPercentEventResponse> =
            jsonHandler<EventCreateMediaPlayedPercentEventResponse>(clientOptions.jsonMapper)

        override fun createMediaPlayedPercentEvent(
            params: EventCreateMediaPlayedPercentEventParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventCreateMediaPlayedPercentEventResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "v1", "events", "media-played-percent")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createMediaPlayedPercentEventHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
