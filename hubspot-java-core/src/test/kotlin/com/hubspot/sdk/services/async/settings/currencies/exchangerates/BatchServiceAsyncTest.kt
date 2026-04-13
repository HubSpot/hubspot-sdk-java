// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.settings.currencies.exchangerates

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.BatchInputPublicObjectId
import com.hubspot.sdk.models.PublicObjectId
import com.hubspot.sdk.models.settings.currencies.BatchInputExchangeRateCreateRequest
import com.hubspot.sdk.models.settings.currencies.BatchInputExchangeRateUpdateRequest
import com.hubspot.sdk.models.settings.currencies.ExchangeRateCreateRequest
import com.hubspot.sdk.models.settings.currencies.ExchangeRateUpdateRequest
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.settings().currencies().exchangeRates().batch()

        val batchResponseExchangeRateFuture =
            batchServiceAsync.create(
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.settings().currencies().exchangeRates().batch()

        val batchResponseExchangeRateFuture =
            batchServiceAsync.update(
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.settings().currencies().exchangeRates().batch()

        val batchResponseExchangeRateFuture =
            batchServiceAsync.get(
                BatchInputPublicObjectId.builder()
                    .addInput(PublicObjectId.builder().id("id").build())
                    .build()
            )

        val batchResponseExchangeRate = batchResponseExchangeRateFuture.get()
        batchResponseExchangeRate.validate()
    }
}
