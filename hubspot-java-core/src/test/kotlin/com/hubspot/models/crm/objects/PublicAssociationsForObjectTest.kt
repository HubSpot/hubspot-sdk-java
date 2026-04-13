// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import com.hubspot.models.AssociationSpec
import com.hubspot.models.PublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAssociationsForObjectTest {

    @Test
    fun create() {
        val publicAssociationsForObject =
            PublicAssociationsForObject.builder()
                .to(PublicObjectId.builder().id("id").build())
                .addType(
                    AssociationSpec.builder()
                        .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                        .associationTypeId(0)
                        .build()
                )
                .build()

        assertThat(publicAssociationsForObject.to())
            .isEqualTo(PublicObjectId.builder().id("id").build())
        assertThat(publicAssociationsForObject.types())
            .containsExactly(
                AssociationSpec.builder()
                    .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                    .associationTypeId(0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAssociationsForObject =
            PublicAssociationsForObject.builder()
                .to(PublicObjectId.builder().id("id").build())
                .addType(
                    AssociationSpec.builder()
                        .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                        .associationTypeId(0)
                        .build()
                )
                .build()

        val roundtrippedPublicAssociationsForObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAssociationsForObject),
                jacksonTypeRef<PublicAssociationsForObject>(),
            )

        assertThat(roundtrippedPublicAssociationsForObject).isEqualTo(publicAssociationsForObject)
    }
}
