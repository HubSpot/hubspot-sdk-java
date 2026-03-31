// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations.customchannels

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.conversations.customchannels.ChannelIntegrationMessageEgg
import com.hubspot_sdk.api.models.conversations.customchannels.ChannelIntegrationParticipant
import com.hubspot_sdk.api.models.conversations.customchannels.FileAttachment
import com.hubspot_sdk.api.models.conversations.customchannels.PreResolvedContact
import com.hubspot_sdk.api.models.conversations.customchannels.PreResolvedContacts
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelIntegrationMessageUpdateRequest
import com.hubspot_sdk.api.models.conversations.customchannels.PublicDeliveryIdentifier
import com.hubspot_sdk.api.models.conversations.customchannels.messages.MessageCreateParams
import com.hubspot_sdk.api.models.conversations.customchannels.messages.MessageGetParams
import com.hubspot_sdk.api.models.conversations.customchannels.messages.MessageUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val messageServiceAsync = client.conversations().customChannels().messages()

        val publicConversationsMessageFuture =
            messageServiceAsync.create(
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

        val publicConversationsMessage = publicConversationsMessageFuture.get()
        publicConversationsMessage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val messageServiceAsync = client.conversations().customChannels().messages()

        val publicConversationsMessageFuture =
            messageServiceAsync.update(
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

        val publicConversationsMessage = publicConversationsMessageFuture.get()
        publicConversationsMessage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val messageServiceAsync = client.conversations().customChannels().messages()

        val publicConversationsMessageFuture =
            messageServiceAsync.get(
                MessageGetParams.builder().channelId(0).messageId("messageId").build()
            )

        val publicConversationsMessage = publicConversationsMessageFuture.get()
        publicConversationsMessage.validate()
    }
}
