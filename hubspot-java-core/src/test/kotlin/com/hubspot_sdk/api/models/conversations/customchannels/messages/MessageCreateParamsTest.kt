// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels.messages

import com.hubspot_sdk.api.models.conversations.PublicDeliveryIdentifier
import com.hubspot_sdk.api.models.conversations.customchannels.ChannelIntegrationMessageEgg
import com.hubspot_sdk.api.models.conversations.customchannels.ChannelIntegrationParticipant
import com.hubspot_sdk.api.models.conversations.customchannels.FileAttachment
import com.hubspot_sdk.api.models.conversations.customchannels.PreResolvedContact
import com.hubspot_sdk.api.models.conversations.customchannels.PreResolvedContacts
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageCreateParamsTest {

    @Test
    fun create() {
        MessageCreateParams.builder()
            .channelId(0)
            .channelIntegrationMessageEgg(
                ChannelIntegrationMessageEgg.builder()
                    .addAttachment(
                        FileAttachment.builder()
                            .fileId("fileId")
                            .type(FileAttachment.Type.FILE)
                            .fileUsageType("fileUsageType")
                            .build()
                    )
                    .channelAccountId("channelAccountId")
                    .messageDirection(ChannelIntegrationMessageEgg.MessageDirection.INCOMING)
                    .addRecipient(
                        ChannelIntegrationParticipant.builder()
                            .deliveryIdentifier(
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .name("name")
                            .build()
                    )
                    .addSender(
                        ChannelIntegrationParticipant.builder()
                            .deliveryIdentifier(
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .name("name")
                            .build()
                    )
                    .text("text")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .inReplyToId("inReplyToId")
                    .integrationIdempotencyId("integrationIdempotencyId")
                    .integrationThreadId("integrationThreadId")
                    .preResolvedContacts(
                        PreResolvedContacts.builder()
                            .addContact(
                                PreResolvedContact.builder()
                                    .addContactPropertiesLeadingToMatch("string")
                                    .contactVid(0)
                                    .build()
                            )
                            .build()
                    )
                    .richText("richText")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MessageCreateParams.builder()
                .channelId(0)
                .channelIntegrationMessageEgg(
                    ChannelIntegrationMessageEgg.builder()
                        .addAttachment(
                            FileAttachment.builder()
                                .fileId("fileId")
                                .type(FileAttachment.Type.FILE)
                                .build()
                        )
                        .channelAccountId("channelAccountId")
                        .messageDirection(ChannelIntegrationMessageEgg.MessageDirection.INCOMING)
                        .addRecipient(
                            ChannelIntegrationParticipant.builder()
                                .deliveryIdentifier(
                                    PublicDeliveryIdentifier.builder()
                                        .type("type")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .addSender(
                            ChannelIntegrationParticipant.builder()
                                .deliveryIdentifier(
                                    PublicDeliveryIdentifier.builder()
                                        .type("type")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .text("text")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MessageCreateParams.builder()
                .channelId(0)
                .channelIntegrationMessageEgg(
                    ChannelIntegrationMessageEgg.builder()
                        .addAttachment(
                            FileAttachment.builder()
                                .fileId("fileId")
                                .type(FileAttachment.Type.FILE)
                                .fileUsageType("fileUsageType")
                                .build()
                        )
                        .channelAccountId("channelAccountId")
                        .messageDirection(ChannelIntegrationMessageEgg.MessageDirection.INCOMING)
                        .addRecipient(
                            ChannelIntegrationParticipant.builder()
                                .deliveryIdentifier(
                                    PublicDeliveryIdentifier.builder()
                                        .type("type")
                                        .value("value")
                                        .build()
                                )
                                .name("name")
                                .build()
                        )
                        .addSender(
                            ChannelIntegrationParticipant.builder()
                                .deliveryIdentifier(
                                    PublicDeliveryIdentifier.builder()
                                        .type("type")
                                        .value("value")
                                        .build()
                                )
                                .name("name")
                                .build()
                        )
                        .text("text")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .inReplyToId("inReplyToId")
                        .integrationIdempotencyId("integrationIdempotencyId")
                        .integrationThreadId("integrationThreadId")
                        .preResolvedContacts(
                            PreResolvedContacts.builder()
                                .addContact(
                                    PreResolvedContact.builder()
                                        .addContactPropertiesLeadingToMatch("string")
                                        .contactVid(0)
                                        .build()
                                )
                                .build()
                        )
                        .richText("richText")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ChannelIntegrationMessageEgg.builder()
                    .addAttachment(
                        FileAttachment.builder()
                            .fileId("fileId")
                            .type(FileAttachment.Type.FILE)
                            .fileUsageType("fileUsageType")
                            .build()
                    )
                    .channelAccountId("channelAccountId")
                    .messageDirection(ChannelIntegrationMessageEgg.MessageDirection.INCOMING)
                    .addRecipient(
                        ChannelIntegrationParticipant.builder()
                            .deliveryIdentifier(
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .name("name")
                            .build()
                    )
                    .addSender(
                        ChannelIntegrationParticipant.builder()
                            .deliveryIdentifier(
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .name("name")
                            .build()
                    )
                    .text("text")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .inReplyToId("inReplyToId")
                    .integrationIdempotencyId("integrationIdempotencyId")
                    .integrationThreadId("integrationThreadId")
                    .preResolvedContacts(
                        PreResolvedContacts.builder()
                            .addContact(
                                PreResolvedContact.builder()
                                    .addContactPropertiesLeadingToMatch("string")
                                    .contactVid(0)
                                    .build()
                            )
                            .build()
                    )
                    .richText("richText")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MessageCreateParams.builder()
                .channelId(0)
                .channelIntegrationMessageEgg(
                    ChannelIntegrationMessageEgg.builder()
                        .addAttachment(
                            FileAttachment.builder()
                                .fileId("fileId")
                                .type(FileAttachment.Type.FILE)
                                .build()
                        )
                        .channelAccountId("channelAccountId")
                        .messageDirection(ChannelIntegrationMessageEgg.MessageDirection.INCOMING)
                        .addRecipient(
                            ChannelIntegrationParticipant.builder()
                                .deliveryIdentifier(
                                    PublicDeliveryIdentifier.builder()
                                        .type("type")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .addSender(
                            ChannelIntegrationParticipant.builder()
                                .deliveryIdentifier(
                                    PublicDeliveryIdentifier.builder()
                                        .type("type")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .text("text")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ChannelIntegrationMessageEgg.builder()
                    .addAttachment(
                        FileAttachment.builder()
                            .fileId("fileId")
                            .type(FileAttachment.Type.FILE)
                            .build()
                    )
                    .channelAccountId("channelAccountId")
                    .messageDirection(ChannelIntegrationMessageEgg.MessageDirection.INCOMING)
                    .addRecipient(
                        ChannelIntegrationParticipant.builder()
                            .deliveryIdentifier(
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .build()
                    )
                    .addSender(
                        ChannelIntegrationParticipant.builder()
                            .deliveryIdentifier(
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .build()
                    )
                    .text("text")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }
}
