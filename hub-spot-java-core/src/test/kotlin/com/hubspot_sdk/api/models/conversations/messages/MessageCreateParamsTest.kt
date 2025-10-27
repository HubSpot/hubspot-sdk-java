// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.messages

import com.hubspot_sdk.api.models.conversations.PublicConversationsMessageEgg
import com.hubspot_sdk.api.models.conversations.PublicDeliveryIdentifier
import com.hubspot_sdk.api.models.conversations.PublicFileEgg
import com.hubspot_sdk.api.models.conversations.PublicMessageEgg
import com.hubspot_sdk.api.models.conversations.PublicRecipientEgg
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageCreateParamsTest {

    @Test
    fun create() {
        MessageCreateParams.builder()
            .threadId("threadId")
            .publicMessageEgg(
                PublicConversationsMessageEgg.builder()
                    .addAttachment(
                        PublicFileEgg.builder()
                            .fileId("fileId")
                            .type(PublicFileEgg.Type.FILE)
                            .build()
                    )
                    .channelAccountId("channelAccountId")
                    .channelId("channelId")
                    .addRecipient(
                        PublicRecipientEgg.builder()
                            .addDeliveryIdentifier(
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .actorId("actorId")
                            .deliveryIdentifier(
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MessageCreateParams.builder()
                .threadId("threadId")
                .publicMessageEgg(
                    PublicConversationsMessageEgg.builder()
                        .addAttachment(
                            PublicFileEgg.builder()
                                .fileId("fileId")
                                .type(PublicFileEgg.Type.FILE)
                                .build()
                        )
                        .channelAccountId("channelAccountId")
                        .channelId("channelId")
                        .addRecipient(
                            PublicRecipientEgg.builder()
                                .addDeliveryIdentifier(
                                    PublicDeliveryIdentifier.builder()
                                        .type("type")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .senderActorId("senderActorId")
                        .text("text")
                        .type(PublicConversationsMessageEgg.Type.MESSAGE)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("threadId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MessageCreateParams.builder()
                .threadId("threadId")
                .publicMessageEgg(
                    PublicConversationsMessageEgg.builder()
                        .addAttachment(
                            PublicFileEgg.builder()
                                .fileId("fileId")
                                .type(PublicFileEgg.Type.FILE)
                                .build()
                        )
                        .channelAccountId("channelAccountId")
                        .channelId("channelId")
                        .addRecipient(
                            PublicRecipientEgg.builder()
                                .addDeliveryIdentifier(
                                    PublicDeliveryIdentifier.builder()
                                        .type("type")
                                        .value("value")
                                        .build()
                                )
                                .actorId("actorId")
                                .deliveryIdentifier(
                                    PublicDeliveryIdentifier.builder()
                                        .type("type")
                                        .value("value")
                                        .build()
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicMessageEgg.ofConversations(
                    PublicConversationsMessageEgg.builder()
                        .addAttachment(
                            PublicFileEgg.builder()
                                .fileId("fileId")
                                .type(PublicFileEgg.Type.FILE)
                                .build()
                        )
                        .channelAccountId("channelAccountId")
                        .channelId("channelId")
                        .addRecipient(
                            PublicRecipientEgg.builder()
                                .addDeliveryIdentifier(
                                    PublicDeliveryIdentifier.builder()
                                        .type("type")
                                        .value("value")
                                        .build()
                                )
                                .actorId("actorId")
                                .deliveryIdentifier(
                                    PublicDeliveryIdentifier.builder()
                                        .type("type")
                                        .value("value")
                                        .build()
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
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MessageCreateParams.builder()
                .threadId("threadId")
                .publicMessageEgg(
                    PublicConversationsMessageEgg.builder()
                        .addAttachment(
                            PublicFileEgg.builder()
                                .fileId("fileId")
                                .type(PublicFileEgg.Type.FILE)
                                .build()
                        )
                        .channelAccountId("channelAccountId")
                        .channelId("channelId")
                        .addRecipient(
                            PublicRecipientEgg.builder()
                                .addDeliveryIdentifier(
                                    PublicDeliveryIdentifier.builder()
                                        .type("type")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .senderActorId("senderActorId")
                        .text("text")
                        .type(PublicConversationsMessageEgg.Type.MESSAGE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicMessageEgg.ofConversations(
                    PublicConversationsMessageEgg.builder()
                        .addAttachment(
                            PublicFileEgg.builder()
                                .fileId("fileId")
                                .type(PublicFileEgg.Type.FILE)
                                .build()
                        )
                        .channelAccountId("channelAccountId")
                        .channelId("channelId")
                        .addRecipient(
                            PublicRecipientEgg.builder()
                                .addDeliveryIdentifier(
                                    PublicDeliveryIdentifier.builder()
                                        .type("type")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .senderActorId("senderActorId")
                        .text("text")
                        .type(PublicConversationsMessageEgg.Type.MESSAGE)
                        .build()
                )
            )
    }
}
