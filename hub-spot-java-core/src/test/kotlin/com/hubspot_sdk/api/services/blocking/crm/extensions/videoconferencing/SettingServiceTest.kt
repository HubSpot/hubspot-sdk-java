// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions.videoconferencing

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.crm.extensions.videoconferencing.ExternalSettings
import com.hubspot_sdk.api.models.crm.extensions.videoconferencing.settings.SettingUpdateParams
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
        val settingService = client.crm().extensions().videoConferencing().settings()

        val externalSettings =
            settingService.update(
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

        externalSettings.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val settingService = client.crm().extensions().videoConferencing().settings()

        settingService.delete(0)
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val settingService = client.crm().extensions().videoConferencing().settings()

        val externalSettings = settingService.get(0)

        externalSettings.validate()
    }
}
