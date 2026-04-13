// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationSpecTest {

    @Test
    fun create() {
        val associationSpec =
            AssociationSpec.builder()
                .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                .associationTypeId(0)
                .build()

        assertThat(associationSpec.associationCategory())
            .isEqualTo(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
        assertThat(associationSpec.associationTypeId()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associationSpec =
            AssociationSpec.builder()
                .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                .associationTypeId(0)
                .build()

        val roundtrippedAssociationSpec =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associationSpec),
                jacksonTypeRef<AssociationSpec>(),
            )

        assertThat(roundtrippedAssociationSpec).isEqualTo(associationSpec)
    }
}
