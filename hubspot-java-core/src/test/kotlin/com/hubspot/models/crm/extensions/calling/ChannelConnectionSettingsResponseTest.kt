// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.extensions.calling

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelConnectionSettingsResponseTest {

    @Test
    fun create() {
        val channelConnectionSettingsResponse =
            ChannelConnectionSettingsResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isReady(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .build()

        assertThat(channelConnectionSettingsResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(channelConnectionSettingsResponse.isReady()).isEqualTo(true)
        assertThat(channelConnectionSettingsResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(channelConnectionSettingsResponse.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val channelConnectionSettingsResponse =
            ChannelConnectionSettingsResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isReady(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .build()

        val roundtrippedChannelConnectionSettingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(channelConnectionSettingsResponse),
                jacksonTypeRef<ChannelConnectionSettingsResponse>(),
            )

        assertThat(roundtrippedChannelConnectionSettingsResponse)
            .isEqualTo(channelConnectionSettingsResponse)
    }
}
