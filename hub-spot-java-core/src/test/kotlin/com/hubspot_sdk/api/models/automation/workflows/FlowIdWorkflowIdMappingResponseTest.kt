// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FlowIdWorkflowIdMappingResponseTest {

    @Test
    fun create() {
        val flowIdWorkflowIdMappingResponse =
            FlowIdWorkflowIdMappingResponse.builder().flowId(0).workflowId(0).build()

        assertThat(flowIdWorkflowIdMappingResponse.flowId()).isEqualTo(0)
        assertThat(flowIdWorkflowIdMappingResponse.workflowId()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val flowIdWorkflowIdMappingResponse =
            FlowIdWorkflowIdMappingResponse.builder().flowId(0).workflowId(0).build()

        val roundtrippedFlowIdWorkflowIdMappingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(flowIdWorkflowIdMappingResponse),
                jacksonTypeRef<FlowIdWorkflowIdMappingResponse>(),
            )

        assertThat(roundtrippedFlowIdWorkflowIdMappingResponse)
            .isEqualTo(flowIdWorkflowIdMappingResponse)
    }
}
