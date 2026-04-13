// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.settings.currencies.exchangerates.batch

import com.hubspot.sdk.models.settings.currencies.BatchInputExchangeRateUpdateRequest
import com.hubspot.sdk.models.settings.currencies.ExchangeRateUpdateRequest
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchUpdateParamsTest {

    @Test
    fun create() {
        BatchUpdateParams.builder()
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
            BatchUpdateParams.builder()
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
            BatchUpdateParams.builder()
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
