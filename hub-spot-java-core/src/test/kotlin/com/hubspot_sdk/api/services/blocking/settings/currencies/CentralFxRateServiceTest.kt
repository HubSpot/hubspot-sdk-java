// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.settings.currencies

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.settings.currencies.CurrencyCreateRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CentralFxRateServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createCurrency() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val centralFxRateService = client.settings().currencies().centralFxRates()

        val exchangeRate =
            centralFxRateService.createCurrency(
                CurrencyCreateRequest.builder()
                    .currencyCode(CurrencyCreateRequest.CurrencyCode.AED)
                    .build()
            )

        exchangeRate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getInformation() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val centralFxRateService = client.settings().currencies().centralFxRates()

        val centralExchangeRatesInformation = centralFxRateService.getInformation()

        centralExchangeRatesInformation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getUnsupportedCurrencies() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val centralFxRateService = client.settings().currencies().centralFxRates()

        val collectionResponseCurrencyCodeInfoNoPaging =
            centralFxRateService.getUnsupportedCurrencies()

        collectionResponseCurrencyCodeInfoNoPaging.validate()
    }
}
