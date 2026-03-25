// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttentionSpanCalculatedValuesTest {

    @Test
    fun create() {
        val attentionSpanCalculatedValues =
            AttentionSpanCalculatedValues.builder()
                .totalPercentPlayed(0.0)
                .totalSecondsPlayed(0)
                .build()

        assertThat(attentionSpanCalculatedValues.totalPercentPlayed()).isEqualTo(0.0)
        assertThat(attentionSpanCalculatedValues.totalSecondsPlayed()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attentionSpanCalculatedValues =
            AttentionSpanCalculatedValues.builder()
                .totalPercentPlayed(0.0)
                .totalSecondsPlayed(0)
                .build()

        val roundtrippedAttentionSpanCalculatedValues =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attentionSpanCalculatedValues),
                jacksonTypeRef<AttentionSpanCalculatedValues>(),
            )

        assertThat(roundtrippedAttentionSpanCalculatedValues)
            .isEqualTo(attentionSpanCalculatedValues)
    }
}
