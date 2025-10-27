// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
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
                .build()

        assertThat(callbackCompletionRequest.outputFields())
            .isEqualTo(
                CallbackCompletionRequest.OutputFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
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
                .build()

        val roundtrippedCallbackCompletionRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callbackCompletionRequest),
                jacksonTypeRef<CallbackCompletionRequest>(),
            )

        assertThat(roundtrippedCallbackCompletionRequest).isEqualTo(callbackCompletionRequest)
    }
}
