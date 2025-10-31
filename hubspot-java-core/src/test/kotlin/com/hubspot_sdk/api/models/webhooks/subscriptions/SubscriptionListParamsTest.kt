// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.subscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionListParamsTest {

    @Test
    fun create() {
        SubscriptionListParams.builder().appId(0).build()
    }

    @Test
    fun pathParams() {
        val params = SubscriptionListParams.builder().appId(0).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
