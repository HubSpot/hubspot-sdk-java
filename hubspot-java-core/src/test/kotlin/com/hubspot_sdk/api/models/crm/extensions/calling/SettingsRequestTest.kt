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

        assertThat(settingsRequest.name()).isEqualTo("name")
        assertThat(settingsRequest.url()).isEqualTo("url")
        assertThat(settingsRequest.height()).contains(0)
        assertThat(settingsRequest.isReady()).contains(true)
        assertThat(settingsRequest.supportsCustomObjects()).contains(true)
        assertThat(settingsRequest.supportsInboundCalling()).contains(true)
        assertThat(settingsRequest.usesCallingWindow()).contains(true)
        assertThat(settingsRequest.usesRemote()).contains(true)
        assertThat(settingsRequest.width()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val settingsRequest =
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

        val roundtrippedSettingsRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(settingsRequest),
                jacksonTypeRef<SettingsRequest>(),
            )

        assertThat(roundtrippedSettingsRequest).isEqualTo(settingsRequest)
    }
}
