// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicWelcomeMessageTest {

    @Test
    fun create() {
        val publicWelcomeMessage =
            PublicWelcomeMessage.builder()
                .id("id")
                .archived(true)
                .channelAccountId("channelAccountId")
                .channelId("channelId")
                .client(
                    PublicClient.builder()
                        .clientType(PublicClient.ClientType.HUBSPOT)
                        .integrationAppId(0)
                        .build()
                )
                .conversationsThreadId("conversationsThreadId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("createdBy")
                .addRecipient(
                    PublicRecipient.builder()
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .actorId("actorId")
                        .name("name")
                        .recipientField("recipientField")
                        .build()
                )
                .addSender(
                    PublicSender.builder()
                        .actorId("actorId")
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .name("name")
                        .senderField("senderField")
                        .build()
                )
                .text("text")
                .type(PublicWelcomeMessage.Type.WELCOME_MESSAGE)
                .richText("richText")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(publicWelcomeMessage.id()).isEqualTo("id")
        assertThat(publicWelcomeMessage.archived()).isEqualTo(true)
        assertThat(publicWelcomeMessage.channelAccountId()).isEqualTo("channelAccountId")
        assertThat(publicWelcomeMessage.channelId()).isEqualTo("channelId")
        assertThat(publicWelcomeMessage.client())
            .isEqualTo(
                PublicClient.builder()
                    .clientType(PublicClient.ClientType.HUBSPOT)
                    .integrationAppId(0)
                    .build()
            )
        assertThat(publicWelcomeMessage.conversationsThreadId()).isEqualTo("conversationsThreadId")
        assertThat(publicWelcomeMessage.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicWelcomeMessage.createdBy()).isEqualTo("createdBy")
        assertThat(publicWelcomeMessage.recipients())
            .containsExactly(
                PublicRecipient.builder()
                    .deliveryIdentifier(
                        PublicDeliveryIdentifier.builder().type("type").value("value").build()
                    )
                    .actorId("actorId")
                    .name("name")
                    .recipientField("recipientField")
                    .build()
            )
        assertThat(publicWelcomeMessage.senders())
            .containsExactly(
                PublicSender.builder()
                    .actorId("actorId")
                    .deliveryIdentifier(
                        PublicDeliveryIdentifier.builder().type("type").value("value").build()
                    )
                    .name("name")
                    .senderField("senderField")
                    .build()
            )
        assertThat(publicWelcomeMessage.text()).isEqualTo("text")
        assertThat(publicWelcomeMessage.type()).isEqualTo(PublicWelcomeMessage.Type.WELCOME_MESSAGE)
        assertThat(publicWelcomeMessage.richText()).contains("richText")
        assertThat(publicWelcomeMessage.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicWelcomeMessage =
            PublicWelcomeMessage.builder()
                .id("id")
                .archived(true)
                .channelAccountId("channelAccountId")
                .channelId("channelId")
                .client(
                    PublicClient.builder()
                        .clientType(PublicClient.ClientType.HUBSPOT)
                        .integrationAppId(0)
                        .build()
                )
                .conversationsThreadId("conversationsThreadId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("createdBy")
                .addRecipient(
                    PublicRecipient.builder()
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .actorId("actorId")
                        .name("name")
                        .recipientField("recipientField")
                        .build()
                )
                .addSender(
                    PublicSender.builder()
                        .actorId("actorId")
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .name("name")
                        .senderField("senderField")
                        .build()
                )
                .text("text")
                .type(PublicWelcomeMessage.Type.WELCOME_MESSAGE)
                .richText("richText")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPublicWelcomeMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicWelcomeMessage),
                jacksonTypeRef<PublicWelcomeMessage>(),
            )

        assertThat(roundtrippedPublicWelcomeMessage).isEqualTo(publicWelcomeMessage)
    }
}
