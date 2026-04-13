// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicQuarterReferenceTest {

    @Test
    fun create() {
        val publicQuarterReference =
            PublicQuarterReference.builder()
                .day(0)
                .month(0)
                .referenceType(PublicQuarterReference.ReferenceType.QUARTER)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        assertThat(publicQuarterReference.day()).isEqualTo(0)
        assertThat(publicQuarterReference.month()).isEqualTo(0)
        assertThat(publicQuarterReference.referenceType())
            .isEqualTo(PublicQuarterReference.ReferenceType.QUARTER)
        assertThat(publicQuarterReference.hour()).contains(0)
        assertThat(publicQuarterReference.millisecond()).contains(0)
        assertThat(publicQuarterReference.minute()).contains(0)
        assertThat(publicQuarterReference.second()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicQuarterReference =
            PublicQuarterReference.builder()
                .day(0)
                .month(0)
                .referenceType(PublicQuarterReference.ReferenceType.QUARTER)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        val roundtrippedPublicQuarterReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicQuarterReference),
                jacksonTypeRef<PublicQuarterReference>(),
            )

        assertThat(roundtrippedPublicQuarterReference).isEqualTo(publicQuarterReference)
    }
}
