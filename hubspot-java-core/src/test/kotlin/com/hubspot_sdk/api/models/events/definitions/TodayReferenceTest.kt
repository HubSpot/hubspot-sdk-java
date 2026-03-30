// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TodayReferenceTest {

    @Test
    fun create() {
        val todayReference =
            TodayReference.builder()
                .referenceType(TodayReference.ReferenceType.TODAY)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        assertThat(todayReference.referenceType()).isEqualTo(TodayReference.ReferenceType.TODAY)
        assertThat(todayReference.hour()).contains(0)
        assertThat(todayReference.millisecond()).contains(0)
        assertThat(todayReference.minute()).contains(0)
        assertThat(todayReference.second()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val todayReference =
            TodayReference.builder()
                .referenceType(TodayReference.ReferenceType.TODAY)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        val roundtrippedTodayReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(todayReference),
                jacksonTypeRef<TodayReference>(),
            )

        assertThat(roundtrippedTodayReference).isEqualTo(todayReference)
    }
}
