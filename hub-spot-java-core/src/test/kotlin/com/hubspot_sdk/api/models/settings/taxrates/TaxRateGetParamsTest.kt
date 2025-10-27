// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.taxrates

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TaxRateGetParamsTest {

    @Test
    fun create() {
        TaxRateGetParams.builder().taxRateGroupId("taxRateGroupId").build()
    }

    @Test
    fun pathParams() {
        val params = TaxRateGetParams.builder().taxRateGroupId("taxRateGroupId").build()

        assertThat(params._pathParam(0)).isEqualTo("taxRateGroupId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
