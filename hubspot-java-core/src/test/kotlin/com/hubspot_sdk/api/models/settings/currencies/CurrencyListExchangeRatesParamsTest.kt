// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.currencies

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyListExchangeRatesParamsTest {

    @Test
    fun create() {
        CurrencyListExchangeRatesParams.builder()
            .after("after")
            .fromCurrencyCode(CurrencyListExchangeRatesParams.FromCurrencyCode.AED)
            .limit(0)
            .toCurrencyCode(CurrencyListExchangeRatesParams.ToCurrencyCode.AED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CurrencyListExchangeRatesParams.builder()
                .after("after")
                .fromCurrencyCode(CurrencyListExchangeRatesParams.FromCurrencyCode.AED)
                .limit(0)
                .toCurrencyCode(CurrencyListExchangeRatesParams.ToCurrencyCode.AED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("fromCurrencyCode", "AED")
                    .put("limit", "0")
                    .put("toCurrencyCode", "AED")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CurrencyListExchangeRatesParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
