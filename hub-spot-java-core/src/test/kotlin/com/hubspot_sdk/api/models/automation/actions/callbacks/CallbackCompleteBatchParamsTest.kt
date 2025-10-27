// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions.callbacks

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.automation.actions.BatchInputCallbackCompletionBatchRequest
import com.hubspot_sdk.api.models.automation.actions.CallbackCompletionBatchRequest
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
                            .build()
                    )
                    .build()
            )
    }
}
