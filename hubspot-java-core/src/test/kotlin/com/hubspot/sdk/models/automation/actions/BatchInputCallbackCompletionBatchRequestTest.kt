// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputCallbackCompletionBatchRequestTest {

    @Test
    fun create() {
        val batchInputCallbackCompletionBatchRequest =
            BatchInputCallbackCompletionBatchRequest.builder()
                .addInput(
                    CallbackCompletionBatchRequest.builder()
                        .callbackId("callbackId")
                        .outputFields(
                            CallbackCompletionBatchRequest.OutputFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .typedOutputs(JsonValue.from(mapOf<String, Any>()))
                        .failureReasonType("failureReasonType")
                        .requestContext(
                            WorkflowsRequestContext.builder()
                                .source(WorkflowsRequestContext.Source.WORKFLOWS)
                                .workflowId(0L)
                                .actionExecutionIndexIdentifier(
                                    ActionExecutionIndexIdentifier.builder()
                                        .actionExecutionIndex(0)
                                        .enrollmentId(0L)
                                        .build()
                                )
                                .actionId(0L)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(batchInputCallbackCompletionBatchRequest.inputs())
            .containsExactly(
                CallbackCompletionBatchRequest.builder()
                    .callbackId("callbackId")
                    .outputFields(
                        CallbackCompletionBatchRequest.OutputFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .typedOutputs(JsonValue.from(mapOf<String, Any>()))
                    .failureReasonType("failureReasonType")
                    .requestContext(
                        WorkflowsRequestContext.builder()
                            .source(WorkflowsRequestContext.Source.WORKFLOWS)
                            .workflowId(0L)
                            .actionExecutionIndexIdentifier(
                                ActionExecutionIndexIdentifier.builder()
                                    .actionExecutionIndex(0)
                                    .enrollmentId(0L)
                                    .build()
                            )
                            .actionId(0L)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputCallbackCompletionBatchRequest =
            BatchInputCallbackCompletionBatchRequest.builder()
                .addInput(
                    CallbackCompletionBatchRequest.builder()
                        .callbackId("callbackId")
                        .outputFields(
                            CallbackCompletionBatchRequest.OutputFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .typedOutputs(JsonValue.from(mapOf<String, Any>()))
                        .failureReasonType("failureReasonType")
                        .requestContext(
                            WorkflowsRequestContext.builder()
                                .source(WorkflowsRequestContext.Source.WORKFLOWS)
                                .workflowId(0L)
                                .actionExecutionIndexIdentifier(
                                    ActionExecutionIndexIdentifier.builder()
                                        .actionExecutionIndex(0)
                                        .enrollmentId(0L)
                                        .build()
                                )
                                .actionId(0L)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedBatchInputCallbackCompletionBatchRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputCallbackCompletionBatchRequest),
                jacksonTypeRef<BatchInputCallbackCompletionBatchRequest>(),
            )

        assertThat(roundtrippedBatchInputCallbackCompletionBatchRequest)
            .isEqualTo(batchInputCallbackCompletionBatchRequest)
    }
}
