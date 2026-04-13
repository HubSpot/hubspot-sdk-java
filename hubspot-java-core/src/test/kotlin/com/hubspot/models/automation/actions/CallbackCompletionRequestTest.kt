// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallbackCompletionRequestTest {

    @Test
    fun create() {
        val callbackCompletionRequest =
            CallbackCompletionRequest.builder()
                .outputFields(
                    CallbackCompletionRequest.OutputFields.builder()
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

        assertThat(callbackCompletionRequest.outputFields())
            .isEqualTo(
                CallbackCompletionRequest.OutputFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(callbackCompletionRequest._typedOutputs())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(callbackCompletionRequest.failureReasonType()).contains("failureReasonType")
        assertThat(callbackCompletionRequest.requestContext())
            .contains(
                CallbackCompletionRequest.RequestContext.ofWorkflows(
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
        val callbackCompletionRequest =
            CallbackCompletionRequest.builder()
                .outputFields(
                    CallbackCompletionRequest.OutputFields.builder()
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

        val roundtrippedCallbackCompletionRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callbackCompletionRequest),
                jacksonTypeRef<CallbackCompletionRequest>(),
            )

        assertThat(roundtrippedCallbackCompletionRequest).isEqualTo(callbackCompletionRequest)
    }
}
