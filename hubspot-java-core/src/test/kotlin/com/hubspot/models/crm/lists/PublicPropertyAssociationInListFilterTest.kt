// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicPropertyAssociationInListFilterTest {

    @Test
    fun create() {
        val publicPropertyAssociationInListFilter =
            PublicPropertyAssociationInListFilter.builder()
                .coalescingRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .filterType(PublicPropertyAssociationInListFilter.FilterType.PROPERTY_ASSOCIATION)
                .listId("listId")
                .operator("operator")
                .propertyWithObjectId("propertyWithObjectId")
                .toObjectTypeId("toObjectTypeId")
                .build()

        assertThat(publicPropertyAssociationInListFilter.coalescingRefineBy())
            .isEqualTo(
                PublicPropertyAssociationInListFilter.CoalescingRefineBy.ofPublicNumOccurrences(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
            )
        assertThat(publicPropertyAssociationInListFilter.filterType())
            .isEqualTo(PublicPropertyAssociationInListFilter.FilterType.PROPERTY_ASSOCIATION)
        assertThat(publicPropertyAssociationInListFilter.listId()).isEqualTo("listId")
        assertThat(publicPropertyAssociationInListFilter.operator()).isEqualTo("operator")
        assertThat(publicPropertyAssociationInListFilter.propertyWithObjectId())
            .isEqualTo("propertyWithObjectId")
        assertThat(publicPropertyAssociationInListFilter.toObjectTypeId())
            .contains("toObjectTypeId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicPropertyAssociationInListFilter =
            PublicPropertyAssociationInListFilter.builder()
                .coalescingRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .filterType(PublicPropertyAssociationInListFilter.FilterType.PROPERTY_ASSOCIATION)
                .listId("listId")
                .operator("operator")
                .propertyWithObjectId("propertyWithObjectId")
                .toObjectTypeId("toObjectTypeId")
                .build()

        val roundtrippedPublicPropertyAssociationInListFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicPropertyAssociationInListFilter),
                jacksonTypeRef<PublicPropertyAssociationInListFilter>(),
            )

        assertThat(roundtrippedPublicPropertyAssociationInListFilter)
            .isEqualTo(publicPropertyAssociationInListFilter)
    }
}
