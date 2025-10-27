// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
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
