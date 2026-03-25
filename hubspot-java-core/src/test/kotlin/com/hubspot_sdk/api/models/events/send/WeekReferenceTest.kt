// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WeekReferenceTest {

    @Test
    fun create() {
        val weekReference =
            WeekReference.builder()
                .dayOfWeek(WeekReference.DayOfWeek.FRIDAY)
                .referenceType(WeekReference.ReferenceType.WEEK)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        assertThat(weekReference.dayOfWeek()).isEqualTo(WeekReference.DayOfWeek.FRIDAY)
        assertThat(weekReference.referenceType()).isEqualTo(WeekReference.ReferenceType.WEEK)
        assertThat(weekReference.hour()).contains(0)
        assertThat(weekReference.millisecond()).contains(0)
        assertThat(weekReference.minute()).contains(0)
        assertThat(weekReference.second()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val weekReference =
            WeekReference.builder()
                .dayOfWeek(WeekReference.DayOfWeek.FRIDAY)
                .referenceType(WeekReference.ReferenceType.WEEK)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        val roundtrippedWeekReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(weekReference),
                jacksonTypeRef<WeekReference>(),
            )

        assertThat(roundtrippedWeekReference).isEqualTo(weekReference)
    }
}
