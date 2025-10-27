// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling.recordingsettings

import com.hubspot_sdk.api.models.crm.extensions.calling.MarkRecordingAsReadyRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingSettingMarkReadyParamsTest {

    @Test
    fun create() {
        RecordingSettingMarkReadyParams.builder()
            .markRecordingAsReadyRequest(
                MarkRecordingAsReadyRequest.builder().engagementId(0L).build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            RecordingSettingMarkReadyParams.builder()
                .markRecordingAsReadyRequest(
                    MarkRecordingAsReadyRequest.builder().engagementId(0L).build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(MarkRecordingAsReadyRequest.builder().engagementId(0L).build())
    }
}
