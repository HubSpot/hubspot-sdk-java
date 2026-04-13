// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.marketing.marketingevents

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
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
import com.hubspot.models.marketing.marketingevents.MarketingEventDefaultResponse
import com.hubspot.models.marketing.marketingevents.events.EventCancelByExternalEventIdParams
import com.hubspot.models.marketing.marketingevents.events.EventCompleteByExternalEventIdParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EventServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EventServiceAsync {

    private val withRawResponse: EventServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EventServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventServiceAsync =
        EventServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun cancelByExternalEventId(
        params: EventCancelByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MarketingEventDefaultResponse> =
        // post /marketing/marketing-events/2026-03/events/{externalEventId}/cancel
        withRawResponse().cancelByExternalEventId(params, requestOptions).thenApply { it.parse() }

    override fun completeByExternalEventId(
        params: EventCompleteByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MarketingEventDefaultResponse> =
        // post /marketing/marketing-events/2026-03/events/{externalEventId}/complete
        withRawResponse().completeByExternalEventId(params, requestOptions).thenApply { it.parse() }

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

        private val cancelByExternalEventIdHandler: Handler<MarketingEventDefaultResponse> =
            jsonHandler<MarketingEventDefaultResponse>(clientOptions.jsonMapper)

        override fun cancelByExternalEventId(
            params: EventCancelByExternalEventIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalEventId", params.externalEventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "marketing-events",
                        "2026-03",
                        "events",
                        params._pathParam(0),
                        "cancel",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cancelByExternalEventIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val completeByExternalEventIdHandler: Handler<MarketingEventDefaultResponse> =
            jsonHandler<MarketingEventDefaultResponse>(clientOptions.jsonMapper)

        override fun completeByExternalEventId(
            params: EventCompleteByExternalEventIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalEventId", params.externalEventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "marketing-events",
                        "2026-03",
                        "events",
                        params._pathParam(0),
                        "complete",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { completeByExternalEventIdHandler.handle(it) }
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
