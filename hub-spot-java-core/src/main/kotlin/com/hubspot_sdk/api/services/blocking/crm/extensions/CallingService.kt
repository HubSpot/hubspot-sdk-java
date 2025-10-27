// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.extensions.calling.ChannelConnectionSettingService
import com.hubspot_sdk.api.services.blocking.crm.extensions.calling.RecordingSettingService
import com.hubspot_sdk.api.services.blocking.crm.extensions.calling.SettingService
import com.hubspot_sdk.api.services.blocking.crm.extensions.calling.TranscriptService
import java.util.function.Consumer

interface CallingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallingService

    fun channelConnectionSettings(): ChannelConnectionSettingService

    fun recordingSettings(): RecordingSettingService

    fun settings(): SettingService

    fun transcripts(): TranscriptService

    /** A view of [CallingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallingService.WithRawResponse

        fun channelConnectionSettings(): ChannelConnectionSettingService.WithRawResponse

        fun recordingSettings(): RecordingSettingService.WithRawResponse

        fun settings(): SettingService.WithRawResponse

        fun transcripts(): TranscriptService.WithRawResponse
    }
}
