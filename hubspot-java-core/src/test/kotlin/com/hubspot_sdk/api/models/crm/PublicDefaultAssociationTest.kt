// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.associations.v4.AssociationSpec1
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicDefaultAssociationTest {

    @Test
    fun create() {
        val publicDefaultAssociation =
            PublicDefaultAssociation.builder()
                .associationSpec(
                    AssociationSpec1.builder()
                        .associationCategory(AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED)
                        .associationTypeId(0)
                        .build()
                )
                .from(PublicObjectId.builder().id("37295").build())
                .to(PublicObjectId.builder().id("37295").build())
                .build()

        assertThat(publicDefaultAssociation.associationSpec())
            .isEqualTo(
                AssociationSpec1.builder()
                    .associationCategory(AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED)
                    .associationTypeId(0)
                    .build()
            )
        assertThat(publicDefaultAssociation.from())
            .isEqualTo(PublicObjectId.builder().id("37295").build())
        assertThat(publicDefaultAssociation.to())
            .isEqualTo(PublicObjectId.builder().id("37295").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicDefaultAssociation =
            PublicDefaultAssociation.builder()
                .associationSpec(
                    AssociationSpec1.builder()
                        .associationCategory(AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED)
                        .associationTypeId(0)
                        .build()
                )
                .from(PublicObjectId.builder().id("37295").build())
                .to(PublicObjectId.builder().id("37295").build())
                .build()

        val roundtrippedPublicDefaultAssociation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicDefaultAssociation),
                jacksonTypeRef<PublicDefaultAssociation>(),
            )

        assertThat(roundtrippedPublicDefaultAssociation).isEqualTo(publicDefaultAssociation)
    }
}
