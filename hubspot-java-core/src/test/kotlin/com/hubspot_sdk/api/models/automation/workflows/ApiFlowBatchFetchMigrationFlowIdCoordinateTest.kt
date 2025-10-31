// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiFlowBatchFetchMigrationFlowIdCoordinateTest {

    @Test
    fun create() {
        val apiFlowBatchFetchMigrationFlowIdCoordinate =
            ApiFlowBatchFetchMigrationFlowIdCoordinate.builder()
                .flowMigrationStatuses("12345")
                .type(ApiFlowBatchFetchMigrationFlowIdCoordinate.Type.FLOW_ID)
                .build()

        assertThat(apiFlowBatchFetchMigrationFlowIdCoordinate.flowMigrationStatuses())
            .isEqualTo("12345")
        assertThat(apiFlowBatchFetchMigrationFlowIdCoordinate.type())
            .isEqualTo(ApiFlowBatchFetchMigrationFlowIdCoordinate.Type.FLOW_ID)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiFlowBatchFetchMigrationFlowIdCoordinate =
            ApiFlowBatchFetchMigrationFlowIdCoordinate.builder()
                .flowMigrationStatuses("12345")
                .type(ApiFlowBatchFetchMigrationFlowIdCoordinate.Type.FLOW_ID)
                .build()

        val roundtrippedApiFlowBatchFetchMigrationFlowIdCoordinate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiFlowBatchFetchMigrationFlowIdCoordinate),
                jacksonTypeRef<ApiFlowBatchFetchMigrationFlowIdCoordinate>(),
            )

        assertThat(roundtrippedApiFlowBatchFetchMigrationFlowIdCoordinate)
            .isEqualTo(apiFlowBatchFetchMigrationFlowIdCoordinate)
    }
}
