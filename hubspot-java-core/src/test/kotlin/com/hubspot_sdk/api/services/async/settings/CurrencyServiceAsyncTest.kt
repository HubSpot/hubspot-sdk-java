// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.settings

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.BatchInputPublicObjectId
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.settings.currencies.BatchInputExchangeRateCreateRequest
import com.hubspot_sdk.api.models.settings.currencies.BatchInputExchangeRateUpdateRequest
import com.hubspot_sdk.api.models.settings.currencies.CompanyCurrencyUpdateRequest
import com.hubspot_sdk.api.models.settings.currencies.CurrencyPairUpdate
import com.hubspot_sdk.api.models.settings.currencies.CurrencyUpdateExchangeRateParams
import com.hubspot_sdk.api.models.settings.currencies.ExchangeRateCreateRequest
import com.hubspot_sdk.api.models.settings.currencies.ExchangeRateMultiplier
import com.hubspot_sdk.api.models.settings.currencies.ExchangeRateUpdateRequest
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CurrencyServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun batchCreate() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyServiceAsync = client.settings().currencies()

        val batchResponseExchangeRateFuture =
            currencyServiceAsync.batchCreate(
                BatchInputExchangeRateCreateRequest.builder()
                    .addInput(
                        ExchangeRateCreateRequest.builder()
                            .conversionRate(0.0)
                            .fromCurrencyCode(ExchangeRateCreateRequest.FromCurrencyCode.AED)
                            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        val batchResponseExchangeRate = batchResponseExchangeRateFuture.get()
        batchResponseExchangeRate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchGet() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyServiceAsync = client.settings().currencies()

        val batchResponseExchangeRateFuture =
            currencyServiceAsync.batchGet(
                BatchInputPublicObjectId.builder()
                    .addInput(PublicObjectId.builder().id("37295").build())
                    .build()
            )

        val batchResponseExchangeRate = batchResponseExchangeRateFuture.get()
        batchResponseExchangeRate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchUpdate() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyServiceAsync = client.settings().currencies()

        val batchResponseExchangeRateFuture =
            currencyServiceAsync.batchUpdate(
                BatchInputExchangeRateUpdateRequest.builder()
                    .addInput(
                        ExchangeRateUpdateRequest.builder()
                            .id("id")
                            .conversionRate(0.0)
                            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        val batchResponseExchangeRate = batchResponseExchangeRateFuture.get()
        batchResponseExchangeRate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createExchangeRate() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyServiceAsync = client.settings().currencies()

        val exchangeRateFuture =
            currencyServiceAsync.createExchangeRate(
                ExchangeRateCreateRequest.builder()
                    .conversionRate(0.0)
                    .fromCurrencyCode(ExchangeRateCreateRequest.FromCurrencyCode.AED)
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val exchangeRate = exchangeRateFuture.get()
        exchangeRate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getCompanyCurrency() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyServiceAsync = client.settings().currencies()

        val companyCurrencyFuture = currencyServiceAsync.getCompanyCurrency()

        val companyCurrency = companyCurrencyFuture.get()
        companyCurrency.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getExchangeRateById() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyServiceAsync = client.settings().currencies()

        val exchangeRateFuture = currencyServiceAsync.getExchangeRateById("exchangeRateId")

        val exchangeRate = exchangeRateFuture.get()
        exchangeRate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listCodes() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyServiceAsync = client.settings().currencies()

        val collectionResponseCurrencyCodeInfoNoPagingFuture = currencyServiceAsync.listCodes()

        val collectionResponseCurrencyCodeInfoNoPaging =
            collectionResponseCurrencyCodeInfoNoPagingFuture.get()
        collectionResponseCurrencyCodeInfoNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listCurrentExchangeRates() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyServiceAsync = client.settings().currencies()

        val collectionResponseExchangeRateNoPagingFuture =
            currencyServiceAsync.listCurrentExchangeRates()

        val collectionResponseExchangeRateNoPaging =
            collectionResponseExchangeRateNoPagingFuture.get()
        collectionResponseExchangeRateNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listExchangeRates() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyServiceAsync = client.settings().currencies()

        val collectionResponseExchangeRateForwardPagingFuture =
            currencyServiceAsync.listExchangeRates()

        val collectionResponseExchangeRateForwardPaging =
            collectionResponseExchangeRateForwardPagingFuture.get()
        collectionResponseExchangeRateForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateCompanyCurrency() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun updateExchangeRate() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyServiceAsync = client.settings().currencies()

        val exchangeRateFuture =
            currencyServiceAsync.updateExchangeRate(
                CurrencyUpdateExchangeRateParams.builder()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun updateVisibility() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyServiceAsync = client.settings().currencies()

        val future =
            currencyServiceAsync.updateVisibility(
                CurrencyPairUpdate.builder()
                    .fromCurrencyCode(CurrencyPairUpdate.FromCurrencyCode.AED)
                    .toCurrencyCode(CurrencyPairUpdate.ToCurrencyCode.AED)
                    .visibleInUi(true)
                    .build()
            )

        val response = future.get()
    }
}
