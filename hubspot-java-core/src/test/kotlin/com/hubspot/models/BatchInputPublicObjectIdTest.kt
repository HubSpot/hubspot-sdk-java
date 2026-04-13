// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputPublicObjectIdTest {

    @Test
    fun create() {
        val batchInputPublicObjectId =
            BatchInputPublicObjectId.builder()
                .addInput(PublicObjectId.builder().id("id").build())
                .build()

        assertThat(batchInputPublicObjectId.inputs())
            .containsExactly(PublicObjectId.builder().id("id").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputPublicObjectId =
            BatchInputPublicObjectId.builder()
                .addInput(PublicObjectId.builder().id("id").build())
                .build()

        val roundtrippedBatchInputPublicObjectId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputPublicObjectId),
                jacksonTypeRef<BatchInputPublicObjectId>(),
            )

        assertThat(roundtrippedBatchInputPublicObjectId).isEqualTo(batchInputPublicObjectId)
    }
}
