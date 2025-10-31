// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation.actions

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.automation.actions.BatchInputCallbackCompletionBatchRequest
import com.hubspot_sdk.api.models.automation.actions.CallbackCompletionBatchRequest
import com.hubspot_sdk.api.models.automation.actions.CallbackCompletionRequest
import com.hubspot_sdk.api.models.automation.actions.callbacks.CallbackCompleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CallbackServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun complete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
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
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun completeBatch() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
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
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }
}
