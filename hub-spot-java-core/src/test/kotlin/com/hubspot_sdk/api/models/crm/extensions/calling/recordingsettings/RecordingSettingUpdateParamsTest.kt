// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling.recordingsettings

import com.hubspot_sdk.api.models.crm.extensions.calling.RecordingSettingsPatchRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingSettingUpdateParamsTest {

    @Test
    fun create() {
        RecordingSettingUpdateParams.builder()
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
            RecordingSettingUpdateParams.builder()
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
            RecordingSettingUpdateParams.builder()
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
            RecordingSettingUpdateParams.builder()
                .appId(0)
                .recordingSettingsPatchRequest(RecordingSettingsPatchRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(RecordingSettingsPatchRequest.builder().build())
    }
}
