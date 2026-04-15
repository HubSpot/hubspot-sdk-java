// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.meta

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.blocking.meta.origins.IpRangeService
import com.hubspot.sdk.services.blocking.meta.origins.IpRangeServiceImpl
import java.util.function.Consumer

class OriginServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OriginService {

    private val withRawResponse: OriginService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val ipRanges: IpRangeService by lazy { IpRangeServiceImpl(clientOptions) }

    override fun withRawResponse(): OriginService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OriginService =
        OriginServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun ipRanges(): IpRangeService = ipRanges

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OriginService.WithRawResponse {

        private val ipRanges: IpRangeService.WithRawResponse by lazy {
            IpRangeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OriginService.WithRawResponse =
            OriginServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun ipRanges(): IpRangeService.WithRawResponse = ipRanges
    }
}
