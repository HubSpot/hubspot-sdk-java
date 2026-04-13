// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.associations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import com.hubspot.models.PublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputPublicAssociationMultiArchiveTest {

    @Test
    fun create() {
        val batchInputPublicAssociationMultiArchive =
            BatchInputPublicAssociationMultiArchive.builder()
                .addInput(
                    PublicAssociationMultiArchive.builder()
                        .from(PublicObjectId.builder().id("id").build())
                        .addTo(PublicObjectId.builder().id("id").build())
                        .build()
                )
                .build()

        assertThat(batchInputPublicAssociationMultiArchive.inputs())
            .containsExactly(
                PublicAssociationMultiArchive.builder()
                    .from(PublicObjectId.builder().id("id").build())
                    .addTo(PublicObjectId.builder().id("id").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputPublicAssociationMultiArchive =
            BatchInputPublicAssociationMultiArchive.builder()
                .addInput(
                    PublicAssociationMultiArchive.builder()
                        .from(PublicObjectId.builder().id("id").build())
                        .addTo(PublicObjectId.builder().id("id").build())
                        .build()
                )
                .build()

        val roundtrippedBatchInputPublicAssociationMultiArchive =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputPublicAssociationMultiArchive),
                jacksonTypeRef<BatchInputPublicAssociationMultiArchive>(),
            )

        assertThat(roundtrippedBatchInputPublicAssociationMultiArchive)
            .isEqualTo(batchInputPublicAssociationMultiArchive)
    }
}
