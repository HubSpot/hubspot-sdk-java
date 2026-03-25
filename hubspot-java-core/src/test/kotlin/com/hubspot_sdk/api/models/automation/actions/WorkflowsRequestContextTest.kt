// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkflowsRequestContextTest {

    @Test
    fun create() {
        val workflowsRequestContext =
            WorkflowsRequestContext.builder()
                .source(WorkflowsRequestContext.Source.WORKFLOWS)
                .workflowId(0)
                .actionExecutionIndexIdentifier(
                    ActionExecutionIndexIdentifier.builder()
                        .actionExecutionIndex(0)
                        .enrollmentId(0)
                        .build()
                )
                .actionId(0L)
                .build()

        assertThat(workflowsRequestContext.source())
            .isEqualTo(WorkflowsRequestContext.Source.WORKFLOWS)
        assertThat(workflowsRequestContext.workflowId()).isEqualTo(0)
        assertThat(workflowsRequestContext.actionExecutionIndexIdentifier())
            .contains(
                ActionExecutionIndexIdentifier.builder()
                    .actionExecutionIndex(0)
                    .enrollmentId(0)
                    .build()
            )
        assertThat(workflowsRequestContext.actionId()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val workflowsRequestContext =
            WorkflowsRequestContext.builder()
                .source(WorkflowsRequestContext.Source.WORKFLOWS)
                .workflowId(0)
                .actionExecutionIndexIdentifier(
                    ActionExecutionIndexIdentifier.builder()
                        .actionExecutionIndex(0)
                        .enrollmentId(0)
                        .build()
                )
                .actionId(0L)
                .build()

        val roundtrippedWorkflowsRequestContext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(workflowsRequestContext),
                jacksonTypeRef<WorkflowsRequestContext>(),
            )

        assertThat(roundtrippedWorkflowsRequestContext).isEqualTo(workflowsRequestContext)
    }
}
