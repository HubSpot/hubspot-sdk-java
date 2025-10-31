// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.auth.OAuthService
import com.hubspot_sdk.api.services.blocking.auth.OAuthServiceImpl
import java.util.function.Consumer

class AuthServiceImpl internal constructor(private val clientOptions: ClientOptions) : AuthService {

    private val withRawResponse: AuthService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val oauth: OAuthService by lazy { OAuthServiceImpl(clientOptions) }

    override fun withRawResponse(): AuthService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthService =
        AuthServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun oauth(): OAuthService = oauth

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthService.WithRawResponse {

        private val oauth: OAuthService.WithRawResponse by lazy {
            OAuthServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuthService.WithRawResponse =
            AuthServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun oauth(): OAuthService.WithRawResponse = oauth
    }
}
