// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.currencies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExchangeRateTest {

    @Test
    fun create() {
        val exchangeRate =
            ExchangeRate.builder()
                .id("id")
                .conversionRate(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fromCurrencyCode(ExchangeRate.FromCurrencyCode.AED)
                .toCurrencyCode(ExchangeRate.ToCurrencyCode.AED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .visibleInUi(true)
                .build()

        assertThat(exchangeRate.id()).isEqualTo("id")
        assertThat(exchangeRate.conversionRate()).isEqualTo(0.0)
        assertThat(exchangeRate.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(exchangeRate.effectiveAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(exchangeRate.fromCurrencyCode()).isEqualTo(ExchangeRate.FromCurrencyCode.AED)
        assertThat(exchangeRate.toCurrencyCode()).isEqualTo(ExchangeRate.ToCurrencyCode.AED)
        assertThat(exchangeRate.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(exchangeRate.visibleInUi()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val exchangeRate =
            ExchangeRate.builder()
                .id("id")
                .conversionRate(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fromCurrencyCode(ExchangeRate.FromCurrencyCode.AED)
                .toCurrencyCode(ExchangeRate.ToCurrencyCode.AED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .visibleInUi(true)
                .build()

        val roundtrippedExchangeRate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exchangeRate),
                jacksonTypeRef<ExchangeRate>(),
            )

        assertThat(roundtrippedExchangeRate).isEqualTo(exchangeRate)
    }
}
