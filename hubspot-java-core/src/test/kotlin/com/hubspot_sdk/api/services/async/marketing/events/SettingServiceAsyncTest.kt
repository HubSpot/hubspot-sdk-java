// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.events

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.marketing.events.EventDetailSettingsUrl
import com.hubspot_sdk.api.models.marketing.events.settings.SettingCreateOrUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SettingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createOrUpdate() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val settingServiceAsync = client.marketing().events().settings()

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
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val settingServiceAsync = client.marketing().events().settings()

        val eventDetailSettingsFuture = settingServiceAsync.get(0)

        val eventDetailSettings = eventDetailSettingsFuture.get()
        eventDetailSettings.validate()
    }
}
