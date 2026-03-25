// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.hubspot_sdk.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionCompleteBatchParamsTest {

    @Test
    fun create() {
        ActionCompleteBatchParams.builder()
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
            ActionCompleteBatchParams.builder()
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
            ActionCompleteBatchParams.builder()
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
