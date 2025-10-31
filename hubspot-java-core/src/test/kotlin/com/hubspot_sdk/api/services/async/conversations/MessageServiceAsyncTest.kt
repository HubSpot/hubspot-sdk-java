// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.conversations.PublicConversationsMessageEgg
import com.hubspot_sdk.api.models.conversations.PublicDeliveryIdentifier
import com.hubspot_sdk.api.models.conversations.PublicFileEgg
import com.hubspot_sdk.api.models.conversations.PublicRecipientEgg
import com.hubspot_sdk.api.models.conversations.messages.MessageCreateParams
import com.hubspot_sdk.api.models.conversations.messages.MessageGetOriginalContentParams
import com.hubspot_sdk.api.models.conversations.messages.MessageGetParams
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
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val messageServiceAsync = client.conversations().messages()

        val publicMessageFuture =
            messageServiceAsync.create(
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
            )

        val publicMessage = publicMessageFuture.get()
        publicMessage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val messageServiceAsync = client.conversations().messages()

        val collectionResponsePublicMessageForwardPagingFuture =
            messageServiceAsync.list("threadId")

        val collectionResponsePublicMessageForwardPaging =
            collectionResponsePublicMessageForwardPagingFuture.get()
        collectionResponsePublicMessageForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val messageServiceAsync = client.conversations().messages()

        val publicMessageFuture =
            messageServiceAsync.get(
                MessageGetParams.builder().threadId("threadId").messageId("messageId").build()
            )

        val publicMessage = publicMessageFuture.get()
        publicMessage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getOriginalContent() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val messageServiceAsync = client.conversations().messages()

        val publicMessageContentFuture =
            messageServiceAsync.getOriginalContent(
                MessageGetOriginalContentParams.builder()
                    .threadId("threadId")
                    .messageId("messageId")
                    .build()
            )

        val publicMessageContent = publicMessageContentFuture.get()
        publicMessageContent.validate()
    }
}
