// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.auth

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
import com.hubspot_sdk.api.models.auth.oauth.AccessTokenInfoResponse
import com.hubspot_sdk.api.models.auth.oauth.OAuthCreateAccessTokenParams
import com.hubspot_sdk.api.models.auth.oauth.OAuthDeleteRefreshTokenParams
import com.hubspot_sdk.api.models.auth.oauth.OAuthGetAccessTokenParams
import com.hubspot_sdk.api.models.auth.oauth.OAuthGetRefreshTokenParams
import com.hubspot_sdk.api.models.auth.oauth.RefreshTokenInfoResponse
import com.hubspot_sdk.api.models.auth.oauth.TokenResponseIf
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OAuthServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OAuthService {

    private val withRawResponse: OAuthService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OAuthService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthService =
        OAuthServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createAccessToken(
        params: OAuthCreateAccessTokenParams,
        requestOptions: RequestOptions,
    ): TokenResponseIf =
        // post /oauth/v1/token
        withRawResponse().createAccessToken(params, requestOptions).parse()

    override fun deleteRefreshToken(
        params: OAuthDeleteRefreshTokenParams,
        requestOptions: RequestOptions,
    ) {
        // delete /oauth/v1/refresh-tokens/{token}
        withRawResponse().deleteRefreshToken(params, requestOptions)
    }

    override fun getAccessToken(
        params: OAuthGetAccessTokenParams,
        requestOptions: RequestOptions,
    ): AccessTokenInfoResponse =
        // get /oauth/v1/access-tokens/{token}
        withRawResponse().getAccessToken(params, requestOptions).parse()

    override fun getRefreshToken(
        params: OAuthGetRefreshTokenParams,
        requestOptions: RequestOptions,
    ): RefreshTokenInfoResponse =
        // get /oauth/v1/refresh-tokens/{token}
        withRawResponse().getRefreshToken(params, requestOptions).parse()

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

        private val createAccessTokenHandler: Handler<TokenResponseIf> =
            jsonHandler<TokenResponseIf>(clientOptions.jsonMapper)

        override fun createAccessToken(
            params: OAuthCreateAccessTokenParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenResponseIf> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth", "v1", "token")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createAccessTokenHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteRefreshTokenHandler: Handler<Void?> = emptyHandler()

        override fun deleteRefreshToken(
            params: OAuthDeleteRefreshTokenParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("token", params.token().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth", "v1", "refresh-tokens", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteRefreshTokenHandler.handle(it) }
            }
        }

        private val getAccessTokenHandler: Handler<AccessTokenInfoResponse> =
            jsonHandler<AccessTokenInfoResponse>(clientOptions.jsonMapper)

        override fun getAccessToken(
            params: OAuthGetAccessTokenParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccessTokenInfoResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("token", params.token().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth", "v1", "access-tokens", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getAccessTokenHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getRefreshTokenHandler: Handler<RefreshTokenInfoResponse> =
            jsonHandler<RefreshTokenInfoResponse>(clientOptions.jsonMapper)

        override fun getRefreshToken(
            params: OAuthGetRefreshTokenParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RefreshTokenInfoResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("token", params.token().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth", "v1", "refresh-tokens", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getRefreshTokenHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
