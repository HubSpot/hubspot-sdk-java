// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookCreateBatchEventSubscriptionsParamsTest {

    @Test
    fun create() {
        WebhookCreateBatchEventSubscriptionsParams.builder()
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
            WebhookCreateBatchEventSubscriptionsParams.builder()
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
            WebhookCreateBatchEventSubscriptionsParams.builder()
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
