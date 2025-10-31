// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
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
import com.hubspot_sdk.api.models.conversations.visitoridentification.VisitorIdentificationGenerateTokenParams
import com.hubspot_sdk.api.models.conversations.visitoridentification.VisitorIdentificationGenerateTokenResponse
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
    ): CompletableFuture<VisitorIdentificationGenerateTokenResponse> =
        // post /visitor-identification/v3/tokens/create
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

        private val generateTokenHandler: Handler<VisitorIdentificationGenerateTokenResponse> =
            jsonHandler<VisitorIdentificationGenerateTokenResponse>(clientOptions.jsonMapper)

        override fun generateToken(
            params: VisitorIdentificationGenerateTokenParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VisitorIdentificationGenerateTokenResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("visitor-identification", "v3", "tokens", "create")
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
