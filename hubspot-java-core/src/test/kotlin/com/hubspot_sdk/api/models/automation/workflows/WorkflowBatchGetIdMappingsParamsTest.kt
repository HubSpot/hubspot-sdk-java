// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkflowBatchGetIdMappingsParamsTest {

    @Test
    fun create() {
        WorkflowBatchGetIdMappingsParams.builder()
            .apiFlowBatchMigrationInput(
                ApiFlowBatchMigrationInput.builder()
                    .addInput(
                        ApiFlowBatchFetchMigrationFlowIdCoordinate.builder()
                            .flowMigrationStatuses("flowMigrationStatuses")
                            .type(ApiFlowBatchFetchMigrationFlowIdCoordinate.Type.FLOW_ID)
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            WorkflowBatchGetIdMappingsParams.builder()
                .apiFlowBatchMigrationInput(
                    ApiFlowBatchMigrationInput.builder()
                        .addInput(
                            ApiFlowBatchFetchMigrationFlowIdCoordinate.builder()
                                .flowMigrationStatuses("flowMigrationStatuses")
                                .type(ApiFlowBatchFetchMigrationFlowIdCoordinate.Type.FLOW_ID)
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ApiFlowBatchMigrationInput.builder()
                    .addInput(
                        ApiFlowBatchFetchMigrationFlowIdCoordinate.builder()
                            .flowMigrationStatuses("flowMigrationStatuses")
                            .type(ApiFlowBatchFetchMigrationFlowIdCoordinate.Type.FLOW_ID)
                            .build()
                    )
                    .build()
            )
    }
}
