// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingsResponseTest {

    @Test
    fun create() {
        val settingsResponse =
            SettingsResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .height(0)
                .isReady(true)
                .name("name")
                .supportsCustomObjects(true)
                .supportsInboundCalling(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .usesCallingWindow(true)
                .usesRemote(true)
                .width(0)
                .build()

        assertThat(settingsResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(settingsResponse.height()).isEqualTo(0)
        assertThat(settingsResponse.isReady()).isEqualTo(true)
        assertThat(settingsResponse.name()).isEqualTo("name")
        assertThat(settingsResponse.supportsCustomObjects()).isEqualTo(true)
        assertThat(settingsResponse.supportsInboundCalling()).isEqualTo(true)
        assertThat(settingsResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(settingsResponse.url()).isEqualTo("url")
        assertThat(settingsResponse.usesCallingWindow()).isEqualTo(true)
        assertThat(settingsResponse.usesRemote()).isEqualTo(true)
        assertThat(settingsResponse.width()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val settingsResponse =
            SettingsResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .height(0)
                .isReady(true)
                .name("name")
                .supportsCustomObjects(true)
                .supportsInboundCalling(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .usesCallingWindow(true)
                .usesRemote(true)
                .width(0)
                .build()

        val roundtrippedSettingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(settingsResponse),
                jacksonTypeRef<SettingsResponse>(),
            )

        assertThat(roundtrippedSettingsResponse).isEqualTo(settingsResponse)
    }
}
