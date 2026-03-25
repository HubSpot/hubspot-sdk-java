// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.currencies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyCodeInfoTest {

    @Test
    fun create() {
        val currencyCodeInfo =
            CurrencyCodeInfo.builder()
                .currencyCode("currencyCode")
                .currencyName("currencyName")
                .build()

        assertThat(currencyCodeInfo.currencyCode()).isEqualTo("currencyCode")
        assertThat(currencyCodeInfo.currencyName()).isEqualTo("currencyName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val currencyCodeInfo =
            CurrencyCodeInfo.builder()
                .currencyCode("currencyCode")
                .currencyName("currencyName")
                .build()

        val roundtrippedCurrencyCodeInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currencyCodeInfo),
                jacksonTypeRef<CurrencyCodeInfo>(),
            )

        assertThat(roundtrippedCurrencyCodeInfo).isEqualTo(currencyCodeInfo)
    }
}
