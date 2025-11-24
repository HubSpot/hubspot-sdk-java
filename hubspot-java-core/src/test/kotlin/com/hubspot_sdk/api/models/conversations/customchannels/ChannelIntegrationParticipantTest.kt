// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelIntegrationParticipantTest {

    @Test
    fun create() {
        val channelIntegrationParticipant =
            ChannelIntegrationParticipant.builder()
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder().type("type").value("value").build()
                )
                .name("name")
                .build()

        assertThat(channelIntegrationParticipant.deliveryIdentifier())
            .isEqualTo(PublicDeliveryIdentifier.builder().type("type").value("value").build())
        assertThat(channelIntegrationParticipant.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val channelIntegrationParticipant =
            ChannelIntegrationParticipant.builder()
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder().type("type").value("value").build()
                )
                .name("name")
                .build()

        val roundtrippedChannelIntegrationParticipant =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(channelIntegrationParticipant),
                jacksonTypeRef<ChannelIntegrationParticipant>(),
            )

        assertThat(roundtrippedChannelIntegrationParticipant)
            .isEqualTo(channelIntegrationParticipant)
    }
}
