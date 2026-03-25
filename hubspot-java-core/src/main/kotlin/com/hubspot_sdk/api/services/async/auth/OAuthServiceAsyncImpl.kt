// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.auth

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
import com.hubspot_sdk.api.models.auth.oauth.OAuthCreateTokenParams
import com.hubspot_sdk.api.models.auth.oauth.OAuthIntrospectTokenParams
import com.hubspot_sdk.api.models.auth.oauth.OAuthRevokeTokenParams
import com.hubspot_sdk.api.models.auth.oauth.TokenInfoResponseBaseIf
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class OAuthServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OAuthServiceAsync {

    private val withRawResponse: OAuthServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OAuthServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthServiceAsync =
        OAuthServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createToken(
        params: OAuthCreateTokenParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /oauth/2026-03/token
        withRawResponse().createToken(params, requestOptions)

    override fun introspectToken(
        params: OAuthIntrospectTokenParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TokenInfoResponseBaseIf> =
        // post /oauth/2026-03/token/introspect
        withRawResponse().introspectToken(params, requestOptions).thenApply { it.parse() }

    override fun revokeToken(
        params: OAuthRevokeTokenParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /oauth/2026-03/token/revoke
        withRawResponse().revokeToken(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OAuthServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OAuthServiceAsync.WithRawResponse =
            OAuthServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun createToken(
            params: OAuthCreateTokenParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth", "2026-03", "token")
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        private val introspectTokenHandler: Handler<TokenInfoResponseBaseIf> =
            jsonHandler<TokenInfoResponseBaseIf>(clientOptions.jsonMapper)

        override fun introspectToken(
            params: OAuthIntrospectTokenParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenInfoResponseBaseIf>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth", "2026-03", "token", "introspect")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { introspectTokenHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        override fun revokeToken(
            params: OAuthRevokeTokenParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth", "2026-03", "token", "revoke")
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }
    }
}
