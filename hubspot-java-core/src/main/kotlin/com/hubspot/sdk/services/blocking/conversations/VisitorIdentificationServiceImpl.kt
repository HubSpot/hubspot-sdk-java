// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.conversations

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.handlers.errorBodyHandler
import com.hubspot.sdk.core.handlers.errorHandler
import com.hubspot.sdk.core.handlers.jsonHandler
import com.hubspot.sdk.core.http.HttpMethod
import com.hubspot.sdk.core.http.HttpRequest
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponse.Handler
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.core.http.json
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.conversations.visitoridentification.IdentificationTokenResponse
import com.hubspot.sdk.models.conversations.visitoridentification.VisitorIdentificationGenerateTokenParams
import java.util.function.Consumer

class VisitorIdentificationServiceImpl
internal constructor(private val clientOptions: ClientOptions) : VisitorIdentificationService {

    private val withRawResponse: VisitorIdentificationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VisitorIdentificationService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): VisitorIdentificationService =
        VisitorIdentificationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun generateToken(
        params: VisitorIdentificationGenerateTokenParams,
        requestOptions: RequestOptions,
    ): IdentificationTokenResponse =
        // post /visitor-identification/2026-03/tokens/create
        withRawResponse().generateToken(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VisitorIdentificationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VisitorIdentificationService.WithRawResponse =
            VisitorIdentificationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val generateTokenHandler: Handler<IdentificationTokenResponse> =
            jsonHandler<IdentificationTokenResponse>(clientOptions.jsonMapper)

        override fun generateToken(
            params: VisitorIdentificationGenerateTokenParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IdentificationTokenResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("visitor-identification", "2026-03", "tokens", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
