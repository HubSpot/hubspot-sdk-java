// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkflowBatchGetParamsTest {

    @Test
    fun create() {
        WorkflowBatchGetParams.builder()
            .apiFlowBatchInput(
                ApiFlowBatchInput.builder()
                    .addInput(
                        ApiFlowBatchFetchFlowIdCoordinate.builder()
                            .flowId("flowId")
                            .type(ApiFlowBatchFetchFlowIdCoordinate.Type.FLOW_ID)
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            WorkflowBatchGetParams.builder()
                .apiFlowBatchInput(
                    ApiFlowBatchInput.builder()
                        .addInput(
                            ApiFlowBatchFetchFlowIdCoordinate.builder()
                                .flowId("flowId")
                                .type(ApiFlowBatchFetchFlowIdCoordinate.Type.FLOW_ID)
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ApiFlowBatchInput.builder()
                    .addInput(
                        ApiFlowBatchFetchFlowIdCoordinate.builder()
                            .flowId("flowId")
                            .type(ApiFlowBatchFetchFlowIdCoordinate.Type.FLOW_ID)
                            .build()
                    )
                    .build()
            )
    }
}
