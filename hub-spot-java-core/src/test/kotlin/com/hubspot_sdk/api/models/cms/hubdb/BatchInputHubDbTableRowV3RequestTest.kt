// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputHubDbTableRowV3RequestTest {

    @Test
    fun create() {
        val batchInputHubDbTableRowV3Request =
            BatchInputHubDbTableRowV3Request.builder()
                .addInput(
                    HubDbTableRowV3Request.builder()
                        .values(
                            HubDbTableRowV3Request.Values.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .childTableId(0L)
                        .displayIndex(0)
                        .name("name")
                        .path("path")
                        .build()
                )
                .build()

        assertThat(batchInputHubDbTableRowV3Request.inputs())
            .containsExactly(
                HubDbTableRowV3Request.builder()
                    .values(
                        HubDbTableRowV3Request.Values.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .childTableId(0L)
                    .displayIndex(0)
                    .name("name")
                    .path("path")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputHubDbTableRowV3Request =
            BatchInputHubDbTableRowV3Request.builder()
                .addInput(
                    HubDbTableRowV3Request.builder()
                        .values(
                            HubDbTableRowV3Request.Values.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .childTableId(0L)
                        .displayIndex(0)
                        .name("name")
                        .path("path")
                        .build()
                )
                .build()

        val roundtrippedBatchInputHubDbTableRowV3Request =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputHubDbTableRowV3Request),
                jacksonTypeRef<BatchInputHubDbTableRowV3Request>(),
            )

        assertThat(roundtrippedBatchInputHubDbTableRowV3Request)
            .isEqualTo(batchInputHubDbTableRowV3Request)
    }
}
