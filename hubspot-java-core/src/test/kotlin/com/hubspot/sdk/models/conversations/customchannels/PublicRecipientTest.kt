// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicRecipientTest {

    @Test
    fun create() {
        val publicRecipient =
            PublicRecipient.builder()
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder()
                        .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                        .value("value")
                        .build()
                )
                .actorId("actorId")
                .name("name")
                .recipientField("recipientField")
                .build()

        assertThat(publicRecipient.deliveryIdentifier())
            .isEqualTo(
                PublicDeliveryIdentifier.builder()
                    .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                    .value("value")
                    .build()
            )
        assertThat(publicRecipient.actorId()).contains("actorId")
        assertThat(publicRecipient.name()).contains("name")
        assertThat(publicRecipient.recipientField()).contains("recipientField")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicRecipient =
            PublicRecipient.builder()
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder()
                        .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                        .value("value")
                        .build()
                )
                .actorId("actorId")
                .name("name")
                .recipientField("recipientField")
                .build()

        val roundtrippedPublicRecipient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicRecipient),
                jacksonTypeRef<PublicRecipient>(),
            )

        assertThat(roundtrippedPublicRecipient).isEqualTo(publicRecipient)
    }
}
