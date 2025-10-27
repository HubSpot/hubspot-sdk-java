// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiFlowBatchFetchFlowIdCoordinateTest {

    @Test
    fun create() {
        val apiFlowBatchFetchFlowIdCoordinate =
            ApiFlowBatchFetchFlowIdCoordinate.builder()
                .flowId("flowId")
                .type(ApiFlowBatchFetchFlowIdCoordinate.Type.FLOW_ID)
                .build()

        assertThat(apiFlowBatchFetchFlowIdCoordinate.flowId()).isEqualTo("flowId")
        assertThat(apiFlowBatchFetchFlowIdCoordinate.type())
            .isEqualTo(ApiFlowBatchFetchFlowIdCoordinate.Type.FLOW_ID)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiFlowBatchFetchFlowIdCoordinate =
            ApiFlowBatchFetchFlowIdCoordinate.builder()
                .flowId("flowId")
                .type(ApiFlowBatchFetchFlowIdCoordinate.Type.FLOW_ID)
                .build()

        val roundtrippedApiFlowBatchFetchFlowIdCoordinate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiFlowBatchFetchFlowIdCoordinate),
                jacksonTypeRef<ApiFlowBatchFetchFlowIdCoordinate>(),
            )

        assertThat(roundtrippedApiFlowBatchFetchFlowIdCoordinate)
            .isEqualTo(apiFlowBatchFetchFlowIdCoordinate)
    }
}
