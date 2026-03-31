// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.settings.currencies

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.settings.currencies.CurrencyPairUpdate
import com.hubspot_sdk.api.models.settings.currencies.ExchangeRateCreateRequest
import com.hubspot_sdk.api.models.settings.currencies.ExchangeRateMultiplier
import com.hubspot_sdk.api.models.settings.currencies.exchangerates.ExchangeRateUpdateExchangeRateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExchangeRateServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createExchangeRate() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val exchangeRateService = client.settings().currencies().exchangeRates()

        val exchangeRate =
            exchangeRateService.createExchangeRate(
                ExchangeRateCreateRequest.builder()
                    .conversionRate(0.0)
                    .fromCurrencyCode(ExchangeRateCreateRequest.FromCurrencyCode.AED)
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        exchangeRate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getExchangeRateById() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val exchangeRateService = client.settings().currencies().exchangeRates()

        val exchangeRate = exchangeRateService.getExchangeRateById("exchangeRateId")

        exchangeRate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listCurrentExchangeRates() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val exchangeRateService = client.settings().currencies().exchangeRates()

        val collectionResponseExchangeRateNoPaging = exchangeRateService.listCurrentExchangeRates()

        collectionResponseExchangeRateNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listExchangeRates() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val exchangeRateService = client.settings().currencies().exchangeRates()

        val page = exchangeRateService.listExchangeRates()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateExchangeRate() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val exchangeRateService = client.settings().currencies().exchangeRates()

        val exchangeRate =
            exchangeRateService.updateExchangeRate(
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

        exchangeRate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateVisibility() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val exchangeRateService = client.settings().currencies().exchangeRates()

        exchangeRateService.updateVisibility(
            CurrencyPairUpdate.builder()
                .fromCurrencyCode(CurrencyPairUpdate.FromCurrencyCode.AED)
                .toCurrencyCode(CurrencyPairUpdate.ToCurrencyCode.AED)
                .visibleInUi(true)
                .build()
        )
    }
}
