// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicChannelAccountUpdateRequestTest {

    @Test
    fun create() {
        val publicChannelAccountUpdateRequest =
            PublicChannelAccountUpdateRequest.builder().authorized(true).name("name").build()

        assertThat(publicChannelAccountUpdateRequest.authorized()).contains(true)
        assertThat(publicChannelAccountUpdateRequest.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicChannelAccountUpdateRequest =
            PublicChannelAccountUpdateRequest.builder().authorized(true).name("name").build()

        val roundtrippedPublicChannelAccountUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicChannelAccountUpdateRequest),
                jacksonTypeRef<PublicChannelAccountUpdateRequest>(),
            )

        assertThat(roundtrippedPublicChannelAccountUpdateRequest)
            .isEqualTo(publicChannelAccountUpdateRequest)
    }
}
