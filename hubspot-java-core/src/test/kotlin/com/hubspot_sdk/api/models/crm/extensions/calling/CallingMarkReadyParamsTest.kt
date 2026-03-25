// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallingMarkReadyParamsTest {

    @Test
    fun create() {
        CallingMarkReadyParams.builder()
            .markRecordingAsReadyRequest(
                MarkRecordingAsReadyRequest.builder().engagementId(0L).build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CallingMarkReadyParams.builder()
                .markRecordingAsReadyRequest(
                    MarkRecordingAsReadyRequest.builder().engagementId(0L).build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(MarkRecordingAsReadyRequest.builder().engagementId(0L).build())
    }
}
