// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiFlowBatchInputTest {

    @Test
    fun create() {
        val apiFlowBatchInput =
            ApiFlowBatchInput.builder()
                .addInput(
                    ApiFlowBatchFetchFlowIdCoordinate.builder()
                        .flowId("flowId")
                        .type(ApiFlowBatchFetchFlowIdCoordinate.Type.FLOW_ID)
                        .build()
                )
                .build()

        assertThat(apiFlowBatchInput.inputs())
            .containsExactly(
                ApiFlowBatchFetchFlowIdCoordinate.builder()
                    .flowId("flowId")
                    .type(ApiFlowBatchFetchFlowIdCoordinate.Type.FLOW_ID)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiFlowBatchInput =
            ApiFlowBatchInput.builder()
                .addInput(
                    ApiFlowBatchFetchFlowIdCoordinate.builder()
                        .flowId("flowId")
                        .type(ApiFlowBatchFetchFlowIdCoordinate.Type.FLOW_ID)
                        .build()
                )
                .build()

        val roundtrippedApiFlowBatchInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiFlowBatchInput),
                jacksonTypeRef<ApiFlowBatchInput>(),
            )

        assertThat(roundtrippedApiFlowBatchInput).isEqualTo(apiFlowBatchInput)
    }
}
