// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels.messages

import com.hubspot_sdk.api.models.conversations.customchannels.ChannelIntegrationMessageEgg
import com.hubspot_sdk.api.models.conversations.customchannels.ChannelIntegrationParticipant
import com.hubspot_sdk.api.models.conversations.customchannels.FileAttachment
import com.hubspot_sdk.api.models.conversations.customchannels.PreResolvedContact
import com.hubspot_sdk.api.models.conversations.customchannels.PreResolvedContacts
import com.hubspot_sdk.api.models.conversations.customchannels.PublicDeliveryIdentifier
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
                            .fileUsageType(FileAttachment.FileUsageType.AUDIO)
                            .build()
                    )
                    .channelAccountId("channelAccountId")
                    .messageDirection(ChannelIntegrationMessageEgg.MessageDirection.INCOMING)
                    .addRecipient(
                        ChannelIntegrationParticipant.builder()
                            .deliveryIdentifier(
                                PublicDeliveryIdentifier.builder()
                                    .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                                    .value("value")
                                    .build()
                            )
                            .name("name")
                            .senderActorId("senderActorId")
                            .build()
                    )
                    .addSender(
                        ChannelIntegrationParticipant.builder()
                            .deliveryIdentifier(
                                PublicDeliveryIdentifier.builder()
                                    .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                                    .value("value")
                                    .build()
                            )
                            .name("name")
                            .senderActorId("senderActorId")
                            .build()
                    )
                    .text("text")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .associateWithContactId(0L)
                    .inReplyToId("inReplyToId")
                    .integrationIdempotencyId("integrationIdempotencyId")
                    .integrationThreadId("integrationThreadId")
                    .preResolvedContacts(
                        PreResolvedContacts.builder()
                            .addContact(
                                PreResolvedContact.builder()
                                    .addContactPropertiesLeadingToMatch(
                                        PreResolvedContact.ContactPropertiesLeadingToMatch.ADDRESS
                                    )
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
                                        .type(
                                            PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID
                                        )
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .addSender(
                            ChannelIntegrationParticipant.builder()
                                .deliveryIdentifier(
                                    PublicDeliveryIdentifier.builder()
                                        .type(
                                            PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID
                                        )
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
                                .fileUsageType(FileAttachment.FileUsageType.AUDIO)
                                .build()
                        )
                        .channelAccountId("channelAccountId")
                        .messageDirection(ChannelIntegrationMessageEgg.MessageDirection.INCOMING)
                        .addRecipient(
                            ChannelIntegrationParticipant.builder()
                                .deliveryIdentifier(
                                    PublicDeliveryIdentifier.builder()
                                        .type(
                                            PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID
                                        )
                                        .value("value")
                                        .build()
                                )
                                .name("name")
                                .senderActorId("senderActorId")
                                .build()
                        )
                        .addSender(
                            ChannelIntegrationParticipant.builder()
                                .deliveryIdentifier(
                                    PublicDeliveryIdentifier.builder()
                                        .type(
                                            PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID
                                        )
                                        .value("value")
                                        .build()
                                )
                                .name("name")
                                .senderActorId("senderActorId")
                                .build()
                        )
                        .text("text")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .associateWithContactId(0L)
                        .inReplyToId("inReplyToId")
                        .integrationIdempotencyId("integrationIdempotencyId")
                        .integrationThreadId("integrationThreadId")
                        .preResolvedContacts(
                            PreResolvedContacts.builder()
                                .addContact(
                                    PreResolvedContact.builder()
                                        .addContactPropertiesLeadingToMatch(
                                            PreResolvedContact.ContactPropertiesLeadingToMatch
                                                .ADDRESS
                                        )
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
                            .fileUsageType(FileAttachment.FileUsageType.AUDIO)
                            .build()
                    )
                    .channelAccountId("channelAccountId")
                    .messageDirection(ChannelIntegrationMessageEgg.MessageDirection.INCOMING)
                    .addRecipient(
                        ChannelIntegrationParticipant.builder()
                            .deliveryIdentifier(
                                PublicDeliveryIdentifier.builder()
                                    .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                                    .value("value")
                                    .build()
                            )
                            .name("name")
                            .senderActorId("senderActorId")
                            .build()
                    )
                    .addSender(
                        ChannelIntegrationParticipant.builder()
                            .deliveryIdentifier(
                                PublicDeliveryIdentifier.builder()
                                    .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                                    .value("value")
                                    .build()
                            )
                            .name("name")
                            .senderActorId("senderActorId")
                            .build()
                    )
                    .text("text")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .associateWithContactId(0L)
                    .inReplyToId("inReplyToId")
                    .integrationIdempotencyId("integrationIdempotencyId")
                    .integrationThreadId("integrationThreadId")
                    .preResolvedContacts(
                        PreResolvedContacts.builder()
                            .addContact(
                                PreResolvedContact.builder()
                                    .addContactPropertiesLeadingToMatch(
                                        PreResolvedContact.ContactPropertiesLeadingToMatch.ADDRESS
                                    )
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
                                        .type(
                                            PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID
                                        )
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .addSender(
                            ChannelIntegrationParticipant.builder()
                                .deliveryIdentifier(
                                    PublicDeliveryIdentifier.builder()
                                        .type(
                                            PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID
                                        )
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
                                    .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                                    .value("value")
                                    .build()
                            )
                            .build()
                    )
                    .addSender(
                        ChannelIntegrationParticipant.builder()
                            .deliveryIdentifier(
                                PublicDeliveryIdentifier.builder()
                                    .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
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
