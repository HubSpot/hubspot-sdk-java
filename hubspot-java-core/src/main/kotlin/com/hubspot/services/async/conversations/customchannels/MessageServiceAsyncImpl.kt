// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.conversations.customchannels

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
import com.hubspot.models.conversations.customchannels.PublicConversationsMessage
import com.hubspot.models.conversations.customchannels.messages.MessageCreateParams
import com.hubspot.models.conversations.customchannels.messages.MessageGetParams
import com.hubspot.models.conversations.customchannels.messages.MessageUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MessageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MessageServiceAsync {

    private val withRawResponse: MessageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MessageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageServiceAsync =
        MessageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: MessageCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicConversationsMessage> =
        // post /conversations/custom-channels/2026-03/{channelId}/messages
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: MessageUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicConversationsMessage> =
        // patch /conversations/custom-channels/2026-03/{channelId}/messages/{messageId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: MessageGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicConversationsMessage> =
        // get /conversations/custom-channels/2026-03/{channelId}/messages/{messageId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessageServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessageServiceAsync.WithRawResponse =
            MessageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PublicConversationsMessage> =
            jsonHandler<PublicConversationsMessage>(clientOptions.jsonMapper)

        override fun create(
            params: MessageCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicConversationsMessage>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("channelId", params.channelId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "conversations",
                        "custom-channels",
                        "2026-03",
                        params._pathParam(0),
                        "messages",
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
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<PublicConversationsMessage> =
            jsonHandler<PublicConversationsMessage>(clientOptions.jsonMapper)

        override fun update(
            params: MessageUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicConversationsMessage>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("messageId", params.messageId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "conversations",
                        "custom-channels",
                        "2026-03",
                        params._pathParam(0),
                        "messages",
                        params._pathParam(1),
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
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<PublicConversationsMessage> =
            jsonHandler<PublicConversationsMessage>(clientOptions.jsonMapper)

        override fun get(
            params: MessageGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicConversationsMessage>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("messageId", params.messageId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "conversations",
                        "custom-channels",
                        "2026-03",
                        params._pathParam(0),
                        "messages",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
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
