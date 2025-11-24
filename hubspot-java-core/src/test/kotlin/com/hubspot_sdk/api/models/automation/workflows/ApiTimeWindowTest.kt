// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiTimeWindowTest {

    @Test
    fun create() {
        val apiTimeWindow =
            ApiTimeWindow.builder()
                .day(ApiTimeWindow.Day.FRIDAY)
                .endTime(ApiTimeOfDay.builder().hour(0).minute(0).build())
                .startTime(ApiTimeOfDay.builder().hour(0).minute(0).build())
                .build()

        assertThat(apiTimeWindow.day()).isEqualTo(ApiTimeWindow.Day.FRIDAY)
        assertThat(apiTimeWindow.endTime())
            .contains(ApiTimeOfDay.builder().hour(0).minute(0).build())
        assertThat(apiTimeWindow.startTime())
            .contains(ApiTimeOfDay.builder().hour(0).minute(0).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiTimeWindow =
            ApiTimeWindow.builder()
                .day(ApiTimeWindow.Day.FRIDAY)
                .endTime(ApiTimeOfDay.builder().hour(0).minute(0).build())
                .startTime(ApiTimeOfDay.builder().hour(0).minute(0).build())
                .build()

        val roundtrippedApiTimeWindow =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiTimeWindow),
                jacksonTypeRef<ApiTimeWindow>(),
            )

        assertThat(roundtrippedApiTimeWindow).isEqualTo(apiTimeWindow)
    }
}
