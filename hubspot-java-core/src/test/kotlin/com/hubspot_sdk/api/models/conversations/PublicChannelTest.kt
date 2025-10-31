// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicChannelTest {

    @Test
    fun create() {
        val publicChannel = PublicChannel.builder().id("id").name("name").build()

        assertThat(publicChannel.id()).contains("id")
        assertThat(publicChannel.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicChannel = PublicChannel.builder().id("id").name("name").build()

        val roundtrippedPublicChannel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicChannel),
                jacksonTypeRef<PublicChannel>(),
            )

        assertThat(roundtrippedPublicChannel).isEqualTo(publicChannel)
    }
}
