// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiMonthlyRelativeDaysEnrollmentScheduleTest {

    @Test
    fun create() {
        val apiMonthlyRelativeDaysEnrollmentSchedule =
            ApiMonthlyRelativeDaysEnrollmentSchedule.builder()
                .monthlyRelativeDays(
                    ApiMonthlyRelativeDaysEnrollmentSchedule.MonthlyRelativeDays.LAST_DAY_OF_MONTH
                )
                .timeOfDay(ApiTimeOfDay.builder().hour(0).minute(0).build())
                .type(ApiMonthlyRelativeDaysEnrollmentSchedule.Type.MONTHLY_RELATIVE_DAYS)
                .build()

        assertThat(apiMonthlyRelativeDaysEnrollmentSchedule.monthlyRelativeDays())
            .isEqualTo(
                ApiMonthlyRelativeDaysEnrollmentSchedule.MonthlyRelativeDays.LAST_DAY_OF_MONTH
            )
        assertThat(apiMonthlyRelativeDaysEnrollmentSchedule.timeOfDay())
            .isEqualTo(ApiTimeOfDay.builder().hour(0).minute(0).build())
        assertThat(apiMonthlyRelativeDaysEnrollmentSchedule.type())
            .isEqualTo(ApiMonthlyRelativeDaysEnrollmentSchedule.Type.MONTHLY_RELATIVE_DAYS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiMonthlyRelativeDaysEnrollmentSchedule =
            ApiMonthlyRelativeDaysEnrollmentSchedule.builder()
                .monthlyRelativeDays(
                    ApiMonthlyRelativeDaysEnrollmentSchedule.MonthlyRelativeDays.LAST_DAY_OF_MONTH
                )
                .timeOfDay(ApiTimeOfDay.builder().hour(0).minute(0).build())
                .type(ApiMonthlyRelativeDaysEnrollmentSchedule.Type.MONTHLY_RELATIVE_DAYS)
                .build()

        val roundtrippedApiMonthlyRelativeDaysEnrollmentSchedule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiMonthlyRelativeDaysEnrollmentSchedule),
                jacksonTypeRef<ApiMonthlyRelativeDaysEnrollmentSchedule>(),
            )

        assertThat(roundtrippedApiMonthlyRelativeDaysEnrollmentSchedule)
            .isEqualTo(apiMonthlyRelativeDaysEnrollmentSchedule)
    }
}
