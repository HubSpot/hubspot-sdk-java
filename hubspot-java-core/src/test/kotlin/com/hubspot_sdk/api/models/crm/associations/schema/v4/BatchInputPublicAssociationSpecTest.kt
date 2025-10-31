// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.schema.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputPublicAssociationSpecTest {

    @Test
    fun create() {
        val batchInputPublicAssociationSpec =
            BatchInputPublicAssociationSpec.builder()
                .addInput(PublicAssociationSpec.builder().category("category").typeId(0).build())
                .build()

        assertThat(batchInputPublicAssociationSpec.inputs())
            .containsExactly(PublicAssociationSpec.builder().category("category").typeId(0).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputPublicAssociationSpec =
            BatchInputPublicAssociationSpec.builder()
                .addInput(PublicAssociationSpec.builder().category("category").typeId(0).build())
                .build()

        val roundtrippedBatchInputPublicAssociationSpec =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputPublicAssociationSpec),
                jacksonTypeRef<BatchInputPublicAssociationSpec>(),
            )

        assertThat(roundtrippedBatchInputPublicAssociationSpec)
            .isEqualTo(batchInputPublicAssociationSpec)
    }
}
