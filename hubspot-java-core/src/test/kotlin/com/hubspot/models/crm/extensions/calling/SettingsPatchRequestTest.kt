// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.extensions.calling

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingsPatchRequestTest {

    @Test
    fun create() {
        val settingsPatchRequest =
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

        assertThat(settingsPatchRequest.height()).contains(0)
        assertThat(settingsPatchRequest.isReady()).contains(true)
        assertThat(settingsPatchRequest.name()).contains("name")
        assertThat(settingsPatchRequest.supportsCustomObjects()).contains(true)
        assertThat(settingsPatchRequest.supportsInboundCalling()).contains(true)
        assertThat(settingsPatchRequest.url()).contains("url")
        assertThat(settingsPatchRequest.usesCallingWindow()).contains(true)
        assertThat(settingsPatchRequest.usesRemote()).contains(true)
        assertThat(settingsPatchRequest.width()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val settingsPatchRequest =
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

        val roundtrippedSettingsPatchRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(settingsPatchRequest),
                jacksonTypeRef<SettingsPatchRequest>(),
            )

        assertThat(roundtrippedSettingsPatchRequest).isEqualTo(settingsPatchRequest)
    }
}
