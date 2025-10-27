// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicYearReferenceTest {

    @Test
    fun create() {
        val publicYearReference =
            PublicYearReference.builder()
                .day(0)
                .month(0)
                .referenceType(PublicYearReference.ReferenceType.YEAR)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        assertThat(publicYearReference.day()).isEqualTo(0)
        assertThat(publicYearReference.month()).isEqualTo(0)
        assertThat(publicYearReference.referenceType())
            .isEqualTo(PublicYearReference.ReferenceType.YEAR)
        assertThat(publicYearReference.hour()).contains(0)
        assertThat(publicYearReference.millisecond()).contains(0)
        assertThat(publicYearReference.minute()).contains(0)
        assertThat(publicYearReference.second()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicYearReference =
            PublicYearReference.builder()
                .day(0)
                .month(0)
                .referenceType(PublicYearReference.ReferenceType.YEAR)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        val roundtrippedPublicYearReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicYearReference),
                jacksonTypeRef<PublicYearReference>(),
            )

        assertThat(roundtrippedPublicYearReference).isEqualTo(publicYearReference)
    }
}
