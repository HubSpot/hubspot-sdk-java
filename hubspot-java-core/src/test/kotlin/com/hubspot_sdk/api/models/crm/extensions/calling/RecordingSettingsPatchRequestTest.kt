// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingSettingsPatchRequestTest {

    @Test
    fun create() {
        val recordingSettingsPatchRequest =
            RecordingSettingsPatchRequest.builder()
                .urlToRetrieveAuthedRecording("urlToRetrieveAuthedRecording")
                .build()

        assertThat(recordingSettingsPatchRequest.urlToRetrieveAuthedRecording())
            .contains("urlToRetrieveAuthedRecording")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recordingSettingsPatchRequest =
            RecordingSettingsPatchRequest.builder()
                .urlToRetrieveAuthedRecording("urlToRetrieveAuthedRecording")
                .build()

        val roundtrippedRecordingSettingsPatchRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recordingSettingsPatchRequest),
                jacksonTypeRef<RecordingSettingsPatchRequest>(),
            )

        assertThat(roundtrippedRecordingSettingsPatchRequest)
            .isEqualTo(recordingSettingsPatchRequest)
    }
}
