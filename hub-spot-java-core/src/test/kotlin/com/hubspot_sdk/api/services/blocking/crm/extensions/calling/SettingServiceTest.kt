// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions.calling

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.crm.extensions.calling.SettingsPatchRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.SettingsRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.settings.SettingCreateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.settings.SettingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SettingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val settingService = client.crm().extensions().calling().settings()

        val settingsResponse =
            settingService.create(
                SettingCreateParams.builder()
                    .appId(0)
                    .settingsRequest(
                        SettingsRequest.builder()
                            .name("HubPhone")
                            .url("https://www.example.com/hubspot/iframe")
                            .height(350)
                            .isReady(true)
                            .supportsCustomObjects(true)
                            .supportsInboundCalling(true)
                            .usesCallingWindow(true)
                            .usesRemote(true)
                            .width(200)
                            .build()
                    )
                    .build()
            )

        settingsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val settingService = client.crm().extensions().calling().settings()

        val settingsResponse =
            settingService.update(
                SettingUpdateParams.builder()
                    .appId(0)
                    .settingsPatchRequest(
                        SettingsPatchRequest.builder()
                            .height(0)
                            .isReady(true)
                            .name("name")
                            .supportsCustomObjects(true)
                            .supportsInboundCalling(true)
                            .url("url")
                            .usesCallingWindow(true)
                            .usesRemote(true)
                            .width(0)
                            .build()
                    )
                    .build()
            )

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
        val settingService = client.crm().extensions().calling().settings()

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
        val settingService = client.crm().extensions().calling().settings()

        val settingsResponse = settingService.get(0)

        settingsResponse.validate()
    }
}
