// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MonthReferenceTest {

    @Test
    fun create() {
        val monthReference =
            MonthReference.builder()
                .day(0)
                .referenceType(MonthReference.ReferenceType.MONTH)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        assertThat(monthReference.day()).isEqualTo(0)
        assertThat(monthReference.referenceType()).isEqualTo(MonthReference.ReferenceType.MONTH)
        assertThat(monthReference.hour()).contains(0)
        assertThat(monthReference.millisecond()).contains(0)
        assertThat(monthReference.minute()).contains(0)
        assertThat(monthReference.second()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val monthReference =
            MonthReference.builder()
                .day(0)
                .referenceType(MonthReference.ReferenceType.MONTH)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        val roundtrippedMonthReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(monthReference),
                jacksonTypeRef<MonthReference>(),
            )

        assertThat(roundtrippedMonthReference).isEqualTo(monthReference)
    }
}
