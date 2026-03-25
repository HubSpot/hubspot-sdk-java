// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumOccurrencesRefineByTest {

    @Test
    fun create() {
        val numOccurrencesRefineBy =
            NumOccurrencesRefineBy.builder()
                .type(NumOccurrencesRefineBy.Type.NUM_OCCURRENCES_REFINE_BY)
                .maxOccurrences(0)
                .minOccurrences(0)
                .build()

        assertThat(numOccurrencesRefineBy.type())
            .isEqualTo(NumOccurrencesRefineBy.Type.NUM_OCCURRENCES_REFINE_BY)
        assertThat(numOccurrencesRefineBy.maxOccurrences()).contains(0)
        assertThat(numOccurrencesRefineBy.minOccurrences()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numOccurrencesRefineBy =
            NumOccurrencesRefineBy.builder()
                .type(NumOccurrencesRefineBy.Type.NUM_OCCURRENCES_REFINE_BY)
                .maxOccurrences(0)
                .minOccurrences(0)
                .build()

        val roundtrippedNumOccurrencesRefineBy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numOccurrencesRefineBy),
                jacksonTypeRef<NumOccurrencesRefineBy>(),
            )

        assertThat(roundtrippedNumOccurrencesRefineBy).isEqualTo(numOccurrencesRefineBy)
    }
}
