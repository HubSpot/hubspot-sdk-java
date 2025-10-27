// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.discounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DiscountDeleteParamsTest {

    @Test
    fun create() {
        DiscountDeleteParams.builder().discountId("discountId").build()
    }

    @Test
    fun pathParams() {
        val params = DiscountDeleteParams.builder().discountId("discountId").build()

        assertThat(params._pathParam(0)).isEqualTo("discountId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
