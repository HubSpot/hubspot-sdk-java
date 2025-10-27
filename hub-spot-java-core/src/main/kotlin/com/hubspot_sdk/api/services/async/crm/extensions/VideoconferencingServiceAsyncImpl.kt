// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.crm.extensions.videoconferencing.SettingServiceAsync
import com.hubspot_sdk.api.services.async.crm.extensions.videoconferencing.SettingServiceAsyncImpl
import java.util.function.Consumer

class VideoconferencingServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : VideoconferencingServiceAsync {

    private val withRawResponse: VideoconferencingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val settings: SettingServiceAsync by lazy { SettingServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): VideoconferencingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): VideoconferencingServiceAsync =
        VideoconferencingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun settings(): SettingServiceAsync = settings

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VideoconferencingServiceAsync.WithRawResponse {

        private val settings: SettingServiceAsync.WithRawResponse by lazy {
            SettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VideoconferencingServiceAsync.WithRawResponse =
            VideoconferencingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun settings(): SettingServiceAsync.WithRawResponse = settings
    }
}
