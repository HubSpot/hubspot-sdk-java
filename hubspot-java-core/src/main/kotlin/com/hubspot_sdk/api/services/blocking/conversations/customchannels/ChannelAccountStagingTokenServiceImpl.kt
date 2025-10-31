// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations.customchannels

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
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccountstagingtokens.ChannelAccountStagingTokenUpdateParams
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccountstagingtokens.ChannelAccountStagingTokenUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ChannelAccountStagingTokenServiceImpl
internal constructor(private val clientOptions: ClientOptions) : ChannelAccountStagingTokenService {

    private val withRawResponse: ChannelAccountStagingTokenService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ChannelAccountStagingTokenService.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ChannelAccountStagingTokenService =
        ChannelAccountStagingTokenServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun update(
        params: ChannelAccountStagingTokenUpdateParams,
        requestOptions: RequestOptions,
    ): ChannelAccountStagingTokenUpdateResponse =
        // patch
        // /conversations/v3/custom-channels/{channelId}/channel-account-staging-tokens/{accountToken}
        withRawResponse().update(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChannelAccountStagingTokenService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChannelAccountStagingTokenService.WithRawResponse =
            ChannelAccountStagingTokenServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<ChannelAccountStagingTokenUpdateResponse> =
            jsonHandler<ChannelAccountStagingTokenUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ChannelAccountStagingTokenUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChannelAccountStagingTokenUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountToken", params.accountToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "conversations",
                        "v3",
                        "custom-channels",
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
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
