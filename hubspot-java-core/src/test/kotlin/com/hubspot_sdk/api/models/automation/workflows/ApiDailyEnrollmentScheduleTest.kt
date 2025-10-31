// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiDailyEnrollmentScheduleTest {

    @Test
    fun create() {
        val apiDailyEnrollmentSchedule =
            ApiDailyEnrollmentSchedule.builder()
                .timeOfDay(ApiTimeOfDay.builder().hour(0).minute(0).build())
                .type(ApiDailyEnrollmentSchedule.Type.DAILY)
                .build()

        assertThat(apiDailyEnrollmentSchedule.timeOfDay())
            .isEqualTo(ApiTimeOfDay.builder().hour(0).minute(0).build())
        assertThat(apiDailyEnrollmentSchedule.type())
            .isEqualTo(ApiDailyEnrollmentSchedule.Type.DAILY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiDailyEnrollmentSchedule =
            ApiDailyEnrollmentSchedule.builder()
                .timeOfDay(ApiTimeOfDay.builder().hour(0).minute(0).build())
                .type(ApiDailyEnrollmentSchedule.Type.DAILY)
                .build()

        val roundtrippedApiDailyEnrollmentSchedule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiDailyEnrollmentSchedule),
                jacksonTypeRef<ApiDailyEnrollmentSchedule>(),
            )

        assertThat(roundtrippedApiDailyEnrollmentSchedule).isEqualTo(apiDailyEnrollmentSchedule)
    }
}
