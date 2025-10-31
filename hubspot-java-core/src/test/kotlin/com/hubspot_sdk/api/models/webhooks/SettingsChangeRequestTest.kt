// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingsChangeRequestTest {

    @Test
    fun create() {
        val settingsChangeRequest =
            SettingsChangeRequest.builder()
                .targetUrl("https://www.example.com/hubspot/target")
                .throttling(ThrottlingSettings.builder().maxConcurrentRequests(10).build())
                .build()

        assertThat(settingsChangeRequest.targetUrl())
            .isEqualTo("https://www.example.com/hubspot/target")
        assertThat(settingsChangeRequest.throttling())
            .isEqualTo(ThrottlingSettings.builder().maxConcurrentRequests(10).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val settingsChangeRequest =
            SettingsChangeRequest.builder()
                .targetUrl("https://www.example.com/hubspot/target")
                .throttling(ThrottlingSettings.builder().maxConcurrentRequests(10).build())
                .build()

        val roundtrippedSettingsChangeRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(settingsChangeRequest),
                jacksonTypeRef<SettingsChangeRequest>(),
            )

        assertThat(roundtrippedSettingsChangeRequest).isEqualTo(settingsChangeRequest)
    }
}
