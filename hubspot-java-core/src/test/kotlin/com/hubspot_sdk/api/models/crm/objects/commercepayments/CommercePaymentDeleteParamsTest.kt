// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.commercepayments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommercePaymentDeleteParamsTest {

    @Test
    fun create() {
        CommercePaymentDeleteParams.builder().commercePaymentId("commercePaymentId").build()
    }

    @Test
    fun pathParams() {
        val params =
            CommercePaymentDeleteParams.builder().commercePaymentId("commercePaymentId").build()

        assertThat(params._pathParam(0)).isEqualTo("commercePaymentId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
