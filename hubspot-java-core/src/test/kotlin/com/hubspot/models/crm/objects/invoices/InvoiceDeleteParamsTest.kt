// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.invoices

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceDeleteParamsTest {

    @Test
    fun create() {
        InvoiceDeleteParams.builder().invoiceId("invoiceId").build()
    }

    @Test
    fun pathParams() {
        val params = InvoiceDeleteParams.builder().invoiceId("invoiceId").build()

        assertThat(params._pathParam(0)).isEqualTo("invoiceId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
