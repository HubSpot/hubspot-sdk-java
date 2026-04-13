// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.extensions.calling

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingSettingsRequestTest {

    @Test
    fun create() {
        val recordingSettingsRequest =
            RecordingSettingsRequest.builder()
                .urlToRetrieveAuthedRecording("urlToRetrieveAuthedRecording")
                .build()

        assertThat(recordingSettingsRequest.urlToRetrieveAuthedRecording())
            .isEqualTo("urlToRetrieveAuthedRecording")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recordingSettingsRequest =
            RecordingSettingsRequest.builder()
                .urlToRetrieveAuthedRecording("urlToRetrieveAuthedRecording")
                .build()

        val roundtrippedRecordingSettingsRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recordingSettingsRequest),
                jacksonTypeRef<RecordingSettingsRequest>(),
            )

        assertThat(roundtrippedRecordingSettingsRequest).isEqualTo(recordingSettingsRequest)
    }
}
