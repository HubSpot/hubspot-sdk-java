// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.conversations.PublicDeliveryIdentifier
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
                        .fileUsageType("fileUsageType")
                        .build()
                )
                .channelAccountId("channelAccountId")
                .integrationThreadId("integrationThreadId")
                .messageDirection(ChannelIntegrationMessageEgg.MessageDirection.INCOMING)
                .addRecipient(
                    ChannelIntegrationParticipant.builder()
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .name("name")
                        .build()
                )
                .addSender(
                    ChannelIntegrationParticipant.builder()
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

        assertThat(channelIntegrationMessageEgg.attachments())
            .containsExactly(
                ChannelIntegrationMessageEgg.Attachment.ofFile(
                    FileAttachment.builder()
                        .fileId("fileId")
                        .type(FileAttachment.Type.FILE)
                        .fileUsageType("fileUsageType")
                        .build()
                )
            )
        assertThat(channelIntegrationMessageEgg.channelAccountId()).isEqualTo("channelAccountId")
        assertThat(channelIntegrationMessageEgg.integrationThreadId())
            .isEqualTo("integrationThreadId")
        assertThat(channelIntegrationMessageEgg.messageDirection())
            .isEqualTo(ChannelIntegrationMessageEgg.MessageDirection.INCOMING)
        assertThat(channelIntegrationMessageEgg.recipients())
            .containsExactly(
                ChannelIntegrationParticipant.builder()
                    .deliveryIdentifier(
                        PublicDeliveryIdentifier.builder().type("type").value("value").build()
                    )
                    .name("name")
                    .build()
            )
        assertThat(channelIntegrationMessageEgg.senders())
            .containsExactly(
                ChannelIntegrationParticipant.builder()
                    .deliveryIdentifier(
                        PublicDeliveryIdentifier.builder().type("type").value("value").build()
                    )
                    .name("name")
                    .build()
            )
        assertThat(channelIntegrationMessageEgg.text()).isEqualTo("text")
        assertThat(channelIntegrationMessageEgg.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(channelIntegrationMessageEgg.inReplyToId()).contains("inReplyToId")
        assertThat(channelIntegrationMessageEgg.integrationIdempotencyId())
            .contains("integrationIdempotencyId")
        assertThat(channelIntegrationMessageEgg.preResolvedContacts())
            .contains(
                PreResolvedContacts.builder()
                    .addContact(
                        PreResolvedContact.builder()
                            .addContactPropertiesLeadingToMatch("string")
                            .contactVid(0)
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
                        .fileUsageType("fileUsageType")
                        .build()
                )
                .channelAccountId("channelAccountId")
                .integrationThreadId("integrationThreadId")
                .messageDirection(ChannelIntegrationMessageEgg.MessageDirection.INCOMING)
                .addRecipient(
                    ChannelIntegrationParticipant.builder()
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .name("name")
                        .build()
                )
                .addSender(
                    ChannelIntegrationParticipant.builder()
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

        val roundtrippedChannelIntegrationMessageEgg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(channelIntegrationMessageEgg),
                jacksonTypeRef<ChannelIntegrationMessageEgg>(),
            )

        assertThat(roundtrippedChannelIntegrationMessageEgg).isEqualTo(channelIntegrationMessageEgg)
    }
}
