// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.PublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputPublicDefaultAssociationMultiPostTest {

    @Test
    fun create() {
        val batchInputPublicDefaultAssociationMultiPost =
            BatchInputPublicDefaultAssociationMultiPost.builder()
                .addInput(
                    PublicDefaultAssociationMultiPost.builder()
                        .from(PublicObjectId.builder().id("37295").build())
                        .to(PublicObjectId.builder().id("37295").build())
                        .build()
                )
                .build()

        assertThat(batchInputPublicDefaultAssociationMultiPost.inputs())
            .containsExactly(
                PublicDefaultAssociationMultiPost.builder()
                    .from(PublicObjectId.builder().id("37295").build())
                    .to(PublicObjectId.builder().id("37295").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputPublicDefaultAssociationMultiPost =
            BatchInputPublicDefaultAssociationMultiPost.builder()
                .addInput(
                    PublicDefaultAssociationMultiPost.builder()
                        .from(PublicObjectId.builder().id("37295").build())
                        .to(PublicObjectId.builder().id("37295").build())
                        .build()
                )
                .build()

        val roundtrippedBatchInputPublicDefaultAssociationMultiPost =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputPublicDefaultAssociationMultiPost),
                jacksonTypeRef<BatchInputPublicDefaultAssociationMultiPost>(),
            )

        assertThat(roundtrippedBatchInputPublicDefaultAssociationMultiPost)
            .isEqualTo(batchInputPublicDefaultAssociationMultiPost)
    }
}
