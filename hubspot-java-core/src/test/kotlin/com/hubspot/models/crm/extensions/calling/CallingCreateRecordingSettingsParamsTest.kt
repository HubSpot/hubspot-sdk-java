// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.extensions.calling

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallingCreateRecordingSettingsParamsTest {

    @Test
    fun create() {
        CallingCreateRecordingSettingsParams.builder()
            .appId(0)
            .recordingSettingsRequest(
                RecordingSettingsRequest.builder()
                    .urlToRetrieveAuthedRecording("urlToRetrieveAuthedRecording")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CallingCreateRecordingSettingsParams.builder()
                .appId(0)
                .recordingSettingsRequest(
                    RecordingSettingsRequest.builder()
                        .urlToRetrieveAuthedRecording("urlToRetrieveAuthedRecording")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CallingCreateRecordingSettingsParams.builder()
                .appId(0)
                .recordingSettingsRequest(
                    RecordingSettingsRequest.builder()
                        .urlToRetrieveAuthedRecording("urlToRetrieveAuthedRecording")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                RecordingSettingsRequest.builder()
                    .urlToRetrieveAuthedRecording("urlToRetrieveAuthedRecording")
                    .build()
            )
    }
}
