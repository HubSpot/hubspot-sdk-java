// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.currencies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponseExchangeRateTest {

    @Test
    fun create() {
        val batchResponseExchangeRate =
            BatchResponseExchangeRate.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseExchangeRate.Status.CANCELED)
                .links(
                    BatchResponseExchangeRate.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponseExchangeRate.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseExchangeRate.results())
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
        assertThat(batchResponseExchangeRate.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseExchangeRate.status())
            .isEqualTo(BatchResponseExchangeRate.Status.CANCELED)
        assertThat(batchResponseExchangeRate.links())
            .contains(
                BatchResponseExchangeRate.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseExchangeRate.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseExchangeRate =
            BatchResponseExchangeRate.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseExchangeRate.Status.CANCELED)
                .links(
                    BatchResponseExchangeRate.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponseExchangeRate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponseExchangeRate),
                jacksonTypeRef<BatchResponseExchangeRate>(),
            )

        assertThat(roundtrippedBatchResponseExchangeRate).isEqualTo(batchResponseExchangeRate)
    }
}
