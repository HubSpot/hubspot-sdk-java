// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicNumOccurrencesRefineByTest {

    @Test
    fun create() {
        val publicNumOccurrencesRefineBy =
            PublicNumOccurrencesRefineBy.builder()
                .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                .maxOccurrences(0)
                .minOccurrences(0)
                .build()

        assertThat(publicNumOccurrencesRefineBy.type())
            .isEqualTo(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
        assertThat(publicNumOccurrencesRefineBy.maxOccurrences()).contains(0)
        assertThat(publicNumOccurrencesRefineBy.minOccurrences()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicNumOccurrencesRefineBy =
            PublicNumOccurrencesRefineBy.builder()
                .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                .maxOccurrences(0)
                .minOccurrences(0)
                .build()

        val roundtrippedPublicNumOccurrencesRefineBy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicNumOccurrencesRefineBy),
                jacksonTypeRef<PublicNumOccurrencesRefineBy>(),
            )

        assertThat(roundtrippedPublicNumOccurrencesRefineBy).isEqualTo(publicNumOccurrencesRefineBy)
    }
}
