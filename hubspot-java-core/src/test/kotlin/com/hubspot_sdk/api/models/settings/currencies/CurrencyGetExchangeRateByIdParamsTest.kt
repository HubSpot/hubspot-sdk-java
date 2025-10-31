// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.currencies

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyGetExchangeRateByIdParamsTest {

    @Test
    fun create() {
        CurrencyGetExchangeRateByIdParams.builder().exchangeRateId("exchangeRateId").build()
    }

    @Test
    fun pathParams() {
        val params =
            CurrencyGetExchangeRateByIdParams.builder().exchangeRateId("exchangeRateId").build()

        assertThat(params._pathParam(0)).isEqualTo("exchangeRateId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
