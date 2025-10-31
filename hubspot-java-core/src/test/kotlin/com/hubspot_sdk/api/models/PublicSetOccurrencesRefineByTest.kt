// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSetOccurrencesRefineByTest {

    @Test
    fun create() {
        val publicSetOccurrencesRefineBy =
            PublicSetOccurrencesRefineBy.builder()
                .setType("setType")
                .type(PublicSetOccurrencesRefineBy.Type.SET_OCCURRENCES)
                .build()

        assertThat(publicSetOccurrencesRefineBy.setType()).isEqualTo("setType")
        assertThat(publicSetOccurrencesRefineBy.type())
            .isEqualTo(PublicSetOccurrencesRefineBy.Type.SET_OCCURRENCES)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSetOccurrencesRefineBy =
            PublicSetOccurrencesRefineBy.builder()
                .setType("setType")
                .type(PublicSetOccurrencesRefineBy.Type.SET_OCCURRENCES)
                .build()

        val roundtrippedPublicSetOccurrencesRefineBy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSetOccurrencesRefineBy),
                jacksonTypeRef<PublicSetOccurrencesRefineBy>(),
            )

        assertThat(roundtrippedPublicSetOccurrencesRefineBy).isEqualTo(publicSetOccurrencesRefineBy)
    }
}
