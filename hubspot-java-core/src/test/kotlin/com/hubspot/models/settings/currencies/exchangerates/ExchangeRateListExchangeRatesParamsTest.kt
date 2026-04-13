// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.settings.currencies.exchangerates

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExchangeRateListExchangeRatesParamsTest {

    @Test
    fun create() {
        ExchangeRateListExchangeRatesParams.builder()
            .after("after")
            .fromCurrencyCode(ExchangeRateListExchangeRatesParams.FromCurrencyCode.AED)
            .limit(0)
            .toCurrencyCode(ExchangeRateListExchangeRatesParams.ToCurrencyCode.AED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ExchangeRateListExchangeRatesParams.builder()
                .after("after")
                .fromCurrencyCode(ExchangeRateListExchangeRatesParams.FromCurrencyCode.AED)
                .limit(0)
                .toCurrencyCode(ExchangeRateListExchangeRatesParams.ToCurrencyCode.AED)
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
        val params = ExchangeRateListExchangeRatesParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
