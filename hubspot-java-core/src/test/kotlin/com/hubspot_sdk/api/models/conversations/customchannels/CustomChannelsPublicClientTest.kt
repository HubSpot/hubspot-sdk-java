// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChannelsPublicClientTest {

    @Test
    fun create() {
        val customChannelsPublicClient =
            CustomChannelsPublicClient.builder()
                .clientType(CustomChannelsPublicClient.ClientType.HUBSPOT)
                .integrationAppId(0)
                .build()

        assertThat(customChannelsPublicClient.clientType())
            .isEqualTo(CustomChannelsPublicClient.ClientType.HUBSPOT)
        assertThat(customChannelsPublicClient.integrationAppId()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customChannelsPublicClient =
            CustomChannelsPublicClient.builder()
                .clientType(CustomChannelsPublicClient.ClientType.HUBSPOT)
                .integrationAppId(0)
                .build()

        val roundtrippedCustomChannelsPublicClient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customChannelsPublicClient),
                jacksonTypeRef<CustomChannelsPublicClient>(),
            )

        assertThat(roundtrippedCustomChannelsPublicClient).isEqualTo(customChannelsPublicClient)
    }
}
