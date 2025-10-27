// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.currencies

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyBatchCreateParamsTest {

    @Test
    fun create() {
        CurrencyBatchCreateParams.builder()
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
            CurrencyBatchCreateParams.builder()
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
            CurrencyBatchCreateParams.builder()
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
