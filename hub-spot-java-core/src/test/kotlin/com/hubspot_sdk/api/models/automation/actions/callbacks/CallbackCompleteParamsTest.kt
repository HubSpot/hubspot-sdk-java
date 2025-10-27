// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions.callbacks

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.automation.actions.CallbackCompletionRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallbackCompleteParamsTest {

    @Test
    fun create() {
        CallbackCompleteParams.builder()
            .callbackId("callbackId")
            .callbackCompletionRequest(
                CallbackCompletionRequest.builder()
                    .outputFields(
                        CallbackCompletionRequest.OutputFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CallbackCompleteParams.builder()
                .callbackId("callbackId")
                .callbackCompletionRequest(
                    CallbackCompletionRequest.builder()
                        .outputFields(
                            CallbackCompletionRequest.OutputFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("callbackId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CallbackCompleteParams.builder()
                .callbackId("callbackId")
                .callbackCompletionRequest(
                    CallbackCompletionRequest.builder()
                        .outputFields(
                            CallbackCompletionRequest.OutputFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CallbackCompletionRequest.builder()
                    .outputFields(
                        CallbackCompletionRequest.OutputFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }
}
