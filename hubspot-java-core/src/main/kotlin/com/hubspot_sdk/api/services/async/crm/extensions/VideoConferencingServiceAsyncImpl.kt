// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.crm.extensions.videoconferencing.SettingServiceAsync
import com.hubspot_sdk.api.services.async.crm.extensions.videoconferencing.SettingServiceAsyncImpl
import java.util.function.Consumer

class VideoConferencingServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : VideoConferencingServiceAsync {

    private val withRawResponse: VideoConferencingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val settings: SettingServiceAsync by lazy { SettingServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): VideoConferencingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): VideoConferencingServiceAsync =
        VideoConferencingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun settings(): SettingServiceAsync = settings

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VideoConferencingServiceAsync.WithRawResponse {

        private val settings: SettingServiceAsync.WithRawResponse by lazy {
            SettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VideoConferencingServiceAsync.WithRawResponse =
            VideoConferencingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun settings(): SettingServiceAsync.WithRawResponse = settings
    }
}
