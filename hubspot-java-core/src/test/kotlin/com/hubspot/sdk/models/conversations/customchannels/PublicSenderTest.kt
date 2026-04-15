// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSenderTest {

    @Test
    fun create() {
        val publicSender =
            PublicSender.builder()
                .actorId("actorId")
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder()
                        .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                        .value("value")
                        .build()
                )
                .name("name")
                .senderField("senderField")
                .build()

        assertThat(publicSender.actorId()).contains("actorId")
        assertThat(publicSender.deliveryIdentifier())
            .contains(
                PublicDeliveryIdentifier.builder()
                    .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                    .value("value")
                    .build()
            )
        assertThat(publicSender.name()).contains("name")
        assertThat(publicSender.senderField()).contains("senderField")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSender =
            PublicSender.builder()
                .actorId("actorId")
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder()
                        .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                        .value("value")
                        .build()
                )
                .name("name")
                .senderField("senderField")
                .build()

        val roundtrippedPublicSender =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSender),
                jacksonTypeRef<PublicSender>(),
            )

        assertThat(roundtrippedPublicSender).isEqualTo(publicSender)
    }
}
