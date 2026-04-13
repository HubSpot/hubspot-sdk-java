// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import com.hubspot.models.AssociationSpec
import com.hubspot.models.PublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicDefaultAssociationTest {

    @Test
    fun create() {
        val publicDefaultAssociation =
            PublicDefaultAssociation.builder()
                .associationSpec(
                    AssociationSpec.builder()
                        .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                        .associationTypeId(0)
                        .build()
                )
                .from(PublicObjectId.builder().id("id").build())
                .to(PublicObjectId.builder().id("id").build())
                .build()

        assertThat(publicDefaultAssociation.associationSpec())
            .isEqualTo(
                AssociationSpec.builder()
                    .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                    .associationTypeId(0)
                    .build()
            )
        assertThat(publicDefaultAssociation.from())
            .isEqualTo(PublicObjectId.builder().id("id").build())
        assertThat(publicDefaultAssociation.to())
            .isEqualTo(PublicObjectId.builder().id("id").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicDefaultAssociation =
            PublicDefaultAssociation.builder()
                .associationSpec(
                    AssociationSpec.builder()
                        .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                        .associationTypeId(0)
                        .build()
                )
                .from(PublicObjectId.builder().id("id").build())
                .to(PublicObjectId.builder().id("id").build())
                .build()

        val roundtrippedPublicDefaultAssociation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicDefaultAssociation),
                jacksonTypeRef<PublicDefaultAssociation>(),
            )

        assertThat(roundtrippedPublicDefaultAssociation).isEqualTo(publicDefaultAssociation)
    }
}
