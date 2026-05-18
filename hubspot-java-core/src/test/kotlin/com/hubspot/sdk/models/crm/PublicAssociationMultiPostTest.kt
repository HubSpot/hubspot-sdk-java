// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.AssociationSpec
import com.hubspot.sdk.models.PublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAssociationMultiPostTest {

    @Test
    fun create() {
        val publicAssociationMultiPost =
            PublicAssociationMultiPost.builder()
                .from(PublicObjectId.builder().id("id").build())
                .to(PublicObjectId.builder().id("id").build())
                .addType(
                    AssociationSpec.builder()
                        .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                        .associationTypeId(0)
                        .build()
                )
                .build()

        assertThat(publicAssociationMultiPost.from())
            .isEqualTo(PublicObjectId.builder().id("id").build())
        assertThat(publicAssociationMultiPost.to())
            .isEqualTo(PublicObjectId.builder().id("id").build())
        assertThat(publicAssociationMultiPost.types())
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
        val publicAssociationMultiPost =
            PublicAssociationMultiPost.builder()
                .from(PublicObjectId.builder().id("id").build())
                .to(PublicObjectId.builder().id("id").build())
                .addType(
                    AssociationSpec.builder()
                        .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
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
