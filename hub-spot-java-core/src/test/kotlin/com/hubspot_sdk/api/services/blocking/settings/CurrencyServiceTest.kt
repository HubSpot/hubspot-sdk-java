// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.settings

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
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
internal class CurrencyServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun batchCreate() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyService = client.settings().currencies()

        val batchResponseExchangeRate =
            currencyService.batchCreate(
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

        batchResponseExchangeRate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchGet() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyService = client.settings().currencies()

        val batchResponseExchangeRate =
            currencyService.batchGet(
                BatchInputPublicObjectId.builder()
                    .addInput(PublicObjectId.builder().id("37295").build())
                    .build()
            )

        batchResponseExchangeRate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchUpdate() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyService = client.settings().currencies()

        val batchResponseExchangeRate =
            currencyService.batchUpdate(
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

        batchResponseExchangeRate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createExchangeRate() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyService = client.settings().currencies()

        val exchangeRate =
            currencyService.createExchangeRate(
                ExchangeRateCreateRequest.builder()
                    .conversionRate(0.0)
                    .fromCurrencyCode(ExchangeRateCreateRequest.FromCurrencyCode.AED)
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        exchangeRate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getCompanyCurrency() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyService = client.settings().currencies()

        val companyCurrency = currencyService.getCompanyCurrency()

        companyCurrency.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getExchangeRateById() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyService = client.settings().currencies()

        val exchangeRate = currencyService.getExchangeRateById("exchangeRateId")

        exchangeRate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listCodes() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyService = client.settings().currencies()

        val collectionResponseCurrencyCodeInfoNoPaging = currencyService.listCodes()

        collectionResponseCurrencyCodeInfoNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listCurrentExchangeRates() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyService = client.settings().currencies()

        val collectionResponseExchangeRateNoPaging = currencyService.listCurrentExchangeRates()

        collectionResponseExchangeRateNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listExchangeRates() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyService = client.settings().currencies()

        val collectionResponseExchangeRateForwardPaging = currencyService.listExchangeRates()

        collectionResponseExchangeRateForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateCompanyCurrency() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyService = client.settings().currencies()

        val companyCurrency =
            currencyService.updateCompanyCurrency(
                CompanyCurrencyUpdateRequest.builder()
                    .currencyCode(CompanyCurrencyUpdateRequest.CurrencyCode.AED)
                    .build()
            )

        companyCurrency.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateExchangeRate() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyService = client.settings().currencies()

        val exchangeRate =
            currencyService.updateExchangeRate(
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

        exchangeRate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateVisibility() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val currencyService = client.settings().currencies()

        currencyService.updateVisibility(
            CurrencyPairUpdate.builder()
                .fromCurrencyCode(CurrencyPairUpdate.FromCurrencyCode.AED)
                .toCurrencyCode(CurrencyPairUpdate.ToCurrencyCode.AED)
                .visibleInUi(true)
                .build()
        )
    }
}
