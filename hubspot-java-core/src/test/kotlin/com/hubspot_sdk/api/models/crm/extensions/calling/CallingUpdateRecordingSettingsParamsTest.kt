// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallingUpdateRecordingSettingsParamsTest {

    @Test
    fun create() {
        CallingUpdateRecordingSettingsParams.builder()
            .appId(0)
            .recordingSettingsPatchRequest(
                RecordingSettingsPatchRequest.builder()
                    .urlToRetrieveAuthedRecording("urlToRetrieveAuthedRecording")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CallingUpdateRecordingSettingsParams.builder()
                .appId(0)
                .recordingSettingsPatchRequest(RecordingSettingsPatchRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CallingUpdateRecordingSettingsParams.builder()
                .appId(0)
                .recordingSettingsPatchRequest(
                    RecordingSettingsPatchRequest.builder()
                        .urlToRetrieveAuthedRecording("urlToRetrieveAuthedRecording")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                RecordingSettingsPatchRequest.builder()
                    .urlToRetrieveAuthedRecording("urlToRetrieveAuthedRecording")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CallingUpdateRecordingSettingsParams.builder()
                .appId(0)
                .recordingSettingsPatchRequest(RecordingSettingsPatchRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(RecordingSettingsPatchRequest.builder().build())
    }
}
