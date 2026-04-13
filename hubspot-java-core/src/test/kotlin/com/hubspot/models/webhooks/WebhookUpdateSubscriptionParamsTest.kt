// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.webhooks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookUpdateSubscriptionParamsTest {

    @Test
    fun create() {
        WebhookUpdateSubscriptionParams.builder()
            .appId(0)
            .subscriptionId(0)
            .subscriptionPatchRequest(SubscriptionPatchRequest.builder().active(true).build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            WebhookUpdateSubscriptionParams.builder()
                .appId(0)
                .subscriptionId(0)
                .subscriptionPatchRequest(SubscriptionPatchRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            WebhookUpdateSubscriptionParams.builder()
                .appId(0)
                .subscriptionId(0)
                .subscriptionPatchRequest(SubscriptionPatchRequest.builder().active(true).build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(SubscriptionPatchRequest.builder().active(true).build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WebhookUpdateSubscriptionParams.builder()
                .appId(0)
                .subscriptionId(0)
                .subscriptionPatchRequest(SubscriptionPatchRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(SubscriptionPatchRequest.builder().build())
    }
}
