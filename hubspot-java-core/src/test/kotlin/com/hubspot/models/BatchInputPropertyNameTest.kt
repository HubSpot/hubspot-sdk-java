// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputPropertyNameTest {

    @Test
    fun create() {
        val batchInputPropertyName =
            BatchInputPropertyName.builder()
                .addInput(PropertyName.builder().name("name").build())
                .build()

        assertThat(batchInputPropertyName.inputs())
            .containsExactly(PropertyName.builder().name("name").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputPropertyName =
            BatchInputPropertyName.builder()
                .addInput(PropertyName.builder().name("name").build())
                .build()

        val roundtrippedBatchInputPropertyName =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputPropertyName),
                jacksonTypeRef<BatchInputPropertyName>(),
            )

        assertThat(roundtrippedBatchInputPropertyName).isEqualTo(batchInputPropertyName)
    }
}
