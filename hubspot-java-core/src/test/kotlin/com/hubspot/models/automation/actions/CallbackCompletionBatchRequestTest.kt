// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallbackCompletionBatchRequestTest {

    @Test
    fun create() {
        val callbackCompletionBatchRequest =
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
                        .workflowId(0)
                        .actionExecutionIndexIdentifier(
                            ActionExecutionIndexIdentifier.builder()
                                .actionExecutionIndex(0)
                                .enrollmentId(0)
                                .build()
                        )
                        .actionId(0L)
                        .build()
                )
                .build()

        assertThat(callbackCompletionBatchRequest.callbackId()).isEqualTo("callbackId")
        assertThat(callbackCompletionBatchRequest.outputFields())
            .isEqualTo(
                CallbackCompletionBatchRequest.OutputFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(callbackCompletionBatchRequest._typedOutputs())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(callbackCompletionBatchRequest.failureReasonType()).contains("failureReasonType")
        assertThat(callbackCompletionBatchRequest.requestContext())
            .contains(
                CallbackCompletionBatchRequest.RequestContext.ofWorkflows(
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
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callbackCompletionBatchRequest =
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
                        .workflowId(0)
                        .actionExecutionIndexIdentifier(
                            ActionExecutionIndexIdentifier.builder()
                                .actionExecutionIndex(0)
                                .enrollmentId(0)
                                .build()
                        )
                        .actionId(0L)
                        .build()
                )
                .build()

        val roundtrippedCallbackCompletionBatchRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callbackCompletionBatchRequest),
                jacksonTypeRef<CallbackCompletionBatchRequest>(),
            )

        assertThat(roundtrippedCallbackCompletionBatchRequest)
            .isEqualTo(callbackCompletionBatchRequest)
    }
}
