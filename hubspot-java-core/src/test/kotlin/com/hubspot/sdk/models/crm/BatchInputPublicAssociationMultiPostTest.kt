// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.AssociationSpec
import com.hubspot.sdk.models.PublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputPublicAssociationMultiPostTest {

    @Test
    fun create() {
        val batchInputPublicAssociationMultiPost =
            BatchInputPublicAssociationMultiPost.builder()
                .addInput(
                    PublicAssociationMultiPost.builder()
                        .from(PublicObjectId.builder().id("id").build())
                        .to(PublicObjectId.builder().id("id").build())
                        .addType(
                            AssociationSpec.builder()
                                .associationCategory(
                                    AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
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
                    .from(PublicObjectId.builder().id("id").build())
                    .to(PublicObjectId.builder().id("id").build())
                    .addType(
                        AssociationSpec.builder()
                            .associationCategory(
                                AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
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
                        .from(PublicObjectId.builder().id("id").build())
                        .to(PublicObjectId.builder().id("id").build())
                        .addType(
                            AssociationSpec.builder()
                                .associationCategory(
                                    AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
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
