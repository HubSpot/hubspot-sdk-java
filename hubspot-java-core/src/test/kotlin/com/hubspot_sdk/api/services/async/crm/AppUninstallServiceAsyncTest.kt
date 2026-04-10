// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AppUninstallServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun uninstall() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val appUninstallServiceAsync = client.crm().appUninstalls()

        val future = appUninstallServiceAsync.uninstall()

        val response = future.get()
    }
}
