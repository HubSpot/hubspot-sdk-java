// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.subscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionDeleteParamsTest {

    @Test
    fun create() {
        SubscriptionDeleteParams.builder().subscriptionId("subscriptionId").build()
    }

    @Test
    fun pathParams() {
        val params = SubscriptionDeleteParams.builder().subscriptionId("subscriptionId").build()

        assertThat(params._pathParam(0)).isEqualTo("subscriptionId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
