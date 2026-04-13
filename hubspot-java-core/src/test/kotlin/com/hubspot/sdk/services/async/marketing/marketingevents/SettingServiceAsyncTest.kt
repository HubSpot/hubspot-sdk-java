// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.marketing.marketingevents

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.marketing.marketingevents.EventDetailSettingsUrl
import com.hubspot.sdk.models.marketing.marketingevents.settings.SettingCreateOrUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SettingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createOrUpdate() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val settingServiceAsync = client.marketing().marketingEvents().settings()

        val eventDetailSettingsFuture =
            settingServiceAsync.createOrUpdate(
                SettingCreateOrUpdateParams.builder()
                    .appId(0)
                    .eventDetailSettingsUrl(
                        EventDetailSettingsUrl.builder().eventDetailsUrl("eventDetailsUrl").build()
                    )
                    .build()
            )

        val eventDetailSettings = eventDetailSettingsFuture.get()
        eventDetailSettings.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val settingServiceAsync = client.marketing().marketingEvents().settings()

        val eventDetailSettingsFuture = settingServiceAsync.get(0)

        val eventDetailSettings = eventDetailSettingsFuture.get()
        eventDetailSettings.validate()
    }
}
