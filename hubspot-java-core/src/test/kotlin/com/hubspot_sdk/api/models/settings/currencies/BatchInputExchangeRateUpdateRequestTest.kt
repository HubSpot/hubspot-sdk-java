// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.currencies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputExchangeRateUpdateRequestTest {

    @Test
    fun create() {
        val batchInputExchangeRateUpdateRequest =
            BatchInputExchangeRateUpdateRequest.builder()
                .addInput(
                    ExchangeRateUpdateRequest.builder()
                        .id("id")
                        .conversionRate(0.0)
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(batchInputExchangeRateUpdateRequest.inputs())
            .containsExactly(
                ExchangeRateUpdateRequest.builder()
                    .id("id")
                    .conversionRate(0.0)
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputExchangeRateUpdateRequest =
            BatchInputExchangeRateUpdateRequest.builder()
                .addInput(
                    ExchangeRateUpdateRequest.builder()
                        .id("id")
                        .conversionRate(0.0)
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedBatchInputExchangeRateUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputExchangeRateUpdateRequest),
                jacksonTypeRef<BatchInputExchangeRateUpdateRequest>(),
            )

        assertThat(roundtrippedBatchInputExchangeRateUpdateRequest)
            .isEqualTo(batchInputExchangeRateUpdateRequest)
    }
}
