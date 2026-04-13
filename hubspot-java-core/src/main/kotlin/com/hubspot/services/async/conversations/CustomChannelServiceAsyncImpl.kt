// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.conversations

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
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
import com.hubspot.models.conversations.customchannels.CollectionResponseWithTotalPublicChannelIntegrationChannel
import com.hubspot.models.conversations.customchannels.CustomChannelCreateParams
import com.hubspot.models.conversations.customchannels.CustomChannelDeleteParams
import com.hubspot.models.conversations.customchannels.CustomChannelGetParams
import com.hubspot.models.conversations.customchannels.CustomChannelListPageAsync
import com.hubspot.models.conversations.customchannels.CustomChannelListParams
import com.hubspot.models.conversations.customchannels.CustomChannelUpdateParams
import com.hubspot.models.conversations.customchannels.PublicChannelAccount
import com.hubspot.models.conversations.customchannels.PublicChannelIntegrationChannel
import com.hubspot.services.async.conversations.customchannels.ChannelAccountServiceAsync
import com.hubspot.services.async.conversations.customchannels.ChannelAccountServiceAsyncImpl
import com.hubspot.services.async.conversations.customchannels.MessageServiceAsync
import com.hubspot.services.async.conversations.customchannels.MessageServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CustomChannelServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomChannelServiceAsync {

    private val withRawResponse: CustomChannelServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val channelAccounts: ChannelAccountServiceAsync by lazy {
        ChannelAccountServiceAsyncImpl(clientOptions)
    }

    private val messages: MessageServiceAsync by lazy { MessageServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CustomChannelServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomChannelServiceAsync =
        CustomChannelServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun channelAccounts(): ChannelAccountServiceAsync = channelAccounts

    override fun messages(): MessageServiceAsync = messages

    override fun create(
        params: CustomChannelCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicChannelIntegrationChannel> =
        // post /conversations/custom-channels/2026-03
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CustomChannelUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicChannelIntegrationChannel> =
        // patch /conversations/custom-channels/2026-03/{channelId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CustomChannelListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomChannelListPageAsync> =
        // get /conversations/custom-channels/2026-03
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: CustomChannelDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /conversations/custom-channels/2026-03/{channelId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: CustomChannelGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicChannelAccount> =
        // get
        // /conversations/custom-channels/2026-03/{channelId}/channel-accounts/{channelAccountId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomChannelServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val channelAccounts: ChannelAccountServiceAsync.WithRawResponse by lazy {
            ChannelAccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val messages: MessageServiceAsync.WithRawResponse by lazy {
            MessageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomChannelServiceAsync.WithRawResponse =
            CustomChannelServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun channelAccounts(): ChannelAccountServiceAsync.WithRawResponse = channelAccounts

        override fun messages(): MessageServiceAsync.WithRawResponse = messages

        private val createHandler: Handler<PublicChannelIntegrationChannel> =
            jsonHandler<PublicChannelIntegrationChannel>(clientOptions.jsonMapper)

        override fun create(
            params: CustomChannelCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicChannelIntegrationChannel>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conversations", "custom-channels", "2026-03")
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

        private val updateHandler: Handler<PublicChannelIntegrationChannel> =
            jsonHandler<PublicChannelIntegrationChannel>(clientOptions.jsonMapper)

        override fun update(
            params: CustomChannelUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicChannelIntegrationChannel>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("channelId", params.channelId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "conversations",
                        "custom-channels",
                        "2026-03",
                        params._pathParam(0),
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

        private val listHandler:
            Handler<CollectionResponseWithTotalPublicChannelIntegrationChannel> =
            jsonHandler<CollectionResponseWithTotalPublicChannelIntegrationChannel>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: CustomChannelListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomChannelListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conversations", "custom-channels", "2026-03")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                CustomChannelListPageAsync.builder()
                                    .service(CustomChannelServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: CustomChannelDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("channelId", params.channelId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "conversations",
                        "custom-channels",
                        "2026-03",
                        params._pathParam(0),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<PublicChannelAccount> =
            jsonHandler<PublicChannelAccount>(clientOptions.jsonMapper)

        override fun get(
            params: CustomChannelGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicChannelAccount>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("channelAccountId", params.channelAccountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "conversations",
                        "custom-channels",
                        "2026-03",
                        params._pathParam(0),
                        "channel-accounts",
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
