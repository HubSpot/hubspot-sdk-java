// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuarterReferenceTest {

    @Test
    fun create() {
        val quarterReference =
            QuarterReference.builder()
                .day(0)
                .month(0)
                .referenceType(QuarterReference.ReferenceType.QUARTER)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        assertThat(quarterReference.day()).isEqualTo(0)
        assertThat(quarterReference.month()).isEqualTo(0)
        assertThat(quarterReference.referenceType())
            .isEqualTo(QuarterReference.ReferenceType.QUARTER)
        assertThat(quarterReference.hour()).contains(0)
        assertThat(quarterReference.millisecond()).contains(0)
        assertThat(quarterReference.minute()).contains(0)
        assertThat(quarterReference.second()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val quarterReference =
            QuarterReference.builder()
                .day(0)
                .month(0)
                .referenceType(QuarterReference.ReferenceType.QUARTER)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        val roundtrippedQuarterReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(quarterReference),
                jacksonTypeRef<QuarterReference>(),
            )

        assertThat(roundtrippedQuarterReference).isEqualTo(quarterReference)
    }
}
