// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class YearReferenceTest {

    @Test
    fun create() {
        val yearReference =
            YearReference.builder()
                .day(0)
                .month(0)
                .referenceType(YearReference.ReferenceType.YEAR)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        assertThat(yearReference.day()).isEqualTo(0)
        assertThat(yearReference.month()).isEqualTo(0)
        assertThat(yearReference.referenceType()).isEqualTo(YearReference.ReferenceType.YEAR)
        assertThat(yearReference.hour()).contains(0)
        assertThat(yearReference.millisecond()).contains(0)
        assertThat(yearReference.minute()).contains(0)
        assertThat(yearReference.second()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val yearReference =
            YearReference.builder()
                .day(0)
                .month(0)
                .referenceType(YearReference.ReferenceType.YEAR)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        val roundtrippedYearReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(yearReference),
                jacksonTypeRef<YearReference>(),
            )

        assertThat(roundtrippedYearReference).isEqualTo(yearReference)
    }
}
