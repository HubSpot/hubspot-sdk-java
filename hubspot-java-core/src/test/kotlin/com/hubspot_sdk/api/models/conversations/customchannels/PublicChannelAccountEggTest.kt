// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicChannelAccountEggTest {

    @Test
    fun create() {
        val publicChannelAccountEgg =
            PublicChannelAccountEgg.builder()
                .authorized(true)
                .inboxId("inboxId")
                .name("name")
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder()
                        .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                        .value("value")
                        .build()
                )
                .build()

        assertThat(publicChannelAccountEgg.authorized()).isEqualTo(true)
        assertThat(publicChannelAccountEgg.inboxId()).isEqualTo("inboxId")
        assertThat(publicChannelAccountEgg.name()).isEqualTo("name")
        assertThat(publicChannelAccountEgg.deliveryIdentifier())
            .contains(
                PublicDeliveryIdentifier.builder()
                    .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                    .value("value")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicChannelAccountEgg =
            PublicChannelAccountEgg.builder()
                .authorized(true)
                .inboxId("inboxId")
                .name("name")
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder()
                        .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                        .value("value")
                        .build()
                )
                .build()

        val roundtrippedPublicChannelAccountEgg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicChannelAccountEgg),
                jacksonTypeRef<PublicChannelAccountEgg>(),
            )

        assertThat(roundtrippedPublicChannelAccountEgg).isEqualTo(publicChannelAccountEgg)
    }
}
