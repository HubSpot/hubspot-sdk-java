// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.extensions.videoconferencing.SettingService
import com.hubspot_sdk.api.services.blocking.crm.extensions.videoconferencing.SettingServiceImpl
import java.util.function.Consumer

class VideoconferencingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VideoconferencingService {

    private val withRawResponse: VideoconferencingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val settings: SettingService by lazy { SettingServiceImpl(clientOptions) }

    override fun withRawResponse(): VideoconferencingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VideoconferencingService =
        VideoconferencingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun settings(): SettingService = settings

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VideoconferencingService.WithRawResponse {

        private val settings: SettingService.WithRawResponse by lazy {
            SettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VideoconferencingService.WithRawResponse =
            VideoconferencingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun settings(): SettingService.WithRawResponse = settings
    }
}
