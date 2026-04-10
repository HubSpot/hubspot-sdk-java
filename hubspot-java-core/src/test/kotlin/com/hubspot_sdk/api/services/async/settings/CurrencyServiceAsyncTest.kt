// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.settings

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.settings.currencies.CompanyCurrencyUpdateRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CurrencyServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getCompanyCurrency() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val currencyServiceAsync = client.settings().currencies()

        val companyCurrencyFuture = currencyServiceAsync.getCompanyCurrency()

        val companyCurrency = companyCurrencyFuture.get()
        companyCurrency.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listCodes() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val currencyServiceAsync = client.settings().currencies()

        val collectionResponseCurrencyCodeInfoNoPagingFuture = currencyServiceAsync.listCodes()

        val collectionResponseCurrencyCodeInfoNoPaging =
            collectionResponseCurrencyCodeInfoNoPagingFuture.get()
        collectionResponseCurrencyCodeInfoNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateCompanyCurrency() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val currencyServiceAsync = client.settings().currencies()

        val companyCurrencyFuture =
            currencyServiceAsync.updateCompanyCurrency(
                CompanyCurrencyUpdateRequest.builder()
                    .currencyCode(CompanyCurrencyUpdateRequest.CurrencyCode.AED)
                    .build()
            )

        val companyCurrency = companyCurrencyFuture.get()
        companyCurrency.validate()
    }
}
