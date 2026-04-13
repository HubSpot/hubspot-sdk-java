// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.webhooks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookDeleteSubscriptionParamsTest {

    @Test
    fun create() {
        WebhookDeleteSubscriptionParams.builder().appId(0).subscriptionId(0).build()
    }

    @Test
    fun pathParams() {
        val params = WebhookDeleteSubscriptionParams.builder().appId(0).subscriptionId(0).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
