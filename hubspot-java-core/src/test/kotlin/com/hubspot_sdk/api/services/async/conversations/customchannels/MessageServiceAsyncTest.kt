// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations.customchannels

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.conversations.PublicDeliveryIdentifier
import com.hubspot_sdk.api.models.conversations.customchannels.messages.MessageCreateParams
import com.hubspot_sdk.api.models.conversations.customchannels.messages.MessageGetParams
import com.hubspot_sdk.api.models.conversations.customchannels.messages.MessageUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MessageServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val messageServiceAsync = client.conversations().customChannels().messages()

        val publicConversationsMessageFuture =
            messageServiceAsync.create(
                MessageCreateParams.builder()
                    .channelId("channelId")
                    .addAttachment(
                        MessageCreateParams.Attachment.ConversationsCustomchannelsFileAttachment
                            .builder()
                            .fileId("fileId")
                            .type(
                                MessageCreateParams.Attachment
                                    .ConversationsCustomchannelsFileAttachment
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
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .name("name")
                            .build()
                    )
                    .addSender(
                        MessageCreateParams.Sender.builder()
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
            )

        val publicConversationsMessage = publicConversationsMessageFuture.get()
        publicConversationsMessage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val messageServiceAsync = client.conversations().customChannels().messages()

        val publicConversationsMessageFuture =
            messageServiceAsync.update(
                MessageUpdateParams.builder()
                    .channelId("channelId")
                    .messageId("messageId")
                    .statusType(MessageUpdateParams.StatusType.SENT)
                    .errorMessage("errorMessage")
                    .build()
            )

        val publicConversationsMessage = publicConversationsMessageFuture.get()
        publicConversationsMessage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val messageServiceAsync = client.conversations().customChannels().messages()

        val publicConversationsMessageFuture =
            messageServiceAsync.get(
                MessageGetParams.builder().channelId("channelId").messageId("messageId").build()
            )

        val publicConversationsMessage = publicConversationsMessageFuture.get()
        publicConversationsMessage.validate()
    }
}
