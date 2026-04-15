// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.settings.currencies.exchangerates

import com.hubspot.sdk.models.settings.currencies.CurrencyPairUpdate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExchangeRateUpdateVisibilityParamsTest {

    @Test
    fun create() {
        ExchangeRateUpdateVisibilityParams.builder()
            .currencyPairUpdate(
                CurrencyPairUpdate.builder()
                    .fromCurrencyCode(CurrencyPairUpdate.FromCurrencyCode.AED)
                    .toCurrencyCode(CurrencyPairUpdate.ToCurrencyCode.AED)
                    .visibleInUi(true)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ExchangeRateUpdateVisibilityParams.builder()
                .currencyPairUpdate(
                    CurrencyPairUpdate.builder()
                        .fromCurrencyCode(CurrencyPairUpdate.FromCurrencyCode.AED)
                        .toCurrencyCode(CurrencyPairUpdate.ToCurrencyCode.AED)
                        .visibleInUi(true)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CurrencyPairUpdate.builder()
                    .fromCurrencyCode(CurrencyPairUpdate.FromCurrencyCode.AED)
                    .toCurrencyCode(CurrencyPairUpdate.ToCurrencyCode.AED)
                    .visibleInUi(true)
                    .build()
            )
    }
}
