// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations

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
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.conversations.customchannels.CollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelCreateParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelDeleteParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelGetParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelListParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelUpdateParams
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelIntegrationChannel
import com.hubspot_sdk.api.services.blocking.conversations.customchannels.ChannelAccountService
import com.hubspot_sdk.api.services.blocking.conversations.customchannels.ChannelAccountServiceImpl
import com.hubspot_sdk.api.services.blocking.conversations.customchannels.ChannelAccountStagingTokenService
import com.hubspot_sdk.api.services.blocking.conversations.customchannels.ChannelAccountStagingTokenServiceImpl
import com.hubspot_sdk.api.services.blocking.conversations.customchannels.MessageService
import com.hubspot_sdk.api.services.blocking.conversations.customchannels.MessageServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CustomChannelServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomChannelService {

    private val withRawResponse: CustomChannelService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val channelAccountStagingTokens: ChannelAccountStagingTokenService by lazy {
        ChannelAccountStagingTokenServiceImpl(clientOptions)
    }

    private val channelAccounts: ChannelAccountService by lazy {
        ChannelAccountServiceImpl(clientOptions)
    }

    private val messages: MessageService by lazy { MessageServiceImpl(clientOptions) }

    override fun withRawResponse(): CustomChannelService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomChannelService =
        CustomChannelServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun channelAccountStagingTokens(): ChannelAccountStagingTokenService =
        channelAccountStagingTokens

    override fun channelAccounts(): ChannelAccountService = channelAccounts

    override fun messages(): MessageService = messages

    override fun create(
        params: CustomChannelCreateParams,
        requestOptions: RequestOptions,
    ): PublicChannelIntegrationChannel =
        // post /conversations/v3/custom-channels/
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: CustomChannelUpdateParams,
        requestOptions: RequestOptions,
    ): PublicChannelIntegrationChannel =
        // patch /conversations/v3/custom-channels/{channelId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CustomChannelListParams,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging =
        // get /conversations/v3/custom-channels/
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: CustomChannelDeleteParams, requestOptions: RequestOptions) {
        // delete /conversations/v3/custom-channels/{channelId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(
        params: CustomChannelGetParams,
        requestOptions: RequestOptions,
    ): PublicChannelIntegrationChannel =
        // get /conversations/v3/custom-channels/{channelId}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomChannelService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val channelAccountStagingTokens:
            ChannelAccountStagingTokenService.WithRawResponse by lazy {
            ChannelAccountStagingTokenServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val channelAccounts: ChannelAccountService.WithRawResponse by lazy {
            ChannelAccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val messages: MessageService.WithRawResponse by lazy {
            MessageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomChannelService.WithRawResponse =
            CustomChannelServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun channelAccountStagingTokens():
            ChannelAccountStagingTokenService.WithRawResponse = channelAccountStagingTokens

        override fun channelAccounts(): ChannelAccountService.WithRawResponse = channelAccounts

        override fun messages(): MessageService.WithRawResponse = messages

        private val createHandler: Handler<PublicChannelIntegrationChannel> =
            jsonHandler<PublicChannelIntegrationChannel>(clientOptions.jsonMapper)

        override fun create(
            params: CustomChannelCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicChannelIntegrationChannel> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conversations", "v3", "custom-channels", "")
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

        private val updateHandler: Handler<PublicChannelIntegrationChannel> =
            jsonHandler<PublicChannelIntegrationChannel>(clientOptions.jsonMapper)

        override fun update(
            params: CustomChannelUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicChannelIntegrationChannel> {
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

        private val listHandler:
            Handler<CollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging> =
            jsonHandler<CollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: CustomChannelListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<
            CollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging
        > {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conversations", "v3", "custom-channels", "")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: CustomChannelDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<PublicChannelIntegrationChannel> =
            jsonHandler<PublicChannelIntegrationChannel>(clientOptions.jsonMapper)

        override fun get(
            params: CustomChannelGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicChannelIntegrationChannel> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("channelId", params.channelId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conversations", "v3", "custom-channels", params._pathParam(0))
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
