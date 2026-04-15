// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.calling

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingSettingsResponseTest {

    @Test
    fun create() {
        val recordingSettingsResponse =
            RecordingSettingsResponse.builder()
                .urlToRetrieveAuthedRecording("urlToRetrieveAuthedRecording")
                .build()

        assertThat(recordingSettingsResponse.urlToRetrieveAuthedRecording())
            .isEqualTo("urlToRetrieveAuthedRecording")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recordingSettingsResponse =
            RecordingSettingsResponse.builder()
                .urlToRetrieveAuthedRecording("urlToRetrieveAuthedRecording")
                .build()

        val roundtrippedRecordingSettingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recordingSettingsResponse),
                jacksonTypeRef<RecordingSettingsResponse>(),
            )

        assertThat(roundtrippedRecordingSettingsResponse).isEqualTo(recordingSettingsResponse)
    }
}
