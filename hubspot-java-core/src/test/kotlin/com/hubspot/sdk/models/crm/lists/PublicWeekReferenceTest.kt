// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicWeekReferenceTest {

    @Test
    fun create() {
        val publicWeekReference =
            PublicWeekReference.builder()
                .dayOfWeek(PublicWeekReference.DayOfWeek.FRIDAY)
                .referenceType(PublicWeekReference.ReferenceType.WEEK)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        assertThat(publicWeekReference.dayOfWeek()).isEqualTo(PublicWeekReference.DayOfWeek.FRIDAY)
        assertThat(publicWeekReference.referenceType())
            .isEqualTo(PublicWeekReference.ReferenceType.WEEK)
        assertThat(publicWeekReference.hour()).contains(0)
        assertThat(publicWeekReference.millisecond()).contains(0)
        assertThat(publicWeekReference.minute()).contains(0)
        assertThat(publicWeekReference.second()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicWeekReference =
            PublicWeekReference.builder()
                .dayOfWeek(PublicWeekReference.DayOfWeek.FRIDAY)
                .referenceType(PublicWeekReference.ReferenceType.WEEK)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        val roundtrippedPublicWeekReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicWeekReference),
                jacksonTypeRef<PublicWeekReference>(),
            )

        assertThat(roundtrippedPublicWeekReference).isEqualTo(publicWeekReference)
    }
}
