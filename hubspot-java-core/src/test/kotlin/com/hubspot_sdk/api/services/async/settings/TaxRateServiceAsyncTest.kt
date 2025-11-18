// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.settings

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TaxRateServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val taxRateServiceAsync = client.settings().taxRates()

        val pageFuture = taxRateServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val taxRateServiceAsync = client.settings().taxRates()

        val publicTaxRateGroupFuture = taxRateServiceAsync.get("taxRateGroupId")

        val publicTaxRateGroup = publicTaxRateGroupFuture.get()
        publicTaxRateGroup.validate()
    }
}
