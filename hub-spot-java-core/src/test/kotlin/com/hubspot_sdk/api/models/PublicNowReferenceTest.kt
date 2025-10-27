// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicNowReferenceTest {

    @Test
    fun create() {
        val publicNowReference =
            PublicNowReference.builder()
                .referenceType(PublicNowReference.ReferenceType.NOW)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        assertThat(publicNowReference.referenceType())
            .isEqualTo(PublicNowReference.ReferenceType.NOW)
        assertThat(publicNowReference.hour()).contains(0)
        assertThat(publicNowReference.millisecond()).contains(0)
        assertThat(publicNowReference.minute()).contains(0)
        assertThat(publicNowReference.second()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicNowReference =
            PublicNowReference.builder()
                .referenceType(PublicNowReference.ReferenceType.NOW)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        val roundtrippedPublicNowReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicNowReference),
                jacksonTypeRef<PublicNowReference>(),
            )

        assertThat(roundtrippedPublicNowReference).isEqualTo(publicNowReference)
    }
}
