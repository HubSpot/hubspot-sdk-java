// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.extensions.videoconferencing.SettingService
import com.hubspot_sdk.api.services.blocking.crm.extensions.videoconferencing.SettingServiceImpl
import java.util.function.Consumer

class VideoConferencingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VideoConferencingService {

    private val withRawResponse: VideoConferencingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val settings: SettingService by lazy { SettingServiceImpl(clientOptions) }

    override fun withRawResponse(): VideoConferencingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VideoConferencingService =
        VideoConferencingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun settings(): SettingService = settings

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VideoConferencingService.WithRawResponse {

        private val settings: SettingService.WithRawResponse by lazy {
            SettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VideoConferencingService.WithRawResponse =
            VideoConferencingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun settings(): SettingService.WithRawResponse = settings
    }
}
