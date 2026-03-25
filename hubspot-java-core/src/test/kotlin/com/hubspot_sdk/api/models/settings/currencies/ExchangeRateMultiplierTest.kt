// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.currencies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExchangeRateMultiplierTest {

    @Test
    fun create() {
        val exchangeRateMultiplier =
            ExchangeRateMultiplier.builder()
                .conversionRate(0.0)
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(exchangeRateMultiplier.conversionRate()).isEqualTo(0.0)
        assertThat(exchangeRateMultiplier.effectiveAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val exchangeRateMultiplier =
            ExchangeRateMultiplier.builder()
                .conversionRate(0.0)
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedExchangeRateMultiplier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exchangeRateMultiplier),
                jacksonTypeRef<ExchangeRateMultiplier>(),
            )

        assertThat(roundtrippedExchangeRateMultiplier).isEqualTo(exchangeRateMultiplier)
    }
}
