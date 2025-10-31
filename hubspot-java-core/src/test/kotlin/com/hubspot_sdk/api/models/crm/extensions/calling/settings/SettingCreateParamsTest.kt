// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling.settings

import com.hubspot_sdk.api.models.crm.extensions.calling.SettingsRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            SettingCreateParams.builder()
                .appId(0)
                .settingsRequest(
                    SettingsRequest.builder()
                        .name("HubPhone")
                        .url("https://www.example.com/hubspot/iframe")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SettingCreateParams.builder()
                .appId(0)
                .settingsRequest(
                    SettingsRequest.builder()
                        .name("HubPhone")
                        .url("https://www.example.com/hubspot/iframe")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SettingsRequest.builder()
                    .name("HubPhone")
                    .url("https://www.example.com/hubspot/iframe")
                    .build()
            )
    }
}
