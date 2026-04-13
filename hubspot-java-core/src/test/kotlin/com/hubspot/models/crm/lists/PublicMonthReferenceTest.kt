// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicMonthReferenceTest {

    @Test
    fun create() {
        val publicMonthReference =
            PublicMonthReference.builder()
                .day(0)
                .referenceType(PublicMonthReference.ReferenceType.MONTH)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        assertThat(publicMonthReference.day()).isEqualTo(0)
        assertThat(publicMonthReference.referenceType())
            .isEqualTo(PublicMonthReference.ReferenceType.MONTH)
        assertThat(publicMonthReference.hour()).contains(0)
        assertThat(publicMonthReference.millisecond()).contains(0)
        assertThat(publicMonthReference.minute()).contains(0)
        assertThat(publicMonthReference.second()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicMonthReference =
            PublicMonthReference.builder()
                .day(0)
                .referenceType(PublicMonthReference.ReferenceType.MONTH)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        val roundtrippedPublicMonthReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicMonthReference),
                jacksonTypeRef<PublicMonthReference>(),
            )

        assertThat(roundtrippedPublicMonthReference).isEqualTo(publicMonthReference)
    }
}
