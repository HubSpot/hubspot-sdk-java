// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationSpec1Test {

    @Test
    fun create() {
        val associationSpec1 =
            AssociationSpec1.builder()
                .associationCategory(AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED)
                .associationTypeId(0)
                .build()

        assertThat(associationSpec1.associationCategory())
            .isEqualTo(AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED)
        assertThat(associationSpec1.associationTypeId()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associationSpec1 =
            AssociationSpec1.builder()
                .associationCategory(AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED)
                .associationTypeId(0)
                .build()

        val roundtrippedAssociationSpec1 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associationSpec1),
                jacksonTypeRef<AssociationSpec1>(),
            )

        assertThat(roundtrippedAssociationSpec1).isEqualTo(associationSpec1)
    }
}
