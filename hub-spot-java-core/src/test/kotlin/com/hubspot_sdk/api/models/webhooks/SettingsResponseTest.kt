// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks

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
                .createdAt(OffsetDateTime.parse("2020-01-24T16:27:59Z"))
                .targetUrl("https://www.example.com/hubspot/target")
                .throttling(ThrottlingSettings.builder().maxConcurrentRequests(10).build())
                .updatedAt(OffsetDateTime.parse("2020-01-24T16:32:43Z"))
                .build()

        assertThat(settingsResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-24T16:27:59Z"))
        assertThat(settingsResponse.targetUrl()).isEqualTo("https://www.example.com/hubspot/target")
        assertThat(settingsResponse.throttling())
            .isEqualTo(ThrottlingSettings.builder().maxConcurrentRequests(10).build())
        assertThat(settingsResponse.updatedAt())
            .contains(OffsetDateTime.parse("2020-01-24T16:32:43Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val settingsResponse =
            SettingsResponse.builder()
                .createdAt(OffsetDateTime.parse("2020-01-24T16:27:59Z"))
                .targetUrl("https://www.example.com/hubspot/target")
                .throttling(ThrottlingSettings.builder().maxConcurrentRequests(10).build())
                .updatedAt(OffsetDateTime.parse("2020-01-24T16:32:43Z"))
                .build()

        val roundtrippedSettingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(settingsResponse),
                jacksonTypeRef<SettingsResponse>(),
            )

        assertThat(roundtrippedSettingsResponse).isEqualTo(settingsResponse)
    }
}
