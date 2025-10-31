// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.mediabridge

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
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.cms.mediabridge.AttentionSpanEvent
import com.hubspot_sdk.api.models.cms.mediabridge.MediaPlayedEvent
import com.hubspot_sdk.api.models.cms.mediabridge.MediaPlayedPercentageEvent
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateAttentionSpanEventParams
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateMediaPlayedEventParams
import com.hubspot_sdk.api.models.cms.mediabridge.events.EventCreateMediaPlayedPercentEventParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class EventServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EventServiceAsync {

    private val withRawResponse: EventServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EventServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventServiceAsync =
        EventServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createAttentionSpanEvent(
        params: EventCreateAttentionSpanEventParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AttentionSpanEvent> =
        // post /media-bridge/v1/events/attention-span
        withRawResponse().createAttentionSpanEvent(params, requestOptions).thenApply { it.parse() }

    override fun createMediaPlayedEvent(
        params: EventCreateMediaPlayedEventParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MediaPlayedEvent> =
        // post /media-bridge/v1/events/media-played
        withRawResponse().createMediaPlayedEvent(params, requestOptions).thenApply { it.parse() }

    override fun createMediaPlayedPercentEvent(
        params: EventCreateMediaPlayedPercentEventParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MediaPlayedPercentageEvent> =
        // post /media-bridge/v1/events/media-played-percent
        withRawResponse().createMediaPlayedPercentEvent(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventServiceAsync.WithRawResponse =
            EventServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createAttentionSpanEventHandler: Handler<AttentionSpanEvent> =
            jsonHandler<AttentionSpanEvent>(clientOptions.jsonMapper)

        override fun createAttentionSpanEvent(
            params: EventCreateAttentionSpanEventParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AttentionSpanEvent>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "v1", "events", "attention-span")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createAttentionSpanEventHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createMediaPlayedEventHandler: Handler<MediaPlayedEvent> =
            jsonHandler<MediaPlayedEvent>(clientOptions.jsonMapper)

        override fun createMediaPlayedEvent(
            params: EventCreateMediaPlayedEventParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MediaPlayedEvent>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "v1", "events", "media-played")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createMediaPlayedEventHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createMediaPlayedPercentEventHandler: Handler<MediaPlayedPercentageEvent> =
            jsonHandler<MediaPlayedPercentageEvent>(clientOptions.jsonMapper)

        override fun createMediaPlayedPercentEvent(
            params: EventCreateMediaPlayedPercentEventParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MediaPlayedPercentageEvent>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "v1", "events", "media-played-percent")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
