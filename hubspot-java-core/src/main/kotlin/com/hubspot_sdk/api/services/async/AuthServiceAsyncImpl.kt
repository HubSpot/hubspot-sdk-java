// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.auth.OAuthServiceAsync
import com.hubspot_sdk.api.services.async.auth.OAuthServiceAsyncImpl
import java.util.function.Consumer

class AuthServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AuthServiceAsync {

    private val withRawResponse: AuthServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val oauth: OAuthServiceAsync by lazy { OAuthServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AuthServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthServiceAsync =
        AuthServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun oauth(): OAuthServiceAsync = oauth

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthServiceAsync.WithRawResponse {

        private val oauth: OAuthServiceAsync.WithRawResponse by lazy {
            OAuthServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuthServiceAsync.WithRawResponse =
            AuthServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun oauth(): OAuthServiceAsync.WithRawResponse = oauth
    }
}
