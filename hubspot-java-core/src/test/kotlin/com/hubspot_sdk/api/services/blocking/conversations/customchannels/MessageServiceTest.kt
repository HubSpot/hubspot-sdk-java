// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations.customchannels

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.conversations.PublicDeliveryIdentifier
import com.hubspot_sdk.api.models.conversations.customchannels.ChannelIntegrationMessageEgg
import com.hubspot_sdk.api.models.conversations.customchannels.ChannelIntegrationParticipant
import com.hubspot_sdk.api.models.conversations.customchannels.FileAttachment
import com.hubspot_sdk.api.models.conversations.customchannels.PreResolvedContact
import com.hubspot_sdk.api.models.conversations.customchannels.PreResolvedContacts
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelIntegrationMessageUpdateRequest
import com.hubspot_sdk.api.models.conversations.customchannels.messages.MessageCreateParams
import com.hubspot_sdk.api.models.conversations.customchannels.messages.MessageGetParams
import com.hubspot_sdk.api.models.conversations.customchannels.messages.MessageUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MessageServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val messageService = client.conversations().customChannels().messages()

        val conversationsPublicConversationsMessage =
            messageService.create(
                MessageCreateParams.builder()
                    .channelId("channelId")
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
                            .integrationThreadId("integrationThreadId")
                            .messageDirection(
                                ChannelIntegrationMessageEgg.MessageDirection.INCOMING
                            )
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
            )

        conversationsPublicConversationsMessage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val messageService = client.conversations().customChannels().messages()

        val conversationsPublicConversationsMessage =
            messageService.update(
                MessageUpdateParams.builder()
                    .channelId("channelId")
                    .messageId("messageId")
                    .publicChannelIntegrationMessageUpdateRequest(
                        PublicChannelIntegrationMessageUpdateRequest.builder()
                            .statusType(
                                PublicChannelIntegrationMessageUpdateRequest.StatusType.SENT
                            )
                            .errorMessage("errorMessage")
                            .build()
                    )
                    .build()
            )

        conversationsPublicConversationsMessage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val messageService = client.conversations().customChannels().messages()

        val conversationsPublicConversationsMessage =
            messageService.get(
                MessageGetParams.builder().channelId("channelId").messageId("messageId").build()
            )

        conversationsPublicConversationsMessage.validate()
    }
}
