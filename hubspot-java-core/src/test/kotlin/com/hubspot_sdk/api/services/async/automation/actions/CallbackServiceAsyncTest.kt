// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation.actions

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.automation.actions.ActionExecutionIndexIdentifier
import com.hubspot_sdk.api.models.automation.actions.BatchInputCallbackCompletionBatchRequest
import com.hubspot_sdk.api.models.automation.actions.CallbackCompletionBatchRequest
import com.hubspot_sdk.api.models.automation.actions.CallbackCompletionRequest
import com.hubspot_sdk.api.models.automation.actions.WorkflowsRequestContext
import com.hubspot_sdk.api.models.automation.actions.callbacks.CallbackCompleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallbackServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun complete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val callbackServiceAsync = client.automation().actions().callbacks()

        val future =
            callbackServiceAsync.complete(
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

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun completeBatch() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val callbackServiceAsync = client.automation().actions().callbacks()

        val future =
            callbackServiceAsync.completeBatch(
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

        val response = future.get()
    }
}
