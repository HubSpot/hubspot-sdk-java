// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.marketing

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
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
import com.hubspot.models.marketing.EmailSendStatusView
import com.hubspot.models.marketing.singlesend.SingleSendCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SingleSendServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SingleSendServiceAsync {

    private val withRawResponse: SingleSendServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SingleSendServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SingleSendServiceAsync =
        SingleSendServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SingleSendCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailSendStatusView> =
        // post /marketing/email-campaigns/2026-03/single-send
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SingleSendServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SingleSendServiceAsync.WithRawResponse =
            SingleSendServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EmailSendStatusView> =
            jsonHandler<EmailSendStatusView>(clientOptions.jsonMapper)

        override fun create(
            params: SingleSendCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailSendStatusView>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "email-campaigns", "2026-03", "single-send")
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
    }
}
