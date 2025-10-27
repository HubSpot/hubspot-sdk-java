// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.crm.extensions.calling.ChannelConnectionSettingServiceAsync
import com.hubspot_sdk.api.services.async.crm.extensions.calling.RecordingSettingServiceAsync
import com.hubspot_sdk.api.services.async.crm.extensions.calling.SettingServiceAsync
import com.hubspot_sdk.api.services.async.crm.extensions.calling.TranscriptServiceAsync
import java.util.function.Consumer

interface CallingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallingServiceAsync

    fun channelConnectionSettings(): ChannelConnectionSettingServiceAsync

    fun recordingSettings(): RecordingSettingServiceAsync

    fun settings(): SettingServiceAsync

    fun transcripts(): TranscriptServiceAsync

    /**
     * A view of [CallingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallingServiceAsync.WithRawResponse

        fun channelConnectionSettings(): ChannelConnectionSettingServiceAsync.WithRawResponse

        fun recordingSettings(): RecordingSettingServiceAsync.WithRawResponse

        fun settings(): SettingServiceAsync.WithRawResponse

        fun transcripts(): TranscriptServiceAsync.WithRawResponse
    }
}
