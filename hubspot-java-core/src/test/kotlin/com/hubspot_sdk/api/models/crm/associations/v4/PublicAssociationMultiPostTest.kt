// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.PublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAssociationMultiPostTest {

    @Test
    fun create() {
        val publicAssociationMultiPost =
            PublicAssociationMultiPost.builder()
                .from(PublicObjectId.builder().id("37295").build())
                .to(PublicObjectId.builder().id("37295").build())
                .addType(
                    AssociationSpec1.builder()
                        .associationCategory(AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED)
                        .associationTypeId(0)
                        .build()
                )
                .build()

        assertThat(publicAssociationMultiPost.from())
            .isEqualTo(PublicObjectId.builder().id("37295").build())
        assertThat(publicAssociationMultiPost.to())
            .isEqualTo(PublicObjectId.builder().id("37295").build())
        assertThat(publicAssociationMultiPost.types())
            .containsExactly(
                AssociationSpec1.builder()
                    .associationCategory(AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED)
                    .associationTypeId(0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAssociationMultiPost =
            PublicAssociationMultiPost.builder()
                .from(PublicObjectId.builder().id("37295").build())
                .to(PublicObjectId.builder().id("37295").build())
                .addType(
                    AssociationSpec1.builder()
                        .associationCategory(AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED)
                        .associationTypeId(0)
                        .build()
                )
                .build()

        val roundtrippedPublicAssociationMultiPost =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAssociationMultiPost),
                jacksonTypeRef<PublicAssociationMultiPost>(),
            )

        assertThat(roundtrippedPublicAssociationMultiPost).isEqualTo(publicAssociationMultiPost)
    }
}
