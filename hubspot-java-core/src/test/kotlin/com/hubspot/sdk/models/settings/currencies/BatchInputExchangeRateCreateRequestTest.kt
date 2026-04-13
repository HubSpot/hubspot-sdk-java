// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.settings.currencies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputExchangeRateCreateRequestTest {

    @Test
    fun create() {
        val batchInputExchangeRateCreateRequest =
            BatchInputExchangeRateCreateRequest.builder()
                .addInput(
                    ExchangeRateCreateRequest.builder()
                        .conversionRate(0.0)
                        .fromCurrencyCode(ExchangeRateCreateRequest.FromCurrencyCode.AED)
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(batchInputExchangeRateCreateRequest.inputs())
            .containsExactly(
                ExchangeRateCreateRequest.builder()
                    .conversionRate(0.0)
                    .fromCurrencyCode(ExchangeRateCreateRequest.FromCurrencyCode.AED)
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputExchangeRateCreateRequest =
            BatchInputExchangeRateCreateRequest.builder()
                .addInput(
                    ExchangeRateCreateRequest.builder()
                        .conversionRate(0.0)
                        .fromCurrencyCode(ExchangeRateCreateRequest.FromCurrencyCode.AED)
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedBatchInputExchangeRateCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputExchangeRateCreateRequest),
                jacksonTypeRef<BatchInputExchangeRateCreateRequest>(),
            )

        assertThat(roundtrippedBatchInputExchangeRateCreateRequest)
            .isEqualTo(batchInputExchangeRateCreateRequest)
    }
}
