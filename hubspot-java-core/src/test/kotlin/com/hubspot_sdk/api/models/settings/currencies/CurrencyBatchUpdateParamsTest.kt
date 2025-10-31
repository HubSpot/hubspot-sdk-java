// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.currencies

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyBatchUpdateParamsTest {

    @Test
    fun create() {
        CurrencyBatchUpdateParams.builder()
            .batchInputExchangeRateUpdateRequest(
                BatchInputExchangeRateUpdateRequest.builder()
                    .addInput(
                        ExchangeRateUpdateRequest.builder()
                            .id("id")
                            .conversionRate(0.0)
                            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CurrencyBatchUpdateParams.builder()
                .batchInputExchangeRateUpdateRequest(
                    BatchInputExchangeRateUpdateRequest.builder()
                        .addInput(
                            ExchangeRateUpdateRequest.builder()
                                .id("id")
                                .conversionRate(0.0)
                                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputExchangeRateUpdateRequest.builder()
                    .addInput(
                        ExchangeRateUpdateRequest.builder()
                            .id("id")
                            .conversionRate(0.0)
                            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CurrencyBatchUpdateParams.builder()
                .batchInputExchangeRateUpdateRequest(
                    BatchInputExchangeRateUpdateRequest.builder()
                        .addInput(
                            ExchangeRateUpdateRequest.builder().id("id").conversionRate(0.0).build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputExchangeRateUpdateRequest.builder()
                    .addInput(
                        ExchangeRateUpdateRequest.builder().id("id").conversionRate(0.0).build()
                    )
                    .build()
            )
    }
}
