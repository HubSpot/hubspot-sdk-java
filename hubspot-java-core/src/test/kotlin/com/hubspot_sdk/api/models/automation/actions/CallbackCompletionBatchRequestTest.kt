// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
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
                .build()

        assertThat(callbackCompletionBatchRequest.callbackId()).isEqualTo("callbackId")
        assertThat(callbackCompletionBatchRequest.outputFields())
            .isEqualTo(
                CallbackCompletionBatchRequest.OutputFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
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
