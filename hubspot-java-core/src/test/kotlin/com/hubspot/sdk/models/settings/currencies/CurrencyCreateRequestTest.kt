// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.settings.currencies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyCreateRequestTest {

    @Test
    fun create() {
        val currencyCreateRequest =
            CurrencyCreateRequest.builder()
                .currencyCode(CurrencyCreateRequest.CurrencyCode.AED)
                .build()

        assertThat(currencyCreateRequest.currencyCode())
            .isEqualTo(CurrencyCreateRequest.CurrencyCode.AED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val currencyCreateRequest =
            CurrencyCreateRequest.builder()
                .currencyCode(CurrencyCreateRequest.CurrencyCode.AED)
                .build()

        val roundtrippedCurrencyCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currencyCreateRequest),
                jacksonTypeRef<CurrencyCreateRequest>(),
            )

        assertThat(roundtrippedCurrencyCreateRequest).isEqualTo(currencyCreateRequest)
    }
}
