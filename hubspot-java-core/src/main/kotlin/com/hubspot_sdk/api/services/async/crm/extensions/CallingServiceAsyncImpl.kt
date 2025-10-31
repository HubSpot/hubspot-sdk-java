// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.crm.extensions.calling.ChannelConnectionSettingServiceAsync
import com.hubspot_sdk.api.services.async.crm.extensions.calling.ChannelConnectionSettingServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.extensions.calling.RecordingSettingServiceAsync
import com.hubspot_sdk.api.services.async.crm.extensions.calling.RecordingSettingServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.extensions.calling.SettingServiceAsync
import com.hubspot_sdk.api.services.async.crm.extensions.calling.SettingServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.extensions.calling.TranscriptServiceAsync
import com.hubspot_sdk.api.services.async.crm.extensions.calling.TranscriptServiceAsyncImpl
import java.util.function.Consumer

class CallingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CallingServiceAsync {

    private val withRawResponse: CallingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val channelConnectionSettings: ChannelConnectionSettingServiceAsync by lazy {
        ChannelConnectionSettingServiceAsyncImpl(clientOptions)
    }

    private val recordingSettings: RecordingSettingServiceAsync by lazy {
        RecordingSettingServiceAsyncImpl(clientOptions)
    }

    private val settings: SettingServiceAsync by lazy { SettingServiceAsyncImpl(clientOptions) }

    private val transcripts: TranscriptServiceAsync by lazy {
        TranscriptServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CallingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallingServiceAsync =
        CallingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun channelConnectionSettings(): ChannelConnectionSettingServiceAsync =
        channelConnectionSettings

    override fun recordingSettings(): RecordingSettingServiceAsync = recordingSettings

    override fun settings(): SettingServiceAsync = settings

    override fun transcripts(): TranscriptServiceAsync = transcripts

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CallingServiceAsync.WithRawResponse {

        private val channelConnectionSettings:
            ChannelConnectionSettingServiceAsync.WithRawResponse by lazy {
            ChannelConnectionSettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val recordingSettings: RecordingSettingServiceAsync.WithRawResponse by lazy {
            RecordingSettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingServiceAsync.WithRawResponse by lazy {
            SettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transcripts: TranscriptServiceAsync.WithRawResponse by lazy {
            TranscriptServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallingServiceAsync.WithRawResponse =
            CallingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun channelConnectionSettings():
            ChannelConnectionSettingServiceAsync.WithRawResponse = channelConnectionSettings

        override fun recordingSettings(): RecordingSettingServiceAsync.WithRawResponse =
            recordingSettings

        override fun settings(): SettingServiceAsync.WithRawResponse = settings

        override fun transcripts(): TranscriptServiceAsync.WithRawResponse = transcripts
    }
}
