// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationsPublicConversationsMessageTest {

    @Test
    fun create() {
        val conversationsPublicConversationsMessage =
            ConversationsPublicConversationsMessage.builder()
                .id("id")
                .archived(true)
                .addAttachment(
                    PublicFile.builder()
                        .fileId("fileId")
                        .fileUsageType("fileUsageType")
                        .type(PublicFile.Type.FILE)
                        .url("url")
                        .name("name")
                        .build()
                )
                .channelAccountId("channelAccountId")
                .channelId("channelId")
                .client(
                    PublicClient.builder()
                        .clientType(PublicClient.ClientType.HUBSPOT)
                        .integrationAppId(0)
                        .build()
                )
                .conversationsThreadId("conversationsThreadId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("createdBy")
                .direction(ConversationsPublicConversationsMessage.Direction.INCOMING)
                .addRecipient(
                    PublicRecipient.builder()
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .actorId("actorId")
                        .name("name")
                        .recipientField("recipientField")
                        .build()
                )
                .addSender(
                    PublicSender.builder()
                        .actorId("actorId")
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .name("name")
                        .senderField("senderField")
                        .build()
                )
                .text("text")
                .truncationStatus(
                    ConversationsPublicConversationsMessage.TruncationStatus.NOT_TRUNCATED
                )
                .type(ConversationsPublicConversationsMessage.Type.MESSAGE)
                .inReplyToId("inReplyToId")
                .richText("richText")
                .status(
                    PublicMessageStatus.builder()
                        .statusType(PublicMessageStatus.StatusType.SENT)
                        .failureDetails(
                            PublicMessageFailureDetails.builder()
                                .errorMessageTokens(
                                    PublicMessageFailureDetails.ErrorMessageTokens.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .errorMessage("errorMessage")
                                .build()
                        )
                        .build()
                )
                .subject("subject")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(conversationsPublicConversationsMessage.id()).isEqualTo("id")
        assertThat(conversationsPublicConversationsMessage.archived()).isEqualTo(true)
        assertThat(conversationsPublicConversationsMessage.attachments())
            .containsExactly(
                ConversationsPublicConversationsMessage.Attachment.ofPublicFile(
                    PublicFile.builder()
                        .fileId("fileId")
                        .fileUsageType("fileUsageType")
                        .type(PublicFile.Type.FILE)
                        .url("url")
                        .name("name")
                        .build()
                )
            )
        assertThat(conversationsPublicConversationsMessage.channelAccountId())
            .isEqualTo("channelAccountId")
        assertThat(conversationsPublicConversationsMessage.channelId()).isEqualTo("channelId")
        assertThat(conversationsPublicConversationsMessage.client())
            .isEqualTo(
                PublicClient.builder()
                    .clientType(PublicClient.ClientType.HUBSPOT)
                    .integrationAppId(0)
                    .build()
            )
        assertThat(conversationsPublicConversationsMessage.conversationsThreadId())
            .isEqualTo("conversationsThreadId")
        assertThat(conversationsPublicConversationsMessage.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(conversationsPublicConversationsMessage.createdBy()).isEqualTo("createdBy")
        assertThat(conversationsPublicConversationsMessage.direction())
            .isEqualTo(ConversationsPublicConversationsMessage.Direction.INCOMING)
        assertThat(conversationsPublicConversationsMessage.recipients())
            .containsExactly(
                PublicRecipient.builder()
                    .deliveryIdentifier(
                        PublicDeliveryIdentifier.builder().type("type").value("value").build()
                    )
                    .actorId("actorId")
                    .name("name")
                    .recipientField("recipientField")
                    .build()
            )
        assertThat(conversationsPublicConversationsMessage.senders())
            .containsExactly(
                PublicSender.builder()
                    .actorId("actorId")
                    .deliveryIdentifier(
                        PublicDeliveryIdentifier.builder().type("type").value("value").build()
                    )
                    .name("name")
                    .senderField("senderField")
                    .build()
            )
        assertThat(conversationsPublicConversationsMessage.text()).isEqualTo("text")
        assertThat(conversationsPublicConversationsMessage.truncationStatus())
            .isEqualTo(ConversationsPublicConversationsMessage.TruncationStatus.NOT_TRUNCATED)
        assertThat(conversationsPublicConversationsMessage.type())
            .isEqualTo(ConversationsPublicConversationsMessage.Type.MESSAGE)
        assertThat(conversationsPublicConversationsMessage.inReplyToId()).contains("inReplyToId")
        assertThat(conversationsPublicConversationsMessage.richText()).contains("richText")
        assertThat(conversationsPublicConversationsMessage.status())
            .contains(
                PublicMessageStatus.builder()
                    .statusType(PublicMessageStatus.StatusType.SENT)
                    .failureDetails(
                        PublicMessageFailureDetails.builder()
                            .errorMessageTokens(
                                PublicMessageFailureDetails.ErrorMessageTokens.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .errorMessage("errorMessage")
                            .build()
                    )
                    .build()
            )
        assertThat(conversationsPublicConversationsMessage.subject()).contains("subject")
        assertThat(conversationsPublicConversationsMessage.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conversationsPublicConversationsMessage =
            ConversationsPublicConversationsMessage.builder()
                .id("id")
                .archived(true)
                .addAttachment(
                    PublicFile.builder()
                        .fileId("fileId")
                        .fileUsageType("fileUsageType")
                        .type(PublicFile.Type.FILE)
                        .url("url")
                        .name("name")
                        .build()
                )
                .channelAccountId("channelAccountId")
                .channelId("channelId")
                .client(
                    PublicClient.builder()
                        .clientType(PublicClient.ClientType.HUBSPOT)
                        .integrationAppId(0)
                        .build()
                )
                .conversationsThreadId("conversationsThreadId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("createdBy")
                .direction(ConversationsPublicConversationsMessage.Direction.INCOMING)
                .addRecipient(
                    PublicRecipient.builder()
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .actorId("actorId")
                        .name("name")
                        .recipientField("recipientField")
                        .build()
                )
                .addSender(
                    PublicSender.builder()
                        .actorId("actorId")
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .name("name")
                        .senderField("senderField")
                        .build()
                )
                .text("text")
                .truncationStatus(
                    ConversationsPublicConversationsMessage.TruncationStatus.NOT_TRUNCATED
                )
                .type(ConversationsPublicConversationsMessage.Type.MESSAGE)
                .inReplyToId("inReplyToId")
                .richText("richText")
                .status(
                    PublicMessageStatus.builder()
                        .statusType(PublicMessageStatus.StatusType.SENT)
                        .failureDetails(
                            PublicMessageFailureDetails.builder()
                                .errorMessageTokens(
                                    PublicMessageFailureDetails.ErrorMessageTokens.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .errorMessage("errorMessage")
                                .build()
                        )
                        .build()
                )
                .subject("subject")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedConversationsPublicConversationsMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conversationsPublicConversationsMessage),
                jacksonTypeRef<ConversationsPublicConversationsMessage>(),
            )

        assertThat(roundtrippedConversationsPublicConversationsMessage)
            .isEqualTo(conversationsPublicConversationsMessage)
    }
}
