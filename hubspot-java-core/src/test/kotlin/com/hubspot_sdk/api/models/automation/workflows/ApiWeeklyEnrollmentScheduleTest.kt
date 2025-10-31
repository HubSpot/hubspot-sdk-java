// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiWeeklyEnrollmentScheduleTest {

    @Test
    fun create() {
        val apiWeeklyEnrollmentSchedule =
            ApiWeeklyEnrollmentSchedule.builder()
                .addDaysOfWeek(ApiWeeklyEnrollmentSchedule.DaysOfWeek.MONDAY)
                .timeOfDay(ApiTimeOfDay.builder().hour(0).minute(0).build())
                .type(ApiWeeklyEnrollmentSchedule.Type.WEEKLY)
                .build()

        assertThat(apiWeeklyEnrollmentSchedule.daysOfWeek())
            .containsExactly(ApiWeeklyEnrollmentSchedule.DaysOfWeek.MONDAY)
        assertThat(apiWeeklyEnrollmentSchedule.timeOfDay())
            .isEqualTo(ApiTimeOfDay.builder().hour(0).minute(0).build())
        assertThat(apiWeeklyEnrollmentSchedule.type())
            .isEqualTo(ApiWeeklyEnrollmentSchedule.Type.WEEKLY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiWeeklyEnrollmentSchedule =
            ApiWeeklyEnrollmentSchedule.builder()
                .addDaysOfWeek(ApiWeeklyEnrollmentSchedule.DaysOfWeek.MONDAY)
                .timeOfDay(ApiTimeOfDay.builder().hour(0).minute(0).build())
                .type(ApiWeeklyEnrollmentSchedule.Type.WEEKLY)
                .build()

        val roundtrippedApiWeeklyEnrollmentSchedule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiWeeklyEnrollmentSchedule),
                jacksonTypeRef<ApiWeeklyEnrollmentSchedule>(),
            )

        assertThat(roundtrippedApiWeeklyEnrollmentSchedule).isEqualTo(apiWeeklyEnrollmentSchedule)
    }
}
