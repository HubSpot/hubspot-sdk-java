// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.settings

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.settings.currencies.CompanyCurrencyUpdateRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CurrencyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getCompanyCurrency() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val currencyService = client.settings().currencies()

        val companyCurrency = currencyService.getCompanyCurrency()

        companyCurrency.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listCodes() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val currencyService = client.settings().currencies()

        val collectionResponseCurrencyCodeInfoNoPaging = currencyService.listCodes()

        collectionResponseCurrencyCodeInfoNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateCompanyCurrency() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val currencyService = client.settings().currencies()

        val companyCurrency =
            currencyService.updateCompanyCurrency(
                CompanyCurrencyUpdateRequest.builder()
                    .currencyCode(CompanyCurrencyUpdateRequest.CurrencyCode.AED)
                    .build()
            )

        companyCurrency.validate()
    }
}
