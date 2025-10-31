// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions.calling

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.extensions.calling.ChannelConnectionSettingsPatchRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.ChannelConnectionSettingsRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.channelconnectionsettings.ChannelConnectionSettingCreateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.channelconnectionsettings.ChannelConnectionSettingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChannelConnectionSettingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val channelConnectionSettingServiceAsync =
            client.crm().extensions().calling().channelConnectionSettings()

        val channelConnectionSettingsResponseFuture =
            channelConnectionSettingServiceAsync.create(
                ChannelConnectionSettingCreateParams.builder()
                    .appId(0)
                    .channelConnectionSettingsRequest(
                        ChannelConnectionSettingsRequest.builder().isReady(true).url("url").build()
                    )
                    .build()
            )

        val channelConnectionSettingsResponse = channelConnectionSettingsResponseFuture.get()
        channelConnectionSettingsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val channelConnectionSettingServiceAsync =
            client.crm().extensions().calling().channelConnectionSettings()

        val channelConnectionSettingsResponseFuture =
            channelConnectionSettingServiceAsync.update(
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

        val channelConnectionSettingsResponse = channelConnectionSettingsResponseFuture.get()
        channelConnectionSettingsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val channelConnectionSettingServiceAsync =
            client.crm().extensions().calling().channelConnectionSettings()

        val future = channelConnectionSettingServiceAsync.delete(0)

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val channelConnectionSettingServiceAsync =
            client.crm().extensions().calling().channelConnectionSettings()

        val channelConnectionSettingsResponseFuture = channelConnectionSettingServiceAsync.get(0)

        val channelConnectionSettingsResponse = channelConnectionSettingsResponseFuture.get()
        channelConnectionSettingsResponse.validate()
    }
}
