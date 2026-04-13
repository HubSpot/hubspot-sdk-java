// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.conversations.customchannels

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
import com.hubspot.core.prepare
import com.hubspot.models.conversations.customchannels.CollectionResponseWithTotalPublicChannelAccount
import com.hubspot.models.conversations.customchannels.PublicChannelAccount
import com.hubspot.models.conversations.customchannels.PublicChannelAccountStagingToken
import com.hubspot.models.conversations.customchannels.channelaccounts.ChannelAccountCreateParams
import com.hubspot.models.conversations.customchannels.channelaccounts.ChannelAccountListPage
import com.hubspot.models.conversations.customchannels.channelaccounts.ChannelAccountListParams
import com.hubspot.models.conversations.customchannels.channelaccounts.ChannelAccountUpdateParams
import com.hubspot.models.conversations.customchannels.channelaccounts.ChannelAccountUpdateStagingTokenParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ChannelAccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ChannelAccountService {

    private val withRawResponse: ChannelAccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ChannelAccountService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelAccountService =
        ChannelAccountServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ChannelAccountCreateParams,
        requestOptions: RequestOptions,
    ): PublicChannelAccount =
        // post /conversations/custom-channels/2026-03/{channelId}/channel-accounts
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: ChannelAccountUpdateParams,
        requestOptions: RequestOptions,
    ): PublicChannelAccount =
        // patch
        // /conversations/custom-channels/2026-03/{channelId}/channel-accounts/{channelAccountId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ChannelAccountListParams,
        requestOptions: RequestOptions,
    ): ChannelAccountListPage =
        // get /conversations/custom-channels/2026-03/{channelId}/channel-accounts
        withRawResponse().list(params, requestOptions).parse()

    override fun updateStagingToken(
        params: ChannelAccountUpdateStagingTokenParams,
        requestOptions: RequestOptions,
    ): PublicChannelAccountStagingToken =
        // patch
        // /conversations/custom-channels/2026-03/{channelId}/channel-account-staging-tokens/{accountToken}
        withRawResponse().updateStagingToken(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChannelAccountService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChannelAccountService.WithRawResponse =
            ChannelAccountServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PublicChannelAccount> =
            jsonHandler<PublicChannelAccount>(clientOptions.jsonMapper)

        override fun create(
            params: ChannelAccountCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicChannelAccount> {
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

        private val updateHandler: Handler<PublicChannelAccount> =
            jsonHandler<PublicChannelAccount>(clientOptions.jsonMapper)

        override fun update(
            params: ChannelAccountUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicChannelAccount> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CollectionResponseWithTotalPublicChannelAccount> =
            jsonHandler<CollectionResponseWithTotalPublicChannelAccount>(clientOptions.jsonMapper)

        override fun list(
            params: ChannelAccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChannelAccountListPage> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ChannelAccountListPage.builder()
                            .service(ChannelAccountServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val updateStagingTokenHandler: Handler<PublicChannelAccountStagingToken> =
            jsonHandler<PublicChannelAccountStagingToken>(clientOptions.jsonMapper)

        override fun updateStagingToken(
            params: ChannelAccountUpdateStagingTokenParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicChannelAccountStagingToken> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
