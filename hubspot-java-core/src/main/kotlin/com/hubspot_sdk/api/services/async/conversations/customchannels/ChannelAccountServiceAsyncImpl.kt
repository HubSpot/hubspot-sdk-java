// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations.customchannels

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
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
import com.hubspot_sdk.api.models.conversations.customchannels.CollectionResponseWithTotalPublicChannelAccount
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelAccount
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelAccountStagingToken
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountCreateParams
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountListPageAsync
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountListParams
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountUpdateParams
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountUpdateStagingTokenParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ChannelAccountServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ChannelAccountServiceAsync {

    private val withRawResponse: ChannelAccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ChannelAccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ChannelAccountServiceAsync =
        ChannelAccountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ChannelAccountCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicChannelAccount> =
        // post /conversations/custom-channels/2026-03/{channelId}/channel-accounts
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ChannelAccountUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicChannelAccount> =
        // patch
        // /conversations/custom-channels/2026-03/{channelId}/channel-accounts/{channelAccountId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ChannelAccountListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChannelAccountListPageAsync> =
        // get /conversations/custom-channels/2026-03/{channelId}/channel-accounts
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun updateStagingToken(
        params: ChannelAccountUpdateStagingTokenParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicChannelAccountStagingToken> =
        // patch
        // /conversations/custom-channels/2026-03/{channelId}/channel-account-staging-tokens/{accountToken}
        withRawResponse().updateStagingToken(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChannelAccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChannelAccountServiceAsync.WithRawResponse =
            ChannelAccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PublicChannelAccount> =
            jsonHandler<PublicChannelAccount>(clientOptions.jsonMapper)

        override fun create(
            params: ChannelAccountCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicChannelAccount>> {
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
                        "channel-accounts",
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

        private val updateHandler: Handler<PublicChannelAccount> =
            jsonHandler<PublicChannelAccount>(clientOptions.jsonMapper)

        override fun update(
            params: ChannelAccountUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicChannelAccount>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("channelAccountId", params.channelAccountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "conversations",
                        "custom-channels",
                        "2026-03",
                        params._pathParam(0),
                        "channel-accounts",
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

        private val listHandler: Handler<CollectionResponseWithTotalPublicChannelAccount> =
            jsonHandler<CollectionResponseWithTotalPublicChannelAccount>(clientOptions.jsonMapper)

        override fun list(
            params: ChannelAccountListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChannelAccountListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("channelId", params.channelId().getOrNull())
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
                    )
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
                                ChannelAccountListPageAsync.builder()
                                    .service(ChannelAccountServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val updateStagingTokenHandler: Handler<PublicChannelAccountStagingToken> =
            jsonHandler<PublicChannelAccountStagingToken>(clientOptions.jsonMapper)

        override fun updateStagingToken(
            params: ChannelAccountUpdateStagingTokenParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicChannelAccountStagingToken>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountToken", params.accountToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "conversations",
                        "custom-channels",
                        "2026-03",
                        params._pathParam(0),
                        "channel-account-staging-tokens",
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
                            .use { updateStagingTokenHandler.handle(it) }
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
