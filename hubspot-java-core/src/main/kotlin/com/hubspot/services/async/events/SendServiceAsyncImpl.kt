// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.events

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.handlers.emptyHandler
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.json
import com.hubspot.core.http.parseable
import com.hubspot.core.prepareAsync
import com.hubspot.models.events.send.SendBatchSendParams
import com.hubspot.models.events.send.SendSendParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SendServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SendServiceAsync {

    private val withRawResponse: SendServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SendServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SendServiceAsync =
        SendServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batchSend(
        params: SendBatchSendParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /events/2026-03/send/batch
        withRawResponse().batchSend(params, requestOptions).thenAccept {}

    override fun send(
        params: SendSendParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /events/2026-03/send
        withRawResponse().send(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SendServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SendServiceAsync.WithRawResponse =
            SendServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val batchSendHandler: Handler<Void?> = emptyHandler()

        override fun batchSend(
            params: SendBatchSendParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "2026-03", "send", "batch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { batchSendHandler.handle(it) }
                    }
                }
        }

        private val sendHandler: Handler<Void?> = emptyHandler()

        override fun send(
            params: SendSendParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "2026-03", "send")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { sendHandler.handle(it) }
                    }
                }
        }
    }
}
