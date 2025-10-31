// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions.calling

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.extensions.calling.SettingsPatchRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.SettingsRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.settings.SettingCreateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.settings.SettingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SettingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val settingServiceAsync = client.crm().extensions().calling().settings()

        val settingsResponseFuture =
            settingServiceAsync.create(
                SettingCreateParams.builder()
                    .appId(0)
                    .settingsRequest(
                        SettingsRequest.builder()
                            .name("name")
                            .url("url")
                            .height(0)
                            .isReady(true)
                            .supportsCustomObjects(true)
                            .supportsInboundCalling(true)
                            .usesCallingWindow(true)
                            .usesRemote(true)
                            .width(0)
                            .build()
                    )
                    .build()
            )

        val settingsResponse = settingsResponseFuture.get()
        settingsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val settingServiceAsync = client.crm().extensions().calling().settings()

        val settingsResponseFuture =
            settingServiceAsync.update(
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

        val settingsResponse = settingsResponseFuture.get()
        settingsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val settingServiceAsync = client.crm().extensions().calling().settings()

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
        val settingServiceAsync = client.crm().extensions().calling().settings()

        val settingsResponseFuture = settingServiceAsync.get(0)

        val settingsResponse = settingsResponseFuture.get()
        settingsResponse.validate()
    }
}
