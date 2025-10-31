// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAssociationInListFilterTest {

    @Test
    fun create() {
        val publicAssociationInListFilter =
            PublicAssociationInListFilter.builder()
                .associationCategory("associationCategory")
                .associationTypeId(0)
                .coalescingRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .filterType(PublicAssociationInListFilter.FilterType.ASSOCIATION)
                .listId("listId")
                .operator("operator")
                .toObjectType("toObjectType")
                .toObjectTypeId("toObjectTypeId")
                .build()

        assertThat(publicAssociationInListFilter.associationCategory())
            .isEqualTo("associationCategory")
        assertThat(publicAssociationInListFilter.associationTypeId()).isEqualTo(0)
        assertThat(publicAssociationInListFilter.coalescingRefineBy())
            .isEqualTo(
                PublicAssociationInListFilter.CoalescingRefineBy.ofPublicNumOccurrences(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
            )
        assertThat(publicAssociationInListFilter.filterType())
            .isEqualTo(PublicAssociationInListFilter.FilterType.ASSOCIATION)
        assertThat(publicAssociationInListFilter.listId()).isEqualTo("listId")
        assertThat(publicAssociationInListFilter.operator()).isEqualTo("operator")
        assertThat(publicAssociationInListFilter.toObjectType()).contains("toObjectType")
        assertThat(publicAssociationInListFilter.toObjectTypeId()).contains("toObjectTypeId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAssociationInListFilter =
            PublicAssociationInListFilter.builder()
                .associationCategory("associationCategory")
                .associationTypeId(0)
                .coalescingRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .filterType(PublicAssociationInListFilter.FilterType.ASSOCIATION)
                .listId("listId")
                .operator("operator")
                .toObjectType("toObjectType")
                .toObjectTypeId("toObjectTypeId")
                .build()

        val roundtrippedPublicAssociationInListFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAssociationInListFilter),
                jacksonTypeRef<PublicAssociationInListFilter>(),
            )

        assertThat(roundtrippedPublicAssociationInListFilter)
            .isEqualTo(publicAssociationInListFilter)
    }
}
