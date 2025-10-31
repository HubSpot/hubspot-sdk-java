// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.account

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DetailServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val detailServiceAsync = client.account().details()

        val portalInformationResponseFuture = detailServiceAsync.get()

        val portalInformationResponse = portalInformationResponseFuture.get()
        portalInformationResponse.validate()
    }
}
