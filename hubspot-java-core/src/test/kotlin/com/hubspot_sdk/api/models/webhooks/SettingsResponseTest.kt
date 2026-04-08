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
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .targetUrl("targetUrl")
                .throttling(ThrottlingSettings.builder().maxConcurrentRequests(0).build())
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(settingsResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(settingsResponse.targetUrl()).isEqualTo("targetUrl")
        assertThat(settingsResponse.throttling())
            .isEqualTo(ThrottlingSettings.builder().maxConcurrentRequests(0).build())
        assertThat(settingsResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val settingsResponse =
            SettingsResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .targetUrl("targetUrl")
                .throttling(ThrottlingSettings.builder().maxConcurrentRequests(0).build())
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedSettingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(settingsResponse),
                jacksonTypeRef<SettingsResponse>(),
            )

        assertThat(roundtrippedSettingsResponse).isEqualTo(settingsResponse)
    }
}
