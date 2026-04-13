// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.meta

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.async.meta.origins.IpRangeServiceAsync
import com.hubspot.sdk.services.async.meta.origins.IpRangeServiceAsyncImpl
import java.util.function.Consumer

class OriginServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OriginServiceAsync {

    private val withRawResponse: OriginServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val ipRanges: IpRangeServiceAsync by lazy { IpRangeServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): OriginServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OriginServiceAsync =
        OriginServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun ipRanges(): IpRangeServiceAsync = ipRanges

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OriginServiceAsync.WithRawResponse {

        private val ipRanges: IpRangeServiceAsync.WithRawResponse by lazy {
            IpRangeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OriginServiceAsync.WithRawResponse =
            OriginServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun ipRanges(): IpRangeServiceAsync.WithRawResponse = ipRanges
    }
}
