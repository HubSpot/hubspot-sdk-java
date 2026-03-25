// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.cms.BlogService
import com.hubspot_sdk.api.services.blocking.cms.BlogServiceImpl
import java.util.function.Consumer

class CmServiceImpl internal constructor(private val clientOptions: ClientOptions) : CmService {

    private val withRawResponse: CmService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val blogs: BlogService by lazy { BlogServiceImpl(clientOptions) }

    override fun withRawResponse(): CmService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CmService =
        CmServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun blogs(): BlogService = blogs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CmService.WithRawResponse {

        private val blogs: BlogService.WithRawResponse by lazy {
            BlogServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CmService.WithRawResponse =
            CmServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun blogs(): BlogService.WithRawResponse = blogs
    }
}
