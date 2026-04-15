// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.calling

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelConnectionSettingsPatchRequestTest {

    @Test
    fun create() {
        val channelConnectionSettingsPatchRequest =
            ChannelConnectionSettingsPatchRequest.builder().isReady(true).url("url").build()

        assertThat(channelConnectionSettingsPatchRequest.isReady()).contains(true)
        assertThat(channelConnectionSettingsPatchRequest.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val channelConnectionSettingsPatchRequest =
            ChannelConnectionSettingsPatchRequest.builder().isReady(true).url("url").build()

        val roundtrippedChannelConnectionSettingsPatchRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(channelConnectionSettingsPatchRequest),
                jacksonTypeRef<ChannelConnectionSettingsPatchRequest>(),
            )

        assertThat(roundtrippedChannelConnectionSettingsPatchRequest)
            .isEqualTo(channelConnectionSettingsPatchRequest)
    }
}
