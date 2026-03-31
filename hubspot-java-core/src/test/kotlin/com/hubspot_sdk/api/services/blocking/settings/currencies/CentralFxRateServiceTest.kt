// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.settings.currencies

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.settings.currencies.CurrencyCreateRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CentralFxRateServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createCurrency() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val centralFxRateService = client.settings().currencies().centralFxRates()

        val exchangeRate =
            centralFxRateService.createCurrency(
                CurrencyCreateRequest.builder()
                    .currencyCode(CurrencyCreateRequest.CurrencyCode.AED)
                    .build()
            )

        exchangeRate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInformation() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val centralFxRateService = client.settings().currencies().centralFxRates()

        val centralExchangeRatesInformation = centralFxRateService.getInformation()

        centralExchangeRatesInformation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getUnsupportedCurrencies() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val centralFxRateService = client.settings().currencies().centralFxRates()

        val collectionResponseCurrencyCodeInfoNoPaging =
            centralFxRateService.getUnsupportedCurrencies()

        collectionResponseCurrencyCodeInfoNoPaging.validate()
    }
}
