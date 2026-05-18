// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelIntegrationMessageEggTest {

    @Test
    fun create() {
        val channelIntegrationMessageEgg =
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
                                .contactVid(0L)
                                .build()
                        )
                        .build()
                )
                .richText("richText")
                .build()

        assertThat(channelIntegrationMessageEgg.attachments())
            .containsExactly(
                ChannelIntegrationMessageEgg.Attachment.ofFile(
                    FileAttachment.builder()
                        .fileId("fileId")
                        .type(FileAttachment.Type.FILE)
                        .fileUsageType(FileAttachment.FileUsageType.AUDIO)
                        .build()
                )
            )
        assertThat(channelIntegrationMessageEgg.channelAccountId()).isEqualTo("channelAccountId")
        assertThat(channelIntegrationMessageEgg.messageDirection())
            .isEqualTo(ChannelIntegrationMessageEgg.MessageDirection.INCOMING)
        assertThat(channelIntegrationMessageEgg.recipients())
            .containsExactly(
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
        assertThat(channelIntegrationMessageEgg.senders())
            .containsExactly(
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
        assertThat(channelIntegrationMessageEgg.text()).isEqualTo("text")
        assertThat(channelIntegrationMessageEgg.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(channelIntegrationMessageEgg.associateWithContactId()).contains(0L)
        assertThat(channelIntegrationMessageEgg.inReplyToId()).contains("inReplyToId")
        assertThat(channelIntegrationMessageEgg.integrationIdempotencyId())
            .contains("integrationIdempotencyId")
        assertThat(channelIntegrationMessageEgg.integrationThreadId())
            .contains("integrationThreadId")
        assertThat(channelIntegrationMessageEgg.preResolvedContacts())
            .contains(
                PreResolvedContacts.builder()
                    .addContact(
                        PreResolvedContact.builder()
                            .addContactPropertiesLeadingToMatch(
                                PreResolvedContact.ContactPropertiesLeadingToMatch.ADDRESS
                            )
                            .contactVid(0L)
                            .build()
                    )
                    .build()
            )
        assertThat(channelIntegrationMessageEgg.richText()).contains("richText")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val channelIntegrationMessageEgg =
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
                                .contactVid(0L)
                                .build()
                        )
                        .build()
                )
                .richText("richText")
                .build()

        val roundtrippedChannelIntegrationMessageEgg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(channelIntegrationMessageEgg),
                jacksonTypeRef<ChannelIntegrationMessageEgg>(),
            )

        assertThat(roundtrippedChannelIntegrationMessageEgg).isEqualTo(channelIntegrationMessageEgg)
    }
}
