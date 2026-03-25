// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.currencies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExchangeRateCreateRequestTest {

    @Test
    fun create() {
        val exchangeRateCreateRequest =
            ExchangeRateCreateRequest.builder()
                .conversionRate(0.0)
                .fromCurrencyCode(ExchangeRateCreateRequest.FromCurrencyCode.AED)
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(exchangeRateCreateRequest.conversionRate()).isEqualTo(0.0)
        assertThat(exchangeRateCreateRequest.fromCurrencyCode())
            .isEqualTo(ExchangeRateCreateRequest.FromCurrencyCode.AED)
        assertThat(exchangeRateCreateRequest.effectiveAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val exchangeRateCreateRequest =
            ExchangeRateCreateRequest.builder()
                .conversionRate(0.0)
                .fromCurrencyCode(ExchangeRateCreateRequest.FromCurrencyCode.AED)
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedExchangeRateCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exchangeRateCreateRequest),
                jacksonTypeRef<ExchangeRateCreateRequest>(),
            )

        assertThat(roundtrippedExchangeRateCreateRequest).isEqualTo(exchangeRateCreateRequest)
    }
}
