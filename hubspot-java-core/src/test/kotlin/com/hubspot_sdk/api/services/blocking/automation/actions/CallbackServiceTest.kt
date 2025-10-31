// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation.actions

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.automation.actions.BatchInputCallbackCompletionBatchRequest
import com.hubspot_sdk.api.models.automation.actions.CallbackCompletionBatchRequest
import com.hubspot_sdk.api.models.automation.actions.CallbackCompletionRequest
import com.hubspot_sdk.api.models.automation.actions.callbacks.CallbackCompleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CallbackServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun complete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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
                        .build()
                )
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun completeBatch() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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
                        .build()
                )
                .build()
        )
    }
}
