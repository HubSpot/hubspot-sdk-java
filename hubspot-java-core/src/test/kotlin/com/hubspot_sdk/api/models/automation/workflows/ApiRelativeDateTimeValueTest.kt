// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiRelativeDateTimeValueTest {

    @Test
    fun create() {
        val apiRelativeDateTimeValue =
            ApiRelativeDateTimeValue.builder()
                .timeDelay(
                    ApiTimeDelay.builder()
                        .addDaysOfWeek(ApiTimeDelay.DaysOfWeek.MONDAY)
                        .delta(0)
                        .timeUnit(ApiTimeDelay.TimeUnit.CENTURIES)
                        .timeOfDay(ApiTimeOfDay.builder().hour(0).minute(0).build())
                        .timeZoneStrategy(
                            ApiStaticTimeZoneStrategy.builder()
                                .timeZoneId("timeZoneId")
                                .type(ApiStaticTimeZoneStrategy.Type.STATIC_TIME_ZONE)
                                .build()
                        )
                        .build()
                )
                .type(ApiRelativeDateTimeValue.Type.RELATIVE_DATETIME)
                .build()

        assertThat(apiRelativeDateTimeValue.timeDelay())
            .isEqualTo(
                ApiTimeDelay.builder()
                    .addDaysOfWeek(ApiTimeDelay.DaysOfWeek.MONDAY)
                    .delta(0)
                    .timeUnit(ApiTimeDelay.TimeUnit.CENTURIES)
                    .timeOfDay(ApiTimeOfDay.builder().hour(0).minute(0).build())
                    .timeZoneStrategy(
                        ApiStaticTimeZoneStrategy.builder()
                            .timeZoneId("timeZoneId")
                            .type(ApiStaticTimeZoneStrategy.Type.STATIC_TIME_ZONE)
                            .build()
                    )
                    .build()
            )
        assertThat(apiRelativeDateTimeValue.type())
            .isEqualTo(ApiRelativeDateTimeValue.Type.RELATIVE_DATETIME)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiRelativeDateTimeValue =
            ApiRelativeDateTimeValue.builder()
                .timeDelay(
                    ApiTimeDelay.builder()
                        .addDaysOfWeek(ApiTimeDelay.DaysOfWeek.MONDAY)
                        .delta(0)
                        .timeUnit(ApiTimeDelay.TimeUnit.CENTURIES)
                        .timeOfDay(ApiTimeOfDay.builder().hour(0).minute(0).build())
                        .timeZoneStrategy(
                            ApiStaticTimeZoneStrategy.builder()
                                .timeZoneId("timeZoneId")
                                .type(ApiStaticTimeZoneStrategy.Type.STATIC_TIME_ZONE)
                                .build()
                        )
                        .build()
                )
                .type(ApiRelativeDateTimeValue.Type.RELATIVE_DATETIME)
                .build()

        val roundtrippedApiRelativeDateTimeValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiRelativeDateTimeValue),
                jacksonTypeRef<ApiRelativeDateTimeValue>(),
            )

        assertThat(roundtrippedApiRelativeDateTimeValue).isEqualTo(apiRelativeDateTimeValue)
    }
}
