// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelIntegrationParticipantTest {

    @Test
    fun create() {
        val channelIntegrationParticipant =
            ChannelIntegrationParticipant.builder()
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder()
                        .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                        .value("value")
                        .build()
                )
                .name("name")
                .senderActorId("senderActorId")
                .build()

        assertThat(channelIntegrationParticipant.deliveryIdentifier())
            .isEqualTo(
                PublicDeliveryIdentifier.builder()
                    .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                    .value("value")
                    .build()
            )
        assertThat(channelIntegrationParticipant.name()).contains("name")
        assertThat(channelIntegrationParticipant.senderActorId()).contains("senderActorId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val channelIntegrationParticipant =
            ChannelIntegrationParticipant.builder()
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder()
                        .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                        .value("value")
                        .build()
                )
                .name("name")
                .senderActorId("senderActorId")
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
