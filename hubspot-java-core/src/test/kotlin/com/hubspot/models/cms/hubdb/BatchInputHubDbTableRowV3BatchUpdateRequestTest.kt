// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputHubDbTableRowV3BatchUpdateRequestTest {

    @Test
    fun create() {
        val batchInputHubDbTableRowV3BatchUpdateRequest =
            BatchInputHubDbTableRowV3BatchUpdateRequest.builder()
                .addInput(
                    HubDbTableRowV3BatchUpdateRequest.builder()
                        .childTableId(0)
                        .displayIndex(0)
                        .values(
                            HubDbTableRowV3BatchUpdateRequest.Values.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .id("id")
                        .name("name")
                        .path("path")
                        .build()
                )
                .build()

        assertThat(batchInputHubDbTableRowV3BatchUpdateRequest.inputs())
            .containsExactly(
                HubDbTableRowV3BatchUpdateRequest.builder()
                    .childTableId(0)
                    .displayIndex(0)
                    .values(
                        HubDbTableRowV3BatchUpdateRequest.Values.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .id("id")
                    .name("name")
                    .path("path")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputHubDbTableRowV3BatchUpdateRequest =
            BatchInputHubDbTableRowV3BatchUpdateRequest.builder()
                .addInput(
                    HubDbTableRowV3BatchUpdateRequest.builder()
                        .childTableId(0)
                        .displayIndex(0)
                        .values(
                            HubDbTableRowV3BatchUpdateRequest.Values.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .id("id")
                        .name("name")
                        .path("path")
                        .build()
                )
                .build()

        val roundtrippedBatchInputHubDbTableRowV3BatchUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputHubDbTableRowV3BatchUpdateRequest),
                jacksonTypeRef<BatchInputHubDbTableRowV3BatchUpdateRequest>(),
            )

        assertThat(roundtrippedBatchInputHubDbTableRowV3BatchUpdateRequest)
            .isEqualTo(batchInputHubDbTableRowV3BatchUpdateRequest)
    }
}
