// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.currencies.exchangerates

import com.hubspot_sdk.api.models.settings.currencies.ExchangeRateCreateRequest
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExchangeRateCreateExchangeRateParamsTest {

    @Test
    fun create() {
        ExchangeRateCreateExchangeRateParams.builder()
            .exchangeRateCreateRequest(
                ExchangeRateCreateRequest.builder()
                    .conversionRate(0.0)
                    .fromCurrencyCode(ExchangeRateCreateRequest.FromCurrencyCode.AED)
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ExchangeRateCreateExchangeRateParams.builder()
                .exchangeRateCreateRequest(
                    ExchangeRateCreateRequest.builder()
                        .conversionRate(0.0)
                        .fromCurrencyCode(ExchangeRateCreateRequest.FromCurrencyCode.AED)
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExchangeRateCreateRequest.builder()
                    .conversionRate(0.0)
                    .fromCurrencyCode(ExchangeRateCreateRequest.FromCurrencyCode.AED)
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExchangeRateCreateExchangeRateParams.builder()
                .exchangeRateCreateRequest(
                    ExchangeRateCreateRequest.builder()
                        .conversionRate(0.0)
                        .fromCurrencyCode(ExchangeRateCreateRequest.FromCurrencyCode.AED)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExchangeRateCreateRequest.builder()
                    .conversionRate(0.0)
                    .fromCurrencyCode(ExchangeRateCreateRequest.FromCurrencyCode.AED)
                    .build()
            )
    }
}
