// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiPropertyBasedEnrollmentScheduleTest {

    @Test
    fun create() {
        val apiPropertyBasedEnrollmentSchedule =
            ApiPropertyBasedEnrollmentSchedule.builder()
                .dateProperty("dateProperty")
                .daysDelta(0)
                .timeOfDay(ApiTimeOfDay.builder().hour(0).minute(0).build())
                .type(ApiPropertyBasedEnrollmentSchedule.Type.PROPERTY_BASED)
                .yearly(true)
                .build()

        assertThat(apiPropertyBasedEnrollmentSchedule.dateProperty()).isEqualTo("dateProperty")
        assertThat(apiPropertyBasedEnrollmentSchedule.daysDelta()).isEqualTo(0)
        assertThat(apiPropertyBasedEnrollmentSchedule.timeOfDay())
            .isEqualTo(ApiTimeOfDay.builder().hour(0).minute(0).build())
        assertThat(apiPropertyBasedEnrollmentSchedule.type())
            .isEqualTo(ApiPropertyBasedEnrollmentSchedule.Type.PROPERTY_BASED)
        assertThat(apiPropertyBasedEnrollmentSchedule.yearly()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiPropertyBasedEnrollmentSchedule =
            ApiPropertyBasedEnrollmentSchedule.builder()
                .dateProperty("dateProperty")
                .daysDelta(0)
                .timeOfDay(ApiTimeOfDay.builder().hour(0).minute(0).build())
                .type(ApiPropertyBasedEnrollmentSchedule.Type.PROPERTY_BASED)
                .yearly(true)
                .build()

        val roundtrippedApiPropertyBasedEnrollmentSchedule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiPropertyBasedEnrollmentSchedule),
                jacksonTypeRef<ApiPropertyBasedEnrollmentSchedule>(),
            )

        assertThat(roundtrippedApiPropertyBasedEnrollmentSchedule)
            .isEqualTo(apiPropertyBasedEnrollmentSchedule)
    }
}
