// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.extensions.calling.ChannelConnectionSettingService
import com.hubspot_sdk.api.services.blocking.crm.extensions.calling.ChannelConnectionSettingServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.extensions.calling.RecordingSettingService
import com.hubspot_sdk.api.services.blocking.crm.extensions.calling.RecordingSettingServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.extensions.calling.SettingService
import com.hubspot_sdk.api.services.blocking.crm.extensions.calling.SettingServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.extensions.calling.TranscriptService
import com.hubspot_sdk.api.services.blocking.crm.extensions.calling.TranscriptServiceImpl
import java.util.function.Consumer

class CallingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CallingService {

    private val withRawResponse: CallingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val channelConnectionSettings: ChannelConnectionSettingService by lazy {
        ChannelConnectionSettingServiceImpl(clientOptions)
    }

    private val recordingSettings: RecordingSettingService by lazy {
        RecordingSettingServiceImpl(clientOptions)
    }

    private val settings: SettingService by lazy { SettingServiceImpl(clientOptions) }

    private val transcripts: TranscriptService by lazy { TranscriptServiceImpl(clientOptions) }

    override fun withRawResponse(): CallingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallingService =
        CallingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun channelConnectionSettings(): ChannelConnectionSettingService =
        channelConnectionSettings

    override fun recordingSettings(): RecordingSettingService = recordingSettings

    override fun settings(): SettingService = settings

    override fun transcripts(): TranscriptService = transcripts

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CallingService.WithRawResponse {

        private val channelConnectionSettings:
            ChannelConnectionSettingService.WithRawResponse by lazy {
            ChannelConnectionSettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val recordingSettings: RecordingSettingService.WithRawResponse by lazy {
            RecordingSettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingService.WithRawResponse by lazy {
            SettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transcripts: TranscriptService.WithRawResponse by lazy {
            TranscriptServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallingService.WithRawResponse =
            CallingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun channelConnectionSettings(): ChannelConnectionSettingService.WithRawResponse =
            channelConnectionSettings

        override fun recordingSettings(): RecordingSettingService.WithRawResponse =
            recordingSettings

        override fun settings(): SettingService.WithRawResponse = settings

        override fun transcripts(): TranscriptService.WithRawResponse = transcripts
    }
}
