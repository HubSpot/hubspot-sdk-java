// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.settings.currencies

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.settings.currencies.CurrencyPairUpdate
import com.hubspot_sdk.api.models.settings.currencies.ExchangeRateCreateRequest
import com.hubspot_sdk.api.models.settings.currencies.ExchangeRateMultiplier
import com.hubspot_sdk.api.models.settings.currencies.exchangerates.ExchangeRateUpdateExchangeRateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExchangeRateServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createExchangeRate() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val exchangeRateServiceAsync = client.settings().currencies().exchangeRates()

        val exchangeRateFuture =
            exchangeRateServiceAsync.createExchangeRate(
                ExchangeRateCreateRequest.builder()
                    .conversionRate(0.0)
                    .fromCurrencyCode(ExchangeRateCreateRequest.FromCurrencyCode.AED)
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val exchangeRate = exchangeRateFuture.get()
        exchangeRate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getExchangeRateById() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val exchangeRateServiceAsync = client.settings().currencies().exchangeRates()

        val exchangeRateFuture = exchangeRateServiceAsync.getExchangeRateById("exchangeRateId")

        val exchangeRate = exchangeRateFuture.get()
        exchangeRate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listCurrentExchangeRates() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val exchangeRateServiceAsync = client.settings().currencies().exchangeRates()

        val collectionResponseExchangeRateNoPagingFuture =
            exchangeRateServiceAsync.listCurrentExchangeRates()

        val collectionResponseExchangeRateNoPaging =
            collectionResponseExchangeRateNoPagingFuture.get()
        collectionResponseExchangeRateNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listExchangeRates() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val exchangeRateServiceAsync = client.settings().currencies().exchangeRates()

        val pageFuture = exchangeRateServiceAsync.listExchangeRates()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateExchangeRate() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val exchangeRateServiceAsync = client.settings().currencies().exchangeRates()

        val exchangeRateFuture =
            exchangeRateServiceAsync.updateExchangeRate(
                ExchangeRateUpdateExchangeRateParams.builder()
                    .exchangeRateId("exchangeRateId")
                    .exchangeRateMultiplier(
                        ExchangeRateMultiplier.builder()
                            .conversionRate(0.0)
                            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        val exchangeRate = exchangeRateFuture.get()
        exchangeRate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateVisibility() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val exchangeRateServiceAsync = client.settings().currencies().exchangeRates()

        val future =
            exchangeRateServiceAsync.updateVisibility(
                CurrencyPairUpdate.builder()
                    .fromCurrencyCode(CurrencyPairUpdate.FromCurrencyCode.AED)
                    .toCurrencyCode(CurrencyPairUpdate.ToCurrencyCode.AED)
                    .visibleInUi(true)
                    .build()
            )

        val response = future.get()
    }
}
