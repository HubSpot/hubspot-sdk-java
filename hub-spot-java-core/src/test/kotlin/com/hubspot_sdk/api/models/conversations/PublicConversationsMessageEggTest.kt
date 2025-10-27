// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicConversationsMessageEggTest {

    @Test
    fun create() {
        val publicConversationsMessageEgg =
            PublicConversationsMessageEgg.builder()
                .addAttachment(
                    PublicFileEgg.builder().fileId("fileId").type(PublicFileEgg.Type.FILE).build()
                )
                .channelAccountId("channelAccountId")
                .channelId("channelId")
                .addRecipient(
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
                )
                .senderActorId("senderActorId")
                .text("text")
                .type(PublicConversationsMessageEgg.Type.MESSAGE)
                .richText("richText")
                .subject("subject")
                .build()

        assertThat(publicConversationsMessageEgg.attachments())
            .containsExactly(
                PublicConversationsMessageEgg.Attachment.ofPublicFileEgg(
                    PublicFileEgg.builder().fileId("fileId").type(PublicFileEgg.Type.FILE).build()
                )
            )
        assertThat(publicConversationsMessageEgg.channelAccountId()).isEqualTo("channelAccountId")
        assertThat(publicConversationsMessageEgg.channelId()).isEqualTo("channelId")
        assertThat(publicConversationsMessageEgg.recipients())
            .containsExactly(
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
            )
        assertThat(publicConversationsMessageEgg.senderActorId()).isEqualTo("senderActorId")
        assertThat(publicConversationsMessageEgg.text()).isEqualTo("text")
        assertThat(publicConversationsMessageEgg.type())
            .isEqualTo(PublicConversationsMessageEgg.Type.MESSAGE)
        assertThat(publicConversationsMessageEgg.richText()).contains("richText")
        assertThat(publicConversationsMessageEgg.subject()).contains("subject")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicConversationsMessageEgg =
            PublicConversationsMessageEgg.builder()
                .addAttachment(
                    PublicFileEgg.builder().fileId("fileId").type(PublicFileEgg.Type.FILE).build()
                )
                .channelAccountId("channelAccountId")
                .channelId("channelId")
                .addRecipient(
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
                )
                .senderActorId("senderActorId")
                .text("text")
                .type(PublicConversationsMessageEgg.Type.MESSAGE)
                .richText("richText")
                .subject("subject")
                .build()

        val roundtrippedPublicConversationsMessageEgg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicConversationsMessageEgg),
                jacksonTypeRef<PublicConversationsMessageEgg>(),
            )

        assertThat(roundtrippedPublicConversationsMessageEgg)
            .isEqualTo(publicConversationsMessageEgg)
    }
}
