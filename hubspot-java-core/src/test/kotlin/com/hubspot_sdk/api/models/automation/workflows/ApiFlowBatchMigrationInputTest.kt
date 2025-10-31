// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiFlowBatchMigrationInputTest {

    @Test
    fun create() {
        val apiFlowBatchMigrationInput =
            ApiFlowBatchMigrationInput.builder()
                .addInput(
                    ApiFlowBatchFetchMigrationFlowIdCoordinate.builder()
                        .flowMigrationStatuses("flowMigrationStatuses")
                        .type(ApiFlowBatchFetchMigrationFlowIdCoordinate.Type.FLOW_ID)
                        .build()
                )
                .build()

        assertThat(apiFlowBatchMigrationInput.inputs())
            .containsExactly(
                ApiFlowBatchMigrationInput.Input.ofApiFlowBatchFetchMigrationFlowIdCoordinate(
                    ApiFlowBatchFetchMigrationFlowIdCoordinate.builder()
                        .flowMigrationStatuses("flowMigrationStatuses")
                        .type(ApiFlowBatchFetchMigrationFlowIdCoordinate.Type.FLOW_ID)
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiFlowBatchMigrationInput =
            ApiFlowBatchMigrationInput.builder()
                .addInput(
                    ApiFlowBatchFetchMigrationFlowIdCoordinate.builder()
                        .flowMigrationStatuses("flowMigrationStatuses")
                        .type(ApiFlowBatchFetchMigrationFlowIdCoordinate.Type.FLOW_ID)
                        .build()
                )
                .build()

        val roundtrippedApiFlowBatchMigrationInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiFlowBatchMigrationInput),
                jacksonTypeRef<ApiFlowBatchMigrationInput>(),
            )

        assertThat(roundtrippedApiFlowBatchMigrationInput).isEqualTo(apiFlowBatchMigrationInput)
    }
}
