// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.currencies.exchangerates

import com.hubspot_sdk.api.models.settings.currencies.ExchangeRateMultiplier
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExchangeRateUpdateExchangeRateParamsTest {

    @Test
    fun create() {
        ExchangeRateUpdateExchangeRateParams.builder()
            .exchangeRateId("exchangeRateId")
            .exchangeRateMultiplier(
                ExchangeRateMultiplier.builder()
                    .conversionRate(0.0)
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExchangeRateUpdateExchangeRateParams.builder()
                .exchangeRateId("exchangeRateId")
                .exchangeRateMultiplier(
                    ExchangeRateMultiplier.builder().conversionRate(0.0).build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("exchangeRateId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExchangeRateUpdateExchangeRateParams.builder()
                .exchangeRateId("exchangeRateId")
                .exchangeRateMultiplier(
                    ExchangeRateMultiplier.builder()
                        .conversionRate(0.0)
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExchangeRateMultiplier.builder()
                    .conversionRate(0.0)
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExchangeRateUpdateExchangeRateParams.builder()
                .exchangeRateId("exchangeRateId")
                .exchangeRateMultiplier(
                    ExchangeRateMultiplier.builder().conversionRate(0.0).build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ExchangeRateMultiplier.builder().conversionRate(0.0).build())
    }
}
