// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.settings.currencies.exchangerates.batch

import com.hubspot.sdk.models.settings.currencies.BatchInputExchangeRateCreateRequest
import com.hubspot.sdk.models.settings.currencies.ExchangeRateCreateRequest
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCreateParamsTest {

    @Test
    fun create() {
        BatchCreateParams.builder()
            .batchInputExchangeRateCreateRequest(
                BatchInputExchangeRateCreateRequest.builder()
                    .addInput(
                        ExchangeRateCreateRequest.builder()
                            .conversionRate(0.0)
                            .fromCurrencyCode(ExchangeRateCreateRequest.FromCurrencyCode.AED)
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
            BatchCreateParams.builder()
                .batchInputExchangeRateCreateRequest(
                    BatchInputExchangeRateCreateRequest.builder()
                        .addInput(
                            ExchangeRateCreateRequest.builder()
                                .conversionRate(0.0)
                                .fromCurrencyCode(ExchangeRateCreateRequest.FromCurrencyCode.AED)
                                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputExchangeRateCreateRequest.builder()
                    .addInput(
                        ExchangeRateCreateRequest.builder()
                            .conversionRate(0.0)
                            .fromCurrencyCode(ExchangeRateCreateRequest.FromCurrencyCode.AED)
                            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BatchCreateParams.builder()
                .batchInputExchangeRateCreateRequest(
                    BatchInputExchangeRateCreateRequest.builder()
                        .addInput(
                            ExchangeRateCreateRequest.builder()
                                .conversionRate(0.0)
                                .fromCurrencyCode(ExchangeRateCreateRequest.FromCurrencyCode.AED)
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputExchangeRateCreateRequest.builder()
                    .addInput(
                        ExchangeRateCreateRequest.builder()
                            .conversionRate(0.0)
                            .fromCurrencyCode(ExchangeRateCreateRequest.FromCurrencyCode.AED)
                            .build()
                    )
                    .build()
            )
    }
}
