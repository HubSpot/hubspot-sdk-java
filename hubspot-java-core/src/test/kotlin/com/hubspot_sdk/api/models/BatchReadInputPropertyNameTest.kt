// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchReadInputPropertyNameTest {

    @Test
    fun create() {
        val batchReadInputPropertyName =
            BatchReadInputPropertyName.builder()
                .archived(true)
                .dataSensitivity(BatchReadInputPropertyName.DataSensitivity.NON_SENSITIVE)
                .addInput(PropertyName.builder().name("name").build())
                .build()

        assertThat(batchReadInputPropertyName.archived()).isEqualTo(true)
        assertThat(batchReadInputPropertyName.dataSensitivity())
            .isEqualTo(BatchReadInputPropertyName.DataSensitivity.NON_SENSITIVE)
        assertThat(batchReadInputPropertyName.inputs())
            .containsExactly(PropertyName.builder().name("name").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchReadInputPropertyName =
            BatchReadInputPropertyName.builder()
                .archived(true)
                .dataSensitivity(BatchReadInputPropertyName.DataSensitivity.NON_SENSITIVE)
                .addInput(PropertyName.builder().name("name").build())
                .build()

        val roundtrippedBatchReadInputPropertyName =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchReadInputPropertyName),
                jacksonTypeRef<BatchReadInputPropertyName>(),
            )

        assertThat(roundtrippedBatchReadInputPropertyName).isEqualTo(batchReadInputPropertyName)
    }
}
