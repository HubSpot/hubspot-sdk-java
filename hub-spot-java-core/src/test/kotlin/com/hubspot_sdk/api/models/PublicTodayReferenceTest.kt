// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicTodayReferenceTest {

    @Test
    fun create() {
        val publicTodayReference =
            PublicTodayReference.builder()
                .referenceType(PublicTodayReference.ReferenceType.TODAY)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        assertThat(publicTodayReference.referenceType())
            .isEqualTo(PublicTodayReference.ReferenceType.TODAY)
        assertThat(publicTodayReference.hour()).contains(0)
        assertThat(publicTodayReference.millisecond()).contains(0)
        assertThat(publicTodayReference.minute()).contains(0)
        assertThat(publicTodayReference.second()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicTodayReference =
            PublicTodayReference.builder()
                .referenceType(PublicTodayReference.ReferenceType.TODAY)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        val roundtrippedPublicTodayReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicTodayReference),
                jacksonTypeRef<PublicTodayReference>(),
            )

        assertThat(roundtrippedPublicTodayReference).isEqualTo(publicTodayReference)
    }
}
