// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.orders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderDeleteParamsTest {

    @Test
    fun create() {
        OrderDeleteParams.builder().orderId("orderId").build()
    }

    @Test
    fun pathParams() {
        val params = OrderDeleteParams.builder().orderId("orderId").build()

        assertThat(params._pathParam(0)).isEqualTo("orderId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
