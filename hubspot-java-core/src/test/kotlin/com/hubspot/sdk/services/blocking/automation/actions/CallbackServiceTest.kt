// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.automation.actions

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.automation.actions.ActionExecutionIndexIdentifier
import com.hubspot.sdk.models.automation.actions.BatchInputCallbackCompletionBatchRequest
import com.hubspot.sdk.models.automation.actions.CallbackCompletionBatchRequest
import com.hubspot.sdk.models.automation.actions.CallbackCompletionRequest
import com.hubspot.sdk.models.automation.actions.WorkflowsRequestContext
import com.hubspot.sdk.models.automation.actions.callbacks.CallbackCompleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallbackServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun complete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val callbackService = client.automation().actions().callbacks()

        callbackService.complete(
            CallbackCompleteParams.builder()
                .callbackId("callbackId")
                .callbackCompletionRequest(
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
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun completeBatch() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val callbackService = client.automation().actions().callbacks()

        callbackService.completeBatch(
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
        )
    }
}
