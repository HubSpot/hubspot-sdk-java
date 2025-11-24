// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicRecipientEggTest {

    @Test
    fun create() {
        val publicRecipientEgg =
            PublicRecipientEgg.builder()
                .addDeliveryIdentifier(
                    PublicDeliveryIdentifier.builder().type("type").value("value").build()
                )
                .actorId("actorId")
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder().type("type").value("value").build()
                )
                .name("name")
                .recipientField("recipientField")
                .build()

        assertThat(publicRecipientEgg.deliveryIdentifiers())
            .containsExactly(PublicDeliveryIdentifier.builder().type("type").value("value").build())
        assertThat(publicRecipientEgg.actorId()).contains("actorId")
        assertThat(publicRecipientEgg.deliveryIdentifier())
            .contains(PublicDeliveryIdentifier.builder().type("type").value("value").build())
        assertThat(publicRecipientEgg.name()).contains("name")
        assertThat(publicRecipientEgg.recipientField()).contains("recipientField")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicRecipientEgg =
            PublicRecipientEgg.builder()
                .addDeliveryIdentifier(
                    PublicDeliveryIdentifier.builder().type("type").value("value").build()
                )
                .actorId("actorId")
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder().type("type").value("value").build()
                )
                .name("name")
                .recipientField("recipientField")
                .build()

        val roundtrippedPublicRecipientEgg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicRecipientEgg),
                jacksonTypeRef<PublicRecipientEgg>(),
            )

        assertThat(roundtrippedPublicRecipientEgg).isEqualTo(publicRecipientEgg)
    }
}
