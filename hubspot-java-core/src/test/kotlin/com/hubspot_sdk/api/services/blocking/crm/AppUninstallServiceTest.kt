// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AppUninstallServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun uninstall() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val appUninstallService = client.crm().appUninstalls()

        appUninstallService.uninstall()
    }
}
