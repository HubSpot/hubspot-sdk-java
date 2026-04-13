// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicClientTest {

    @Test
    fun create() {
        val publicClient =
            PublicClient.builder()
                .clientType(PublicClient.ClientType.HUBSPOT)
                .integrationAppId(0)
                .build()

        assertThat(publicClient.clientType()).isEqualTo(PublicClient.ClientType.HUBSPOT)
        assertThat(publicClient.integrationAppId()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicClient =
            PublicClient.builder()
                .clientType(PublicClient.ClientType.HUBSPOT)
                .integrationAppId(0)
                .build()

        val roundtrippedPublicClient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicClient),
                jacksonTypeRef<PublicClient>(),
            )

        assertThat(roundtrippedPublicClient).isEqualTo(publicClient)
    }
}
