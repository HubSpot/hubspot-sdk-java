// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.currencies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CentralExchangeRatesInformationTest {

    @Test
    fun create() {
        val centralExchangeRatesInformation =
            CentralExchangeRatesInformation.builder().centralExchangeRatesEnabled(true).build()

        assertThat(centralExchangeRatesInformation.centralExchangeRatesEnabled()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val centralExchangeRatesInformation =
            CentralExchangeRatesInformation.builder().centralExchangeRatesEnabled(true).build()

        val roundtrippedCentralExchangeRatesInformation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(centralExchangeRatesInformation),
                jacksonTypeRef<CentralExchangeRatesInformation>(),
            )

        assertThat(roundtrippedCentralExchangeRatesInformation)
            .isEqualTo(centralExchangeRatesInformation)
    }
}
