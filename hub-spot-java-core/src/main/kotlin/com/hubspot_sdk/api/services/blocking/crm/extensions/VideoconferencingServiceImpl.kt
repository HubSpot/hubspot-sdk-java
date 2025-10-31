// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions

import com.hubspot_sdk.api.core.ClientOptions
import java.util.function.Consumer

class VideoconferencingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VideoconferencingService {

    private val withRawResponse: VideoconferencingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VideoconferencingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VideoconferencingService =
        VideoconferencingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VideoconferencingService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VideoconferencingService.WithRawResponse =
            VideoconferencingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
