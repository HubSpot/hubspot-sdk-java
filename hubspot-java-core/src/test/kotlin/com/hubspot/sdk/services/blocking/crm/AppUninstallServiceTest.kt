// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AppUninstallServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun uninstall() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val appUninstallService = client.crm().appUninstalls()

        appUninstallService.uninstall()
    }
}
