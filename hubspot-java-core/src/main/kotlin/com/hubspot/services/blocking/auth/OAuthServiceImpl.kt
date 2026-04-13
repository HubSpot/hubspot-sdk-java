// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.auth

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
import com.hubspot.core.prepare
import com.hubspot.models.auth.oauth.OAuthCreateTokenParams
import com.hubspot.models.auth.oauth.OAuthIntrospectTokenParams
import com.hubspot.models.auth.oauth.OAuthRevokeTokenParams
import com.hubspot.models.auth.oauth.TokenInfoResponseBaseIf
import java.util.function.Consumer

class OAuthServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OAuthService {

    private val withRawResponse: OAuthService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OAuthService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthService =
        OAuthServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createToken(
        params: OAuthCreateTokenParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /oauth/2026-03/token
        withRawResponse().createToken(params, requestOptions)

    override fun introspectToken(
        params: OAuthIntrospectTokenParams,
        requestOptions: RequestOptions,
    ): TokenInfoResponseBaseIf =
        // post /oauth/2026-03/token/introspect
        withRawResponse().introspectToken(params, requestOptions).parse()

    override fun revokeToken(
        params: OAuthRevokeTokenParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /oauth/2026-03/token/revoke
        withRawResponse().revokeToken(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OAuthService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OAuthService.WithRawResponse =
            OAuthServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun createToken(
            params: OAuthCreateTokenParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth", "2026-03", "token")
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val introspectTokenHandler: Handler<TokenInfoResponseBaseIf> =
            jsonHandler<TokenInfoResponseBaseIf>(clientOptions.jsonMapper)

        override fun introspectToken(
            params: OAuthIntrospectTokenParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenInfoResponseBaseIf> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth", "2026-03", "token", "introspect")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { introspectTokenHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        override fun revokeToken(
            params: OAuthRevokeTokenParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth", "2026-03", "token", "revoke")
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }
    }
}
