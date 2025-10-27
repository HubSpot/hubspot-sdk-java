// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingsRequestTest {

    @Test
    fun create() {
        val settingsRequest =
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

        assertThat(settingsRequest.name()).isEqualTo("HubPhone")
        assertThat(settingsRequest.url()).isEqualTo("https://www.example.com/hubspot/iframe")
        assertThat(settingsRequest.height()).contains(350)
        assertThat(settingsRequest.isReady()).contains(true)
        assertThat(settingsRequest.supportsCustomObjects()).contains(true)
        assertThat(settingsRequest.supportsInboundCalling()).contains(true)
        assertThat(settingsRequest.usesCallingWindow()).contains(true)
        assertThat(settingsRequest.usesRemote()).contains(true)
        assertThat(settingsRequest.width()).contains(200)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val settingsRequest =
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

        val roundtrippedSettingsRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(settingsRequest),
                jacksonTypeRef<SettingsRequest>(),
            )

        assertThat(roundtrippedSettingsRequest).isEqualTo(settingsRequest)
    }
}
