// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.settings.currencies.exchangerates

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.BatchInputPublicObjectId
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.settings.currencies.BatchInputExchangeRateCreateRequest
import com.hubspot_sdk.api.models.settings.currencies.BatchInputExchangeRateUpdateRequest
import com.hubspot_sdk.api.models.settings.currencies.ExchangeRateCreateRequest
import com.hubspot_sdk.api.models.settings.currencies.ExchangeRateUpdateRequest
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.settings().currencies().exchangeRates().batch()

        val batchResponseExchangeRate =
            batchService.create(
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.settings().currencies().exchangeRates().batch()

        val batchResponseExchangeRate =
            batchService.update(
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.settings().currencies().exchangeRates().batch()

        val batchResponseExchangeRate =
            batchService.get(
                BatchInputPublicObjectId.builder()
                    .addInput(PublicObjectId.builder().id("id").build())
                    .build()
            )

        batchResponseExchangeRate.validate()
    }
}
