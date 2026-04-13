// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputHubDbTableRowBatchCloneRequestTest {

    @Test
    fun create() {
        val batchInputHubDbTableRowBatchCloneRequest =
            BatchInputHubDbTableRowBatchCloneRequest.builder()
                .addInput(HubDbTableRowBatchCloneRequest.builder().id("id").name("name").build())
                .build()

        assertThat(batchInputHubDbTableRowBatchCloneRequest.inputs())
            .containsExactly(HubDbTableRowBatchCloneRequest.builder().id("id").name("name").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputHubDbTableRowBatchCloneRequest =
            BatchInputHubDbTableRowBatchCloneRequest.builder()
                .addInput(HubDbTableRowBatchCloneRequest.builder().id("id").name("name").build())
                .build()

        val roundtrippedBatchInputHubDbTableRowBatchCloneRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputHubDbTableRowBatchCloneRequest),
                jacksonTypeRef<BatchInputHubDbTableRowBatchCloneRequest>(),
            )

        assertThat(roundtrippedBatchInputHubDbTableRowBatchCloneRequest)
            .isEqualTo(batchInputHubDbTableRowBatchCloneRequest)
    }
}
