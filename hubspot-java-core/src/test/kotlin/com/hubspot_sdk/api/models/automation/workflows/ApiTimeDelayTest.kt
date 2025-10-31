// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiTimeDelayTest {

    @Test
    fun create() {
        val apiTimeDelay =
            ApiTimeDelay.builder()
                .addDaysOfWeek(ApiTimeDelay.DaysOfWeek.MONDAY)
                .delta(0)
                .timeUnit(ApiTimeDelay.TimeUnit.NANOS)
                .timeOfDay(ApiTimeOfDay.builder().hour(0).minute(0).build())
                .timeZoneStrategy(
                    ApiStaticTimeZoneStrategy.builder()
                        .timeZoneId("timeZoneId")
                        .type(ApiStaticTimeZoneStrategy.Type.STATIC_TIME_ZONE)
                        .build()
                )
                .build()

        assertThat(apiTimeDelay.daysOfWeek()).containsExactly(ApiTimeDelay.DaysOfWeek.MONDAY)
        assertThat(apiTimeDelay.delta()).isEqualTo(0)
        assertThat(apiTimeDelay.timeUnit()).isEqualTo(ApiTimeDelay.TimeUnit.NANOS)
        assertThat(apiTimeDelay.timeOfDay())
            .contains(ApiTimeOfDay.builder().hour(0).minute(0).build())
        assertThat(apiTimeDelay.timeZoneStrategy())
            .contains(
                ApiStaticTimeZoneStrategy.builder()
                    .timeZoneId("timeZoneId")
                    .type(ApiStaticTimeZoneStrategy.Type.STATIC_TIME_ZONE)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiTimeDelay =
            ApiTimeDelay.builder()
                .addDaysOfWeek(ApiTimeDelay.DaysOfWeek.MONDAY)
                .delta(0)
                .timeUnit(ApiTimeDelay.TimeUnit.NANOS)
                .timeOfDay(ApiTimeOfDay.builder().hour(0).minute(0).build())
                .timeZoneStrategy(
                    ApiStaticTimeZoneStrategy.builder()
                        .timeZoneId("timeZoneId")
                        .type(ApiStaticTimeZoneStrategy.Type.STATIC_TIME_ZONE)
                        .build()
                )
                .build()

        val roundtrippedApiTimeDelay =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiTimeDelay),
                jacksonTypeRef<ApiTimeDelay>(),
            )

        assertThat(roundtrippedApiTimeDelay).isEqualTo(apiTimeDelay)
    }
}
