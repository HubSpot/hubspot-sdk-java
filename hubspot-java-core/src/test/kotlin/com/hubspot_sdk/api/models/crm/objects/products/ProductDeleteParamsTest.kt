// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.products

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductDeleteParamsTest {

    @Test
    fun create() {
        ProductDeleteParams.builder().productId("productId").build()
    }

    @Test
    fun pathParams() {
        val params = ProductDeleteParams.builder().productId("productId").build()

        assertThat(params._pathParam(0)).isEqualTo("productId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
