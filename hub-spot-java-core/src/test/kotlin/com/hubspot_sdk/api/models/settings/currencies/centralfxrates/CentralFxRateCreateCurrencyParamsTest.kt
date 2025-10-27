// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.currencies.centralfxrates

import com.hubspot_sdk.api.models.settings.currencies.CurrencyCreateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CentralFxRateCreateCurrencyParamsTest {

    @Test
    fun create() {
        CentralFxRateCreateCurrencyParams.builder()
            .currencyCreateRequest(
                CurrencyCreateRequest.builder()
                    .currencyCode(CurrencyCreateRequest.CurrencyCode.AED)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CentralFxRateCreateCurrencyParams.builder()
                .currencyCreateRequest(
                    CurrencyCreateRequest.builder()
                        .currencyCode(CurrencyCreateRequest.CurrencyCode.AED)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CurrencyCreateRequest.builder()
                    .currencyCode(CurrencyCreateRequest.CurrencyCode.AED)
                    .build()
            )
    }
}
