// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations

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
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.conversations.CollectionResponseWithTotalPublicChannelAccountForwardPaging
import com.hubspot_sdk.api.models.conversations.ConversationsPublicChannelAccount
import com.hubspot_sdk.api.models.conversations.channelaccounts.ChannelAccountGetParams
import com.hubspot_sdk.api.models.conversations.channelaccounts.ChannelAccountListParams
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

    override fun list(
        params: ChannelAccountListParams,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalPublicChannelAccountForwardPaging =
        // get /conversations/v3/conversations/channel-accounts
        withRawResponse().list(params, requestOptions).parse()

    override fun get(
        params: ChannelAccountGetParams,
        requestOptions: RequestOptions,
    ): ConversationsPublicChannelAccount =
        // get /conversations/v3/conversations/channel-accounts/{channelAccountId}
        withRawResponse().get(params, requestOptions).parse()

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

        private val listHandler:
            Handler<CollectionResponseWithTotalPublicChannelAccountForwardPaging> =
            jsonHandler<CollectionResponseWithTotalPublicChannelAccountForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: ChannelAccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalPublicChannelAccountForwardPaging> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conversations", "v3", "conversations", "channel-accounts")
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
            }
        }

        private val getHandler: Handler<ConversationsPublicChannelAccount> =
            jsonHandler<ConversationsPublicChannelAccount>(clientOptions.jsonMapper)

        override fun get(
            params: ChannelAccountGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConversationsPublicChannelAccount> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("channelAccountId", params.channelAccountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "conversations",
                        "v3",
                        "conversations",
                        "channel-accounts",
                        params._pathParam(0),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
