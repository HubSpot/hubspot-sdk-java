// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.conversations.customchannels

import com.hubspot.client.okhttp.HubSpotOkHttpClient
import com.hubspot.models.conversations.customchannels.ChannelIntegrationMessageEgg
import com.hubspot.models.conversations.customchannels.ChannelIntegrationParticipant
import com.hubspot.models.conversations.customchannels.FileAttachment
import com.hubspot.models.conversations.customchannels.PreResolvedContact
import com.hubspot.models.conversations.customchannels.PreResolvedContacts
import com.hubspot.models.conversations.customchannels.PublicChannelIntegrationMessageUpdateRequest
import com.hubspot.models.conversations.customchannels.PublicDeliveryIdentifier
import com.hubspot.models.conversations.customchannels.messages.MessageCreateParams
import com.hubspot.models.conversations.customchannels.messages.MessageGetParams
import com.hubspot.models.conversations.customchannels.messages.MessageUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val messageService = client.conversations().customChannels().messages()

        val publicConversationsMessage =
            messageService.create(
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
                            .messageDirection(
                                ChannelIntegrationMessageEgg.MessageDirection.INCOMING
                            )
                            .addRecipient(
                                ChannelIntegrationParticipant.builder()
                                    .deliveryIdentifier(
                                        PublicDeliveryIdentifier.builder()
                                            .type(
                                                PublicDeliveryIdentifier.Type
                                                    .CHANNEL_SPECIFIC_OPAQUE_ID
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
                                                PublicDeliveryIdentifier.Type
                                                    .CHANNEL_SPECIFIC_OPAQUE_ID
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
            )

        publicConversationsMessage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val messageService = client.conversations().customChannels().messages()

        val publicConversationsMessage =
            messageService.update(
                MessageUpdateParams.builder()
                    .channelId(0)
                    .messageId("messageId")
                    .publicChannelIntegrationMessageUpdateRequest(
                        PublicChannelIntegrationMessageUpdateRequest.builder()
                            .statusType(
                                PublicChannelIntegrationMessageUpdateRequest.StatusType.FAILED
                            )
                            .errorMessage("errorMessage")
                            .build()
                    )
                    .build()
            )

        publicConversationsMessage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val messageService = client.conversations().customChannels().messages()

        val publicConversationsMessage =
            messageService.get(
                MessageGetParams.builder().channelId(0).messageId("messageId").build()
            )

        publicConversationsMessage.validate()
    }
}
