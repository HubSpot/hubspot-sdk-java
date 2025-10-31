// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicRecipientTest {

    @Test
    fun create() {
        val publicRecipient =
            PublicRecipient.builder()
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder().type("type").value("value").build()
                )
                .actorId("actorId")
                .name("name")
                .recipientField("recipientField")
                .build()

        assertThat(publicRecipient.deliveryIdentifier())
            .isEqualTo(PublicDeliveryIdentifier.builder().type("type").value("value").build())
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
                    PublicDeliveryIdentifier.builder().type("type").value("value").build()
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
