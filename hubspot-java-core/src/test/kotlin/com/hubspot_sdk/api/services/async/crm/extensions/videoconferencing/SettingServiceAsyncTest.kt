// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions.videoconferencing

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.extensions.videoconferencing.ExternalSettings
import com.hubspot_sdk.api.models.crm.extensions.videoconferencing.settings.SettingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SettingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val settingServiceAsync = client.crm().extensions().videoConferencing().settings()

        val externalSettingsFuture =
            settingServiceAsync.update(
                SettingUpdateParams.builder()
                    .appId(0)
                    .externalSettings(
                        ExternalSettings.builder()
                            .createMeetingUrl("https://example.com/create-meeting")
                            .deleteMeetingUrl("https://example.com/delete-meeting")
                            .fetchAccountsUri("fetchAccountsUri")
                            .updateMeetingUrl("https://example.com/update-meeting")
                            .userVerifyUrl("https://example.com/user-verify")
                            .build()
                    )
                    .build()
            )

        val externalSettings = externalSettingsFuture.get()
        externalSettings.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val settingServiceAsync = client.crm().extensions().videoConferencing().settings()

        val future = settingServiceAsync.delete(0)

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val settingServiceAsync = client.crm().extensions().videoConferencing().settings()

        val externalSettingsFuture = settingServiceAsync.get(0)

        val externalSettings = externalSettingsFuture.get()
        externalSettings.validate()
    }
}
