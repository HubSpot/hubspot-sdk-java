// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.settings.currencies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExchangeRateUpdateRequestTest {

    @Test
    fun create() {
        val exchangeRateUpdateRequest =
            ExchangeRateUpdateRequest.builder()
                .id("id")
                .conversionRate(0.0)
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(exchangeRateUpdateRequest.id()).isEqualTo("id")
        assertThat(exchangeRateUpdateRequest.conversionRate()).isEqualTo(0.0)
        assertThat(exchangeRateUpdateRequest.effectiveAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val exchangeRateUpdateRequest =
            ExchangeRateUpdateRequest.builder()
                .id("id")
                .conversionRate(0.0)
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedExchangeRateUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exchangeRateUpdateRequest),
                jacksonTypeRef<ExchangeRateUpdateRequest>(),
            )

        assertThat(roundtrippedExchangeRateUpdateRequest).isEqualTo(exchangeRateUpdateRequest)
    }
}
