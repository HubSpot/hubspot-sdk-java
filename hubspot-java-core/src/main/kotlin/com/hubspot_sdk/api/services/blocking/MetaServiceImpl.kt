// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.meta.OriginService
import com.hubspot_sdk.api.services.blocking.meta.OriginServiceImpl
import java.util.function.Consumer

class MetaServiceImpl internal constructor(private val clientOptions: ClientOptions) : MetaService {

    private val withRawResponse: MetaService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val origins: OriginService by lazy { OriginServiceImpl(clientOptions) }

    override fun withRawResponse(): MetaService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MetaService =
        MetaServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun origins(): OriginService = origins

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MetaService.WithRawResponse {

        private val origins: OriginService.WithRawResponse by lazy {
            OriginServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MetaService.WithRawResponse =
            MetaServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun origins(): OriginService.WithRawResponse = origins
    }
}
