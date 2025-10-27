// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiMonthlySpecificDaysEnrollmentScheduleTest {

    @Test
    fun create() {
        val apiMonthlySpecificDaysEnrollmentSchedule =
            ApiMonthlySpecificDaysEnrollmentSchedule.builder()
                .addDaysOfMonth(0)
                .timeOfDay(ApiTimeOfDay.builder().hour(0).minute(0).build())
                .type(ApiMonthlySpecificDaysEnrollmentSchedule.Type.MONTHLY_SPECIFIC_DAYS)
                .build()

        assertThat(apiMonthlySpecificDaysEnrollmentSchedule.daysOfMonth()).containsExactly(0)
        assertThat(apiMonthlySpecificDaysEnrollmentSchedule.timeOfDay())
            .isEqualTo(ApiTimeOfDay.builder().hour(0).minute(0).build())
        assertThat(apiMonthlySpecificDaysEnrollmentSchedule.type())
            .isEqualTo(ApiMonthlySpecificDaysEnrollmentSchedule.Type.MONTHLY_SPECIFIC_DAYS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiMonthlySpecificDaysEnrollmentSchedule =
            ApiMonthlySpecificDaysEnrollmentSchedule.builder()
                .addDaysOfMonth(0)
                .timeOfDay(ApiTimeOfDay.builder().hour(0).minute(0).build())
                .type(ApiMonthlySpecificDaysEnrollmentSchedule.Type.MONTHLY_SPECIFIC_DAYS)
                .build()

        val roundtrippedApiMonthlySpecificDaysEnrollmentSchedule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiMonthlySpecificDaysEnrollmentSchedule),
                jacksonTypeRef<ApiMonthlySpecificDaysEnrollmentSchedule>(),
            )

        assertThat(roundtrippedApiMonthlySpecificDaysEnrollmentSchedule)
            .isEqualTo(apiMonthlySpecificDaysEnrollmentSchedule)
    }
}
