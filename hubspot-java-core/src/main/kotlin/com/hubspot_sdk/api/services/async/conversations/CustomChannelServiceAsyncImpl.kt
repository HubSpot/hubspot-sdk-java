// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

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
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.conversations.customchannels.CollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelCreateParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelDeleteParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelGetParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelListPageAsync
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelListParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelUpdateParams
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelIntegrationChannel
import com.hubspot_sdk.api.services.async.conversations.customchannels.ChannelAccountServiceAsync
import com.hubspot_sdk.api.services.async.conversations.customchannels.ChannelAccountServiceAsyncImpl
import com.hubspot_sdk.api.services.async.conversations.customchannels.ChannelAccountStagingTokenServiceAsync
import com.hubspot_sdk.api.services.async.conversations.customchannels.ChannelAccountStagingTokenServiceAsyncImpl
import com.hubspot_sdk.api.services.async.conversations.customchannels.MessageServiceAsync
import com.hubspot_sdk.api.services.async.conversations.customchannels.MessageServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CustomChannelServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomChannelServiceAsync {

    private val withRawResponse: CustomChannelServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val channelAccountStagingTokens: ChannelAccountStagingTokenServiceAsync by lazy {
        ChannelAccountStagingTokenServiceAsyncImpl(clientOptions)
    }

    private val channelAccounts: ChannelAccountServiceAsync by lazy {
        ChannelAccountServiceAsyncImpl(clientOptions)
    }

    private val messages: MessageServiceAsync by lazy { MessageServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CustomChannelServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomChannelServiceAsync =
        CustomChannelServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun channelAccountStagingTokens(): ChannelAccountStagingTokenServiceAsync =
        channelAccountStagingTokens

    override fun channelAccounts(): ChannelAccountServiceAsync = channelAccounts

    override fun messages(): MessageServiceAsync = messages

    override fun create(
        params: CustomChannelCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicChannelIntegrationChannel> =
        // post /conversations/v3/custom-channels/
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CustomChannelUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicChannelIntegrationChannel> =
        // patch /conversations/v3/custom-channels/{channelId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CustomChannelListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomChannelListPageAsync> =
        // get /conversations/v3/custom-channels/
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: CustomChannelDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /conversations/v3/custom-channels/{channelId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: CustomChannelGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicChannelIntegrationChannel> =
        // get /conversations/v3/custom-channels/{channelId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomChannelServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val channelAccountStagingTokens:
            ChannelAccountStagingTokenServiceAsync.WithRawResponse by lazy {
            ChannelAccountStagingTokenServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

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

        override fun channelAccountStagingTokens():
            ChannelAccountStagingTokenServiceAsync.WithRawResponse = channelAccountStagingTokens

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
                    .addPathSegments("conversations", "v3", "custom-channels", "")
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
                    .addPathSegments("conversations", "v3", "custom-channels", params._pathParam(0))
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
            Handler<CollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging> =
            jsonHandler<CollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging>(
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
                    .addPathSegments("conversations", "v3", "custom-channels", "")
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
                    .addPathSegments("conversations", "v3", "custom-channels", params._pathParam(0))
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

        private val getHandler: Handler<PublicChannelIntegrationChannel> =
            jsonHandler<PublicChannelIntegrationChannel>(clientOptions.jsonMapper)

        override fun get(
            params: CustomChannelGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicChannelIntegrationChannel>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("channelId", params.channelId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conversations", "v3", "custom-channels", params._pathParam(0))
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
