// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicNumAssociationsFilterTest {

    @Test
    fun create() {
        val publicNumAssociationsFilter =
            PublicNumAssociationsFilter.builder()
                .associationCategory("associationCategory")
                .associationTypeId(0)
                .coalescingRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .filterType(PublicNumAssociationsFilter.FilterType.NUM_ASSOCIATIONS)
                .build()

        assertThat(publicNumAssociationsFilter.associationCategory())
            .isEqualTo("associationCategory")
        assertThat(publicNumAssociationsFilter.associationTypeId()).isEqualTo(0)
        assertThat(publicNumAssociationsFilter.coalescingRefineBy())
            .isEqualTo(
                PublicNumAssociationsFilter.CoalescingRefineBy.ofPublicNumOccurrences(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
            )
        assertThat(publicNumAssociationsFilter.filterType())
            .isEqualTo(PublicNumAssociationsFilter.FilterType.NUM_ASSOCIATIONS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicNumAssociationsFilter =
            PublicNumAssociationsFilter.builder()
                .associationCategory("associationCategory")
                .associationTypeId(0)
                .coalescingRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .filterType(PublicNumAssociationsFilter.FilterType.NUM_ASSOCIATIONS)
                .build()

        val roundtrippedPublicNumAssociationsFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicNumAssociationsFilter),
                jacksonTypeRef<PublicNumAssociationsFilter>(),
            )

        assertThat(roundtrippedPublicNumAssociationsFilter).isEqualTo(publicNumAssociationsFilter)
    }
}
