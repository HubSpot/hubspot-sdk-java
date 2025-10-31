// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NowReferenceTest {

    @Test
    fun create() {
        val nowReference =
            NowReference.builder()
                .referenceType(NowReference.ReferenceType.NOW)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        assertThat(nowReference.referenceType()).isEqualTo(NowReference.ReferenceType.NOW)
        assertThat(nowReference.hour()).contains(0)
        assertThat(nowReference.millisecond()).contains(0)
        assertThat(nowReference.minute()).contains(0)
        assertThat(nowReference.second()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val nowReference =
            NowReference.builder()
                .referenceType(NowReference.ReferenceType.NOW)
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        val roundtrippedNowReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(nowReference),
                jacksonTypeRef<NowReference>(),
            )

        assertThat(roundtrippedNowReference).isEqualTo(nowReference)
    }
}
