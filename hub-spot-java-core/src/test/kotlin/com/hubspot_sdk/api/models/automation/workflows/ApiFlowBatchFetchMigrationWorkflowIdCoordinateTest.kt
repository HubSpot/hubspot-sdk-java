// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiFlowBatchFetchMigrationWorkflowIdCoordinateTest {

    @Test
    fun create() {
        val apiFlowBatchFetchMigrationWorkflowIdCoordinate =
            ApiFlowBatchFetchMigrationWorkflowIdCoordinate.builder()
                .flowMigrationStatusForClassicWorkflows("12345")
                .type(ApiFlowBatchFetchMigrationWorkflowIdCoordinate.Type.WORKFLOW_ID)
                .build()

        assertThat(
                apiFlowBatchFetchMigrationWorkflowIdCoordinate
                    .flowMigrationStatusForClassicWorkflows()
            )
            .isEqualTo("12345")
        assertThat(apiFlowBatchFetchMigrationWorkflowIdCoordinate.type())
            .isEqualTo(ApiFlowBatchFetchMigrationWorkflowIdCoordinate.Type.WORKFLOW_ID)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiFlowBatchFetchMigrationWorkflowIdCoordinate =
            ApiFlowBatchFetchMigrationWorkflowIdCoordinate.builder()
                .flowMigrationStatusForClassicWorkflows("12345")
                .type(ApiFlowBatchFetchMigrationWorkflowIdCoordinate.Type.WORKFLOW_ID)
                .build()

        val roundtrippedApiFlowBatchFetchMigrationWorkflowIdCoordinate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiFlowBatchFetchMigrationWorkflowIdCoordinate),
                jacksonTypeRef<ApiFlowBatchFetchMigrationWorkflowIdCoordinate>(),
            )

        assertThat(roundtrippedApiFlowBatchFetchMigrationWorkflowIdCoordinate)
            .isEqualTo(apiFlowBatchFetchMigrationWorkflowIdCoordinate)
    }
}
