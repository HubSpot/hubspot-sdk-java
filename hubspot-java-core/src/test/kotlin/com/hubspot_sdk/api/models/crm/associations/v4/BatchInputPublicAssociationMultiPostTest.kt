// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.PublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputPublicAssociationMultiPostTest {

    @Test
    fun create() {
        val batchInputPublicAssociationMultiPost =
            BatchInputPublicAssociationMultiPost.builder()
                .addInput(
                    PublicAssociationMultiPost.builder()
                        .from(PublicObjectId.builder().id("37295").build())
                        .to(PublicObjectId.builder().id("37295").build())
                        .addType(
                            AssociationSpec1.builder()
                                .associationCategory(
                                    AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED
                                )
                                .associationTypeId(0)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(batchInputPublicAssociationMultiPost.inputs())
            .containsExactly(
                PublicAssociationMultiPost.builder()
                    .from(PublicObjectId.builder().id("37295").build())
                    .to(PublicObjectId.builder().id("37295").build())
                    .addType(
                        AssociationSpec1.builder()
                            .associationCategory(
                                AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED
                            )
                            .associationTypeId(0)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputPublicAssociationMultiPost =
            BatchInputPublicAssociationMultiPost.builder()
                .addInput(
                    PublicAssociationMultiPost.builder()
                        .from(PublicObjectId.builder().id("37295").build())
                        .to(PublicObjectId.builder().id("37295").build())
                        .addType(
                            AssociationSpec1.builder()
                                .associationCategory(
                                    AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED
                                )
                                .associationTypeId(0)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedBatchInputPublicAssociationMultiPost =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputPublicAssociationMultiPost),
                jacksonTypeRef<BatchInputPublicAssociationMultiPost>(),
            )

        assertThat(roundtrippedBatchInputPublicAssociationMultiPost)
            .isEqualTo(batchInputPublicAssociationMultiPost)
    }
}
