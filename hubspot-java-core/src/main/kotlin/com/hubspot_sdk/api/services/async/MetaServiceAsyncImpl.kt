// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.meta.OriginServiceAsync
import com.hubspot_sdk.api.services.async.meta.OriginServiceAsyncImpl
import java.util.function.Consumer

class MetaServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MetaServiceAsync {

    private val withRawResponse: MetaServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val origins: OriginServiceAsync by lazy { OriginServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): MetaServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MetaServiceAsync =
        MetaServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun origins(): OriginServiceAsync = origins

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MetaServiceAsync.WithRawResponse {

        private val origins: OriginServiceAsync.WithRawResponse by lazy {
            OriginServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MetaServiceAsync.WithRawResponse =
            MetaServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun origins(): OriginServiceAsync.WithRawResponse = origins
    }
}
