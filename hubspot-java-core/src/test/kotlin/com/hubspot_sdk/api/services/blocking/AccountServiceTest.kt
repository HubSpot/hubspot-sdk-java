// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccountServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val accountService = client.account()

        val portalInformationResponse = accountService.get()

        portalInformationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDailyPrivateAppsUsage() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val accountService = client.account()

        val collectionResponseApiUsageNoPaging = accountService.getDailyPrivateAppsUsage()

        collectionResponseApiUsageNoPaging.validate()
    }
}
