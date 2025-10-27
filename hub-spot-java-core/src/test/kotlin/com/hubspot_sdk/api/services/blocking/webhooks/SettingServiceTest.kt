// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.webhooks

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.webhooks.SettingsChangeRequest
import com.hubspot_sdk.api.models.webhooks.ThrottlingSettings
import com.hubspot_sdk.api.models.webhooks.settings.SettingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SettingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val settingService = client.webhooks().settings()

        val settingsResponse =
            settingService.update(
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

        settingsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val settingService = client.webhooks().settings()

        val settingsResponse = settingService.list(0)

        settingsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val settingService = client.webhooks().settings()

        settingService.delete(0)
    }
}
