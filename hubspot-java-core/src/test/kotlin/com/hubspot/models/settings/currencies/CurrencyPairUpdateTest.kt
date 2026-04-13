// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.settings.currencies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyPairUpdateTest {

    @Test
    fun create() {
        val currencyPairUpdate =
            CurrencyPairUpdate.builder()
                .fromCurrencyCode(CurrencyPairUpdate.FromCurrencyCode.AED)
                .toCurrencyCode(CurrencyPairUpdate.ToCurrencyCode.AED)
                .visibleInUi(true)
                .build()

        assertThat(currencyPairUpdate.fromCurrencyCode())
            .isEqualTo(CurrencyPairUpdate.FromCurrencyCode.AED)
        assertThat(currencyPairUpdate.toCurrencyCode())
            .isEqualTo(CurrencyPairUpdate.ToCurrencyCode.AED)
        assertThat(currencyPairUpdate.visibleInUi()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val currencyPairUpdate =
            CurrencyPairUpdate.builder()
                .fromCurrencyCode(CurrencyPairUpdate.FromCurrencyCode.AED)
                .toCurrencyCode(CurrencyPairUpdate.ToCurrencyCode.AED)
                .visibleInUi(true)
                .build()

        val roundtrippedCurrencyPairUpdate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currencyPairUpdate),
                jacksonTypeRef<CurrencyPairUpdate>(),
            )

        assertThat(roundtrippedCurrencyPairUpdate).isEqualTo(currencyPairUpdate)
    }
}
