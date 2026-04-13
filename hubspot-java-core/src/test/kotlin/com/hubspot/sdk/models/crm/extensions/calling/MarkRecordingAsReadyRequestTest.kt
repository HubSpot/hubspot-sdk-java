// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.calling

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarkRecordingAsReadyRequestTest {

    @Test
    fun create() {
        val markRecordingAsReadyRequest =
            MarkRecordingAsReadyRequest.builder().engagementId(0L).build()

        assertThat(markRecordingAsReadyRequest.engagementId()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val markRecordingAsReadyRequest =
            MarkRecordingAsReadyRequest.builder().engagementId(0L).build()

        val roundtrippedMarkRecordingAsReadyRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(markRecordingAsReadyRequest),
                jacksonTypeRef<MarkRecordingAsReadyRequest>(),
            )

        assertThat(roundtrippedMarkRecordingAsReadyRequest).isEqualTo(markRecordingAsReadyRequest)
    }
}
