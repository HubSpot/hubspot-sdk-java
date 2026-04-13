// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking

import com.hubspot.client.okhttp.HubSpotOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccountServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val accountService = client.account()

        val portalInformationResponse = accountService.get()

        portalInformationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDailyPrivateAppsUsage() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val accountService = client.account()

        val collectionResponseApiUsageNoPaging = accountService.getDailyPrivateAppsUsage()

        collectionResponseApiUsageNoPaging.validate()
    }
}
