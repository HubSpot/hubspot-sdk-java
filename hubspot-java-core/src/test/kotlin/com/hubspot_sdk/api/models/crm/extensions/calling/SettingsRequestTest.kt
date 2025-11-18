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

        assertThat(settingsRequest.height()).isEqualTo(0)
        assertThat(settingsRequest.isReady()).isEqualTo(true)
        assertThat(settingsRequest.name()).isEqualTo("name")
        assertThat(settingsRequest.supportsCustomObjects()).isEqualTo(true)
        assertThat(settingsRequest.supportsInboundCalling()).isEqualTo(true)
        assertThat(settingsRequest.url()).isEqualTo("url")
        assertThat(settingsRequest.usesCallingWindow()).isEqualTo(true)
        assertThat(settingsRequest.usesRemote()).isEqualTo(true)
        assertThat(settingsRequest.width()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val settingsRequest =
            SettingsRequest.builder()
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

        val roundtrippedSettingsRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(settingsRequest),
                jacksonTypeRef<SettingsRequest>(),
            )

        assertThat(roundtrippedSettingsRequest).isEqualTo(settingsRequest)
    }
}
