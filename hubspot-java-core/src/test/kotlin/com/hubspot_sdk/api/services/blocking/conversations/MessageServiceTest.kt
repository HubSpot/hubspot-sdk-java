// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
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
internal class MessageServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val messageService = client.conversations().messages()

        val publicMessage =
            messageService.create(
                MessageCreateParams.builder()
                    .threadId(0L)
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

        publicMessage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val messageService = client.conversations().messages()

        val page = messageService.list(0L)

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val messageService = client.conversations().messages()

        val publicMessage =
            messageService.get(
                MessageGetParams.builder()
                    .threadId(0L)
                    .messageId("messageId")
                    .property("property")
                    .build()
            )

        publicMessage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getOriginalContent() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val messageService = client.conversations().messages()

        val publicMessageContent =
            messageService.getOriginalContent(
                MessageGetOriginalContentParams.builder()
                    .threadId(0L)
                    .messageId("messageId")
                    .property("property")
                    .build()
            )

        publicMessageContent.validate()
    }
}
