// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.account

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UsageServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getDailyPrivateAppsUsage() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val usageServiceAsync = client.account().usage()

        val collectionResponseApiUsageFuture = usageServiceAsync.getDailyPrivateAppsUsage()

        val collectionResponseApiUsage = collectionResponseApiUsageFuture.get()
        collectionResponseApiUsage.validate()
    }
}
