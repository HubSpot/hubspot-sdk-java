// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.subscriptions

import com.hubspot_sdk.api.models.webhooks.BatchInputSubscriptionBatchUpdateRequest
import com.hubspot_sdk.api.models.webhooks.SubscriptionBatchUpdateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionUpdateBatchParamsTest {

    @Test
    fun create() {
        SubscriptionUpdateBatchParams.builder()
            .appId(0)
            .batchInputSubscriptionBatchUpdateRequest(
                BatchInputSubscriptionBatchUpdateRequest.builder()
                    .addInput(SubscriptionBatchUpdateRequest.builder().id(0).active(true).build())
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionUpdateBatchParams.builder()
                .appId(0)
                .batchInputSubscriptionBatchUpdateRequest(
                    BatchInputSubscriptionBatchUpdateRequest.builder()
                        .addInput(
                            SubscriptionBatchUpdateRequest.builder().id(0).active(true).build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionUpdateBatchParams.builder()
                .appId(0)
                .batchInputSubscriptionBatchUpdateRequest(
                    BatchInputSubscriptionBatchUpdateRequest.builder()
                        .addInput(
                            SubscriptionBatchUpdateRequest.builder().id(0).active(true).build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputSubscriptionBatchUpdateRequest.builder()
                    .addInput(SubscriptionBatchUpdateRequest.builder().id(0).active(true).build())
                    .build()
            )
    }
}
