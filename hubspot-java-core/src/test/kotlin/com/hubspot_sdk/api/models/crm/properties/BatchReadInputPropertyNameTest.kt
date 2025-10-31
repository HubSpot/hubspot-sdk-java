// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.properties

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.PropertyName
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchReadInputPropertyNameTest {

    @Test
    fun create() {
        val batchReadInputPropertyName =
            BatchReadInputPropertyName.builder()
                .archived(true)
                .addInput(PropertyName.builder().name("name").build())
                .dataSensitivity(BatchReadInputPropertyName.DataSensitivity.NON_SENSITIVE)
                .build()

        assertThat(batchReadInputPropertyName.archived()).isEqualTo(true)
        assertThat(batchReadInputPropertyName.inputs())
            .containsExactly(PropertyName.builder().name("name").build())
        assertThat(batchReadInputPropertyName.dataSensitivity())
            .contains(BatchReadInputPropertyName.DataSensitivity.NON_SENSITIVE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchReadInputPropertyName =
            BatchReadInputPropertyName.builder()
                .archived(true)
                .addInput(PropertyName.builder().name("name").build())
                .dataSensitivity(BatchReadInputPropertyName.DataSensitivity.NON_SENSITIVE)
                .build()

        val roundtrippedBatchReadInputPropertyName =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchReadInputPropertyName),
                jacksonTypeRef<BatchReadInputPropertyName>(),
            )

        assertThat(roundtrippedBatchReadInputPropertyName).isEqualTo(batchReadInputPropertyName)
    }
}
