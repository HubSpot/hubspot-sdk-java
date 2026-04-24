// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.AssociationSpec
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupAssociationSpecTest {

    @Test
    fun create() {
        val lookupAssociationSpec =
            LookupAssociationSpec.builder()
                .associationSpec(
                    AssociationSpec.builder()
                        .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                        .associationTypeId(0)
                        .build()
                )
                .cardinality(LookupAssociationSpec.Cardinality.ONE_TO_MANY)
                .maxToObjectIds(0)
                .toObjectTypeId("toObjectTypeId")
                .build()

        assertThat(lookupAssociationSpec.associationSpec())
            .isEqualTo(
                AssociationSpec.builder()
                    .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                    .associationTypeId(0)
                    .build()
            )
        assertThat(lookupAssociationSpec.cardinality())
            .contains(LookupAssociationSpec.Cardinality.ONE_TO_MANY)
        assertThat(lookupAssociationSpec.maxToObjectIds()).contains(0)
        assertThat(lookupAssociationSpec.toObjectTypeId()).contains("toObjectTypeId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupAssociationSpec =
            LookupAssociationSpec.builder()
                .associationSpec(
                    AssociationSpec.builder()
                        .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                        .associationTypeId(0)
                        .build()
                )
                .cardinality(LookupAssociationSpec.Cardinality.ONE_TO_MANY)
                .maxToObjectIds(0)
                .toObjectTypeId("toObjectTypeId")
                .build()

        val roundtrippedLookupAssociationSpec =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lookupAssociationSpec),
                jacksonTypeRef<LookupAssociationSpec>(),
            )

        assertThat(roundtrippedLookupAssociationSpec).isEqualTo(lookupAssociationSpec)
    }
}
