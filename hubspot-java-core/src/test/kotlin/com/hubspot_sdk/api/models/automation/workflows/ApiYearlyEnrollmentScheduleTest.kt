// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiYearlyEnrollmentScheduleTest {

    @Test
    fun create() {
        val apiYearlyEnrollmentSchedule =
            ApiYearlyEnrollmentSchedule.builder()
                .dayOfMonth(1)
                .month(ApiYearlyEnrollmentSchedule.Month.JANUARY)
                .timeOfDay(ApiTimeOfDay.builder().hour(0).minute(0).build())
                .type(ApiYearlyEnrollmentSchedule.Type.YEARLY)
                .build()

        assertThat(apiYearlyEnrollmentSchedule.dayOfMonth()).isEqualTo(1)
        assertThat(apiYearlyEnrollmentSchedule.month())
            .isEqualTo(ApiYearlyEnrollmentSchedule.Month.JANUARY)
        assertThat(apiYearlyEnrollmentSchedule.timeOfDay())
            .isEqualTo(ApiTimeOfDay.builder().hour(0).minute(0).build())
        assertThat(apiYearlyEnrollmentSchedule.type())
            .isEqualTo(ApiYearlyEnrollmentSchedule.Type.YEARLY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiYearlyEnrollmentSchedule =
            ApiYearlyEnrollmentSchedule.builder()
                .dayOfMonth(1)
                .month(ApiYearlyEnrollmentSchedule.Month.JANUARY)
                .timeOfDay(ApiTimeOfDay.builder().hour(0).minute(0).build())
                .type(ApiYearlyEnrollmentSchedule.Type.YEARLY)
                .build()

        val roundtrippedApiYearlyEnrollmentSchedule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiYearlyEnrollmentSchedule),
                jacksonTypeRef<ApiYearlyEnrollmentSchedule>(),
            )

        assertThat(roundtrippedApiYearlyEnrollmentSchedule).isEqualTo(apiYearlyEnrollmentSchedule)
    }
}
