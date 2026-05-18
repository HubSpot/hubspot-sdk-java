// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportCreationResponseTest {

    @Test
    fun create() {
        val reportCreationResponse =
            ReportCreationResponse.builder()
                .enqueueTime(DateTime.builder().dateOnly(true).timeZoneShift(0).value(0L).build())
                .userEmail("userEmail")
                .userId(0)
                .build()

        assertThat(reportCreationResponse.enqueueTime())
            .isEqualTo(DateTime.builder().dateOnly(true).timeZoneShift(0).value(0L).build())
        assertThat(reportCreationResponse.userEmail()).isEqualTo("userEmail")
        assertThat(reportCreationResponse.userId()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportCreationResponse =
            ReportCreationResponse.builder()
                .enqueueTime(DateTime.builder().dateOnly(true).timeZoneShift(0).value(0L).build())
                .userEmail("userEmail")
                .userId(0)
                .build()

        val roundtrippedReportCreationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportCreationResponse),
                jacksonTypeRef<ReportCreationResponse>(),
            )

        assertThat(roundtrippedReportCreationResponse).isEqualTo(reportCreationResponse)
    }
}
