// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.settings

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TaxRateServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val taxRateServiceAsync = client.settings().taxRates()

        val collectionResponsePublicTaxRateGroupForwardPagingFuture = taxRateServiceAsync.list()

        val collectionResponsePublicTaxRateGroupForwardPaging =
            collectionResponsePublicTaxRateGroupForwardPagingFuture.get()
        collectionResponsePublicTaxRateGroupForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val taxRateServiceAsync = client.settings().taxRates()

        val publicTaxRateGroupFuture = taxRateServiceAsync.get("taxRateGroupId")

        val publicTaxRateGroup = publicTaxRateGroupFuture.get()
        publicTaxRateGroup.validate()
    }
}
