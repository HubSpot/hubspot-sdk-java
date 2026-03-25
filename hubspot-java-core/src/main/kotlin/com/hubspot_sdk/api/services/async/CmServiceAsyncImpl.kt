// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.cms.BlogServiceAsync
import com.hubspot_sdk.api.services.async.cms.BlogServiceAsyncImpl
import java.util.function.Consumer

class CmServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CmServiceAsync {

    private val withRawResponse: CmServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val blogs: BlogServiceAsync by lazy { BlogServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CmServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CmServiceAsync =
        CmServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun blogs(): BlogServiceAsync = blogs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CmServiceAsync.WithRawResponse {

        private val blogs: BlogServiceAsync.WithRawResponse by lazy {
            BlogServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CmServiceAsync.WithRawResponse =
            CmServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun blogs(): BlogServiceAsync.WithRawResponse = blogs
    }
}
