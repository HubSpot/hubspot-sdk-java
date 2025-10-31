// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.settings.currencies

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.settings.currencies.CurrencyCreateRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CentralFxRateServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createCurrency() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val centralFxRateServiceAsync = client.settings().currencies().centralFxRates()

        val exchangeRateFuture =
            centralFxRateServiceAsync.createCurrency(
                CurrencyCreateRequest.builder()
                    .currencyCode(CurrencyCreateRequest.CurrencyCode.AED)
                    .build()
            )

        val exchangeRate = exchangeRateFuture.get()
        exchangeRate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getInformation() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val centralFxRateServiceAsync = client.settings().currencies().centralFxRates()

        val centralExchangeRatesInformationFuture = centralFxRateServiceAsync.getInformation()

        val centralExchangeRatesInformation = centralExchangeRatesInformationFuture.get()
        centralExchangeRatesInformation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getUnsupportedCurrencies() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val centralFxRateServiceAsync = client.settings().currencies().centralFxRates()

        val collectionResponseCurrencyCodeInfoNoPagingFuture =
            centralFxRateServiceAsync.getUnsupportedCurrencies()

        val collectionResponseCurrencyCodeInfoNoPaging =
            collectionResponseCurrencyCodeInfoNoPagingFuture.get()
        collectionResponseCurrencyCodeInfoNoPaging.validate()
    }
}
