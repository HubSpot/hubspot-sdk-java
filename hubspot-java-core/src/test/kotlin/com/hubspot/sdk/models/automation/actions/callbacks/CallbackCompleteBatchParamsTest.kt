// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions.callbacks

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.automation.actions.ActionExecutionIndexIdentifier
import com.hubspot.sdk.models.automation.actions.BatchInputCallbackCompletionBatchRequest
import com.hubspot.sdk.models.automation.actions.CallbackCompletionBatchRequest
import com.hubspot.sdk.models.automation.actions.WorkflowsRequestContext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallbackCompleteBatchParamsTest {

    @Test
    fun create() {
        CallbackCompleteBatchParams.builder()
            .batchInputCallbackCompletionBatchRequest(
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
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CallbackCompleteBatchParams.builder()
                .batchInputCallbackCompletionBatchRequest(
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
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CallbackCompleteBatchParams.builder()
                .batchInputCallbackCompletionBatchRequest(
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
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                            .build()
                    )
                    .build()
            )
    }
}
