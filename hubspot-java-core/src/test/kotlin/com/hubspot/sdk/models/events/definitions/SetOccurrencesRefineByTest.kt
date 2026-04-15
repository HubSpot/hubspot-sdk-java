// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SetOccurrencesRefineByTest {

    @Test
    fun create() {
        val setOccurrencesRefineBy =
            SetOccurrencesRefineBy.builder()
                .setType(SetOccurrencesRefineBy.SetType.ALL)
                .type(SetOccurrencesRefineBy.Type.SET_OCCURRENCES_REFINE_BY)
                .build()

        assertThat(setOccurrencesRefineBy.setType()).isEqualTo(SetOccurrencesRefineBy.SetType.ALL)
        assertThat(setOccurrencesRefineBy.type())
            .isEqualTo(SetOccurrencesRefineBy.Type.SET_OCCURRENCES_REFINE_BY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val setOccurrencesRefineBy =
            SetOccurrencesRefineBy.builder()
                .setType(SetOccurrencesRefineBy.SetType.ALL)
                .type(SetOccurrencesRefineBy.Type.SET_OCCURRENCES_REFINE_BY)
                .build()

        val roundtrippedSetOccurrencesRefineBy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(setOccurrencesRefineBy),
                jacksonTypeRef<SetOccurrencesRefineBy>(),
            )

        assertThat(roundtrippedSetOccurrencesRefineBy).isEqualTo(setOccurrencesRefineBy)
    }
}
