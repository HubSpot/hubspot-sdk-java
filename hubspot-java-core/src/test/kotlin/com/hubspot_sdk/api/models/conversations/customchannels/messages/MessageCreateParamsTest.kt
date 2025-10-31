// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels.messages

import com.hubspot_sdk.api.models.conversations.PublicDeliveryIdentifier
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageCreateParamsTest {

    @Test
    fun create() {
        MessageCreateParams.builder()
            .channelId("channelId")
            .addAttachment(
                MessageCreateParams.Attachment.ConversationsCustomchannelsFileAttachment.builder()
                    .fileId("fileId")
                    .type(
                        MessageCreateParams.Attachment.ConversationsCustomchannelsFileAttachment
                            .Type
                            .FILE
                    )
                    .fileUsageType("fileUsageType")
                    .build()
            )
            .channelAccountId("channelAccountId")
            .integrationThreadId("integrationThreadId")
            .messageDirection(MessageCreateParams.MessageDirection.INCOMING)
            .addRecipient(
                MessageCreateParams.Recipient.builder()
                    .deliveryIdentifier(
                        PublicDeliveryIdentifier.builder().type("type").value("value").build()
                    )
                    .name("name")
                    .build()
            )
            .addSender(
                MessageCreateParams.Sender.builder()
                    .deliveryIdentifier(
                        PublicDeliveryIdentifier.builder().type("type").value("value").build()
                    )
                    .name("name")
                    .build()
            )
            .text("text")
            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .inReplyToId("inReplyToId")
            .integrationIdempotencyId("integrationIdempotencyId")
            .preResolvedContacts(
                MessageCreateParams.PreResolvedContacts.builder()
                    .addContact(
                        MessageCreateParams.PreResolvedContacts.Contact.builder()
                            .addContactPropertiesLeadingToMatch("string")
                            .contactVid(0)
                            .build()
                    )
                    .build()
            )
            .richText("richText")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MessageCreateParams.builder()
                .channelId("channelId")
                .addAttachment(
                    MessageCreateParams.Attachment.ConversationsCustomchannelsFileAttachment
                        .builder()
                        .fileId("fileId")
                        .type(
                            MessageCreateParams.Attachment.ConversationsCustomchannelsFileAttachment
                                .Type
                                .FILE
                        )
                        .build()
                )
                .channelAccountId("channelAccountId")
                .integrationThreadId("integrationThreadId")
                .messageDirection(MessageCreateParams.MessageDirection.INCOMING)
                .addRecipient(
                    MessageCreateParams.Recipient.builder()
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .build()
                )
                .addSender(
                    MessageCreateParams.Sender.builder()
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .build()
                )
                .text("text")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("channelId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MessageCreateParams.builder()
                .channelId("channelId")
                .addAttachment(
                    MessageCreateParams.Attachment.ConversationsCustomchannelsFileAttachment
                        .builder()
                        .fileId("fileId")
                        .type(
                            MessageCreateParams.Attachment.ConversationsCustomchannelsFileAttachment
                                .Type
                                .FILE
                        )
                        .fileUsageType("fileUsageType")
                        .build()
                )
                .channelAccountId("channelAccountId")
                .integrationThreadId("integrationThreadId")
                .messageDirection(MessageCreateParams.MessageDirection.INCOMING)
                .addRecipient(
                    MessageCreateParams.Recipient.builder()
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .name("name")
                        .build()
                )
                .addSender(
                    MessageCreateParams.Sender.builder()
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .name("name")
                        .build()
                )
                .text("text")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .inReplyToId("inReplyToId")
                .integrationIdempotencyId("integrationIdempotencyId")
                .preResolvedContacts(
                    MessageCreateParams.PreResolvedContacts.builder()
                        .addContact(
                            MessageCreateParams.PreResolvedContacts.Contact.builder()
                                .addContactPropertiesLeadingToMatch("string")
                                .contactVid(0)
                                .build()
                        )
                        .build()
                )
                .richText("richText")
                .build()

        val body = params._body()

        assertThat(body.attachments())
            .containsExactly(
                MessageCreateParams.Attachment.ofConversationsCustomchannelsFile(
                    MessageCreateParams.Attachment.ConversationsCustomchannelsFileAttachment
                        .builder()
                        .fileId("fileId")
                        .type(
                            MessageCreateParams.Attachment.ConversationsCustomchannelsFileAttachment
                                .Type
                                .FILE
                        )
                        .fileUsageType("fileUsageType")
                        .build()
                )
            )
        assertThat(body.channelAccountId()).isEqualTo("channelAccountId")
        assertThat(body.integrationThreadId()).isEqualTo("integrationThreadId")
        assertThat(body.messageDirection()).isEqualTo(MessageCreateParams.MessageDirection.INCOMING)
        assertThat(body.recipients())
            .containsExactly(
                MessageCreateParams.Recipient.builder()
                    .deliveryIdentifier(
                        PublicDeliveryIdentifier.builder().type("type").value("value").build()
                    )
                    .name("name")
                    .build()
            )
        assertThat(body.senders())
            .containsExactly(
                MessageCreateParams.Sender.builder()
                    .deliveryIdentifier(
                        PublicDeliveryIdentifier.builder().type("type").value("value").build()
                    )
                    .name("name")
                    .build()
            )
        assertThat(body.text()).isEqualTo("text")
        assertThat(body.timestamp()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.inReplyToId()).contains("inReplyToId")
        assertThat(body.integrationIdempotencyId()).contains("integrationIdempotencyId")
        assertThat(body.preResolvedContacts())
            .contains(
                MessageCreateParams.PreResolvedContacts.builder()
                    .addContact(
                        MessageCreateParams.PreResolvedContacts.Contact.builder()
                            .addContactPropertiesLeadingToMatch("string")
                            .contactVid(0)
                            .build()
                    )
                    .build()
            )
        assertThat(body.richText()).contains("richText")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MessageCreateParams.builder()
                .channelId("channelId")
                .addAttachment(
                    MessageCreateParams.Attachment.ConversationsCustomchannelsFileAttachment
                        .builder()
                        .fileId("fileId")
                        .type(
                            MessageCreateParams.Attachment.ConversationsCustomchannelsFileAttachment
                                .Type
                                .FILE
                        )
                        .build()
                )
                .channelAccountId("channelAccountId")
                .integrationThreadId("integrationThreadId")
                .messageDirection(MessageCreateParams.MessageDirection.INCOMING)
                .addRecipient(
                    MessageCreateParams.Recipient.builder()
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .build()
                )
                .addSender(
                    MessageCreateParams.Sender.builder()
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .build()
                )
                .text("text")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.attachments())
            .containsExactly(
                MessageCreateParams.Attachment.ofConversationsCustomchannelsFile(
                    MessageCreateParams.Attachment.ConversationsCustomchannelsFileAttachment
                        .builder()
                        .fileId("fileId")
                        .type(
                            MessageCreateParams.Attachment.ConversationsCustomchannelsFileAttachment
                                .Type
                                .FILE
                        )
                        .build()
                )
            )
        assertThat(body.channelAccountId()).isEqualTo("channelAccountId")
        assertThat(body.integrationThreadId()).isEqualTo("integrationThreadId")
        assertThat(body.messageDirection()).isEqualTo(MessageCreateParams.MessageDirection.INCOMING)
        assertThat(body.recipients())
            .containsExactly(
                MessageCreateParams.Recipient.builder()
                    .deliveryIdentifier(
                        PublicDeliveryIdentifier.builder().type("type").value("value").build()
                    )
                    .build()
            )
        assertThat(body.senders())
            .containsExactly(
                MessageCreateParams.Sender.builder()
                    .deliveryIdentifier(
                        PublicDeliveryIdentifier.builder().type("type").value("value").build()
                    )
                    .build()
            )
        assertThat(body.text()).isEqualTo("text")
        assertThat(body.timestamp()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
