// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.conversations

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
import com.hubspot.models.conversations.visitoridentification.IdentificationTokenResponse
import com.hubspot.models.conversations.visitoridentification.VisitorIdentificationGenerateTokenParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class VisitorIdentificationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : VisitorIdentificationServiceAsync {

    private val withRawResponse: VisitorIdentificationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VisitorIdentificationServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): VisitorIdentificationServiceAsync =
        VisitorIdentificationServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun generateToken(
        params: VisitorIdentificationGenerateTokenParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IdentificationTokenResponse> =
        // post /visitor-identification/2026-03/tokens/create
        withRawResponse().generateToken(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VisitorIdentificationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VisitorIdentificationServiceAsync.WithRawResponse =
            VisitorIdentificationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val generateTokenHandler: Handler<IdentificationTokenResponse> =
            jsonHandler<IdentificationTokenResponse>(clientOptions.jsonMapper)

        override fun generateToken(
            params: VisitorIdentificationGenerateTokenParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IdentificationTokenResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("visitor-identification", "2026-03", "tokens", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { generateTokenHandler.handle(it) }
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
