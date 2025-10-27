// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.events

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.handlers.emptyHandler
import com.hubspot_sdk.api.core.handlers.errorBodyHandler
import com.hubspot_sdk.api.core.handlers.errorHandler
import com.hubspot_sdk.api.core.http.HttpMethod
import com.hubspot_sdk.api.core.http.HttpRequest
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponse.Handler
import com.hubspot_sdk.api.core.http.json
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.events.send.SendSendBatchParams
import com.hubspot_sdk.api.models.events.send.SendSendParams
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

    override fun send(
        params: SendSendParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /events/v3/send
        withRawResponse().send(params, requestOptions).thenAccept {}

    override fun sendBatch(
        params: SendSendBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /events/v3/send/batch
        withRawResponse().sendBatch(params, requestOptions).thenAccept {}

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

        private val sendHandler: Handler<Void?> = emptyHandler()

        override fun send(
            params: SendSendParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "v3", "send")
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

        private val sendBatchHandler: Handler<Void?> = emptyHandler()

        override fun sendBatch(
            params: SendSendBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "v3", "send", "batch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { sendBatchHandler.handle(it) }
                    }
                }
        }
    }
}
