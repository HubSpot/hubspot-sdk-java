// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputSimplePublicObjectIdTest {

    @Test
    fun create() {
        val batchInputSimplePublicObjectId =
            BatchInputSimplePublicObjectId.builder()
                .addInput(SimplePublicObjectId.builder().id("id").build())
                .build()

        assertThat(batchInputSimplePublicObjectId.inputs())
            .containsExactly(SimplePublicObjectId.builder().id("id").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputSimplePublicObjectId =
            BatchInputSimplePublicObjectId.builder()
                .addInput(SimplePublicObjectId.builder().id("id").build())
                .build()

        val roundtrippedBatchInputSimplePublicObjectId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputSimplePublicObjectId),
                jacksonTypeRef<BatchInputSimplePublicObjectId>(),
            )

        assertThat(roundtrippedBatchInputSimplePublicObjectId)
            .isEqualTo(batchInputSimplePublicObjectId)
    }
}
