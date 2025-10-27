// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.currencies

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyUpdateVisibilityParamsTest {

    @Test
    fun create() {
        CurrencyUpdateVisibilityParams.builder()
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
            CurrencyUpdateVisibilityParams.builder()
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
