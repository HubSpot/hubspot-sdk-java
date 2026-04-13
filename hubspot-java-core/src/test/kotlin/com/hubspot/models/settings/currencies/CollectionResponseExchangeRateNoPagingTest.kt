// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.settings.currencies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseExchangeRateNoPagingTest {

    @Test
    fun create() {
        val collectionResponseExchangeRateNoPaging =
            CollectionResponseExchangeRateNoPaging.builder()
                .addResult(
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
                )
                .build()

        assertThat(collectionResponseExchangeRateNoPaging.results())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseExchangeRateNoPaging =
            CollectionResponseExchangeRateNoPaging.builder()
                .addResult(
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
                )
                .build()

        val roundtrippedCollectionResponseExchangeRateNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseExchangeRateNoPaging),
                jacksonTypeRef<CollectionResponseExchangeRateNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponseExchangeRateNoPaging)
            .isEqualTo(collectionResponseExchangeRateNoPaging)
    }
}
