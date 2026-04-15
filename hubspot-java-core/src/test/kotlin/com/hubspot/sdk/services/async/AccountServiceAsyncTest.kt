// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccountServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val accountServiceAsync = client.account()

        val portalInformationResponseFuture = accountServiceAsync.get()

        val portalInformationResponse = portalInformationResponseFuture.get()
        portalInformationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDailyPrivateAppsUsage() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val accountServiceAsync = client.account()

        val collectionResponseApiUsageNoPagingFuture =
            accountServiceAsync.getDailyPrivateAppsUsage()

        val collectionResponseApiUsageNoPaging = collectionResponseApiUsageNoPagingFuture.get()
        collectionResponseApiUsageNoPaging.validate()
    }
}
