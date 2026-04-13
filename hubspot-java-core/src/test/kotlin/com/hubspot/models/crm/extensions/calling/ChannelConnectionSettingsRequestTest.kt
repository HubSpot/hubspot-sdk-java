// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.extensions.calling

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelConnectionSettingsRequestTest {

    @Test
    fun create() {
        val channelConnectionSettingsRequest =
            ChannelConnectionSettingsRequest.builder().isReady(true).url("url").build()

        assertThat(channelConnectionSettingsRequest.isReady()).isEqualTo(true)
        assertThat(channelConnectionSettingsRequest.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val channelConnectionSettingsRequest =
            ChannelConnectionSettingsRequest.builder().isReady(true).url("url").build()

        val roundtrippedChannelConnectionSettingsRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(channelConnectionSettingsRequest),
                jacksonTypeRef<ChannelConnectionSettingsRequest>(),
            )

        assertThat(roundtrippedChannelConnectionSettingsRequest)
            .isEqualTo(channelConnectionSettingsRequest)
    }
}
