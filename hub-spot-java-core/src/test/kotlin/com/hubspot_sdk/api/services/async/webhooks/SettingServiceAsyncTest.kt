// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.webhooks

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.webhooks.SettingsChangeRequest
import com.hubspot_sdk.api.models.webhooks.ThrottlingSettings
import com.hubspot_sdk.api.models.webhooks.settings.SettingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SettingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val settingServiceAsync = client.webhooks().settings()

        val settingsResponseFuture =
            settingServiceAsync.update(
                SettingUpdateParams.builder()
                    .appId(0)
                    .settingsChangeRequest(
                        SettingsChangeRequest.builder()
                            .targetUrl("https://www.example.com/hubspot/target")
                            .throttling(
                                ThrottlingSettings.builder().maxConcurrentRequests(10).build()
                            )
                            .build()
                    )
                    .build()
            )

        val settingsResponse = settingsResponseFuture.get()
        settingsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val settingServiceAsync = client.webhooks().settings()

        val settingsResponseFuture = settingServiceAsync.list(0)

        val settingsResponse = settingsResponseFuture.get()
        settingsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val settingServiceAsync = client.webhooks().settings()

        val future = settingServiceAsync.delete(0)

        val response = future.get()
    }
}
