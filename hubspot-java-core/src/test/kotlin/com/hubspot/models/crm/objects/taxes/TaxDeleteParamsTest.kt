// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.taxes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TaxDeleteParamsTest {

    @Test
    fun create() {
        TaxDeleteParams.builder().taxId("taxId").build()
    }

    @Test
    fun pathParams() {
        val params = TaxDeleteParams.builder().taxId("taxId").build()

        assertThat(params._pathParam(0)).isEqualTo("taxId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
