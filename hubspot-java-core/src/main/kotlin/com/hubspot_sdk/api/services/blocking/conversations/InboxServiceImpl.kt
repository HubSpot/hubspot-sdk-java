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
import com.hubspot_sdk.api.models.conversations.CollectionResponseWithTotalPublicInboxForwardPaging
import com.hubspot_sdk.api.models.conversations.PublicInbox
import com.hubspot_sdk.api.models.conversations.inboxes.InboxGetParams
import com.hubspot_sdk.api.models.conversations.inboxes.InboxListPage
import com.hubspot_sdk.api.models.conversations.inboxes.InboxListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InboxServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InboxService {

    private val withRawResponse: InboxService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboxService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboxService =
        InboxServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: InboxListParams, requestOptions: RequestOptions): InboxListPage =
        // get /conversations/v3/conversations/inboxes
        withRawResponse().list(params, requestOptions).parse()

    override fun get(params: InboxGetParams, requestOptions: RequestOptions): PublicInbox =
        // get /conversations/v3/conversations/inboxes/{inboxId}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboxService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboxService.WithRawResponse =
            InboxServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponseWithTotalPublicInboxForwardPaging> =
            jsonHandler<CollectionResponseWithTotalPublicInboxForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: InboxListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboxListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conversations", "v3", "conversations", "inboxes")
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
                        InboxListPage.builder()
                            .service(InboxServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getHandler: Handler<PublicInbox> =
            jsonHandler<PublicInbox>(clientOptions.jsonMapper)

        override fun get(
            params: InboxGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicInbox> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboxId", params.inboxId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "conversations",
                        "v3",
                        "conversations",
                        "inboxes",
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
