// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.marketingevents

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.marketing.marketingevents.EventDetailSettingsUrl
import com.hubspot_sdk.api.models.marketing.marketingevents.settings.SettingCreateOrUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SettingServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createOrUpdate() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val settingService = client.marketing().marketingEvents().settings()

        val eventDetailSettings =
            settingService.createOrUpdate(
                SettingCreateOrUpdateParams.builder()
                    .appId(0)
                    .eventDetailSettingsUrl(
                        EventDetailSettingsUrl.builder().eventDetailsUrl("eventDetailsUrl").build()
                    )
                    .build()
            )

        eventDetailSettings.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val settingService = client.marketing().marketingEvents().settings()

        val eventDetailSettings = settingService.get(0)

        eventDetailSettings.validate()
    }
}
