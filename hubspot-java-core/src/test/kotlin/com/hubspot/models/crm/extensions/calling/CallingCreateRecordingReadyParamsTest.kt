// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.extensions.calling

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallingCreateRecordingReadyParamsTest {

    @Test
    fun create() {
        CallingCreateRecordingReadyParams.builder()
            .markRecordingAsReadyRequest(
                MarkRecordingAsReadyRequest.builder().engagementId(0L).build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CallingCreateRecordingReadyParams.builder()
                .markRecordingAsReadyRequest(
                    MarkRecordingAsReadyRequest.builder().engagementId(0L).build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(MarkRecordingAsReadyRequest.builder().engagementId(0L).build())
    }
}
