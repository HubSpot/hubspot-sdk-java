// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.settings.currencies

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyUpdateCompanyCurrencyParamsTest {

    @Test
    fun create() {
        CurrencyUpdateCompanyCurrencyParams.builder()
            .companyCurrencyUpdateRequest(
                CompanyCurrencyUpdateRequest.builder()
                    .currencyCode(CompanyCurrencyUpdateRequest.CurrencyCode.AED)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CurrencyUpdateCompanyCurrencyParams.builder()
                .companyCurrencyUpdateRequest(
                    CompanyCurrencyUpdateRequest.builder()
                        .currencyCode(CompanyCurrencyUpdateRequest.CurrencyCode.AED)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CompanyCurrencyUpdateRequest.builder()
                    .currencyCode(CompanyCurrencyUpdateRequest.CurrencyCode.AED)
                    .build()
            )
    }
}
