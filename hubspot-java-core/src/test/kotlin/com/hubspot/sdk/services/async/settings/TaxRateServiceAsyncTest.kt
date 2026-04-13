// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.settings

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TaxRateServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val taxRateServiceAsync = client.settings().taxRates()

        val pageFuture = taxRateServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val taxRateServiceAsync = client.settings().taxRates()

        val publicTaxRateGroupFuture = taxRateServiceAsync.get("taxRateGroupId")

        val publicTaxRateGroup = publicTaxRateGroupFuture.get()
        publicTaxRateGroup.validate()
    }
}
