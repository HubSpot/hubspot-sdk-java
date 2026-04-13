// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.settings.currencies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import com.hubspot.models.ForwardPaging
import com.hubspot.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseExchangeRateForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseExchangeRateForwardPaging =
            CollectionResponseExchangeRateForwardPaging.builder()
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
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseExchangeRateForwardPaging.results())
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
        assertThat(collectionResponseExchangeRateForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseExchangeRateForwardPaging =
            CollectionResponseExchangeRateForwardPaging.builder()
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
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseExchangeRateForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseExchangeRateForwardPaging),
                jacksonTypeRef<CollectionResponseExchangeRateForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseExchangeRateForwardPaging)
            .isEqualTo(collectionResponseExchangeRateForwardPaging)
    }
}
