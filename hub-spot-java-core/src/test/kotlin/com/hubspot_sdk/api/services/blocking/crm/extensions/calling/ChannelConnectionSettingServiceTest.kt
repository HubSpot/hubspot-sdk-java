// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions.calling

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.crm.extensions.calling.ChannelConnectionSettingsPatchRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.ChannelConnectionSettingsRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.channelconnectionsettings.ChannelConnectionSettingCreateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.channelconnectionsettings.ChannelConnectionSettingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChannelConnectionSettingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val channelConnectionSettingService =
            client.crm().extensions().calling().channelConnectionSettings()

        val channelConnectionSettingsResponse =
            channelConnectionSettingService.create(
                ChannelConnectionSettingCreateParams.builder()
                    .appId(0)
                    .channelConnectionSettingsRequest(
                        ChannelConnectionSettingsRequest.builder().isReady(true).url("url").build()
                    )
                    .build()
            )

        channelConnectionSettingsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val channelConnectionSettingService =
            client.crm().extensions().calling().channelConnectionSettings()

        val channelConnectionSettingsResponse =
            channelConnectionSettingService.update(
                ChannelConnectionSettingUpdateParams.builder()
                    .appId(0)
                    .channelConnectionSettingsPatchRequest(
                        ChannelConnectionSettingsPatchRequest.builder()
                            .isReady(true)
                            .url("url")
                            .build()
                    )
                    .build()
            )

        channelConnectionSettingsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val channelConnectionSettingService =
            client.crm().extensions().calling().channelConnectionSettings()

        channelConnectionSettingService.delete(0)
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val channelConnectionSettingService =
            client.crm().extensions().calling().channelConnectionSettings()

        val channelConnectionSettingsResponse = channelConnectionSettingService.get(0)

        channelConnectionSettingsResponse.validate()
    }
}
